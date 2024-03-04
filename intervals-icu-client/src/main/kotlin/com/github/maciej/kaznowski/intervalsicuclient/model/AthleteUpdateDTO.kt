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

import com.github.maciej.kaznowski.intervalsicuclient.model.ActivityFilter
import com.github.maciej.kaznowski.intervalsicuclient.model.Settings
import com.github.maciej.kaznowski.intervalsicuclient.model.StravaGear

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param name 
 * @param firstname 
 * @param lastname 
 * @param profileMedium 
 * @param measurementPreference 
 * @param weightPrefLb 
 * @param fahrenheit 
 * @param windSpeed 
 * @param rain 
 * @param weight 
 * @param email 
 * @param sex 
 * @param city 
 * @param state 
 * @param country 
 * @param bikes 
 * @param shoes 
 * @param timezone 
 * @param locale 
 * @param visibility 
 * @param icuRestingHr 
 * @param icuWeight 
 * @param icuWeightSync 
 * @param icuLastSeen 
 * @param icuActivated 
 * @param icuQueuePos 
 * @param icuAdmin 
 * @param icuFriendInviteToken 
 * @param icuPermission 
 * @param icuEffortSecs 
 * @param icuCoach 
 * @param bio 
 * @param website 
 * @param icuDateOfBirth 
 * @param icuApiKey 
 * @param icuTypeSettings 
 * @param icuFormAsPercent 
 * @param icuMmpDays 
 * @param icuWellnessPrompt 
 * @param icuWellnessKeys 
 * @param icuTrackMenstrualCycle 
 * @param icuMenstrualCyclePerm 
 * @param icuGarminHealth 
 * @param icuGarminTraining 
 * @param icuGarminSyncActivities 
 * @param garminSyncActivityTypes 
 * @param garminSyncAfter 
 * @param icuGarminDownloadWellness 
 * @param icuGarminUploadWorkouts 
 * @param icuGarminOutdoorPowerRange 
 * @param icuGarminHrRange 
 * @param garminPaceRange 
 * @param garminPowerTarget 
 * @param icuGarminLastUpload 
 * @param icuGarminUploadFilters 
 * @param icuGarminWellnessKeys 
 * @param openStepDuration 
 * @param polarScope 
 * @param polarSyncActivities 
 * @param polarDownloadWellness 
 * @param polarWellnessKeys 
 * @param suuntoScope 
 * @param suuntoUserId 
 * @param suuntoSyncActivities 
 * @param suuntoUploadWorkouts 
 * @param suuntoOutdoorPowerRange 
 * @param suuntoHrRange 
 * @param suuntoPaceRange 
 * @param suuntoLastUpload 
 * @param suuntoUploadFilters 
 * @param corosUserId 
 * @param corosSyncActivities 
 * @param corosUploadWorkouts 
 * @param corosDownloadWellness 
 * @param corosLastUpload 
 * @param wahooUserId 
 * @param wahooSyncActivities 
 * @param wahooUploadWorkouts 
 * @param dropboxScope 
 * @param ouraScope 
 * @param ouraWellnessKeys 
 * @param googleScope 
 * @param googleWellnessKeys 
 * @param icuEmailVerified 
 * @param icuEmailDisabled 
 * @param icuSendAchievements 
 * @param icuSendNewsletter 
 * @param icuSendPrivateChat 
 * @param icuSendPrivateMsg 
 * @param icuSendFollowReq 
 * @param icuSendGroupChat 
 * @param icuSendGroupMsg 
 * @param icuSendActivityChat 
 * @param icuSendFollowedActivityChat 
 * @param icuSendCoachedActivityChat 
 * @param icuSendActivityMsg 
 * @param icuSendCoachMeReq 
 * @param icuSendGearAlerts 
 * @param icuSendPlanForWeek 
 * @param includeDescrInPlanForWeek 
 * @param icuSendFollowedNewActivity 
 * @param icuSendCoachedNewActivity 
 * @param stravaAllowed 
 * @param stravaId 
 * @param scope 
 * @param stravaSyncActivities 
 * @param stravaSyncOtherActivities 
 * @param ignoreStravaGear 
 * @param updateStravaName 
 * @param plan 
 * @param planExpires 
 * @param trialEndDate 
 * @param hasPassword 
 * @param currency 
 * @param trainingPlanId 
 * @param trainingPlanStartDate 
 * @param recalcHrZones 
 * @param applyToAll 
 * @param localDate 
 * @param password 
 * @param stravaAuthorized 
 */
