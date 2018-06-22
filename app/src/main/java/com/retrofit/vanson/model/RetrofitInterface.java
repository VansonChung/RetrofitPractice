package com.retrofit.vanson.model;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitInterface {

    @GET("weather")
    Call<WeatherCurrent> getWeatherCurrent(@Query("q") String cityName, @Query("units") String
            units, @Query("APPID") String ApiId);

    @GET("forecast")
    Call<WeatherForecast> getWeatherFroecast(@Query("q") String cityName, @Query("units") String
            units, @Query("cnt") int count, @Query("APPID") String ApiId);
}
