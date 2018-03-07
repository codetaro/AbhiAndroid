package com.example.dyuan.abhiandroid.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.dyuan.abhiandroid.Adapter.CustomAdapter;
import com.example.dyuan.abhiandroid.Adapter.CustomAdapter_CheckedTextView;
import com.example.dyuan.abhiandroid.R;

public class MainActivity_CheckedTextView extends AppCompatActivity {

    String value;
    String[] superStarNames = {"John Cena", "Randy Orton", "Triple H", "Roman Reign", "Sheamus"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_checkedtextview);

        ListView listView = findViewById(R.id.listView);
        CustomAdapter_CheckedTextView customAdapter = new CustomAdapter_CheckedTextView(getApplicationContext(), superStarNames);
        listView.setAdapter(customAdapter);
    }
}
