# GearApi

All URIs are relative to *http://intervals.icu*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calcDistanceEtc**](GearApi.md#calcDistanceEtc) | **GET** api/v1/athlete/{id}/gear/{gearId}/calc | Recalculate gear stats
[**createGear**](GearApi.md#createGear) | **POST** api/v1/athlete/{id}/gear | Create a new gear or component
[**createReminder**](GearApi.md#createReminder) | **POST** api/v1/athlete/{id}/gear/{gearId}/reminder | Create a new reminder
[**deleteGear**](GearApi.md#deleteGear) | **DELETE** api/v1/athlete/{id}/gear/{gearId} | Delete a gear or component
[**deleteReminder**](GearApi.md#deleteReminder) | **DELETE** api/v1/athlete/{id}/gear/{gearId}/reminder/{reminderId} | Delete a reminder
[**listGear**](GearApi.md#listGear) | **GET** api/v1/athlete/{id}/gear{ext} | List athlete gear (use .csv for CSV format)
[**replaceGear**](GearApi.md#replaceGear) | **POST** api/v1/athlete/{id}/gear/{gearId}/replace | Retire a component and replace it with a copy with the same reminders etc.
[**updateGear**](GearApi.md#updateGear) | **PUT** api/v1/athlete/{id}/gear/{gearId} | Update a gear or component
[**updateReminder**](GearApi.md#updateReminder) | **PUT** api/v1/athlete/{id}/gear/{gearId}/reminder/{reminderId} | Update a reminder



Recalculate gear stats

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(GearApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val gearId : kotlin.String = gearId_example // kotlin.String | 

val result : GearStats = webService.calcDistanceEtc(id, gearId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **gearId** | **kotlin.String**|  |

### Return type

[**GearStats**](GearStats.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Create a new gear or component

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(GearApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val gear : Gear =  // Gear | 

val result : Gear = webService.createGear(id, gear)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **gear** | [**Gear**](Gear.md)|  |

### Return type

[**Gear**](Gear.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


Create a new reminder

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(GearApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val gearId : kotlin.String = gearId_example // kotlin.String | 
val gearReminder : GearReminder =  // GearReminder | 

val result : Gear = webService.createReminder(id, gearId, gearReminder)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **gearId** | **kotlin.String**|  |
 **gearReminder** | [**GearReminder**](GearReminder.md)|  |

### Return type

[**Gear**](Gear.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


Delete a gear or component

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(GearApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val gearId : kotlin.String = gearId_example // kotlin.String | 

webService.deleteGear(id, gearId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **gearId** | **kotlin.String**|  |

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


Delete a reminder

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(GearApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val gearId : kotlin.String = gearId_example // kotlin.String | 
val reminderId : kotlin.Int = 56 // kotlin.Int | 

val result : Gear = webService.deleteReminder(id, gearId, reminderId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **gearId** | **kotlin.String**|  |
 **reminderId** | **kotlin.Int**|  |

### Return type

[**Gear**](Gear.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


List athlete gear (use .csv for CSV format)

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(GearApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 

val result : kotlin.collections.List<Gear> = webService.listGear(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**kotlin.collections.List&lt;Gear&gt;**](Gear.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Retire a component and replace it with a copy with the same reminders etc.

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(GearApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val gearId : kotlin.String = gearId_example // kotlin.String | 
val gear : Gear =  // Gear | 

val result : kotlin.collections.List<Gear> = webService.replaceGear(id, gearId, gear)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **gearId** | **kotlin.String**|  |
 **gear** | [**Gear**](Gear.md)|  |

### Return type

[**kotlin.collections.List&lt;Gear&gt;**](Gear.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


Update a gear or component

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(GearApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val gearId : kotlin.String = gearId_example // kotlin.String | 
val gear : Gear =  // Gear | 

val result : Gear = webService.updateGear(id, gearId, gear)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **gearId** | **kotlin.String**|  |
 **gear** | [**Gear**](Gear.md)|  |

### Return type

[**Gear**](Gear.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


Update a reminder

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(GearApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val gearId : kotlin.String = gearId_example // kotlin.String | 
val reminderId : kotlin.Int = 56 // kotlin.Int | 
val reset : kotlin.Boolean = true // kotlin.Boolean | 
val snoozeDays : kotlin.Int = 56 // kotlin.Int | 
val gearReminder : GearReminder =  // GearReminder | 

val result : Gear = webService.updateReminder(id, gearId, reminderId, reset, snoozeDays, gearReminder)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **gearId** | **kotlin.String**|  |
 **reminderId** | **kotlin.Int**|  |
 **reset** | **kotlin.Boolean**|  |
 **snoozeDays** | **kotlin.Int**|  |
 **gearReminder** | [**GearReminder**](GearReminder.md)|  |

### Return type

[**Gear**](Gear.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

