package com.talaba;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Toast;

public class Settings extends Activity {
	
	SharedPreferences preferences;
	public static final String PrefFile = "Prefs";
	public static final String MuteStatus = "muteKey";
	
    ImageButton btnSave;
    CheckBox chkMute;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.settings);
        
        
        preferences = getSharedPreferences("PrefFile", MODE_PRIVATE);
        chkMute = (CheckBox) findViewById(R.id.checkBox1);
        
        if(preferences.getBoolean(MuteStatus, true)==true){
        chkMute.setChecked(true); // mute
        AudioManager amanager=(AudioManager)getSystemService(Context.AUDIO_SERVICE);
        amanager.setStreamVolume(AudioManager.STREAM_MUSIC,
        	    AudioManager.FLAG_SHOW_UI + AudioManager.FLAG_REMOVE_SOUND_AND_VIBRATE, 0);
        }else{
        chkMute.setChecked(false);
        AudioManager amanager=(AudioManager)getSystemService(Context.AUDIO_SERVICE);
        amanager.setStreamVolume(AudioManager.STREAM_MUSIC,
        	    AudioManager.FLAG_SHOW_UI + AudioManager.FLAG_PLAY_SOUND, 0);
        }
        
        btnSave = (ImageButton) findViewById(R.id.button1);
        btnSave.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view) {
        SharedPreferences.Editor edit = preferences.edit();
        // question count value to store
        edit.putBoolean(MuteStatus, chkMute.isChecked()); // mute value to store
        edit.commit(); // save the new value
        Toast.makeText(getApplicationContext(), "Updated settings saved!",
        Toast.LENGTH_SHORT).show();
        }
        });


         
        ImageButton back = (ImageButton)findViewById(R.id.imageButton1);
        back.setOnClickListener(new View.OnClickListener() {
        	
    		@Override
    		public void onClick(View arg0) {
    			Intent i = new Intent(Settings.this, HomeScreen.class); //change it to your main class
    			//the following 2 tags are for clearing the backStack and start fresh
    			i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    			i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    			finish();
    			startActivity(i);
    		}
    	});
    }
    
    
    
 
}
