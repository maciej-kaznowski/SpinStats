# SportsApi

All URIs are relative to *http://intervals.icu*

Method | HTTP request | Description
------------- | ------------- | -------------
[**applyToActivities**](SportsApi.md#applyToActivities) | **PUT** api/v1/athlete/{athleteId}/sport-settings/{id}/apply | Apply sport settings to matching activities (updates zones), done asynchronously
[**createSettings**](SportsApi.md#createSettings) | **POST** api/v1/athlete/{athleteId}/sport-settings | Create settings for a sport with default values
[**deleteSettings**](SportsApi.md#deleteSettings) | **DELETE** api/v1/athlete/{athleteId}/sport-settings/{id} | Delete sport settings
[**getSettings1**](SportsApi.md#getSettings1) | **GET** api/v1/athlete/{athleteId}/sport-settings/{id} | Get sport settings by id or activity type e.g. Run, Ride etc.
[**listMatchingActivities**](SportsApi.md#listMatchingActivities) | **GET** api/v1/athlete/{athleteId}/sport-settings/{id}/matching-activities | List activities matching the settings
[**listPaceDistances**](SportsApi.md#listPaceDistances) | **GET** api/v1/pace_distances | List pace curve distances
[**listPaceDistancesForSport**](SportsApi.md#listPaceDistancesForSport) | **GET** api/v1/athlete/{athleteId}/sport-settings/{id}/pace_distances | List pace curve distances and best effort defaults for the sport
[**listSettings**](SportsApi.md#listSettings) | **GET** api/v1/athlete/{athleteId}/sport-settings | List sport settings for the athlete
[**updateSettings**](SportsApi.md#updateSettings) | **PUT** api/v1/athlete/{athleteId}/sport-settings/{id} | Update sport settings by id or activity type e.g. Run, Ride etc.
[**updateSettingsMulti**](SportsApi.md#updateSettingsMulti) | **PUT** api/v1/athlete/{athleteId}/sport-settings | Update multiple sport settings



Apply sport settings to matching activities (updates zones), done asynchronously

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(SportsApi::class.java)
val athleteId : kotlin.String = athleteId_example // kotlin.String | 
val id : kotlin.String = id_example // kotlin.String | 

val result : kotlin.Any = webService.applyToActivities(athleteId, id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **athleteId** | **kotlin.String**|  |
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


Create settings for a sport with default values

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(SportsApi::class.java)
val athleteId : kotlin.String = athleteId_example // kotlin.String | 
val sportSettings : SportSettings =  // SportSettings | 

val result : SportSettings = webService.createSettings(athleteId, sportSettings)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **athleteId** | **kotlin.String**|  |
 **sportSettings** | [**SportSettings**](SportSettings.md)|  |

### Return type

[**SportSettings**](SportSettings.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


Delete sport settings

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(SportsApi::class.java)
val athleteId : kotlin.String = athleteId_example // kotlin.String | 
val id : kotlin.Int = 56 // kotlin.Int | 

val result : kotlin.Any = webService.deleteSettings(athleteId, id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **athleteId** | **kotlin.String**|  |
 **id** | **kotlin.Int**|  |

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


Get sport settings by id or activity type e.g. Run, Ride etc.

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(SportsApi::class.java)
val athleteId : kotlin.String = athleteId_example // kotlin.String | 
val id : kotlin.String = id_example // kotlin.String | 

val result : SportSettings = webService.getSettings1(athleteId, id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **athleteId** | **kotlin.String**|  |
 **id** | **kotlin.String**|  |

### Return type

[**SportSettings**](SportSettings.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


List activities matching the settings

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(SportsApi::class.java)
val athleteId : kotlin.String = athleteId_example // kotlin.String | 
val id : kotlin.String = id_example // kotlin.String | 

val result : kotlin.collections.List<ActivityMini> = webService.listMatchingActivities(athleteId, id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **athleteId** | **kotlin.String**|  |
 **id** | **kotlin.String**|  |

### Return type

[**kotlin.collections.List&lt;ActivityMini&gt;**](ActivityMini.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


List pace curve distances

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(SportsApi::class.java)

val result : PaceDistancesDTO = webService.listPaceDistances()
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PaceDistancesDTO**](PaceDistancesDTO.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


List pace curve distances and best effort defaults for the sport

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(SportsApi::class.java)
val athleteId : kotlin.String = athleteId_example // kotlin.String | 
val id : kotlin.String = id_example // kotlin.String | 

val result : PaceDistancesDTO = webService.listPaceDistancesForSport(athleteId, id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **athleteId** | **kotlin.String**|  |
 **id** | **kotlin.String**|  |

### Return type

[**PaceDistancesDTO**](PaceDistancesDTO.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


List sport settings for the athlete

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(SportsApi::class.java)
val athleteId : kotlin.String = athleteId_example // kotlin.String | 

val result : kotlin.collections.List<SportSettings> = webService.listSettings(athleteId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **athleteId** | **kotlin.String**|  |

### Return type

[**kotlin.collections.List&lt;SportSettings&gt;**](SportSettings.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Update sport settings by id or activity type e.g. Run, Ride etc.

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(SportsApi::class.java)
val athleteId : kotlin.String = athleteId_example // kotlin.String | 
val id : kotlin.String = id_example // kotlin.String | 
val recalcHrZones : kotlin.Boolean = true // kotlin.Boolean | 
val sportSettings : SportSettings =  // SportSettings | 

val result : SportSettings = webService.updateSettings(athleteId, id, recalcHrZones, sportSettings)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **athleteId** | **kotlin.String**|  |
 **id** | **kotlin.String**|  |
 **recalcHrZones** | **kotlin.Boolean**|  |
 **sportSettings** | [**SportSettings**](SportSettings.md)|  |

### Return type

[**SportSettings**](SportSettings.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


Update multiple sport settings

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(SportsApi::class.java)
val athleteId : kotlin.String = athleteId_example // kotlin.String | 
val recalcHrZones : kotlin.Boolean = true // kotlin.Boolean | 
val sportSettings : kotlin.collections.List<SportSettings> =  // kotlin.collections.List<SportSettings> | 

val result : kotlin.collections.List<SportSettings> = webService.updateSettingsMulti(athleteId, recalcHrZones, sportSettings)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **athleteId** | **kotlin.String**|  |
 **recalcHrZones** | **kotlin.Boolean**|  |
 **sportSettings** | [**kotlin.collections.List&lt;SportSettings&gt;**](SportSettings.md)|  |

### Return type

[**kotlin.collections.List&lt;SportSettings&gt;**](SportSettings.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

