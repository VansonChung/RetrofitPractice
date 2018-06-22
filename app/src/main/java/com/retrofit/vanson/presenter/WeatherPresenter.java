package com.retrofit.vanson.presenter;

import com.retrofit.vanson.model.WeatherCurrent;
import com.retrofit.vanson.model.WeatherForecast;
import com.retrofit.vanson.model.WeatherModel;
import com.retrofit.vanson.view.IWeatherView;

public class WeatherPresenter implements IWeatherPresenter {

    private IWeatherView mIWeatherView;
    private WeatherModel mWeatherModel;

    public WeatherPresenter(IWeatherView IWeatherView) {
        mIWeatherView = IWeatherView;
        mWeatherModel = new WeatherModel(this);
    }

    @Override
    public void getCurrentWeather(String city) {
        mWeatherModel.getCurrentWeather(city);
    }

    @Override
    public void getForecastWeather(String city) {
        mWeatherModel.getForecastWeather(city);
    }

    @Override
    public void onCurrentWeather(WeatherCurrent weatherCurrent) {
        mIWeatherView.setCurrentWeather(weatherCurrent);
    }

    @Override
    public void onForecastWeather(WeatherForecast weatherForecast) {
        mIWeatherView.setForecastWeather(weatherForecast);
    }

    @Override
    public void onCurrentFail(String city) {
        mIWeatherView.onCurrentFail(city);
    }

    @Override
    public void onForecastFail(String city) {
        mIWeatherView.onForecastFail(city);
    }
}
