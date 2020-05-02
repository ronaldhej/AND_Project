package com.github.and_project;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class InventoryAdapter extends RecyclerView.Adapter<InventoryAdapter.InventoryViewHolder> {
    private String[] mDataset;

    public static class InventoryViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public InventoryViewHolder(TextView v) {
            super(v);
            textView = v;
        }
    }

    public InventoryAdapter(String[] myDataSet) {
        mDataset = myDataSet;
    }


    public InventoryAdapter.InventoryViewHolder onCreateViewHolder(ViewGroup parent,
                                                                   int viewType) {
        TextView v = (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.my_text_view, parent, false);
        InventoryViewHolder vh = new InventoryViewHolder(v);
        return vh;
    }
}
