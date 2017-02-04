package com.example.work;




import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Second1 extends Activity implements View.OnClickListener{
	TextView t3,t4,t5;
	EditText e1,e2;
	Button b2;
	
	ImageView m1,m2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second1);
		t3= (TextView) findViewById(R.id.tV3);
		t4= (TextView) findViewById(R.id.tV4);
		t5= (TextView) findViewById(R.id.tV5);
		e1=(EditText) findViewById(R.id.eT1);
		e2=(EditText) findViewById(R.id.eT2);
		b2=(Button) findViewById(R.id.B2);
		m1=(ImageView) findViewById(R.id.iv1);
		m2=(ImageView) findViewById(R.id.iv2);
		b2.setOnClickListener(this);
		t5.setOnClickListener(this);
		m1.setOnClickListener(this);
		m2.setOnClickListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second1, menu);
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
	 protected void onPause() {
			// TODO Auto-generated method stub
			super.onPause();
			
			finish();
		}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.B2:
			String c1=e1.getText().toString();
			String c2=e2.getText().toString();
		if(c1.contentEquals("an")&&c2.contentEquals("er"))
		{
			Intent fr=new Intent(Second1.this,Fourth.class);
			startActivity(fr);
		}
				
		else
		{
			AlertDialog ab= new AlertDialog.Builder(this).create();
			ab.setMessage("Invalid Username or Password");
		
			ab.show();
		}
					break;
		case R.id.tV5:
		{
			Intent th=new Intent(Second1.this,Third.class);
			startActivity(th);
		}
		break;
		case R.id.iv1:
			String url1 = "https://accounts.google.com/ServiceLogin?passive=1209600&osid=1&continue=https://plus.google.com/apps/activities&followup=https://plus.google.com/apps/activities";
			Intent i1 = new Intent(Intent.ACTION_VIEW);
			i1.setData(Uri.parse(url1));
			startActivity(i1);
			/*Intent GPlusButtonClickedIntent = new Intent(this, GooglePlusHandlerActivity.class);
	        startActivity(GPlusButtonClickedIntent);*/
			break;
			
		case R.id.iv2:
			String url2 = "https://www.facebook.com/login?_rdr=p";
			Intent i2 = new Intent(Intent.ACTION_VIEW);
			i2.setData(Uri.parse(url2));
			startActivity(i2);
			break;
			
		}
	}
	}
