package com.plcoding.weatherapp.data.remote
import retrofit2.http.GET
import retrofit2.http.Query

//https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&hourly=temperature_2m,relative_humidity_2m,weather_code,pressure_msl,wind_speed_10m
interface WeatherApi {
    @GET("v1/forecast?latitude=52.52&longitude=13.41&hourly=temperature_2m,relative_humidity_2m,weather_code,pressure_msl,wind_speed_10m")
    suspend fun getWeatherData(
        @Query("latitude")lat:Double,
        @Query("longitude")long:Double
    ):WeatherDto
}