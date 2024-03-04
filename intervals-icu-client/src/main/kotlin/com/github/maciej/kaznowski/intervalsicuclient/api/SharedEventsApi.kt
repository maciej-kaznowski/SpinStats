package com.github.maciej.kaznowski.intervalsicuclient.api

import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import com.github.maciej.kaznowski.intervalsicuclient.model.SharedEvent

interface SharedEventsApi {
    /**
     * Create a shared event (e.g. race)
     * 
     * Responses:
     *  - 200: OK
     *
     * @param sharedEvent 
     * @param linkToEventId  (optional)
     * @return [Call]<[SharedEvent]>
     */
    @POST("api/v1/shared-event")
    fun createSharedEvent(@Body sharedEvent: SharedEvent, @Query("linkToEventId") linkToEventId: kotlin.Int? = null): Call<SharedEvent>

    /**
     * Delete a shared event (e.g. race)
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Call]<[Unit]>
     */
    @DELETE("api/v1/shared-event/{id}")
    fun deleteSharedEvent(@Path("id") id: kotlin.Int): Call<Unit>

    /**
     * Get a shared event (e.g. race)
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Call]<[SharedEvent]>
     */
    @GET("api/v1/shared-event/{id}")
    fun getSharedEvent(@Path("id") id: kotlin.Int): Call<SharedEvent>

    /**
     * Update a shared event (e.g. race)
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param sharedEvent 
     * @return [Call]<[SharedEvent]>
     */
    @PUT("api/v1/shared-event/{id}")
    fun updateSharedEvent(@Path("id") id: kotlin.Int, @Body sharedEvent: SharedEvent): Call<SharedEvent>

}
