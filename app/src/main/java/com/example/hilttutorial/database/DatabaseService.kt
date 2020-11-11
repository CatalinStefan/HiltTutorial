package com.example.hilttutorial.database

import android.util.Log
import com.example.hilttutorial.TAG
import javax.inject.Inject

open class DatabaseService @Inject constructor() {
    fun log(message: String) {
        Log.d(TAG, "DatabaseService message: $message")
    }
}