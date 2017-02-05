package com.example.work;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Datab extends Activity {
Button btnSignIn,btnSignUp;
LoginDataBaseAdapter loginDataBaseAdapter;
MenuItem m1,m2,m3,m4,m5;


@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_datab);
m1=(MenuItem) findViewById(R.id.menu1);
m2=(MenuItem) findViewById(R.id.menu2);
m3=(MenuItem) findViewById(R.id.menu3);
m4=(MenuItem) findViewById(R.id.menu4);
m4=(MenuItem) findViewById(R.id.menu5);


loginDataBaseAdapter=new LoginDataBaseAdapter(this);
loginDataBaseAdapter=loginDataBaseAdapter.open();

// Get The Refference Of Buttons
btnSignIn=(Button)findViewById(R.id.buttonSignIN);
btnSignUp=(Button)findViewById(R.id.buttonSignUP);

// Set OnClick Listener on SignUp button 
btnSignUp.setOnClickListener(new View.OnClickListener() {
public void onClick(View v) {
// TODO Auto-generated method stub

/// Create Intent for SignUpActivity abd Start The Activity
Intent intentSignUP=new Intent(getApplicationContext(),SignUPActivity.class);
startActivity(intentSignUP);
}
});
}
protected void onPause() {
	// TODO Auto-generated method stub
	super.onPause();
	
	finish();
}



public void signIn(View V)
{
final Dialog dialog = new Dialog(Datab.this);
dialog.setContentView(R.layout.login);
dialog.setTitle("Login");

// get the Refferences of views
final EditText editTextUserName=(EditText)dialog.findViewById(R.id.editTextUserNameToLogin);
final EditText editTextPassword=(EditText)dialog.findViewById(R.id.editTextPasswordToLogin);

Button btnSignIn=(Button)dialog.findViewById(R.id.buttonSignIn);

// Set On ClickListener
btnSignIn.setOnClickListener(new View.OnClickListener() {

public void onClick(View v) {
// get The User name and Password
String userName=editTextUserName.getText().toString();
String password=editTextPassword.getText().toString();

// fetch the Password form database for respective user name
String storedPassword=loginDataBaseAdapter.getSinlgeEntry(userName);

// check if the Stored password matches with Password entered by user
if(password.equals(storedPassword))
{
Toast.makeText(Datab.this, "Congrats: Login Successfull", Toast.LENGTH_LONG).show();
dialog.dismiss();
Intent i2=new Intent(Datab.this,Fourth.class);
startActivity(i2);
}
else
{
Toast.makeText(Datab.this, "User Name or Password does not match", Toast.LENGTH_LONG).show();
}
}
});

dialog.show();
}

protected void onDestroy() {
super.onDestroy();
// Close The Database
loginDataBaseAdapter.close();
}
@Override
public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.

//return true;
	 super.onCreateOptionsMenu(menu);
	getMenuInflater().inflate(R.menu.cool_menu, menu);
	return true;
}

@Override
public boolean onOptionsItemSelected(MenuItem item) {

/*int id = item.getItemId();
if (id == R.id.action_settings) {
return true;
}
return super.onOptionsItemSelected(item);*/
	switch (item.getItemId()) {  
    case R.id.menu1:  
    	AlertDialog ab1= new AlertDialog.Builder(this).create();
		ab1.setMessage(" Hello, Welcome to our app TUTELAGE "
						+ " This is for the  present parents teachers or institutions it provides an easy "
						+ " way to teach and provide the resources. "
						+ " You can also design something to help "
						+" students to access the required resources available in the internet "
						+" through quicker and efficient systems.");
		ab1.show();
		return true;
		
    case R.id.menu2:  
    	AlertDialog ab2= new AlertDialog.Builder(this).create();
		ab2.setMessage("Education apps that will satisfy the needs of all types for you"
						+"you just have to click on a particular button of your respective"
						+"branch or proffession and that will take you to the most popular and frequently visited website");
		ab2.show();
		return true;
		
    case R.id.menu3:  
    	AlertDialog ab3= new AlertDialog.Builder(this).create();
		ab3.setMessage("Please Fill the valid credential ");
		ab3.show();
		Intent i1=new Intent(Datab.this,Rate_feed.class);
		startActivity(i1);
		
		return true;
		
    case R.id.menu4:  
    	//AlertDialog ab4= new AlertDialog.Builder(this).create();
		//ab4.setMessage("");
		//ab4.show();
    	
		return true;
		
    case R.id.menu5:  
    	AlertDialog ab5= new AlertDialog.Builder(this).create();
		ab5.setMessage("Please Fill the valid credential ");
		ab5.show();
		return true;
		
     default:  
   return super.onOptionsItemSelected(item);
	}
 
	
	
}
}