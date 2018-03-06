package com.example.dyuan.abhiandroid.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ZoomControls;

import com.example.dyuan.abhiandroid.R;

public class MainActivity_ZoomControls extends AppCompatActivity {

    ImageView image;
    ZoomControls simpleZoomControls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_zoomcontrols);

        image = findViewById(R.id.image);
        simpleZoomControls = findViewById(R.id.simpleZoomControl);
        simpleZoomControls.hide();

        image.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                simpleZoomControls.show();
                return false;
            }
        });
        simpleZoomControls.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float x = image.getScaleX();
                float y = image.getScaleY();
                image.setScaleX((float) (x + 1));
                image.setScaleY((float) (y + 1));

                Toast.makeText(getApplicationContext(), "Zoom In", Toast.LENGTH_SHORT).show();
                simpleZoomControls.hide();
            }
        });
        simpleZoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float x = image.getScaleX();
                float y = image.getScaleY();
                image.setScaleX((float) (x - 1));
                image.setScaleY((float) (y - 1));

                Toast.makeText(getApplicationContext(), "Zoom Out", Toast.LENGTH_SHORT).show();
                simpleZoomControls.hide();
            }
        });
    }
}
