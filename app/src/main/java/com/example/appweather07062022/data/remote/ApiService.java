package com.example.appweather07062022.data.remote;

import com.example.appweather07062022.data.remote.dto.Forecast7DayDTO;
import com.example.appweather07062022.data.remote.dto.SearchDTO;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by pphat on 8/25/2022.
 */
public interface ApiService {
    @GET("data/2.5/weather")
    Call<SearchDTO> searchTempFormCityName(
            @Query("appid") String appId,
            @Query("units") String units,
            @Query("q") String q
    );

    @GET("data/2.5/forecast/daily")
    Call<Forecast7DayDTO> fetchTemp7DayFromCityName(
            @Query("appid") String appId,
            @Query("units") String units,
            @Query("cnt") String cnt,
            @Query("model") String model,
            @Query("q") String q
    );
}
