package com.mayank.androidbasics.Activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mayank.androidbasics.Adapters.LayoutsAdapter;
import com.mayank.androidbasics.Data_Handling.home_data;
import com.mayank.androidbasics.R;

public class LayoutsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layouts);


        home_data[] myListData = new home_data[]{
                new home_data("Linear Layout"),
                new home_data("Horizontal Layout"),
                new home_data("Relative Layout"),
                new home_data("Frame Layout"),
                new home_data("Grid Layout"),
                new home_data("Constraint Layout"),
                new home_data("Table Layout"),
        };
        RecyclerView recyclerView = findViewById(R.id.layouts_recycleView);
        LayoutsAdapter adapter = new LayoutsAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
