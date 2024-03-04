# OAuthServerControllerApi

All URIs are relative to *http://intervals.icu*

Method | HTTP request | Description
------------- | ------------- | -------------
[**disconnectApp**](OAuthServerControllerApi.md#disconnectApp) | **DELETE** api/v1/disconnect-app | Disconnect the athlete from the app matching the bearer token



Disconnect the athlete from the app matching the bearer token

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(OAuthServerControllerApi::class.java)

webService.disconnectApp()
```

### Parameters
This endpoint does not need any parameter.

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

