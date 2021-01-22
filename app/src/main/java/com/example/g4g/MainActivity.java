package com.example.g4g;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private ProgressBar bar;
    private TextView loading;
    private int nilai = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Objects.requireNonNull(getSupportActionBar()).hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bar = findViewById(R.id.bar);
        loading = findViewById(R.id.loading);
        bar.setProgress(0);
        //noinspection deprecation
        @SuppressLint("HandlerLeak")
        final Handler handler = new Handler(){
            @SuppressLint("SetTextI18n")
            @Override
            public void handleMessage (Message msg){
            super.handleMessage(msg);
            loading.setText((nilai)+" %");
            if (nilai == bar.getMax()){
                startActivity(new Intent(MainActivity.this, MenuActivity.class));
                finish();
            }
            nilai++;
            }
        };

        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i=0; i<=bar.getMax();i++){
                        bar.setProgress(i);
                        handler.sendMessage(handler.obtainMessage());
                        Thread.sleep(50);
                    }
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        });
        thread.start();
    }
}

















