package com.mayank.androidbasics.Sample_Code_Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.mayank.androidbasics.R;

public class SumActivity extends AppCompatActivity {

    public EditText num1, num2;
    TextView result;
    Button calculate;
    public double sum =0 ;
    public double a = 0;
    public double b = 0;
    public boolean valid=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        result = findViewById(R.id.result);
        calculate = findViewById(R.id.calculate);

    }
    public void add(View view) {

        try {
            a = Double.parseDouble(num1.getText().toString());
            b = Double.parseDouble(num2.getText().toString());
        }
        catch(NumberFormatException e) {
            valid = false;
        }

       if(valid) {
           sum = a + b;
       }
       else {
           Toast.makeText(this,"input some number",Toast.LENGTH_SHORT).show();
       }
            result.setText(String.valueOf(sum));
        }

}
