package com.simple.postman.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

abstract class DataBindingFragment<T : ViewDataBinding> : Fragment() {

    lateinit var mViewDataBinding: T

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mViewDataBinding = DataBindingUtil.inflate<T>(inflater, setContentView(), container, false)
        return mViewDataBinding.root
    }

    abstract fun setContentView(): Int

}