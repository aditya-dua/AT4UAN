package com.adityadua.asyntaskdemo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = (ProgressBar)findViewById(R.id.progressBar);
        imageView = (ImageView)findViewById(R.id.imageView);
    }

    public void loadIcon(View v){

        new LoadIconTask().execute(R.drawable.android_marshmallow);

    }

    public  void otherButton(View v) throws InterruptedException {
        Toast.makeText(this, "I am alive", Toast.LENGTH_SHORT).show();
        //Thread.sleep(10000);
    }



    // Implement threads in Android using Async Task

    // Async Task : 3 Params
    // 1) Input
    class LoadIconTask extends AsyncTask<Integer,Integer,Bitmap>{

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressBar.setVisibility(ProgressBar.VISIBLE);
        }

        @Override
        protected Bitmap doInBackground(Integer[] params) {
            Bitmap tmpImage= BitmapFactory.decodeResource(getResources(),params[0]);

            for(int i=0;i<10;i++){
                try {
                    Thread.sleep(1000);
                    publishProgress(i*10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return tmpImage;
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            progressBar.setVisibility(ProgressBar.INVISIBLE);
            imageView.setImageBitmap(bitmap);
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            progressBar.setProgress(values[0]);
        }
    }
}
