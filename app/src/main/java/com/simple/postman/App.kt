package com.simple.postman

import android.app.Application

class App : Application() {

    companion object {
        lateinit var app: Application

        fun get() = app
    }

    override fun onCreate() {
        super.onCreate()
        app = this
    }

}