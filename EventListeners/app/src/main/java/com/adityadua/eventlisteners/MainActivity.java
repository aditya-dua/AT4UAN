package com.adityadua.eventlisteners;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button chnageTextBtn,thirdWay;

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chnageTextBtn = (Button)findViewById(R.id.button2);
        textView = (TextView)findViewById(R.id.textView);
        thirdWay = (Button)findViewById(R.id.button3);
        thirdWay.setOnClickListener(this);

        // Anonymous Inner Class declaration
        chnageTextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("This is a TextView..");
            }
        });
    }

    // XML based
    public void showToastButtonClicked(View v){
        Toast.makeText(this, "Button is clicked!", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onClick(View view) {
        textView.setText("From class way");
    }
}
