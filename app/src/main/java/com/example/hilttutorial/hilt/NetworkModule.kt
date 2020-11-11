package com.example.hilttutorial.hilt

import com.example.hilttutorial.MainActivity
import com.example.hilttutorial.network.*
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ViewComponent
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Singleton

@Module
//@InstallIn(ActivityComponent::class, ViewComponent::class)
@InstallIn(ActivityComponent::class)
class NetworkModule {

//    @Binds
//    abstract fun bindNetworkAdapterImpl(networkAdapterImpl: MyAppNetworkAdapter): NetworkAdapter

//    @Provides
//    fun provideNetworkService(): NetworkService {
//        return NetworkService.Builder()
//            .host("google.com")
//            .protocol("HTTPS")
//            .build()
//    }

    @ActivityScoped
    @CallInterceptor
    @Provides
    fun provideCallNetworkService(): NetworkService {
        return NetworkService.Builder()
            .host("google.com")
            .protocol("HTTPS")
            .interceptor(CallInterceptorImpl())
            .build()
    }

    @ActivityScoped
    @ResponseInterceptor
    @Provides
    fun provideResponseNetworkService(): NetworkService {
        return NetworkService.Builder()
            .host("google.com")
            .protocol("HTTPS")
            .interceptor(ResponseInterceptorImpl())
            .build()
    }

}