package com.example.dyuan.abhiandroid.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dyuan.abhiandroid.R;

import org.w3c.dom.Text;

public class MainActivity_toast extends AppCompatActivity {

    Button simpleToast, customToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_toast);

        simpleToast = findViewById(R.id.simpleToast);
        customToast = findViewById(R.id.customToast);

        simpleToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Simple Toast in Android", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();
            }
        });
        customToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(
                        R.layout.custom_toast_layout, (ViewGroup) findViewById(R.id.toast_layout_root));
                TextView toastTextView = layout.findViewById(R.id.toastTextView);
                ImageView toastImageView = layout.findViewById(R.id.toastImageView);
                toastTextView.setText("Custom Toast in Android");
                toastImageView.setImageResource(R.drawable.ic_launcher);

                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(layout);
                toast.show();
            }
        });
    }
}
