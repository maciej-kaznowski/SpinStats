# ActivitiesApi

All URIs are relative to *http://intervals.icu*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createManualActivity**](ActivitiesApi.md#createManualActivity) | **POST** api/v1/athlete/{id}/activities/manual | Create a manual activity
[**deleteActivity**](ActivitiesApi.md#deleteActivity) | **DELETE** api/v1/activity/{id} | Delete an activity
[**deleteIntervals**](ActivitiesApi.md#deleteIntervals) | **PUT** api/v1/activity/{id}/delete-intervals | Delete intervals
[**downloadActivitiesAsCSV**](ActivitiesApi.md#downloadActivitiesAsCSV) | **GET** api/v1/athlete/{id}/activities.csv | Download activities as CSV
[**downloadActivityFile**](ActivitiesApi.md#downloadActivityFile) | **GET** api/v1/activity/{id}/file | Download original activity file, Strava activities not supported
[**downloadActivityFitFile**](ActivitiesApi.md#downloadActivityFitFile) | **GET** api/v1/activity/{id}/fit-file | Download Intervals.icu generated activity fit file
[**downloadActivityFitFiles**](ActivitiesApi.md#downloadActivityFitFiles) | **POST** api/v1/athlete/{id}/download-fit-files | Download zip of Intervals.icu generated activity fit files
[**findBestEfforts**](ActivitiesApi.md#findBestEfforts) | **GET** api/v1/activity/{id}/best-efforts | Find best efforts in the activity
[**getActivities**](ActivitiesApi.md#getActivities) | **GET** api/v1/athlete/{athleteId}/activities/{ids} | Fetch multiple activities by id. Missing activities are ignored
[**getActivity**](ActivitiesApi.md#getActivity) | **GET** api/v1/activity/{id} | Get an activity
[**getActivityHRCurve**](ActivitiesApi.md#getActivityHRCurve) | **GET** api/v1/activity/{id}/hr-curve{ext} | Get activity heart rate curve in JSON or CSV (use .csv ext) format
[**getActivityMap**](ActivitiesApi.md#getActivityMap) | **GET** api/v1/activity/{id}/map | Get activity map data
[**getActivityPaceCurve**](ActivitiesApi.md#getActivityPaceCurve) | **GET** api/v1/activity/{id}/pace-curve{ext} | Get activity pace curve in JSON or CSV (use .csv ext) format
[**getActivityPowerCurve**](ActivitiesApi.md#getActivityPowerCurve) | **GET** api/v1/activity/{id}/power-curve{ext} | Get activity power curve in JSON or CSV (use .csv ext) format
[**getActivityPowerSpikeModel**](ActivitiesApi.md#getActivityPowerSpikeModel) | **GET** api/v1/activity/{id}/power-spike-model | Get activity power spike detection model
[**getActivitySegments**](ActivitiesApi.md#getActivitySegments) | **GET** api/v1/activity/{id}/segments | Get activity segments
[**getActivityStreams**](ActivitiesApi.md#getActivityStreams) | **GET** api/v1/activity/{id}/streams{ext} | List streams for the activity
[**getAthleteMMPModel**](ActivitiesApi.md#getAthleteMMPModel) | **GET** api/v1/athlete/{id}/mmp-model | Get the power model used to resolve %MMP steps in workouts for the athlete
[**getGapHistogram**](ActivitiesApi.md#getGapHistogram) | **GET** api/v1/activity/{id}/gap-histogram | Get activity gradient adjusted pace histogram
[**getHRHistogram**](ActivitiesApi.md#getHRHistogram) | **GET** api/v1/activity/{id}/hr-histogram | Get activity heart rate histogram
[**getHRTrainingLoadModel**](ActivitiesApi.md#getHRTrainingLoadModel) | **GET** api/v1/activity/{id}/hr-load-model | Get activity heart rate training load model
[**getIntervalStats**](ActivitiesApi.md#getIntervalStats) | **GET** api/v1/activity/{id}/interval-stats | Return interval like stats for part of the activity
[**getIntervals**](ActivitiesApi.md#getIntervals) | **GET** api/v1/activity/{id}/intervals | Get activity intervals
[**getPaceHistogram**](ActivitiesApi.md#getPaceHistogram) | **GET** api/v1/activity/{id}/pace-histogram | Get activity pace histogram
[**getPowerHRCurve**](ActivitiesApi.md#getPowerHRCurve) | **GET** api/v1/athlete/{id}/power-hr-curve | Get the athlete&#39;s power vs heart rate curve for a date range
[**getPowerHistogram**](ActivitiesApi.md#getPowerHistogram) | **GET** api/v1/activity/{id}/power-histogram | Get activity power histogram
[**getPowerVsHR**](ActivitiesApi.md#getPowerVsHR) | **GET** api/v1/activity/{id}/power-vs-hr{ext} | Get activity power vs heart rate data in JSON or CSV (use .csv ext) format
[**getTimeAtHR**](ActivitiesApi.md#getTimeAtHR) | **GET** api/v1/activity/{id}/time-at-hr | Get activity time at heart rate data
[**listActivities**](ActivitiesApi.md#listActivities) | **GET** api/v1/athlete/{id}/activities | List activities for a date range
[**listActivityHRCurves**](ActivitiesApi.md#listActivityHRCurves) | **GET** api/v1/athlete/{id}/activity-hr-curves{ext} | Get best HR for a range of durations for matching activities in the date range
[**listActivityPaceCurves**](ActivitiesApi.md#listActivityPaceCurves) | **GET** api/v1/athlete/{id}/activity-pace-curves{ext} | Get best pace for a range of distances for matching activities in the date range
[**listActivityPowerCurves**](ActivitiesApi.md#listActivityPowerCurves) | **GET** api/v1/athlete/{id}/activity-power-curves{ext} | Get best power for a range of durations for matching activities in the date range
[**listAthleteHRCurves**](ActivitiesApi.md#listAthleteHRCurves) | **GET** api/v1/athlete/{id}/hr-curves{ext} | List best heart rate curves for the athlete
[**listAthletePaceCurves**](ActivitiesApi.md#listAthletePaceCurves) | **GET** api/v1/athlete/{id}/pace-curves{ext} | List best pace curves for the athlete
[**listAthletePowerCurves**](ActivitiesApi.md#listAthletePowerCurves) | **GET** api/v1/athlete/{id}/power-curves{ext} | List best power curves for the athlete
[**listTags2**](ActivitiesApi.md#listTags2) | **GET** api/v1/athlete/{id}/activity-tags | List all tags that have been applied to the athlete&#39;s activities
[**searchForActivities**](ActivitiesApi.md#searchForActivities) | **GET** api/v1/athlete/{id}/activities/search | Search for activities by name or tag, returns summary info
[**searchForActivitiesFull**](ActivitiesApi.md#searchForActivitiesFull) | **GET** api/v1/athlete/{id}/activities/search-full | Search for activities by name or tag, returns full activities
[**splitInterval**](ActivitiesApi.md#splitInterval) | **PUT** api/v1/activity/{id}/split-interval | Split an interval
[**updateActivity**](ActivitiesApi.md#updateActivity) | **PUT** api/v1/activity/{id} | Update activity
[**updateInterval**](ActivitiesApi.md#updateInterval) | **PUT** api/v1/activity/{id}/intervals/{intervalId} | Update/create an interval
[**updateIntervals**](ActivitiesApi.md#updateIntervals) | **PUT** api/v1/activity/{id}/intervals | Update intervals for an activity
[**uploadActivity**](ActivitiesApi.md#uploadActivity) | **POST** api/v1/athlete/{id}/activities | Create new activities from an uploaded file (fit, tcx, gpx or zip or gz of the same) as multipart/form-data



Create a manual activity

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val activity : Activity =  // Activity | 

val result : Activity = webService.createManualActivity(id, activity)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **activity** | [**Activity**](Activity.md)|  |

### Return type

[**Activity**](Activity.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


Delete an activity

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 

val result : ActivityId = webService.deleteActivity(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**ActivityId**](ActivityId.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Delete intervals

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val interval : kotlin.collections.List<Interval> =  // kotlin.collections.List<Interval> | 

val result : IntervalsDTO = webService.deleteIntervals(id, interval)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **interval** | [**kotlin.collections.List&lt;Interval&gt;**](Interval.md)|  |

### Return type

[**IntervalsDTO**](IntervalsDTO.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


Download activities as CSV

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 

webService.downloadActivitiesAsCSV(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

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


Download original activity file, Strava activities not supported

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 

webService.downloadActivityFile(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

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


Download Intervals.icu generated activity fit file

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val power : kotlin.Boolean = true // kotlin.Boolean | Include power data
val hr : kotlin.Boolean = true // kotlin.Boolean | Include heart rate data

webService.downloadActivityFitFile(id, power, hr)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **power** | **kotlin.Boolean**| Include power data | [optional] [default to true]
 **hr** | **kotlin.Boolean**| Include heart rate data | [optional] [default to true]

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


Download zip of Intervals.icu generated activity fit files

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val ids : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Activity id's to download
val power : kotlin.Boolean = true // kotlin.Boolean | Include power data
val hr : kotlin.Boolean = true // kotlin.Boolean | Include heart rate data

webService.downloadActivityFitFiles(id, ids, power, hr)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **ids** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Activity id&#39;s to download |
 **power** | **kotlin.Boolean**| Include power data | [optional] [default to true]
 **hr** | **kotlin.Boolean**| Include heart rate data | [optional] [default to true]

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


Find best efforts in the activity

One of duration or distance is required

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val stream : kotlin.String = stream_example // kotlin.String | Stream to search
val duration : kotlin.Int = 56 // kotlin.Int | Duration of each effort in seconds
val distance : kotlin.Float = 3.4 // kotlin.Float | Distance of each effort in meters
val count : kotlin.Int = 56 // kotlin.Int | Number of efforts to return
val minValue : kotlin.Float = 3.4 // kotlin.Float | Minimum average value for each interval, intervals will expand if specified
val excludeIntervals : kotlin.Boolean = true // kotlin.Boolean | If true portions of the stream that are included in work intervals are not considered
val startIndex : kotlin.Int = 56 // kotlin.Int | First point in stream to consider
val endIndex : kotlin.Int = 56 // kotlin.Int | Last point in stream to consider (exclusive, default is whole stream)

val result : BestEfforts = webService.findBestEfforts(id, stream, duration, distance, count, minValue, excludeIntervals, startIndex, endIndex)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **stream** | **kotlin.String**| Stream to search |
 **duration** | **kotlin.Int**| Duration of each effort in seconds | [optional]
 **distance** | **kotlin.Float**| Distance of each effort in meters | [optional]
 **count** | **kotlin.Int**| Number of efforts to return | [optional] [default to 8]
 **minValue** | **kotlin.Float**| Minimum average value for each interval, intervals will expand if specified | [optional]
 **excludeIntervals** | **kotlin.Boolean**| If true portions of the stream that are included in work intervals are not considered | [optional] [default to false]
 **startIndex** | **kotlin.Int**| First point in stream to consider | [optional] [default to 0]
 **endIndex** | **kotlin.Int**| Last point in stream to consider (exclusive, default is whole stream) | [optional] [default to 0]

### Return type

[**BestEfforts**](BestEfforts.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Fetch multiple activities by id. Missing activities are ignored

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val athleteId : kotlin.String = athleteId_example // kotlin.String | 
val ids : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | 
val intervals : kotlin.Boolean = true // kotlin.Boolean | Include interval data (icu_intervals and icu_groups fields)

val result : kotlin.collections.List<Activity> = webService.getActivities(athleteId, ids, intervals)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **athleteId** | **kotlin.String**|  |
 **ids** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)|  |
 **intervals** | **kotlin.Boolean**| Include interval data (icu_intervals and icu_groups fields) | [optional]

### Return type

[**kotlin.collections.List&lt;Activity&gt;**](Activity.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Get an activity

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val intervals : kotlin.Boolean = true // kotlin.Boolean | Include interval data

val result : GetActivityDefaultResponse = webService.getActivity(id, intervals)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **intervals** | **kotlin.Boolean**| Include interval data | [optional]

### Return type

[**GetActivityDefaultResponse**](GetActivityDefaultResponse.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Get activity heart rate curve in JSON or CSV (use .csv ext) format

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 

val result : kotlin.Any = webService.getActivityHRCurve(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Get activity map data

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 

val result : MapData = webService.getActivityMap(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**MapData**](MapData.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Get activity pace curve in JSON or CSV (use .csv ext) format

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val gap : kotlin.Boolean = true // kotlin.Boolean | 

val result : kotlin.Any = webService.getActivityPaceCurve(id, gap)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **gap** | **kotlin.Boolean**|  | [optional] [default to false]

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Get activity power curve in JSON or CSV (use .csv ext) format

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val fatigue : kotlin.String = fatigue_example // kotlin.String | Use kj0 or kj1 to get one of the athlete's predefined fatigued power curves

val result : kotlin.Any = webService.getActivityPowerCurve(id, fatigue)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **fatigue** | **kotlin.String**| Use kj0 or kj1 to get one of the athlete&#39;s predefined fatigued power curves | [optional]

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Get activity power spike detection model

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 

val result : PowerModel = webService.getActivityPowerSpikeModel(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**PowerModel**](PowerModel.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Get activity segments

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 

val result : kotlin.collections.List<IcuSegment> = webService.getActivitySegments(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**kotlin.collections.List&lt;IcuSegment&gt;**](IcuSegment.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


List streams for the activity

Note that this endpoint will return &#39;fixed_watts&#39; as &#39;watts&#39;. If &#39;raw_watts&#39; is asked for or types is null then the &#39;watts&#39; stream is renamed to &#39;raw_watts&#39;. If ext is .csv then CSV data is returned instead of JSON

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val types : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Streams required

val result : kotlin.collections.List<ActivityStream> = webService.getActivityStreams(id, types)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **types** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Streams required | [optional]

### Return type

[**kotlin.collections.List&lt;ActivityStream&gt;**](ActivityStream.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Get the power model used to resolve %MMP steps in workouts for the athlete

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val type : kotlin.String = type_example // kotlin.String | 

val result : PowerModel = webService.getAthleteMMPModel(id, type)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **type** | **kotlin.String**|  | [enum: Ride, Run, Swim, WeightTraining, Hike, Walk, AlpineSki, BackcountrySki, Badminton, Canoeing, Crossfit, EBikeRide, EMountainBikeRide, Elliptical, Golf, GravelRide, Handcycle, HighIntensityIntervalTraining, Hockey, IceSkate, InlineSkate, Kayaking, Kitesurf, MountainBikeRide, NordicSki, OpenWaterSwim, Padel, Pilates, Pickleball, Racquetball, Rugby, RockClimbing, RollerSki, Rowing, Sail, Skateboard, Snowboard, Snowshoe, Soccer, Squash, StairStepper, StandUpPaddling, Surfing, TableTennis, Tennis, TrailRun, Transition, Velomobile, VirtualRide, VirtualRow, VirtualRun, WaterSport, Wheelchair, Windsurf, Workout, Yoga, Other]

### Return type

[**PowerModel**](PowerModel.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Get activity gradient adjusted pace histogram

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 

val result : kotlin.collections.List<Bucket> = webService.getGapHistogram(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**kotlin.collections.List&lt;Bucket&gt;**](Bucket.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Get activity heart rate histogram

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val bucketSize : kotlin.Int = 56 // kotlin.Int | Beats per bucket (default 5)

val result : kotlin.collections.List<Bucket> = webService.getHRHistogram(id, bucketSize)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **bucketSize** | **kotlin.Int**| Beats per bucket (default 5) | [optional]

### Return type

[**kotlin.collections.List&lt;Bucket&gt;**](Bucket.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Get activity heart rate training load model

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 

val result : HRLoadModel = webService.getHRTrainingLoadModel(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**HRLoadModel**](HRLoadModel.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Return interval like stats for part of the activity

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val startIndex : kotlin.Int = 56 // kotlin.Int | 
val endIndex : kotlin.Int = 56 // kotlin.Int | 

val result : Interval = webService.getIntervalStats(id, startIndex, endIndex)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **startIndex** | **kotlin.Int**|  |
 **endIndex** | **kotlin.Int**|  |

### Return type

[**Interval**](Interval.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Get activity intervals

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 

val result : IntervalsDTO = webService.getIntervals(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**IntervalsDTO**](IntervalsDTO.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Get activity pace histogram

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 

val result : kotlin.collections.List<Bucket> = webService.getPaceHistogram(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**kotlin.collections.List&lt;Bucket&gt;**](Bucket.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Get the athlete&#39;s power vs heart rate curve for a date range

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val start : kotlin.String = start_example // kotlin.String | Starting local date (ISO-8601)
val end : kotlin.String = end_example // kotlin.String | Ending local date (ISO-8601), inclusive

val result : PowerHRCurve = webService.getPowerHRCurve(id, start, end)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **start** | **kotlin.String**| Starting local date (ISO-8601) |
 **end** | **kotlin.String**| Ending local date (ISO-8601), inclusive |

### Return type

[**PowerHRCurve**](PowerHRCurve.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Get activity power histogram

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val bucketSize : kotlin.Int = 56 // kotlin.Int | Watts per bucket (default 25)

val result : kotlin.collections.List<Bucket> = webService.getPowerHistogram(id, bucketSize)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **bucketSize** | **kotlin.Int**| Watts per bucket (default 25) | [optional]

### Return type

[**kotlin.collections.List&lt;Bucket&gt;**](Bucket.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Get activity power vs heart rate data in JSON or CSV (use .csv ext) format

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 

val result : PowerVsHRPlot = webService.getPowerVsHR(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**PowerVsHRPlot**](PowerVsHRPlot.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Get activity time at heart rate data

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 

val result : Plot = webService.getTimeAtHR(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**Plot**](Plot.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


List activities for a date range

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val oldest : kotlin.String = oldest_example // kotlin.String | Local ISO-8601 date or date and time e.g. 2019-07-22T16:18:49 or 2019-07-22
val newest : kotlin.String = newest_example // kotlin.String | Local ISO-8601 date or date and time

val result : kotlin.collections.List<Activity> = webService.listActivities(id, oldest, newest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **oldest** | **kotlin.String**| Local ISO-8601 date or date and time e.g. 2019-07-22T16:18:49 or 2019-07-22 |
 **newest** | **kotlin.String**| Local ISO-8601 date or date and time |

### Return type

[**kotlin.collections.List&lt;Activity&gt;**](Activity.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Get best HR for a range of durations for matching activities in the date range

Use ext of .csv to get results in CSV format

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val oldest : kotlin.String = oldest_example // kotlin.String | Local ISO-8601 date or date and time e.g. 2019-07-22T16:18:49 or 2019-07-22
val newest : kotlin.String = newest_example // kotlin.String | Local ISO-8601 date or date and time (inclusive)
val filters : kotlin.collections.List<ActivityFilter> =  // kotlin.collections.List<ActivityFilter> | Only return activities matching all the filters in this list
val secs : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | Optional durations to return (default is all, in seconds comma separated)
val type : kotlin.String = type_example // kotlin.String | The sport (Ride, Run etc.). If filters is not provided or is blank or does not contain a type filter then activities for the types of the sport matching this parameter are included

val result : ActivityHRCurvePayload = webService.listActivityHRCurves(id, oldest, newest, filters, secs, type)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **oldest** | **kotlin.String**| Local ISO-8601 date or date and time e.g. 2019-07-22T16:18:49 or 2019-07-22 |
 **newest** | **kotlin.String**| Local ISO-8601 date or date and time (inclusive) |
 **filters** | [**kotlin.collections.List&lt;ActivityFilter&gt;**](ActivityFilter.md)| Only return activities matching all the filters in this list | [optional]
 **secs** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| Optional durations to return (default is all, in seconds comma separated) | [optional]
 **type** | **kotlin.String**| The sport (Ride, Run etc.). If filters is not provided or is blank or does not contain a type filter then activities for the types of the sport matching this parameter are included | [optional] [enum: Ride, Run, Swim, WeightTraining, Hike, Walk, AlpineSki, BackcountrySki, Badminton, Canoeing, Crossfit, EBikeRide, EMountainBikeRide, Elliptical, Golf, GravelRide, Handcycle, HighIntensityIntervalTraining, Hockey, IceSkate, InlineSkate, Kayaking, Kitesurf, MountainBikeRide, NordicSki, OpenWaterSwim, Padel, Pilates, Pickleball, Racquetball, Rugby, RockClimbing, RollerSki, Rowing, Sail, Skateboard, Snowboard, Snowshoe, Soccer, Squash, StairStepper, StandUpPaddling, Surfing, TableTennis, Tennis, TrailRun, Transition, Velomobile, VirtualRide, VirtualRow, VirtualRun, WaterSport, Wheelchair, Windsurf, Workout, Yoga, Other]

### Return type

[**ActivityHRCurvePayload**](ActivityHRCurvePayload.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Get best pace for a range of distances for matching activities in the date range

Use ext of .csv to get results in CSV format

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val oldest : kotlin.String = oldest_example // kotlin.String | Local ISO-8601 date or date and time e.g. 2019-07-22T16:18:49 or 2019-07-22
val newest : kotlin.String = newest_example // kotlin.String | Local ISO-8601 date or date and time (inclusive)
val type : kotlin.String = type_example // kotlin.String | The sport (Ride, Run etc.). If filters is not provided or is blank or does not contain a type filter then activities for the types of the sport matching this parameter are included
val filters : kotlin.collections.List<ActivityFilter> =  // kotlin.collections.List<ActivityFilter> | Only return activities matching all the filters in this list
val distances : kotlin.collections.List<kotlin.Float> =  // kotlin.collections.List<kotlin.Float> | Distances required (in meters, comma separated)
val gap : kotlin.Boolean = true // kotlin.Boolean | Return gradient adjusted pace curves

webService.listActivityPaceCurves(id, oldest, newest, type, filters, distances, gap)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **oldest** | **kotlin.String**| Local ISO-8601 date or date and time e.g. 2019-07-22T16:18:49 or 2019-07-22 |
 **newest** | **kotlin.String**| Local ISO-8601 date or date and time (inclusive) |
 **type** | **kotlin.String**| The sport (Ride, Run etc.). If filters is not provided or is blank or does not contain a type filter then activities for the types of the sport matching this parameter are included | [optional] [enum: Ride, Run, Swim, WeightTraining, Hike, Walk, AlpineSki, BackcountrySki, Badminton, Canoeing, Crossfit, EBikeRide, EMountainBikeRide, Elliptical, Golf, GravelRide, Handcycle, HighIntensityIntervalTraining, Hockey, IceSkate, InlineSkate, Kayaking, Kitesurf, MountainBikeRide, NordicSki, OpenWaterSwim, Padel, Pilates, Pickleball, Racquetball, Rugby, RockClimbing, RollerSki, Rowing, Sail, Skateboard, Snowboard, Snowshoe, Soccer, Squash, StairStepper, StandUpPaddling, Surfing, TableTennis, Tennis, TrailRun, Transition, Velomobile, VirtualRide, VirtualRow, VirtualRun, WaterSport, Wheelchair, Windsurf, Workout, Yoga, Other]
 **filters** | [**kotlin.collections.List&lt;ActivityFilter&gt;**](ActivityFilter.md)| Only return activities matching all the filters in this list | [optional]
 **distances** | [**kotlin.collections.List&lt;kotlin.Float&gt;**](kotlin.Float.md)| Distances required (in meters, comma separated) | [optional]
 **gap** | **kotlin.Boolean**| Return gradient adjusted pace curves | [optional] [default to false]

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


Get best power for a range of durations for matching activities in the date range

Use ext of .csv to get results in CSV format

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val oldest : kotlin.String = oldest_example // kotlin.String | Local ISO-8601 date or date and time e.g. 2019-07-22T16:18:49 or 2019-07-22
val newest : kotlin.String = newest_example // kotlin.String | Local ISO-8601 date or date and time (inclusive)
val filters : kotlin.collections.List<ActivityFilter> =  // kotlin.collections.List<ActivityFilter> | Only return activities matching all the filters in this list
val secs : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | Optional durations to return (default is all, in seconds comma separated)
val type : kotlin.String = type_example // kotlin.String | The sport (Ride, Run etc.). If filters is not provided or is blank or does not contain a type filter then activities for the types of the sport matching this parameter are included. Required if fatigue is used
val fatigue : kotlin.String = fatigue_example // kotlin.String | Use kj0 or kj1 to get one of the athlete's predefined fatigued power curves

val result : ActivityPowerCurvePayload = webService.listActivityPowerCurves(id, oldest, newest, filters, secs, type, fatigue)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **oldest** | **kotlin.String**| Local ISO-8601 date or date and time e.g. 2019-07-22T16:18:49 or 2019-07-22 |
 **newest** | **kotlin.String**| Local ISO-8601 date or date and time (inclusive) |
 **filters** | [**kotlin.collections.List&lt;ActivityFilter&gt;**](ActivityFilter.md)| Only return activities matching all the filters in this list | [optional]
 **secs** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| Optional durations to return (default is all, in seconds comma separated) | [optional]
 **type** | **kotlin.String**| The sport (Ride, Run etc.). If filters is not provided or is blank or does not contain a type filter then activities for the types of the sport matching this parameter are included. Required if fatigue is used | [optional] [enum: Ride, Run, Swim, WeightTraining, Hike, Walk, AlpineSki, BackcountrySki, Badminton, Canoeing, Crossfit, EBikeRide, EMountainBikeRide, Elliptical, Golf, GravelRide, Handcycle, HighIntensityIntervalTraining, Hockey, IceSkate, InlineSkate, Kayaking, Kitesurf, MountainBikeRide, NordicSki, OpenWaterSwim, Padel, Pilates, Pickleball, Racquetball, Rugby, RockClimbing, RollerSki, Rowing, Sail, Skateboard, Snowboard, Snowshoe, Soccer, Squash, StairStepper, StandUpPaddling, Surfing, TableTennis, Tennis, TrailRun, Transition, Velomobile, VirtualRide, VirtualRow, VirtualRun, WaterSport, Wheelchair, Windsurf, Workout, Yoga, Other]
 **fatigue** | **kotlin.String**| Use kj0 or kj1 to get one of the athlete&#39;s predefined fatigued power curves | [optional]

### Return type

[**ActivityPowerCurvePayload**](ActivityPowerCurvePayload.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


List best heart rate curves for the athlete

Curves are specified as follows: 1y (past year), 2y (past 2 years) etc., 42d (past 42 days) etc., s0 (current season), s1 (previous season) etc., all (all time), r.2023-10-01.2023-10-31 (date range)

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val newest : kotlin.String = newest_example // kotlin.String | 
val curves : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Comma separated list of curves to return (default last year)
val type : kotlin.String = type_example // kotlin.String | The sport (Ride, Run etc.). If filters is not provided or is blank or does not contain a type filter then activities for the types of the sport matching this parameter are included
val subMaxEfforts : kotlin.Int = 56 // kotlin.Int | 
val now : kotlin.String = now_example // kotlin.String | Current local date (ISO-8601)
val filters : kotlin.collections.List<ActivityFilter> =  // kotlin.collections.List<ActivityFilter> | Only consider activities matching all the filters in this list

val result : DataCurveSetHRCurve = webService.listAthleteHRCurves(id, newest, curves, type, subMaxEfforts, now, filters)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **newest** | **kotlin.String**|  | [optional]
 **curves** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Comma separated list of curves to return (default last year) | [optional]
 **type** | **kotlin.String**| The sport (Ride, Run etc.). If filters is not provided or is blank or does not contain a type filter then activities for the types of the sport matching this parameter are included | [optional] [enum: Ride, Run, Swim, WeightTraining, Hike, Walk, AlpineSki, BackcountrySki, Badminton, Canoeing, Crossfit, EBikeRide, EMountainBikeRide, Elliptical, Golf, GravelRide, Handcycle, HighIntensityIntervalTraining, Hockey, IceSkate, InlineSkate, Kayaking, Kitesurf, MountainBikeRide, NordicSki, OpenWaterSwim, Padel, Pilates, Pickleball, Racquetball, Rugby, RockClimbing, RollerSki, Rowing, Sail, Skateboard, Snowboard, Snowshoe, Soccer, Squash, StairStepper, StandUpPaddling, Surfing, TableTennis, Tennis, TrailRun, Transition, Velomobile, VirtualRide, VirtualRow, VirtualRun, WaterSport, Wheelchair, Windsurf, Workout, Yoga, Other]
 **subMaxEfforts** | **kotlin.Int**|  | [optional] [default to 0]
 **now** | **kotlin.String**| Current local date (ISO-8601) | [optional]
 **filters** | [**kotlin.collections.List&lt;ActivityFilter&gt;**](ActivityFilter.md)| Only consider activities matching all the filters in this list | [optional]

### Return type

[**DataCurveSetHRCurve**](DataCurveSetHRCurve.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


List best pace curves for the athlete

Curves are specified as follows: 1y (past year), 2y (past 2 years) etc., 42d (past 42 days) etc., s0 (current season), s1 (previous season) etc., all (all time), r.2023-10-01.2023-10-31 (date range)

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val newest : kotlin.String = newest_example // kotlin.String | 
val curves : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Comma separated list of curves to return (default last year)
val type : kotlin.String = type_example // kotlin.String | The sport (Ride, Run etc.). If filters is not provided or is blank or does not contain a type filter then activities for the types of the sport matching this parameter are included
val includeRanks : kotlin.Boolean = true // kotlin.Boolean | 
val subMaxEfforts : kotlin.Int = 56 // kotlin.Int | 
val now : kotlin.String = now_example // kotlin.String | Current local date (ISO-8601)
val gap : kotlin.Boolean = true // kotlin.Boolean | Return gradient adjusted pace curves
val pmType : kotlin.String = pmType_example // kotlin.String | 
val filters : kotlin.collections.List<ActivityFilter> =  // kotlin.collections.List<ActivityFilter> | Only consider activities matching all the filters in this list

val result : DataCurveSetPaceCurve = webService.listAthletePaceCurves(id, newest, curves, type, includeRanks, subMaxEfforts, now, gap, pmType, filters)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **newest** | **kotlin.String**|  | [optional]
 **curves** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Comma separated list of curves to return (default last year) | [optional]
 **type** | **kotlin.String**| The sport (Ride, Run etc.). If filters is not provided or is blank or does not contain a type filter then activities for the types of the sport matching this parameter are included | [optional] [enum: Ride, Run, Swim, WeightTraining, Hike, Walk, AlpineSki, BackcountrySki, Badminton, Canoeing, Crossfit, EBikeRide, EMountainBikeRide, Elliptical, Golf, GravelRide, Handcycle, HighIntensityIntervalTraining, Hockey, IceSkate, InlineSkate, Kayaking, Kitesurf, MountainBikeRide, NordicSki, OpenWaterSwim, Padel, Pilates, Pickleball, Racquetball, Rugby, RockClimbing, RollerSki, Rowing, Sail, Skateboard, Snowboard, Snowshoe, Soccer, Squash, StairStepper, StandUpPaddling, Surfing, TableTennis, Tennis, TrailRun, Transition, Velomobile, VirtualRide, VirtualRow, VirtualRun, WaterSport, Wheelchair, Windsurf, Workout, Yoga, Other]
 **includeRanks** | **kotlin.Boolean**|  | [optional] [default to false]
 **subMaxEfforts** | **kotlin.Int**|  | [optional] [default to 0]
 **now** | **kotlin.String**| Current local date (ISO-8601) | [optional]
 **gap** | **kotlin.Boolean**| Return gradient adjusted pace curves | [optional] [default to false]
 **pmType** | **kotlin.String**|  | [optional] [enum: CS]
 **filters** | [**kotlin.collections.List&lt;ActivityFilter&gt;**](ActivityFilter.md)| Only consider activities matching all the filters in this list | [optional]

### Return type

[**DataCurveSetPaceCurve**](DataCurveSetPaceCurve.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


List best power curves for the athlete

Curves are specified as follows: 1y (past year), 2y (past 2 years) etc., 42d (past 42 days) etc., s0 (current season), s1 (previous season) etc., all (all time), r.2023-10-01.2023-10-31 (date range). Curves can also have a -kj0 or -kj1 suffix to return fatigued curves

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val type : kotlin.String = type_example // kotlin.String | The sport (Ride, Run etc.). If filters is not provided or is blank or does not contain a type filter then activities for the types of the sport matching this parameter are included
val newest : kotlin.String = newest_example // kotlin.String | 
val curves : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Comma separated list of curves to return (default last year)
val includeRanks : kotlin.Boolean = true // kotlin.Boolean | 
val subMaxEfforts : kotlin.Int = 56 // kotlin.Int | 
val now : kotlin.String = now_example // kotlin.String | Current local date (ISO-8601)
val pmType : kotlin.String = pmType_example // kotlin.String | 
val filters : kotlin.collections.List<ActivityFilter> =  // kotlin.collections.List<ActivityFilter> | Only consider activities matching all the filters in this list

val result : DataCurveSetPowerCurve = webService.listAthletePowerCurves(id, type, newest, curves, includeRanks, subMaxEfforts, now, pmType, filters)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **type** | **kotlin.String**| The sport (Ride, Run etc.). If filters is not provided or is blank or does not contain a type filter then activities for the types of the sport matching this parameter are included | [enum: Ride, Run, Swim, WeightTraining, Hike, Walk, AlpineSki, BackcountrySki, Badminton, Canoeing, Crossfit, EBikeRide, EMountainBikeRide, Elliptical, Golf, GravelRide, Handcycle, HighIntensityIntervalTraining, Hockey, IceSkate, InlineSkate, Kayaking, Kitesurf, MountainBikeRide, NordicSki, OpenWaterSwim, Padel, Pilates, Pickleball, Racquetball, Rugby, RockClimbing, RollerSki, Rowing, Sail, Skateboard, Snowboard, Snowshoe, Soccer, Squash, StairStepper, StandUpPaddling, Surfing, TableTennis, Tennis, TrailRun, Transition, Velomobile, VirtualRide, VirtualRow, VirtualRun, WaterSport, Wheelchair, Windsurf, Workout, Yoga, Other]
 **newest** | **kotlin.String**|  | [optional]
 **curves** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Comma separated list of curves to return (default last year) | [optional]
 **includeRanks** | **kotlin.Boolean**|  | [optional] [default to false]
 **subMaxEfforts** | **kotlin.Int**|  | [optional] [default to 0]
 **now** | **kotlin.String**| Current local date (ISO-8601) | [optional]
 **pmType** | **kotlin.String**|  | [optional] [enum: MS_2P, MORTON_3P, FFT_CURVES, ECP]
 **filters** | [**kotlin.collections.List&lt;ActivityFilter&gt;**](ActivityFilter.md)| Only consider activities matching all the filters in this list | [optional]

### Return type

[**DataCurveSetPowerCurve**](DataCurveSetPowerCurve.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


List all tags that have been applied to the athlete&#39;s activities

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 

val result : kotlin.collections.List<kotlin.String> = webService.listTags2(id)
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


Search for activities by name or tag, returns summary info

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val q : kotlin.String = q_example // kotlin.String | Search query, case insensitive name search or exact tag search if it starts with #
val limit : kotlin.Int = 56 // kotlin.Int | 

val result : kotlin.collections.List<ActivitySearchResult> = webService.searchForActivities(id, q, limit)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **q** | **kotlin.String**| Search query, case insensitive name search or exact tag search if it starts with # |
 **limit** | **kotlin.Int**|  | [optional]

### Return type

[**kotlin.collections.List&lt;ActivitySearchResult&gt;**](ActivitySearchResult.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Search for activities by name or tag, returns full activities

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val q : kotlin.String = q_example // kotlin.String | Search query, case insensitive name search or exact tag search if it starts with #
val limit : kotlin.Int = 56 // kotlin.Int | 

val result : kotlin.collections.List<Activity> = webService.searchForActivitiesFull(id, q, limit)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **q** | **kotlin.String**| Search query, case insensitive name search or exact tag search if it starts with # |
 **limit** | **kotlin.Int**|  | [optional]

### Return type

[**kotlin.collections.List&lt;Activity&gt;**](Activity.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Split an interval

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val splitAt : kotlin.Int = 56 // kotlin.Int | Index to split interval at

val result : IntervalsDTO = webService.splitInterval(id, splitAt)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **splitAt** | **kotlin.Int**| Index to split interval at |

### Return type

[**IntervalsDTO**](IntervalsDTO.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Update activity

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val activity : Activity =  // Activity | 

val result : Activity = webService.updateActivity(id, activity)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **activity** | [**Activity**](Activity.md)|  |

### Return type

[**Activity**](Activity.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


Update/create an interval

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val intervalId : kotlin.Int = 56 // kotlin.Int | 
val interval : Interval =  // Interval | 

val result : IntervalsDTO = webService.updateInterval(id, intervalId, interval)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **intervalId** | **kotlin.Int**|  |
 **interval** | [**Interval**](Interval.md)|  |

### Return type

[**IntervalsDTO**](IntervalsDTO.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


Update intervals for an activity

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val interval : kotlin.collections.List<Interval> =  // kotlin.collections.List<Interval> | 
val all : kotlin.Boolean = true // kotlin.Boolean | Any existing intervals are replaced, otherwise a merge is done

val result : IntervalsDTO = webService.updateIntervals(id, interval, all)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **interval** | [**kotlin.collections.List&lt;Interval&gt;**](Interval.md)|  |
 **all** | **kotlin.Boolean**| Any existing intervals are replaced, otherwise a merge is done | [optional] [default to true]

### Return type

[**IntervalsDTO**](IntervalsDTO.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


Create new activities from an uploaded file (fit, tcx, gpx or zip or gz of the same) as multipart/form-data

Multisport files are split into multiple activities. Activities are de-duped using a hash of the file. Response code is 201 if at least one new actvity was created and 200 otherwise (all dups).

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ActivitiesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | Activity name
val description : kotlin.String = description_example // kotlin.String | Activity description
val pairedEventId : kotlin.Int = 56 // kotlin.Int | Workout to pair with activity

val result : UploadResponse = webService.uploadActivity(id, name, description, pairedEventId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **name** | **kotlin.String**| Activity name | [optional]
 **description** | **kotlin.String**| Activity description | [optional]
 **pairedEventId** | **kotlin.Int**| Workout to pair with activity | [optional]

### Return type

[**UploadResponse**](UploadResponse.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: multipart/form-data, application/json
 - **Accept**: */*

