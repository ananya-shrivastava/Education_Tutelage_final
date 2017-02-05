package com.example.work;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
	Button b1;
	TextView t2;
	MenuItem m1,m2,m3,m4,m5;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
         t2=(TextView) findViewById(R.id.textView2);
         m1=(MenuItem) findViewById(R.id.menu1);
         m2=(MenuItem) findViewById(R.id.menu2);
         m3=(MenuItem) findViewById(R.id.menu3);
         m4=(MenuItem) findViewById(R.id.menu4);
         m4=(MenuItem) findViewById(R.id.menu5);
         
         
         Animation anim = new AlphaAnimation(0.0f, 1.0f);
         anim.setDuration(50); //You can manage the blinking time with this parameter
         anim.setStartOffset(20);
         anim.setRepeatMode(Animation.REVERSE);
         anim.setRepeatCount(Animation.INFINITE);
         t2.startAnimation(anim);
         
         Thread t=new Thread(){
 			public void run()
 			{
 				try{
 					sleep(2000);
 				}catch(InterruptedException e){
 					e.printStackTrace();
 				}
 				finally{
 					Intent re=new Intent(MainActivity.this, Datab.class);
 					startActivity(re);
 				}
 				
 			}
 			
 		};
 		t.start(); 
        
    }
    protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		
		finish();
	}
	

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.cool_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
    	switch (item.getItemId()) {  
        case R.id.menu1:  
        	AlertDialog ab1= new AlertDialog.Builder(this).create();
    		ab1.setMessage(" Hello, Welcome to our app TUTELAGE"
    						+ "This is for the  present parents teachers or institutions an easy"
    						+ " way to teach and provide the resources."
    						+ " You can also design something to help "
    						+"students to access the required resources available in the internet"
    						+"through quicker and efficient systems.");
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
        	Intent Email = new Intent(Intent.ACTION_SEND);
            Email.setType("text/email");
            Email.putExtra(Intent.EXTRA_EMAIL, new String[] { "admin@hotmail.com" });
            Email.putExtra(Intent.EXTRA_SUBJECT, "Feedback");
            Email.putExtra(Intent.EXTRA_TEXT, "Dear ...," + "");
            startActivity(Intent.createChooser(Email, "Send Feedback:"));
            return true;
        	
        	//AlertDialog ab3= new AlertDialog.Builder(this).create();
    		//ab3.setMessage(" ");
    		//ab3.show();
    		
    		
        case R.id.menu4:  
        	//AlertDialog ab4= new AlertDialog.Builder(this).create();
    		//ab4.setMessage("");
    		//ab4.show();
    		return true;
    		
        case R.id.menu5:  
        	AlertDialog ab5= new AlertDialog.Builder(this).create();
    		ab5.setMessage(" create your new profile ");
    		ab5.show();
    		
    		return true;
    		
         default:  
       return super.onOptionsItemSelected(item);
    	}
    	
    	
    	
    }
    

	//@Override
	/*public void onClick(View v) {
		// TODO Auto-generated method stub
		
		
	}*/
}
