package com.example.dyuan.abhiandroid.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;

import com.example.dyuan.abhiandroid.Adapter.CustomGalleryAdapter;
import com.example.dyuan.abhiandroid.R;

public class MainActivity_Gallery extends AppCompatActivity {

    Gallery simpleGallery;
    CustomGalleryAdapter customGalleryAdapter;
    ImageView selectedImageView;

    int[] images = {
            R.drawable.image01, R.drawable.image02, R.drawable.image03, R.drawable.image04, R.drawable.image05,
            R.drawable.image06, R.drawable.image07, R.drawable.image08, R.drawable.image09, R.drawable.image10,
            R.drawable.image11, R.drawable.image12, R.drawable.image13};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_gallery);

        simpleGallery = findViewById(R.id.simpleGallery);
        selectedImageView = findViewById(R.id.selectedImageView);
        customGalleryAdapter = new CustomGalleryAdapter(getApplicationContext(), images);
        simpleGallery.setAdapter(customGalleryAdapter);
        simpleGallery.setSpacing(10);
        simpleGallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                selectedImageView.setImageResource(images[position]);
            }
        });
    }
}
