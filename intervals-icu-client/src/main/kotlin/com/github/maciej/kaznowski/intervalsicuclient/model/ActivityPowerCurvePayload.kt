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

import com.github.maciej.kaznowski.intervalsicuclient.model.ActivityPowerCurve

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param afterKj 
 * @param secs 
 * @param curves 
 */
@JsonClass(generateAdapter = true)

data class ActivityPowerCurvePayload (

    @Json(name = "after_kj")
    val afterKj: kotlin.Int? = null,

    @Json(name = "secs")
    val secs: kotlin.collections.List<kotlin.Int>? = null,

    @Json(name = "curves")
    val curves: kotlin.collections.List<ActivityPowerCurve>? = null

)

