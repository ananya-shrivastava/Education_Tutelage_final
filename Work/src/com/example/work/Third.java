package com.example.work;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Third extends Activity implements View.OnClickListener {
	TextView tt1,tt2,tt3,tt4,tt5;
	EditText et1,et2,et3,et4,et5;
	RadioButton radioSexButton;
	 RadioGroup radioSexGroup;
	RadioButton rr1,rr2;
	Button s1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);
		
		et1=(EditText) findViewById(R.id.editText1);
		et2=(EditText) findViewById(R.id.editText2);
		et3=(EditText) findViewById(R.id.editText3);
		et4=(EditText) findViewById(R.id.editText4);
		et5=(EditText) findViewById(R.id.editText5);
		rr1=(RadioButton) findViewById(R.id.radioButton1);
		rr2=(RadioButton) findViewById(R.id.radioButton2);
		tt1=(TextView) findViewById(R.id.textView1);
		tt2=(TextView) findViewById(R.id.textView2);
		tt3=(TextView) findViewById(R.id.textView3);
		tt4=(TextView) findViewById(R.id.textView4);
		tt5=(TextView) findViewById(R.id.textView5);
		s1=(Button) findViewById(R.id.button1);
		s1.setOnClickListener(this);
		//addListenerOnButton();
		radioSexGroup = (RadioGroup) findViewById(R.id.radioSex);
	}
	 protected void onPause() {
			// TODO Auto-generated method stub
			super.onPause();
			
			finish();
		}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.third, menu);
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
		String email;
		String passwordEditText;
		String s6=et1.getText().toString();
		String s2=et2.getText().toString();
		String s3=et3.getText().toString();
		String s4=et4.getText().toString();
		String s5=et5.getText().toString();
		//isEmailValid(s5);
		if(!s2.isEmpty()&&!s3.isEmpty()&& !s4.isEmpty()&& !s5.isEmpty()&& !s6.isEmpty())
		{	
			Intent i2=new Intent(Third.this,Fourth.class);
			startActivity(i2);
			
			
			/*if(s3 !=null && s3.length() >2) 
			{ 
				Intent i2=new Intent(Third.this,Fourth.class);
				startActivity(i2);
			}
		
			else
			{
				et3.setError("You must have at least 2 characters in your password"); 
		    }*/
		}
		else
		{
			AlertDialog ab= new AlertDialog.Builder(this).create();
			ab.setMessage("Please Fill the valid credential ");
			ab.show();
			
			
			
		}
		
	}
	public static boolean isEmailValid(String email) {
	    boolean isValid = false;

	    String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
	    CharSequence inputStr = email;

	    Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(inputStr);
	    if (matcher.matches()) {
	        isValid = true;
	    }
	    return isValid;
	}
	 
}
