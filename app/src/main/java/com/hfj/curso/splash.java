package com.hfj.curso;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by 213382697 on 18/02/2017.
 */

public class splash extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitysplash);

        Thread thread = new Thread(){
            @Override
            public void run() {
                super.run();
                    try {
                        sleep(3500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }finally {
                        Intent intent = new Intent(splash.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
            };
        thread.start();
        }
    }

