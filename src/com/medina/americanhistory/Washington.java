package com.medina.americanhistory;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

public class Washington extends Activity {
	
	WebView wv;
		
	//int[] quotes = {};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.washington);
		
		Toast.makeText(this, R.string.longString, Toast.LENGTH_LONG).show();
		
		wv = (WebView) findViewById(R.id.washington_web);
		wv.getSettings().setJavaScriptEnabled(true);
		wv.loadUrl("file:///android_asset/washington.html");
		
	
	}

}
