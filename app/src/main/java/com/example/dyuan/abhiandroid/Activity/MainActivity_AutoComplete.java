package com.example.dyuan.abhiandroid.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.example.dyuan.abhiandroid.R;

public class MainActivity_AutoComplete extends AppCompatActivity {

    String[] countryNameList = {"India", "China", "Australia", "New Zealand", "England", "Pakistan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_autocomplete);

        AutoCompleteTextView simpleAutoCompleteTextView = findViewById(R.id.simpleAutoCompleteTextView);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, countryNameList);

        simpleAutoCompleteTextView.setAdapter(adapter);
        simpleAutoCompleteTextView.setThreshold(1);
    }
}
