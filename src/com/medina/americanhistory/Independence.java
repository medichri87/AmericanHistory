package com.medina.americanhistory;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class Independence extends Activity {
	
	WebView wv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.independence);
		
		wv = (WebView) findViewById(R.id.independence_web);
		wv.getSettings().setJavaScriptEnabled(true);
		wv.loadUrl("file:///android_asset/independence.html");
	}

}
