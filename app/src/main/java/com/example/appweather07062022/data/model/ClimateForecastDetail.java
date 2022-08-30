package com.example.appweather07062022.data.model;

import com.example.appweather07062022.data.remote.dto.Forecast7DayDTO;
import com.example.appweather07062022.data.remote.dto.ListDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pphat on 8/30/2022.
 */
public class ClimateForecastDetail {
    private City city;
    private List<Weather> weatherList;

    public ClimateForecastDetail() {
    }

    public ClimateForecastDetail(City city, List<Weather> weatherList) {
        this.city = city;
        this.weatherList = weatherList;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Weather> getWeatherList() {
        return weatherList;
    }

    public void setWeatherList(List<Weather> weatherList) {
        this.weatherList = weatherList;
    }

    public void parseFromForecastDTO(Forecast7DayDTO forecast7DayDTO) {
        city = new City(
                forecast7DayDTO.getCity().getName(),
                forecast7DayDTO.getCity().getCoord().getLat(),
                forecast7DayDTO.getCity().getCoord().getLon());

        ListDTO listDTOS;
        weatherList = new ArrayList<>();
        for (int i = 0; i < forecast7DayDTO.getList().size(); i++) {
            listDTOS = forecast7DayDTO.getList().get(i);
            weatherList.add(new Weather(
                    listDTOS.getTemp().getDay(),
                    listDTOS.getTemp().getMin(),
                    listDTOS.getTemp().getMax(),
                    listDTOS.getWeather().get(0).getDescription(),
                    listDTOS.getTime(),
                    listDTOS.getWeather().get(0).getIcon())
            );
        }
    }
}
