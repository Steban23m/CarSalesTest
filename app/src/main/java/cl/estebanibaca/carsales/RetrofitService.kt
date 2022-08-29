package cl.estebanibaca.carsales

import cl.estebanibaca.carsales.model.CovidData
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface RetrofitService {

    @GET("report/total")
    fun getReportData(): Call<CovidData>

}