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

import com.mayank.androidbasics.LayoutsActivity.LayoutsActicties;
import com.mayank.androidbasics.R;
import com.mayank.androidbasics.ServerResponse.GetLayoutCategory;

import java.util.List;

/**
 * Created by MAYANK SINGH on 02-06-2019.
 */
public class LayoutsAdapter extends RecyclerView.Adapter<LayoutsAdapter.ViewHolder> {

    private List<GetLayoutCategory> dataList;
    private Context context;

    public LayoutsAdapter(List<GetLayoutCategory> dataList) {
        this.context = context;
        this.dataList = dataList;
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
        ViewHolder.textView.setText(dataList.get(position).getName());
//        ViewHolder.relativeLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                final Intent intent;
//                switch (position) {
//                    case 0:
//                        intent = new Intent(view.getContext(), SumActivity.class);
//                        break;
//
//                    case 1:
//                        intent = new Intent(view.getContext(), SumActivity.class);
//                        break;
//
//                    default:
//                        intent = new Intent(view.getContext(), LoadingActivity.class);
//                        break;
//                }
//                view.getContext().startActivity(intent);

        ViewHolder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), LayoutsActicties.class);
                i.putExtra("activity_name", dataList.get(position).getName());
                i.putExtra("description", dataList.get(position).getDescription());
                i.putExtra("Code", dataList.get(position).getCode());
                view.getContext().startActivity(i);

                Toast.makeText(view.getContext(), "click on item: " + dataList.get(position).getName(), Toast.LENGTH_LONG).show();

            }
        });

    }

    @Override
    public int getItemCount() {
        return dataList.size();
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
