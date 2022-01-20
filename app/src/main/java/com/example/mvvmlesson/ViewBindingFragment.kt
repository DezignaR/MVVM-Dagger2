package com.example.mvvmlesson

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.CallSuper
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class ViewBindingFragment<VB : ViewBinding>() : Fragment() {


    @CallSuper
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    @CallSuper
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    open fun onViewBindingCreated(
        viewBinding: VB,
        savedInstanceState: Bundle?
    ) {
    }

    @CallSuper
    override fun onDestroyView() {
        super.onDestroyView()
    }

    @CallSuper
    open fun onViewBindingDestroyed() {
    }

}