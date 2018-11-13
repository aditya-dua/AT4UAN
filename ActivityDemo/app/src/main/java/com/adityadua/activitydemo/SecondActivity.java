package com.adityadua.activitydemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by AdityaDua on 29/10/18.
 */

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next_layout);



       // create an intent
        // intent i = new intent.....

        // 2nd  case if u want to set the ui
        // setContentView(R.layout.activity_main)
    }
}
