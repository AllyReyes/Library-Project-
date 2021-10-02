package com.company;

public class LibertyStLibrary {
    public String secondLibrary;
    public String printOpeningHours;



    public LibertyStLibrary (String secondLibrary, String printOpeningHours) {
        this.secondLibrary = "228 Liberty St.";
        this.printOpeningHours = "Open between the hours of 9am-5pm seven days a week";
    }


    @Override
    public String toString() {
        return secondLibrary + printOpeningHours;
    }


}