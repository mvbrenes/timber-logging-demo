package com.marcobrenes.timeberdemoapplication

import android.app.Application
import timber.log.Timber

class TimberDemoApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        //Crashlytics.start()
        Timber.plant(ReleaseTree())
    }
}
