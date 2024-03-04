package com.github.maciej.kaznowski.intervalsicuclient.api

import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import com.github.maciej.kaznowski.intervalsicuclient.model.Gear
import com.github.maciej.kaznowski.intervalsicuclient.model.GearReminder
import com.github.maciej.kaznowski.intervalsicuclient.model.GearStats

interface GearApi {
    /**
     * Recalculate gear stats
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param gearId 
     * @return [Call]<[GearStats]>
     */
    @GET("api/v1/athlete/{id}/gear/{gearId}/calc")
    fun calcDistanceEtc(@Path("id") id: kotlin.String, @Path("gearId") gearId: kotlin.String): Call<GearStats>

    /**
     * Create a new gear or component
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param gear 
     * @return [Call]<[Gear]>
     */
    @POST("api/v1/athlete/{id}/gear")
    fun createGear(@Path("id") id: kotlin.String, @Body gear: Gear): Call<Gear>

    /**
     * Create a new reminder
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param gearId 
     * @param gearReminder 
     * @return [Call]<[Gear]>
     */
    @POST("api/v1/athlete/{id}/gear/{gearId}/reminder")
    fun createReminder(@Path("id") id: kotlin.String, @Path("gearId") gearId: kotlin.String, @Body gearReminder: GearReminder): Call<Gear>

    /**
     * Delete a gear or component
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param gearId 
     * @return [Call]<[Unit]>
     */
    @DELETE("api/v1/athlete/{id}/gear/{gearId}")
    fun deleteGear(@Path("id") id: kotlin.String, @Path("gearId") gearId: kotlin.String): Call<Unit>

    /**
     * Delete a reminder
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param gearId 
     * @param reminderId 
     * @return [Call]<[Gear]>
     */
    @DELETE("api/v1/athlete/{id}/gear/{gearId}/reminder/{reminderId}")
    fun deleteReminder(@Path("id") id: kotlin.String, @Path("gearId") gearId: kotlin.String, @Path("reminderId") reminderId: kotlin.Int): Call<Gear>

    /**
     * List athlete gear (use .csv for CSV format)
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Call]<[kotlin.collections.List<Gear>]>
     */
    @GET("api/v1/athlete/{id}/gear{ext}")
    fun listGear(@Path("id") id: kotlin.String): Call<kotlin.collections.List<Gear>>

    /**
     * Retire a component and replace it with a copy with the same reminders etc.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param gearId 
     * @param gear 
     * @return [Call]<[kotlin.collections.List<Gear>]>
     */
    @POST("api/v1/athlete/{id}/gear/{gearId}/replace")
    fun replaceGear(@Path("id") id: kotlin.String, @Path("gearId") gearId: kotlin.String, @Body gear: Gear): Call<kotlin.collections.List<Gear>>

    /**
     * Update a gear or component
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param gearId 
     * @param gear 
     * @return [Call]<[Gear]>
     */
    @PUT("api/v1/athlete/{id}/gear/{gearId}")
    fun updateGear(@Path("id") id: kotlin.String, @Path("gearId") gearId: kotlin.String, @Body gear: Gear): Call<Gear>

    /**
     * Update a reminder
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param gearId 
     * @param reminderId 
     * @param reset 
     * @param snoozeDays 
     * @param gearReminder 
     * @return [Call]<[Gear]>
     */
    @PUT("api/v1/athlete/{id}/gear/{gearId}/reminder/{reminderId}")
    fun updateReminder(@Path("id") id: kotlin.String, @Path("gearId") gearId: kotlin.String, @Path("reminderId") reminderId: kotlin.Int, @Query("reset") reset: kotlin.Boolean, @Query("snoozeDays") snoozeDays: kotlin.Int, @Body gearReminder: GearReminder): Call<Gear>

}
