package com.medina.americanhistory;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WhiskeyRebellion extends Activity {

	WebView wv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.whiskey);
		
		wv = (WebView) findViewById(R.id.whiskey_web);
		wv.getSettings().setJavaScriptEnabled(true);
		wv.loadUrl("file:///android_asset/whiskey.html");
	}
}
