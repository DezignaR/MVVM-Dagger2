package com.example.mvvmlesson

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.mvvmlesson.di.AppComponent
import com.example.mvvmlesson.di.DaggerAppComponent
import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.Command
import com.github.terrakok.cicerone.Navigator
import com.github.terrakok.cicerone.androidx.AppNavigator

class MainApp : AppCompatActivity() {

    val appComponent: AppComponent by lazy { DaggerAppComponent.builder().build() }
    private val cicerone = Cicerone.create()
    private val router get() = cicerone.router
    val navigatorHolder get() = cicerone.getNavigatorHolder()
    private val navigator = AppNavigator(this, R.id.container)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        INSTANCE = this
        navigatorHolder.setNavigator(navigator)
        router.navigateTo(Screens.generalFragmentScreen())
//        setContentView(R.layout.activity_main)
//        supportFragmentManager.beginTransaction()
//            .add(R.id.container, GeneralFragment())
//            .commit()
    }

//    fun navigateFragment(fragment: Fragment, tag: String) {
//        supportFragmentManager.beginTransaction()
//            .replace(R.id.container, fragment)
//            .addToBackStack(tag)
//            .commit()
//    }

    companion object {
        internal lateinit var INSTANCE: MainApp
            private set
    }

}
//
//val Context.appComponent: AppComponent
//    get() = when (this) {
//        is MainApp -> appComponent
//        else -> applicationContext.appComponent
//    }