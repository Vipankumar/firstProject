package com.example.doubtconquer;

import android.app.Activity;
import android.os.Bundle;

public class TestSuper extends Activity implements MyListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		tingTong(6);
	}

	@Override
	public void tingTong(int value) {
		// TODO Auto-generated method stub

	}
}
