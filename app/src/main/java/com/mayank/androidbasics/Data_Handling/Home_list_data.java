package com.mayank.androidbasics.Data_Handling;

/**
 * Created by MAYANK SINGH on 22-05-2019.
 */
public class Home_list_data {

    public String description;
    public  String activityname;
   public Home_list_data(String description,String activityname) {
        this.description = description;
        this.activityname = activityname;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getActivity() {
        return activityname;
    }
    public void setActivityname(String activityname) {
        this.activityname = activityname;
    }
}
