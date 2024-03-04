
# Message

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Long** |  |  [optional]
**athleteId** | **kotlin.String** |  |  [optional]
**name** | **kotlin.String** |  |  [optional]
**created** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**type** | [**inline**](#Type) |  |  [optional]
**content** | **kotlin.String** |  |  [optional]
**activityId** | **kotlin.String** |  |  [optional]
**startIndex** | **kotlin.Int** |  |  [optional]
**endIndex** | **kotlin.Int** |  |  [optional]
**answer** | **kotlin.String** |  |  [optional]
**activity** | [**Activity**](Activity.md) |  |  [optional]
**attachmentUrl** | **kotlin.String** |  |  [optional]
**attachmentMimeType** | **kotlin.String** |  |  [optional]
**deleted** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**deletedById** | **kotlin.String** |  |  [optional]
**joinGroupId** | **kotlin.Int** |  |  [optional]
**seen** | **kotlin.Boolean** |  |  [optional]


<a id="Type"></a>
## Enum: type
Name | Value
---- | -----
type | TEXT, FOLLOW_REQ, COACH_REQ, COACH_ME_REQ, ACTIVITY, NOTE, JOIN_REQ



