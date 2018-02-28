package com.example.dyuan.abhiandroid.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.example.dyuan.abhiandroid.R;

public class MainActivity_ProgressBar extends AppCompatActivity {

    int progress = 0;
    ProgressBar simpleProgressBar;
    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_progressbar);

        simpleProgressBar = findViewById(R.id.simpleProgressBar);
        startButton = findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setProgressValue(progress);
            }
        });
    }

    private void setProgressValue(final int progress) {}
}
