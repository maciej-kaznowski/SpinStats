# EventsApi

All URIs are relative to *http://intervals.icu*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEvent**](EventsApi.md#createEvent) | **POST** api/v1/athlete/{id}/events | Create an event on the athlete&#39;s calendar
[**createMultipleEvents**](EventsApi.md#createMultipleEvents) | **POST** api/v1/athlete/{id}/events/bulk | Create multiple events on the athlete&#39;s calendar
[**deleteEvent**](EventsApi.md#deleteEvent) | **DELETE** api/v1/athlete/{id}/events/{eventId} | Delete an event from an athlete&#39;s calendar
[**deleteEvents**](EventsApi.md#deleteEvents) | **DELETE** api/v1/athlete/{id}/events | Delete a range of events from the athlete&#39;s calendar
[**downloadWorkout1**](EventsApi.md#downloadWorkout1) | **GET** api/v1/athlete/{id}/events/{eventId}/download{ext} | Download a planned workout in zwo, mrc, erg or fit format
[**downloadWorkouts**](EventsApi.md#downloadWorkouts) | **GET** api/v1/athlete/{id}/workouts.zip | Download one or more workouts from the athlete&#39;s calendar in a zip file
[**duplicateEvents**](EventsApi.md#duplicateEvents) | **POST** api/v1/athlete/{id}/duplicate-events | Duplicate one or more events on the athlete&#39;s calendar
[**listEvents**](EventsApi.md#listEvents) | **GET** api/v1/athlete/{id}/events{format} | List events (planned workouts, notes etc.) on the athlete&#39;s calendar, add .csv for CSV output
[**listTags1**](EventsApi.md#listTags1) | **GET** api/v1/athlete/{id}/event-tags | List all tags that have been applied to events on the athlete&#39;s calendar
[**markEventAsDone**](EventsApi.md#markEventAsDone) | **POST** api/v1/athlete/{id}/events/{eventId}/mark-done | Create a manual activity to match a planned workout
[**showEvent**](EventsApi.md#showEvent) | **GET** api/v1/athlete/{id}/events/{eventId} | Get an event
[**updateEvent**](EventsApi.md#updateEvent) | **PUT** api/v1/athlete/{id}/events/{eventId} | Update an event
[**updateEvents**](EventsApi.md#updateEvents) | **PUT** api/v1/athlete/{id}/events | Update all events for a date range at once. Only hide_from_athlete and athlete_cannot_edit can be updated



Create an event on the athlete&#39;s calendar

This endpoint accepts workouts in native Intervals.icu format (&#39;description&#39; field) as well as zwo, mrc, erg and fit files (use &#39;file_contents&#39; or &#39;file_contents_base64&#39;)

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(EventsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val eventEx : EventEx =  // EventEx | 

val result : Event = webService.createEvent(id, eventEx)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **eventEx** | [**EventEx**](EventEx.md)|  |

### Return type

[**Event**](Event.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


Create multiple events on the athlete&#39;s calendar

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(EventsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val eventEx : kotlin.collections.List<EventEx> =  // kotlin.collections.List<EventEx> | 

val result : kotlin.collections.List<Event> = webService.createMultipleEvents(id, eventEx)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **eventEx** | [**kotlin.collections.List&lt;EventEx&gt;**](EventEx.md)|  |

### Return type

[**kotlin.collections.List&lt;Event&gt;**](Event.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


Delete an event from an athlete&#39;s calendar

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(EventsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val eventId : kotlin.Int = 56 // kotlin.Int | 
val others : kotlin.Boolean = true // kotlin.Boolean | If true then other events added at the same time are also deleted
val notBefore : kotlin.String = notBefore_example // kotlin.String | Do not delete other events on the calendar before this local date (ISO-8601)

val result : kotlin.collections.Map<kotlin.String, kotlin.Any> = webService.deleteEvent(id, eventId, others, notBefore)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **eventId** | **kotlin.Int**|  |
 **others** | **kotlin.Boolean**| If true then other events added at the same time are also deleted | [optional]
 **notBefore** | **kotlin.String**| Do not delete other events on the calendar before this local date (ISO-8601) | [optional]

### Return type

[**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Delete a range of events from the athlete&#39;s calendar

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(EventsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val oldest : kotlin.String = oldest_example // kotlin.String | Local date (ISO-8601) of oldest event to delete
val category : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Comma separated list of event categories to delete (e.g. WORKOUT)
val newest : kotlin.String = newest_example // kotlin.String | Local date (ISO-8601) of newest event to delete (inclusive, default is all future events)
val createdById : kotlin.String = createdById_example // kotlin.String | If provided only events created by this athlete (created_by_id field) are deleted

webService.deleteEvents(id, oldest, category, newest, createdById)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **oldest** | **kotlin.String**| Local date (ISO-8601) of oldest event to delete |
 **category** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Comma separated list of event categories to delete (e.g. WORKOUT) |
 **newest** | **kotlin.String**| Local date (ISO-8601) of newest event to delete (inclusive, default is all future events) | [optional]
 **createdById** | **kotlin.String**| If provided only events created by this athlete (created_by_id field) are deleted | [optional]

### Return type

null (empty response body)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


Download a planned workout in zwo, mrc, erg or fit format

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(EventsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val eventId : kotlin.Int = 56 // kotlin.Int | 
val ext : kotlin.String = ext_example // kotlin.String | 

webService.downloadWorkout1(id, eventId, ext)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **eventId** | **kotlin.Int**|  |
 **ext** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


Download one or more workouts from the athlete&#39;s calendar in a zip file

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(EventsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val ext : kotlin.String = ext_example // kotlin.String | Format: zwo, mrc, erg or fit
val oldest : kotlin.String = oldest_example // kotlin.String | Local date (ISO-8601) of oldest workout
val newest : kotlin.String = newest_example // kotlin.String | Local date (ISO-8601) of newest workout (inclusive)
val powerRange : kotlin.Double = 1.2 // kotlin.Double | 
val hrRange : kotlin.Double = 1.2 // kotlin.Double | 
val paceRange : kotlin.Double = 1.2 // kotlin.Double | 
val locale : kotlin.String = locale_example // kotlin.String | 

webService.downloadWorkouts(id, ext, oldest, newest, powerRange, hrRange, paceRange, locale)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **ext** | **kotlin.String**| Format: zwo, mrc, erg or fit |
 **oldest** | **kotlin.String**| Local date (ISO-8601) of oldest workout |
 **newest** | **kotlin.String**| Local date (ISO-8601) of newest workout (inclusive) |
 **powerRange** | **kotlin.Double**|  | [optional]
 **hrRange** | **kotlin.Double**|  | [optional]
 **paceRange** | **kotlin.Double**|  | [optional]
 **locale** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


Duplicate one or more events on the athlete&#39;s calendar

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(EventsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val duplicateEventsDTO : DuplicateEventsDTO =  // DuplicateEventsDTO | 

val result : kotlin.collections.List<Event> = webService.duplicateEvents(id, duplicateEventsDTO)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **duplicateEventsDTO** | [**DuplicateEventsDTO**](DuplicateEventsDTO.md)|  |

### Return type

[**kotlin.collections.List&lt;Event&gt;**](Event.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


List events (planned workouts, notes etc.) on the athlete&#39;s calendar, add .csv for CSV output

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(EventsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val format : kotlin.String = format_example // kotlin.String | 
val oldest : kotlin.String = oldest_example // kotlin.String | Local date (ISO-8601) for oldest event to return
val newest : kotlin.String = newest_example // kotlin.String | Local date (ISO-8601) for newest event to return (inclusive)
val calendarId : kotlin.Int = 56 // kotlin.Int | 
val ext : kotlin.String = ext_example // kotlin.String | Convert workouts to this format (zwo, mrc, erg or fit) and add workout_filename and workout_file_base64 to workout object
val powerRange : kotlin.Double = 1.2 // kotlin.Double | Percentage used to convert fixed power targets into a range for outdoor workouts only (default is 2.5 or whatever is configured in the Garmin box in /settings)
val hrRange : kotlin.Double = 1.2 // kotlin.Double | Percentage used to convert fixed HR targets into a range (default is 1.5 or whatever is configured in the Garmin box in /settings)
val paceRange : kotlin.Double = 1.2 // kotlin.Double | Percentage used to convert fixed pace targets into a range (default is 2.5 or whatever is configured in the Garmin box in /settings)
val locale : kotlin.String = locale_example // kotlin.String | Locale (en, es, de etc.) to use for workouts with steps in multiple languages
val resolve : kotlin.Boolean = true // kotlin.Boolean | Resolve power, heart rate and pace targets to watts, bpm and m/s respectively

val result : kotlin.collections.List<Event> = webService.listEvents(id, format, oldest, newest, calendarId, ext, powerRange, hrRange, paceRange, locale, resolve)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **format** | **kotlin.String**|  |
 **oldest** | **kotlin.String**| Local date (ISO-8601) for oldest event to return |
 **newest** | **kotlin.String**| Local date (ISO-8601) for newest event to return (inclusive) |
 **calendarId** | **kotlin.Int**|  | [optional]
 **ext** | **kotlin.String**| Convert workouts to this format (zwo, mrc, erg or fit) and add workout_filename and workout_file_base64 to workout object | [optional]
 **powerRange** | **kotlin.Double**| Percentage used to convert fixed power targets into a range for outdoor workouts only (default is 2.5 or whatever is configured in the Garmin box in /settings) | [optional]
 **hrRange** | **kotlin.Double**| Percentage used to convert fixed HR targets into a range (default is 1.5 or whatever is configured in the Garmin box in /settings) | [optional]
 **paceRange** | **kotlin.Double**| Percentage used to convert fixed pace targets into a range (default is 2.5 or whatever is configured in the Garmin box in /settings) | [optional]
 **locale** | **kotlin.String**| Locale (en, es, de etc.) to use for workouts with steps in multiple languages | [optional]
 **resolve** | **kotlin.Boolean**| Resolve power, heart rate and pace targets to watts, bpm and m/s respectively | [optional] [default to false]

### Return type

[**kotlin.collections.List&lt;Event&gt;**](Event.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


List all tags that have been applied to events on the athlete&#39;s calendar

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(EventsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 

val result : kotlin.collections.List<kotlin.String> = webService.listTags1(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**kotlin.collections.List&lt;kotlin.String&gt;**

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Create a manual activity to match a planned workout

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(EventsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val eventId : kotlin.Int = 56 // kotlin.Int | 

val result : Activity = webService.markEventAsDone(id, eventId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **eventId** | **kotlin.Int**|  |

### Return type

[**Activity**](Activity.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Get an event

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(EventsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val eventId : kotlin.Int = 56 // kotlin.Int | 

val result : Event = webService.showEvent(id, eventId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **eventId** | **kotlin.Int**|  |

### Return type

[**Event**](Event.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Update an event

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(EventsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val eventId : kotlin.Int = 56 // kotlin.Int | 
val eventEx : EventEx =  // EventEx | 

val result : kotlin.Any = webService.updateEvent(id, eventId, eventEx)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **eventId** | **kotlin.Int**|  |
 **eventEx** | [**EventEx**](EventEx.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


Update all events for a date range at once. Only hide_from_athlete and athlete_cannot_edit can be updated

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(EventsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val oldest : kotlin.String = oldest_example // kotlin.String | Local date (ISO-8601) of oldest event to update
val newest : kotlin.String = newest_example // kotlin.String | Local date (ISO-8601) of newest event to update (inclusive)
val event : Event =  // Event | 

val result : kotlin.collections.List<Event> = webService.updateEvents(id, oldest, newest, event)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **oldest** | **kotlin.String**| Local date (ISO-8601) of oldest event to update |
 **newest** | **kotlin.String**| Local date (ISO-8601) of newest event to update (inclusive) |
 **event** | [**Event**](Event.md)|  |

### Return type

[**kotlin.collections.List&lt;Event&gt;**](Event.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

