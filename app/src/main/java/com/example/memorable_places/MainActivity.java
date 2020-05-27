package com.example.memorable_places;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView); //connects listview

        ArrayList<String> places = new ArrayList<String>(); // create a new arraylist

        places.add("Add a new place..."); // adding a string into places arraylist

        // creating a new arrayAdapter and adding places arraylisti into this
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, places);
        
    }
}
