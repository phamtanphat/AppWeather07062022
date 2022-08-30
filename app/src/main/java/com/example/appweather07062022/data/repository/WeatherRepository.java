package com.example.appweather07062022.data.repository;

import com.example.appweather07062022.common.AppConstant;
import com.example.appweather07062022.data.remote.ApiService;
import com.example.appweather07062022.data.remote.RetrofitClient;
import com.example.appweather07062022.data.remote.dto.Forecast7DayDTO;
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

    public Call<SearchDTO> searchTempFromCity(String cityName) {
        return apiService.searchTempFormCityName(AppConstant.APP_ID, "metric", cityName);
    }

    public Call<Forecast7DayDTO> fetchTemp7DatFromCity(String cityName) {
        return apiService.fetchTemp7DayFromCityName(AppConstant.APP_ID, "metric", "7", "json", cityName);
    }
}
