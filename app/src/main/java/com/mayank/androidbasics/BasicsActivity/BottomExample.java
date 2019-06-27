package com.mayank.androidbasics.BasicsActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.mayank.androidbasics.R;

public class BottomExample extends AppCompatActivity {
    String activityname, activitydiscription, java, xml;
    private TextView mTextMessage;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(activitydiscription);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(java);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(xml);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_example);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        getIncomingIntent();
    }

    private void getIncomingIntent() {
        activityname = getIntent().getStringExtra("activity_name");
        activitydiscription = getIntent().getStringExtra("discription");
        java = getIntent().getStringExtra("javacode");
        xml = getIntent().getStringExtra("xmlcode");
        setTitle(activityname);
    }
}
