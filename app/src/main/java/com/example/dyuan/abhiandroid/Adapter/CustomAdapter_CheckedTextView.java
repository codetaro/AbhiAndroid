package com.example.dyuan.abhiandroid.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import android.widget.Toast;

import com.example.dyuan.abhiandroid.R;

public class CustomAdapter_CheckedTextView extends BaseAdapter {
    String[] names;
    Context context;
    LayoutInflater inflater;
    String value;

    public CustomAdapter_CheckedTextView(Context context, String[] names) {
        this.context = context;
        this.names = names;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return names.length;
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
    public View getView(int position, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.list_items, null);
        final CheckedTextView simpleCheckedTextView = view.findViewById(R.id.simpleCheckedTextView);
        simpleCheckedTextView.setText(names[position]);
        simpleCheckedTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (simpleCheckedTextView.isChecked()) {
                    value = "un-Checked";
                    simpleCheckedTextView.setCheckMarkDrawable(0);
                    simpleCheckedTextView.setChecked(false);
                } else {
                    value = "Checked";
                    simpleCheckedTextView.setCheckMarkDrawable(R.drawable.checked);
                    simpleCheckedTextView.setChecked(true);
                }
                Toast.makeText(context, value, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
