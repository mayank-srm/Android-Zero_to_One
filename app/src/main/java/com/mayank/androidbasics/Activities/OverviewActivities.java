package com.mayank.androidbasics.Activities;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.mayank.androidbasics.R;

public class OverviewActivities extends AppCompatActivity {

    TextView textView;
    String activityname, activitydescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview_activities);
        textView = findViewById(R.id.overview_textview);

        activityname = getIntent().getStringExtra("activity_name");
        activitydescription = getIntent().getStringExtra("description");
        textView.setText(activitydescription);
    }
}
