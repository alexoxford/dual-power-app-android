package app.dualpower

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val dppList: MutableLiveData<List<DppModel>> =
        MutableLiveData(List(10) { index ->
            DppModel.getTestDppModel(index)
        })  // TODO replace with fetch from API

    fun getDppList(): LiveData<List<DppModel>> = dppList


}