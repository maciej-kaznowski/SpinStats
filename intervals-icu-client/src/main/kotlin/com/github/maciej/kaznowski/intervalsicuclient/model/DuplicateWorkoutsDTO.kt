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
 * @param numCopies 
 * @param weeksBetween 
 * @param workoutIds 
 */
@JsonClass(generateAdapter = true)

data class DuplicateWorkoutsDTO (

    @Json(name = "numCopies")
    val numCopies: kotlin.Int? = null,

    @Json(name = "weeksBetween")
    val weeksBetween: kotlin.Int? = null,

    @Json(name = "workoutIds")
    val workoutIds: kotlin.collections.List<kotlin.Int>? = null

)

