package com.example.dyuan.abhiandroid.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.example.dyuan.abhiandroid.Adapter.CustomListAdapter;
import com.example.dyuan.abhiandroid.ChildInfo;
import com.example.dyuan.abhiandroid.GroupInfo;
import com.example.dyuan.abhiandroid.R;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class MainActivity_ExpandableListView extends AppCompatActivity {

    private LinkedHashMap<String, GroupInfo> subjects = new LinkedHashMap<String, GroupInfo>();
    private ArrayList<GroupInfo> deptList = new ArrayList<GroupInfo>();

    private CustomListAdapter listAdapter;
    private ExpandableListView simpleExpandableListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__expandablelistview);

        loadData();

        simpleExpandableListView = findViewById(R.id.simpleExpandableListView);
        listAdapter = new CustomListAdapter(MainActivity_ExpandableListView.this, deptList);
        simpleExpandableListView.setAdapter(listAdapter);

        expandAll();

        simpleExpandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View view, int groupPosition, int childPosition, long id) {
                GroupInfo headerInfo = deptList.get(groupPosition);
                ChildInfo detailInfo = headerInfo.getProductList().get(childPosition);
                Toast.makeText(getBaseContext(), " Clicked on :: " + headerInfo.getName() + "/" + detailInfo.getName(),
                        Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        simpleExpandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View view, int groupPosition, long id) {
                GroupInfo headerInfo = deptList.get(groupPosition);
                Toast.makeText(getBaseContext(), " Header is :: " + headerInfo.getName(),
                        Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }

    private void loadData() {

        addProduct("Android", "ListView");
        addProduct("Android", "ExpandableListView");
        addProduct("Android", "GridView");

        addProduct("Java", "PolyMorphism");
        addProduct("Java", "Collections");
    }

    private int addProduct(String department, String product) {

        int groupPosition = 0;

        GroupInfo headerInfo = subjects.get(department);
        if (headerInfo == null) {
            headerInfo = new GroupInfo();
            headerInfo.setName(department);
            subjects.put(department, headerInfo);
            deptList.add(headerInfo);
        }

        ArrayList<ChildInfo> productList = headerInfo.getProductList();
        int listSize = productList.size();
        listSize++;

        ChildInfo detailInfo = new ChildInfo();
        detailInfo.setSequence(String.valueOf(listSize));
        detailInfo.setName(product);
        productList.add(detailInfo);
        headerInfo.setProductList(productList);

        groupPosition = deptList.indexOf(headerInfo);
        return groupPosition;
    }

    private void expandAll() {
        int count = listAdapter.getGroupCount();
        for (int i = 0; i < count; i++) {
            simpleExpandableListView.expandGroup(i);
        }
    }

    private void collapseAll() {
        int count = listAdapter.getGroupCount();
        for (int i = 0; i < count; i++) {
            simpleExpandableListView.collapseGroup(i);
        }
    }
}
