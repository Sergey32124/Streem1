package org.example.dz3;

public class User {
    private int year;
    private String name;
    private double sallary;

    public User(int year, String name, double sallary){
        this.year=year;
        this.name=name;
        this.sallary=sallary;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public double getSallary() {
        return sallary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSallary(double sallary) {
        this.sallary = sallary;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
