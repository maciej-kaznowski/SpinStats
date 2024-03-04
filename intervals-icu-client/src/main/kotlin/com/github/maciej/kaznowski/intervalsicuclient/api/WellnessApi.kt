package com.github.maciej.kaznowski.intervalsicuclient.api

import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import com.github.maciej.kaznowski.intervalsicuclient.model.UploadWellnessRequest
import com.github.maciej.kaznowski.intervalsicuclient.model.Wellness

interface WellnessApi {
    /**
     * Get wellness record for date (local ISO-8601 day)
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param date 
     * @return [Call]<[Wellness]>
     */
    @GET("api/v1/athlete/{id}/wellness/{date}")
    fun getRecord(@Path("id") id: kotlin.String, @Path("date") date: kotlin.String): Call<Wellness>

    /**
     * List wellness records for date range (use .csv for CSV format)
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param oldest Local date of oldest record (ISO-8601) (optional)
     * @param newest Local date of newest record (ISO-8601), inclusive (optional)
     * @param cols Comma separated list of column names to include (optional)
     * @return [Call]<[kotlin.collections.List<Wellness>]>
     */
    @GET("api/v1/athlete/{id}/wellness{ext}")
    fun listWellnessRecords(@Path("id") id: kotlin.String, @Query("oldest") oldest: kotlin.String? = null, @Query("newest") newest: kotlin.String? = null, @Query("cols") cols: kotlin.collections.List<kotlin.String>? = null): Call<kotlin.collections.List<Wellness>>

    /**
     * Update the wellness record for the date (ISO-8601)
     * Only fields provided are changed
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param date 
     * @param wellness 
     * @return [Call]<[Wellness]>
     */
    @PUT("api/v1/athlete/{id}/wellness/{date}")
    fun updateWellness(@Path("id") id: kotlin.String, @Path("date") date: kotlin.String, @Body wellness: Wellness): Call<Wellness>

    /**
     * Update a wellness record, id is the day (ISO-8601)
     * Only fields provided are changed
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param wellness 
     * @return [Call]<[Wellness]>
     */
    @PUT("api/v1/athlete/{id}/wellness")
    fun updateWellness1(@Path("id") id: kotlin.String, @Body wellness: Wellness): Call<Wellness>

    /**
     * Upload wellness records in CSV format as multipart/form-data
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param ignoreMissingFields  (optional, default to false)
     * @param uploadWellnessRequest  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @POST("api/v1/athlete/{id}/wellness")
    fun uploadWellness(@Path("id") id: kotlin.String, @Query("ignoreMissingFields") ignoreMissingFields: kotlin.Boolean? = false, @Body uploadWellnessRequest: UploadWellnessRequest? = null): Call<kotlin.Any>

}
