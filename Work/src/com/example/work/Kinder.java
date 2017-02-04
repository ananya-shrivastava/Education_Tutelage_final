package com.example.work;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Kinder extends Activity implements View.OnClickListener {
	Button w1,w2,w3,w4;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_kinder);
		w1= (Button) findViewById(R.id.button1);
		w2= (Button) findViewById(R.id.button2);
		w3= (Button) findViewById(R.id.button3);
		w4= (Button) findViewById(R.id.button4);
		w1.setOnClickListener(this);
		w2.setOnClickListener(this);
		w3.setOnClickListener(this);
		w4.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.kinder, menu);
		
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
			String url1 = "http://www.education.com/game/addition-pizza-1-10/";
			Intent i = new Intent(Intent.ACTION_VIEW);
			i.setData(Uri.parse(url1));
			startActivity(i);
		break;
		case R.id.button2:
			String url2 = "http://www.education.com/game/counting-in-the-kitchen/";
			Intent i1 = new Intent(Intent.ACTION_VIEW);
			i1.setData(Uri.parse(url2));
			startActivity(i1);
		break;
		case R.id.button3:
			String url3 = "http://www.education.com/game/school-bus-spelling-game/";
			Intent i2 = new Intent(Intent.ACTION_VIEW);
			i2.setData(Uri.parse(url3));
			startActivity(i2);
		break;
		case R.id.button4:
			String url4 = "http://www.education.com/game/threasure-chest-matching/";
			Intent i3 = new Intent(Intent.ACTION_VIEW);
			i3.setData(Uri.parse(url4));
			startActivity(i3);
		break;
		}
	}
}
