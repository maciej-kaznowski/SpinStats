package com.github.maciej.kaznowski.intervalsicuclient.api

import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import com.github.maciej.kaznowski.intervalsicuclient.model.CreateFolderDTO
import com.github.maciej.kaznowski.intervalsicuclient.model.DuplicateWorkoutsDTO
import com.github.maciej.kaznowski.intervalsicuclient.model.Folder
import com.github.maciej.kaznowski.intervalsicuclient.model.SharedWith
import com.github.maciej.kaznowski.intervalsicuclient.model.UploadWellnessRequest
import com.github.maciej.kaznowski.intervalsicuclient.model.Workout
import com.github.maciej.kaznowski.intervalsicuclient.model.WorkoutEx

interface LibraryApi {
    /**
     * Apply any changes from the athlete&#39;s current plan to the athlete&#39;s calendar
     * Only workouts from today or in the future are updated
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.Any>]>
     */
    @PUT("api/v1/athlete/{id}/apply-plan-changes")
    fun applyCurrentPlanChanges(@Path("id") id: kotlin.String): Call<kotlin.collections.Map<kotlin.String, kotlin.Any>>

    /**
     * Create a new workout folder or plan
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param createFolderDTO 
     * @return [Call]<[Folder]>
     */
    @POST("api/v1/athlete/{id}/folders")
    fun createFolder(@Path("id") id: kotlin.String, @Body createFolderDTO: CreateFolderDTO): Call<Folder>

    /**
     * Create multiple new workouts in a folder or plan in the athlete&#39;s workout library
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param workoutEx 
     * @return [Call]<[kotlin.collections.List<Workout>]>
     */
    @POST("api/v1/athlete/{id}/workouts/bulk")
    fun createMultipleWorkouts(@Path("id") id: kotlin.String, @Body workoutEx: kotlin.collections.List<WorkoutEx>): Call<kotlin.collections.List<Workout>>

    /**
     * Create a new workout in a folder or plan in the athlete&#39;s workout library
     * This endpoint accepts workouts in native Intervals.icu format (&#39;description&#39; field) as well as zwo, mrc, erg and fit files (use &#39;file_contents&#39; or &#39;file_contents_base64&#39;)
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param workoutEx 
     * @return [Call]<[Workout]>
     */
    @POST("api/v1/athlete/{id}/workouts")
    fun createWorkout(@Path("id") id: kotlin.String, @Body workoutEx: WorkoutEx): Call<Workout>

    /**
     * Delete a workout folder or plan including all workouts
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param folderId 
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.Any>]>
     */
    @DELETE("api/v1/athlete/{id}/folders/{folderId}")
    fun deleteFolder(@Path("id") id: kotlin.String, @Path("folderId") folderId: kotlin.Int): Call<kotlin.collections.Map<kotlin.String, kotlin.Any>>

    /**
     * Delete a workout (and optionally others added at the same time if the workout is on a plan)
     * Returns the ids of the deleted workout(s)
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param workoutId 
     * @param others  (optional)
     * @return [Call]<[kotlin.collections.List<kotlin.Int>]>
     */
    @DELETE("api/v1/athlete/{id}/workouts/{workoutId}")
    fun deleteWorkout(@Path("id") id: kotlin.String, @Path("workoutId") workoutId: kotlin.Int, @Query("others") others: kotlin.Boolean? = null): Call<kotlin.collections.List<kotlin.Int>>

    /**
     * Convert a workout to .zwo (Zwift), .mrc, .erg or .fit
     * The athlete to use is extracted from the bearer token and used to resolve power targets etc.. Note that the create workout endpoint can convert workouts and might be more convenient.
     * Responses:
     *  - 200: OK
     *
     * @param ext 
     * @param workout 
     * @return [Call]<[Unit]>
     */
    @POST("api/v1/download-workout{ext}")
    fun downloadWorkout(@Path("ext") ext: kotlin.String, @Body workout: Workout): Call<Unit>

    /**
     * Convert a workout to .zwo (Zwift), .mrc, .erg or .fit.
     * The athlete&#39;s settings are used to resolve power targets etc.. Note that the create workout endpoint can convert workouts and might be more convenient.
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param ext 
     * @param workout 
     * @return [Call]<[Unit]>
     */
    @POST("api/v1/athlete/{id}/download-workout{ext}")
    fun downloadWorkoutForAthlete(@Path("id") id: kotlin.String, @Path("ext") ext: kotlin.String, @Body workout: Workout): Call<Unit>

