package com.example.appweather07062022.data.model;

/**
 * Created by pphat on 8/27/2022.
 */
public class Weather {
    private double temp;
    private double tempMin;
    private double tempMax;
    private String description;
    private long timeCurrent;
    private String icon;

    public Weather(double temp, double tempMin, double tempMax, String description, long timeCurrent, String icon) {
        this.temp = temp;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.description = description;
        this.timeCurrent = timeCurrent;
        this.icon = icon;
    }

    public Weather() {
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getTempMin() {
        return tempMin;
    }

    public void setTempMin(double tempMin) {
        this.tempMin = tempMin;
    }

    public double getTempMax() {
        return tempMax;
    }

    public void setTempMax(double tempMax) {
        this.tempMax = tempMax;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getTimeCurrent() {
        return timeCurrent;
    }

    public void setTimeCurrent(long timeCurrent) {
        this.timeCurrent = timeCurrent;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
