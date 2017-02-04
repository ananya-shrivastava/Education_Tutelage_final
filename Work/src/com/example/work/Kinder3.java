package com.example.work;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Kinder3 extends Activity implements View.OnClickListener {
	Button w1,w2,w3,w4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_kinder3);
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
		getMenuInflater().inflate(R.menu.kinder3, menu);
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
			String url1 = "https://www.google.co.in/url?sa=t&rct=j&q=&esrc=s&"
					+ "source=web&cd=3&cad=rja&uact=8&ved=0ahUKEwjX3_zPyfPRA"
					+ "hWJo48KHcfsDswQtwIIJjAC&url=https%3A%2F%2Fwww.yo"
					+ "utube.com%2Fwatch%3Fv%3DjYoMGL3-_m8&usg=AFQjCNG"
					+ "1eKwTzN_4prDIjRIkn3Aob6jYcg&sig2=brA7rMVhf6L8sB3E-jYrlA";
			Intent i = new Intent(Intent.ACTION_VIEW);
			i.setData(Uri.parse(url1));
			startActivity(i);
		break;
		case R.id.button2:
			String url2 = " https://www.google.co.in/url?sa=t&rct=j&q=&esrc=s&so"
					+ "urce=web&cd=6&cad=rja&uact=8&ved=0ahUKEwjX3_zPyfPRAh"
					+ "WJo48KHcfsDswQtwIIODAF&url=http%3A%2F%2Fwww.dailymo"
					+ "tion.com%2Fvideo%2Fx1x1q9c_the-fox-and-the-goat-moral-stories-animated-stories-in-english"
					+ "_shortfilms&usg=AFQjCNEof4j7qa9Qzm3OvwVED3"
					+ "1v3Tp84g&sig2=G1xYky6wtEEnCv_zcb_4ag";
			Intent i1 = new Intent(Intent.ACTION_VIEW);
			i1.setData(Uri.parse(url2));
			startActivity(i1);
		break;
		case R.id.button3:
			String url3 = " https://www.google.co.in/url?sa=t&rct=j&q=&esrc=s&source=web&cd=3&cad=rja&uact=8&ved=0ahUKEwj-9ZP-0vPRAhXHto8KHa4XCY0QtwIIJTAC&url=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3DYHaod9TGaII&usg=AFQjCNFIyZMD1Ot7f0fvaWxvz8ON6RwG2g&sig2=etmayvaP45mplxg92jX43w&bvm=bv.146094739,d.c2I";
			Intent i2 = new Intent(Intent.ACTION_VIEW);
			i2.setData(Uri.parse(url3));
			startActivity(i2);
		break;
		case R.id.button4:
			String url4 = "https://www.google.co.in/url?sa=t&rct=j&q=&esrc=s&source=web&cd=5&cad=rja&uact=8&ved=0ahUKEwj-9ZP-0vPRAhXHto8KHa4XCY0QtwIIMTAE&url=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3DmybC3wnB_Vo&usg=AFQjCNE8hcxM77kBj3Vid18FdYV1XLqVBA&sig2=F81gBbVVnToBqAIg_EGUnw&bvm=bv.146094739,d.c2I";
			Intent i3 = new Intent(Intent.ACTION_VIEW);
			i3.setData(Uri.parse(url4));
			startActivity(i3);
		break;
		}
		
	}
}
