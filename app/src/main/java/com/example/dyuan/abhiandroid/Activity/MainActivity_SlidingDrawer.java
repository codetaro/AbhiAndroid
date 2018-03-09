package com.example.dyuan.abhiandroid.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SlidingDrawer;

import com.example.dyuan.abhiandroid.R;

public class MainActivity_SlidingDrawer extends AppCompatActivity {

    String[] nameArray = {
            "Aestro", "Blender", "Cupcake", "Donut", "Eclair", "Froyo", "GingerBread", "HoneyComb",
            "IceCream Sandwich", "JelliBean", "KitKat", "Lollipop", "MarshMallow"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_slidingdrawer);

        SlidingDrawer simpleSlidingDrawer = findViewById(R.id.simpleSlidingDrawer);
        final Button handleButton = findViewById(R.id.handle);
        ListView simpleListView = findViewById(R.id.simpleListView);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                getApplicationContext(),
                R.layout.list_item,
                R.id.name, nameArray);
        simpleListView.setAdapter(arrayAdapter);
        simpleSlidingDrawer.setOnDrawerOpenListener(new SlidingDrawer.OnDrawerOpenListener() {
            @Override
            public void onDrawerOpened() {
                handleButton.setText("Close");
            }
        });
        simpleSlidingDrawer.setOnDrawerCloseListener(new SlidingDrawer.OnDrawerCloseListener() {
            @Override
            public void onDrawerClosed() {
                handleButton.setText("Open");
            }
        });
    }
}
