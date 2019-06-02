package com.mayank.androidbasics.Data_Handling;

import android.annotation.SuppressLint;
import android.app.Activity;

/**
 * Created by MAYANK SINGH on 02-06-2019.
 */
@SuppressLint("Registered")
public class Quiz_data extends Activity {

    private int id;
    private String question;
    private String opta;
    private String optb;
    private String optc;
    private String optd;
    private String answer;

    public Quiz_data(String q, String oa, String ob, String oc, String od, String ans) {

        question = q;
        opta = oa;
        optb = ob;
        optc = oc;
        optd = od;
        answer = ans;
    }

    public Quiz_data() {
        id = 0;
        question = "";
        opta = "";
        optb = "";
        optc = "";
        optd = "";
        answer = "";
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String q1) {
        question = q1;
    }

    public String getOptA() {
        return opta;
    }

    public void setOptA(String o1) {
        opta = o1;
    }

    public String getOptB() {
        return optb;
    }

    public void setOptB(String o2) {
        optb = o2;
    }

    public String getOptC() {
        return optc;
    }

    public void setOptC(String o3) {
        optc = o3;
    }

    public String getOptD() {
        return optd;
    }

    public void setOptD(String o4) {
        optd = o4;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String ans) {
        answer = ans;
    }

    public void setId(int i) {
        id = i;
    }


}