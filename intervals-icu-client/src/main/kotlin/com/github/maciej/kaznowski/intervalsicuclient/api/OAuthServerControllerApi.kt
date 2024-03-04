package com.github.maciej.kaznowski.intervalsicuclient.api

import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json


interface OAuthServerControllerApi {
    /**
     * Disconnect the athlete from the app matching the bearer token
     * 
     * Responses:
     *  - 401: Missing or invalid access token
     *  - 200: Success
     *
     * @return [Call]<[Unit]>
     */
    @DELETE("api/v1/disconnect-app")
    fun disconnectApp(): Call<Unit>

}
