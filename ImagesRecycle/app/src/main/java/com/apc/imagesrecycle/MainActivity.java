package com.apc.imagesrecycle;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.apc.imagerecycler.ImageRecyclerViewLib;

public class MainActivity extends AppCompatActivity {

    private String BASE_URL = "https://gamedata.britishcouncil.org/sites/default/files/attachment/";
    private RecyclerView rvImageRecycler;

    //String array containing url links to images.
    private final String[] image_urls = {
            BASE_URL + "number-1_1.jpg",
            BASE_URL + "number-2_1.jpg",
            BASE_URL + "number-3_1.jpg",
            BASE_URL + "number-4_1.jpg",
            BASE_URL + "number-5_1.jpg",
            BASE_URL + "number-6_1.jpg",
            BASE_URL + "number-7_0.jpg",
            BASE_URL + "number-8_1.jpg",
            BASE_URL + "number-9_1.jpg"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        ImageRecyclerViewLib.setAdapterForRecyclerView(getApplicationContext(), image_urls, rvImageRecycler);
    }



    /**
     *
     *  Initializes views for the Activity
     * */
    private void initViews() {
        rvImageRecycler = findViewById(R.id.rvImageRecycler);
        rvImageRecycler.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rvImageRecycler.setLayoutManager(layoutManager);
    }
}
