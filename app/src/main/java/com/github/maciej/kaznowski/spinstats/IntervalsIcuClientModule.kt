package com.github.maciej.kaznowski.spinstats

import com.github.maciej.kaznowski.intervalsicuclient.api.ActivitiesApi
import com.github.maciej.kaznowski.intervalsicuclient.invoker.auth.HttpBasicAuth
import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.ApiClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class IntervalsIcuClientModule {

    @Provides
    fun providesApiClient(): ApiClient {
        return ApiClient(
            baseUrl = "https://intervals.icu"
        ).addAuthorization("basic", HttpBasicAuth("API_KEY", BuildConfig.INTERVALS_ICU_API_KEY))
    }

    @Provides
    fun providesActivitiesApi(apiClient: ApiClient): ActivitiesApi {
        return apiClient.createService(ActivitiesApi::class.java)
    }
}