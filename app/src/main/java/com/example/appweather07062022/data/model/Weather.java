package com.example.appweather07062022.data.model;

/**
 * Created by pphat on 8/27/2022.
 */
public class Weather {
    private float temp;
    private float tempMin;
    private float tempMax;
    private String description;
    private long timeCurrent;
    private String icon;

    public Weather(float temp, float tempMin, float tempMax, String description, long timeCurrent, String icon) {
        this.temp = temp;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.description = description;
        this.timeCurrent = timeCurrent;
        this.icon = icon;
    }

    public Weather() {
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getTempMin() {
        return tempMin;
    }

    public void setTempMin(float tempMin) {
        this.tempMin = tempMin;
    }

    public float getTempMax() {
        return tempMax;
    }

    public void setTempMax(float tempMax) {
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
