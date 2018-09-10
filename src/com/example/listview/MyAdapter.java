package com.example.listview;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

	Context context;
	String[] labels;
	ArrayList<MyImage> list;
	LayoutInflater inflater; //import 
	//LayoutInflater inflater;
	//this.adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
	
	
	public MyAdapter(Context context, ArrayList<MyImage> list) {
		super();
		this.context = context;
		this.list = list;
		this.inflater=LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return list.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		
		MyLayoutContent c=null;
		
		if(arg1==null){
			//arg1.inflater.inflate(R.layout.imagelayout, null);
			arg1=inflater.inflate(R.layout.imagelayout, null);
			c=new MyLayoutContent();
			c.iv=(ImageView) arg1.findViewById(R.id.imageView1);
			c.tv=(TextView) arg1.findViewById(R.id.textView1);
			arg1.setTag(c);
		}else c=(MyLayoutContent) arg1.getTag(); 
		//c.iv.setImageResource(list.get(arg0).getImage());
		//c.tv.setText(list.get(arg0).getLabel());
		c.iv.setImageResource(list.get(arg0).getImage());
		c.tv.setText(list.get(arg0).getLabel());
		return arg1;
	}
	
	static class MyLayoutContent{
		ImageView iv;
		TextView tv;
	}

}
