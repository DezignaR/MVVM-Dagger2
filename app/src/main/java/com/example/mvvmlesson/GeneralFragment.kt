package com.example.mvvmlesson

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider


class GeneralFragment: BaseFragment(R.layout.general_fragment) {

    private val viewModel:GeneralViewModel by viewModels{
        getAppComponent().viewModelFactory()
    }

    private lateinit var viewModel:GeneralViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[GeneralViewModel::class.java]
    }

}