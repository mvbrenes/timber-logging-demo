package com.marcobrenes.timeberdemoapplication


import android.util.Log
import timber.log.Timber

private const val MAX_LONG_LENGTH = 4000

class ReleaseTree : Timber.Tree() {

    override fun isLoggable(tag: String?, priority: Int): Boolean {
        // Only log WARN, ERROR
        return when(priority) {
            Log.VERBOSE, Log.DEBUG, Log.INFO -> false
            else -> true
        }
    }

    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        if (isLoggable(tag, priority)) {
            // Report caught exceptions to Crashlytics
            if (priority == Log.ERROR && t != null) {
                // Crashlytics.log(e)
            }
        }
    }
}