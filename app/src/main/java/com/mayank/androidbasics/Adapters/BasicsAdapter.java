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
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mayank.androidbasics.BasicsActivity.BasicsActivities;
import com.mayank.androidbasics.BasicsActivity.EditTextActivity;
import com.mayank.androidbasics.R;
import com.mayank.androidbasics.Sample_Code_Activity.LoadingActivity;
import com.mayank.androidbasics.ServerResponse.GetBasicsCategory;

import java.util.List;

/**
 * Created by MAYANK SINGH on 29-05-2019.
 */
public class BasicsAdapter extends RecyclerView.Adapter<BasicsAdapter.ViewHolder> {

    private List<GetBasicsCategory> dataList;
    private Context context;

    public BasicsAdapter(List<GetBasicsCategory> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public BasicsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.list_basics, parent, false);
        return new BasicsAdapter.ViewHolder(listItem);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull BasicsAdapter.ViewHolder holder, final int position) {
        holder.textView_basics.setText(dataList.get(position).getName());

        holder.button_basics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent intent;
                switch (position) {
                    case 0:
                        intent = new Intent(view.getContext(), EditTextActivity.class);
                        break;

                    case 1:
                        intent = new Intent(view.getContext(), LoadingActivity.class);
                        break;

                    default:
                        intent = new Intent(view.getContext(), LoadingActivity.class);
                        break;
                }
                view.getContext().startActivity(intent);
            }
        });
        holder.relativeLayout_basics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "click on item: " + dataList.get(position).getName(), Toast.LENGTH_LONG).show();
                Intent i = new Intent(view.getContext(),BasicsActivities.class);
                i.putExtra("activity_name", dataList.get(position).getName());
                i.putExtra("discription", dataList.get(position).getDesc());
                i.putExtra("javacode", dataList.get(position).getJavaCode());
                i.putExtra("xmlcode", dataList.get(position).getXmlCode());
                view.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView_basics;
        public RelativeLayout relativeLayout_basics;
        public final Context mcontext_basics;
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
