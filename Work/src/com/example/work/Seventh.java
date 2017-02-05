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
	Button w1,w2,w3,w4,w5,w6,w7;
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
		w7= (Button) findViewById(R.id.B7);
		w1.setOnClickListener(this);
		w2.setOnClickListener(this);
		w3.setOnClickListener(this);
		w4.setOnClickListener(this);
		w5.setOnClickListener(this);
		w6.setOnClickListener(this);
		w7.setOnClickListener(this);
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
			Intent i2 = new Intent(Seventh.this,Ninth.class);
			startActivity(i2);
			break;
		case R.id.B2:
			Intent i1 = new Intent(Seventh.this,Tenth.class);
			startActivity(i1);
			break;
		case R.id.B3:
			Intent i3 = new Intent(Seventh.this,Civil.class);
			startActivity(i3);
			break;
		case R.id.B4:
			Intent i4 = new Intent(Seventh.this,Mech.class);
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
			

		case R.id.B7:
			
			String url7 = "https://lib.ku.edu/locations/art-and-architecture/electronic-resources/architecture";
			Intent i7 = new Intent(Intent.ACTION_VIEW);
			i7.setData(Uri.parse(url7));
			startActivity(i7);
			
			break;
		}
		
	}
}
