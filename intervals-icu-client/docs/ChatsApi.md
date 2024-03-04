# ChatsApi

All URIs are relative to *http://intervals.icu*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listActivityMessages**](ChatsApi.md#listActivityMessages) | **GET** api/v1/activity/{id}/messages | List all messages (comments) for the activity
[**sendActivityMessage**](ChatsApi.md#sendActivityMessage) | **POST** api/v1/activity/{id}/messages | Add a message (comment) to an activity



List all messages (comments) for the activity

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ChatsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val sinceId : kotlin.Long = 789 // kotlin.Long | 
val limit : kotlin.Int = 56 // kotlin.Int | 

val result : kotlin.collections.List<Message> = webService.listActivityMessages(id, sinceId, limit)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **sinceId** | **kotlin.Long**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional] [default to 100]

### Return type

[**kotlin.collections.List&lt;Message&gt;**](Message.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Add a message (comment) to an activity

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ChatsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val newActivityMsg : NewActivityMsg =  // NewActivityMsg | 

val result : NewMsg = webService.sendActivityMessage(id, newActivityMsg)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **newActivityMsg** | [**NewActivityMsg**](NewActivityMsg.md)|  |

### Return type

[**NewMsg**](NewMsg.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

