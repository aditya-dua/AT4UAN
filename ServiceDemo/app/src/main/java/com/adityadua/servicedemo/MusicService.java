package com.adityadua.servicedemo;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by AdityaDua on 14/11/18.
 */

public class MusicService extends Service {

    MediaPlayer mp;

    @Override
    public void onCreate() {
        super.onCreate();

        mp = MediaPlayer.create(getApplicationContext(),R.raw.song);
        if(MainActivity.currentPos ==0){
            mp.start();
        }
        else{
            mp.seekTo(MainActivity.currentPos);
            mp.start();
        }


    }

    @Override
    public void onDestroy() {
        MainActivity.currentPos = mp.getCurrentPosition();
        mp.stop();
        if(MainActivity.stopSong){
            MainActivity.currentPos =0;
        }
        //super.onDestroy();

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
