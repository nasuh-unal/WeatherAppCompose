package com.plcoding.weatherapp.domain.weather

import com.google.android.gms.location.CurrentLocationRequest

data class WeatherInfo(
    val weatherDataPerDay: Map<Int, List<WeatherData>>,//Günlük Hava Durumu Verileri
    val currentWeatherData: WeatherData?//anlık hava durumu verileri
)

//farklı günlerin hava durumlarına erişeceğiz
//mevcud günün indeksini vererek buna sahip olacağız

//MEvcud hava durumu verileri için currentWEatherDAta özelliğini kullanacağız ve saatlik verileri göstereceğiz
