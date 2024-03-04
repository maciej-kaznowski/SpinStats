# SharedEventsApi

All URIs are relative to *http://intervals.icu*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSharedEvent**](SharedEventsApi.md#createSharedEvent) | **POST** api/v1/shared-event | Create a shared event (e.g. race)
[**deleteSharedEvent**](SharedEventsApi.md#deleteSharedEvent) | **DELETE** api/v1/shared-event/{id} | Delete a shared event (e.g. race)
[**getSharedEvent**](SharedEventsApi.md#getSharedEvent) | **GET** api/v1/shared-event/{id} | Get a shared event (e.g. race)
[**updateSharedEvent**](SharedEventsApi.md#updateSharedEvent) | **PUT** api/v1/shared-event/{id} | Update a shared event (e.g. race)



Create a shared event (e.g. race)

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(SharedEventsApi::class.java)
val sharedEvent : SharedEvent =  // SharedEvent | 
val linkToEventId : kotlin.Int = 56 // kotlin.Int | 

val result : SharedEvent = webService.createSharedEvent(sharedEvent, linkToEventId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sharedEvent** | [**SharedEvent**](SharedEvent.md)|  |
 **linkToEventId** | **kotlin.Int**|  | [optional]

### Return type

[**SharedEvent**](SharedEvent.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


Delete a shared event (e.g. race)

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(SharedEventsApi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | 

webService.deleteSharedEvent(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**|  |

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


Get a shared event (e.g. race)

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(SharedEventsApi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | 

val result : SharedEvent = webService.getSharedEvent(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**|  |

### Return type

[**SharedEvent**](SharedEvent.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Update a shared event (e.g. race)

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(SharedEventsApi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | 
val sharedEvent : SharedEvent =  // SharedEvent | 

val result : SharedEvent = webService.updateSharedEvent(id, sharedEvent)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**|  |
 **sharedEvent** | [**SharedEvent**](SharedEvent.md)|  |

### Return type

[**SharedEvent**](SharedEvent.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

