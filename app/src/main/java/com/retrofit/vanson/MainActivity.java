package com.retrofit.vanson;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.retrofit.vanson.model.WeatherCurrent;
import com.retrofit.vanson.model.WeatherForecast;
import com.retrofit.vanson.presenter.WeatherPresenter;
import com.retrofit.vanson.view.IWeatherView;

public class MainActivity extends AppCompatActivity implements IWeatherView {

    private Toolbar mToolbar;
    private SearchView mSearchView;
    private TextView mTvName, mTvLongitude, mTvLatitude, mTvWeather, mTvTemperature,
            mTvHumidity, mTvWindSpeed;
    private ImageView mIvWeather, mIvError;
    private View mViewDivide;
    private RecyclerView mRecyclerView;

    private RecyclerAdapter mRecyclerAdapter;

    private WeatherPresenter mWeatherPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

    }

    private void init() {
        mWeatherPresenter = new WeatherPresenter(this);

        mToolbar = findViewById(R.id.toolbar);
        mSearchView = mToolbar.findViewById(R.id.searView);
        mTvName = findViewById(R.id.textView_city_name);
        mTvLongitude = findViewById(R.id.textView_city_longitude);
        mTvLatitude = findViewById(R.id.textView_city_latitude);
        mTvWeather = findViewById(R.id.textView_city_weather);
        mTvTemperature = findViewById(R.id.textView_city_temperature);
        mTvHumidity = findViewById(R.id.textView_city_humidity);
        mTvWindSpeed = findViewById(R.id.textView_city_wind_speed);
        mIvWeather = findViewById(R.id.imageView_weather_icon);
        mIvError = findViewById(R.id.imageView_error);
        mViewDivide = findViewById(R.id.divideLine);
        mRecyclerView = findViewById(R.id.recyclerView);

        setSupportActionBar(mToolbar);

        mSearchView.setSubmitButtonEnabled(true);
        mSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String query) {
                mWeatherPresenter.getCurrentWeather(query);
                mWeatherPresenter.getForecastWeather(query);
                mToolbar.setTitle(query);
                mSearchView.onActionViewCollapsed();
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration
                .VERTICAL));
        mRecyclerAdapter = new RecyclerAdapter(MainActivity.this);
        mRecyclerView.setAdapter(mRecyclerAdapter);
    }

    @Override
    public void setCurrentWeather(WeatherCurrent weatherCurrent) {
        setCurrentWeatherView(weatherCurrent);
    }

    @Override
    public void setForecastWeather(WeatherForecast weatherForecast) {
        setForecastWeatherView(weatherForecast);
    }

    @Override
    public void onCurrentFail(String cause) {
        setCurrentError(cause);
    }

    @Override
    public void onForecastFail(String cause) {
        setForecastError();
    }

    private void setCurrentError(String cause) {
        mTvName.setText(String.format(getResources().getString(R.string.city_name), cause));
        mIvError.setVisibility(View.VISIBLE);
        mTvLongitude.setVisibility(View.GONE);
        mTvLatitude.setVisibility(View.GONE);
        mTvWeather.setVisibility(View.GONE);
        mTvTemperature.setVisibility(View.GONE);
        mTvHumidity.setVisibility(View.GONE);
        mTvWindSpeed.setVisibility(View.GONE);
        mIvWeather.setVisibility(View.GONE);
        mViewDivide.setVisibility(View.GONE);
    }

    private void setForecastError() {
        mRecyclerAdapter.setForecast(null);
        mRecyclerAdapter.notifyDataSetChanged();
    }

    private void setCurrentWeatherView(WeatherCurrent weather) {
        mTvName.setText(String.format(getResources().getString(R.string.city_name), weather
                .getName()));
        mTvLongitude.setText(String.format(getResources().getString(R.string.city_longitude),
                weather.getCoord().getLon()));
        mTvLatitude.setText(String.format(getResources().getString(R.string.city_latitude),
                weather.getCoord().getLat()));
        mTvWeather.setText(String.format(getResources().getString(R.string.city_weather), weather
                .getWeather().get(0).getMain()));
        mTvTemperature.setText(String.format(getResources().getString(R.string.city_temperature),
                weather.getMain().getTemp()));
        mTvHumidity.setText(String.format(getResources().getString(R.string.city_humidity),
                weather.getMain().getHumidity()));
        mTvWindSpeed.setText(String.format(getResources().getString(R.string.city_wind_speed),
                weather.getWind().getSpeed()));
        Glide.with(MainActivity.this).load(Define.ICON_URL + weather.getWeather().get(0).getIcon
                () + ".png").error(Glide.with(this).load(R.drawable.ic_thumb_down_black_120dp))
                .into(mIvWeather);
        mIvError.setVisibility(View.GONE);
        mTvLongitude.setVisibility(View.VISIBLE);
        mTvLatitude.setVisibility(View.VISIBLE);
        mTvWeather.setVisibility(View.VISIBLE);
        mTvTemperature.setVisibility(View.VISIBLE);
        mTvHumidity.setVisibility(View.VISIBLE);
        mTvWindSpeed.setVisibility(View.VISIBLE);
        mIvWeather.setVisibility(View.VISIBLE);
        mViewDivide.setVisibility(View.VISIBLE);
    }

    private void setForecastWeatherView(WeatherForecast forecast) {
        mRecyclerAdapter.setForecast(forecast);
        mRecyclerAdapter.notifyDataSetChanged();
    }
}
