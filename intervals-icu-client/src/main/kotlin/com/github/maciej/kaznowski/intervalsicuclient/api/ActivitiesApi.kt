package com.github.maciej.kaznowski.intervalsicuclient.api

import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import com.github.maciej.kaznowski.intervalsicuclient.model.Activity
import com.github.maciej.kaznowski.intervalsicuclient.model.ActivityFilter
import com.github.maciej.kaznowski.intervalsicuclient.model.ActivityHRCurvePayload
import com.github.maciej.kaznowski.intervalsicuclient.model.ActivityId
import com.github.maciej.kaznowski.intervalsicuclient.model.ActivityPowerCurvePayload
import com.github.maciej.kaznowski.intervalsicuclient.model.ActivitySearchResult
import com.github.maciej.kaznowski.intervalsicuclient.model.ActivityStream
import com.github.maciej.kaznowski.intervalsicuclient.model.BestEfforts
import com.github.maciej.kaznowski.intervalsicuclient.model.Bucket
import com.github.maciej.kaznowski.intervalsicuclient.model.DataCurveSetHRCurve
import com.github.maciej.kaznowski.intervalsicuclient.model.DataCurveSetPaceCurve
import com.github.maciej.kaznowski.intervalsicuclient.model.DataCurveSetPowerCurve
import com.github.maciej.kaznowski.intervalsicuclient.model.GetActivityDefaultResponse
import com.github.maciej.kaznowski.intervalsicuclient.model.HRLoadModel
import com.github.maciej.kaznowski.intervalsicuclient.model.IcuSegment
import com.github.maciej.kaznowski.intervalsicuclient.model.Interval
import com.github.maciej.kaznowski.intervalsicuclient.model.IntervalsDTO
import com.github.maciej.kaznowski.intervalsicuclient.model.MapData
import com.github.maciej.kaznowski.intervalsicuclient.model.Plot
import com.github.maciej.kaznowski.intervalsicuclient.model.PowerHRCurve
import com.github.maciej.kaznowski.intervalsicuclient.model.PowerModel
import com.github.maciej.kaznowski.intervalsicuclient.model.PowerVsHRPlot
import com.github.maciej.kaznowski.intervalsicuclient.model.UploadResponse

interface ActivitiesApi {
    /**
     * Create a manual activity
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param activity 
     * @return [Call]<[Activity]>
     */
    @POST("api/v1/athlete/{id}/activities/manual")
    fun createManualActivity(@Path("id") id: kotlin.String, @Body activity: Activity): Call<Activity>

    /**
     * Delete an activity
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Call]<[ActivityId]>
     */
    @DELETE("api/v1/activity/{id}")
    fun deleteActivity(@Path("id") id: kotlin.String): Call<ActivityId>

    /**
     * Delete intervals
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param interval 
     * @return [Call]<[IntervalsDTO]>
     */
    @PUT("api/v1/activity/{id}/delete-intervals")
    fun deleteIntervals(@Path("id") id: kotlin.String, @Body interval: kotlin.collections.List<Interval>): Call<IntervalsDTO>

    /**
     * Download activities as CSV
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Call]<[Unit]>
     */
    @GET("api/v1/athlete/{id}/activities.csv")
    fun downloadActivitiesAsCSV(@Path("id") id: kotlin.String): Call<Unit>

    /**
     * Download original activity file, Strava activities not supported
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Call]<[Unit]>
     */
    @GET("api/v1/activity/{id}/file")
    fun downloadActivityFile(@Path("id") id: kotlin.String): Call<Unit>

    /**
     * Download Intervals.icu generated activity fit file
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param power Include power data (optional, default to true)
     * @param hr Include heart rate data (optional, default to true)
     * @return [Call]<[Unit]>
     */
    @GET("api/v1/activity/{id}/fit-file")
    fun downloadActivityFitFile(@Path("id") id: kotlin.String, @Query("power") power: kotlin.Boolean? = true, @Query("hr") hr: kotlin.Boolean? = true): Call<Unit>

