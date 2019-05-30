package com.mayank.androidbasics.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.mayank.androidbasics.Sample_Code_Activity.LoadingActivity;
import com.mayank.androidbasics.Sample_Code_Activity.SumActivity;
import com.mayank.androidbasics.Data_Handling.Home_list_data;
import com.mayank.androidbasics.R;

/**
 * Created by MAYANK SINGH on 21-05-2019.
 */

public class SampleCodeAdapter extends RecyclerView.Adapter<SampleCodeAdapter.ViewHolder>{

    public   Home_list_data[] list_data_samplecode;

    public SampleCodeAdapter(Home_list_data[] list_data){
        this.list_data_samplecode  = list_data;
    }

    @NonNull
    @Override
    public SampleCodeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.list_sample_code, parent, false);
        return new ViewHolder(listItem);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull SampleCodeAdapter.ViewHolder holder, final int position) {
        final Home_list_data myListData = list_data_samplecode[position];
        holder.textView.setText(list_data_samplecode[position].getDescription());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Intent intent;
                switch (position){
                    case 0:
                        intent = new Intent(view.getContext() , SumActivity.class);
                            break;

                        default:
                            intent = new Intent(view.getContext() , LoadingActivity.class);
                            break;
                }
                view.getContext().startActivity(intent);


               Toast.makeText(view.getContext(),"click on item: "+myListData.getDescription(),Toast.LENGTH_LONG).show();
//                Intent i = new Intent(view.getContext(),MainActivity.class);
//                view.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list_data_samplecode.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public RelativeLayout relativeLayout;
        public final Context mcontext;
        ViewHolder(View itemView) {
            super(itemView);
            mcontext = itemView.getContext();
            this.textView = itemView.findViewById(R.id.home_textView);
            relativeLayout = itemView.findViewById(R.id.relativeLayout);
        }

    }
}