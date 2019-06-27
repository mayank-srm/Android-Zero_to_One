package com.mayank.androidbasics.Activities;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mayank.androidbasics.Adapters.OverviewAdapter;
import com.mayank.androidbasics.R;
import com.mayank.androidbasics.ServerResponse.GetOverviewCategory;
import com.mayank.androidbasics.WebServices.RetrofitClientInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class OverviewActivity extends AppCompatActivity {

    public OverviewAdapter adapter;
    public RecyclerView recyclerView;
    public TextView textView;
    ProgressDialog progressDoalog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);
        progressDoalog = new ProgressDialog(OverviewActivity.this);
        progressDoalog.setMessage("Loading....");
        progressDoalog.show();
        /*Create handle for the RetrofitInstance interface*/
        RetrofitClientInterface.GetOverviewData service = RetrofitClientInterface.getRetrofitInstance().create(RetrofitClientInterface.GetOverviewData.class);
        Call<List<GetOverviewCategory>> call = service.getOverviewDetails();
        call.enqueue(new Callback<List<GetOverviewCategory>>() {
            @Override
            public void onResponse(Call<List<GetOverviewCategory>> call, Response<List<GetOverviewCategory>> response) {
                progressDoalog.dismiss();
                generateDataList(response.body());
            }

            @Override
            public void onFailure(Call<List<GetOverviewCategory>> call, Throwable t) {
                progressDoalog.dismiss();
                Toast.makeText(OverviewActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void generateDataList(List<GetOverviewCategory> Category) {
        recyclerView = findViewById(R.id.overview_recycleView);
        adapter = new OverviewAdapter(Category);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(OverviewActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}