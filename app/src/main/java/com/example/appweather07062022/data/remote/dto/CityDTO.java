package com.example.appweather07062022.data.remote.dto;

public class CityDTO {
    private String name;
    private CoordDTO coord;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CoordDTO getCoord() {
        return coord;
    }

    public void setCoord(CoordDTO coord) {
        this.coord = coord;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
