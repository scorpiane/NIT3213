package com.example.final_assignment.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient{
//    base url of api
    const val BASE_URL = "https://vu-nit3213-api.onrender.com/"

//    function to instantiate the retrofit
    fun getRetrofitInstance(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }
}