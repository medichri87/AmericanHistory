package com.medina.americanhistory;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class Apollo11 extends Activity {

	private WebView wv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.apollo11);
		
		wv = (WebView) findViewById(R.id.apollo_web);
		wv.getSettings().setJavaScriptEnabled(true);
		wv.loadUrl("file:///android_asset/apollo11.html");
	}
}
