package com.nicholasgot.citypulse.androidapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ErrorPanel extends Activity {
	
	private TextView errorTextField;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_error);

		// ADDED: navigation drawer
//        ListView drawerList = (ListView) findViewById(R.id.error_nav_list);
//        String[] osArray = { "iOS", "Linus", "OS X"};
//        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, osArray);
//        drawerList.setAdapter(adapter);
		
		errorTextField = (TextView) findViewById(R.id.errorTextField);
		
		Intent intent = getIntent();
		
		errorTextField.setText(intent.getStringExtra("Error"));
	}
}
