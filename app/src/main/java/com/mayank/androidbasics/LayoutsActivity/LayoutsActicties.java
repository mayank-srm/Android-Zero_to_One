package com.mayank.androidbasics.LayoutsActivity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.mayank.androidbasics.R;

public class LayoutsActicties extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layouts_acticties);
        getIncomingIntent();

    }


    private void getIncomingIntent() {
        if (getIntent().hasExtra("activity_name") && getIntent().hasExtra("discription")) {

            String activityname = getIntent().getStringExtra("activity_name");
            String activitydiscription = getIntent().getStringExtra("discription");
            String code = getIntent().getStringExtra("Code");

            setmTextMessage(activityname, activitydiscription, code);
        }
    }

    private void setmTextMessage(String activityname, String activitydiscription, String code) {

        TextView actname = findViewById(R.id.activity_name);
        TextView actdis = findViewById(R.id.activity_discription);
        TextView Code = findViewById(R.id.java_code);


        actname.setText(activityname);
        actdis.setText(code);
        Code.setText(activitydiscription);

    }
}
