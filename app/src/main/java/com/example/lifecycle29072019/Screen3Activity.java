package com.example.lifecycle29072019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class Screen3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
        Log.d("BBB","onCreate3");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","onStart3");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","onResume3");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","onPause3");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","onStop3");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","onRestart3");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","onDestroy3");
    }
}
