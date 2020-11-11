package com.example.hilttutorial.stats

import android.os.Handler
import android.os.Looper
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StatsViewModel @ViewModelInject constructor(): ViewModel() {

    val statsLiveData = MutableLiveData<Int>()
    private var i = 0
    private var runnable: Runnable? = null

    fun startStatsCollection() {
        val h = Handler(Looper.getMainLooper())
        runnable = Runnable {
            statsLiveData.value = ++i
            h.postDelayed(runnable!!, 500)
        }
        h.postDelayed(runnable!!, 500)
    }
}