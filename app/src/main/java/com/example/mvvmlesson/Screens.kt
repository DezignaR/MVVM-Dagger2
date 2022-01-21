package com.example.mvvmlesson

import com.github.terrakok.cicerone.androidx.FragmentScreen


object Screens {
    fun generalFragmentScreen() = FragmentScreen { GeneralFragment() }
    fun secondFragmentScreen() = FragmentScreen { SecondFragment() }
}