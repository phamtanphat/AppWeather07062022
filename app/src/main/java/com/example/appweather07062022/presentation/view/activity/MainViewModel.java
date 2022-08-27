package com.example.appweather07062022.presentation.view.activity;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.appweather07062022.data.model.ClimateDetail;
import com.example.appweather07062022.data.remote.dto.SearchDTO;
import com.example.appweather07062022.data.repository.WeatherRepository;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by pphat on 8/27/2022.
 */
public class MainViewModel extends ViewModel {
    private MutableLiveData<ClimateDetail> climateDetailMutableLiveData = new MutableLiveData<>();
    private MutableLiveData<String> messageMutableLiveData = new MutableLiveData<>();

    private WeatherRepository weatherRepository;

    public MainViewModel(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    public LiveData<ClimateDetail> getClimateDetailLiveData() {
        return climateDetailMutableLiveData;
    }

    public LiveData<String> getMessage() {
        return messageMutableLiveData;
    }

    public void searchTempFromCity(String cityName) {
        weatherRepository
                .searchTempFromCity(cityName)
                .enqueue(new Callback<SearchDTO>() {
                    @Override
                    public void onResponse(Call<SearchDTO> call, Response<SearchDTO> response) {
                        if (response.isSuccessful()) {
                            SearchDTO searchDTO = response.body();
                            ClimateDetail climateDetail = new ClimateDetail();
                            climateDetail.parserSearchDTOToClimate(searchDTO);
                            climateDetailMutableLiveData.setValue(climateDetail);
                        }
                    }

                    @Override
                    public void onFailure(Call<SearchDTO> call, Throwable t) {
                        messageMutableLiveData.setValue(t.getMessage());
                    }
                });
    }
}
