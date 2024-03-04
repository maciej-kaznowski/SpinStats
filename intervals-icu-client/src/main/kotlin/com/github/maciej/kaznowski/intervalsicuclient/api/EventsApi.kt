package com.github.maciej.kaznowski.intervalsicuclient.api

import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import com.github.maciej.kaznowski.intervalsicuclient.model.Activity
import com.github.maciej.kaznowski.intervalsicuclient.model.DuplicateEventsDTO
import com.github.maciej.kaznowski.intervalsicuclient.model.Event
import com.github.maciej.kaznowski.intervalsicuclient.model.EventEx

interface EventsApi {
    /**
     * Create an event on the athlete&#39;s calendar
     * This endpoint accepts workouts in native Intervals.icu format (&#39;description&#39; field) as well as zwo, mrc, erg and fit files (use &#39;file_contents&#39; or &#39;file_contents_base64&#39;)
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param eventEx 
     * @return [Call]<[Event]>
     */
    @POST("api/v1/athlete/{id}/events")
    fun createEvent(@Path("id") id: kotlin.String, @Body eventEx: EventEx): Call<Event>

    /**
     * Create multiple events on the athlete&#39;s calendar
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param eventEx 
     * @return [Call]<[kotlin.collections.List<Event>]>
     */
    @POST("api/v1/athlete/{id}/events/bulk")
    fun createMultipleEvents(@Path("id") id: kotlin.String, @Body eventEx: kotlin.collections.List<EventEx>): Call<kotlin.collections.List<Event>>

