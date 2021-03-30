package com.thisworks.animefillerapp1;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ListingsAdapter extends BaseAdapter {

    //FUTURE borders

    //global variables
    Context context;
    String[] series;


    //constructor
    public ListingsAdapter(Context context, String[] series){
        this.context = context;
        this.series = series;
    }

    @Override
    public int getCount() {
        return series.length;
    }

    @Override
    public Object getItem(int position) {
        return series[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //create views for each listing
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(500,200);

        TextView textView = new TextView(context);
        ImageView imageView = new ImageView(context);

        imageView.setLayoutParams(layoutParams);
        int currentImage = FillerLink.getImage(series[position]);
        textView.setText(series[position]);
        //int currentImage = FillerLink.getImage(series[position]);
        imageView.setImageResource(currentImage);
        imageView.setPadding(5,30,5,30);

        textView.setTextSize(20);
        textView.setTextColor(Color.BLACK);
        textView.setGravity(Gravity.CENTER);
        textView.setPadding(0,70,0,30);

        linearLayout.addView(imageView);
        linearLayout.addView(textView);

        return linearLayout;
    }
}
