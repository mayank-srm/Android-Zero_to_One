package com.mayank.androidbasics.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.mayank.androidbasics.BasicsActivity.BottomBasics;
import com.mayank.androidbasics.R;

public class BasicsDiscription extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_basics_description, container, false);
        BottomBasics activity = (BottomBasics) getActivity();
        String description = activity.getDescription();
        TextView textView = view.findViewById(R.id.textview);
        textView.setText(description);

        return view;

    }


}