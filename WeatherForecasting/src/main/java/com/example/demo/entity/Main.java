package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Main {
    private double temp;
    private int humidity;

    @JsonProperty("temp")
    public double getTemp() {
        return temp;
    }

    @JsonProperty("temp")
    public void setTemp(double temp) {
        this.temp = temp;
    }

    public int getHumidity() {
        return humidity;
    }
    public void setHumidity(int humidity)
    {
    	this.humidity=humidity;
    }

}
