# CustomItemsApi

All URIs are relative to *http://intervals.icu*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomItem**](CustomItemsApi.md#createCustomItem) | **POST** api/v1/athlete/{id}/custom-item | Create a custom item
[**deleteCustomItem**](CustomItemsApi.md#deleteCustomItem) | **DELETE** api/v1/athlete/{id}/custom-item/{itemId} | Delete a custom item
[**getCustomItem**](CustomItemsApi.md#getCustomItem) | **GET** api/v1/athlete/{id}/custom-item/{itemId} | Get a custom item
[**listCustomItems**](CustomItemsApi.md#listCustomItems) | **GET** api/v1/athlete/{id}/custom-item | List custom items (charts, custom fields etc.)
[**updateCustomItem**](CustomItemsApi.md#updateCustomItem) | **PUT** api/v1/athlete/{id}/custom-item/{itemId} | Update a custom item
[**updateCustomItemImage**](CustomItemsApi.md#updateCustomItemImage) | **POST** api/v1/athlete/{id}/custom-item/{itemId}/image | Upload a new image for a custom item as multipart/form-data
[**updateCustomItemIndexes**](CustomItemsApi.md#updateCustomItemIndexes) | **PUT** api/v1/athlete/{id}/custom-item-indexes | Re-order custom items



Create a custom item

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CustomItemsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val customItem : CustomItem =  // CustomItem | 

val result : CustomItem = webService.createCustomItem(id, customItem)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **customItem** | [**CustomItem**](CustomItem.md)|  |

### Return type

[**CustomItem**](CustomItem.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


Delete a custom item

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CustomItemsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val itemId : kotlin.Int = 56 // kotlin.Int | 

webService.deleteCustomItem(id, itemId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **itemId** | **kotlin.Int**|  |

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


Get a custom item

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CustomItemsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val itemId : kotlin.Int = 56 // kotlin.Int | 

val result : CustomItem = webService.getCustomItem(id, itemId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **itemId** | **kotlin.Int**|  |

### Return type

[**CustomItem**](CustomItem.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


List custom items (charts, custom fields etc.)

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CustomItemsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 

val result : kotlin.collections.List<CustomItem> = webService.listCustomItems(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**kotlin.collections.List&lt;CustomItem&gt;**](CustomItem.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


Update a custom item

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CustomItemsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val itemId : kotlin.Int = 56 // kotlin.Int | 
val customItem : CustomItem =  // CustomItem | 

val result : CustomItem = webService.updateCustomItem(id, itemId, customItem)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **itemId** | **kotlin.Int**|  |
 **customItem** | [**CustomItem**](CustomItem.md)|  |

### Return type

[**CustomItem**](CustomItem.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


Upload a new image for a custom item as multipart/form-data

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CustomItemsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val itemId : kotlin.Int = 56 // kotlin.Int | 
val uploadWellnessRequest : UploadWellnessRequest =  // UploadWellnessRequest | 

val result : CustomItem = webService.updateCustomItemImage(id, itemId, uploadWellnessRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **itemId** | **kotlin.Int**|  |
 **uploadWellnessRequest** | [**UploadWellnessRequest**](UploadWellnessRequest.md)|  | [optional]

### Return type

[**CustomItem**](CustomItem.md)

### Authorization


Configure APIKey:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure AccessToken:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


Re-order custom items

### Example
```kotlin
// Import classes:
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.*
//import com.github.maciej.kaznowski.intervalsicuclient.invoker.infrastructure.*
//import com.github.maciej.kaznowski.intervalsicuclient.model.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CustomItemsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val customItem : kotlin.collections.List<CustomItem> =  // kotlin.collections.List<CustomItem> | 

webService.updateCustomItemIndexes(id, customItem)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **customItem** | [**kotlin.collections.List&lt;CustomItem&gt;**](CustomItem.md)|  |

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

