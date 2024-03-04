package com.github.maciej.kaznowski.intervalsicuclient.api

import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import com.github.maciej.kaznowski.intervalsicuclient.model.CustomItem
import com.github.maciej.kaznowski.intervalsicuclient.model.UploadWellnessRequest

interface CustomItemsApi {
    /**
     * Create a custom item
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param customItem 
     * @return [Call]<[CustomItem]>
     */
    @POST("api/v1/athlete/{id}/custom-item")
    fun createCustomItem(@Path("id") id: kotlin.String, @Body customItem: CustomItem): Call<CustomItem>

    /**
     * Delete a custom item
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param itemId 
     * @return [Call]<[Unit]>
     */
    @DELETE("api/v1/athlete/{id}/custom-item/{itemId}")
    fun deleteCustomItem(@Path("id") id: kotlin.String, @Path("itemId") itemId: kotlin.Int): Call<Unit>

    /**
     * Get a custom item
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param itemId 
     * @return [Call]<[CustomItem]>
     */
    @GET("api/v1/athlete/{id}/custom-item/{itemId}")
    fun getCustomItem(@Path("id") id: kotlin.String, @Path("itemId") itemId: kotlin.Int): Call<CustomItem>

    /**
     * List custom items (charts, custom fields etc.)
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Call]<[kotlin.collections.List<CustomItem>]>
     */
    @GET("api/v1/athlete/{id}/custom-item")
    fun listCustomItems(@Path("id") id: kotlin.String): Call<kotlin.collections.List<CustomItem>>

    /**
     * Update a custom item
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param itemId 
     * @param customItem 
     * @return [Call]<[CustomItem]>
     */
    @PUT("api/v1/athlete/{id}/custom-item/{itemId}")
    fun updateCustomItem(@Path("id") id: kotlin.String, @Path("itemId") itemId: kotlin.Int, @Body customItem: CustomItem): Call<CustomItem>

    /**
     * Upload a new image for a custom item as multipart/form-data
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param itemId 
     * @param uploadWellnessRequest  (optional)
     * @return [Call]<[CustomItem]>
     */
    @POST("api/v1/athlete/{id}/custom-item/{itemId}/image")
    fun updateCustomItemImage(@Path("id") id: kotlin.String, @Path("itemId") itemId: kotlin.Int, @Body uploadWellnessRequest: UploadWellnessRequest? = null): Call<CustomItem>

    /**
     * Re-order custom items
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param customItem 
     * @return [Call]<[Unit]>
     */
    @PUT("api/v1/athlete/{id}/custom-item-indexes")
    fun updateCustomItemIndexes(@Path("id") id: kotlin.String, @Body customItem: kotlin.collections.List<CustomItem>): Call<Unit>

}
