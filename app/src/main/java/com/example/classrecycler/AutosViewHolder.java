package com.example.classrecycler;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class AutosViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;
    public AutosViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.autos_name);

    }
   public void bind(String autos_name) {
        textView.setText(autos_name);
   }
}
