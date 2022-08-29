package cl.estebanibaca.carsales

class MainRepository constructor(private val retrofitService: RetrofitService) {
    fun getData() = retrofitService.getReportData()
}