package com.example.tunemobilebanking

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class TuneMobileBankingApp: Application() {
    override fun onCreate() {
        super.onCreate()
    }
}