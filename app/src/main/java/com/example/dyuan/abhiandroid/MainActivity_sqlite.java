package com.example.dyuan.abhiandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.dyuan.abhiandroid.Adapter.Message;
import com.example.dyuan.abhiandroid.Adapter.myDbAdapter;

public class MainActivity_sqlite extends AppCompatActivity {

    EditText Name, Pass, updateold, updatenew, delete;
    myDbAdapter helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sqlite);

        Name = findViewById(R.id.editName);
        Pass = findViewById(R.id.editPass);
        updateold = findViewById(R.id.editText3);
        updatenew = findViewById(R.id.editText5);
        delete = findViewById(R.id.editText6);

        helper = new myDbAdapter(this);
    }

    public void addUser(View view) {
        String t1 = Name.getText().toString();
        String t2 = Pass.getText().toString();

        if (t1.isEmpty() || t2.isEmpty()) {
            Message.message(getApplicationContext(), "Enter both Name and Password");
        } else {
            long id = helper.insertData(t1, t2);
            if (id < 0) {
                Message.message(getApplicationContext(), "Insertion Unsuccessful");
                Name.setText("");
                Pass.setText("");
            } else {
                Message.message(getApplicationContext(), "Insertion Successful");
                Name.setText("");
                Pass.setText("");
            }
        }
    }

    public void viewdata(View view) {
        String data = helper.getData();
        Message.message(this, data);
    }

    public void update(View view) {
        String u1 = updateold.getText().toString();
        String u2 = updatenew.getText().toString();

        if (u1.isEmpty() || u2.isEmpty()) {
            Message.message(getApplicationContext(), "Enter Data");
        } else {
            int a = helper.updateName(u1, u2);
            if (a < 0) {
                Message.message(getApplicationContext(), "Unsuccessful");
                updateold.setText("");
                updatenew.setText("");
            } else {
                Message.message(getApplicationContext(), "Updated");
                updateold.setText("");
                updatenew.setText("");
            }
        }
    }

    public void delete(View view) {
        String uname = delete.getText().toString();
        if (uname.isEmpty()) {
            Message.message(getApplicationContext(), "Enter Data");
        } else {
            int a = helper.delete(uname);
            if (a < 0) {
                Message.message(getApplicationContext(), "Unsuccessful");
                delete.setText("");
            } else {
                Message.message(getApplicationContext(), "DELETED");
                delete.setText("");
            }
        }
    }
}
