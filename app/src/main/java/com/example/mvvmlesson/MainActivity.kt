package com.example.mvvmlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .add(R.id.container, GeneralFragment())
            .commit()
    }

    fun navigateFragment(fragment: Fragment, tag: String) {
        supportFragmentManager.beginTransaction()
            .add(R.id.container, fragment)
            .addToBackStack(tag)
            .commit()
    }
}