package com.example.work;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Tenth extends Activity  implements View.OnClickListener{
	Button w1,w2,w3,w4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tenth);
		w1= (Button) findViewById(R.id.B1);
		w2= (Button) findViewById(R.id.B2);
		w3= (Button) findViewById(R.id.B3);
		w4= (Button) findViewById(R.id.B4);
		
		
		w1.setOnClickListener(this);
		w2.setOnClickListener(this);
		w3.setOnClickListener(this);
		w4.setOnClickListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tenth, menu);
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
		String url1 = "https://www.youtube.com/channel/UCdDLuSAR5CCBGDkgKuqPA3A";
		Intent i1 = new Intent(Intent.ACTION_VIEW);
		i1.setData(Uri.parse(url1));
		startActivity(i1);
		break;
	case R.id.B2:
		String url2 = "https://www.smartzworld.com/notes/ece-branch/";
		Intent i2 = new Intent(Intent.ACTION_VIEW);
		i2.setData(Uri.parse(url2));
		startActivity(i2);
		
		break;
	case R.id.B3:
		String url3 = "https://www.youtube.com/user/TheGateAcademy";
		Intent i3 = new Intent(Intent.ACTION_VIEW);
		i3.setData(Uri.parse(url3));
		startActivity(i3);
		
		break;
	case R.id.B4:
		String url4 = "https://www.jntubook.com/ece-textbooks-free-download/";
		Intent i4 = new Intent(Intent.ACTION_VIEW);
		i4.setData(Uri.parse(url4));
		startActivity(i4);
		
	}
}
}
