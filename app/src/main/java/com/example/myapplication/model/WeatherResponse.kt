package com.example.myapplication.model

data class WeatherResponse(
    val main: Main,
    val wind: Wind
)
// komment

data class Wind(
    val speed: Float
)

data class Main(
    val temp: Float,
    val temp_min: Float,
    val humidity: Float
)