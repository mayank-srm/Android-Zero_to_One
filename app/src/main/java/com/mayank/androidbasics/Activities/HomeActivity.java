package com.mayank.androidbasics.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.navigation.NavigationView;
import com.mayank.androidbasics.Adapters.HomeAdapter;
import com.mayank.androidbasics.Data_Handling.home_data;
import com.mayank.androidbasics.R;


public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Button closeButton;
    AlertDialog.Builder builder;
    boolean doubleBackToExitPressedOnce = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        builder = new AlertDialog.Builder(this);

        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        home_data[] myListData = new home_data[] {
                new home_data("Android OverView", "https://www.tutorialspoint.com/android/images/who_i_am.jpg"),
                new home_data("History", "https://i.ytimg.com/vi/KXi7OI2z0KQ/maxresdefault.jpg"),
                new home_data("Basics Widgets", "https://image.slidesharecdn.com/androidbasicsupdatedfeb16-180201231136/95/android-basics-updated-feb-2016-1-638.jpg?cb=1517528486"),
                new home_data("Layouts", "https://image.slidesharecdn.com/androidbasicsupdatedfeb16-180201231136/95/android-basics-updated-feb-2016-1-638.jpg?cb=1517528486"),
                new home_data("Quiz (Beta)", "https://previews.123rf.com/images/vladwel/vladwel1606/vladwel160600093/58025579-quiz-logo-with-speech-bubble-symbols-concept-of-questionnaire-show-sing-quiz-button-question-competi.jpg"),
                new home_data("Interview Questions", "https://www.firstnaukri.com/career-guidance/wp-content/uploads/2019/01/common-interview-questions-for-freshers.jpg"),
                new home_data("Sample Codes", "http://i.imgur.com/DvpvklR.png"),
                new home_data("Coming Soon", "https://img.freepik.com/free-vector/coming-soon-concept_53562-1230.jpg?size=338&ext=jpg")
        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        HomeAdapter adapter = new HomeAdapter(myListData);
        GridLayoutManager mGridLayoutManager = new GridLayoutManager(HomeActivity.this, 2);
        recyclerView.setLayoutManager(mGridLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        // int id = item.getItemId();

        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_tools) {
            Intent intent = new Intent(HomeActivity.this, AboutActivity.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}