package com.example.mvvmlesson

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.mvvmlesson.di.AppModule
import javax.inject.Inject

class GeneralViewModel @Inject constructor() : BaseViewModel() {



    init {
        Log.e("AAA", "View created")
    }
}