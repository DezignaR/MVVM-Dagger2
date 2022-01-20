package com.example.mvvmlesson.di

import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.Router
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
interface AppModule {
    companion object {

        @Provides
        fun provideRouter(cicerone: Cicerone<Router>):
                Router = cicerone.router

    }
}