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
public class Museum extends Fragment {
    public Museum() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.detail_list, container, false);

        ArrayList<Detail> detail = new ArrayList<Detail>();
        detail.add(new Detail(R.string.museum1, R.string.museum1_info, R.drawable.lacma));
        detail.add(new Detail(R.string.museum2, R.string.museum2_info, R.drawable.labreatarpits));
        detail.add(new Detail(R.string.museum3, R.string.museum3_info, R.drawable.hummer));
        detail.add(new Detail(R.string.museum4, R.string.museum4_info, R.drawable.moca));
        detail.add(new Detail(R.string.museum5, R.string.museum5_info, R.drawable.thebroad));

        Detail_adapter detail_adapter = new Detail_adapter( getActivity(), detail);
        ListView listView = (ListView) rootview.findViewById(R.id.list);
        listView.setAdapter(detail_adapter);
        return rootview;
    }
}

