# LibraryApi

All URIs are relative to *http://intervals.icu*

Method | HTTP request | Description
------------- | ------------- | -------------
[**applyCurrentPlanChanges**](LibraryApi.md#applyCurrentPlanChanges) | **PUT** api/v1/athlete/{id}/apply-plan-changes | Apply any changes from the athlete&#39;s current plan to the athlete&#39;s calendar
[**createFolder**](LibraryApi.md#createFolder) | **POST** api/v1/athlete/{id}/folders | Create a new workout folder or plan
[**createMultipleWorkouts**](LibraryApi.md#createMultipleWorkouts) | **POST** api/v1/athlete/{id}/workouts/bulk | Create multiple new workouts in a folder or plan in the athlete&#39;s workout library
[**createWorkout**](LibraryApi.md#createWorkout) | **POST** api/v1/athlete/{id}/workouts | Create a new workout in a folder or plan in the athlete&#39;s workout library
[**deleteFolder**](LibraryApi.md#deleteFolder) | **DELETE** api/v1/athlete/{id}/folders/{folderId} | Delete a workout folder or plan including all workouts
[**deleteWorkout**](LibraryApi.md#deleteWorkout) | **DELETE** api/v1/athlete/{id}/workouts/{workoutId} | Delete a workout (and optionally others added at the same time if the workout is on a plan)
[**downloadWorkout**](LibraryApi.md#downloadWorkout) | **POST** api/v1/download-workout{ext} | Convert a workout to .zwo (Zwift), .mrc, .erg or .fit
[**downloadWorkoutForAthlete**](LibraryApi.md#downloadWorkoutForAthlete) | **POST** api/v1/athlete/{id}/download-workout{ext} | Convert a workout to .zwo (Zwift), .mrc, .erg or .fit.
[**duplicateWorkouts**](LibraryApi.md#duplicateWorkouts) | **POST** api/v1/athlete/{id}/duplicate-workouts | Duplicate workouts on a plan
[**importWorkoutFile**](LibraryApi.md#importWorkoutFile) | **POST** api/v1/athlete/{id}/folders/{folderId}/import-workout | Create new workout from .zwo, .mrc, .erg or .fit file in a folder
[**listFolderSharedWith**](LibraryApi.md#listFolderSharedWith) | **GET** api/v1/athlete/{id}/folders/{folderId}/shared-with | List athletes that the folder or plan has been shared with
[**listFolders**](LibraryApi.md#listFolders) | **GET** api/v1/athlete/{id}/folders | List all the athlete&#39;s folders, plans and workouts
[**listTags**](LibraryApi.md#listTags) | **GET** api/v1/athlete/{id}/workout-tags | List all tags that have been applied to workouts in the athlete&#39;s library
[**listWorkouts**](LibraryApi.md#listWorkouts) | **GET** api/v1/athlete/{id}/workouts | List all the workouts in the athlete&#39;s library
[**showWorkout**](LibraryApi.md#showWorkout) | **GET** api/v1/athlete/{id}/workouts/{workoutId} | Get a workout
[**updateFolder**](LibraryApi.md#updateFolder) | **PUT** api/v1/athlete/{id}/folders/{folderId} | Update a workout folder or plan
[**updateFolderSharedWith**](LibraryApi.md#updateFolderSharedWith) | **PUT** api/v1/athlete/{id}/folders/{folderId}/shared-with | Add/remove athletes from the share list for the folder
[**updatePlanWorkouts**](LibraryApi.md#updatePlanWorkouts) | **PUT** api/v1/athlete/{id}/folders/{folderId}/workouts | Update a range of workouts on a plan. Currently only hide_from_athlete can be changed
[**updateWorkout**](LibraryApi.md#updateWorkout) | **PUT** api/v1/athlete/{id}/workouts/{workoutId} | Update a workout



Apply any changes from the athlete&#39;s current plan to the athlete&#39;s calendar

Only workouts from today or in the future are updated

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(LibraryApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 

val result : kotlin.collections.Map<kotlin.String, kotlin.Any> = webService.applyCurrentPlanChanges(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

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


Create a new workout folder or plan

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(LibraryApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val createFolderDTO : CreateFolderDTO =  // CreateFolderDTO | 

val result : Folder = webService.createFolder(id, createFolderDTO)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **createFolderDTO** | [**CreateFolderDTO**](CreateFolderDTO.md)|  |

### Return type

[**Folder**](Folder.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


Create multiple new workouts in a folder or plan in the athlete&#39;s workout library

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(LibraryApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val workoutEx : kotlin.collections.List<WorkoutEx> =  // kotlin.collections.List<WorkoutEx> | 

val result : kotlin.collections.List<Workout> = webService.createMultipleWorkouts(id, workoutEx)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **workoutEx** | [**kotlin.collections.List&lt;WorkoutEx&gt;**](WorkoutEx.md)|  |

### Return type

[**kotlin.collections.List&lt;Workout&gt;**](Workout.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


Create a new workout in a folder or plan in the athlete&#39;s workout library

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
val webService = apiClient.createWebservice(LibraryApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val workoutEx : WorkoutEx =  // WorkoutEx | 

val result : Workout = webService.createWorkout(id, workoutEx)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **workoutEx** | [**WorkoutEx**](WorkoutEx.md)|  |

### Return type

[**Workout**](Workout.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


Delete a workout folder or plan including all workouts

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(LibraryApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val folderId : kotlin.Int = 56 // kotlin.Int | 

val result : kotlin.collections.Map<kotlin.String, kotlin.Any> = webService.deleteFolder(id, folderId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **folderId** | **kotlin.Int**|  |

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


Delete a workout (and optionally others added at the same time if the workout is on a plan)

Returns the ids of the deleted workout(s)

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(LibraryApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val workoutId : kotlin.Int = 56 // kotlin.Int | 
val others : kotlin.Boolean = true // kotlin.Boolean | 

val result : kotlin.collections.List<kotlin.Int> = webService.deleteWorkout(id, workoutId, others)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **workoutId** | **kotlin.Int**|  |
 **others** | **kotlin.Boolean**|  | [optional]

### Return type

**kotlin.collections.List&lt;kotlin.Int&gt;**

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Convert a workout to .zwo (Zwift), .mrc, .erg or .fit

The athlete to use is extracted from the bearer token and used to resolve power targets etc.. Note that the create workout endpoint can convert workouts and might be more convenient.

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(LibraryApi::class.java)
val ext : kotlin.String = ext_example // kotlin.String | 
val workout : Workout =  // Workout | 

webService.downloadWorkout(ext, workout)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ext** | **kotlin.String**|  |
 **workout** | [**Workout**](Workout.md)|  |

### Return type

null (empty response body)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


Convert a workout to .zwo (Zwift), .mrc, .erg or .fit.

The athlete&#39;s settings are used to resolve power targets etc.. Note that the create workout endpoint can convert workouts and might be more convenient.

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(LibraryApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val ext : kotlin.String = ext_example // kotlin.String | 
val workout : Workout =  // Workout | 

webService.downloadWorkoutForAthlete(id, ext, workout)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **ext** | **kotlin.String**|  |
 **workout** | [**Workout**](Workout.md)|  |

### Return type

null (empty response body)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


Duplicate workouts on a plan

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(LibraryApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val duplicateWorkoutsDTO : DuplicateWorkoutsDTO =  // DuplicateWorkoutsDTO | 

val result : kotlin.collections.List<Workout> = webService.duplicateWorkouts(id, duplicateWorkoutsDTO)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **duplicateWorkoutsDTO** | [**DuplicateWorkoutsDTO**](DuplicateWorkoutsDTO.md)|  |

### Return type

[**kotlin.collections.List&lt;Workout&gt;**](Workout.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


Create new workout from .zwo, .mrc, .erg or .fit file in a folder

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(LibraryApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val folderId : kotlin.Int = 56 // kotlin.Int | 
val type : kotlin.String = type_example // kotlin.String | 
val athleteId : kotlin.String = athleteId_example // kotlin.String | 
val uploadWellnessRequest : UploadWellnessRequest =  // UploadWellnessRequest | 

val result : Workout = webService.importWorkoutFile(id, folderId, type, athleteId, uploadWellnessRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **folderId** | **kotlin.Int**|  |
 **type** | **kotlin.String**|  | [enum: Ride, Run, Swim, WeightTraining, Hike, Walk, AlpineSki, BackcountrySki, Badminton, Canoeing, Crossfit, EBikeRide, EMountainBikeRide, Elliptical, Golf, GravelRide, Handcycle, HighIntensityIntervalTraining, Hockey, IceSkate, InlineSkate, Kayaking, Kitesurf, MountainBikeRide, NordicSki, OpenWaterSwim, Padel, Pilates, Pickleball, Racquetball, Rugby, RockClimbing, RollerSki, Rowing, Sail, Skateboard, Snowboard, Snowshoe, Soccer, Squash, StairStepper, StandUpPaddling, Surfing, TableTennis, Tennis, TrailRun, Transition, Velomobile, VirtualRide, VirtualRow, VirtualRun, WaterSport, Wheelchair, Windsurf, Workout, Yoga, Other]
 **athleteId** | **kotlin.String**|  | [optional]
 **uploadWellnessRequest** | [**UploadWellnessRequest**](UploadWellnessRequest.md)|  | [optional]

### Return type

[**Workout**](Workout.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


List athletes that the folder or plan has been shared with

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(LibraryApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val folderId : kotlin.Int = 56 // kotlin.Int | 

val result : kotlin.collections.List<SharedWith> = webService.listFolderSharedWith(id, folderId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **folderId** | **kotlin.Int**|  |

### Return type

[**kotlin.collections.List&lt;SharedWith&gt;**](SharedWith.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


List all the athlete&#39;s folders, plans and workouts

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(LibraryApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 

val result : kotlin.collections.List<Folder> = webService.listFolders(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**kotlin.collections.List&lt;Folder&gt;**](Folder.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


List all tags that have been applied to workouts in the athlete&#39;s library

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(LibraryApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 

val result : kotlin.collections.List<kotlin.String> = webService.listTags(id)
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


List all the workouts in the athlete&#39;s library

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(LibraryApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 

val result : kotlin.collections.List<Workout> = webService.listWorkouts(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**kotlin.collections.List&lt;Workout&gt;**](Workout.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Get a workout

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(LibraryApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val workoutId : kotlin.Int = 56 // kotlin.Int | 

val result : Workout = webService.showWorkout(id, workoutId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **workoutId** | **kotlin.Int**|  |

### Return type

[**Workout**](Workout.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Update a workout folder or plan

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(LibraryApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val folderId : kotlin.Int = 56 // kotlin.Int | 
val folder : Folder =  // Folder | 

val result : Folder = webService.updateFolder(id, folderId, folder)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **folderId** | **kotlin.Int**|  |
 **folder** | [**Folder**](Folder.md)|  |

### Return type

[**Folder**](Folder.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


Add/remove athletes from the share list for the folder

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(LibraryApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val folderId : kotlin.Int = 56 // kotlin.Int | 
val sharedWith : kotlin.collections.List<SharedWith> =  // kotlin.collections.List<SharedWith> | 

val result : kotlin.collections.List<SharedWith> = webService.updateFolderSharedWith(id, folderId, sharedWith)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **folderId** | **kotlin.Int**|  |
 **sharedWith** | [**kotlin.collections.List&lt;SharedWith&gt;**](SharedWith.md)|  |

### Return type

[**kotlin.collections.List&lt;SharedWith&gt;**](SharedWith.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


Update a range of workouts on a plan. Currently only hide_from_athlete can be changed

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(LibraryApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val folderId : kotlin.Int = 56 // kotlin.Int | 
val oldest : kotlin.Int = 56 // kotlin.Int | 
val newest : kotlin.Int = 56 // kotlin.Int | 
val workout : Workout =  // Workout | 

val result : kotlin.collections.List<Workout> = webService.updatePlanWorkouts(id, folderId, oldest, newest, workout)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **folderId** | **kotlin.Int**|  |
 **oldest** | **kotlin.Int**|  |
 **newest** | **kotlin.Int**|  |
 **workout** | [**Workout**](Workout.md)|  |

### Return type

[**kotlin.collections.List&lt;Workout&gt;**](Workout.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


Update a workout

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(LibraryApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val workoutId : kotlin.Int = 56 // kotlin.Int | 
val workoutEx : WorkoutEx =  // WorkoutEx | 

val result : Workout = webService.updateWorkout(id, workoutId, workoutEx)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **workoutId** | **kotlin.Int**|  |
 **workoutEx** | [**WorkoutEx**](WorkoutEx.md)|  |

### Return type

[**Workout**](Workout.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

