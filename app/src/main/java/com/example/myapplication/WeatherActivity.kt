package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.model.WeatherResponse
import com.example.myapplication.network.WeatherService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class WeatherActivity : AppCompatActivity() {

    private lateinit var textviewTemp: TextView
    private lateinit var textviewTempmin: TextView
    private lateinit var textviewHumidity: TextView
    private lateinit var textviewWindspeed: TextView
    private val apiKey = "d1b1ac023a2486b6b94a4f6a46198ca2"

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_weather)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        textviewTemp = findViewById(R.id.textview_temp)
        textviewTempmin = findViewById(R.id.textview_tempmin)
        textviewHumidity = findViewById(R.id.textview_humidity)
        textviewWindspeed = findViewById(R.id.textview_windspeed)
        fetchWeatherData()


    } // ONCREATE

    private fun fetchWeatherData(){
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.openweathermap.org")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val weatherService = retrofit.create(WeatherService::class.java)

        val call = weatherService.getWeather("Tatabánya", "metric", apiKey)
        call.enqueue(object: Callback<WeatherResponse>{
            override fun onResponse(
                call: Call<WeatherResponse>,
                response: Response<WeatherResponse>
            ){
                if (response.isSuccessful){
                    val weatherResponse = response.body()
                    if (weatherResponse != null){
                        val weatherInfo = weatherResponse.main.temp
                        textviewTemp.text = "current temp: " + weatherInfo.toString()
                        val weatherInfo2 = weatherResponse.main.temp_min
                        textviewTempmin.text = "min temp: " + weatherInfo2.toString()
                        val weatherInfo3 = weatherResponse.main.humidity
                        textviewHumidity.text = "humidity: " + weatherInfo3.toString()
                        val weatherInfo4 = weatherResponse.wind.speed
                        textviewWindspeed.text = "wind speed: " + weatherInfo4.toString()
                    }
                }
            }

            override fun onFailure(call: Call<WeatherResponse>, t: Throwable) {
                Log.e("HIBA", "Hiba az API kérés során.")
            }

        })
    }// fun



}