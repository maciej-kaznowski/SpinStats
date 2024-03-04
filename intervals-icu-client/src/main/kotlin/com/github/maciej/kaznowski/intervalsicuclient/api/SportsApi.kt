package com.github.maciej.kaznowski.intervalsicuclient.api

import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import com.github.maciej.kaznowski.intervalsicuclient.model.ActivityMini
import com.github.maciej.kaznowski.intervalsicuclient.model.PaceDistancesDTO
import com.github.maciej.kaznowski.intervalsicuclient.model.SportSettings

interface SportsApi {
    /**
     * Apply sport settings to matching activities (updates zones), done asynchronously
     * 
     * Responses:
     *  - 200: OK
     *
     * @param athleteId 
     * @param id 
     * @return [Call]<[kotlin.Any]>
     */
    @PUT("api/v1/athlete/{athleteId}/sport-settings/{id}/apply")
    fun applyToActivities(@Path("athleteId") athleteId: kotlin.String, @Path("id") id: kotlin.String): Call<kotlin.Any>

    /**
     * Create settings for a sport with default values
     * 
     * Responses:
     *  - 200: OK
     *
     * @param athleteId 
     * @param sportSettings 
     * @return [Call]<[SportSettings]>
     */
    @POST("api/v1/athlete/{athleteId}/sport-settings")
    fun createSettings(@Path("athleteId") athleteId: kotlin.String, @Body sportSettings: SportSettings): Call<SportSettings>

    /**
     * Delete sport settings
     * 
     * Responses:
     *  - 200: OK
     *
     * @param athleteId 
     * @param id 
     * @return [Call]<[kotlin.Any]>
     */
    @DELETE("api/v1/athlete/{athleteId}/sport-settings/{id}")
    fun deleteSettings(@Path("athleteId") athleteId: kotlin.String, @Path("id") id: kotlin.Int): Call<kotlin.Any>

    /**
     * Get sport settings by id or activity type e.g. Run, Ride etc.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param athleteId 
     * @param id 
     * @return [Call]<[SportSettings]>
     */
    @GET("api/v1/athlete/{athleteId}/sport-settings/{id}")
    fun getSettings1(@Path("athleteId") athleteId: kotlin.String, @Path("id") id: kotlin.String): Call<SportSettings>

    /**
     * List activities matching the settings
     * 
     * Responses:
     *  - 200: OK
     *
     * @param athleteId 
     * @param id 
     * @return [Call]<[kotlin.collections.List<ActivityMini>]>
     */
    @GET("api/v1/athlete/{athleteId}/sport-settings/{id}/matching-activities")
    fun listMatchingActivities(@Path("athleteId") athleteId: kotlin.String, @Path("id") id: kotlin.String): Call<kotlin.collections.List<ActivityMini>>

    /**
     * List pace curve distances
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[PaceDistancesDTO]>
     */
    @GET("api/v1/pace_distances")
    fun listPaceDistances(): Call<PaceDistancesDTO>

    /**
     * List pace curve distances and best effort defaults for the sport
     * 
     * Responses:
     *  - 200: OK
     *
     * @param athleteId 
     * @param id 
     * @return [Call]<[PaceDistancesDTO]>
     */
    @GET("api/v1/athlete/{athleteId}/sport-settings/{id}/pace_distances")
    fun listPaceDistancesForSport(@Path("athleteId") athleteId: kotlin.String, @Path("id") id: kotlin.String): Call<PaceDistancesDTO>

    /**
     * List sport settings for the athlete
     * 
     * Responses:
     *  - 200: OK
     *
     * @param athleteId 
     * @return [Call]<[kotlin.collections.List<SportSettings>]>
     */
    @GET("api/v1/athlete/{athleteId}/sport-settings")
    fun listSettings(@Path("athleteId") athleteId: kotlin.String): Call<kotlin.collections.List<SportSettings>>

    /**
     * Update sport settings by id or activity type e.g. Run, Ride etc.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param athleteId 
     * @param id 
     * @param recalcHrZones 
     * @param sportSettings 
     * @return [Call]<[SportSettings]>
     */
    @PUT("api/v1/athlete/{athleteId}/sport-settings/{id}")
    fun updateSettings(@Path("athleteId") athleteId: kotlin.String, @Path("id") id: kotlin.String, @Query("recalcHrZones") recalcHrZones: kotlin.Boolean, @Body sportSettings: SportSettings): Call<SportSettings>

    /**
     * Update multiple sport settings
     * 
     * Responses:
     *  - 200: OK
     *
     * @param athleteId 
     * @param recalcHrZones 
     * @param sportSettings 
     * @return [Call]<[kotlin.collections.List<SportSettings>]>
     */
    @PUT("api/v1/athlete/{athleteId}/sport-settings")
    fun updateSettingsMulti(@Path("athleteId") athleteId: kotlin.String, @Query("recalcHrZones") recalcHrZones: kotlin.Boolean, @Body sportSettings: kotlin.collections.List<SportSettings>): Call<kotlin.collections.List<SportSettings>>

}
