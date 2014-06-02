package com.example.wombo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class TitleScreen extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.titlescreen_layout);
		
		Thread thread1 = new Thread() {
			public void run() {
				try {
					sleep(1500);
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				finally {
					Intent intent = new Intent("com.example.wombo.CHATS");
					startActivity(intent);
					finish();
				}
			}
		};
		thread1.start();
	}
	
}
