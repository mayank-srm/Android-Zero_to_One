package com.mayank.androidbasics.Data_Handling;

/**
 * Created by MAYANK SINGH on 22-05-2019.
 */
public class Home_list_data {

    public String description;
    public  String activityname;
    public  String javacode;
    public  String xmlcode;
   public Home_list_data(String activityname,String description, String javacode,String xmlcode) {
        this.activityname = activityname;
        this.description = description;
        this.javacode = javacode;
        this.xmlcode = xmlcode;
    }
    public String getDescription() {
        return description;
    }

    public String getActivity() {
        return activityname;
    }

    public  String getJavacod(){
        return javacode;
   }

    public  String getXmlcode(){
       return xmlcode;
    }
}

