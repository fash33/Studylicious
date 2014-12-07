package com.studylicious;

import android.content.Intent;
import android.os.Bundle;

public class Splash extends HomeActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		Thread timer=new Thread(){
			public void run() {
				try{
					sleep(3000);					
				}
				catch(InterruptedException e) {
					e.printStackTrace();
					
				}
				finally{
					Intent i=new Intent("com.Studylicous.HomeActivity");
					startActivity(i);
				}
				
			}
			
		};
		timer.start();
		
		
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

}
