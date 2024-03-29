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

import com.github.maciej.kaznowski.intervalsicuclient.model.ActivityHRCurve

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param secs 
 * @param curves 
 */
@JsonClass(generateAdapter = true)

data class ActivityHRCurvePayload (

    @Json(name = "secs")
    val secs: kotlin.collections.List<kotlin.Int>? = null,

    @Json(name = "curves")
    val curves: kotlin.collections.List<ActivityHRCurve>? = null

)

