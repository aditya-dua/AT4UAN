package com.adityadua.intentsdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by AdityaDua on 13/11/18.
 */

public class SecondActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i = getIntent();
        String userDetails = "Name :"+i.getStringExtra("uName")+" Email :"+i.getStringExtra("email");
        Toast.makeText(this, "Data Passed from previous activity is :"+userDetails, Toast.LENGTH_LONG).show();
    }
}
