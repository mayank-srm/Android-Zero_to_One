package com.mayank.androidbasics.ServerResponse;

/**
 * Created by MAYANK SINGH on 23-06-2019.
 */
public class GetBasicsCategory {
    private Integer ID;
    private String Name;
    private String Description;
    private String Java;
    private String Xml;

    public GetBasicsCategory(Integer ID, String Name, String description, String javaCode, String xmlCode) {
        this.ID = ID;
        this.Name = Name;
        this.Description = description;
        this.Java = javaCode;
        this.Xml = xmlCode;
    }

    public Integer getID() {
        return ID;
    }

    public void setId(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDesc() {
        return Description;
    }

    public void setDesc(String Description) {
        this.Name = Description;
    }

    public String getJavaCode() {
        return Java;
    }

    public void setJavaCode(String JavaCode) {
        this.Name = JavaCode;
    }

    public String getXmlCode() {
        return Xml;
    }

    public void setXmlCode(String XmlCode) {
        this.Name = XmlCode;
    }
}
