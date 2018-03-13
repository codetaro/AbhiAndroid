package com.example.dyuan.abhiandroid.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.dyuan.abhiandroid.R;

public class MainActivity_lifecycle extends AppCompatActivity {

    private static final String HOME_ACTIVITY_TAG = MainActivity_lifecycle.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lifecycle);

        showLog("Activity created");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        showLog("Activity restarted");
    }

    @Override
    protected void onStart() {
        super.onStart();

        showLog("Activity started");
    }

    @Override
    protected void onResume() {
        super.onResume();

        showLog("Activity resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();

        showLog("Activity paused");
    }

    @Override
    protected void onStop() {
        super.onStop();

        showLog("Activity stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        showLog("Activity is being destroyed");
    }

    private void showLog(String text) {
        Log.d(HOME_ACTIVITY_TAG, text);
    }
}
