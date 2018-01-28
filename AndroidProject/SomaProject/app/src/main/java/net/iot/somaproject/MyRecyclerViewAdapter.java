package net.iot.somaproject;

import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by user on 2018-01-28.
 */

public class MyRecyclerViewAdapter extends RecyclerView.Adapter{
    int[] images = new int[64];
    boolean sw = true;
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        int width = parent.getResources().getDisplayMetrics().widthPixels/8;
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item,parent,false);
        view.setLayoutParams(new LinearLayoutCompat.LayoutParams(width,width));

        for(int i=0; i<images.length; i++){
            if(i%8==0) sw = !sw;
           images[i] = sw == true ?  ((i + 1) % 2 == 0 ? R.drawable.image01 : R.drawable.image02) : ((i + 1) % 2 == 0 ? R.drawable.image02 : R.drawable.image01);
        }
        return new RowCell(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((RowCell)holder).imageView.setImageResource(images[position]);

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    private static class RowCell extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public RowCell(View view) {
            super(view);
            imageView = (ImageView)view.findViewById(R.id.reclerview_item_imageview);
        }
    }
}
