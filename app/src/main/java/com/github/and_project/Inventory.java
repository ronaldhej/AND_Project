package com.github.and_project;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Inventory extends Fragment {

    private InventoryViewModel mViewModel;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    public static Inventory newInstance() {
        return new Inventory();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        recyclerView = recyclerView.findViewById(R.id.inventory_recycler_view);
        recyclerView.setHasFixedSize(true);
        return inflater.inflate(R.layout.fragment_inventory, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(InventoryViewModel.class);
        // TODO: Use the ViewModel
    }



}
