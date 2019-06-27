package com.mayank.androidbasics.Activities;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mayank.androidbasics.Adapters.LayoutsAdapter;
import com.mayank.androidbasics.R;
import com.mayank.androidbasics.ServerResponse.GetLayoutCategory;
import com.mayank.androidbasics.WebServices.RetrofitClientInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LayoutsActivity extends AppCompatActivity {

    public LayoutsAdapter adapter;
    public RecyclerView recyclerView;
    ProgressDialog progressDoalog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layouts);

        progressDoalog = new ProgressDialog(LayoutsActivity.this);
        progressDoalog.setMessage("Loading....");
        progressDoalog.show();
        /*Create handle for the RetrofitInstance interface*/
        RetrofitClientInterface.GetLayoutData service = RetrofitClientInterface.getRetrofitInstance().create(RetrofitClientInterface.GetLayoutData.class);
        Call<List<GetLayoutCategory>> call = service.getLayoutsDetails();
        call.enqueue(new Callback<List<GetLayoutCategory>>() {
            @Override
            public void onResponse(Call<List<GetLayoutCategory>> call, Response<List<GetLayoutCategory>> response) {
                progressDoalog.dismiss();
                generateDataList(response.body());
            }

            @Override
            public void onFailure(Call<List<GetLayoutCategory>> call, Throwable t) {
                progressDoalog.dismiss();
                Toast.makeText(LayoutsActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void generateDataList(List<GetLayoutCategory> Category) {
        recyclerView = findViewById(R.id.layouts_recycleView);
        adapter = new LayoutsAdapter(Category);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(LayoutsActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}