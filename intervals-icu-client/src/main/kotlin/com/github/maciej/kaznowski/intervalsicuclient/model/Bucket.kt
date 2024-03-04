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
 * @param start 
 * @param secs 
 * @param movingSecs 
 * @param watts 
 * @param hr 
 * @param cadence 
 */
@JsonClass(generateAdapter = true)

data class Bucket (

    @Json(name = "start")
    val start: kotlin.Int? = null,

    @Json(name = "secs")
    val secs: kotlin.Int? = null,

    @Json(name = "movingSecs")
    val movingSecs: kotlin.Int? = null,

    @Json(name = "watts")
    val watts: kotlin.Double? = null,

    @Json(name = "hr")
    val hr: kotlin.Double? = null,

    @Json(name = "cadence")
    val cadence: kotlin.Int? = null

)

