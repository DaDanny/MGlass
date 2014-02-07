package com.abq.helloglass;

import android.os.Bundle;
import android.app.Activity;

import com.google.android.glass.app.Card;
import com.google.android.glass.timeline.TimelineManager;
// Glass packages

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Card helloWorldCard = new Card(this);
		helloWorldCard.setText("Hello World");
		
		setContentView(helloWorldCard.toView());
		
		
	}
}