    /**
     * Download zip of Intervals.icu generated activity fit files
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param ids Activity id&#39;s to download
     * @param power Include power data (optional, default to true)
     * @param hr Include heart rate data (optional, default to true)
     * @return [Call]<[Unit]>
     */
    @POST("api/v1/athlete/{id}/download-fit-files")
    fun downloadActivityFitFiles(@Path("id") id: kotlin.String, @Query("ids") ids: kotlin.collections.List<kotlin.String>, @Query("power") power: kotlin.Boolean? = true, @Query("hr") hr: kotlin.Boolean? = true): Call<Unit>

    /**
     * Find best efforts in the activity
     * One of duration or distance is required
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param stream Stream to search
     * @param duration Duration of each effort in seconds (optional)
     * @param distance Distance of each effort in meters (optional)
     * @param count Number of efforts to return (optional, default to 8)
     * @param minValue Minimum average value for each interval, intervals will expand if specified (optional)
     * @param excludeIntervals If true portions of the stream that are included in work intervals are not considered (optional, default to false)
     * @param startIndex First point in stream to consider (optional, default to 0)
     * @param endIndex Last point in stream to consider (exclusive, default is whole stream) (optional, default to 0)
     * @return [Call]<[BestEfforts]>
     */
    @GET("api/v1/activity/{id}/best-efforts")
    fun findBestEfforts(@Path("id") id: kotlin.String, @Query("stream") stream: kotlin.String, @Query("duration") duration: kotlin.Int? = null, @Query("distance") distance: kotlin.Float? = null, @Query("count") count: kotlin.Int? = 8, @Query("minValue") minValue: kotlin.Float? = null, @Query("excludeIntervals") excludeIntervals: kotlin.Boolean? = false, @Query("startIndex") startIndex: kotlin.Int? = 0, @Query("endIndex") endIndex: kotlin.Int? = 0): Call<BestEfforts>

    /**
     * Fetch multiple activities by id. Missing activities are ignored
     * 
     * Responses:
     *  - 200: OK
     *
     * @param athleteId 
     * @param ids 
     * @param intervals Include interval data (icu_intervals and icu_groups fields) (optional)
     * @return [Call]<[kotlin.collections.List<Activity>]>
     */
    @GET("api/v1/athlete/{athleteId}/activities/{ids}")
    fun getActivities(@Path("athleteId") athleteId: kotlin.String, @Path("ids") ids: kotlin.collections.List<kotlin.String>, @Query("intervals") intervals: kotlin.Boolean? = null): Call<kotlin.collections.List<Activity>>

    /**
     * Get an activity
     * 
     * Responses:
     *  - 0: default response
     *
     * @param id 
     * @param intervals Include interval data (optional)
     * @return [Call]<[GetActivityDefaultResponse]>
     */
    @GET("api/v1/activity/{id}")
    fun getActivity(@Path("id") id: kotlin.String, @Query("intervals") intervals: kotlin.Boolean? = null): Call<GetActivityDefaultResponse>

    /**
     * Get activity heart rate curve in JSON or CSV (use .csv ext) format
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Call]<[kotlin.Any]>
     */
    @GET("api/v1/activity/{id}/hr-curve{ext}")
    fun getActivityHRCurve(@Path("id") id: kotlin.String): Call<kotlin.Any>

    /**
     * Get activity map data
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Call]<[MapData]>
     */
    @GET("api/v1/activity/{id}/map")
    fun getActivityMap(@Path("id") id: kotlin.String): Call<MapData>

    /**
     * Get activity pace curve in JSON or CSV (use .csv ext) format
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param gap  (optional, default to false)
     * @return [Call]<[kotlin.Any]>
     */
    @GET("api/v1/activity/{id}/pace-curve{ext}")
    fun getActivityPaceCurve(@Path("id") id: kotlin.String, @Query("gap") gap: kotlin.Boolean? = false): Call<kotlin.Any>

