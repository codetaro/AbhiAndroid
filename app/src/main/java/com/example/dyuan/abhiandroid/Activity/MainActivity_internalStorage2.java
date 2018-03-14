package com.example.dyuan.abhiandroid.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dyuan.abhiandroid.R;

import java.io.FileInputStream;
import java.io.IOException;

public class MainActivity_internalStorage2 extends AppCompatActivity {

    TextView getname, getpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_internal_storage2);
        getname = findViewById(R.id.getname);
        getpass = findViewById(R.id.getpass);
    }

    public void load(View view) {
        try {
            FileInputStream fileInputStream = openFileInput("Code.txt");
            int read = -1;
            StringBuffer buffer = new StringBuffer();
            while ((read = fileInputStream.read()) != -1) {
                buffer.append((char) read);
            }
            Log.d("Code", buffer.toString());
            String name = buffer.substring(0, buffer.indexOf(" "));
            String pass = buffer.substring(buffer.indexOf(" ") + 1);
            getname.setText(name);
            getpass.setText(pass);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Toast.makeText(this, "Loaded", Toast.LENGTH_SHORT).show();
    }

    public void back(View view) {
        Toast.makeText(this, "Back", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity_internalStorage.class);
        startActivity(intent);
    }
}
