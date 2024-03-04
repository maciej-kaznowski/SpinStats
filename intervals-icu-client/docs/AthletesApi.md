# AthletesApi

All URIs are relative to *http://intervals.icu*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAthlete**](AthletesApi.md#getAthlete) | **GET** api/v1/athlete/{id} | Get the athlete with sportSettings and custom_items
[**getAthleteProfile**](AthletesApi.md#getAthleteProfile) | **GET** api/v1/athlete/{id}/profile | Get athlete profile info
[**getAthleteSummary**](AthletesApi.md#getAthleteSummary) | **GET** api/v1/athlete/{id}/athlete-summary{ext} | 
[**getAthleteTrainingPlan**](AthletesApi.md#getAthleteTrainingPlan) | **GET** api/v1/athlete/{id}/training-plan | Get the athlete&#39;s training plan
[**getSettings**](AthletesApi.md#getSettings) | **GET** api/v1/athlete/{id}/settings/{deviceClass} | Get the athlete&#39;s settings for phone, tablet or desktop
[**updateAthlete**](AthletesApi.md#updateAthlete) | **PUT** api/v1/athlete/{id} | Update an athlete
[**updateAthletePlan**](AthletesApi.md#updateAthletePlan) | **PUT** api/v1/athlete/{id}/training-plan | Change the athlete&#39;s training plan
[**updateAthletePlans**](AthletesApi.md#updateAthletePlans) | **PUT** api/v1/athlete-plans | Change training plans for a list of athletes



Get the athlete with sportSettings and custom_items

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AthletesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 

val result : WithSportSettings = webService.getAthlete(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**WithSportSettings**](WithSportSettings.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Get athlete profile info

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AthletesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 

val result : AthleteProfile = webService.getAthleteProfile(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**AthleteProfile**](AthleteProfile.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*




### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AthletesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val start : kotlin.String = start_example // kotlin.String | 
val end : kotlin.String = end_example // kotlin.String | 
val tags : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | 

val result : kotlin.collections.List<SummaryWithCats> = webService.getAthleteSummary(id, start, end, tags)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **start** | **kotlin.String**|  |
 **end** | **kotlin.String**|  |
 **tags** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]

### Return type

[**kotlin.collections.List&lt;SummaryWithCats&gt;**](SummaryWithCats.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Get the athlete&#39;s training plan

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AthletesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 

val result : kotlin.Any = webService.getAthleteTrainingPlan(id)
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


Get the athlete&#39;s settings for phone, tablet or desktop

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AthletesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val deviceClass : kotlin.String = deviceClass_example // kotlin.String | 

val result : kotlin.collections.Map<kotlin.String, kotlin.Any> = webService.getSettings(id, deviceClass)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **deviceClass** | **kotlin.String**|  |

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


Update an athlete

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AthletesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val athleteUpdateDTO : AthleteUpdateDTO =  // AthleteUpdateDTO | 

val result : Athlete = webService.updateAthlete(id, athleteUpdateDTO)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **athleteUpdateDTO** | [**AthleteUpdateDTO**](AthleteUpdateDTO.md)|  |

### Return type

[**Athlete**](Athlete.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


Change the athlete&#39;s training plan

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AthletesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val athlete : Athlete =  // Athlete | 

val result : kotlin.Any = webService.updateAthletePlan(id, athlete)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **athlete** | [**Athlete**](Athlete.md)|  |

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


Change training plans for a list of athletes

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AthletesApi::class.java)
val athlete : kotlin.collections.List<Athlete> =  // kotlin.collections.List<Athlete> | 

val result : kotlin.Any = webService.updateAthletePlans(athlete)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **athlete** | [**kotlin.collections.List&lt;Athlete&gt;**](Athlete.md)|  |

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