    /**
     * Get activity power curve in JSON or CSV (use .csv ext) format
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param fatigue Use kj0 or kj1 to get one of the athlete&#39;s predefined fatigued power curves (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @GET("api/v1/activity/{id}/power-curve{ext}")
    fun getActivityPowerCurve(@Path("id") id: kotlin.String, @Query("fatigue") fatigue: kotlin.String? = null): Call<kotlin.Any>

    /**
     * Get activity power spike detection model
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Call]<[PowerModel]>
     */
    @GET("api/v1/activity/{id}/power-spike-model")
    fun getActivityPowerSpikeModel(@Path("id") id: kotlin.String): Call<PowerModel>

    /**
     * Get activity segments
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Call]<[kotlin.collections.List<IcuSegment>]>
     */
    @GET("api/v1/activity/{id}/segments")
    fun getActivitySegments(@Path("id") id: kotlin.String): Call<kotlin.collections.List<IcuSegment>>

    /**
     * List streams for the activity
     * Note that this endpoint will return &#39;fixed_watts&#39; as &#39;watts&#39;. If &#39;raw_watts&#39; is asked for or types is null then the &#39;watts&#39; stream is renamed to &#39;raw_watts&#39;. If ext is .csv then CSV data is returned instead of JSON
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param types Streams required (optional)
     * @return [Call]<[kotlin.collections.List<ActivityStream>]>
     */
    @GET("api/v1/activity/{id}/streams{ext}")
    fun getActivityStreams(@Path("id") id: kotlin.String, @Query("types") types: kotlin.collections.List<kotlin.String>? = null): Call<kotlin.collections.List<ActivityStream>>


    /**
    * enum for parameter type
    */
    enum class TypeGetAthleteMMPModel(val value: kotlin.String) {
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
        @Json(name = "Other") OTHER("Other")
    }

    /**
     * Get the power model used to resolve %MMP steps in workouts for the athlete
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param type 
     * @return [Call]<[PowerModel]>
     */
    @GET("api/v1/athlete/{id}/mmp-model")
    fun getAthleteMMPModel(@Path("id") id: kotlin.String, @Query("type") type: TypeGetAthleteMMPModel): Call<PowerModel>

    /**
     * Get activity gradient adjusted pace histogram
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Call]<[kotlin.collections.List<Bucket>]>
     */
    @GET("api/v1/activity/{id}/gap-histogram")
    fun getGapHistogram(@Path("id") id: kotlin.String): Call<kotlin.collections.List<Bucket>>

    /**
     * Get activity heart rate histogram
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param bucketSize Beats per bucket (default 5) (optional)
     * @return [Call]<[kotlin.collections.List<Bucket>]>
     */
    @GET("api/v1/activity/{id}/hr-histogram")
    fun getHRHistogram(@Path("id") id: kotlin.String, @Query("bucketSize") bucketSize: kotlin.Int? = null): Call<kotlin.collections.List<Bucket>>

    /**
     * Get activity heart rate training load model
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Call]<[HRLoadModel]>
     */
    @GET("api/v1/activity/{id}/hr-load-model")
    fun getHRTrainingLoadModel(@Path("id") id: kotlin.String): Call<HRLoadModel>

    /**
     * Return interval like stats for part of the activity
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param startIndex 
     * @param endIndex 
     * @return [Call]<[Interval]>
     */
    @GET("api/v1/activity/{id}/interval-stats")
    fun getIntervalStats(@Path("id") id: kotlin.String, @Query("start_index") startIndex: kotlin.Int, @Query("end_index") endIndex: kotlin.Int): Call<Interval>

    /**
     * Get activity intervals
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Call]<[IntervalsDTO]>
     */
    @GET("api/v1/activity/{id}/intervals")
    fun getIntervals(@Path("id") id: kotlin.String): Call<IntervalsDTO>

    /**
     * Get activity pace histogram
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Call]<[kotlin.collections.List<Bucket>]>
     */
    @GET("api/v1/activity/{id}/pace-histogram")
    fun getPaceHistogram(@Path("id") id: kotlin.String): Call<kotlin.collections.List<Bucket>>

