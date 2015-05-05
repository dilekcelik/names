package com.example.names;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Window;

public class Splash extends Activity{

	
	@Override
	protected void onCreate(Bundle DilekLoveProgramming) {
		// TODO Auto-generated method stub
		super.onCreate(DilekLoveProgramming);

		setContentView(R.layout.splash);

		   
		
		Thread timer = new Thread() {
		public void run() {
			try {
				sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				Intent MainActivity = new Intent ("android.intent.action.MAINACTIVITY");
				startActivity(MainActivity);
			}
		}};
		timer.start();
		
		
		
	
	}

	
	
}