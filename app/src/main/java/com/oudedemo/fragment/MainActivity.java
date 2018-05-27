package com.oudedemo.fragment;

import android.app.*;
import android.os.*;
import java.util.*;
import android.support.v7.widget.*;

public class MainActivity extends Activity 
{

    private List<MyList> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //步骤一：创建recycleview用于显示多钟加载情况
        initMylist();
        RecyclerView recycleView = (RecyclerView) findViewById(R.id.mainRecyclerView1);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recycleView.setLayoutManager(layoutManager);
        MyListAdapter adapter =new MyListAdapter(list);
        recycleView.setAdapter(adapter);
                
    }

    private void initMylist()
    {

        MyList  list1 = new MyList("Fragment静态加载", R.drawable.ic_launcher);
        list.add(list1);
        MyList  list2 = new MyList("Fragment动态加载", R.drawable.ic_launcher);
        list.add(list2);
        MyList  list3 = new MyList("List3", R.drawable.ic_launcher);
        list.add(list3);
        MyList  list4 = new MyList("List4", R.drawable.ic_launcher);            
        list.add(list4);
        MyList  list5 = new MyList("List5", R.drawable.ic_launcher);
        list.add(list5);
        MyList  list6 = new MyList("List6", R.drawable.ic_launcher);
        list.add(list6);
        MyList  list7 = new MyList("List7", R.drawable.ic_launcher);
        list.add(list7);
    }
    
}
