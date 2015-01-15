package com.medina.americanhistory;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Wars extends Activity {
	
	
	private final Context context = this;
	private Button revolution, warof1812, mexican_american, civilwar, spanish_american, world_war1, world_war2, korean, vietnam, gulf1, gulf2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wars);
		
		addRevolutionaryWarButton();
		addWarof1812Button();
		addMexican_AmericanWarButton();
		addCivilWarButton();
		addSpanish_AmericanWarButton();
		addWorldWar1Button();
		addWorldWar2Button();
		addKoreanWarButton();
		addVietnamWarButton();
		addGulfWar1Button();
		addGulfWar2Button();
	}

	
protected void addRevolutionaryWarButton() {
		
		revolution = (Button)findViewById(R.id.war1_button);
		revolution.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, RevolutionaryWar.class);
				startActivity(intent);
			}
		});
		
	}

protected void addWarof1812Button() {
	
	warof1812 = (Button)findViewById(R.id.war2_button);
	warof1812.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent intent = new Intent(context, Warof1812.class);
			startActivity(intent);
		}
	});
	
}

protected void addMexican_AmericanWarButton() {
	
	mexican_american = (Button)findViewById(R.id.war3_button);
	mexican_american.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent intent = new Intent(context, MexicanAmericanWar.class);
			startActivity(intent);
		}
	});
	
}

protected void addCivilWarButton() {
	
	civilwar = (Button)findViewById(R.id.war4_button);
	civilwar.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent intent = new Intent(context, CivilWar.class);
			startActivity(intent);
		}
	});
	
}

protected void addSpanish_AmericanWarButton() {
	
	spanish_american = (Button)findViewById(R.id.war5_button);
	spanish_american.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent intent = new Intent(context, SpanishAmericanWar.class);
			startActivity(intent);
		}
	});
	
}

protected void addWorldWar1Button() {
	
	world_war1 = (Button)findViewById(R.id.war6_button);
	world_war1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent intent = new Intent(context, WorldWar1.class);
			startActivity(intent);
		}
	});
	
}

protected void addWorldWar2Button() {
	
	world_war2 = (Button)findViewById(R.id.war7_button);
	world_war2.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent intent = new Intent(context, WorldWar2.class);
			startActivity(intent);
		}
	});
	
}

protected void addKoreanWarButton() {
	
	korean = (Button)findViewById(R.id.war8_button);
	korean.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent intent = new Intent(context, KoreanWar.class);
			startActivity(intent);
		}
	});
	
}

protected void addVietnamWarButton() {
	
	vietnam = (Button)findViewById(R.id.war9_button);
	vietnam.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent intent = new Intent(context, VietnamWar.class);
			startActivity(intent);
		}
	});
	
}

protected void addGulfWar1Button() {
	
	gulf1 = (Button)findViewById(R.id.war10_button);
	gulf1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent intent = new Intent(context, GulfWar1.class);
			startActivity(intent);
		}
	});
	
}

protected void addGulfWar2Button() {
	
	gulf2 = (Button)findViewById(R.id.war11_button);
	gulf2.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent intent = new Intent(context, GulfWar2.class);
			startActivity(intent);
		}
	});
	
}

}
