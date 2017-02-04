package com.example.work;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Seventh extends Activity implements View.OnClickListener{
	Button w1,w2,w3,w4,w5,w6;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_seventh);
		w1= (Button) findViewById(R.id.B1);
		w2= (Button) findViewById(R.id.B2);
		w3= (Button) findViewById(R.id.B3);
		w4= (Button) findViewById(R.id.B4);
		w5= (Button) findViewById(R.id.B5);
		w6= (Button) findViewById(R.id.B6);
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
		getMenuInflater().inflate(R.menu.seventh, menu);
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
		case R.id.B1:
			String url1 = "https://lecturenotes.in/course/";
			Intent i1 = new Intent(Intent.ACTION_VIEW);
			i1.setData(Uri.parse(url1));
			startActivity(i1);
			break;
		case R.id.B2:
			String url2 = "https://www.smartzworld.com/notes/subject-wise-materials/";
			Intent i2 = new Intent(Intent.ACTION_VIEW);
			i2.setData(Uri.parse(url2));
			startActivity(i2);
			
			break;
		case R.id.B3:
			String url3 = "http://www.aboutcivil.org/";
			Intent i3 = new Intent(Intent.ACTION_VIEW);
			i3.setData(Uri.parse(url3));
			startActivity(i3);
			
			break;
		case R.id.B4:
			String url4 = "http://www.gate2016.info/free-notes/made-easy-class-notes-mechanical-engineering/";
			Intent i4 = new Intent(Intent.ACTION_VIEW);
			i4.setData(Uri.parse(url4));
			startActivity(i4);
			
			break;
		case R.id.B5:
			
			String url5 = "http://www.nptel.ac.in/courses/103108097/";
			Intent i5 = new Intent(Intent.ACTION_VIEW);
			i5.setData(Uri.parse(url5));
			startActivity(i5);
			
			break;
		case R.id.B6:
			
			String url6 = "http://www.faadooengineers.com/threads/10135-Metallurgical-Engineering-Mechanical-metallurgy-Lecture-notes-pdf-ebooks-download";
			Intent i6 = new Intent(Intent.ACTION_VIEW);
			i6.setData(Uri.parse(url6));
			startActivity(i6);
			
			break;
		}
		
	}
}
