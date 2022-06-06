package com.zibro.football_live.di

import android.content.Context
import com.zibro.data.api.FootballApi
import com.zibro.football_live.BuildConfig
import com.zibro.presentation.util.Constants.FOOTBALL_BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Provides
    fun provideOkHttpClient(
        @ApplicationContext context: Context
    ) : OkHttpClient = OkHttpClient.Builder().apply {
        if(BuildConfig.DEBUG){
            val loggingInterceptor = HttpLoggingInterceptor()
            loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
            addInterceptor(loggingInterceptor)
        }
    }
            //Api 요청 시 마다 Header에 Api key 넣어서 전송
        .addInterceptor {
            val newRequest = it.request().newBuilder()
                .addHeader("x-apisports-key", BuildConfig.API_SPORTS_KEY)
                .build()
            it.proceed(newRequest)
        }
        .connectTimeout(1, TimeUnit.MINUTES)
        .readTimeout(30,TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .build()

    @Provides
    @Singleton
    fun provideFootballApiRetrofit(okHttpClient: OkHttpClient) : Retrofit =
        Retrofit.Builder()
            .baseUrl(FOOTBALL_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()

    @Provides
    fun provideFootballApiService(retrofit: Retrofit) : FootballApi = retrofit.create(FootballApi::class.java)
}