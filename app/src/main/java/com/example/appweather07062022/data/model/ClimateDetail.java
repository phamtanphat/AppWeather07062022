package com.example.appweather07062022.data.model;

import com.example.appweather07062022.data.remote.dto.SearchDTO;

/**
 * Created by pphat on 8/27/2022.
 */
public class ClimateDetail {
    private City city;
    private Weather weather;

    public ClimateDetail() {
    }

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

    public void parserSearchDTOToClimate(SearchDTO searchDTO) {
        city = new City(
                searchDTO.getName(),
                searchDTO.getCoord().getLat(),
                searchDTO.getCoord().getLon());

        weather = new Weather(
                searchDTO.getMain().getTemp(),
                searchDTO.getMain().getTempMin(),
                searchDTO.getMain().getTempMax(),
                searchDTO.getWeather().get(0).getDescription(),
                searchDTO.getTimeCurrent(),
                searchDTO.getWeather().get(0).getIcon());
    }
}
