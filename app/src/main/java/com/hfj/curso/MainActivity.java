package com.hfj.curso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity","estoy en onCreate");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity","estoy en onstar");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity","estoy en onStop");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity","estoy en ondestroy");
    }
}
