package com.mayank.androidbasics.Activities;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.mayank.androidbasics.R;

public class Testing extends AppCompatActivity {

    public EditText et1 ;
    public String string1 = "Welcome : ";
    public TextView result ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing);

        et1 =  findViewById(R.id.str1);
        result  = findViewById(R.id.result_str);
    }

    @SuppressLint("SetTextI18n")
    public void rev(View view) {

        String str1 = et1.getText().toString();
        result.setText(string1+str1);
    }
}
