package com.mayank.androidbasics.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mayank.androidbasics.Data_Handling.Home_list_data;
import com.mayank.androidbasics.Adapters.MyAdapter;
import com.mayank.androidbasics.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Home_list_data[] myListData = new Home_list_data[] {
                new Home_list_data("Sum of two numbers"),
                new Home_list_data("Print the Name"),
                new Home_list_data("Testing")
        };

        RecyclerView recyclerView = findViewById(R.id.home_recycle);
        MyAdapter adapter = new MyAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);



    }
}
