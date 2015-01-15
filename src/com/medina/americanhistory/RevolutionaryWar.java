package com.medina.americanhistory;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class RevolutionaryWar extends Activity {
	
	
	WebView wv; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.revolution);
		
		wv = (WebView) findViewById(R.id.revolutionary_web);
		wv.getSettings().setJavaScriptEnabled(true);
		wv.loadUrl("file:///android_asset/revolutionary.html");
	}

}
