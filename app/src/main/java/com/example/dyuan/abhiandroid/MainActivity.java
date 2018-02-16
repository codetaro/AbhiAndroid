package com.example.dyuan.abhiandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView simpleList;
    String[] countryList = {"India", "China", "australia", "Portugle", "America", "NewZealand"};
    int[] flags = {R.drawable.india, R.drawable.china, R.drawable.australia, R.drawable.portugle,
            R.drawable.america, R.drawable.new_zealand};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleList = (ListView) findViewById(R.id.simpleListView);
        CustomAdapter customAdapter = new CustomAdapter(
                getApplicationContext(), countryList, flags);
        simpleList.setAdapter(customAdapter);
    }
}
