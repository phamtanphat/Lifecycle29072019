package com.example.lifecycle29072019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class Screen2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        Log.d("BBB","onCreate2");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","onStart2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","onResume2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","onPause2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","onStop2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","onRestart2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","onDestroy2");
    }
}
