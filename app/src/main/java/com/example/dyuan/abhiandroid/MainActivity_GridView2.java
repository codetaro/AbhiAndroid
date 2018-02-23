package com.example.dyuan.abhiandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity_GridView2 extends AppCompatActivity {

    GridView simpleList;
    ArrayList<Item> birdList = new ArrayList<Item>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_gridview2);

        simpleList = (GridView) findViewById(R.id.simpleGridView2);
        birdList.add(new Item("Bird 1", R.drawable.b1));
        birdList.add(new Item("Bird 2", R.drawable.b2));
        birdList.add(new Item("Bird 3", R.drawable.b3));
        birdList.add(new Item("Bird 4", R.drawable.b4));
        birdList.add(new Item("Bird 5", R.drawable.b5));
        birdList.add(new Item("Bird 6", R.drawable.b6));

        CustomArrayAdapter customArrayAdapter = new CustomArrayAdapter(this, R.layout.gridview2_items, birdList);
        simpleList.setAdapter(customArrayAdapter);
    }
}
