package com.example.appweather07062022.data.repository;

import com.example.appweather07062022.common.AppConstant;
import com.example.appweather07062022.data.remote.ApiService;
import com.example.appweather07062022.data.remote.RetrofitClient;
import com.example.appweather07062022.data.remote.dto.SearchDTO;

import retrofit2.Call;

/**
 * Created by pphat on 8/27/2022.
 */
public class WeatherRepository {
    private ApiService apiService;

    public WeatherRepository() {
        apiService = RetrofitClient.getInstance().getApiService();
    }

    Call<SearchDTO> searchTempFromCity(String cityName) {
        return apiService.searchTempFormCityName(AppConstant.APP_ID, "metric", cityName);
    }
}