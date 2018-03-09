package com.example.dyuan.abhiandroid.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;

import com.example.dyuan.abhiandroid.R;

public class MainActivity_ViewStub extends AppCompatActivity {

    ViewStub simpleViewStub;
    Button showButton, hideButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_viewstub);

        simpleViewStub = findViewById(R.id.simpleViewStub);
        simpleViewStub.inflate();

        showButton = findViewById(R.id.showButton);
        hideButton = findViewById(R.id.hideButton);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpleViewStub.setVisibility(View.VISIBLE);
            }
        });
        hideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpleViewStub.setVisibility(View.GONE);
            }
        });
    }
}
