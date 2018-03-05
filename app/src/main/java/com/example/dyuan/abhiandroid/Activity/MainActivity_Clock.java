package com.example.dyuan.abhiandroid.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.DigitalClock;
import android.widget.Toast;

import com.example.dyuan.abhiandroid.R;

public class MainActivity_Clock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_clock);

        DigitalClock simpleDigitalClock = findViewById(R.id.simpleDigitalClock);
        AnalogClock simpleAnalogClock = findViewById(R.id.simpleAnalogClock);

        simpleDigitalClock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity_Clock.this, "Digital Clock", Toast.LENGTH_SHORT).show();
            }
        });
        simpleAnalogClock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity_Clock.this, "Analog Clock", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
