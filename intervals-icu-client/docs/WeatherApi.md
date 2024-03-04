# WeatherApi

All URIs are relative to *http://intervals.icu*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getForecast**](WeatherApi.md#getForecast) | **GET** api/v1/athlete/{id}/weather-forecast | Get weather forecast information
[**getWeatherConfig**](WeatherApi.md#getWeatherConfig) | **GET** api/v1/athlete/{id}/weather-config | Get the athlete&#39;s weather forecast configuration
[**updateWeatherConfig**](WeatherApi.md#updateWeatherConfig) | **PUT** api/v1/athlete/{id}/weather-config | Update the athlete&#39;s weather forecast configuration



Get weather forecast information

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(WeatherApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 

val result : WeatherDTO = webService.getForecast(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**WeatherDTO**](WeatherDTO.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Get the athlete&#39;s weather forecast configuration

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(WeatherApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 

val result : WeatherConfig = webService.getWeatherConfig(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**WeatherConfig**](WeatherConfig.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Update the athlete&#39;s weather forecast configuration

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(WeatherApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val weatherConfig : WeatherConfig =  // WeatherConfig | 

val result : WeatherConfig = webService.updateWeatherConfig(id, weatherConfig)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **weatherConfig** | [**WeatherConfig**](WeatherConfig.md)|  |

### Return type

[**WeatherConfig**](WeatherConfig.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

