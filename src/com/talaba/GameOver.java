package com.talaba;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.TextView;

public class GameOver extends Activity {
	TextView score, res, sco, best, bestcom;
	ImageButton regame, homey;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.game_over);
          score = (TextView)findViewById(R.id.textView1);
          res = (TextView)findViewById(R.id.textView2);
          sco = (TextView)findViewById(R.id.textView3);
          best = (TextView)findViewById(R.id.textView4);
          bestcom = (TextView)findViewById(R.id.textView5);
          regame = (ImageButton)findViewById(R.id.imageButton1);
          homey = (ImageButton)findViewById(R.id.imageButton2);
          score.setTextColor(Color.rgb(255, 255, 255));
          res.setTextColor(Color.rgb(255, 255, 255));
          sco.setTextColor(Color.rgb(255, 255, 255));
          best.setTextColor(Color.rgb(255, 255, 255));
          bestcom.setTextColor(Color.rgb(255, 255, 255));
          Intent intent = getIntent();
          String scoree = intent.getStringExtra("score");
          String combo = intent.getStringExtra("best");
          score.setText(scoree);
          best.setText(combo);
          
          regame.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				 Intent i = new Intent(GameOver.this, MainActivity.class); //change it to your main class
				    //the following 2 tags are for clearing the backStack and start fresh
				    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				    finish();
				    startActivity(i);
			}
		});
          homey.setOnClickListener(new View.OnClickListener() {
  			
  			@Override
  			public void onClick(View arg0) {
  				 Intent i = new Intent(GameOver.this, HomeScreen.class); //change it to your main class
  				    //the following 2 tags are for clearing the backStack and start fresh
  				    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
  				    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
  				    finish();
  				    startActivity(i);
  			}
  		});
    }
    
    
    
 
}
