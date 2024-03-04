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

import com.github.maciej.kaznowski.intervalsicuclient.model.AthleteSearchResult

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param externalId 
 * @param athleteId 
 * @param category 
 * @param types 
 * @param name 
 * @param startDateLocal 
 * @param visibility 
 * @param chatId 
 * @param description 
 * @param website 
 * @param closingDateLocal 
 * @param location 
 * @param address 
 * @param country 
 * @param region 
 * @param lat 
 * @param lon 
 * @param routeFile 
 * @param polyline 
 * @param usageCount 
 * @param owner 
 */
@JsonClass(generateAdapter = true)

data class SharedEvent (

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "external_id")
    val externalId: kotlin.String? = null,

    @Json(name = "athlete_id")
    val athleteId: kotlin.String? = null,

    @Json(name = "category")
    val category: SharedEvent.Category? = null,

    @Json(name = "types")
    val types: kotlin.collections.List<SharedEvent.Types>? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "start_date_local")
    val startDateLocal: kotlin.String? = null,

    @Json(name = "visibility")
    val visibility: SharedEvent.Visibility? = null,

    @Json(name = "chat_id")
    val chatId: kotlin.Int? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "website")
    val website: kotlin.String? = null,

    @Json(name = "closing_date_local")
    val closingDateLocal: kotlin.String? = null,

    @Json(name = "location")
    val location: kotlin.String? = null,

    @Json(name = "address")
    val address: kotlin.String? = null,

    @Json(name = "country")
    val country: kotlin.String? = null,

    @Json(name = "region")
    val region: kotlin.String? = null,

    @Json(name = "lat")
    val lat: kotlin.Float? = null,

    @Json(name = "lon")
    val lon: kotlin.Float? = null,

    @Json(name = "route_file")
    val routeFile: kotlin.String? = null,

    @Json(name = "polyline")
    val polyline: kotlin.String? = null,

    @Json(name = "usage_count")
    val usageCount: kotlin.Int? = null,

    @Json(name = "owner")
    val owner: AthleteSearchResult? = null

) {

    /**
     * 
     *
     * Values: RACE,WORKOUT
     */
    @JsonClass(generateAdapter = false)
    enum class Category(val value: kotlin.String) {
        @Json(name = "RACE") RACE("RACE"),
        @Json(name = "WORKOUT") WORKOUT("WORKOUT");
    }
    /**
     * 
     *
     * Values: RIDE,RUN,SWIM,WEIGHT_TRAINING,HIKE,WALK,ALPINE_SKI,BACKCOUNTRY_SKI,BADMINTON,CANOEING,CROSSFIT,E_BIKE_RIDE,E_MOUNTAIN_BIKE_RIDE,ELLIPTICAL,GOLF,GRAVEL_RIDE,HANDCYCLE,HIGH_INTENSITY_INTERVAL_TRAINING,HOCKEY,ICE_SKATE,INLINE_SKATE,KAYAKING,KITESURF,MOUNTAIN_BIKE_RIDE,NORDIC_SKI,OPEN_WATER_SWIM,PADEL,PILATES,PICKLEBALL,RACQUETBALL,RUGBY,ROCK_CLIMBING,ROLLER_SKI,ROWING,SAIL,SKATEBOARD,SNOWBOARD,SNOWSHOE,SOCCER,SQUASH,STAIR_STEPPER,STAND_UP_PADDLING,SURFING,TABLE_TENNIS,TENNIS,TRAIL_RUN,TRANSITION,VELOMOBILE,VIRTUAL_RIDE,VIRTUAL_ROW,VIRTUAL_RUN,WATER_SPORT,WHEELCHAIR,WINDSURF,WORKOUT,YOGA,OTHER
     */
    @JsonClass(generateAdapter = false)
    enum class Types(val value: kotlin.String) {
        @Json(name = "Ride") RIDE("Ride"),
        @Json(name = "Run") RUN("Run"),
        @Json(name = "Swim") SWIM("Swim"),
        @Json(name = "WeightTraining") WEIGHT_TRAINING("WeightTraining"),
        @Json(name = "Hike") HIKE("Hike"),
        @Json(name = "Walk") WALK("Walk"),
        @Json(name = "AlpineSki") ALPINE_SKI("AlpineSki"),
        @Json(name = "BackcountrySki") BACKCOUNTRY_SKI("BackcountrySki"),
        @Json(name = "Badminton") BADMINTON("Badminton"),
        @Json(name = "Canoeing") CANOEING("Canoeing"),
        @Json(name = "Crossfit") CROSSFIT("Crossfit"),
        @Json(name = "EBikeRide") E_BIKE_RIDE("EBikeRide"),
        @Json(name = "EMountainBikeRide") E_MOUNTAIN_BIKE_RIDE("EMountainBikeRide"),
        @Json(name = "Elliptical") ELLIPTICAL("Elliptical"),
        @Json(name = "Golf") GOLF("Golf"),
        @Json(name = "GravelRide") GRAVEL_RIDE("GravelRide"),
        @Json(name = "Handcycle") HANDCYCLE("Handcycle"),
        @Json(name = "HighIntensityIntervalTraining") HIGH_INTENSITY_INTERVAL_TRAINING("HighIntensityIntervalTraining"),
        @Json(name = "Hockey") HOCKEY("Hockey"),
        @Json(name = "IceSkate") ICE_SKATE("IceSkate"),
        @Json(name = "InlineSkate") INLINE_SKATE("InlineSkate"),
        @Json(name = "Kayaking") KAYAKING("Kayaking"),
        @Json(name = "Kitesurf") KITESURF("Kitesurf"),
        @Json(name = "MountainBikeRide") MOUNTAIN_BIKE_RIDE("MountainBikeRide"),
        @Json(name = "NordicSki") NORDIC_SKI("NordicSki"),
        @Json(name = "OpenWaterSwim") OPEN_WATER_SWIM("OpenWaterSwim"),
        @Json(name = "Padel") PADEL("Padel"),
        @Json(name = "Pilates") PILATES("Pilates"),
        @Json(name = "Pickleball") PICKLEBALL("Pickleball"),
        @Json(name = "Racquetball") RACQUETBALL("Racquetball"),
        @Json(name = "Rugby") RUGBY("Rugby"),
        @Json(name = "RockClimbing") ROCK_CLIMBING("RockClimbing"),
        @Json(name = "RollerSki") ROLLER_SKI("RollerSki"),
        @Json(name = "Rowing") ROWING("Rowing"),
        @Json(name = "Sail") SAIL("Sail"),
        @Json(name = "Skateboard") SKATEBOARD("Skateboard"),
        @Json(name = "Snowboard") SNOWBOARD("Snowboard"),
        @Json(name = "Snowshoe") SNOWSHOE("Snowshoe"),
        @Json(name = "Soccer") SOCCER("Soccer"),
        @Json(name = "Squash") SQUASH("Squash"),
        @Json(name = "StairStepper") STAIR_STEPPER("StairStepper"),
        @Json(name = "StandUpPaddling") STAND_UP_PADDLING("StandUpPaddling"),
        @Json(name = "Surfing") SURFING("Surfing"),
        @Json(name = "TableTennis") TABLE_TENNIS("TableTennis"),
        @Json(name = "Tennis") TENNIS("Tennis"),
        @Json(name = "TrailRun") TRAIL_RUN("TrailRun"),
        @Json(name = "Transition") TRANSITION("Transition"),
        @Json(name = "Velomobile") VELOMOBILE("Velomobile"),
        @Json(name = "VirtualRide") VIRTUAL_RIDE("VirtualRide"),
        @Json(name = "VirtualRow") VIRTUAL_ROW("VirtualRow"),
        @Json(name = "VirtualRun") VIRTUAL_RUN("VirtualRun"),
        @Json(name = "WaterSport") WATER_SPORT("WaterSport"),
        @Json(name = "Wheelchair") WHEELCHAIR("Wheelchair"),
        @Json(name = "Windsurf") WINDSURF("Windsurf"),
        @Json(name = "Workout") WORKOUT("Workout"),
        @Json(name = "Yoga") YOGA("Yoga"),
        @Json(name = "Other") OTHER("Other");
    }
    /**
     * 
     *
     * Values: PUBLIC,GROUP
     */
    @JsonClass(generateAdapter = false)
    enum class Visibility(val value: kotlin.String) {
        @Json(name = "PUBLIC") PUBLIC("PUBLIC"),
        @Json(name = "GROUP") GROUP("GROUP");
    }
}
