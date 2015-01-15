package com.medina.americanhistory;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class People extends Activity{
	
	private final Context context = this;
	private Button washington, jefferson, edison, mlk, ford, franklin, lee, lindbergh, armstrong, jackson, tr, fdr, rockefeller, earhart, lincoln;	
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.people);	
		
		addWashingtonButton();
		addJeffersonButton();
		addEdisonButton();
		addMLKButton();
		addFordButton();
		addFranklinButton();
		addLeeButton();
		addLindberghButton();
		addArmstrongButton();
		addJacksonButton();
		addTRButton();
		addFDRButton();
		addRockefellerButton();
		addEarhartButton();
		addLincolnButton();
		
	}
	

	protected void addWashingtonButton() {
			
		washington = (Button)findViewById(R.id.WashingtonButton);
		washington.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, Washington.class);
				startActivity(intent);
			}
		});
		
	}

	protected void addJeffersonButton(){
		
		jefferson = (Button)findViewById(R.id.JeffersonButton);
		jefferson.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, Jefferson.class);
				startActivity(intent);
			}
		});
	}
	
	protected void addEdisonButton() {
		
		edison = (Button)findViewById(R.id.EdisonButton);
		edison.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, Edison.class);
				startActivity(intent);
			}
		});
		
		
	}
	
	protected void addMLKButton() {
		
		mlk = (Button)findViewById(R.id.MLKButton);
		mlk.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, MLK.class);
				startActivity(intent);
			}
		});
		
	}

	protected void addFordButton() {
		
		ford = (Button)findViewById(R.id.FordButton);
		ford.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, Ford.class);
				startActivity(intent);
			}
		});
		
	}
	
	protected void addFranklinButton() {
		
		franklin = (Button)findViewById(R.id.FranklinButton);
		franklin.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, Franklin.class);
				startActivity(intent);
			}
		});
		
	}
	
	protected void addLeeButton() {
		
		lee = (Button)findViewById(R.id.LeeButton);
		lee.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, Lee.class);
				startActivity(intent);
			}
		});
		
	}
	
	protected void addLindberghButton() {
		
		lindbergh = (Button)findViewById(R.id.LindberghButton);
		lindbergh.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, Lindbergh.class);
				startActivity(intent);
			}
		});
		
	}
	
	protected void addArmstrongButton() {
		
		armstrong = (Button)findViewById(R.id.ArmstrongButton);
		armstrong.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, Armstrong.class);
				startActivity(intent);
			}
		});
		
	}

	protected void addJacksonButton() {
		
		jackson = (Button)findViewById(R.id.JacksonButton);
		jackson.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, Jackson.class);
				startActivity(intent);
			}
		});
		
	}
	
	protected void addTRButton() {
		
		tr = (Button)findViewById(R.id.TRooseveltButton);
		tr.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, TR.class);
				startActivity(intent);
			}
		});
		
	}
	
	protected void addFDRButton() {
		
		fdr = (Button)findViewById(R.id.FDRButton);
		fdr.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, FDR.class);
				startActivity(intent);
			}
		});
		
	}
	
	protected void addRockefellerButton() {
		
		rockefeller = (Button)findViewById(R.id.RockefellerButton);
		rockefeller.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, Rockefeller.class);
				startActivity(intent);
			}
		});
		
	}

	
	protected void addEarhartButton() {
		
		earhart = (Button)findViewById(R.id.EarhartButton);
		earhart.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, Earhart.class);
				startActivity(intent);
			}
		});
		
	}
	
	protected void addLincolnButton() {
		
		lincoln = (Button)findViewById(R.id.LincolnButton);
		lincoln.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, Lincoln.class);
				startActivity(intent);
			}
		});
		
	}
}
