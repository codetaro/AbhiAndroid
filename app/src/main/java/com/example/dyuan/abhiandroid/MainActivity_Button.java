package com.example.dyuan.abhiandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity_Button extends AppCompatActivity {

    Button simpleButton1, simpleButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button);

        simpleButton1 = findViewById(R.id.simpleButton1);
        simpleButton2 = findViewById(R.id.simpleButton2);

        simpleButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Simple Button 1", Toast.LENGTH_SHORT).show();
            }
        });
        simpleButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Simple Button 2", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