    /**
     * Delete an event from an athlete&#39;s calendar
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param eventId 
     * @param others If true then other events added at the same time are also deleted (optional)
     * @param notBefore Do not delete other events on the calendar before this local date (ISO-8601) (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.Any>]>
     */
    @DELETE("api/v1/athlete/{id}/events/{eventId}")
    fun deleteEvent(@Path("id") id: kotlin.String, @Path("eventId") eventId: kotlin.Int, @Query("others") others: kotlin.Boolean? = null, @Query("notBefore") notBefore: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.Any>>

    /**
     * Delete a range of events from the athlete&#39;s calendar
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param oldest Local date (ISO-8601) of oldest event to delete
     * @param category Comma separated list of event categories to delete (e.g. WORKOUT)
     * @param newest Local date (ISO-8601) of newest event to delete (inclusive, default is all future events) (optional)
     * @param createdById If provided only events created by this athlete (created_by_id field) are deleted (optional)
     * @return [Call]<[Unit]>
     */
    @DELETE("api/v1/athlete/{id}/events")
    fun deleteEvents(@Path("id") id: kotlin.String, @Query("oldest") oldest: kotlin.String, @Query("category") category: kotlin.collections.List<kotlin.String>, @Query("newest") newest: kotlin.String? = null, @Query("createdById") createdById: kotlin.String? = null): Call<Unit>

    /**
     * Download a planned workout in zwo, mrc, erg or fit format
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param eventId 
     * @param ext 
     * @return [Call]<[Unit]>
     */
    @GET("api/v1/athlete/{id}/events/{eventId}/download{ext}")
    fun downloadWorkout1(@Path("id") id: kotlin.String, @Path("eventId") eventId: kotlin.Int, @Path("ext") ext: kotlin.String): Call<Unit>

    /**
     * Download one or more workouts from the athlete&#39;s calendar in a zip file
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param ext Format: zwo, mrc, erg or fit
     * @param oldest Local date (ISO-8601) of oldest workout
     * @param newest Local date (ISO-8601) of newest workout (inclusive)
     * @param powerRange  (optional)
     * @param hrRange  (optional)
     * @param paceRange  (optional)
     * @param locale  (optional)
     * @return [Call]<[Unit]>
     */
    @GET("api/v1/athlete/{id}/workouts.zip")
    fun downloadWorkouts(@Path("id") id: kotlin.String, @Query("ext") ext: kotlin.String, @Query("oldest") oldest: kotlin.String, @Query("newest") newest: kotlin.String, @Query("powerRange") powerRange: kotlin.Double? = null, @Query("hrRange") hrRange: kotlin.Double? = null, @Query("paceRange") paceRange: kotlin.Double? = null, @Query("locale") locale: kotlin.String? = null): Call<Unit>

    /**
     * Duplicate one or more events on the athlete&#39;s calendar
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param duplicateEventsDTO 
     * @return [Call]<[kotlin.collections.List<Event>]>
     */
    @POST("api/v1/athlete/{id}/duplicate-events")
    fun duplicateEvents(@Path("id") id: kotlin.String, @Body duplicateEventsDTO: DuplicateEventsDTO): Call<kotlin.collections.List<Event>>

    /**
     * List events (planned workouts, notes etc.) on the athlete&#39;s calendar, add .csv for CSV output
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param format 
     * @param oldest Local date (ISO-8601) for oldest event to return
     * @param newest Local date (ISO-8601) for newest event to return (inclusive)
     * @param calendarId  (optional)
     * @param ext Convert workouts to this format (zwo, mrc, erg or fit) and add workout_filename and workout_file_base64 to workout object (optional)
     * @param powerRange Percentage used to convert fixed power targets into a range for outdoor workouts only (default is 2.5 or whatever is configured in the Garmin box in /settings) (optional)
     * @param hrRange Percentage used to convert fixed HR targets into a range (default is 1.5 or whatever is configured in the Garmin box in /settings) (optional)
     * @param paceRange Percentage used to convert fixed pace targets into a range (default is 2.5 or whatever is configured in the Garmin box in /settings) (optional)
     * @param locale Locale (en, es, de etc.) to use for workouts with steps in multiple languages (optional)
     * @param resolve Resolve power, heart rate and pace targets to watts, bpm and m/s respectively (optional, default to false)
     * @return [Call]<[kotlin.collections.List<Event>]>
     */
    @GET("api/v1/athlete/{id}/events{format}")
    fun listEvents(@Path("id") id: kotlin.String, @Path("format") format: kotlin.String, @Query("oldest") oldest: kotlin.String, @Query("newest") newest: kotlin.String, @Query("calendar_id") calendarId: kotlin.Int? = null, @Query("ext") ext: kotlin.String? = null, @Query("powerRange") powerRange: kotlin.Double? = null, @Query("hrRange") hrRange: kotlin.Double? = null, @Query("paceRange") paceRange: kotlin.Double? = null, @Query("locale") locale: kotlin.String? = null, @Query("resolve") resolve: kotlin.Boolean? = false): Call<kotlin.collections.List<Event>>

    /**
     * List all tags that have been applied to events on the athlete&#39;s calendar
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Call]<[kotlin.collections.List<kotlin.String>]>
     */
    @GET("api/v1/athlete/{id}/event-tags")
    fun listTags1(@Path("id") id: kotlin.String): Call<kotlin.collections.List<kotlin.String>>

    /**
     * Create a manual activity to match a planned workout
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param eventId 
     * @return [Call]<[Activity]>
     */
    @POST("api/v1/athlete/{id}/events/{eventId}/mark-done")
    fun markEventAsDone(@Path("id") id: kotlin.String, @Path("eventId") eventId: kotlin.Int): Call<Activity>

    /**
     * Get an event
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param eventId 
     * @return [Call]<[Event]>
     */
    @GET("api/v1/athlete/{id}/events/{eventId}")
    fun showEvent(@Path("id") id: kotlin.String, @Path("eventId") eventId: kotlin.Int): Call<Event>

    /**
     * Update an event
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param eventId 
     * @param eventEx 
     * @return [Call]<[kotlin.Any]>
     */
    @PUT("api/v1/athlete/{id}/events/{eventId}")
    fun updateEvent(@Path("id") id: kotlin.String, @Path("eventId") eventId: kotlin.Int, @Body eventEx: EventEx): Call<kotlin.Any>

    /**
     * Update all events for a date range at once. Only hide_from_athlete and athlete_cannot_edit can be updated
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param oldest Local date (ISO-8601) of oldest event to update
     * @param newest Local date (ISO-8601) of newest event to update (inclusive)
     * @param event 
     * @return [Call]<[kotlin.collections.List<Event>]>
     */
    @PUT("api/v1/athlete/{id}/events")
    fun updateEvents(@Path("id") id: kotlin.String, @Query("oldest") oldest: kotlin.String, @Query("newest") newest: kotlin.String, @Body event: Event): Call<kotlin.collections.List<Event>>

}
