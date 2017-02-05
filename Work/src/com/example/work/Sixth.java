package com.example.work;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Sixth extends Activity implements View.OnClickListener
{
	Button w1,w2,w3,w4,w5,w6;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sixth);
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
		getMenuInflater().inflate(R.menu.sixth, menu);
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
		
			String url1 = "http://e-learningup.org.in/UI/LearningCenter/frm_ViewAllNotes.aspx";
			Intent i1 = new Intent(Intent.ACTION_VIEW);
			i1.setData(Uri.parse(url1));
			startActivity(i1);
			break;
			
		case R.id.B2:
			Intent i2 = new Intent(Sixth.this,Eight.class);
			startActivity(i2);
			break;
		case R.id.B3:
			
			Intent i3 = new Intent(Sixth.this,Seventh.class);
			startActivity(i3);
			break;
		case R.id.B4:
			String url4 = "http://mu.ac.in/portal/distance-open-learning/b-sc-study-material/";
			Intent i4 = new Intent(Intent.ACTION_VIEW);
			i4.setData(Uri.parse(url4));
			startActivity(i4);
			break;
		case R.id.B5:
			
			String url5 = "https://www.studynama.com/community/forums/81-LAW-Students-Zone-Free-study-guides-and-resources-for-LLB-LLM-students-in-India";
			Intent i5 = new Intent(Intent.ACTION_VIEW);
			i5.setData(Uri.parse(url5));
			startActivity(i5);
			break;
			
		case R.id.B6:
			
			Intent i6 = new Intent(Sixth.this,Eleventh.class);
			startActivity(i6);
			break;
		}
		
		
	}
}
