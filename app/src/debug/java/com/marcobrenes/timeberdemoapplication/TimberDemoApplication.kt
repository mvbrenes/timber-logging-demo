package com.marcobrenes.timeberdemoapplication

import android.app.Application
import timber.log.Timber

class TimberDemoApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(object : Timber.DebugTree() {
            // Add the line number to the tag
            override fun createStackElementTag(element: StackTraceElement): String? {
                return "${super.createStackElementTag(element)}:${element.lineNumber}"
            }
        })
    }
}
