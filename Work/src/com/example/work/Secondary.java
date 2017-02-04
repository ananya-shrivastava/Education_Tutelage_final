package com.example.work;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Secondary extends Activity implements View.OnClickListener{
	Button w1,w2,w3,w4,w5,w6;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_secondary);
		w1= (Button) findViewById(R.id.button1);
		w2= (Button) findViewById(R.id.button2);
		w3= (Button) findViewById(R.id.button3);
		w4= (Button) findViewById(R.id.button4);
		w5= (Button) findViewById(R.id.button5);
		w6= (Button) findViewById(R.id.button6);
		w1.setOnClickListener(this);
		w2.setOnClickListener(this);
		w3.setOnClickListener(this);
		w4.setOnClickListener(this);
		w5.setOnClickListener(this);
		w6.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.secondary, menu);
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
			String url1 = "http://www.meritnation.com/";
			Intent i = new Intent(Intent.ACTION_VIEW);
			i.setData(Uri.parse(url1));
			startActivity(i);
		break;
		case R.id.button2:
			String url2 = "http://epathshala.nic.in/";
			Intent i1 = new Intent(Intent.ACTION_VIEW);
			i1.setData(Uri.parse(url2));
			startActivity(i1);
		break;
		case R.id.button3:
			String url3 = "http://www.softschools.com/quizzes/";
			Intent i2 = new Intent(Intent.ACTION_VIEW);
			i2.setData(Uri.parse(url3));
			startActivity(i2);
		break;
		case R.id.button4:
			String url4 = "http://www.nios.ac.in/student-information-section/question-paper-of-previous-year-examination-academic.aspx";
			Intent i3 = new Intent(Intent.ACTION_VIEW);
			i3.setData(Uri.parse(url4));
			startActivity(i3);
		break;
		
		case R.id.button5:
			String url5 = "http://www.olympiadhelper.com/subject/";
			Intent i4 = new Intent(Intent.ACTION_VIEW);
			i4.setData(Uri.parse(url5));
			startActivity(i4);
		break;
		case R.id.button6:
			String url6 = "http://ezyexamsolution.com/neet-aipmt-chemistry-mcq/";
			Intent i5 = new Intent(Intent.ACTION_VIEW);
			i5.setData(Uri.parse(url6));
			startActivity(i5);
		break;
		}
		
		
	}
}
