package com.example.dyuan.abhiandroid;

import android.Manifest;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MainActivity_sqliteImage extends AppCompatActivity {

    private int STORAGE_PERMISSION_CODE = 23;
    ImageView imageView;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sqlite_image);

        ActivityCompat.requestPermissions(
                this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, STORAGE_PERMISSION_CODE);

        imageView = findViewById(R.id.imageView);
        db = this.openOrCreateDatabase("test.db", Context.MODE_PRIVATE, null);
        db.execSQL("create table if not exists imageTb (a blob)");
    }

    public void fetchImage(View view) throws IOException {
        File folder = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) + "/demoImage.jpg");
        FileInputStream fis = new FileInputStream(folder);
        byte[] image = new byte[fis.available()];
        fis.read(image);
        ContentValues values = new ContentValues();
        values.put("a", image);
        db.insert("imageTb", null, values);
        fis.close();
        Toast.makeText(this, "Image Fetched", Toast.LENGTH_SHORT).show();
    }

    public void viewImage(View view) {
        Cursor c = db.rawQuery("select * from imageTb", null);
        if (c.moveToNext()) {
            byte[] image = c.getBlob(0);
            Bitmap bmp = BitmapFactory.decodeByteArray(image, 0, image.length);
            imageView.setImageBitmap(bmp);
            Toast.makeText(this, "Done", Toast.LENGTH_SHORT).show();
        }
    }
}
