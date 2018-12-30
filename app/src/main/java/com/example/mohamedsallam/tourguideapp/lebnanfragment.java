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
public class lebnanfragment extends Fragment {


    public lebnanfragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root=inflater.inflate(R.layout.listview,container,false);
        final ArrayList<info> item=new ArrayList<info>();
        item.add(new info(R.string.leb1,R.string.leb1loc));
        item.add(new info(R.string.leb2,R.string.leb2loc));
        item.add(new info(R.string.leb3,R.string.leb3loc));
        item.add(new info(R.string.leb4,R.string.leb4loc));

        adpter myadpter=new adpter(getActivity(),item,R.color.cairo);
        ListView list=(ListView) root.findViewById(R.id.list);
        list.setAdapter(myadpter);
        return root;

    }

}
