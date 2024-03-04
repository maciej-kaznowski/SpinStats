
# CustomItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** |  |  [optional]
**athleteId** | **kotlin.String** |  |  [optional]
**type** | [**inline**](#Type) |  |  [optional]
**visibility** | [**inline**](#Visibility) |  |  [optional]
**name** | **kotlin.String** |  |  [optional]
**description** | **kotlin.String** |  |  [optional]
**image** | **kotlin.String** |  |  [optional]
**content** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**usageCount** | **kotlin.Int** |  |  [optional]
**index** | **kotlin.Int** |  |  [optional]
**updated** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**fromAthlete** | [**AthleteSearchResult**](AthleteSearchResult.md) |  |  [optional]
**fromId** | **kotlin.Int** |  |  [optional]


<a id="Type"></a>
## Enum: type
Name | Value
---- | -----
type | FITNESS_CHART, TRACE_CHART, INPUT_FIELD, ACTIVITY_FIELD, INTERVAL_FIELD, ACTIVITY_STREAM, ACTIVITY_CHART


<a id="Visibility"></a>
## Enum: visibility
Name | Value
---- | -----
visibility | PRIVATE, FOLLOWERS, PUBLIC



