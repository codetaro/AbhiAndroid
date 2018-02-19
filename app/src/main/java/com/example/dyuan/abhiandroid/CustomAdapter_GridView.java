package com.example.dyuan.abhiandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomAdapter_GridView extends BaseAdapter {

    Context context;
    int logos[];
    LayoutInflater inflater;

    public CustomAdapter_GridView(Context applicationContext, int[] logos) {
        this.context = applicationContext;
        this.logos = logos;
        inflater = LayoutInflater.from(applicationContext);
    }

    @Override
    public int getCount() {
        return logos.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.activity_gridview, null);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        icon.setImageResource(logos[i]);
        return view;
    }
}
