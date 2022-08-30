package com.example.appweather07062022.data.remote.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListDTO {
    @SerializedName("dt")
    private int time;
    private TempDTO temp;
    private List<WeatherDTO> weather;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public TempDTO getTemp() {
        return temp;
    }

    public void setTemp(TempDTO temp) {
        this.temp = temp;
    }

    public List<WeatherDTO> getWeather() {
        return weather;
    }

    public void setWeather(List<WeatherDTO> weather) {
        this.weather = weather;
    }

    public class TempDTO {
        private double day;
        private double min;
        private double max;

        public double getDay() {
            return day;
        }

        public void setDay(double day) {
            this.day = day;
        }

        public double getMin() {
            return min;
        }

        public void setMin(double min) {
            this.min = min;
        }

        public double getMax() {
            return max;
        }

        public void setMax(double max) {
            this.max = max;
        }
    }
}