    /**
     * Duplicate workouts on a plan
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param duplicateWorkoutsDTO 
     * @return [Call]<[kotlin.collections.List<Workout>]>
     */
    @POST("api/v1/athlete/{id}/duplicate-workouts")
    fun duplicateWorkouts(@Path("id") id: kotlin.String, @Body duplicateWorkoutsDTO: DuplicateWorkoutsDTO): Call<kotlin.collections.List<Workout>>


    /**
    * enum for parameter type
    */
    enum class TypeImportWorkoutFile(val value: kotlin.String) {
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
     * Create new workout from .zwo, .mrc, .erg or .fit file in a folder
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param folderId 
     * @param type 
     * @param athleteId  (optional)
     * @param uploadWellnessRequest  (optional)
     * @return [Call]<[Workout]>
     */
    @POST("api/v1/athlete/{id}/folders/{folderId}/import-workout")
    fun importWorkoutFile(@Path("id") id: kotlin.String, @Path("folderId") folderId: kotlin.Int, @Query("type") type: TypeImportWorkoutFile, @Query("athleteId") athleteId: kotlin.String? = null, @Body uploadWellnessRequest: UploadWellnessRequest? = null): Call<Workout>

    /**
     * List athletes that the folder or plan has been shared with
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param folderId 
     * @return [Call]<[kotlin.collections.List<SharedWith>]>
     */
    @GET("api/v1/athlete/{id}/folders/{folderId}/shared-with")
    fun listFolderSharedWith(@Path("id") id: kotlin.String, @Path("folderId") folderId: kotlin.Int): Call<kotlin.collections.List<SharedWith>>

    /**
     * List all the athlete&#39;s folders, plans and workouts
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Call]<[kotlin.collections.List<Folder>]>
     */
    @GET("api/v1/athlete/{id}/folders")
    fun listFolders(@Path("id") id: kotlin.String): Call<kotlin.collections.List<Folder>>

    /**
     * List all tags that have been applied to workouts in the athlete&#39;s library
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Call]<[kotlin.collections.List<kotlin.String>]>
     */
    @GET("api/v1/athlete/{id}/workout-tags")
    fun listTags(@Path("id") id: kotlin.String): Call<kotlin.collections.List<kotlin.String>>

    /**
     * List all the workouts in the athlete&#39;s library
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Call]<[kotlin.collections.List<Workout>]>
     */
    @GET("api/v1/athlete/{id}/workouts")
    fun listWorkouts(@Path("id") id: kotlin.String): Call<kotlin.collections.List<Workout>>

    /**
     * Get a workout
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param workoutId 
     * @return [Call]<[Workout]>
     */
    @GET("api/v1/athlete/{id}/workouts/{workoutId}")
    fun showWorkout(@Path("id") id: kotlin.String, @Path("workoutId") workoutId: kotlin.Int): Call<Workout>

    /**
     * Update a workout folder or plan
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param folderId 
     * @param folder 
     * @return [Call]<[Folder]>
     */
    @PUT("api/v1/athlete/{id}/folders/{folderId}")
    fun updateFolder(@Path("id") id: kotlin.String, @Path("folderId") folderId: kotlin.Int, @Body folder: Folder): Call<Folder>

    /**
     * Add/remove athletes from the share list for the folder
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param folderId 
     * @param sharedWith 
     * @return [Call]<[kotlin.collections.List<SharedWith>]>
     */
    @PUT("api/v1/athlete/{id}/folders/{folderId}/shared-with")
    fun updateFolderSharedWith(@Path("id") id: kotlin.String, @Path("folderId") folderId: kotlin.Int, @Body sharedWith: kotlin.collections.List<SharedWith>): Call<kotlin.collections.List<SharedWith>>

    /**
     * Update a range of workouts on a plan. Currently only hide_from_athlete can be changed
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param folderId 
     * @param oldest 
     * @param newest 
     * @param workout 
     * @return [Call]<[kotlin.collections.List<Workout>]>
     */
    @PUT("api/v1/athlete/{id}/folders/{folderId}/workouts")
    fun updatePlanWorkouts(@Path("id") id: kotlin.String, @Path("folderId") folderId: kotlin.Int, @Query("oldest") oldest: kotlin.Int, @Query("newest") newest: kotlin.Int, @Body workout: Workout): Call<kotlin.collections.List<Workout>>

    /**
     * Update a workout
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param workoutId 
     * @param workoutEx 
     * @return [Call]<[Workout]>
     */
    @PUT("api/v1/athlete/{id}/workouts/{workoutId}")
    fun updateWorkout(@Path("id") id: kotlin.String, @Path("workoutId") workoutId: kotlin.Int, @Body workoutEx: WorkoutEx): Call<Workout>

}