    /**
     * Get the athlete&#39;s power vs heart rate curve for a date range
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param start Starting local date (ISO-8601)
     * @param end Ending local date (ISO-8601), inclusive
     * @return [Call]<[PowerHRCurve]>
     */
    @GET("api/v1/athlete/{id}/power-hr-curve")
    fun getPowerHRCurve(@Path("id") id: kotlin.String, @Query("start") start: kotlin.String, @Query("end") end: kotlin.String): Call<PowerHRCurve>

    /**
     * Get activity power histogram
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param bucketSize Watts per bucket (default 25) (optional)
     * @return [Call]<[kotlin.collections.List<Bucket>]>
     */
    @GET("api/v1/activity/{id}/power-histogram")
    fun getPowerHistogram(@Path("id") id: kotlin.String, @Query("bucketSize") bucketSize: kotlin.Int? = null): Call<kotlin.collections.List<Bucket>>

    /**
     * Get activity power vs heart rate data in JSON or CSV (use .csv ext) format
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Call]<[PowerVsHRPlot]>
     */
    @GET("api/v1/activity/{id}/power-vs-hr{ext}")
    fun getPowerVsHR(@Path("id") id: kotlin.String): Call<PowerVsHRPlot>

    /**
     * Get activity time at heart rate data
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Call]<[Plot]>
     */
    @GET("api/v1/activity/{id}/time-at-hr")
    fun getTimeAtHR(@Path("id") id: kotlin.String): Call<Plot>

    /**
     * List activities for a date range
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param oldest Local ISO-8601 date or date and time e.g. 2019-07-22T16:18:49 or 2019-07-22
     * @param newest Local ISO-8601 date or date and time
     * @return [Call]<[kotlin.collections.List<Activity>]>
     */
    @GET("api/v1/athlete/{id}/activities")
    fun listActivities(@Path("id") id: kotlin.String, @Query("oldest") oldest: kotlin.String, @Query("newest") newest: kotlin.String): Call<kotlin.collections.List<Activity>>


    /**
    * enum for parameter type
    */
    enum class TypeListActivityHRCurves(val value: kotlin.String) {
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
        @Json(name = "Other") OTHER("Other")
    }

    /**
     * Get best HR for a range of durations for matching activities in the date range
     * Use ext of .csv to get results in CSV format
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param oldest Local ISO-8601 date or date and time e.g. 2019-07-22T16:18:49 or 2019-07-22
     * @param newest Local ISO-8601 date or date and time (inclusive)
     * @param filters Only return activities matching all the filters in this list (optional)
     * @param secs Optional durations to return (default is all, in seconds comma separated) (optional)
     * @param type The sport (Ride, Run etc.). If filters is not provided or is blank or does not contain a type filter then activities for the types of the sport matching this parameter are included (optional)
     * @return [Call]<[ActivityHRCurvePayload]>
     */
    @GET("api/v1/athlete/{id}/activity-hr-curves{ext}")
    fun listActivityHRCurves(@Path("id") id: kotlin.String, @Query("oldest") oldest: kotlin.String, @Query("newest") newest: kotlin.String, @Query("filters") filters: kotlin.collections.List<ActivityFilter>? = null, @Query("secs") secs: kotlin.collections.List<kotlin.Int>? = null, @Query("type") type: TypeListActivityHRCurves? = null): Call<ActivityHRCurvePayload>


    /**
    * enum for parameter type
    */
    enum class TypeListActivityPaceCurves(val value: kotlin.String) {
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
        @Json(name = "Other") OTHER("Other")
    }

