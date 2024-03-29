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
 * @param type 
 * @param criticalPower 
 * @param wPrime 
 * @param pMax 
 * @param inputPointIndexes 
 * @param ftp 
 */
@JsonClass(generateAdapter = true)

data class PowerModel (

    @Json(name = "type")
    val type: PowerModel.Type? = null,

    @Json(name = "criticalPower")
    val criticalPower: kotlin.Int? = null,

    @Json(name = "wPrime")
    val wPrime: kotlin.Int? = null,

    @Json(name = "pMax")
    val pMax: kotlin.Int? = null,

    @Json(name = "inputPointIndexes")
    val inputPointIndexes: kotlin.collections.List<kotlin.Int>? = null,

    @Json(name = "ftp")
    val ftp: kotlin.Int? = null

) {

    /**
     * 
     *
     * Values: MS_2_P,MORTON_3_P,FFT_CURVES,ECP
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "MS_2P") MS_2_P("MS_2P"),
        @Json(name = "MORTON_3P") MORTON_3_P("MORTON_3P"),
        @Json(name = "FFT_CURVES") FFT_CURVES("FFT_CURVES"),
        @Json(name = "ECP") ECP("ECP");
    }
}

