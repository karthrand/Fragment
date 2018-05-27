package com.oudedemo.fragment;
import android.support.v4.app.*;
import android.view.*;
import android.os.*;

public class SimpleTop extends Fragment
{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {        
        //步骤二：这个fragment在静态加载和动态加载中是共用的，先加载
        View view = inflater.inflate(R.layout.simple_top,container,false);
        return view;
    }
    
}
