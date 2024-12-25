package com.company.structural.adapter;

/*
* An existing class used in our system
* Adaptee
* */
public class Employee {
    private String fullName;
    private String jobTitle;
    private String getFullName;
    private String officeLocation;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getGetFullName() {
        return getFullName;
    }

    public void setGetFullName(String getFullName) {
        this.getFullName = getFullName;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }
}
