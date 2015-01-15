package com.medina.americanhistory;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Documents extends Activity {
	
	private final Context context = this;
	private Button independence, articles, emancipation, religious, constitution;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.documents);
		
		addIndependenceButton();
		addStatuteButton();
		addEmancipationButton();
		addArticlesButton();
		addConstitutionButton();
	}
	
	protected void addIndependenceButton() {
		
		independence = (Button)findViewById(R.id.independence_button);
		independence.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, Independence.class);
				startActivity(intent);
			}
		});
		
	}
	
protected void addArticlesButton() {
		
		articles = (Button)findViewById(R.id.articles_button);
		articles.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, Articles.class);
				startActivity(intent);
			}
		});
		
	}

protected void addEmancipationButton() {
	
	emancipation = (Button)findViewById(R.id.emancipation_button);
	emancipation.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent intent = new Intent(context, Emancipation.class);
			startActivity(intent);
		}
	});
	
}

protected void addStatuteButton() {
	
	religious = (Button)findViewById(R.id.religious_button);
	religious.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent intent = new Intent(context, ReligiousFreedom.class);
			startActivity(intent);
		}
	});
	
}

protected void addConstitutionButton() {
	
	constitution = (Button)findViewById(R.id.constitution_button);
	constitution.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent intent = new Intent(context, Constitution.class);
			startActivity(intent);
		}
	});
	
}

}
