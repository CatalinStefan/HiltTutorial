package com.example.hilttutorial.network

import android.util.Log
import com.example.hilttutorial.TAG
import javax.inject.Inject

class CallInterceptorImpl @Inject constructor(): Interceptor {
    override fun log(message: String) {
        Log.d(TAG, "This is a call interceptor: $message")
    }
}