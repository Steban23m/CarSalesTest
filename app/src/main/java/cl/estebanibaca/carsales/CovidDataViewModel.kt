package cl.estebanibaca.carsales

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cl.estebanibaca.carsales.model.CovidData
import kotlinx.coroutines.launch
import javax.inject.Inject



class CovidDataViewModel

@Inject
constructor(private val repository: CovidDataRepository) : ViewModel() {

    private val date:String = "2022-08-28"
    private val _response = MutableLiveData<CovidData>()
    val dataResponse: LiveData<CovidData>
        get() = _response


    init {
        getCovidData(date)
    }

    private fun getCovidData(date:String) = viewModelScope.launch {
        repository.getCovidData(date).let { response ->

            /*if (response.isSuccessful) {
                _response.postValue(response.body())
            } else {
                Log.d("tag", "getWeather Error: ${response.code()}")
            }*/
        }
    }


}