package com.oudedemo.fragment;
import android.app.*;
import android.os.*;
import android.support.v4.app.*;

public class SimpleActivity extends FragmentActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple);
    }
    
}
