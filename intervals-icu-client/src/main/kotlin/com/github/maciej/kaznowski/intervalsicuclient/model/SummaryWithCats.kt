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

import com.github.maciej.kaznowski.intervalsicuclient.model.CategorySummary

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param count 
 * @param time 
 * @param movingTime 
 * @param elapsedTime 
 * @param calories 
 * @param totalElevationGain 
 * @param trainingLoad 
 * @param srpe 
 * @param distance 
 * @param date 
 * @param athleteId 
 * @param athleteName 
 * @param email 
 * @param externalId 
 * @param fitness 
 * @param fatigue 
 * @param form 
 * @param rampRate 
 * @param timeInZones 
 * @param timeInZonesTot 
 * @param byCategory 
 * @param mostRecentWellnessId 
 */
@JsonClass(generateAdapter = true)

data class SummaryWithCats (

    @Json(name = "count")
    val count: kotlin.Int? = null,

    @Json(name = "time")
    val time: kotlin.Int? = null,

    @Json(name = "moving_time")
    val movingTime: kotlin.Int? = null,

    @Json(name = "elapsed_time")
    val elapsedTime: kotlin.Int? = null,

    @Json(name = "calories")
    val calories: kotlin.Int? = null,

    @Json(name = "total_elevation_gain")
    val totalElevationGain: kotlin.Float? = null,

    @Json(name = "training_load")
    val trainingLoad: kotlin.Int? = null,

    @Json(name = "srpe")
    val srpe: kotlin.Int? = null,

    @Json(name = "distance")
    val distance: kotlin.Float? = null,

    @Json(name = "date")
    val date: kotlin.String? = null,

    @Json(name = "athlete_id")
    val athleteId: kotlin.String? = null,

    @Json(name = "athlete_name")
    val athleteName: kotlin.String? = null,

    @Json(name = "email")
    val email: kotlin.String? = null,

    @Json(name = "external_id")
    val externalId: kotlin.String? = null,

    @Json(name = "fitness")
    val fitness: kotlin.Float? = null,

    @Json(name = "fatigue")
    val fatigue: kotlin.Float? = null,

    @Json(name = "form")
    val form: kotlin.Float? = null,

    @Json(name = "rampRate")
    val rampRate: kotlin.Float? = null,

    @Json(name = "timeInZones")
    val timeInZones: kotlin.collections.List<kotlin.Int>? = null,

    @Json(name = "timeInZonesTot")
    val timeInZonesTot: kotlin.Int? = null,

    @Json(name = "byCategory")
    val byCategory: kotlin.collections.List<CategorySummary>? = null,

    @Json(name = "mostRecentWellnessId")
    val mostRecentWellnessId: kotlin.String? = null

)

