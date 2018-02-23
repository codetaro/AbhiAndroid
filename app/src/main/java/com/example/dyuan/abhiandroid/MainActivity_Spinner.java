package com.example.dyuan.abhiandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity_Spinner extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] countryNames = {"India", "China", "Australia", "Portugle", "America", "New Zealand"};
    int[] flags = {
            R.drawable.india, R.drawable.china, R.drawable.australia,
            R.drawable.portugle, R.drawable.america, R.drawable.new_zealand};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_spinner);

        Spinner spinner = findViewById(R.id.simpleSpinner);
        spinner.setOnItemSelectedListener(this);

        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), flags, countryNames);
        spinner.setAdapter(customAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        Toast.makeText(getApplicationContext(), countryNames[position], Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        // TODO
    }
}