    /**
     * Get best pace for a range of distances for matching activities in the date range
     * Use ext of .csv to get results in CSV format
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param oldest Local ISO-8601 date or date and time e.g. 2019-07-22T16:18:49 or 2019-07-22
     * @param newest Local ISO-8601 date or date and time (inclusive)
     * @param type The sport (Ride, Run etc.). If filters is not provided or is blank or does not contain a type filter then activities for the types of the sport matching this parameter are included (optional)
     * @param filters Only return activities matching all the filters in this list (optional)
     * @param distances Distances required (in meters, comma separated) (optional)
     * @param gap Return gradient adjusted pace curves (optional, default to false)
     * @return [Call]<[Unit]>
     */
    @GET("api/v1/athlete/{id}/activity-pace-curves{ext}")
    fun listActivityPaceCurves(@Path("id") id: kotlin.String, @Query("oldest") oldest: kotlin.String, @Query("newest") newest: kotlin.String, @Query("type") type: TypeListActivityPaceCurves? = null, @Query("filters") filters: kotlin.collections.List<ActivityFilter>? = null, @Query("distances") distances: kotlin.collections.List<kotlin.Float>? = null, @Query("gap") gap: kotlin.Boolean? = false): Call<Unit>


    /**
    * enum for parameter type
    */
    enum class TypeListActivityPowerCurves(val value: kotlin.String) {
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
        @Json(name = "Other") OTHER("Other")
    }

    /**
     * Get best power for a range of durations for matching activities in the date range
     * Use ext of .csv to get results in CSV format
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param oldest Local ISO-8601 date or date and time e.g. 2019-07-22T16:18:49 or 2019-07-22
     * @param newest Local ISO-8601 date or date and time (inclusive)
     * @param filters Only return activities matching all the filters in this list (optional)
     * @param secs Optional durations to return (default is all, in seconds comma separated) (optional)
     * @param type The sport (Ride, Run etc.). If filters is not provided or is blank or does not contain a type filter then activities for the types of the sport matching this parameter are included. Required if fatigue is used (optional)
     * @param fatigue Use kj0 or kj1 to get one of the athlete&#39;s predefined fatigued power curves (optional)
     * @return [Call]<[ActivityPowerCurvePayload]>
     */
    @GET("api/v1/athlete/{id}/activity-power-curves{ext}")
    fun listActivityPowerCurves(@Path("id") id: kotlin.String, @Query("oldest") oldest: kotlin.String, @Query("newest") newest: kotlin.String, @Query("filters") filters: kotlin.collections.List<ActivityFilter>? = null, @Query("secs") secs: kotlin.collections.List<kotlin.Int>? = null, @Query("type") type: TypeListActivityPowerCurves? = null, @Query("fatigue") fatigue: kotlin.String? = null): Call<ActivityPowerCurvePayload>


    /**
    * enum for parameter type
    */
    enum class TypeListAthleteHRCurves(val value: kotlin.String) {
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
        @Json(name = "Other") OTHER("Other")
    }

    /**
     * List best heart rate curves for the athlete
     * Curves are specified as follows: 1y (past year), 2y (past 2 years) etc., 42d (past 42 days) etc., s0 (current season), s1 (previous season) etc., all (all time), r.2023-10-01.2023-10-31 (date range)
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param newest  (optional)
     * @param curves Comma separated list of curves to return (default last year) (optional)
     * @param type The sport (Ride, Run etc.). If filters is not provided or is blank or does not contain a type filter then activities for the types of the sport matching this parameter are included (optional)
     * @param subMaxEfforts  (optional, default to 0)
     * @param now Current local date (ISO-8601) (optional)
     * @param filters Only consider activities matching all the filters in this list (optional)
     * @return [Call]<[DataCurveSetHRCurve]>
     */
    @GET("api/v1/athlete/{id}/hr-curves{ext}")
    fun listAthleteHRCurves(@Path("id") id: kotlin.String, @Query("newest") newest: kotlin.String? = null, @Query("curves") curves: kotlin.collections.List<kotlin.String>? = null, @Query("type") type: TypeListAthleteHRCurves? = null, @Query("subMaxEfforts") subMaxEfforts: kotlin.Int? = 0, @Query("now") now: kotlin.String? = null, @Query("filters") filters: kotlin.collections.List<ActivityFilter>? = null): Call<DataCurveSetHRCurve>


