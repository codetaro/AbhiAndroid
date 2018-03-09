package com.example.dyuan.abhiandroid.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SearchView;

import com.example.dyuan.abhiandroid.Adapter.ListViewAdapter;
import com.example.dyuan.abhiandroid.AnimalNames;
import com.example.dyuan.abhiandroid.R;

import java.util.ArrayList;

public class MainActivity_SearchView extends AppCompatActivity implements SearchView.OnQueryTextListener {

    SearchView editsearch;
    ListView list;
    ListViewAdapter adapter;

    String[] animalNamesList;
    ArrayList<AnimalNames> arraylist = new ArrayList<AnimalNames>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_searchview);

        animalNamesList = new String[]{"Lion", "Tiger", "Dog", "Cat", "Tortoise", "Rat", "Elephant", "Fox", "Cow", "Donkey", "Monkey"};
        list = findViewById(R.id.listview);
        for (int i = 0; i < animalNamesList.length; i++) {
            AnimalNames animalNames = new AnimalNames(animalNamesList[i]);
            arraylist.add(animalNames);
        }

        adapter = new ListViewAdapter(this, arraylist);
        list.setAdapter(adapter);

        editsearch = findViewById(R.id.search);
        editsearch.setOnQueryTextListener(this);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        String text = newText;
        adapter.filter(text);
        return false;
    }
}
