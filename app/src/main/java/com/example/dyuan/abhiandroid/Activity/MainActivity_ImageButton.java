package com.example.dyuan.abhiandroid.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.dyuan.abhiandroid.R;

public class MainActivity_ImageButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_imagebutton);

        ImageButton simpleImageButtonHome = findViewById(R.id.simpleImageButtonHome);
        ImageButton simpleImageButtonYoutube = findViewById(R.id.simpleImageButtonYoutube);

        simpleImageButtonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Home Button", Toast.LENGTH_SHORT).show();
            }
        });
        simpleImageButtonYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Youtube Button", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
