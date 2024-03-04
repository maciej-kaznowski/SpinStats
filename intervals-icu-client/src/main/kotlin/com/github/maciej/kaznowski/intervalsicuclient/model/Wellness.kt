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

import com.github.maciej.kaznowski.intervalsicuclient.model.SportInfo

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param ctl 
 * @param atl 
 * @param rampRate 
 * @param ctlLoad 
 * @param atlLoad 
 * @param sportInfo 
 * @param updated 
 * @param weight 
 * @param restingHR 
 * @param hrv 
 * @param hrvSDNN 
 * @param menstrualPhase 
 * @param menstrualPhasePredicted 
 * @param kcalConsumed 
 * @param sleepSecs 
 * @param sleepScore 
 * @param sleepQuality 
 * @param avgSleepingHR 
 * @param soreness 
 * @param fatigue 
 * @param stress 
 * @param mood 
 * @param motivation 
 * @param injury 
 * @param spO2 
 * @param systolic 
 * @param diastolic 
 * @param hydration 
 * @param hydrationVolume 
 * @param readiness 
 * @param baevskySI 
 * @param bloodGlucose 
 * @param lactate 
 * @param bodyFat 
 * @param abdomen 
 * @param vo2max 
 * @param comments 
 */
@JsonClass(generateAdapter = true)

data class Wellness (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "ctl")
    val ctl: kotlin.Float? = null,

    @Json(name = "atl")
    val atl: kotlin.Float? = null,

    @Json(name = "rampRate")
    val rampRate: kotlin.Float? = null,

    @Json(name = "ctlLoad")
    val ctlLoad: kotlin.Float? = null,

    @Json(name = "atlLoad")
    val atlLoad: kotlin.Float? = null,

    @Json(name = "sportInfo")
    val sportInfo: kotlin.collections.List<SportInfo>? = null,

    @Json(name = "updated")
    val updated: java.time.OffsetDateTime? = null,

    @Json(name = "weight")
    val weight: kotlin.Float? = null,

    @Json(name = "restingHR")
    val restingHR: kotlin.Int? = null,

    @Json(name = "hrv")
    val hrv: kotlin.Float? = null,

    @Json(name = "hrvSDNN")
    val hrvSDNN: kotlin.Float? = null,

    @Json(name = "menstrualPhase")
    val menstrualPhase: Wellness.MenstrualPhase? = null,

    @Json(name = "menstrualPhasePredicted")
    val menstrualPhasePredicted: Wellness.MenstrualPhasePredicted? = null,

    @Json(name = "kcalConsumed")
    val kcalConsumed: kotlin.Int? = null,

    @Json(name = "sleepSecs")
    val sleepSecs: kotlin.Int? = null,

    @Json(name = "sleepScore")
    val sleepScore: kotlin.Float? = null,

    @Json(name = "sleepQuality")
    val sleepQuality: kotlin.Int? = null,

    @Json(name = "avgSleepingHR")
    val avgSleepingHR: kotlin.Float? = null,

    @Json(name = "soreness")
    val soreness: kotlin.Int? = null,

    @Json(name = "fatigue")
    val fatigue: kotlin.Int? = null,

    @Json(name = "stress")
    val stress: kotlin.Int? = null,

    @Json(name = "mood")
    val mood: kotlin.Int? = null,

    @Json(name = "motivation")
    val motivation: kotlin.Int? = null,

    @Json(name = "injury")
    val injury: kotlin.Int? = null,

    @Json(name = "spO2")
    val spO2: kotlin.Float? = null,

    @Json(name = "systolic")
    val systolic: kotlin.Int? = null,

    @Json(name = "diastolic")
    val diastolic: kotlin.Int? = null,

    @Json(name = "hydration")
    val hydration: kotlin.Int? = null,

    @Json(name = "hydrationVolume")
    val hydrationVolume: kotlin.Float? = null,

    @Json(name = "readiness")
    val readiness: kotlin.Float? = null,

    @Json(name = "baevskySI")
    val baevskySI: kotlin.Float? = null,

    @Json(name = "bloodGlucose")
    val bloodGlucose: kotlin.Float? = null,

    @Json(name = "lactate")
    val lactate: kotlin.Float? = null,

    @Json(name = "bodyFat")
    val bodyFat: kotlin.Float? = null,

    @Json(name = "abdomen")
    val abdomen: kotlin.Float? = null,

    @Json(name = "vo2max")
    val vo2max: kotlin.Float? = null,

    @Json(name = "comments")
    val comments: kotlin.String? = null

) {

    /**
     * 
     *
     * Values: PERIOD,FOLLICULAR,OVULATING,LUTEAL,NONE
     */
    @JsonClass(generateAdapter = false)
    enum class MenstrualPhase(val value: kotlin.String) {
        @Json(name = "PERIOD") PERIOD("PERIOD"),
        @Json(name = "FOLLICULAR") FOLLICULAR("FOLLICULAR"),
        @Json(name = "OVULATING") OVULATING("OVULATING"),
        @Json(name = "LUTEAL") LUTEAL("LUTEAL"),
        @Json(name = "NONE") NONE("NONE");
    }
    /**
     * 
     *
     * Values: PERIOD,FOLLICULAR,OVULATING,LUTEAL,NONE
     */
    @JsonClass(generateAdapter = false)
    enum class MenstrualPhasePredicted(val value: kotlin.String) {
        @Json(name = "PERIOD") PERIOD("PERIOD"),
        @Json(name = "FOLLICULAR") FOLLICULAR("FOLLICULAR"),
        @Json(name = "OVULATING") OVULATING("OVULATING"),
        @Json(name = "LUTEAL") LUTEAL("LUTEAL"),
        @Json(name = "NONE") NONE("NONE");
    }
}
