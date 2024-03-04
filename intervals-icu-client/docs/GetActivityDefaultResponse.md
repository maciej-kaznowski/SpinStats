
# GetActivityDefaultResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** |  |  [optional]
**startDateLocal** | **kotlin.String** |  |  [optional]
**type** | **kotlin.String** |  |  [optional]
**icuIgnoreTime** | **kotlin.Boolean** |  |  [optional]
**icuPmCp** | **kotlin.Int** |  |  [optional]
**icuPmWPrime** | **kotlin.Int** |  |  [optional]
**icuPmPMax** | **kotlin.Int** |  |  [optional]
**icuPmFtp** | **kotlin.Int** |  |  [optional]
**icuPmFtpSecs** | **kotlin.Int** |  |  [optional]
**icuPmFtpWatts** | **kotlin.Int** |  |  [optional]
**icuIgnorePower** | **kotlin.Boolean** |  |  [optional]
**icuRollingCp** | **kotlin.Float** |  |  [optional]
**icuRollingWPrime** | **kotlin.Float** |  |  [optional]
**icuRollingPMax** | **kotlin.Float** |  |  [optional]
**icuRollingFtp** | **kotlin.Int** |  |  [optional]
**icuRollingFtpDelta** | **kotlin.Int** |  |  [optional]
**icuTrainingLoad** | **kotlin.Int** |  |  [optional]
**icuAtl** | **kotlin.Float** |  |  [optional]
**icuCtl** | **kotlin.Float** |  |  [optional]
**pairedEventId** | **kotlin.Int** |  |  [optional]
**name** | **kotlin.String** |  |  [optional]
**description** | **kotlin.String** |  |  [optional]
**startDate** | **kotlin.String** |  |  [optional]
**distance** | **kotlin.Float** |  |  [optional]
**icuDistance** | **kotlin.Float** |  |  [optional]
**movingTime** | **kotlin.Int** |  |  [optional]
**elapsedTime** | **kotlin.Int** |  |  [optional]
**coastingTime** | **kotlin.Int** |  |  [optional]
**totalElevationGain** | **kotlin.Float** |  |  [optional]
**timezone** | **kotlin.String** |  |  [optional]
**trainer** | **kotlin.Boolean** |  |  [optional]
**commute** | **kotlin.Boolean** |  |  [optional]
**maxSpeed** | **kotlin.Float** |  |  [optional]
**averageSpeed** | **kotlin.Float** |  |  [optional]
**deviceWatts** | **kotlin.Boolean** |  |  [optional]
**hasHeartrate** | **kotlin.Boolean** |  |  [optional]
**maxHeartrate** | **kotlin.Int** |  |  [optional]
**averageHeartrate** | **kotlin.Int** |  |  [optional]
**averageCadence** | **kotlin.Float** |  |  [optional]
**calories** | **kotlin.Int** |  |  [optional]
**averageTemp** | **kotlin.Float** |  |  [optional]
**minTemp** | **kotlin.Int** |  |  [optional]
**maxTemp** | **kotlin.Int** |  |  [optional]
**avgLrBalance** | **kotlin.Float** |  |  [optional]
**gap** | **kotlin.Float** |  |  [optional]
**gapModel** | [**inline**](#GapModel) |  |  [optional]
**useElevationCorrection** | **kotlin.Boolean** |  |  [optional]
**race** | **kotlin.Boolean** |  |  [optional]
**gear** | [**StravaGear**](StravaGear.md) |  |  [optional]
**perceivedExertion** | **kotlin.Float** |  |  [optional]
**deviceName** | **kotlin.String** |  |  [optional]
**powerMeter** | **kotlin.String** |  |  [optional]
**powerMeterSerial** | **kotlin.String** |  |  [optional]
**powerMeterBattery** | **kotlin.String** |  |  [optional]
**crankLength** | **kotlin.Float** |  |  [optional]
**externalId** | **kotlin.String** |  |  [optional]
**fileSportIndex** | **kotlin.Int** |  |  [optional]
**fileType** | **kotlin.String** |  |  [optional]
**icuAthleteId** | **kotlin.String** |  |  [optional]
**created** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**icuSyncDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**analyzed** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**icuFtp** | **kotlin.Int** |  |  [optional]
**icuWPrime** | **kotlin.Int** |  |  [optional]
**thresholdPace** | **kotlin.Float** |  |  [optional]
**icuHrZones** | **kotlin.collections.List&lt;kotlin.Int&gt;** |  |  [optional]
**paceZones** | **kotlin.collections.List&lt;kotlin.Float&gt;** |  |  [optional]
**lthr** | **kotlin.Int** |  |  [optional]
**icuRestingHr** | **kotlin.Int** |  |  [optional]
**icuWeight** | **kotlin.Float** |  |  [optional]
**icuPowerZones** | **kotlin.collections.List&lt;kotlin.Int&gt;** |  |  [optional]
**icuSweetSpotMin** | **kotlin.Int** |  |  [optional]
**icuSweetSpotMax** | **kotlin.Int** |  |  [optional]
**icuPowerSpikeThreshold** | **kotlin.Int** |  |  [optional]
**trimp** | **kotlin.Float** |  |  [optional]
**icuWarmupTime** | **kotlin.Int** |  |  [optional]
**icuCooldownTime** | **kotlin.Int** |  |  [optional]
**icuChatId** | **kotlin.Int** |  |  [optional]
**icuIgnoreHr** | **kotlin.Boolean** |  |  [optional]
**ignoreVelocity** | **kotlin.Boolean** |  |  [optional]
**ignorePace** | **kotlin.Boolean** |  |  [optional]
**ignoreParts** | [**kotlin.collections.List&lt;Ignore&gt;**](Ignore.md) |  |  [optional]
**icuWeightedAvgWatts** | **kotlin.Int** |  |  [optional]
**icuTrainingLoadData** | **kotlin.Int** |  |  [optional]
**intervalSummary** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**skylineChartBytes** | **kotlin.collections.List&lt;kotlin.ByteArray&gt;** |  |  [optional]
**streamTypes** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**hasSegments** | **kotlin.Boolean** |  |  [optional]
**powerFieldNames** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**powerField** | **kotlin.String** |  |  [optional]
**icuZoneTimes** | [**kotlin.collections.List&lt;ZoneTime&gt;**](ZoneTime.md) |  |  [optional]
**icuHrZoneTimes** | **kotlin.collections.List&lt;kotlin.Int&gt;** |  |  [optional]
**paceZoneTimes** | **kotlin.collections.List&lt;kotlin.Int&gt;** |  |  [optional]
**gapZoneTimes** | **kotlin.collections.List&lt;kotlin.Int&gt;** |  |  [optional]
**useGapZoneTimes** | **kotlin.Boolean** |  |  [optional]
**tizOrder** | [**inline**](#TizOrder) |  |  [optional]
**polarizationIndex** | **kotlin.Float** |  |  [optional]
**icuAchievements** | [**kotlin.collections.List&lt;IcuAchievement&gt;**](IcuAchievement.md) |  |  [optional]
**icuIntervalsEdited** | **kotlin.Boolean** |  |  [optional]
**lockIntervals** | **kotlin.Boolean** |  |  [optional]
**icuLapCount** | **kotlin.Int** |  |  [optional]
**icuJoules** | **kotlin.Int** |  |  [optional]
**icuJoulesAboveFtp** | **kotlin.Int** |  |  [optional]
**icuMaxWbalDepletion** | **kotlin.Int** |  |  [optional]
**icuRecordingTime** | **kotlin.Int** |  |  [optional]
**icuHrr** | [**HRRecovery**](HRRecovery.md) |  |  [optional]
**icuSyncError** | **kotlin.String** |  |  [optional]
**icuColor** | **kotlin.String** |  |  [optional]
**icuPowerHrZ2** | **kotlin.Float** |  |  [optional]
**icuPowerHrZ2Mins** | **kotlin.Int** |  |  [optional]
**icuCadenceZ2** | **kotlin.Int** |  |  [optional]
**icuRpe** | **kotlin.Int** |  |  [optional]
**feel** | **kotlin.Int** |  |  [optional]
**kgLifted** | **kotlin.Float** |  |  [optional]
**decoupling** | **kotlin.Float** |  |  [optional]
**icuMedianTimeDelta** | **kotlin.Int** |  |  [optional]
**p30sExponent** | **kotlin.Float** |  |  [optional]
**workoutShiftSecs** | **kotlin.Int** |  |  [optional]
**stravaId** | **kotlin.String** |  |  [optional]
**lengths** | **kotlin.Int** |  |  [optional]
**poolLength** | **kotlin.Float** |  |  [optional]
**compliance** | **kotlin.Float** |  |  [optional]
**source** | [**inline**](#Source) |  |  [optional]
**oauthClientId** | **kotlin.Int** |  |  [optional]
**oauthClientName** | **kotlin.String** |  |  [optional]
**powerLoad** | **kotlin.Int** |  |  [optional]
**hrLoad** | **kotlin.Int** |  |  [optional]
**paceLoad** | **kotlin.Int** |  |  [optional]
**hrLoadType** | [**inline**](#HrLoadType) |  |  [optional]
**paceLoadType** | [**inline**](#PaceLoadType) |  |  [optional]
**tags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**attachments** | [**kotlin.collections.List&lt;Attachment&gt;**](Attachment.md) |  |  [optional]
**recordingStops** | **kotlin.collections.List&lt;kotlin.Int&gt;** |  |  [optional]
**pace** | **kotlin.Float** |  |  [optional]
**athleteMaxHr** | **kotlin.Int** |  |  [optional]
**group** | **kotlin.String** |  |  [optional]
**icuAverageWatts** | **kotlin.Int** |  |  [optional]
**icuIntensity** | **kotlin.Float** |  |  [optional]
**icuVariabilityIndex** | **kotlin.Float** |  |  [optional]
**icuEfficiencyFactor** | **kotlin.Float** |  |  [optional]
**icuPowerHr** | **kotlin.Float** |  |  [optional]
**sessionRpe** | **kotlin.Int** |  |  [optional]
**averageStride** | **kotlin.Float** |  |  [optional]
**icuIntervals** | [**kotlin.collections.List&lt;Interval&gt;**](Interval.md) |  |  [optional]
**icuGroups** | [**kotlin.collections.List&lt;IntervalGroup&gt;**](IntervalGroup.md) |  |  [optional]


<a id="GapModel"></a>
## Enum: gap_model
Name | Value
---- | -----
gapModel | NONE, STRAVA_RUN


<a id="TizOrder"></a>
## Enum: tiz_order
Name | Value
---- | -----
tizOrder | POWER_HR_PACE, POWER_PACE_HR, HR_POWER_PACE, HR_PACE_POWER, PACE_POWER_HR, PACE_HR_POWER


<a id="Source"></a>
## Enum: source
Name | Value
---- | -----
source | STRAVA, UPLOAD, MANUAL, GARMIN_CONNECT, OAUTH_CLIENT, DROPBOX, POLAR, SUUNTO, COROS, WAHOO


<a id="HrLoadType"></a>
## Enum: hr_load_type
Name | Value
---- | -----
hrLoadType | AVG_HR, HR_ZONES, HRSS


<a id="PaceLoadType"></a>
## Enum: pace_load_type
Name | Value
---- | -----
paceLoadType | SWIM, RUN



