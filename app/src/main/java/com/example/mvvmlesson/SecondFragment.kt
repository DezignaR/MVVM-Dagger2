package com.example.mvvmlesson

import android.os.Bundle
import com.example.mvvmlesson.databinding.SecondFragmentBinding
import com.github.terrakok.cicerone.Router

class SecondFragment:ViewBindingFragment<SecondFragmentBinding>(
    SecondFragmentBinding::inflate
) {
    lateinit var router: Router

    override fun onViewBindingCreated(
        viewBinding: SecondFragmentBinding,
        savedInstanceState: Bundle?
    ) {
        super.onViewBindingCreated(viewBinding, savedInstanceState)
        if(viewBinding.switch1.isChecked)
           router.navigateTo(Screens.generalFragmentScreen())
    }
}