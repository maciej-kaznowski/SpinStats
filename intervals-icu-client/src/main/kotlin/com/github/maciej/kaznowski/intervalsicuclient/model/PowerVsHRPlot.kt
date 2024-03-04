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

import com.github.maciej.kaznowski.intervalsicuclient.model.Bucket
import com.github.maciej.kaznowski.intervalsicuclient.model.Curve

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param bucketSize 
 * @param warmup 
 * @param cooldown 
 * @param elapsedTime 
 * @param hrLag 
 * @param powerHr 
 * @param powerHrFirst 
 * @param powerHrSecond 
 * @param decoupling 
 * @param powerHrZ2 
 * @param medianCadenceZ2 
 * @param avgCadenceZ2 
 * @param hrZ2BucketCount 
 * @param start 
 * @param mid 
 * @param end 
 * @param series 
 * @param curves 
 * @param ratioCoefficients 
 */
@JsonClass(generateAdapter = true)

data class PowerVsHRPlot (

    @Json(name = "bucketSize")
    val bucketSize: kotlin.Int? = null,

    @Json(name = "warmup")
    val warmup: kotlin.Int? = null,

    @Json(name = "cooldown")
    val cooldown: kotlin.Int? = null,

    @Json(name = "elapsedTime")
    val elapsedTime: kotlin.Int? = null,

    @Json(name = "hrLag")
    val hrLag: kotlin.Int? = null,

    @Json(name = "powerHr")
    val powerHr: kotlin.Float? = null,

    @Json(name = "powerHrFirst")
    val powerHrFirst: kotlin.Float? = null,

    @Json(name = "powerHrSecond")
    val powerHrSecond: kotlin.Float? = null,

    @Json(name = "decoupling")
    val decoupling: kotlin.Float? = null,

    @Json(name = "powerHrZ2")
    val powerHrZ2: kotlin.Float? = null,

    @Json(name = "medianCadenceZ2")
    val medianCadenceZ2: kotlin.Int? = null,

    @Json(name = "avgCadenceZ2")
    val avgCadenceZ2: kotlin.Int? = null,

    @Json(name = "hrZ2BucketCount")
    val hrZ2BucketCount: kotlin.Int? = null,

    @Json(name = "start")
    val start: kotlin.Int? = null,

    @Json(name = "mid")
    val mid: kotlin.Int? = null,

    @Json(name = "end")
    val end: kotlin.Int? = null,

    @Json(name = "series")
    val series: kotlin.collections.List<Bucket>? = null,

    @Json(name = "curves")
    val curves: kotlin.collections.List<Curve>? = null,

    @Json(name = "ratioCoefficients")
    val ratioCoefficients: kotlin.collections.List<kotlin.Double>? = null

)

