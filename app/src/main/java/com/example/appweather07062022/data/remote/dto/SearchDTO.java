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

    public class CoordDTO {
        private double lon;
        private double lat;

        public double getLon() {
            return lon;
        }

        public void setLon(double lon) {
            this.lon = lon;
        }

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }
    }

    public class MainDTO {
        private int temp;
        @SerializedName("temp_min")
        private int tempMin;
        @SerializedName("temp_max")
        private int tempMax;

        public int getTemp() {
            return temp;
        }

        public void setTemp(int temp) {
            this.temp = temp;
        }

        public int getTempMin() {
            return tempMin;
        }

        public void setTempMin(int tempMin) {
            this.tempMin = tempMin;
        }

        public int getTempMax() {
            return tempMax;
        }

        public void setTempMax(int tempMax) {
            this.tempMax = tempMax;
        }
    }

    public class SysDTO {
        private String country;

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }
    }

    public class WeatherDTO {
        private String main;
        private String description;
        private String icon;

        public String getMain() {
            return main;
        }

        public void setMain(String main) {
            this.main = main;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }
}
