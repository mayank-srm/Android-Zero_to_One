package com.mayank.androidbasics.BasicsActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.widget.TextView;

import com.mayank.androidbasics.Fragments.HomeFragment;
import com.mayank.androidbasics.Fragments.XmlFragment;
import com.mayank.androidbasics.R;

public class BasicsActivities extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basics_activities);

        loadFragment(new HomeFragment());
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(this);

        getIncomingIntent();
    }
        @SuppressLint("SetTextI18n")
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment = null;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fragment = new HomeFragment();
                    break;
                case R.id.navigation_dashboard:
                    fragment = new XmlFragment();
                    break;
                case R.id.navigation_notifications:
                    fragment = new HomeFragment();
                    break;
            }
            return loadFragment(fragment);
        }

        private boolean loadFragment(Fragment fragment){

       if(fragment !=null){
           getSupportFragmentManager()
                   .beginTransaction()
                   .replace(R.id.fragment_container,fragment)
                   .commit();

           return true;
       }
       return false;

        }

    private void getIncomingIntent(){
        if(getIntent().hasExtra("activity_name") && getIntent().hasExtra("discription")){

            String activityname = getIntent().getStringExtra("activity_name");
            String activitydiscription = getIntent().getStringExtra("discription");

            setmTextMessage(activityname,activitydiscription);

        }
    }
    private void setmTextMessage(String activityname , String activitydiscription){

        TextView actname  = findViewById(R.id.message1);
        TextView actdis  = findViewById(R.id.message2);

        actname.setText(activityname);
        actdis.setText(activitydiscription);
    }

}
