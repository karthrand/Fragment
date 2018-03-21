package com.oudedemo.fragment;
import android.os.*;
import android.support.v4.app.*;
import android.view.View.*;
import android.view.*;
import android.widget.*;

public class DynamicActivity extends FragmentActivity implements View.OnClickListener
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dynamic);
		Button button =(Button) findViewById(R.id.simpletopButton1);
		button.setOnClickListener(this);
		replaceFragment(new SimpleBottom());
	}
	

	private void replaceFragment(Fragment fragment)
	{
		FragmentManager frgmentManager = getSupportFragmentManager();
		FragmentTransaction transaction = frgmentManager.beginTransaction();
		transaction.replace(R.id.dynamicFrameLayout1,fragment);
		transaction.addToBackStack(null);
		transaction.commit();
		
	}
	
	@Override
	public void onClick(View p1)
	{
		switch(p1.getId()){
			case R.id.simpletopButton1: 
				replaceFragment(new DynamicBottom());
				break;
			default:
			    break;
		}

	}
}
