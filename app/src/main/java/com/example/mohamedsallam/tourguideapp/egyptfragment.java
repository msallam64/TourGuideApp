package com.example.mohamedsallam.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class egyptfragment extends Fragment {


    public egyptfragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.listview, container,
                false);
        final ArrayList<info> item = new ArrayList<info>();
        item.add(new info(R.string.cairotower, R.string.cairoloc, R.drawable.cairotower));
        item.add(new info(R.string.alexlibrary, R.string.alexlibraryloc, R.drawable.alexlibrary));
        item.add(new info(R.string.musem, R.string.cairoloc, R.drawable.musum));
        item.add(new info(R.string.mesque, R.string.cairoloc, R.drawable.mesque));


        adpter myadpter = new adpter(getActivity(), item,
                R.color.cairo);
        ListView list = (ListView) root.findViewById(R.id.list);
        list.setAdapter(myadpter);


        return root;


    }

}
