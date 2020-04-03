package com.apc.imagerecycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by Akshay on 2020-04-03
 */
public class ImageRecyclerViewLib {

    /**
     *
     * Creates ArrayList of Type ImageModel from string url array entries and returns this ArrayList.
     * */
    public static ArrayList<ImageModel> getImageListFromImageArray(String[] imageURLArray) {

        ArrayList imageList = new ArrayList<>();
        for (String image_url : imageURLArray) {
            ImageModel image = new ImageModel();
            image.setImageURL(image_url);
            imageList.add(image);
        }
        return imageList;
    }

    /**
     * 1. Converts image_urls to ArrayList of Image model.
     * 2. Sets adapter to recycler view.
     */
    public static void setAdapterForRecyclerView(Context context, String[] image_urls, RecyclerView rvImageRecycler) {
        ArrayList<ImageModel> imageList = getImageListFromImageArray(image_urls);
        RecyclerAdapter adapter = new RecyclerAdapter(imageList, context);
        rvImageRecycler.setAdapter(adapter);
    }
}
