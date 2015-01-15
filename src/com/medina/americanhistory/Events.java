package com.medina.americanhistory;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Events extends Activity {
	
	private final Context context = this;
	private Button whiskey, shays, lindbergh, trail, jfk, lexcon, massacre, teaparty, civilrights, apollo11;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.events);
		
		addWhiskeyRebellionButton();
		addShaysRebellionButton();
		addLexConButton();
		addApollo11Button();
		addBostonMassacreButton();
		addCivilRightsButton();
		addTeaPartyButton();
		addTrailButton();
		addJFKAssassinationButton();
		addCivilRightsButton();
	}
	
	
	protected void addWhiskeyRebellionButton() {
		
		whiskey = (Button)findViewById(R.id.whiskeyButton);
		whiskey.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, WhiskeyRebellion.class);
				startActivity(intent);
			}
		});
		
	}
	
	protected void addShaysRebellionButton() {
		
		shays = (Button)findViewById(R.id.shaysButton);
		shays.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, ShaysRebellion.class);
				startActivity(intent);
			}
		});
		
	}
	
	protected void addLindberghFlightButton() {
		
		lindbergh = (Button)findViewById(R.id.flightButton);
		lindbergh.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, LindberghFlight.class);
				startActivity(intent);
			}
		});
		
	}
	
	protected void addTrailButton() {
		
		trail = (Button)findViewById(R.id.trailButton);
		trail.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, TrailOfTears.class);
				startActivity(intent);
			}
		});
		
	}
	
	protected void addJFKAssassinationButton() {
		
		jfk = (Button)findViewById(R.id.jfkButton);
		jfk.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, JFK.class);
				startActivity(intent);
			}
		});
		
	}
	
	protected void addLexConButton() {
		
		lexcon = (Button)findViewById(R.id.lexconButton);
		lexcon.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, LexCon.class);
				startActivity(intent);
			}
		});
		
	}
	
	protected void addBostonMassacreButton() {
		
		massacre = (Button)findViewById(R.id.massacreButton);
		massacre.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, BostonMassacre.class);
				startActivity(intent);
			}
		});
		
	}
	
	protected void addTeaPartyButton() {
		
		teaparty = (Button)findViewById(R.id.teapartyButton);
		teaparty.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, TeaParty.class);
				startActivity(intent);
			}
		});
		
	}
	
	protected void addCivilRightsButton() {
		
		civilrights = (Button)findViewById(R.id.civilrightsButton);
		civilrights.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, CivilRights.class);
				startActivity(intent);
			}
		});
		
	}
	
	protected void addApollo11Button() {
		
		apollo11 = (Button)findViewById(R.id.apolloButton);
		apollo11.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, Apollo11.class);
				startActivity(intent);
			}
		});
		
	}

}
