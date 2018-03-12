package com.example.dyuan.abhiandroid.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import com.example.dyuan.abhiandroid.R;

public class MainActivity_oncreate extends AppCompatActivity {

    private static String TAG = "MainActivity_oncreate";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_oncreate);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState");

        EditText editText = findViewById(R.id.editText);
        CharSequence text = editText.getText();
        outState.putCharSequence("savedText", text);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState");

        TextView textView = findViewById(R.id.textView1);
        CharSequence savedText = savedInstanceState.getCharSequence("savedText");
        textView.setText(savedText);
    }
}
