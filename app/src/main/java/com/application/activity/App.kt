package com.application.activity

import android.app.Application
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import timber.log.Timber
import timber.log.Timber.DebugTree


class App : Application() {

    val objectInAppClass = "Object"



    class LifeCycleListener : LifecycleObserver {
        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        fun start() {
            // ...
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        fun stop() {
            // ...
        }
    }







    companion object {
        lateinit var instance: App
            private set
    }


    override fun onCreate() {

        super.onCreate()
        instance = this

        if(BuildConfig.DEBUG){
            Timber.plant(DebugTree())
        }
    }

}