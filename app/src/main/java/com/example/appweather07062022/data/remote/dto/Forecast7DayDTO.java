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
    }

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
}
