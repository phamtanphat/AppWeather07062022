package com.example.appweather07062022.data.remote.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by pphat on 8/27/2022.
 */
public class Forecast7DayDTO {
    private CityDTO city;
    @SerializedName("cnt")
    private int totalDay;
    private List<ListDTO> list;

    public CityDTO getCity() {
        return city;
    }

    public void setCity(CityDTO city) {
        this.city = city;
    }

    public int getTotalDay() {
        return totalDay;
    }

    public void setTotalDay(int totalDay) {
        this.totalDay = totalDay;
    }

    public List<ListDTO> getList() {
        return list;
    }

    public void setList(List<ListDTO> list) {
        this.list = list;
    }
}
