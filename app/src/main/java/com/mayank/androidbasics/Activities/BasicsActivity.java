package com.mayank.androidbasics.Activities;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mayank.androidbasics.Adapters.BasicsAdapter;
import com.mayank.androidbasics.R;
import com.mayank.androidbasics.ServerResponse.GetBasicsCategory;
import com.mayank.androidbasics.WebServices.RetrofitClientInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BasicsActivity extends AppCompatActivity {

    public BasicsAdapter adapter;
    public RecyclerView recyclerView;
    public TextView textView;
    ProgressDialog progressDoalog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basics);

        textView = findViewById(R.id.errormsg);
        progressDoalog = new ProgressDialog(BasicsActivity.this);
        progressDoalog.setMessage("Loading....");
        progressDoalog.show();
        /*Create handle for the RetrofitInstance interface*/
        RetrofitClientInterface.GetBasicsData service = RetrofitClientInterface.getRetrofitInstance().create(RetrofitClientInterface.GetBasicsData.class);
        Call<List<GetBasicsCategory>> call = service.getBasicsDetails();
        call.enqueue(new Callback<List<GetBasicsCategory>>() {
            @Override
            public void onResponse(Call<List<GetBasicsCategory>> call, Response<List<GetBasicsCategory>> response) {
                progressDoalog.dismiss();
                generateDataList(response.body());
            }

            @Override
            public void onFailure(Call<List<GetBasicsCategory>> call, Throwable t) {
                progressDoalog.dismiss();
                textView.setText(t.getMessage());
                Toast.makeText(BasicsActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void generateDataList(List<GetBasicsCategory> Category) {
        recyclerView = findViewById(R.id.basics_recycleView);
        adapter = new BasicsAdapter(Category);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(BasicsActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}