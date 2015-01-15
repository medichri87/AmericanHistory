package com.medina.americanhistory;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;


public class Splash extends Activity {

	final Context context = this;
	
	//Add delay for splash screen
	final int TIMER_DELAY = 2000; //2000ms == 2 seconds

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		
		Thread timer = new Thread(){
			
			@Override
			public void run(){
				try{
					sleep(TIMER_DELAY);
					Intent menu = new Intent(context, Menu.class);
					startActivity(menu);
				}
				catch(InterruptedException ex){
					ex.printStackTrace();
				}
				finally{
					finish();
				}
			}
			
		};
		
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}
}
