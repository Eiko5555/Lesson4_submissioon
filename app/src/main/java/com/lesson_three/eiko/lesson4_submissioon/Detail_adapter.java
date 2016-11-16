package com.lesson_three.eiko.lesson4_submissioon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by eiko on 11/15/2016.
 */
public class Detail_adapter extends ArrayAdapter<Detail> {
    public Detail_adapter(Context context, ArrayList<Detail> detail) {
        super(context, 0, detail);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemview = convertView;
        if (listItemview == null) {
            listItemview = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

            Detail currnetDetail = getItem(position);
            TextView textViewName = (TextView) listItemview.
                    findViewById(R.id.textview1);
            textViewName.setText(currnetDetail.getmInformation());

            TextView textViewLocationInfo = (TextView) listItemview.
                    findViewById(R.id.textview2);
            textViewLocationInfo.setText(currnetDetail.getmLocationInfo());

            ImageView imageview = (ImageView) listItemview.
                    findViewById(R.id.image);
            if (currnetDetail.hasImage()) {
                imageview.setImageResource(currnetDetail.getmImage());
                imageview.setVisibility(View.VISIBLE);
            } else
                imageview.setVisibility(View.GONE);
        }
        return listItemview;
    }
}
