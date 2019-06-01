package com.mayank.androidbasics.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.mayank.androidbasics.Activities.BasicsActivity;
import com.mayank.androidbasics.Activities.SampleCodesActivity;
import com.mayank.androidbasics.Data_Handling.home_data;
import com.mayank.androidbasics.R;

/**
 * Created by MAYANK SINGH on 01-06-2019.
 */
public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

    public   home_data[] list_data_home;

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
    public void onBindViewHolder(@NonNull HomeAdapter.ViewHolder holder, final int position) {

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

                    default:
                        intent = new Intent(view.getContext() , SampleCodesActivity.class);
                        break;
                }
                view.getContext().startActivity(intent);


                Toast.makeText(view.getContext(),"click on item: "+myListData.getActivity(),Toast.LENGTH_LONG).show();
//                Intent i = new Intent(view.getContext(),MainActivity.class);
//                view.getContext().startActivity(i);
            }
        });
    }
    @Override
    public int getItemCount() {
        return list_data_home.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView mTitle;
        ImageView mmageview;
        public LinearLayout mlinearlayout;
        public final Context mcontext;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mTitle = itemView.findViewById(R.id.tvTitle);
            mmageview = itemView.findViewById(R.id.ivImage);
            mcontext = itemView.getContext();
            mlinearlayout = itemView.findViewById(R.id.linearlayout_home);
        }
    }
}
