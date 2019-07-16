package com.mayank.androidbasics.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.mayank.androidbasics.BasicsActivity.BottomBasics;
import com.mayank.androidbasics.R;

public class BasicsXml extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_basics_xml, container, false);
        BottomBasics activity = (BottomBasics) getActivity();
        String xmlcode = activity.getXml();
        TextView textView = view.findViewById(R.id.textview);
        textView.setText(xmlcode);

        return view;
    }


}
