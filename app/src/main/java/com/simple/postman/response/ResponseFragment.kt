package com.simple.postman.response

import androidx.fragment.app.Fragment
import com.simple.postman.R
import com.simple.postman.base.DataBindingFragment
import com.simple.postman.databinding.FragmentResponseBinding

class ResponseFragment : DataBindingFragment<FragmentResponseBinding>() {

    override fun setContentView(): Int {
        return R.layout.fragment_response
    }

}