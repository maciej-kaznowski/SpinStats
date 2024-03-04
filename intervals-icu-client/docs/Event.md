
# Event

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** |  |  [optional]
**startDateLocal** | **kotlin.String** |  |  [optional]
**icuTrainingLoad** | **kotlin.Int** |  |  [optional]
**icuAtl** | **kotlin.Float** |  |  [optional]
**icuCtl** | **kotlin.Float** |  |  [optional]
**type** | **kotlin.String** |  |  [optional]
**calendarId** | **kotlin.Int** |  |  [optional]
**uid** | **kotlin.String** |  |  [optional]
**athleteId** | **kotlin.String** |  |  [optional]
**category** | [**inline**](#Category) |  |  [optional]
**endDateLocal** | **kotlin.String** |  |  [optional]
**name** | **kotlin.String** |  |  [optional]
**description** | **kotlin.String** |  |  [optional]
**indoor** | **kotlin.Boolean** |  |  [optional]
**color** | **kotlin.String** |  |  [optional]
**movingTime** | **kotlin.Int** |  |  [optional]
**icuFtp** | **kotlin.Int** |  |  [optional]
**atlDays** | **kotlin.Int** |  |  [optional]
**ctlDays** | **kotlin.Int** |  |  [optional]
**updated** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**notOnFitnessChart** | **kotlin.Boolean** |  |  [optional]
**showAsNote** | **kotlin.Boolean** |  |  [optional]
**showOnCtlLine** | **kotlin.Boolean** |  |  [optional]
**target** | [**inline**](#Target) |  |  [optional]
**joules** | **kotlin.Int** |  |  [optional]
**joulesAboveFtp** | **kotlin.Int** |  |  [optional]
**workoutDoc** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**pushErrors** | [**kotlin.collections.List&lt;PushError&gt;**](PushError.md) |  |  [optional]
**athleteCannotEdit** | **kotlin.Boolean** |  |  [optional]
**hideFromAthlete** | **kotlin.Boolean** |  |  [optional]
**structureReadOnly** | **kotlin.Boolean** |  |  [optional]
**createdById** | **kotlin.String** |  |  [optional]
**sharedEventId** | **kotlin.Int** |  |  [optional]
**entered** | **kotlin.Boolean** |  |  [optional]
**tags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**attachments** | [**kotlin.collections.List&lt;Attachment&gt;**](Attachment.md) |  |  [optional]
**oauthClientId** | **kotlin.Int** |  |  [optional]
**externalId** | **kotlin.String** |  |  [optional]
**loadTarget** | **kotlin.Int** |  |  [optional]
**timeTarget** | **kotlin.Int** |  |  [optional]
**distanceTarget** | **kotlin.Float** |  |  [optional]
**planAthleteId** | **kotlin.String** |  |  [optional]
**planFolderId** | **kotlin.Int** |  |  [optional]
**planWorkoutId** | **kotlin.Int** |  |  [optional]
**planApplied** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**distance** | **kotlin.Float** |  |  [optional]
**icuIntensity** | **kotlin.Float** |  |  [optional]


<a id="Category"></a>
## Enum: category
Name | Value
---- | -----
category | WORKOUT, RACE_A, RACE_B, RACE_C, NOTE, HOLIDAY, SICK, INJURED, SET_EFTP, FITNESS_DAYS, SEASON_START, TARGET, SET_FITNESS


<a id="Target"></a>
## Enum: target
Name | Value
---- | -----
target | AUTO, POWER, HR, PACE



