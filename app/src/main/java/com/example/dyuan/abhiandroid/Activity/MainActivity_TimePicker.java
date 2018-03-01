package com.example.dyuan.abhiandroid.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.example.dyuan.abhiandroid.R;

public class MainActivity_TimePicker extends AppCompatActivity {

    TextView time;
    TimePicker simpleTimePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_timepicker);

        time = findViewById(R.id.time);
        simpleTimePicker = findViewById(R.id.simpleTimePicker);
        simpleTimePicker.setIs24HourView(false);
        simpleTimePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int hourOfDay, int minute) {
                Toast.makeText(getApplicationContext(), hourOfDay + ":" + minute, Toast.LENGTH_SHORT).show();
                time.setText("Time is: " + hourOfDay + ":" + minute);
            }
        });
    }
}