    /**
    * enum for parameter type
    */
    enum class TypeListAthletePaceCurves(val value: kotlin.String) {
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
        @Json(name = "Other") OTHER("Other")
    }


    /**
    * enum for parameter pmType
    */
    enum class PmTypeListAthletePaceCurves(val value: kotlin.String) {
        @Json(name = "CS") CS("CS")
    }

    /**
     * List best pace curves for the athlete
     * Curves are specified as follows: 1y (past year), 2y (past 2 years) etc., 42d (past 42 days) etc., s0 (current season), s1 (previous season) etc., all (all time), r.2023-10-01.2023-10-31 (date range)
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param newest  (optional)
     * @param curves Comma separated list of curves to return (default last year) (optional)
     * @param type The sport (Ride, Run etc.). If filters is not provided or is blank or does not contain a type filter then activities for the types of the sport matching this parameter are included (optional)
     * @param includeRanks  (optional, default to false)
     * @param subMaxEfforts  (optional, default to 0)
     * @param now Current local date (ISO-8601) (optional)
     * @param gap Return gradient adjusted pace curves (optional, default to false)
     * @param pmType  (optional)
     * @param filters Only consider activities matching all the filters in this list (optional)
     * @return [Call]<[DataCurveSetPaceCurve]>
     */
    @GET("api/v1/athlete/{id}/pace-curves{ext}")
    fun listAthletePaceCurves(@Path("id") id: kotlin.String, @Query("newest") newest: kotlin.String? = null, @Query("curves") curves: kotlin.collections.List<kotlin.String>? = null, @Query("type") type: TypeListAthletePaceCurves? = null, @Query("includeRanks") includeRanks: kotlin.Boolean? = false, @Query("subMaxEfforts") subMaxEfforts: kotlin.Int? = 0, @Query("now") now: kotlin.String? = null, @Query("gap") gap: kotlin.Boolean? = false, @Query("pmType") pmType: PmTypeListAthletePaceCurves? = null, @Query("filters") filters: kotlin.collections.List<ActivityFilter>? = null): Call<DataCurveSetPaceCurve>


    /**
    * enum for parameter type
    */
    enum class TypeListAthletePowerCurves(val value: kotlin.String) {
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
        @Json(name = "Other") OTHER("Other")
    }


    /**
    * enum for parameter pmType
    */
    enum class PmTypeListAthletePowerCurves(val value: kotlin.String) {
        @Json(name = "MS_2P") MS_2_P("MS_2P"),
        @Json(name = "MORTON_3P") MORTON_3_P("MORTON_3P"),
        @Json(name = "FFT_CURVES") FFT_CURVES("FFT_CURVES"),
        @Json(name = "ECP") ECP("ECP")
    }

    /**
     * List best power curves for the athlete
     * Curves are specified as follows: 1y (past year), 2y (past 2 years) etc., 42d (past 42 days) etc., s0 (current season), s1 (previous season) etc., all (all time), r.2023-10-01.2023-10-31 (date range). Curves can also have a -kj0 or -kj1 suffix to return fatigued curves
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param type The sport (Ride, Run etc.). If filters is not provided or is blank or does not contain a type filter then activities for the types of the sport matching this parameter are included
     * @param newest  (optional)
     * @param curves Comma separated list of curves to return (default last year) (optional)
     * @param includeRanks  (optional, default to false)
     * @param subMaxEfforts  (optional, default to 0)
     * @param now Current local date (ISO-8601) (optional)
     * @param pmType  (optional)
     * @param filters Only consider activities matching all the filters in this list (optional)
     * @return [Call]<[DataCurveSetPowerCurve]>
     */
    @GET("api/v1/athlete/{id}/power-curves{ext}")
    fun listAthletePowerCurves(@Path("id") id: kotlin.String, @Query("type") type: TypeListAthletePowerCurves, @Query("newest") newest: kotlin.String? = null, @Query("curves") curves: kotlin.collections.List<kotlin.String>? = null, @Query("includeRanks") includeRanks: kotlin.Boolean? = false, @Query("subMaxEfforts") subMaxEfforts: kotlin.Int? = 0, @Query("now") now: kotlin.String? = null, @Query("pmType") pmType: PmTypeListAthletePowerCurves? = null, @Query("filters") filters: kotlin.collections.List<ActivityFilter>? = null): Call<DataCurveSetPowerCurve>

