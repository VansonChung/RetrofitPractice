package com.retrofit.vanson.model;


import com.retrofit.vanson.Define;
import com.retrofit.vanson.presenter.IWeatherPresenter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WeatherModel implements IWeatherModel {

    private IWeatherPresenter mIWeatherPresenter;
    private RetrofitInterface mRetrofitInterface;

    public WeatherModel(IWeatherPresenter IWeatherPresenter) {
        mIWeatherPresenter = IWeatherPresenter;
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(Define.BASE_URL)
                .build();
        mRetrofitInterface = retrofit.create(RetrofitInterface.class);
    }

    @Override
    public void getCurrentWeather(final String city) {
        Call<WeatherCurrent> current = mRetrofitInterface.getWeatherCurrent(city, "metric",
                Define.API_KEY);
        current.enqueue(new Callback<WeatherCurrent>() {
            @Override
            public void onResponse(Call<WeatherCurrent> call, Response<WeatherCurrent> response) {
                if (response.isSuccessful()) {
                    mIWeatherPresenter.onCurrentWeather(response.body());
                } else {
                    mIWeatherPresenter.onCurrentFail(city);
                }
            }

            @Override
            public void onFailure(Call<WeatherCurrent> call, Throwable t) {
                mIWeatherPresenter.onCurrentFail(t.getMessage());
            }
        });
    }

    @Override
    public void getForecastWeather(final String city) {
        Call<WeatherForecast> forecast = mRetrofitInterface.getWeatherFroecast(city, "metric", 20,
                Define.API_KEY);

        forecast.enqueue(new Callback<WeatherForecast>() {
            @Override
            public void onResponse(Call<WeatherForecast> call, Response<WeatherForecast> response) {
                if (response.isSuccessful()) {
                    mIWeatherPresenter.onForecastWeather(response.body());
                } else {
                    mIWeatherPresenter.onForecastFail(city);
                }
            }

            @Override
            public void onFailure(Call<WeatherForecast> call, Throwable t) {
                mIWeatherPresenter.onForecastFail(t.getMessage());
            }
        });
    }
}
