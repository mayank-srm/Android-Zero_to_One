package com.mayank.androidbasics.BasicsActivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.mayank.androidbasics.R;

public class BasicsActivities extends AppCompatActivity{

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basics_activities);

    //    loadFragment(new HomeFragment());
//        BottomNavigationView navView = findViewById(R.id.nav_view);
//        navView.setOnNavigationItemSelectedListener(this);

        getIncomingIntent();
    }
//        @SuppressLint("SetTextI18n")
//        @Override
//        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//            Fragment fragment = null;
//            switch (item.getItemId()) {
//                case R.id.navigation_home:
//                    fragment = new HomeFragment();
//                    break;
//                case R.id.navigation_dashboard:
//                    fragment = new XmlFragment();
//                    break;
//                case R.id.navigation_notifications:
//                    fragment = new HomeFragment();
//                    break;
//
//        }


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

        TextView actname  = findViewById(R.id.message1);
        TextView actdis  = findViewById(R.id.message2);

        TextView javacode  = findViewById(R.id.message3);
        TextView xmlcode  = findViewById(R.id.message4);

        actname.setText(activityname);
        actdis.setText(activitydiscription);
        javacode.setText(java);
        xmlcode.setText(xml);
    }

}
