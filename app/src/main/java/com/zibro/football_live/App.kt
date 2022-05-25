package com.zibro.football_live

import android.app.Application
import androidx.databinding.ktx.BuildConfig
import com.zibro.presentation.util.CustomTimberTree
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class App : Application(){
    companion object{
        var instance : App? = null
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        if(BuildConfig.DEBUG){
            Timber.plant(CustomTimberTree())
        }
    }

    override fun onTerminate() {
        super.onTerminate()
        instance = null
    }
}