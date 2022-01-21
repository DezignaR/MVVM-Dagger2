package com.example.mvvmlesson.di

import com.example.mvvmlesson.GeneralViewModel
import com.example.mvvmlesson.SecondFragment
import dagger.Component
import dagger.Module
import javax.inject.Singleton

@Singleton
@Component(modules=[AppModule::class])
interface AppComponent {
fun inject(fragment: SecondFragment)


}

