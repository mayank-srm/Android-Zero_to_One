package com.mayank.androidbasics.ServerResponse;

/**
 * Created by MAYANK SINGH on 23-06-2019.
 */
public class GetLayoutCategory {

    private Integer ID;
    private String Name;
    private String Description;
    private String Code;

    public GetLayoutCategory(Integer ID, String Name, String description, String Code) {
        this.ID = ID;
        this.Name = Name;
        this.Description = description;
        this.Code = Code;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        Code = Code;
    }
}
