package com.mayank.androidbasics.Data_Handling;

/**
 * Created by MAYANK SINGH on 01-06-2019.
 */
public class home_data {

    public  String activityname;
    public String imagelink;

    public home_data(String activityname, String image) {
        this.activityname = activityname;
        this.imagelink = image;
    }
    public String getActivity() {
        return activityname;
    }

    public String getImage() {
        return imagelink;
    }
}