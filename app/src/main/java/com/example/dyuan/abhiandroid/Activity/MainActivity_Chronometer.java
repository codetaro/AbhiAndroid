package com.example.dyuan.abhiandroid.Activity;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

import com.example.dyuan.abhiandroid.R;

public class MainActivity_Chronometer extends AppCompatActivity {

    Chronometer simpleChronometer;
    Button start, stop, restart, setFormat, clearFormat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_chronometer);

        simpleChronometer = findViewById(R.id.simpleChronometer);
        start = findViewById(R.id.startButton);
        stop = findViewById(R.id.stopButton);
        restart = findViewById(R.id.restartButton);
        setFormat = findViewById(R.id.setFormat);
        clearFormat = findViewById(R.id.clearFormat);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                simpleChronometer.start();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                simpleChronometer.stop();
            }
        });
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                simpleChronometer.setBase(SystemClock.elapsedRealtime());
            }
        });
        setFormat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                simpleChronometer.setFormat("Time (%s)");
            }
        });
        clearFormat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                simpleChronometer.setFormat(null);
            }
        });
    }
}
