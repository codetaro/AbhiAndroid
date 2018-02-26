package com.example.dyuan.abhiandroid.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dyuan.abhiandroid.R;

public class CustomAdapter extends BaseAdapter {
    Context context;
    int[] flags;
    String[] countryNames;
    LayoutInflater inflater;

    public CustomAdapter(Context context, int[] flags, String[] countryNames) {
        this.context = context;
        this.flags = flags;
        this.countryNames = countryNames;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return flags.length;
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
        view = inflater.inflate(R.layout.custom_spinner_items, null);
        ImageView icon = view.findViewById(R.id.imageView);
        TextView name = view.findViewById(R.id.textView);
        icon.setImageResource(flags[i]);
        name.setText(countryNames[i]);
        return view;
    }
}
