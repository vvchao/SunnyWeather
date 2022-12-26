package com.sunnyweather.android.logic.network

import PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import com.sunnyweather.android.SunnyWeatherApplication


interface PlaceService {

    //query参数会拼接进url
    //返回的JSON数据解析成PlaceResponse对象
    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}