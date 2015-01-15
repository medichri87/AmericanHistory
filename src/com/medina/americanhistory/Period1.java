package com.medina.americanhistory;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class Period1 extends Activity {

	WebView wv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.period1);
		
		wv = (WebView) findViewById(R.id.period1_web);
		wv.getSettings().setJavaScriptEnabled(true);
		wv.loadUrl("file:///android_asset/period1.html");
		
	}
}
