package com.mayank.androidbasics.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mayank.androidbasics.Activities.BasicsActivity;
import com.mayank.androidbasics.Activities.InterViewActivity;
import com.mayank.androidbasics.Activities.LayoutsActivity;
import com.mayank.androidbasics.Activities.SampleCodesActivity;
import com.mayank.androidbasics.Data_Handling.home_data;
import com.mayank.androidbasics.Quiz.HomeScreen;
import com.mayank.androidbasics.R;
import com.mayank.androidbasics.Sample_Code_Activity.LoadingActivity;

/**
 * Created by MAYANK SINGH on 01-06-2019.
 */
public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

    private home_data[] list_data_home;

    public HomeAdapter(home_data[] list_data){
        this.list_data_home  = list_data;
    }



    @NonNull
    @Override
    public HomeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.list_home, parent, false);
        return new HomeAdapter.ViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeAdapter.ViewHolder holder, @SuppressLint("RecyclerView") final int position) {

        final home_data myListData = list_data_home[position];
        holder.mTitle.setText(list_data_home[position].getActivity());
        holder.mlinearlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Intent intent;
                switch(position){
                    case 0:
                        intent = new Intent(view.getContext() , BasicsActivity.class);
                        break;

                    case 1:
                        intent = new Intent(view.getContext(), SampleCodesActivity.class);
                        break;

                    case 2:
                        intent = new Intent(view.getContext(), LayoutsActivity.class);
                        break;

                    case 3:
                        intent = new Intent(view.getContext(), InterViewActivity.class);
                        break;

                    case 4:
                        intent = new Intent(view.getContext(), HomeScreen.class);
                        break;

                    default:
                        intent = new Intent(view.getContext(), LoadingActivity.class);
                        break;
                }
                view.getContext().startActivity(intent);


                Toast.makeText(view.getContext(),"click on item: "+myListData.getActivity(),Toast.LENGTH_LONG).show();
            }
        });
    }
    @Override
    public int getItemCount() {
        return list_data_home.length;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView mTitle;
        ImageView mmageview;
        final Context mcontext;
        LinearLayout mlinearlayout;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            mTitle = itemView.findViewById(R.id.tvTitle);
            mmageview = itemView.findViewById(R.id.ivImage);
            mcontext = itemView.getContext();
            mlinearlayout = itemView.findViewById(R.id.linearlayout_home);
        }
    }
}
