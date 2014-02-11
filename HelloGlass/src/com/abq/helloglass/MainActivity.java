package com.abq.helloglass;

import android.os.Bundle;
import android.view.KeyEvent;
import android.app.Activity;

import com.google.android.glass.app.Card;
import com.google.android.glass.timeline.TimelineManager;
// Glass packages

public class MainActivity extends Activity {

	Card helloWorldCard;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		helloWorldCard = new Card(this);
		helloWorldCard.setText("ugli basement");
		
		setContentView(helloWorldCard.toView());
		
	}
	@Override
	public boolean onKeyDown(int keycode, KeyEvent event) {
        if (keycode == KeyEvent.KEYCODE_DPAD_CENTER) {
            // user tapped touchpad, do something
        	helloWorldCard.setText("Vijay R");
        	setContentView(helloWorldCard.toView());
            return true;
        }
        helloWorldCard.setText("Not Key Up");
        setContentView(helloWorldCard.toView());
        return false;
    }
	
	public boolean onKeyUp(int keycode, KeyEvent event) {
        if (keycode == KeyEvent.KEYCODE_DPAD_CENTER) {
            // user tapped touchpad, do something
        	helloWorldCard.setText("Danny Francken");
        	setContentView(helloWorldCard.toView());
            return true;
        }
        return false;
    }
}

