package com.adityadua.intentsdemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // This is an example : event Listener : OnClick Listener
    public void openSecondActivity(View v){

        // Explict Intent :
        // An intent in which you tell explictly which page or applictaion is
        // to be started
        Intent i = new Intent(MainActivity.this,SecondActivity.class);
        i.putExtra("uName","Aditya");
        i.putExtra("email","aditya.dua@adityadua.com");
        startActivity(i);
    }

    public void dialCustomerCare(View v){

        // Implict Intent
        // I dont the target application
        // Dialing is an Action its not a target application
        // DIAL => Phone, Truecaller , Skype
        Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+918826665888"));
        startActivity(i);
    }

    public void callCustomerCare(View v){

        //Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+918826665888"));
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        startActivity(i);

    }
}
