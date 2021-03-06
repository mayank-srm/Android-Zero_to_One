package com.mayank.androidbasics.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mayank.androidbasics.Activities.OverviewActivities;
import com.mayank.androidbasics.R;
import com.mayank.androidbasics.ServerResponse.GetOverviewCategory;

import java.util.List;

/**
 * Created by MAYANK SINGH on 23-06-2019.
 */
public class OverviewAdapter extends RecyclerView.Adapter<OverviewAdapter.ViewHolder> {

    private List<GetOverviewCategory> dataList;
    private Context context;

    public OverviewAdapter(List<GetOverviewCategory> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public OverviewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.list_overview, parent, false);
        return new OverviewAdapter.ViewHolder(listItem);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull OverviewAdapter.ViewHolder holder, final int position) {
        holder.textView_basics.setText(dataList.get(position).getName());

        holder.relativeLayout_basics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //   Toast.makeText(view.getContext(), "click on item: " + dataList.get(position).getName(), Toast.LENGTH_LONG).show();
                Intent i = new Intent(view.getContext(), OverviewActivities.class);
                i.putExtra("activity_name", dataList.get(position).getName());
                i.putExtra("description", dataList.get(position).getDescription());
                view.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final Context mcontext_basics;
        public TextView textView_basics;
        public RelativeLayout relativeLayout_basics;
        public Button button_basics;

        public ViewHolder(View itemView) {
            super(itemView);
            mcontext_basics = itemView.getContext();
            this.textView_basics = itemView.findViewById(R.id.basics_textView);
            relativeLayout_basics = itemView.findViewById(R.id.basics_relativeLayout);
            button_basics = itemView.findViewById(R.id.basics_button);
        }
    }
}
