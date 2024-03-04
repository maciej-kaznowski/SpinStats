
# Wellness

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** |  |  [optional]
**ctl** | **kotlin.Float** |  |  [optional]
**atl** | **kotlin.Float** |  |  [optional]
**rampRate** | **kotlin.Float** |  |  [optional]
**ctlLoad** | **kotlin.Float** |  |  [optional]
**atlLoad** | **kotlin.Float** |  |  [optional]
**sportInfo** | [**kotlin.collections.List&lt;SportInfo&gt;**](SportInfo.md) |  |  [optional]
**updated** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**weight** | **kotlin.Float** |  |  [optional]
**restingHR** | **kotlin.Int** |  |  [optional]
**hrv** | **kotlin.Float** |  |  [optional]
**hrvSDNN** | **kotlin.Float** |  |  [optional]
**menstrualPhase** | [**inline**](#MenstrualPhase) |  |  [optional]
**menstrualPhasePredicted** | [**inline**](#MenstrualPhasePredicted) |  |  [optional]
**kcalConsumed** | **kotlin.Int** |  |  [optional]
**sleepSecs** | **kotlin.Int** |  |  [optional]
**sleepScore** | **kotlin.Float** |  |  [optional]
**sleepQuality** | **kotlin.Int** |  |  [optional]
**avgSleepingHR** | **kotlin.Float** |  |  [optional]
**soreness** | **kotlin.Int** |  |  [optional]
**fatigue** | **kotlin.Int** |  |  [optional]
**stress** | **kotlin.Int** |  |  [optional]
**mood** | **kotlin.Int** |  |  [optional]
**motivation** | **kotlin.Int** |  |  [optional]
**injury** | **kotlin.Int** |  |  [optional]
**spO2** | **kotlin.Float** |  |  [optional]
**systolic** | **kotlin.Int** |  |  [optional]
**diastolic** | **kotlin.Int** |  |  [optional]
**hydration** | **kotlin.Int** |  |  [optional]
**hydrationVolume** | **kotlin.Float** |  |  [optional]
**readiness** | **kotlin.Float** |  |  [optional]
**baevskySI** | **kotlin.Float** |  |  [optional]
**bloodGlucose** | **kotlin.Float** |  |  [optional]
**lactate** | **kotlin.Float** |  |  [optional]
**bodyFat** | **kotlin.Float** |  |  [optional]
**abdomen** | **kotlin.Float** |  |  [optional]
**vo2max** | **kotlin.Float** |  |  [optional]
**comments** | **kotlin.String** |  |  [optional]


<a id="MenstrualPhase"></a>
## Enum: menstrualPhase
Name | Value
---- | -----
menstrualPhase | PERIOD, FOLLICULAR, OVULATING, LUTEAL, NONE


<a id="MenstrualPhasePredicted"></a>
## Enum: menstrualPhasePredicted
Name | Value
---- | -----
menstrualPhasePredicted | PERIOD, FOLLICULAR, OVULATING, LUTEAL, NONE



