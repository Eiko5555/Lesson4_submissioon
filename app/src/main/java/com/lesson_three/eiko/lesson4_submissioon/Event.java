package com.lesson_three.eiko.lesson4_submissioon;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by eiko on 11/14/2016.
 */
public class Event extends Fragment {

    public Event(){}

    @Nullable    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.detail_list, container, false);

        ArrayList<Detail> detail = new ArrayList<Detail>();
        detail.add(new Detail(R.string.event1, R.string.event1_info));
        detail.add(new Detail(R.string.event2, R.string.event2_info));
        detail.add(new Detail(R.string.event3, R.string.event3_info));
        detail.add(new Detail(R.string.event4, R.string.event4_info));
        detail.add(new Detail(R.string.event5, R.string.event5_info));

        Detail_adapter detail_adapter = new Detail_adapter( getActivity(), detail);
        ListView listView = (ListView)rootview.findViewById(R.id.list);
        listView.setAdapter(detail_adapter);
        return rootview;
    }
}
