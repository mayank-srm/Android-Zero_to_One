package com.mayank.androidbasics.BasicsActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.mayank.androidbasics.Fragments.BasicsDiscription;
import com.mayank.androidbasics.Fragments.BasicsJava;
import com.mayank.androidbasics.Fragments.BasicsXml;
import com.mayank.androidbasics.R;

public class BottomBasics extends AppCompatActivity {
    String activityname, activitydescription, java, xml;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = item -> {
        Fragment fragment = null;

        switch (item.getItemId()) {
            case R.id.navigation_home:
                fragment = new BasicsDiscription();
                break;
            case R.id.navigation_dashboard:
                fragment = new BasicsJava();
                break;
            case R.id.navigation_notifications:
                fragment = new BasicsXml();
                break;
        }
        return loadFragment(fragment);
    };

    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_basics);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        getIncomingIntent();

        loadFragment(new BasicsDiscription());

    }

    private void getIncomingIntent() {
        activityname = getIntent().getStringExtra("activity_name");
        activitydescription = getIntent().getStringExtra("description");
        java = getIntent().getStringExtra("javacode");
        xml = getIntent().getStringExtra("xmlcode");
        setTitle(activityname);
    }

    public String getDescription() {
        return activitydescription;
    }

    public String getJava() {
        return java;
    }

    public String getXml() {
        return xml;
    }

}
