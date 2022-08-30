package com.example.appweather07062022.presentation.view.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;

import com.example.appweather07062022.R;
import com.example.appweather07062022.data.model.ClimateForecastDetail;
import com.example.appweather07062022.data.model.ClimateSearchDetail;
import com.example.appweather07062022.data.repository.WeatherRepository;

public class MainActivity extends AppCompatActivity {

    MainViewModel mainViewModel;
    WeatherRepository weatherRepository;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weatherRepository = new WeatherRepository();
        mainViewModel = new ViewModelProvider(this, new ViewModelProvider.Factory() {
            @NonNull
            @Override
            public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
                return (T) new MainViewModel(weatherRepository);
            }
        }).get(MainViewModel.class);

        mainViewModel.getClimateDetailLiveData().observe(this, new Observer<ClimateSearchDetail>() {
            @Override
            public void onChanged(ClimateSearchDetail climateSearchDetail) {
                if (climateSearchDetail != null) {
                    Log.d("BBB", climateSearchDetail.toString());
                }
            }
        });

        mainViewModel.getClimateForecastDetailLiveData().observe(this, new Observer<ClimateForecastDetail>() {
            @Override
            public void onChanged(ClimateForecastDetail climateForecastDetail) {
                if (climateForecastDetail != null) {
                    Log.d("BBB", climateForecastDetail.toString());
                }
            }
        });

        mainViewModel.getMessage().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                if (s != null && !s.isEmpty()) {
                    Log.d("BBB","Error " + s);
                }
            }
        });

//        mainViewModel.searchTempFromCity("Hanoi213213213");
        mainViewModel.fetchTemp7DayFromCity("Hanoi");
    }
}
