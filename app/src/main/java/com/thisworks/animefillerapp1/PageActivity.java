package com.thisworks.animefillerapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.ArrayList;

public class PageActivity extends AppCompatActivity {

    //FUTURE add link to wiki pages in onclick event

    //global variables for views
    ImageView image;
    ListView listView;
    ListView filler;

    //separate array lists for canon and filler
    ArrayList<String> arrayList = new ArrayList<>();
    ArrayList<String> arrayList2 = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList2);
        listView = (ListView) findViewById(R.id.animeList);
        image = (ImageView) findViewById(R.id.imgDetail);
        filler = (ListView) findViewById(R.id.fillerList);

        //set series title
        TextView title = (TextView)findViewById(R.id.textView5);
        String name = getIntent().getStringExtra("name");
        title.setText(name);

        //set image
        int pic = getIntent().getIntExtra("pic", R.drawable.replace4);
        image.setImageResource(pic);

        listView.setAdapter(arrayAdapter);
        filler.setAdapter(arrayAdapter2);
        displayText();
    }

    //method for retrieving list from resources
    public void displayText(){

        String[] cEps = getIntent().getStringArrayExtra("canon");
        String[] fEps = getIntent().getStringArrayExtra("filler");

        for (int i = 0; i < cEps.length; i++){
            arrayList.add(cEps[i]);
        }
        for (int i = 0; i < fEps.length; i++){
            arrayList2.add(fEps[i]);
        }
        //Toast.makeText(PageActivity.this," "+ eps[1], Toast.LENGTH_SHORT).show();
    }

    public void toggled(View view) {
        boolean checked = ( (ToggleButton)view ).isChecked();
        if(checked){
            listView.setVisibility(View.INVISIBLE);
            filler.setVisibility(View.VISIBLE);

        }else{

            listView.setVisibility(View.VISIBLE);
            filler.setVisibility(View.INVISIBLE);
        }
    }
}