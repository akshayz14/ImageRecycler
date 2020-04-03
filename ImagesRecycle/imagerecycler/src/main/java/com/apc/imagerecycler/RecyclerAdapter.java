package com.apc.imagerecycler;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Akshay on 2020-04-02
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ImageViewHolder> {
    private ArrayList<ImageModel> mImageArrayList;
    private Context mContext;


    public RecyclerAdapter(ArrayList<ImageModel> mImageArrayList, Context context) {
        this.mImageArrayList = mImageArrayList;
        this.mContext = context;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_layout, viewGroup, false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder viewHolder, int i) {
        Picasso.get().load(mImageArrayList.get(i).getImageURL()).resize(140, 80).into(viewHolder.ivImage);
    }

    @Override
    public int getItemCount() {
        return mImageArrayList.size();
    }

    public class ImageViewHolder extends RecyclerView.ViewHolder {
        public ImageView ivImage;

        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            ivImage = itemView.findViewById(R.id.ivImage);
        }
    }
}
