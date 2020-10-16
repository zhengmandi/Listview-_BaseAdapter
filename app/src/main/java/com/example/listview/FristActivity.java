package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.os.Message;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FristActivity extends AppCompatActivity {
    //第二步  1加载数据
    private ListView listView;
    //加载适配器
    private ListAdapter listAdapter;
    private  List<String > data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frist);
        //第二步 2
        listView = findViewById(R.id.first_list);
        //创建数组添加数据源
        List<String>data = new ArrayList<>();
        data.add("blackpink");
        data.add("lisa");
        data.add("jisoo");
        data.add("jienne");
        data.add("rose");
        listAdapter = new ListAdapter(FristActivity.this,data);

        //第六步 把适配器放进ListView控件
        listView.setAdapter(listAdapter);


    }
}