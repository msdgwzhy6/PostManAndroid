package com.simple.postman.request

import android.os.Bundle
import android.view.View
import com.simple.postman.R
import com.simple.postman.base.DataBindingFragment
import com.simple.postman.databinding.FragmentRequestBinding

class RequestFragment : DataBindingFragment<FragmentRequestBinding>() {

    override fun setContentView(): Int {
        return R.layout.fragment_request
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}