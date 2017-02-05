package com.example.work;

import android.os.Bundle;
import android.provider.Telephony.Sms.Conversations;
import android.view.*;
import android.app.Activity;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SimpleAdapter.ViewBinder;
import android.widget.TextView;
import android.widget.Toast;

public class Rate_feed extends Activity implements View.OnClickListener {
 
	TextView  personEmail ;
	EditText  intro, personName, stupidThings , hatefulActions,outro;
	String emailAdd, beginning ,name, stupidAction,hatefulAct,out;
	Button sendEmail;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rate_feed);
		initializeVars();
		sendEmail.setOnClickListener(this);}
private void initializeVars() {
		// TODO Auto-generated method stud
		//personEmail=(EditText) findViewById(R.id.etEmail);
	personEmail=(TextView) findViewById(R.id.textView6);
		intro=(EditText) findViewById(R.id.etIntro);
		personName=(EditText) findViewById(R.id.etName);
		stupidThings=(EditText) findViewById(R.id.etThings);
		hatefulActions=(EditText) findViewById(R.id.etAction);
		//outro=(EditText) findViewById(R.id.etOutro);
		sendEmail=(Button) findViewById(R.id.bSendemail);
	}@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	ConvertEditTextVarsIntoStringsAndYesThisIsAMethordWeCreated();
	if(check())
	{
	String emailAddress[]={emailAdd};
	final String msg ="Hello, I am "+beginning+"\n"+
				" I rate your app "+name+"/5 \n"
				+" and your app is "+stupidAction +". \n"
				+" The changes I want are "+hatefulAct;
	Intent emailIntent=new Intent(android.content.Intent.ACTION_SEND);
	emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, emailAddress);
	emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, " User Feedback ");
	emailIntent.setType("plain/text");
	emailIntent.putExtra(android.content.Intent.EXTRA_TEXT,msg);
	startActivity(emailIntent);
	}
	else
	{
		Toast.makeText(getApplicationContext(), "Invalid Ratings",Toast.LENGTH_LONG).show();
	}
	}
	private boolean check() {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(name);
		if(n<0||n>5)
		{
			
			Toast.makeText(getApplicationContext(), "Invalid Ratings",Toast.LENGTH_LONG).show();
			//personName.setError("Invalid Ratings ");
			return false;
		}
		else
		{
			Toast.makeText(getApplicationContext(), " ",Toast.LENGTH_SHORT).show();
			return true;
		}
		
	}
	private void ConvertEditTextVarsIntoStringsAndYesThisIsAMethordWeCreated() {
		// TODO Auto-generated method stub
		emailAdd=personEmail.getText().toString();
		beginning=intro.getText().toString();
		name=personName.getText().toString();
		
		
		stupidAction=stupidThings.getText().toString();
		hatefulAct=hatefulActions.getText().toString();
		//out=outro.getText().toString();
		
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
		
	}
	

}