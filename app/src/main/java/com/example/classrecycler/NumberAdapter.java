package com.example.classrecycler;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Adapter;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class NumberAdapter extends RecyclerView.Adapter <AutosViewHolder> {
    public NumberAdapter() {
    }
   private ArrayList <String> automobiles;

    public NumberAdapter(ArrayList<String> automobiles) {
        this.automobiles = automobiles;
    }

    @NonNull
    @Override
    public AutosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AutosViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_name, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AutosViewHolder holder, int position) {
holder.bind(automobiles.get(position));
    }

    @Override
    public int getItemCount() {
        return automobiles.size();
    }

}

