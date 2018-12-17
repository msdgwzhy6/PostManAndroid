package com.simple.postman.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.simple.postman.R
import com.simple.postman.request.RequestFragment
import com.simple.postman.response.ResponseFragment

class ContainerFragment : Fragment() {

    private lateinit var mViewPager: ViewPager
    private lateinit var mTabLayout: TabLayout

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_container, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mViewPager = view.findViewById(R.id.viewPager)
        mTabLayout = view.findViewById(R.id.tabLayout)

        val adapter = fragmentManager?.let {
            VpAdapter(it).apply {
                addItem(RequestFragment(), getString(R.string.request))
                addItem(ResponseFragment(), getString(R.string.response))
            }
        }
        mViewPager.adapter = adapter
        mTabLayout.setupWithViewPager(mViewPager)
    }
}