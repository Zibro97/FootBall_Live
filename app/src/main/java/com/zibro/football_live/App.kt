package com.zibro.football_live

import android.app.Application
import androidx.databinding.ktx.BuildConfig
import com.zibro.presentation.util.CustomTimberTree
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

class App : Application(){
    companion object{
        lateinit var instance : App
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        if(BuildConfig.DEBUG){
            Timber.plant(CustomTimberTree())
        }
    }
}