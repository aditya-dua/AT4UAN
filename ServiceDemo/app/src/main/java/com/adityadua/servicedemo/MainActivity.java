package com.adityadua.servicedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    static int currentPos=0;
    static boolean stopSong = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playSong (View v){

        Intent i = new Intent(MainActivity.this,MusicService.class);
        startService(i);

    }

    public void stopSong(View v){
        Intent i = new Intent(MainActivity.this,MusicService.class);
        stopSong = true;
        stopService(i);
    }

    public void pauseSong(View v){
        Intent i = new Intent(MainActivity.this,MusicService.class);

        stopService(i);
    }
}
