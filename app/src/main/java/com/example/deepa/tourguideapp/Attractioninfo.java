package com.example.deepa.tourguideapp;

/**
 * Created by deepa on 23/04/2018.
 */

public class Attractioninfo {

    private int mTitleAttraction;

    /**
     * String resource ID for the description of the attraction
     */
    private int mDescriptionAttraction;

    /**
     * Image resource ID for the attraction
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this attraction
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Attraction object.
     *
     * @param titleAttraction       is the string resource ID for the title of the attraction
     * @param descriptionAttraction is the string resource Id for the description of the attraction
     * @param imageResourceId       is the drawable resource ID for the image associated with the word
     */
    public Attractioninfo(int titleAttraction, int descriptionAttraction, int imageResourceId) {
        mTitleAttraction = titleAttraction;
        mDescriptionAttraction = descriptionAttraction;
        mImageResourceId = imageResourceId;
    }
    /**
     * Get the string resource ID for the title of the attraction.
     */
    public int getTitleAttraction() {
        return mTitleAttraction;
    }
    /**
     * Get the string resource ID for the description of the attraction.
     */
    public int getDescriptionAttraction() {
        return mDescriptionAttraction;
    }

    /**
     * Return the image resource ID of the attraction.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this attraction;
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}



