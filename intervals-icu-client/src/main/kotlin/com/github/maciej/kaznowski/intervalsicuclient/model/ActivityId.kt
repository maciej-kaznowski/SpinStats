/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.github.maciej.kaznowski.intervalsicuclient.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param icuAthleteId 
 * @param id 
 */
@JsonClass(generateAdapter = true)

data class ActivityId (

    @Json(name = "icu_athlete_id")
    val icuAthleteId: kotlin.String? = null,

    @Json(name = "id")
    val id: kotlin.String? = null

)

