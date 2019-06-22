package com.mayank.androidbasics.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mayank.androidbasics.Data_Handling.home_data;
import com.mayank.androidbasics.R;
import com.mayank.androidbasics.Sample_Code_Activity.LoadingActivity;
import com.mayank.androidbasics.Sample_Code_Activity.SumActivity;

/**
 * Created by MAYANK SINGH on 02-06-2019.
 */
public class LayoutsAdapter extends RecyclerView.Adapter<LayoutsAdapter.ViewHolder> {


    private home_data[] list_data_layouts;

    public LayoutsAdapter(home_data[] list_data_layouts) {
        this.list_data_layouts = list_data_layouts;
    }


    @NonNull
    @Override
    public LayoutsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.list_layouts, parent, false);
        return new LayoutsAdapter.ViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull LayoutsAdapter.ViewHolder viewHolder, @SuppressLint("RecyclerView") final int position) {
        final home_data myListData = list_data_layouts[position];
        ViewHolder.textView.setText(list_data_layouts[position].getActivity());
        ViewHolder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Intent intent;
                switch (position) {
                    case 0:
                        intent = new Intent(view.getContext(), SumActivity.class);
                        break;

                    case 1:
                        intent = new Intent(view.getContext(), SumActivity.class);
                        break;

                    default:
                        intent = new Intent(view.getContext(), LoadingActivity.class);
                        break;
                }
                view.getContext().startActivity(intent);


                Toast.makeText(view.getContext(), "click on item: " + myListData.getActivity(), Toast.LENGTH_LONG).show();
//                Intent i = new Intent(view.getContext(),MainActivity.class);
//                view.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list_data_layouts.length;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        @SuppressLint("StaticFieldLeak")
        static TextView textView;
        @SuppressLint("StaticFieldLeak")
        static RelativeLayout relativeLayout;
        final Context mcontext;

        ViewHolder(View itemView) {
            super(itemView);
            mcontext = itemView.getContext();
            textView = itemView.findViewById(R.id.layout_textView);
            relativeLayout = itemView.findViewById(R.id.layout_relativeLayout);
        }
    }
}
