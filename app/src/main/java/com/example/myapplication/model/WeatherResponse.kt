package com.example.myapplication.model

data class WeatherResponse(
    val main: Main
)
// komment

data class Main(
    val temp: Float
)