@JsonClass(generateAdapter = true)

data class AthleteUpdateDTO (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "firstname")
    val firstname: kotlin.String? = null,

    @Json(name = "lastname")
    val lastname: kotlin.String? = null,

    @Json(name = "profile_medium")
    val profileMedium: kotlin.String? = null,

    @Json(name = "measurement_preference")
    val measurementPreference: kotlin.String? = null,

    @Json(name = "weight_pref_lb")
    val weightPrefLb: kotlin.Boolean? = null,

    @Json(name = "fahrenheit")
    val fahrenheit: kotlin.Boolean? = null,

    @Json(name = "wind_speed")
    val windSpeed: AthleteUpdateDTO.WindSpeed? = null,

    @Json(name = "rain")
    val rain: AthleteUpdateDTO.Rain? = null,

    @Json(name = "weight")
    val weight: kotlin.Float? = null,

    @Json(name = "email")
    val email: kotlin.String? = null,

    @Json(name = "sex")
    val sex: kotlin.String? = null,

    @Json(name = "city")
    val city: kotlin.String? = null,

    @Json(name = "state")
    val state: kotlin.String? = null,

    @Json(name = "country")
    val country: kotlin.String? = null,

    @Json(name = "bikes")
    val bikes: kotlin.collections.List<StravaGear>? = null,

    @Json(name = "shoes")
    val shoes: kotlin.collections.List<StravaGear>? = null,

    @Json(name = "timezone")
    val timezone: kotlin.String? = null,

    @Json(name = "locale")
    val locale: kotlin.String? = null,

    @Json(name = "visibility")
    val visibility: AthleteUpdateDTO.Visibility? = null,

    @Json(name = "icu_resting_hr")
    val icuRestingHr: kotlin.Int? = null,

    @Json(name = "icu_weight")
    val icuWeight: kotlin.Float? = null,

    @Json(name = "icu_weight_sync")
    val icuWeightSync: AthleteUpdateDTO.IcuWeightSync? = null,

    @Json(name = "icu_last_seen")
    val icuLastSeen: java.time.OffsetDateTime? = null,

    @Json(name = "icu_activated")
    val icuActivated: java.time.OffsetDateTime? = null,

    @Json(name = "icu_queue_pos")
    val icuQueuePos: kotlin.Int? = null,

    @Json(name = "icu_admin")
    val icuAdmin: kotlin.Boolean? = null,

    @Json(name = "icu_friend_invite_token")
    val icuFriendInviteToken: kotlin.String? = null,

    @Json(name = "icu_permission")
    val icuPermission: AthleteUpdateDTO.IcuPermission? = null,

    @Json(name = "icu_effort_secs")
    val icuEffortSecs: kotlin.collections.List<kotlin.Int>? = null,

    @Json(name = "icu_coach")
    val icuCoach: kotlin.Boolean? = null,

    @Json(name = "bio")
    val bio: kotlin.String? = null,

    @Json(name = "website")
    val website: kotlin.String? = null,

    @Json(name = "icu_date_of_birth")
    val icuDateOfBirth: kotlin.String? = null,

    @Json(name = "icu_api_key")
    val icuApiKey: kotlin.String? = null,

    @Json(name = "icu_type_settings")
    val icuTypeSettings: kotlin.collections.List<Settings>? = null,

    @Json(name = "icu_form_as_percent")
    val icuFormAsPercent: kotlin.Boolean? = null,

    @Json(name = "icu_mmp_days")
    val icuMmpDays: kotlin.Int? = null,

    @Json(name = "icu_wellness_prompt")
    val icuWellnessPrompt: kotlin.Boolean? = null,

    @Json(name = "icu_wellness_keys")
    val icuWellnessKeys: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "icu_track_menstrual_cycle")
    val icuTrackMenstrualCycle: kotlin.Boolean? = null,

    @Json(name = "icu_menstrual_cycle_perm")
    val icuMenstrualCyclePerm: AthleteUpdateDTO.IcuMenstrualCyclePerm? = null,

    @Json(name = "icu_garmin_health")
    val icuGarminHealth: kotlin.Boolean? = null,

    @Json(name = "icu_garmin_training")
    val icuGarminTraining: kotlin.Boolean? = null,

    @Json(name = "icu_garmin_sync_activities")
    val icuGarminSyncActivities: kotlin.Boolean? = null,

    @Json(name = "garmin_sync_activity_types")
    val garminSyncActivityTypes: kotlin.collections.List<AthleteUpdateDTO.GarminSyncActivityTypes>? = null,

    @Json(name = "garmin_sync_after")
    val garminSyncAfter: java.time.OffsetDateTime? = null,

    @Json(name = "icu_garmin_download_wellness")
    val icuGarminDownloadWellness: kotlin.Boolean? = null,

    @Json(name = "icu_garmin_upload_workouts")
    val icuGarminUploadWorkouts: kotlin.Boolean? = null,

    @Json(name = "icu_garmin_outdoor_power_range")
    val icuGarminOutdoorPowerRange: kotlin.Float? = null,

    @Json(name = "icu_garmin_hr_range")
    val icuGarminHrRange: kotlin.Float? = null,

    @Json(name = "garmin_pace_range")
    val garminPaceRange: kotlin.Float? = null,

    @Json(name = "garmin_power_target")
    val garminPowerTarget: AthleteUpdateDTO.GarminPowerTarget? = null,

    @Json(name = "icu_garmin_last_upload")
    val icuGarminLastUpload: java.time.OffsetDateTime? = null,

    @Json(name = "icu_garmin_upload_filters")
    val icuGarminUploadFilters: kotlin.collections.List<ActivityFilter>? = null,

    @Json(name = "icu_garmin_wellness_keys")
    val icuGarminWellnessKeys: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "open_step_duration")
    val openStepDuration: kotlin.Int? = null,

    @Json(name = "polar_scope")
    val polarScope: kotlin.String? = null,

    @Json(name = "polar_sync_activities")
    val polarSyncActivities: kotlin.Boolean? = null,

    @Json(name = "polar_download_wellness")
    val polarDownloadWellness: kotlin.Boolean? = null,

    @Json(name = "polar_wellness_keys")
    val polarWellnessKeys: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "suunto_scope")
    val suuntoScope: kotlin.String? = null,

    @Json(name = "suunto_user_id")
    val suuntoUserId: kotlin.String? = null,

    @Json(name = "suunto_sync_activities")
    val suuntoSyncActivities: kotlin.Boolean? = null,

    @Json(name = "suunto_upload_workouts")
    val suuntoUploadWorkouts: kotlin.Boolean? = null,

    @Json(name = "suunto_outdoor_power_range")
    val suuntoOutdoorPowerRange: kotlin.Float? = null,

    @Json(name = "suunto_hr_range")
    val suuntoHrRange: kotlin.Float? = null,

    @Json(name = "suunto_pace_range")
    val suuntoPaceRange: kotlin.Float? = null,

    @Json(name = "suunto_last_upload")
    val suuntoLastUpload: java.time.OffsetDateTime? = null,

    @Json(name = "suunto_upload_filters")
    val suuntoUploadFilters: kotlin.collections.List<ActivityFilter>? = null,

    @Json(name = "coros_user_id")
    val corosUserId: kotlin.String? = null,

    @Json(name = "coros_sync_activities")
    val corosSyncActivities: kotlin.Boolean? = null,

    @Json(name = "coros_upload_workouts")
    val corosUploadWorkouts: kotlin.Boolean? = null,

    @Json(name = "coros_download_wellness")
    val corosDownloadWellness: kotlin.Boolean? = null,

    @Json(name = "coros_last_upload")
    val corosLastUpload: java.time.OffsetDateTime? = null,

    @Json(name = "wahoo_user_id")
    val wahooUserId: kotlin.String? = null,

    @Json(name = "wahoo_sync_activities")
    val wahooSyncActivities: kotlin.Boolean? = null,

    @Json(name = "wahoo_upload_workouts")
    val wahooUploadWorkouts: kotlin.Boolean? = null,

    @Json(name = "dropbox_scope")
    val dropboxScope: kotlin.String? = null,

    @Json(name = "oura_scope")
    val ouraScope: kotlin.String? = null,

    @Json(name = "oura_wellness_keys")
    val ouraWellnessKeys: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "google_scope")
    val googleScope: kotlin.String? = null,

    @Json(name = "google_wellness_keys")
    val googleWellnessKeys: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "icu_email_verified")
    val icuEmailVerified: kotlin.Boolean? = null,

    @Json(name = "icu_email_disabled")
    val icuEmailDisabled: kotlin.String? = null,

    @Json(name = "icu_send_achievements")
    val icuSendAchievements: kotlin.Boolean? = null,

    @Json(name = "icu_send_newsletter")
    val icuSendNewsletter: kotlin.Boolean? = null,

    @Json(name = "icu_send_private_chat")
    val icuSendPrivateChat: kotlin.Boolean? = null,

    @Json(name = "icu_send_private_msg")
    val icuSendPrivateMsg: kotlin.Boolean? = null,

    @Json(name = "icu_send_follow_req")
    val icuSendFollowReq: kotlin.Boolean? = null,

    @Json(name = "icu_send_group_chat")
    val icuSendGroupChat: kotlin.Boolean? = null,

    @Json(name = "icu_send_group_msg")
    val icuSendGroupMsg: kotlin.Boolean? = null,

    @Json(name = "icu_send_activity_chat")
    val icuSendActivityChat: kotlin.Boolean? = null,

    @Json(name = "icu_send_followed_activity_chat")
    val icuSendFollowedActivityChat: kotlin.Boolean? = null,

    @Json(name = "icu_send_coached_activity_chat")
    val icuSendCoachedActivityChat: kotlin.Boolean? = null,

    @Json(name = "icu_send_activity_msg")
    val icuSendActivityMsg: kotlin.Boolean? = null,

    @Json(name = "icu_send_coach_me_req")
    val icuSendCoachMeReq: kotlin.Boolean? = null,

    @Json(name = "icu_send_gear_alerts")
    val icuSendGearAlerts: kotlin.Boolean? = null,

    @Json(name = "icu_send_plan_for_week")
    val icuSendPlanForWeek: kotlin.Boolean? = null,

    @Json(name = "include_descr_in_plan_for_week")
    val includeDescrInPlanForWeek: kotlin.Boolean? = null,

    @Json(name = "icu_send_followed_new_activity")
    val icuSendFollowedNewActivity: kotlin.Boolean? = null,

    @Json(name = "icu_send_coached_new_activity")
    val icuSendCoachedNewActivity: kotlin.Boolean? = null,

    @Json(name = "strava_allowed")
    val stravaAllowed: kotlin.Boolean? = null,

    @Json(name = "strava_id")
    val stravaId: kotlin.Int? = null,

    @Json(name = "scope")
    val scope: kotlin.String? = null,

    @Json(name = "strava_sync_activities")
    val stravaSyncActivities: kotlin.Boolean? = null,

    @Json(name = "strava_sync_other_activities")
    val stravaSyncOtherActivities: kotlin.Boolean? = null,

    @Json(name = "ignore_strava_gear")
    val ignoreStravaGear: kotlin.Boolean? = null,

    @Json(name = "update_strava_name")
    val updateStravaName: kotlin.Boolean? = null,

    @Json(name = "plan")
    val plan: AthleteUpdateDTO.Plan? = null,

    @Json(name = "plan_expires")
    val planExpires: java.time.OffsetDateTime? = null,

    @Json(name = "trial_end_date")
    val trialEndDate: java.time.OffsetDateTime? = null,

    @Json(name = "has_password")
    val hasPassword: kotlin.Boolean? = null,

    @Json(name = "currency")
    val currency: kotlin.String? = null,

    @Json(name = "training_plan_id")
    val trainingPlanId: kotlin.Int? = null,

    @Json(name = "training_plan_start_date")
    val trainingPlanStartDate: kotlin.String? = null,

    @Json(name = "recalcHrZones")
    val recalcHrZones: kotlin.Boolean? = null,

    @Json(name = "applyToAll")
    val applyToAll: kotlin.Boolean? = null,

    @Json(name = "localDate")
    val localDate: kotlin.String? = null,

    @Json(name = "password")
    val password: kotlin.String? = null,

    @Json(name = "strava_authorized")
    val stravaAuthorized: kotlin.Boolean? = null

) {

    /**
     * 
     *
     * Values: MPS,KNOTS,KMH,MPH,BFT
     */
    @JsonClass(generateAdapter = false)
    enum class WindSpeed(val value: kotlin.String) {
        @Json(name = "MPS") MPS("MPS"),
        @Json(name = "KNOTS") KNOTS("KNOTS"),
        @Json(name = "KMH") KMH("KMH"),
        @Json(name = "MPH") MPH("MPH"),
        @Json(name = "BFT") BFT("BFT");
    }
    /**
     * 
     *
     * Values: MM,INCHES
     */
    @JsonClass(generateAdapter = false)
    enum class Rain(val value: kotlin.String) {
        @Json(name = "MM") MM("MM"),
        @Json(name = "INCHES") INCHES("INCHES");
    }
    /**
     * 
     *
     * Values: PRIVATE,PUBLIC
     */
    @JsonClass(generateAdapter = false)
    enum class Visibility(val value: kotlin.String) {
        @Json(name = "PRIVATE") PRIVATE("PRIVATE"),
        @Json(name = "PUBLIC") PUBLIC("PUBLIC");
    }
    /**
     * 
     *
     * Values: NONE,STRAVA
     */
    @JsonClass(generateAdapter = false)
    enum class IcuWeightSync(val value: kotlin.String) {
        @Json(name = "NONE") NONE("NONE"),
        @Json(name = "STRAVA") STRAVA("STRAVA");
    }
    /**
     * 
     *
     * Values: NONE,READ,WRITE
     */
    @JsonClass(generateAdapter = false)
    enum class IcuPermission(val value: kotlin.String) {
        @Json(name = "NONE") NONE("NONE"),
        @Json(name = "READ") READ("READ"),
        @Json(name = "WRITE") WRITE("WRITE");
    }
    /**
     * 
     *
     * Values: NONE,READ,WRITE
     */
    @JsonClass(generateAdapter = false)
    enum class IcuMenstrualCyclePerm(val value: kotlin.String) {
        @Json(name = "NONE") NONE("NONE"),
        @Json(name = "READ") READ("READ"),
        @Json(name = "WRITE") WRITE("WRITE");
    }
    /**
     * 
     *
     * Values: RIDE,RUN,SWIM,WEIGHT_TRAINING,HIKE,WALK,ALPINE_SKI,BACKCOUNTRY_SKI,BADMINTON,CANOEING,CROSSFIT,E_BIKE_RIDE,E_MOUNTAIN_BIKE_RIDE,ELLIPTICAL,GOLF,GRAVEL_RIDE,HANDCYCLE,HIGH_INTENSITY_INTERVAL_TRAINING,HOCKEY,ICE_SKATE,INLINE_SKATE,KAYAKING,KITESURF,MOUNTAIN_BIKE_RIDE,NORDIC_SKI,OPEN_WATER_SWIM,PADEL,PILATES,PICKLEBALL,RACQUETBALL,RUGBY,ROCK_CLIMBING,ROLLER_SKI,ROWING,SAIL,SKATEBOARD,SNOWBOARD,SNOWSHOE,SOCCER,SQUASH,STAIR_STEPPER,STAND_UP_PADDLING,SURFING,TABLE_TENNIS,TENNIS,TRAIL_RUN,TRANSITION,VELOMOBILE,VIRTUAL_RIDE,VIRTUAL_ROW,VIRTUAL_RUN,WATER_SPORT,WHEELCHAIR,WINDSURF,WORKOUT,YOGA,OTHER
     */
    @JsonClass(generateAdapter = false)
    enum class GarminSyncActivityTypes(val value: kotlin.String) {
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
     * Values: POWER_LAP,POWER,POWER_3_S,POWER_10_S,POWER_30_S
     */
    @JsonClass(generateAdapter = false)
    enum class GarminPowerTarget(val value: kotlin.String) {
        @Json(name = "POWER_LAP") POWER_LAP("POWER_LAP"),
        @Json(name = "POWER") POWER("POWER"),
        @Json(name = "POWER_3S") POWER_3_S("POWER_3S"),
        @Json(name = "POWER_10S") POWER_10_S("POWER_10S"),
        @Json(name = "POWER_30S") POWER_30_S("POWER_30S");
    }
    /**
     * 
     *
     * Values: FREE,PREMIUM,SUPPORTER,WHITELABEL
     */
    @JsonClass(generateAdapter = false)
    enum class Plan(val value: kotlin.String) {
        @Json(name = "FREE") FREE("FREE"),
        @Json(name = "PREMIUM") PREMIUM("PREMIUM"),
        @Json(name = "SUPPORTER") SUPPORTER("SUPPORTER"),
        @Json(name = "WHITELABEL") WHITELABEL("WHITELABEL");
    }
}

