package com.mayank.androidbasics.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mayank.androidbasics.R;

public class HelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
    }
}
