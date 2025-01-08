package np.com.bimalkafle.realtimeweather

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import np.com.bimalkafle.realtimeweather.api.Constant
import np.com.bimalkafle.realtimeweather.api.NetworkResponse
import np.com.bimalkafle.realtimeweather.api.RetrofitInstance
import np.com.bimalkafle.realtimeweather.api.WeatherModel

class WeatherViewModel : ViewModel(){

    private val weatherApi = RetrofitInstance.weatherApi
    private val _weatherResult = MutableLiveData<NetworkResponse<WeatherModel>>()

    fun getData(city: String){

        viewModelScope.launch {
            val response = weatherApi.getWeather(Constant.apiKey,city)
            if(response.isSuccessful) {

            }else{

            }


        }


            }


        }