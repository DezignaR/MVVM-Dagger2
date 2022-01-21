package com.example.mvvmlesson.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmlesson.BaseViewModel
import com.example.mvvmlesson.GeneralViewModel
import javax.inject.Inject
import javax.inject.Provider

//abstract class ViewModelFactory @Inject constructor(
//    viewModelProvider: Provider<BaseViewModel>
//) : ViewModelProvider.Factory {
//    private val providers = mapOf<Class<*>, Provider<out ViewModel>>(
//        GeneralViewModel::class.java to viewModelProvider
//    )
//
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        require(modelClass == BaseViewModel::class)
//        return providers[modelClass]!!.get() as T
//    }
//}