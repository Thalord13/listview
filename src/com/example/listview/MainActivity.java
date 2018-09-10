package com.example.listview;




import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	EditText txtSearch;
	ListView lv;
	ArrayList<MyImage> list = new ArrayList<MyImage>();
	MyAdapter adapter;
	String[] labels=new String[]{
			"IRONMAN",
			"CAPT. AMERICA",
			"THOR",
			"HULK",
			"BLACK WIDOW",
			"HAWKEYE"
	};
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        list.add(new MyImage(R.drawable.ironman," IRONMAN"));
		list.add(new MyImage(R.drawable.capt," CAPT. AMERICA"));
		list.add(new MyImage(R.drawable.thor," THOR"));
		list.add(new MyImage(R.drawable.hulk," HULK"));
		list.add(new MyImage(R.drawable.blackwidow," BLACK WIDOW"));
		list.add(new MyImage(R.drawable.hawkeye," HAWKEYE"));
		
		this.txtSearch=(EditText) this.findViewById(R.id.editText1);
		this.lv=(ListView) this.findViewById(R.id.listView1);
		this.adapter=new MyAdapter(this,list);
		this.lv.setAdapter(adapter);
		//this.adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
		this.txtSearch.addTextChangedListener(new TextWatcher(){

			@Override
			public void afterTextChanged(Editable arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void beforeTextChanged(CharSequence arg0, int arg1,
					int arg2, int arg3) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onTextChanged(CharSequence arg0, int arg1, int arg2,
					int arg3) {
				// TODO Auto-generated method stub
			
			}});
        
    }


}