    /**
     * List all tags that have been applied to the athlete&#39;s activities
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Call]<[kotlin.collections.List<kotlin.String>]>
     */
    @GET("api/v1/athlete/{id}/activity-tags")
    fun listTags2(@Path("id") id: kotlin.String): Call<kotlin.collections.List<kotlin.String>>

    /**
     * Search for activities by name or tag, returns summary info
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param q Search query, case insensitive name search or exact tag search if it starts with #
     * @param limit  (optional)
     * @return [Call]<[kotlin.collections.List<ActivitySearchResult>]>
     */
    @GET("api/v1/athlete/{id}/activities/search")
    fun searchForActivities(@Path("id") id: kotlin.String, @Query("q") q: kotlin.String, @Query("limit") limit: kotlin.Int? = null): Call<kotlin.collections.List<ActivitySearchResult>>

    /**
     * Search for activities by name or tag, returns full activities
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param q Search query, case insensitive name search or exact tag search if it starts with #
     * @param limit  (optional)
     * @return [Call]<[kotlin.collections.List<Activity>]>
     */
    @GET("api/v1/athlete/{id}/activities/search-full")
    fun searchForActivitiesFull(@Path("id") id: kotlin.String, @Query("q") q: kotlin.String, @Query("limit") limit: kotlin.Int? = null): Call<kotlin.collections.List<Activity>>

    /**
     * Split an interval
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param splitAt Index to split interval at
     * @return [Call]<[IntervalsDTO]>
     */
    @PUT("api/v1/activity/{id}/split-interval")
    fun splitInterval(@Path("id") id: kotlin.String, @Query("splitAt") splitAt: kotlin.Int): Call<IntervalsDTO>

    /**
     * Update activity
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param activity 
     * @return [Call]<[Activity]>
     */
    @PUT("api/v1/activity/{id}")
    fun updateActivity(@Path("id") id: kotlin.String, @Body activity: Activity): Call<Activity>

    /**
     * Update/create an interval
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param intervalId 
     * @param interval 
     * @return [Call]<[IntervalsDTO]>
     */
    @PUT("api/v1/activity/{id}/intervals/{intervalId}")
    fun updateInterval(@Path("id") id: kotlin.String, @Path("intervalId") intervalId: kotlin.Int, @Body interval: Interval): Call<IntervalsDTO>

    /**
     * Update intervals for an activity
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param interval 
     * @param all Any existing intervals are replaced, otherwise a merge is done (optional, default to true)
     * @return [Call]<[IntervalsDTO]>
     */
    @PUT("api/v1/activity/{id}/intervals")
    fun updateIntervals(@Path("id") id: kotlin.String, @Body interval: kotlin.collections.List<Interval>, @Query("all") all: kotlin.Boolean? = true): Call<IntervalsDTO>

    /**
     * Create new activities from an uploaded file (fit, tcx, gpx or zip or gz of the same) as multipart/form-data
     * Multisport files are split into multiple activities. Activities are de-duped using a hash of the file. Response code is 201 if at least one new actvity was created and 200 otherwise (all dups).
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param name Activity name (optional)
     * @param description Activity description (optional)
     * @param pairedEventId Workout to pair with activity (optional)
     * @return [Call]<[UploadResponse]>
     */
    @POST("api/v1/athlete/{id}/activities")
    fun uploadActivity(@Path("id") id: kotlin.String, @Query("name") name: kotlin.String? = null, @Query("description") description: kotlin.String? = null, @Query("paired_event_id") pairedEventId: kotlin.Int? = null): Call<UploadResponse>

}
