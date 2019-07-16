package com.mayank.androidbasics.Activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.mayank.androidbasics.R;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ImageButton fb_button = findViewById(R.id.link_fb);
        ImageButton insta_button = findViewById(R.id.link_insta);
        ImageButton Linkedin_button = findViewById(R.id.link_Linkedin);

        fb_button.setOnClickListener(v -> {
            Uri uri = Uri.parse("http://www.fb.com/mayu198"); // missing 'http://' will cause crashed
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });
        insta_button.setOnClickListener(v -> {
            Uri uri = Uri.parse("https://www.instagram.com/singh.mayank_"); // missing 'http://' will cause crashed
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });
        Linkedin_button.setOnClickListener(v -> {
            Uri uri = Uri.parse("https://www.linkedin.com/in/mayank-singh-398b05143/"); // missing 'http://' will cause crashed
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}
