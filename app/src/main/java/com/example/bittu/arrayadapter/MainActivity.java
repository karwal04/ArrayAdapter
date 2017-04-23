package com.example.bittu.arrayadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

import adapter.UsersAdapter;
import models.User;

public class MainActivity extends AppCompatActivity {
    UsersAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdapterInitalize();


        adapter.add(new User("Mithu","house 2450 Mohali"));
        adapter.add(new User("Laddi","house 2575 Mohali"));




    }

    private void AdapterInitalize(){
        ArrayList<User> arrayOfUsers = new ArrayList<User>();
        adapter = new UsersAdapter(this, arrayOfUsers);

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this,"Clicked",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
