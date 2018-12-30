package com.example.mohamedsallam.tourguideapp;


public class info {
    private int placename;
    private int location;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public info(int place, int loca) {
        placename = place;
        location = loca;
    }

    public info(int place, int loca, int imageResourceId) {
        placename = place;
        location = loca;
        mImageResourceId = imageResourceId;
    }

    public int getPlacename() {
        return placename;
    }

    public int getLocation() {
        return location;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
