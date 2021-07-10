package com.example.myapplication48;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {


    public EarthquakeAdapter(MainActivity context, ArrayList<Earthquake> earthquakes) {

        super(context, 0, earthquakes);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Earthquake earthquake = getItem(position);
        TextView magt= (TextView) listItemView.findViewById(R.id.mag);
        magt.setText(earthquake.getMag());
        TextView loct1 = (TextView) listItemView.findViewById(R.id.loc);
        loct1.setText(earthquake.getLoc());
        TextView timet = (TextView) listItemView.findViewById(R.id.time);
        TextView timet1= (TextView) listItemView.findViewById(R.id.time1);
        String []temp=earthquake.getTime().split("  ");
        timet.setText(temp[0]);
        timet1.setText(temp[1]);
        return listItemView;
    }

}