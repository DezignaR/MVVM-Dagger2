package com.example.mvvmlesson

import android.content.Context
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmlesson.Screens.secondFragmentScreen
import com.example.mvvmlesson.databinding.GeneralFragmentBinding
import com.github.terrakok.cicerone.Router
import com.github.terrakok.cicerone.androidx.AppNavigator
import javax.inject.Inject


class GeneralFragment : ViewBindingFragment<GeneralFragmentBinding>(
    GeneralFragmentBinding::inflate
) {


//    private val viewModel:GeneralViewModel by viewModels{
//        getAppComponent().viewModelFactory()
//    }

    @Inject
    lateinit var provideRouter: Router

    private lateinit var viewModel: GeneralViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[GeneralViewModel::class.java]

    }

    override fun onViewBindingCreated(
        viewBinding: GeneralFragmentBinding,
        savedInstanceState: Bundle?
    ) {
        super.onViewBindingCreated(viewBinding, savedInstanceState)
        viewBinding.button.setOnClickListener {
        //    (activity as MainApp).navigateFragment(SecondFragment(),"SecondFragment")
        provideRouter.navigateTo(secondFragmentScreen())

        }
    }




}