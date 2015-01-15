package com.medina.americanhistory;


import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Menu extends Activity{

	private Button people, events, wars, documents, timeline, about;
	final Context context = this;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
	
		ActionBar ab = getActionBar();
		ab.setIcon(R.drawable.us_flag);
		ab.setDisplayShowCustomEnabled(true);
		
		addPeopleButton();
		addEventsButton();
		addWarsButton();
		addDocumentsButton();
		addTimelineButton();
		addAboutButton();
	}
	

	protected void addPeopleButton(){
				
		people = (Button)findViewById(R.id.people);
		people.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, People.class);
				startActivity(intent);
			}
		});
	}
	
		
	protected void addEventsButton(){
		
		
		events = (Button)findViewById(R.id.events);
		events.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, Events.class);
				startActivity(intent);
			}
		});
	}
	
	
	protected void addWarsButton(){
		
			
		wars = (Button)findViewById(R.id.wars);
		wars.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, Wars.class);
				startActivity(intent);
			}
		});
	}
	
	
	
	protected void addDocumentsButton(){
		
		
		documents = (Button)findViewById(R.id.documents);
		documents.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, Documents.class);
				startActivity(intent);
			}
		});
	}
	
	
	protected void addTimelineButton(){
		
		
		timeline = (Button)findViewById(R.id.timeline);
		timeline.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, Timeline.class);
				startActivity(intent);
			}
		});
	}
	
	protected void addAboutButton(){
		
		
		about = (Button)findViewById(R.id.about);
		about.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, About.class);
				startActivity(intent);
			}
		});
	}

	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}
	
	

}
