package com.example.mohamedsallam.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class germanfragment extends Fragment {


    public germanfragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root=inflater.inflate(R.layout.listview,container,false);
        final ArrayList<info> item=new ArrayList<info>();
        item.add(new info(R.string.ger1,R.string.gerloc));
        item.add(new info(R.string.ger2,R.string.gerloc));
        item.add(new info(R.string.ger3,R.string.gerloc));
        item.add(new info(R.string.ger4,R.string.gerloc));
        adpter myadpter=new adpter(getActivity(),item,R.color.cairo);
        ListView list=(ListView) root.findViewById(R.id.list);
        list.setAdapter(myadpter);
        return root;

    }

}
