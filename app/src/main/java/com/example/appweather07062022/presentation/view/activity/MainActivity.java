package com.example.appweather07062022.presentation.view.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;

import com.example.appweather07062022.R;
import com.example.appweather07062022.data.model.ClimateDetail;
import com.example.appweather07062022.data.remote.RetrofitClient;
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

        mainViewModel.getClimateDetailLiveData().observe(this, new Observer<ClimateDetail>() {
            @Override
            public void onChanged(ClimateDetail climateDetail) {
                if (climateDetail != null) {
                    Log.d("BBB",climateDetail.toString());
                }
            }
        });

        mainViewModel.searchTempFromCity("Hanoi");
    }
}
