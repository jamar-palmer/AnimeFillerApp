package com.thisworks.animefillerapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //TODO FIX SPLASH
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_AnimeFillerApp);
        setContentView(R.layout.activity_main);
    }

    public void createList(View view) {
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }

    //FEATURE add image buttons leading to the latest update and popular series
    //  this is manually changed with each update
    //FUTURE add tabs for more info on creator
}