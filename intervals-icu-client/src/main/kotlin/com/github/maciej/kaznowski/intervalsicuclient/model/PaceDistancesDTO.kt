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
 * @param distances 
 * @param defaults 
 */
@JsonClass(generateAdapter = true)

data class PaceDistancesDTO (

    @Json(name = "distances")
    val distances: kotlin.collections.List<kotlin.Float>? = null,

    @Json(name = "defaults")
    val defaults: kotlin.collections.List<kotlin.Float>? = null

)

