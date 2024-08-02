package com.talaba;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

public class Help extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.help);
         
        ImageButton back = (ImageButton)findViewById(R.id.imageButton1);   
 back.setOnClickListener(new View.OnClickListener() {
        	
    		@Override
    		public void onClick(View arg0) {
    			Intent i = new Intent(Help.this, HomeScreen.class); //change it to your main class
    			//the following 2 tags are for clearing the backStack and start fresh
    			i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    			i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    			finish();
    			startActivity(i);
    		}
    	});
    }
    
    
    
 
}
