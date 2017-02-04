package com.example.work;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {
	Button b1;
	TextView t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
         t2=(TextView) findViewById(R.id.textView2);
         
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

	//@Override
	/*public void onClick(View v) {
		// TODO Auto-generated method stub
		
		
	}*/
}
