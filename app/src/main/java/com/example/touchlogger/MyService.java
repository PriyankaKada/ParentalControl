package com.example.touchlogger;

import android.accessibilityservice.AccessibilityService;
import android.util.Log; 
import android.view.KeyEvent; 
import android.view.accessibility.AccessibilityEvent; 
import android.widget.Toast; 

public class MyService extends AccessibilityService {
	@Override
	public void onAccessibilityEvent(AccessibilityEvent event) {
		// Handle the accessibility event

		if (event.getEventType() == AccessibilityEvent.TYPE_VIEW_CLICKED) {
			System.out.println("AccessibilityEvent Clicked: " + event.getContentDescription());

		}
	}

	@Override
	public void onInterrupt() { 

	}

}
