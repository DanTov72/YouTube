package com.example.youtube.data.remote.interseptors

import okhttp3.Interceptor
import okhttp3.Response

class ApiKeyInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        val url =
            request.url.newBuilder()
                .addQueryParameter("key", "AIzaSyC4Jb-ySnnKj0HgsVz5MLIo1PjzTUOTkjo").build()
        request = request.newBuilder().url(url).build()
        return chain.proceed(request)
    }
}