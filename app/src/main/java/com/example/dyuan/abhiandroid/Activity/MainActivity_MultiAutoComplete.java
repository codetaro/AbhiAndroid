package com.example.dyuan.abhiandroid.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

import com.example.dyuan.abhiandroid.R;

public class MainActivity_MultiAutoComplete extends AppCompatActivity {

    String[] androidVersionNames = {
            "Aestro", "Blender", "CupCake", "Donut", "Eclair", "Froyo", "Gingerbread",
            "HoneyComb", "IceCream Sandwich", "Jellibean", "Kitkat", "Lollipop", "MarshMallow"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_multiautocomplete);

        MultiAutoCompleteTextView simpleMultiAutoCompleteTextView = findViewById(R.id.simpleMultiAutoCompleteTextView);
        ArrayAdapter<String> versionNames = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, androidVersionNames);
        simpleMultiAutoCompleteTextView.setAdapter(versionNames);
        simpleMultiAutoCompleteTextView.setThreshold(1);
        simpleMultiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}
