package com.example.work;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Fifth extends Activity implements View.OnClickListener {
	Button b1;
	//boolean flag=false;
	//ImageButton btn1 ;
	Button w1,w2,w3,w4,w5;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fifth);
		
		w1= (Button) findViewById(R.id.button1);
		w2= (Button) findViewById(R.id.button2);
		w3= (Button) findViewById(R.id.button3);
		w4= (Button) findViewById(R.id.button4);
		w5= (Button) findViewById(R.id.button5);
		w1.setOnClickListener(this);
		w2.setOnClickListener(this);
		w3.setOnClickListener(this);
		w4.setOnClickListener(this);
		w5.setOnClickListener(this);
		
		 /*btn1 = (ImageButton)findViewById(R.id.btn);
		 btn1.setOnClickListener(this);*/
		}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fifth, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch(v.getId())
		{
		case R.id.button1:
			Intent o1=new Intent(Fifth.this,Kinder.class);
			startActivity(o1);
			break;
		case R.id.button2:
			Intent o2=new Intent(Fifth.this,Kinder1.class);
			startActivity(o2);
			break;
		case R.id.button3:
			Intent o3=new Intent(Fifth.this,Kinder2.class);
			startActivity(o3);
			break;
		case R.id.button4:
			Intent o4=new Intent(Fifth.this,Kinder3.class);
			startActivity(o4);
			break;
		case R.id.button5:
			String url1 = "http://olympiadhelper.com/DemoTest.aspx";
			Intent i = new Intent(Intent.ACTION_VIEW);
			i.setData(Uri.parse(url1));
			startActivity(i);
			break;
		}
		
		}
	
}
