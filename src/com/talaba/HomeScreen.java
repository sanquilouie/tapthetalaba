package com.talaba;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

public class HomeScreen extends Activity {
	MediaPlayer mp;
	SharedPreferences preferences;
	public static final String PrefFile = "Prefs";
	public static final String MuteStatus = "muteKey";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.home_screen);
        
        mp = MediaPlayer.create(getApplicationContext(), R.raw.playsfx);

            	mp.start();
            	mp.setLooping(true);
            	ImageButton game = (ImageButton)findViewById(R.id.imageButton1);
            	ImageButton about = (ImageButton)findViewById(R.id.imageButton2);
            	ImageButton help = (ImageButton)findViewById(R.id.imageButton3);
            	ImageButton settings = (ImageButton)findViewById(R.id.imageButton4);
            	game.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						Intent i = new Intent(HomeScreen.this, MainActivity.class); //change it to your main class
					    //the following 2 tags are for clearing the backStack and start fresh
					    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
					    finish();
					    startActivity(i);
					    mp.stop();
					}
				});
            	about.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						Intent i = new Intent(HomeScreen.this, About.class); //change it to your main class
					    //the following 2 tags are for clearing the backStack and start fresh
					    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
					    finish();
					    startActivity(i);
					    mp.stop();
					}
				});
            	help.setOnClickListener(new View.OnClickListener() {
	
            		@Override
            		public void onClick(View arg0) {
            			Intent i = new Intent(HomeScreen.this, Help.class); //change it to your main class
            			//the following 2 tags are for clearing the backStack and start fresh
            			i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            			i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            			finish();
            			startActivity(i);
            			mp.stop();
            		}
            	});
            	settings.setOnClickListener(new View.OnClickListener() {
	
            		@Override
            		public void onClick(View arg0) {
            			Intent i = new Intent(HomeScreen.this, Settings.class); //change it to your main class
            			//the following 2 tags are for clearing the backStack and start fresh
            			i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            			i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            			finish();
            			startActivity(i);
            			mp.stop();
            		}
            	});
    }

    
}
