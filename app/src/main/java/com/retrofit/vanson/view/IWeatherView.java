package com.retrofit.vanson.view;

import com.retrofit.vanson.model.WeatherCurrent;
import com.retrofit.vanson.model.WeatherForecast;

public interface IWeatherView {

    void setCurrentWeather(WeatherCurrent weatherCurrent);

    void setForecastWeather(WeatherForecast weatherForecast);

    void onCurrentFail(String cause);

    void onForecastFail(String cause);
}
