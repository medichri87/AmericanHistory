package com.medina.americanhistory;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Timeline extends Activity {
	
	private final Context context = this;
	private Button period1, period2, period3, period4, period5, period6;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.timeline);
		
		addPeriod1Button();
		addPeriod2Button();
		addPeriod3Button();
		addPeriod4Button();
		addPeriod5Button();
		addPeriod6Button();
	}
	
	protected void addPeriod1Button() {
		
		period1 = (Button)findViewById(R.id.period1_button);
		period1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, Period1.class);
				startActivity(intent);
			}
		});
		
	}
	
	protected void addPeriod2Button() {
		
		period2 = (Button)findViewById(R.id.period2_button);
		period2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, Period2.class);
				startActivity(intent);
			}
		});
		
	}
	
	protected void addPeriod3Button() {
		
		period3 = (Button)findViewById(R.id.period3_button);
		period3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, Period3.class);
				startActivity(intent);
			}
		});
		
	}
	
	protected void addPeriod4Button() {
		
		period4 = (Button)findViewById(R.id.period4_button);
		period4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, Period4.class);
				startActivity(intent);
			}
		});
		
	}
	
	protected void addPeriod5Button() {
		
		period5 = (Button)findViewById(R.id.period5_button);
		period5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, Period5.class);
				startActivity(intent);
			}
		});
		
	}
	
	protected void addPeriod6Button() {
		
		period6 = (Button)findViewById(R.id.period6_button);
		period6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, Period6.class);
				startActivity(intent);
			}
		});
		
	}

}
