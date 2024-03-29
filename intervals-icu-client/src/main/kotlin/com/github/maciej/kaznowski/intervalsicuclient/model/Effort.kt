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
 * @param startIndex 
 * @param endIndex 
 * @param average 
 * @param duration 
 * @param distance 
 */
@JsonClass(generateAdapter = true)

data class Effort (

    @Json(name = "start_index")
    val startIndex: kotlin.Int? = null,

    @Json(name = "end_index")
    val endIndex: kotlin.Int? = null,

    @Json(name = "average")
    val average: kotlin.Float? = null,

    @Json(name = "duration")
    val duration: kotlin.Int? = null,

    @Json(name = "distance")
    val distance: kotlin.Float? = null

)

