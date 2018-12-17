package com.simple.postman.base

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class VpAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val mFragments: ArrayList<Fragment> = arrayListOf()
    private val mTitles: ArrayList<CharSequence> = arrayListOf()


    override fun getItem(position: Int): Fragment {
        return mFragments[position]
    }

    override fun getCount(): Int {
        return mFragments.size
    }

    fun addItem(fragment: Fragment, title: CharSequence): VpAdapter {
        mFragments.add(fragment)
        mTitles.add(title)
        return this
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return mTitles[position]
    }
}