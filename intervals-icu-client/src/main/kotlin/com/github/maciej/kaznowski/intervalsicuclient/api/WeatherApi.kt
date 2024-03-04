package com.github.maciej.kaznowski.intervalsicuclient.api

import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import com.github.maciej.kaznowski.intervalsicuclient.model.WeatherConfig
import com.github.maciej.kaznowski.intervalsicuclient.model.WeatherDTO

interface WeatherApi {
    /**
     * Get weather forecast information
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Call]<[WeatherDTO]>
     */
    @GET("api/v1/athlete/{id}/weather-forecast")
    fun getForecast(@Path("id") id: kotlin.String): Call<WeatherDTO>

    /**
     * Get the athlete&#39;s weather forecast configuration
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Call]<[WeatherConfig]>
     */
    @GET("api/v1/athlete/{id}/weather-config")
    fun getWeatherConfig(@Path("id") id: kotlin.String): Call<WeatherConfig>

    /**
     * Update the athlete&#39;s weather forecast configuration
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param weatherConfig 
     * @return [Call]<[WeatherConfig]>
     */
    @PUT("api/v1/athlete/{id}/weather-config")
    fun updateWeatherConfig(@Path("id") id: kotlin.String, @Body weatherConfig: WeatherConfig): Call<WeatherConfig>

}
