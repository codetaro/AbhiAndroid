package com.example.dyuan.abhiandroid.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.dyuan.abhiandroid.R;

public class MainActivity_onstart extends AppCompatActivity {

    final String TAG = "MainActivity_onstart";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_onstart);
        Log.i(TAG, "First onCreate() calls");
        Toast.makeText(getApplicationContext(), "First onCreate() calls", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Now onStart() calls");
        Toast.makeText(getApplicationContext(), "Now onStart() calls", Toast.LENGTH_SHORT).show();
    }
}
