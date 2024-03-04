package com.github.maciej.kaznowski.intervalsicuclient.api

import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import com.github.maciej.kaznowski.intervalsicuclient.model.Athlete
import com.github.maciej.kaznowski.intervalsicuclient.model.AthleteProfile
import com.github.maciej.kaznowski.intervalsicuclient.model.AthleteUpdateDTO
import com.github.maciej.kaznowski.intervalsicuclient.model.SummaryWithCats
import com.github.maciej.kaznowski.intervalsicuclient.model.WithSportSettings

interface AthletesApi {
    /**
     * Get the athlete with sportSettings and custom_items
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Call]<[WithSportSettings]>
     */
    @GET("api/v1/athlete/{id}")
    fun getAthlete(@Path("id") id: kotlin.String): Call<WithSportSettings>

    /**
     * Get athlete profile info
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Call]<[AthleteProfile]>
     */
    @GET("api/v1/athlete/{id}/profile")
    fun getAthleteProfile(@Path("id") id: kotlin.String): Call<AthleteProfile>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param start 
     * @param end 
     * @param tags  (optional)
     * @return [Call]<[kotlin.collections.List<SummaryWithCats>]>
     */
    @GET("api/v1/athlete/{id}/athlete-summary{ext}")
    fun getAthleteSummary(@Path("id") id: kotlin.String, @Query("start") start: kotlin.String, @Query("end") end: kotlin.String, @Query("tags") tags: kotlin.collections.List<kotlin.String>? = null): Call<kotlin.collections.List<SummaryWithCats>>

    /**
     * Get the athlete&#39;s training plan
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Call]<[kotlin.Any]>
     */
    @GET("api/v1/athlete/{id}/training-plan")
    fun getAthleteTrainingPlan(@Path("id") id: kotlin.String): Call<kotlin.Any>

    /**
     * Get the athlete&#39;s settings for phone, tablet or desktop
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param deviceClass 
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.Any>]>
     */
    @GET("api/v1/athlete/{id}/settings/{deviceClass}")
    fun getSettings(@Path("id") id: kotlin.String, @Path("deviceClass") deviceClass: kotlin.String): Call<kotlin.collections.Map<kotlin.String, kotlin.Any>>

    /**
     * Update an athlete
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param athleteUpdateDTO 
     * @return [Call]<[Athlete]>
     */
    @PUT("api/v1/athlete/{id}")
    fun updateAthlete(@Path("id") id: kotlin.String, @Body athleteUpdateDTO: AthleteUpdateDTO): Call<Athlete>

    /**
     * Change the athlete&#39;s training plan
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param athlete 
     * @return [Call]<[kotlin.Any]>
     */
    @PUT("api/v1/athlete/{id}/training-plan")
    fun updateAthletePlan(@Path("id") id: kotlin.String, @Body athlete: Athlete): Call<kotlin.Any>

    /**
     * Change training plans for a list of athletes
     * 
     * Responses:
     *  - 200: OK
     *
     * @param athlete 
     * @return [Call]<[kotlin.Any]>
     */
    @PUT("api/v1/athlete-plans")
    fun updateAthletePlans(@Body athlete: kotlin.collections.List<Athlete>): Call<kotlin.Any>

}
