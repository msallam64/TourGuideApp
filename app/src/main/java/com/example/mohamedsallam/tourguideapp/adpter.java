package com.example.mohamedsallam.tourguideapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class adpter extends ArrayAdapter<info> {
    private int mColorResourceId;
    public adpter(Context context, ArrayList<info> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }
    @Override
    public View getView(int position, View convertView,
                        ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext())
                    .inflate(
                            R.layout.list_item, parent,
                            false);
        }
        info currentWord = getItem(position);
        TextView placename = (TextView) listItemView.findViewById(R.id.place_name);
        placename.setText(currentWord.getPlacename());
        TextView location = (TextView) listItemView.findViewById(R.id.location);
        location.setText(currentWord.getLocation());

        ImageView imageView = (ImageView) listItemView
                .findViewById(R.id.image);
        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord
                    .getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        View textContainer = listItemView.findViewById(R.id.
                text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}
