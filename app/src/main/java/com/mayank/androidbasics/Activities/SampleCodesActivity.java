package com.mayank.androidbasics.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mayank.androidbasics.Data_Handling.Home_list_data;
import com.mayank.androidbasics.Adapters.SampleCodeAdapter;
import com.mayank.androidbasics.R;

public class SampleCodesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_code);

        Home_list_data[] myListData = new Home_list_data[] {
                new Home_list_data("Sum of two numbers","sum"),
                new Home_list_data("Print the Name","str"),
                new Home_list_data("Testing","test")
        };

        RecyclerView recyclerView = findViewById(R.id.sample_code_recycleView);
        SampleCodeAdapter adapter = new SampleCodeAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);



    }
}
