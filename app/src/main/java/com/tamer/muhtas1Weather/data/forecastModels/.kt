package com.tamer.muhtas1Weather.data.forecastModels

data class ForecastData (
    val dt: Int,
    val dt_txt: String,
    val main: Main,
    val pop: Int,
    val sys: Sys,
    val visibility: Int,
    val weather: List<Weather>,
)