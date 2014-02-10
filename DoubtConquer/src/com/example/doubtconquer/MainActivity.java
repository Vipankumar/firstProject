package com.example.doubtconquer;

import java.io.IOException;
import java.io.StringReader;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {

	XmlPullParserFactory factory;
	XmlPullParser myParser;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		try {
			factory = XmlPullParserFactory.newInstance();
			myParser = factory.newPullParser();
			myParser.setInput(new StringReader("<foo>Hello World!</foo>"));

			int eventType = myParser.getEventType();
			while (eventType != XmlPullParser.END_DOCUMENT) {
				if (eventType == XmlPullParser.START_DOCUMENT) {
					System.out.println("Start document");
				} else if (eventType == XmlPullParser.END_DOCUMENT) {
					System.out.println("End document");
				} else if (eventType == XmlPullParser.START_TAG) {
					System.out.println("Start tag " + myParser.getName());
				} else if (eventType == XmlPullParser.END_TAG) {
					System.out.println("End tag " + myParser.getName());
				} else if (eventType == XmlPullParser.TEXT) {
					System.out.println("Text " + myParser.getText());
				}
				try {
					eventType = myParser.next();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		} catch (XmlPullParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
