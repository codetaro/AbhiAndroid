package com.example.dyuan.abhiandroid.Activity;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dyuan.abhiandroid.R;

public class MainActivity_CountDownTimer extends AppCompatActivity {

    public int counter;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_countdowntimer);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CountDownTimer(30000, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        textView.setText(String.valueOf(counter));
                        counter++;
                    }

                    @Override
                    public void onFinish() {
                        textView.setText("FINISH!!");
                    }
                }.start();
            }
        });
    }
}
