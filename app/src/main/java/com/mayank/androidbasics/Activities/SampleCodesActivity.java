package com.mayank.androidbasics.Activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mayank.androidbasics.Adapters.SampleCodeAdapter;
import com.mayank.androidbasics.Data_Handling.Home_list_data;
import com.mayank.androidbasics.R;

public class SampleCodesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_code);

        Home_list_data[] myListData = new Home_list_data[] {
                new Home_list_data("Sum of two numbers","sum","sjicsokckpos","chbsdckjsd"),
                new Home_list_data("Print the Name","str","sjicsokckpos","chbsdckjsd"),
                new Home_list_data("Testing","test","sjicsokckpos","chbsdckjsd")
        };

        RecyclerView recyclerView = findViewById(R.id.sample_code_recycleView);
        SampleCodeAdapter adapter = new SampleCodeAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);



    }
}
