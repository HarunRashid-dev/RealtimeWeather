package np.com.bimalkafle.realtimeweather

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import np.com.bimalkafle.realtimeweather.api.Constant
import np.com.bimalkafle.realtimeweather.api.RetrofitInstance

class WeatherViewModel : ViewModel(){

    private val weatherApi = RetrofitInstance.weatherApi

    fun getData(city: String){

        viewModelScope.launch {
            val response = weatherApi.getWeather(Constant.apiKey,city)
            if(response.isSuccessful) {
                Log.i("Response :", response.body().toString())
            }else{
                Log.i("Error:", response.message())
            }


        }


    }
}