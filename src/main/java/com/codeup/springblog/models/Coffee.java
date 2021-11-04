package com.codeup.springblog.models;

public class Coffee {
    private String roast;
    private String origin;
    private String brand;

    public String getBrand(){
    return brand;
    }
    public Coffee() {
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Coffee(String roast, String origin) {
        this.roast = roast;
        this.origin = origin;
    }

    public String getRoast() {
        return roast;
    }

    public void setRoast(String roast) {
        this.roast = roast;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}

