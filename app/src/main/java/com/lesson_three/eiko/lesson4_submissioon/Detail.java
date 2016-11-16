package com.lesson_three.eiko.lesson4_submissioon;

/**
 * Created by eiko on 11/15/2016.
 */
public class Detail {
    private static final int NO_IMAGE = -1;
    private int mName;
    private int mLocationInfo;
    private int mImage = NO_IMAGE;

    public Detail(int name, int locationInfo) {
        mName = name;
        mLocationInfo = locationInfo;
    }

    public Detail(int name, int lcationInfo, int image) {
        mName = name;
        mLocationInfo = lcationInfo;
        mImage = image;
    }

    public int getmInformation() {
        return mName;
    }

    public int getmLocationInfo() {
        return mLocationInfo;
    }

    public int getmImage() {
        return mImage;
    }

    public boolean hasImage() {
        return mImage != NO_IMAGE;
    }
}
