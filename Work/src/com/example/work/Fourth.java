package com.example.work;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Fourth extends Activity implements View.OnClickListener{
	TextView p1;
	Button s1,s2,s3,s4,s5;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fourth);
		p1=(TextView) findViewById(R.id.proff);
		//s1=(Button) findViewById(R.id.B3);
		s2=(Button) findViewById(R.id.B4);
		//s3=(Button) findViewById(R.id.B5);
		s4=(Button) findViewById(R.id.B6);
		s5=(Button) findViewById(R.id.B7);
		
		
		s2.setOnClickListener(this);
		s4.setOnClickListener(this);
		s5.setOnClickListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fourth, menu);
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
		
		case R.id.B4:
			Intent i2 = new Intent(Fourth.this,Fifth.class);
			startActivity(i2);
			break;
		
			
		case R.id.B6:
			Intent i4 = new Intent(Fourth.this,Secondary.class);
			startActivity(i4);
			break;
		case R.id.B7:
			Intent i5 = new Intent(Fourth.this,Sixth.class);
			startActivity(i5);
			break;
		}
		
	}
}
