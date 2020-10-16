package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.view.LayoutInflater.from;

public class ListAdapter extends BaseAdapter {
    private Context context;
    private List<String> myData = new ArrayList<>();
    public ListAdapter(Context context, List<String> data){ //第二步 3传入数据
        this.context=context;
        this.myData=data;

    }

    public ListAdapter(FristActivity fristActivity) {
    }

    @Override
    public int getCount() {//list的和，用size判断大小
        return myData.size();
    }

    @Override
    public Object getItem(int position) {
        return myData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        ViewHolder viewHolder;
        if (convertView==null){
            view  = from(context).inflate(R.layout.first_list_item,null);  //建立item1布局
            viewHolder = new ViewHolder();
            viewHolder.textView = view.findViewById(R.id.text_item);
            view.setTag(viewHolder);
        }else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }

        String str = myData.get(position);
        viewHolder.textView.setText(str);

        return view;
    }




    class ViewHolder{
        TextView textView;
    }


}
