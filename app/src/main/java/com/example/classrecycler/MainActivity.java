package com.example.classrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList <String> automobiles;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        recyclerView = findViewById(R.id.recycler_view);
        NumberAdapter adapter = new NumberAdapter(automobiles);
        recyclerView.setAdapter(adapter);


    }
    private void loadData(){
        automobiles = new ArrayList<>();
       automobiles.add("+9999999");
       automobiles.add("+999999");
       automobiles.add("+999999");
       automobiles.add("+999999");
       automobiles.add("+999999");
       automobiles.add("+999999");

    }
}