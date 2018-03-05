package com.example.dyuan.abhiandroid.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;

import com.example.dyuan.abhiandroid.R;

public class MainActivity_SeekBar extends AppCompatActivity {

    SeekBar customSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_seekbar);

        customSeekBar = findViewById(R.id.simpleSeekBar);
        customSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            int progressChangedValue = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                progressChangedValue = i;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity_SeekBar.this, "Seek bar progress is: " + progressChangedValue,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
