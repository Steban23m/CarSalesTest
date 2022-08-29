package cl.estebanibaca.carsales

import javax.inject.Inject

class CovidDataRepository
@Inject
constructor(private val apiService: RetrofitService) {
    suspend fun getCovidData(date:String) = apiService.getReportData(date)
}