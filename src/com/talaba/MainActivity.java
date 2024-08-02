package com.talaba;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	TextView timy, scorey, comby;
	Button rs;
	final Handler handler = new Handler();
	Timer t = new Timer();	
	TimerTask mTimerTask;
	TextView col, wor;
	String colory, wory;
	ImageView b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
	int  one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve,  thirteen, fourteen, fifteen,sixteen , word, color, needed, ButtonName, yellow, blue, green, red;
	String flag1, flag2, flag3, flag4, flag5, flag6, flag7, flag8, flag9, flag10, flag11, flag12, flag13, flag14, flag15, flag16, ColorNeeded, TheMap;
	char[] Map;
	int score, points;
	int combo = 1;
	int bestcombo = 0;
	int delay = 1000;
	int period = 1000;
	int round = 0;
	String Shell = "";
	private int nCounter = 10;
	ProgressBar bar;
	
	SharedPreferences preferences;
	public static final String PrefFile = "Prefs";
	public static final String QuestionsCount = "qcountKey";
	public static final String MuteStatus = "muteKey";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        
        scorey = (TextView)findViewById(R.id.textView2);
        timy = (TextView)findViewById(R.id.textView1);
        comby = (TextView)findViewById(R.id.textView3);
        bar = (ProgressBar)findViewById(R.id.progressBar1);
        bar.setScaleY(3f);
        col = (TextView)findViewById(R.id.Color);
        wor = (TextView)findViewById(R.id.Word);
        colory = col.getText().toString();
        wory = wor.getText().toString();
        
        timy.setTextColor(Color.rgb(255, 255, 255));
        comby.setTextColor(Color.rgb(255, 255, 255));
        scorey.setTextColor(Color.rgb(255, 255, 255));
        wor.setTextColor(Color.rgb(255, 255, 255));
         b1 = (ImageView)findViewById(R.id.ImageView1);
    	 b2 = (ImageView)findViewById(R.id.ImageView2);
    	 b3 = (ImageView)findViewById(R.id.ImageView3);
    	 b4 = (ImageView)findViewById(R.id.ImageView4);
    	 b5 = (ImageView)findViewById(R.id.ImageView5);
    	 b6 = (ImageView)findViewById(R.id.ImageView6);
    	 b7 = (ImageView)findViewById(R.id.ImageView7);
    	 b8 = (ImageView)findViewById(R.id.ImageView8);
    	 b9 = (ImageView)findViewById(R.id.ImageView9);
    	 b10 = (ImageView)findViewById(R.id.ImageView10);
    	 b11 = (ImageView)findViewById(R.id.ImageView11);
    	 b12 = (ImageView)findViewById(R.id.ImageView12);
    	 b13 = (ImageView)findViewById(R.id.ImageView13);
    	 b14 = (ImageView)findViewById(R.id.ImageView14);
    	 b15 = (ImageView)findViewById(R.id.ImageView15);
    	 b16 = (ImageView)findViewById(R.id.ImageView16);
    	 
    	 Shuffle();
    	 ShowThem();
         CountThem();
         Need();
         Law();
         Timer();
    	 
    	   b1.setOnClickListener(new View.OnClickListener() {
    			@Override
    			public void onClick(View arg0) {
    		ButtonName = 1;
    		Inspector();
    			}
    		});
    		b2.setOnClickListener(new View.OnClickListener() {
    			@Override
    			public void onClick(View arg0) {
    				ButtonName = 2;
    				Inspector();
    			}
    		});
    		b3.setOnClickListener(new View.OnClickListener() {
    			@Override
    			public void onClick(View arg0) {
    				ButtonName = 3;
    				Inspector();
    		
    			}
    		});
    		b4.setOnClickListener(new View.OnClickListener() {
    			@Override
    			public void onClick(View arg0) {
    				ButtonName = 4;
    				Inspector();
    		
    			}
    		});
    		b5.setOnClickListener(new View.OnClickListener() {
    			@Override
    			public void onClick(View arg0) {
    				ButtonName = 5;
    				Inspector();
    		
    			}
    		});
    		b6.setOnClickListener(new View.OnClickListener() {
    			@Override
    			public void onClick(View arg0) {
    				ButtonName = 6;
    				Inspector();
    		
    			}
    		});
    		b7.setOnClickListener(new View.OnClickListener() {
    			@Override
    			public void onClick(View arg0) {
    				ButtonName = 7;
    				Inspector();
    		
    			}
    		});
    		b8.setOnClickListener(new View.OnClickListener() {
    			@Override
    			public void onClick(View arg0) {
    				ButtonName = 8;
    				Inspector();
    		
    			}
    		});
    		b9.setOnClickListener(new View.OnClickListener() {
    			@Override
    			public void onClick(View arg0) {
    				ButtonName = 9;
    				Inspector();
    		
    			}
    		});
    		b10.setOnClickListener(new View.OnClickListener() {
    			@Override
    			public void onClick(View arg0) {
    				ButtonName = 10;
    				Inspector();
    		
    			}
    		});
    		b11.setOnClickListener(new View.OnClickListener() {
    			@Override
    			public void onClick(View arg0) {
    				ButtonName = 11;
    				Inspector();
    		
    			}
    		});
    		b12.setOnClickListener(new View.OnClickListener() {
    			@Override
    			public void onClick(View arg0) {
    				ButtonName = 12;
    				Inspector();
    		
    			}
    		});
    		b13.setOnClickListener(new View.OnClickListener() {
    			@Override
    			public void onClick(View arg0) {
    				ButtonName = 13;
    				Inspector();
    		
    			}
    		});
    		b14.setOnClickListener(new View.OnClickListener() {
    			@Override
    			public void onClick(View arg0) {
    				ButtonName = 14;
    				Inspector();
    		
    			}
    		});
    		b15.setOnClickListener(new View.OnClickListener() {
    			@Override
    			public void onClick(View arg0) {
    				ButtonName = 15;
    				Inspector();  		
    			}
    		});
    		b16.setOnClickListener(new View.OnClickListener() {
    			@Override
    			public void onClick(View arg0) {
    				ButtonName = 16;
    				Inspector();
    		
    			}
    		});
    		
    		
}  
    
    
    public void Shuffle() {      
        Random allrand = new Random();
         one = allrand.nextInt(4);
         two = allrand.nextInt(4);
         three = allrand.nextInt(4);
         four = allrand.nextInt(4);
         five = allrand.nextInt(4);
         six = allrand.nextInt(4);
         seven = allrand.nextInt(4);
         eight = allrand.nextInt(4);
         nine = allrand.nextInt(4);
         ten = allrand.nextInt(4);
         eleven = allrand.nextInt(4);
         twelve = allrand.nextInt(4);
         thirteen = allrand.nextInt(4);
         fourteen = allrand.nextInt(4);
         fifteen = allrand.nextInt(4);
         sixteen = allrand.nextInt(4);
         needed = allrand.nextInt(2);
         word = allrand.nextInt(4);
         color = allrand.nextInt(4);
         TheMap = "" + one + two + three + four + five + six + seven + eight + nine + ten + eleven + twelve + thirteen + fourteen + fifteen + sixteen;
    }
    public void ShowThem() {
    	switch(one) {
    	case 0:
	        b1.setImageResource(R.drawable.yellow);
	        flag1 = "Yellow";
	    break;
	    case 1:
	    	b1.setImageResource(R.drawable.blue);
	        flag1 = "Blue";
	    break;
	    case 2:
	    	b1.setImageResource(R.drawable.green);
	        flag1 = "Green";
	    break;
	    case 3:
	    	b1.setImageResource(R.drawable.red);
	        flag1 = "Red";
	    break;
    	}
    	switch(two) {
    	case 0:
	        b2.setImageResource(R.drawable.yellow);
	        flag2 = "Yellow";
	    break;
	    case 1:
	    	b2.setImageResource(R.drawable.blue);
	        flag2 = "Blue";
	    break;
	    case 2:
	    	b2.setImageResource(R.drawable.green);
	        flag2 = "Green";
	    break;
	    case 3:
	    	b2.setImageResource(R.drawable.red);
	        flag2 = "Red";
	    break;   
    	}
    	switch(three) {
    	case 0:
	        b3.setImageResource(R.drawable.yellow);
	        flag3 = "Yellow";
	    break;
	    case 1:
	    	b3.setImageResource(R.drawable.blue);
	        flag3 = "Blue";
	    break;
	    case 2:
	    	b3.setImageResource(R.drawable.green);
	        flag3 = "Green";
	    break;
	    case 3:
	    	b3.setImageResource(R.drawable.red);
	        flag3 = "Red";
	    break;   
    	}
    	switch(four) {
    	case 0:
	        b4.setImageResource(R.drawable.yellow);
	        flag4 = "Yellow";
	    break;
	    case 1:
	    	b4.setImageResource(R.drawable.blue);
	        flag4 = "Blue";
	    break;
	    case 2:
	    	b4.setImageResource(R.drawable.green);
	        flag4 = "Green";
	    break;
	    case 3:
	    	b4.setImageResource(R.drawable.red);
	        flag4 = "Red";
	    break;   
    	}
    	switch(five) {
    	case 0:
	        b5.setImageResource(R.drawable.yellow);
	        flag5 = "Yellow";
	    break;
	    case 1:
	    	b5.setImageResource(R.drawable.blue);
	        flag5 = "Blue";
	    break;
	    case 2:
	    	b5.setImageResource(R.drawable.green);
	        flag5 = "Green";
	    break;
	    case 3:
	    	b5.setImageResource(R.drawable.red);
	        flag5 = "Red";
	    break;   
    	}
    	switch(six) {
    	case 0:
	        b6.setImageResource(R.drawable.yellow);
	        flag6 = "Yellow";
	    break;
	    case 1:
	    	b6.setImageResource(R.drawable.blue);
	        flag6 = "Blue";
	    break;
	    case 2:
	    	b6.setImageResource(R.drawable.green);
	        flag6 = "Green";
	    break;
	    case 3:
	    	b6.setImageResource(R.drawable.red);
	        flag6 = "Red";
	    break;   
    	}
    	switch(seven) {
    	case 0:
	        b7.setImageResource(R.drawable.yellow);
	        flag7 = "Yellow";
	    break;
	    case 1:
	    	b7.setImageResource(R.drawable.blue);
	        flag7 = "Blue";
	    break;
	    case 2:
	    	b7.setImageResource(R.drawable.green);
	        flag7 = "Green";
	    break;
	    case 3:
	    	b7.setImageResource(R.drawable.red);
	        flag7 = "Red";
	    break;   
    	}
    	switch(eight) {
    	case 0:
	        b8.setImageResource(R.drawable.yellow);
	        flag8 = "Yellow";
	    break;
	    case 1:
	    	b8.setImageResource(R.drawable.blue);
	        flag8 = "Blue";
	    break;
	    case 2:
	    	b8.setImageResource(R.drawable.green);
	        flag8 = "Green";
	    break;
	    case 3:
	    	b8.setImageResource(R.drawable.red);
	        flag8 = "Red";
	    break;   
    	}
    	switch(nine) {
    	case 0:
	        b9.setImageResource(R.drawable.yellow);
	        flag9 = "Yellow";
	    break;
	    case 1:
	    	b9.setImageResource(R.drawable.blue);
	        flag9 = "Blue";
	    break;
	    case 2:
	    	b9.setImageResource(R.drawable.green);
	        flag9 = "Green";
	    break;
	    case 3:
	    	b9.setImageResource(R.drawable.red);
	        flag9 = "Red";
	    break;   
    	}
    	switch(ten) {
    	case 0:
	        b10.setImageResource(R.drawable.yellow);
	        flag10 = "Yellow";
	    break;
	    case 1:
	    	b10.setImageResource(R.drawable.blue);
	        flag10 = "Blue";
	    break;
	    case 2:
	    	b10.setImageResource(R.drawable.green);
	        flag10 = "Green";
	    break;
	    case 3:
	    	b10.setImageResource(R.drawable.red);
	        flag10 = "Red";
	    break;   
    	}
    	switch(eleven) {
    	case 0:
	        b11.setImageResource(R.drawable.yellow);
	        flag11 = "Yellow";
	    break;
	    case 1:
	    	b11.setImageResource(R.drawable.blue);
	        flag11 = "Blue";
	    break;
	    case 2:
	    	b11.setImageResource(R.drawable.green);
	        flag11 = "Green";
	    break;
	    case 3:
	    	b11.setImageResource(R.drawable.red);
	        flag11 = "Red";
	    break;   
    	}
    	switch(twelve) {
    	case 0:
	        b12.setImageResource(R.drawable.yellow);
	        flag12 = "Yellow";
	    break;
	    case 1:
	    	b12.setImageResource(R.drawable.blue);
	        flag12 = "Blue";
	    break;
	    case 2:
	    	b12.setImageResource(R.drawable.green);
	        flag12 = "Green";
	    break;
	    case 3:
	    	b12.setImageResource(R.drawable.red);
	        flag12 = "Red";
	    break;   
    	}
    	switch(thirteen) {
    	case 0:
	        b13.setImageResource(R.drawable.yellow);
	        flag13 = "Yellow";
	    break;
	    case 1:
	    	b13.setImageResource(R.drawable.blue);
	        flag13 = "Blue";
	    break;
	    case 2:
	    	b13.setImageResource(R.drawable.green);
	        flag13 = "Green";
	    break;
	    case 3:
	    	b13.setImageResource(R.drawable.red);
	        flag13 = "Red";
	    break;   
    	}
    	switch(fourteen) {
    	case 0:
	        b14.setImageResource(R.drawable.yellow);
	        flag14 = "Yellow";
	    break;
	    case 1:
	    	b14.setImageResource(R.drawable.blue);
	        flag14 = "Blue";
	    break;
	    case 2:
	    	b14.setImageResource(R.drawable.green);
	        flag14 = "Green";
	    break;
	    case 3:
	    	b14.setImageResource(R.drawable.red);
	        flag14 = "Red";
	    break;   
    	}
    	switch(fifteen) {
    	case 0:
	        b15.setImageResource(R.drawable.yellow);
	        flag15 = "Yellow";
	    break;
	    case 1:
	    	b15.setImageResource(R.drawable.blue);
	        flag15 = "Blue";
	    break;
	    case 2:
	    	b15.setImageResource(R.drawable.green);
	        flag15 = "Green";
	    break;
	    case 3:
	    	b15.setImageResource(R.drawable.red);
	        flag15 = "Red";
	    break;   
    	}
    	switch(sixteen) {
    	case 0:
	        b16.setImageResource(R.drawable.yellow);
	        flag16 = "Yellow";
	    break;
	    case 1:
	    	b16.setImageResource(R.drawable.blue);
	        flag16 = "Blue";
	    break;
	    case 2:
	    	b16.setImageResource(R.drawable.green);
	        flag16 = "Green";
	    break;
	    case 3:
	    	b16.setImageResource(R.drawable.red);
	        flag16 = "Red";
	    break;   
    	}   
    	} 
    public void Need() {
    	if (needed == 0) {
    	wor.setText("Color");
    	}else if (needed == 1) {
    	wor.setText("Word");
    	}

    	if (word == 0) {
    	col.setText("Yellow");
    	}if (word == 1) {
    	col.setText("Blue");
    	}if (word == 2) {
    	col.setText("Green");
    	}else if (word == 3) {
    	col.setText("Red");
    	}

    	if (color == 0) {
    	col.setTextColor(Color.rgb(255, 255, 0));
    	ColorNeeded = "Yellow";
    	}if (color == 1) {
    	col.setTextColor(Color.rgb(0, 0, 255));
    	ColorNeeded = "Blue";
    	}if (color == 2) {
    	col.setTextColor(Color.rgb(0, 255, 0));
    	ColorNeeded = "Green";
    	}else if (color == 3) {
    	col.setTextColor(Color.rgb(255, 0, 0));
    	ColorNeeded = "Red";
    	}
    	}
    public void Law() {
    	switch(needed) {
    	    case 0:
    	        Shell = ColorNeeded;
    	    break;
    	    case 1:
    	        Shell = col.getText().toString();
    	    break;
    	}
    	}
    public void CountThem() {
    	Map = TheMap.toCharArray();
    	for (int i = 0; i < Map.length; i++) {
    	if (Map[i] == '0') {
    	    yellow++;    
    	} 
    	if (Map[i] == '1') {
    	   blue++;
    	} 
    	if (Map[i] == '2') {
    	    green++;
    	}
    	if (Map[i] == '3') {
    	    red++;
    	}
    	}
    	}
    public void Inspector() {
    	BestCombo();
    		switch(ButtonName) {
    		    case 1:
    		       if (flag1.equals(Shell)) {
    		            b1.setImageResource(0);
    		            flag1 = "";
    		            Diminisher();
    		            combo++;
    		            RightSFX();
    		        }else{ 
    		        	BestCombo();
    		        	combo = 1;
    		        	comby.setText(""+combo);
    		        	nCounter -= 5;
    		        	if (nCounter <= 0) {
    		        		nCounter = 0;
    		        		timy.setText("" + nCounter);
    		        	}
    		        	WrongSFX();
    		        }
    		    break;
    		    case 2:
    		       if (flag2.equals(Shell)) {
    		            b2.setImageResource(0);
    		            flag2 = "";
    		            Diminisher();
    		            combo++;
    		            RightSFX();
    		        }else{   
    		        	BestCombo();
    		        	combo = 1;
    		        	comby.setText(""+combo);
    		        	nCounter -= 5;
    		        	if (nCounter <= 0) {
    		        		nCounter = 0;
    		        		timy.setText("" + nCounter);
    		        	}
    		        	WrongSFX();
    		        }
    		    break;
    		    case 3:
    		       if (flag3.equals(Shell)) {
    		            b3.setImageResource(0);
    		            flag3 = "";
    		            Diminisher();
    		            combo++;
    		            RightSFX();
    		        }else{ 
    		        	BestCombo();
    		        	combo = 1;
    		        	comby.setText(""+combo);
    		        	nCounter -= 5;
    		        	if (nCounter <= 0) {
    		        		nCounter = 0;
    		        		timy.setText("" + nCounter);
    		        	}
    		        	WrongSFX();
    		        } 
    		    break;
    		    case 4:
    		       if (flag4.equals(Shell)) {
    		            b4.setImageResource(0);
    		            flag4 = "";
    		            Diminisher();
    		            combo++;
    		            RightSFX();
    		        }else{  
    		        	BestCombo();
    		        	combo = 1;
    		        	comby.setText(""+combo);
    		        	nCounter -= 5;
    		        	if (nCounter <= 0) {
    		        		nCounter = 0;
    		        		timy.setText("" + nCounter);
    		        	}
    		        	WrongSFX();
    		        }
    		    break;
    		    case 5:
    		       if (flag5.equals(Shell)) {
    		            b5.setImageResource(0);
    		            flag5 = "";
    		            Diminisher();
    		            combo++;
    		            RightSFX();
    		        }else{  
    		        	BestCombo();
    		        	combo = 1;
    		        	comby.setText(""+combo);
    		        	nCounter -= 5;
    		        	if (nCounter <= 0) {
    		        		nCounter = 0;
    		        		timy.setText("" + nCounter);
    		        	}
    		        	WrongSFX();
    		        }
    		    break;
    		    case 6:
    		       if (flag6.equals(Shell)) {
    		            b6.setImageResource(0);
    		            flag6 = "";
    		            Diminisher();
    		            combo++;
    		            RightSFX();
    		        }else{  
    		        	BestCombo();
    		        	combo = 1;
    		        	comby.setText(""+combo);
    		        	nCounter -= 5;
    		        	if (nCounter <= 0) {
    		        		nCounter = 0;
    		        		timy.setText("" + nCounter);
    		        	}
    		        	WrongSFX();
    		        }
    		    break;
    		    case 7:
    		       if (flag7.equals(Shell)) {
    		            b7.setImageResource(0);
    		            flag7 = "";
    		            Diminisher();
    		            combo++;
    		            RightSFX();
    		        }else{   
    		        	BestCombo();
    		        	combo = 1;
    		        	comby.setText(""+combo);
    		        	nCounter -= 5;
    		        	if (nCounter <= 0) {
    		        		nCounter = 0;
    		        		timy.setText("" + nCounter);
    		        	}
    		        	WrongSFX();
    		        } 
    		    break;
    		    case 8:
    		       if (flag8.equals(Shell)) {
    		            b8.setImageResource(0);
    		            flag8 = "";
    		            Diminisher();
    		            combo++;
    		            RightSFX();
    		        }else{  
    		        	BestCombo();
    		        	combo = 1;
    		        	comby.setText(""+combo);
    		        	nCounter -= 5;
    		        	if (nCounter <= 0) {
    		        		nCounter = 0;
    		        		timy.setText("" + nCounter);
    		        	}
    		        	WrongSFX();
    		        } 
    		    break;
    		    case 9:
    		       if (flag9.equals(Shell)) {
    		            b9.setImageResource(0);
    		            flag9 = "";
    		            Diminisher();
    		            combo++;
    		            RightSFX();
    		        }else{  
    		        	BestCombo();
    		        	combo = 1;
    		        	comby.setText(""+combo);
    		        	nCounter -= 5;
    		        	if (nCounter <= 0) {
    		        		nCounter = 0;
    		        		timy.setText("" + nCounter);
    		        	}
    		        	WrongSFX();
    		        } 
    		    break;
    		    case 10:
    		       if (flag10.equals(Shell)) {
    		            b10.setImageResource(0);
    		            flag10 = "";
    		            Diminisher();
    		            combo++;
    		            RightSFX();
    		        }else{  
    		        	BestCombo();
    		        	combo = 1;
    		        	comby.setText(""+combo);
    		        	nCounter -= 5;
    		        	if (nCounter <= 0) {
    		        		nCounter = 0;
    		        		timy.setText("" + nCounter);
    		        	}
    		        	WrongSFX();
    		        } 
    		    break;
    		    case 11:
    		       if (flag11.equals(Shell)) {
    		            b11.setImageResource(0);
    		            flag11 = "";
    		            Diminisher();
    		            combo++;
    		            RightSFX();
    		        }else{   
    		        	BestCombo();
    		        	combo = 1;
    		        	comby.setText(""+combo);
    		        	nCounter -= 5;
    		        	if (nCounter <= 0) {
    		        		nCounter = 0;
    		        		timy.setText("" + nCounter);
    		        	}
    		        	WrongSFX();
    		        } 
    		    break;
    		    case 12:
    		       if (flag12.equals(Shell)) {
    		            b12.setImageResource(0);
    		            flag12 = "";
    		            Diminisher();
    		            combo++;
    		            RightSFX();
    		        }else{   
    		        	BestCombo();
    		        	combo = 1;
    		        	comby.setText(""+combo);
    		        	nCounter -= 5;
    		        	if (nCounter <= 0) {
    		        		nCounter = 0;
    		        		timy.setText("" + nCounter);
    		        	}
    		        	WrongSFX();
    		        }
    		    break;
    		    case 13:
    		       if (flag13.equals(Shell)) {
    		            b13.setImageResource(0);
    		            flag13 = "";
    		            Diminisher();
    		            combo++;
    		            RightSFX();
    		        }else{ 
    		        	BestCombo();
    		        	combo = 1;
    		        	comby.setText(""+combo);
    		        	nCounter -= 5;
    		        	if (nCounter <= 0) {
    		        		nCounter = 0;
    		        		timy.setText("" + nCounter);
    		        	}
    		        	WrongSFX();
    		        } 
    		    break;
    		    case 14:
    		       if (flag14.equals(Shell)) {
    		            b14.setImageResource(0);
    		            flag14 = "";
    		            Diminisher();
    		            combo++;
    		            RightSFX();
    		        }else{   
    		        	BestCombo();
    		        	combo = 1;
    		        	comby.setText(""+combo);
    		        	nCounter -= 5;
    		        	if (nCounter <= 0) {
    		        		nCounter = 0;
    		        		timy.setText("" + nCounter);
    		        	}
    		        	WrongSFX();
    		        } 
    		    break;
    		    case 15:
     		       if (flag15.equals(Shell)) {
     		            b15.setImageResource(0);
     		            flag15 = "";
     		            Diminisher();
     		           combo++;
     		          RightSFX();
     		        }else{  
     		        	BestCombo();
     		        	combo = 1;
     		        	comby.setText(""+combo);
     		        	nCounter -= 5;
     		        	if (nCounter <= 0) {
    		        		nCounter = 0;
    		        		timy.setText("" + nCounter);
    		        	}
     		        	WrongSFX();
     		        } 
     		    break;
    		    case 16:
     		       if (flag16.equals(Shell)) {
     		            b16.setImageResource(0);
     		            flag16 = "";
     		            Diminisher();
     		           combo++;
     		          RightSFX();
     		        }else{ 
     		        	BestCombo();
     		        	combo = 1;
     		        	comby.setText(""+combo);
     		        	nCounter -= 5;
     		        	if (nCounter < 0) {
    		        		nCounter = 0;
    		        		timy.setText("" + nCounter);
    		        	}
     		        WrongSFX();
     		        } 
     		    break;
    		}
    		Refresher();
    		}
    public void Diminisher(){
    		if (Shell.equals("Yellow")) {
    		    yellow--;
    		    points = 100 * combo;
    		    score += points;
    		    scorey.setText(""+score);
    		    comby.setText(""+combo);
    		}
    		else if (Shell.equals("Blue")) {
    		    blue--;
    		    points = 100 * combo;
    		    score += points;
    		    scorey.setText(""+score);
    		    comby.setText(""+combo);
    		}
    		else if (Shell.equals("Green")) {
    		    green--;
    		    points = 100 * combo;
    		    score += points;
    		    scorey.setText(""+score);
    		    comby.setText(""+combo);
    		}
    		else if (Shell.equals("Red")) {
    		    red--;
    		    points = 100 * combo;
    		    score += points;
    		    scorey.setText(""+score);
    		    comby.setText(""+combo);
    		}
    		if (nCounter <= 0) {
        		nCounter = 0;
        	}
    		}
	public void Refresher() {
		if (yellow == 0 || red == 0 || blue == 0 || green == 0) {
		    //timer.cancel();
		    yellow = 0;
		    red = 0;
		    blue = 0;
		    green = 0; 
		        Shuffle();
		        ShowThem();
		        CountThem();
		        Need();
		        Law();
		        Refresher();
		        //MiniTimer();
		        nCounter += 3;
		        if (nCounter > 10) {
		        	nCounter = 10;
		        }
		        round++;
		        if (round >= 10 && round <= 20) {
            		delay = 900;
            		period = 900;
        	} else if (round >= 21 && round <= 45) {
        			delay = 800;
        			period = 800;
        	} else if (round >= 46 && round <= 70) {
        			delay = 700;
        			period = 700;
        	} else if (round >= 71 && round <= 95) {
        			delay = 600;
        			period = 600;
        	} else if (round >= 96) {
        		delay = 500;
        		period = 500;
        		
        	}
		}else {
		}
		}
	public void Timer() {	
		
		mTimerTask = new TimerTask() {
	        public void run() {
	                handler.post(new Runnable() {
	                        public void run() {
	                        	nCounter--;
	                        	DoneTask();
	                        	    // will update the "progress" propriety of seekbar until it reaches progress
	                        	bar.setProgress(nCounter);
	                        if (nCounter == 0 || nCounter < 0) {
	                        	nCounter = 0;
	    		        		timy.setText("" + nCounter);
	                        	mTimerTask.cancel();
	                        	Intent intent = new Intent(MainActivity.this,GameOver.class);
	                        	intent.putExtra("score", score+"");
	                        	intent.putExtra("best", bestcombo+"");
	                    		//start the second Activity
	                    		MainActivity.this.startActivity(intent);
	                        	
	                        }
	                        }
	               });
	        }};

        // public void schedule (TimerTask task, long delay, long period) 
	    t.schedule(mTimerTask, delay, period);  //  // 

	 }
	public void DoneTask() {
    	if (nCounter == 0) {
    		mTimerTask.cancel();
    	}else{
    	
    		
    		timy.setText("" + nCounter);
    		 
        	Log.d("TIMER", "TimerTask run");	
    	}
    	
    }
	
	public void BestCombo() {
		if (combo > bestcombo) {
			bestcombo = combo;
		}
	}
	public void WrongSFX() {
		MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.wrong);
    	mp.start();
    	mp.setOnCompletionListener(new OnCompletionListener() {
    	    public void onCompletion(MediaPlayer mpp) {
    	        mpp.release();

    	    };
    	});
	}
	public void RightSFX() {
		MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.right);
    	mp.start();	
    	mp.setOnCompletionListener(new OnCompletionListener() {
    	    public void onCompletion(MediaPlayer mpp) {
    	        mpp.release();

    	    };
    	});

	}
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }   
}
