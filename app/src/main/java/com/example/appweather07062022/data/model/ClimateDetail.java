package com.example.appweather07062022.data.model;

/**
 * Created by pphat on 8/27/2022.
 */
public class ClimateDetail {
    private City city;
    private Weather weather;

    public ClimateDetail(City city, Weather weather) {
        this.city = city;
        this.weather = weather;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }
}
