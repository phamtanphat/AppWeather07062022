package com.example.appweather07062022.data.remote.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by pphat on 8/27/2022.
 */
public class SearchDTO {
    private CoordDTO coord;
    private List<WeatherDTO> weather;
    private MainDTO main;
    @SerializedName("dt")
    private int timeCurrent;
    private SysDTO sys;
    private String name;

    public CoordDTO getCoord() {
        return coord;
    }

    public void setCoord(CoordDTO coord) {
        this.coord = coord;
    }

    public List<WeatherDTO> getWeather() {
        return weather;
    }

    public void setWeather(List<WeatherDTO> weather) {
        this.weather = weather;
    }

    public MainDTO getMain() {
        return main;
    }

    public void setMain(MainDTO main) {
        this.main = main;
    }

    public int getTimeCurrent() {
        return timeCurrent;
    }

    public void setTimeCurrent(int timeCurrent) {
        this.timeCurrent = timeCurrent;
    }

    public SysDTO getSys() {
        return sys;
    }

    public void setSys(SysDTO sys) {
        this.sys = sys;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
