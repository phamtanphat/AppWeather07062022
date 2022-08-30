package com.example.appweather07062022.presentation.view.activity;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.appweather07062022.data.model.ClimateForecastDetail;
import com.example.appweather07062022.data.model.ClimateSearchDetail;
import com.example.appweather07062022.data.remote.dto.Forecast7DayDTO;
import com.example.appweather07062022.data.remote.dto.SearchDTO;
import com.example.appweather07062022.data.repository.WeatherRepository;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by pphat on 8/27/2022.
 */
public class MainViewModel extends ViewModel {
    private MutableLiveData<ClimateSearchDetail> climateDetailMutableLiveData = new MutableLiveData<>();
    private MutableLiveData<ClimateForecastDetail> climateForecastDetailMutableLiveData = new MutableLiveData<>();
    private MutableLiveData<String> messageMutableLiveData = new MutableLiveData<>();

    private WeatherRepository weatherRepository;

    public MainViewModel(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    public LiveData<ClimateSearchDetail> getClimateDetailLiveData() {
        return climateDetailMutableLiveData;
    }

    public LiveData<ClimateForecastDetail> getClimateForecastDetailLiveData() {
        return climateForecastDetailMutableLiveData;
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
                            ClimateSearchDetail climateSearchDetail = new ClimateSearchDetail();
                            climateSearchDetail.parserSearchDTOToClimate(searchDTO);
                            climateDetailMutableLiveData.setValue(climateSearchDetail);
                        } else {
                            try {
                                JSONObject jsonObject = new JSONObject(response.errorBody().string());
                                String message = jsonObject.getString("message");
                                messageMutableLiveData.setValue(message);
                            } catch (IOException e) {
                                e.printStackTrace();
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<SearchDTO> call, Throwable t) {
                        messageMutableLiveData.setValue(t.getMessage());
                    }
                });
    }

    public void fetchTemp7DayFromCity(String cityName) {
        weatherRepository
                .fetchTemp7DatFromCity(cityName)
                .enqueue(new Callback<Forecast7DayDTO>() {
                    @Override
                    public void onResponse(Call<Forecast7DayDTO> call, Response<Forecast7DayDTO> response) {
                        if (response.isSuccessful()) {
                            Forecast7DayDTO forecast7DayDTO = response.body();
                            ClimateForecastDetail climateForecastDetail = new ClimateForecastDetail();
                            climateForecastDetail.parseFromForecastDTO(forecast7DayDTO);
                            climateForecastDetailMutableLiveData.setValue(climateForecastDetail);
                        } else {
                        try {
                            JSONObject jsonObject = new JSONObject(response.errorBody().string());
                            String message = jsonObject.getString("message");
                            messageMutableLiveData.setValue(message);
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                    }

                    @Override
                    public void onFailure(Call<Forecast7DayDTO> call, Throwable t) {
                        messageMutableLiveData.setValue(t.getMessage());
                    }
                });
    }
}
