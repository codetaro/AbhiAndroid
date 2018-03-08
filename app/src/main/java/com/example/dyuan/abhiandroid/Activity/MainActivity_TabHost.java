package com.example.dyuan.abhiandroid.Activity;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

import com.example.dyuan.abhiandroid.R;

public class MainActivity_TabHost extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tabhost);

        TabHost tabHost = findViewById(android.R.id.tabhost);
        TabHost.TabSpec spec;
        Intent intent;

        spec = tabHost.newTabSpec("home");
        spec.setIndicator("HOME");
        intent = new Intent(this, HomeActivity.class);
        spec.setContent(intent);
        tabHost.addTab(spec);

        spec = tabHost.newTabSpec("contact");
        spec.setIndicator("CONTACT");
        intent = new Intent(this, ContactActivity.class);
        spec.setContent(intent);
        tabHost.addTab(spec);

        spec = tabHost.newTabSpec("about");
        spec.setIndicator("ABOUT");
        intent = new Intent(this, AboutActivity.class);
        spec.setContent(intent);
        tabHost.addTab(spec);

        tabHost.setCurrentTab(1);
        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                //
            }
        });
    }
}
