package com.example.dyuan.abhiandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity_ListView extends AppCompatActivity {

    ListView simpleList;
    String[] countryList = {"India", "China", "australia", "Portugle", "America", "NewZealand"};
    int[] flags = {R.drawable.india, R.drawable.china, R.drawable.australia, R.drawable.portugle,
            R.drawable.america, R.drawable.new_zealand};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_listview);

        simpleList = (ListView) findViewById(R.id.simpleListView);
        CustomAdapter_ListView customAdapter = new CustomAdapter_ListView(
                getApplicationContext(), countryList, flags);
        simpleList.setAdapter(customAdapter);
    }
}
