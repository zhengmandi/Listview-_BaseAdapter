package com.example.listview;

import android.content.Context;
import android.media.Image;
import android.os.Message;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.view.LayoutInflater.from;

public class ListAdapter extends BaseAdapter {
    private Context context;
    private List<String> Datas;
    public ListAdapter(Context context, List<String> data){ //第二步 3传入数据
        this.context=context;
        /*this.myData=data;*/
        Datas = data;

    }

    public ListAdapter(FristActivity fristActivity) {
    }
    /* 返回item个数*/
    @Override
    public int getCount() {     //list的和，用size判断大小
        return Datas.size();
    }
    /*返回每一个item对象*/
    @Override
    public Object getItem(int position) {
        return Datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view , ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view ==null){
            viewHolder = new ViewHolder();
            //建立item1布局
            view  = from(context).inflate(R.layout.first_list_item,viewGroup,false);
            viewHolder.imageView1 = view.findViewById(R.id.image1);
            viewHolder.textView1 =  view.findViewById(R.id.text_item);
            view.setTag(viewHolder);
        }else {
           /* view = view ;*/
            viewHolder = (ViewHolder) view.getTag();
        }

        String str = Datas.get(i);

        /*viewHolder.imageView1.setImageResource(Integer.parseInt(str));*/
        viewHolder.textView1.setText(str);
        
        //此处需要返回view
        return view;
    }




    class ViewHolder{
        private ImageView imageView1;
        private TextView textView1;
    }


}
