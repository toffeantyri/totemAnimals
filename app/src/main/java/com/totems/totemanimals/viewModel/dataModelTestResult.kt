package com.totems.totemanimals.viewModel

import android.util.Log
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DataModelTestResult : ViewModel() {

    val stateOpenTestAnimal : MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }


}