package com.example.dyuan.abhiandroid.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.dyuan.abhiandroid.PrefManager;
import com.example.dyuan.abhiandroid.R;

public class HomeActivity extends AppCompatActivity {

    TextView textViewUser;
    PrefManager prefManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_home);
        setContentView(R.layout.content_home);

        prefManager = new PrefManager(this);
        textViewUser = findViewById(R.id.textViewUser);
        textViewUser.setText("Welcome " + prefManager.getEmail());
    }
}
