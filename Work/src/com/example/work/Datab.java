package com.example.work;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Datab extends Activity {
Button btnSignIn,btnSignUp;
LoginDataBaseAdapter loginDataBaseAdapter;


@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_datab);

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
getMenuInflater().inflate(R.menu.main, menu);
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
}