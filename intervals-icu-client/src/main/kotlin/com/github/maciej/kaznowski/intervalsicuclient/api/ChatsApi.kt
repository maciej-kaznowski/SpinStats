package com.github.maciej.kaznowski.intervalsicuclient.api

import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import com.github.maciej.kaznowski.intervalsicuclient.model.Message
import com.github.maciej.kaznowski.intervalsicuclient.model.NewActivityMsg
import com.github.maciej.kaznowski.intervalsicuclient.model.NewMsg

interface ChatsApi {
    /**
     * List all messages (comments) for the activity
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param sinceId  (optional)
     * @param limit  (optional, default to 100)
     * @return [Call]<[kotlin.collections.List<Message>]>
     */
    @GET("api/v1/activity/{id}/messages")
    fun listActivityMessages(@Path("id") id: kotlin.String, @Query("sinceId") sinceId: kotlin.Long? = null, @Query("limit") limit: kotlin.Int? = 100): Call<kotlin.collections.List<Message>>

    /**
     * Add a message (comment) to an activity
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param newActivityMsg 
     * @return [Call]<[NewMsg]>
     */
    @POST("api/v1/activity/{id}/messages")
    fun sendActivityMessage(@Path("id") id: kotlin.String, @Body newActivityMsg: NewActivityMsg): Call<NewMsg>

}
