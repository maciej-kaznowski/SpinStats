# WellnessApi

All URIs are relative to *http://intervals.icu*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRecord**](WellnessApi.md#getRecord) | **GET** api/v1/athlete/{id}/wellness/{date} | Get wellness record for date (local ISO-8601 day)
[**listWellnessRecords**](WellnessApi.md#listWellnessRecords) | **GET** api/v1/athlete/{id}/wellness{ext} | List wellness records for date range (use .csv for CSV format)
[**updateWellness**](WellnessApi.md#updateWellness) | **PUT** api/v1/athlete/{id}/wellness/{date} | Update the wellness record for the date (ISO-8601)
[**updateWellness1**](WellnessApi.md#updateWellness1) | **PUT** api/v1/athlete/{id}/wellness | Update a wellness record, id is the day (ISO-8601)
[**uploadWellness**](WellnessApi.md#uploadWellness) | **POST** api/v1/athlete/{id}/wellness | Upload wellness records in CSV format as multipart/form-data



Get wellness record for date (local ISO-8601 day)

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(WellnessApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val date : kotlin.String = date_example // kotlin.String | 

val result : Wellness = webService.getRecord(id, date)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **date** | **kotlin.String**|  |

### Return type

[**Wellness**](Wellness.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


List wellness records for date range (use .csv for CSV format)

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(WellnessApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val oldest : kotlin.String = oldest_example // kotlin.String | Local date of oldest record (ISO-8601)
val newest : kotlin.String = newest_example // kotlin.String | Local date of newest record (ISO-8601), inclusive
val cols : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Comma separated list of column names to include

val result : kotlin.collections.List<Wellness> = webService.listWellnessRecords(id, oldest, newest, cols)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **oldest** | **kotlin.String**| Local date of oldest record (ISO-8601) | [optional]
 **newest** | **kotlin.String**| Local date of newest record (ISO-8601), inclusive | [optional]
 **cols** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Comma separated list of column names to include | [optional]

### Return type

[**kotlin.collections.List&lt;Wellness&gt;**](Wellness.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Update the wellness record for the date (ISO-8601)

Only fields provided are changed

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(WellnessApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val date : kotlin.String = date_example // kotlin.String | 
val wellness : Wellness =  // Wellness | 

val result : Wellness = webService.updateWellness(id, date, wellness)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **date** | **kotlin.String**|  |
 **wellness** | [**Wellness**](Wellness.md)|  |

### Return type

[**Wellness**](Wellness.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


Update a wellness record, id is the day (ISO-8601)

Only fields provided are changed

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(WellnessApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val wellness : Wellness =  // Wellness | 

val result : Wellness = webService.updateWellness1(id, wellness)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **wellness** | [**Wellness**](Wellness.md)|  |

### Return type

[**Wellness**](Wellness.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


Upload wellness records in CSV format as multipart/form-data

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(WellnessApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val ignoreMissingFields : kotlin.Boolean = true // kotlin.Boolean | 
val uploadWellnessRequest : UploadWellnessRequest =  // UploadWellnessRequest | 

val result : kotlin.Any = webService.uploadWellness(id, ignoreMissingFields, uploadWellnessRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **ignoreMissingFields** | **kotlin.Boolean**|  | [optional] [default to false]
 **uploadWellnessRequest** | [**UploadWellnessRequest**](UploadWellnessRequest.md)|  | [optional]

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

