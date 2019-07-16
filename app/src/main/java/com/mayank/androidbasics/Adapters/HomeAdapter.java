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
import com.mayank.androidbasics.Activities.HistoryActivity;
import com.mayank.androidbasics.Activities.LayoutsActivity;
import com.mayank.androidbasics.Activities.OverviewActivity;
import com.mayank.androidbasics.Data_Handling.home_data;
import com.mayank.androidbasics.Quiz.HomeScreen;
import com.mayank.androidbasics.R;
import com.squareup.picasso.Picasso;

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
        holder.mTitle.setText(list_data_home[position].getActivity());
        Picasso.get().load(list_data_home[position].getImage()).into(holder.mmageview);
        holder.mlinearlayout.setOnClickListener(view -> {

            Intent intent = null;
            switch (position) {
                case 0:
                    intent = new Intent(view.getContext(), OverviewActivity.class);
                    break;

                case 1:
                    intent = new Intent(view.getContext(), HistoryActivity.class);
                    break;

                case 2:
                    intent = new Intent(view.getContext(), BasicsActivity.class);
                    break;

                case 3:
                    intent = new Intent(view.getContext(), LayoutsActivity.class);
                    break;

                case 4:
                    intent = new Intent(view.getContext(), HomeScreen.class);
                    break;

                case 5:
                    // intent = new Intent(view.getContext(), InterViewActivity.class);
                    Toast.makeText(view.getContext(), "Coming Soon!", Toast.LENGTH_SHORT).show();
                    break;

                case 6:
                    // intent = new Intent(view.getContext(), SampleCodesActivity.class);
                    Toast.makeText(view.getContext(), "Coming Soon!", Toast.LENGTH_SHORT).show();
                    break;
                default:
                    // intent = new Intent(view.getContext(), LoadingActivity.class);
                    Toast.makeText(view.getContext(), "Coming Soon!", Toast.LENGTH_SHORT).show();
                    break;
            }
            if (intent != null) {
                view.getContext().startActivity(intent);
            }
            // Toast.makeText(view.getContext(),"click on item: "+myListData.getActivity(),Toast.LENGTH_LONG).show();
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
