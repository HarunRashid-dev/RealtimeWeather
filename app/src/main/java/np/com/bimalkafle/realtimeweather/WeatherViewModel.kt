package np.com.bimalkafle.realtimeweather

import android.util.Log
import androidx.lifecycle.ViewModel

class WeatherViewModel : ViewModel(){

    fun getData(city: String){
        Log.i("City name:", city)

    }
}