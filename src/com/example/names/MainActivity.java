package com.example.names;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button BSAY;
	Button name1, name2;
	TextView tvisim, tvSAYI;
	int say = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		super.onCreate(savedInstanceState);
		// Get the view from activity_main.xml
		setContentView(R.layout.activity_main);
		

		
		BSAY = (Button) findViewById(R.id.bSay);
		name1 = (Button) findViewById(R.id.bName1);
		name2 = (Button) findViewById(R.id.bName2);
		tvSAYI = (TextView) findViewById(R.id.tvNumber);
		tvisim = (TextView) findViewById(R.id.tvIsim);
		
		BSAY.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				say ++;
				tvSAYI.setText(String.valueOf(say));
			
				
			}
		});
		
		
		name1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				say = 0;
				tvSAYI.setText(String.valueOf(0));
				 tvisim.setText(getResources().getString(R.string.isim1));
			}
		});
		
		name2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				say = 0;
				tvSAYI.setText(String.valueOf(0));
				  tvisim.setText(getResources().getString(R.string.isim2));
			}
		});
		
		
		
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
