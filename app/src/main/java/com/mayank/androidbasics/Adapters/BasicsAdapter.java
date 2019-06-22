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
import com.mayank.androidbasics.BasicsActivity.EditText;
import com.mayank.androidbasics.Data_Handling.Home_list_data;
import com.mayank.androidbasics.R;
import com.mayank.androidbasics.Sample_Code_Activity.LoadingActivity;

/**
 * Created by MAYANK SINGH on 29-05-2019.
 */
public class BasicsAdapter extends RecyclerView.Adapter<BasicsAdapter.ViewHolder> {
    public   Home_list_data[] list_data_basics;

    public BasicsAdapter(Home_list_data[] list_data){
        this.list_data_basics  = list_data;
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
        final Home_list_data myListData = list_data_basics[position];
        holder.textView_basics.setText(list_data_basics[position].getActivity());


        //  holder.textView_2.setText(myListData.getDescription());


        holder.button_basics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent intent;
                switch (position) {
                    case 0:
                        intent = new Intent(view.getContext(), EditText.class);
                        break;

                    case 1:
                        intent = new Intent(view.getContext(), BasicsActivities.class);
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

//                final Intent intent;
//                switch (position){
//                    case 0:
//                        intent = new Intent(view.getContext() , EditTextActivity.class);
//                        break;
//
//                    case 1:
//                        intent = new Intent(view.getContext() , BasicsActivities.class);
//                        break;
//                    default:
//                        intent = new Intent(view.getContext() , LoadingActivity.class);
//                        break;
//                }
//                view.getContext().startActivity(intent);


                Toast.makeText(view.getContext(),"click on item: "+myListData.getActivity(),Toast.LENGTH_LONG).show();
                Intent i = new Intent(view.getContext(),BasicsActivities.class);
                i.putExtra("activity_name",myListData.getActivity());
                i.putExtra("discription",myListData.getDescription());
                i.putExtra("javacode",myListData.getJavacod());
                i.putExtra("xmlcode",myListData.getXmlcode());
                view.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list_data_basics.length;
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
            //    textView_2 = itemView.findViewById(R.id.basics_button);
            button_basics = itemView.findViewById(R.id.basics_button);
        }


    }
}
