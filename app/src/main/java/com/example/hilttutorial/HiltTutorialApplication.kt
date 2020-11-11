package com.example.hilttutorial

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

const val TAG = "HiltTutorialLogTag"

@HiltAndroidApp
class HiltTutorialApplication: Application() {
}