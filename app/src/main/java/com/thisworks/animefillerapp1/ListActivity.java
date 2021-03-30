package com.thisworks.animefillerapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    //connect adapter and pass series names and drawable ints
    //pass stringName with intent
    //custom adapter for styling output in list and connecting to resource folder

    //global variable to hold series names
    String[] seriesNames;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView = (ListView) findViewById(R.id.aniList);
        seriesNames = getResources().getStringArray(R.array.series);

        //setTitle("possible use");
        ListingsAdapter listingsAdapter = new ListingsAdapter(this, seriesNames);
        listView.setAdapter(listingsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                FillerLink filler = new FillerLink(seriesNames[position].toString(), ListActivity.this);
                String[] canonList = filler.getCanonList();
                String[] fillerList = filler.getFillerList();
                int image = FillerLink.getImage(seriesNames[position].toString());

                //Toast.makeText(ListActivity.this," "+ ing, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(ListActivity.this, PageActivity.class);
                intent.putExtra("name",seriesNames[position].toString());
                intent.putExtra("canon",canonList);
                intent.putExtra("filler",fillerList);
                intent.putExtra("pic",image);
                startActivity(intent);
            }
        });
    }


}

