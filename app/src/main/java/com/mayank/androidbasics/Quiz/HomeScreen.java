package com.mayank.androidbasics.Quiz;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.mayank.androidbasics.Activities.HomeActivity;
import com.mayank.androidbasics.R;

import info.hoang8f.widget.FButton;

public class HomeScreen extends AppCompatActivity {


    FButton playGame, quit;
    TextView textquestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        initViews();

        playGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreen.this, MainGameActivity.class);
                startActivity(intent);
                finish();
            }
        });

        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreen.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void initViews() {
        //initialize views here
        playGame = findViewById(R.id.playGame);
        quit = findViewById(R.id.quit);
        textquestion = findViewById(R.id.tQ);

        //Typeface - this is for fonts style
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/shablagooital.ttf");
        playGame.setTypeface(typeface);
        quit.setTypeface(typeface);
        textquestion.setTypeface(typeface);
    }
}
