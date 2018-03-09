package com.example.dyuan.abhiandroid.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import com.example.dyuan.abhiandroid.R;

public class MainActivity_TextSwitcher extends AppCompatActivity {

    private TextSwitcher simpleTextSwitcher;
    Button btnNext;

    String[] strings = {
            "Text Switcher 1", "Text Switcher 2", "Text Switcher 3", "Text Switcher 4", "Text Switcher 5"};
    int messageCount = strings.length;
    int currentIndex = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_textswitcher);

        btnNext = findViewById(R.id.buttonNext);
        simpleTextSwitcher = findViewById(R.id.simpleTextSwitcher);
        simpleTextSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                TextView t = new TextView(MainActivity_TextSwitcher.this);
                t.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL);
                t.setTextSize(36);
                return t;
            }
        });

        Animation in = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        Animation out = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);

        simpleTextSwitcher.setInAnimation(in);
        simpleTextSwitcher.setOutAnimation(out);
        simpleTextSwitcher.setCurrentText("click on next button to switch text");

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentIndex++;
                if (currentIndex == messageCount)
                    currentIndex = 0;
                simpleTextSwitcher.setText(strings[currentIndex]);
            }
        });
    }
}
