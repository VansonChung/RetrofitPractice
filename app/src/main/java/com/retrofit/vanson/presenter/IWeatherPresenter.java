package com.retrofit.vanson.presenter;

import com.retrofit.vanson.model.WeatherCurrent;
import com.retrofit.vanson.model.WeatherForecast;

public interface IWeatherPresenter {

    void getCurrentWeather(String city);

    void getForecastWeather(String city);

    void onCurrentWeather(WeatherCurrent weatherCurrent);

    void onForecastWeather(WeatherForecast weatherForecast);

    void onCurrentFail(String city);

    void onForecastFail(String city);
}
