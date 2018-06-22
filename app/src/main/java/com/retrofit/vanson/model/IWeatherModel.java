package com.retrofit.vanson.model;

public interface IWeatherModel {

    void getCurrentWeather(String city);

    void getForecastWeather(String city);

}
