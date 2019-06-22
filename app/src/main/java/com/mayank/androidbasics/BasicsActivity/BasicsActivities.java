package com.mayank.androidbasics.BasicsActivity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.mayank.androidbasics.R;

public class BasicsActivities extends AppCompatActivity {

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basics_activities);
        getIncomingIntent();
    }


    private void getIncomingIntent(){
        if(getIntent().hasExtra("activity_name") && getIntent().hasExtra("discription")){

            String activityname = getIntent().getStringExtra("activity_name");
            String activitydiscription = getIntent().getStringExtra("discription");

            String java = getIntent().getStringExtra("javacode");
            String xml = getIntent().getStringExtra("xmlcode");

            setmTextMessage(activityname,activitydiscription,java,xml);

        }
    }
    private void setmTextMessage(String activityname , String activitydiscription,String java , String xml){

        TextView actname  = findViewById(R.id.activity_name);
        TextView actdis  = findViewById(R.id.activity_discription);
        TextView javacode  = findViewById(R.id.java_code);
        TextView xmlcode  = findViewById(R.id.xml_code);

        actname.setText(activityname);
        actdis.setText(activitydiscription);
        javacode.setText(java);
        xmlcode.setText(xml);

      //  javacode.setMovementMethod(new ScrollingMovementMethod());
    }

}
