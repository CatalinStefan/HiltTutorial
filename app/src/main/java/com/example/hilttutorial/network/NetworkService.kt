package com.example.hilttutorial.network

import android.util.Log
import com.example.hilttutorial.TAG

class NetworkService private constructor(builder: Builder){

    private val protocol: String?
    private val host: String?
    private val path: String?
    private val interceptor: Interceptor?

    init {
        this.protocol = builder.protocol
        this.host = builder.host
        this.path = builder.path
        this.interceptor = builder.interceptor
    }

    fun performNetworkCall(){
        interceptor?.log("Call performed")
        Log.d(TAG, "Network call performed: $this")
    }

    class Builder {
        var protocol: String? = null
            private set
        var host: String? = null
            private set
        var path: String? = null
            private set
        var interceptor: Interceptor? = null
            private set

        fun protocol(protocol: String) = apply { this.protocol = protocol }
        fun host(host: String) = apply { this.host = host }
        fun path(path: String) = apply { this.path = path }
        fun interceptor(interceptor: Interceptor) = apply { this.interceptor = interceptor }
        fun build() = NetworkService(this)
    }
}