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
public class francefragment extends Fragment {


    public francefragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root=inflater.inflate(R.layout.listview,container,false);
        final ArrayList<info> item=new ArrayList<info>();
        item.add(new info(R.string.alstreest,R.string.franceloc));
        item.add(new info(R.string.place,R.string.franceloc));
        item.add(new info(R.string.efftower,R.string.franceloc));
        item.add(new info(R.string.lovmusem,R.string.franceloc));

        adpter myadpter=new adpter(getActivity(),item,R.color.cairo);
        ListView list=(ListView) root.findViewById(R.id.list);
        list.setAdapter(myadpter);
        return root;

    }

}
