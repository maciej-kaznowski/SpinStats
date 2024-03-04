
# SportSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** |  |  [optional]
**athleteId** | **kotlin.String** |  |  [optional]
**types** | [**inline**](#kotlin.collections.List&lt;Types&gt;) |  |  [optional]
**warmupTime** | **kotlin.Int** |  |  [optional]
**cooldownTime** | **kotlin.Int** |  |  [optional]
**ftp** | **kotlin.Int** |  |  [optional]
**indoorFtp** | **kotlin.Int** |  |  [optional]
**wPrime** | **kotlin.Int** |  |  [optional]
**powerZones** | **kotlin.collections.List&lt;kotlin.Int&gt;** |  |  [optional]
**sweetSpotMin** | **kotlin.Int** |  |  [optional]
**sweetSpotMax** | **kotlin.Int** |  |  [optional]
**powerSpikeThreshold** | **kotlin.Int** |  |  [optional]
**powerZoneNames** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**ftpEstMinSecs** | **kotlin.Int** |  |  [optional]
**useLapsForPowerIntervals** | **kotlin.Boolean** |  |  [optional]
**keepAllLapsForPowerIntervals** | **kotlin.Boolean** |  |  [optional]
**afterKj0** | **kotlin.Int** |  |  [optional]
**afterKj1** | **kotlin.Int** |  |  [optional]
**powerField** | **kotlin.String** |  |  [optional]
**lthr** | **kotlin.Int** |  |  [optional]
**maxHr** | **kotlin.Int** |  |  [optional]
**hrZones** | **kotlin.collections.List&lt;kotlin.Int&gt;** |  |  [optional]
**hrZoneNames** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**hrLoadType** | [**inline**](#HrLoadType) |  |  [optional]
**hrrcMinPercent** | **kotlin.Float** |  |  [optional]
**thresholdPace** | **kotlin.Float** |  |  [optional]
**paceUnits** | [**inline**](#PaceUnits) |  |  [optional]
**paceZones** | **kotlin.collections.List&lt;kotlin.Float&gt;** |  |  [optional]
**paceZoneNames** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**paceLoadType** | [**inline**](#PaceLoadType) |  |  [optional]
**gapModel** | [**inline**](#GapModel) |  |  [optional]
**elevationCorrection** | [**inline**](#ElevationCorrection) |  |  [optional]
**useGapZoneTimes** | **kotlin.Boolean** |  |  [optional]
**bestEffortDistances** | **kotlin.collections.List&lt;kotlin.Float&gt;** |  |  [optional]
**paceCurveStart** | **kotlin.Float** |  |  [optional]
**loadOrder** | [**inline**](#LoadOrder) |  |  [optional]
**tizOrder** | [**inline**](#TizOrder) |  |  [optional]
**workoutOrder** | [**inline**](#WorkoutOrder) |  |  [optional]
**intervalDisplay** | [**inline**](#IntervalDisplay) |  |  [optional]
**defaultGearId** | **kotlin.String** |  |  [optional]
**defaultIndoorGearId** | **kotlin.String** |  |  [optional]
**extractWorkouts** | **kotlin.Boolean** |  |  [optional]
**showPauses** | **kotlin.Int** |  |  [optional]
**ignoreVelocity** | **kotlin.Boolean** |  |  [optional]
**created** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**updated** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**mmpModel** | [**PowerModel**](PowerModel.md) |  |  [optional]
**display** | [**Display**](Display.md) |  |  [optional]
**activityFieldIds** | **kotlin.collections.List&lt;kotlin.Int&gt;** |  |  [optional]
**activityCharts** | [**ActivityCharts**](ActivityCharts.md) |  |  [optional]
**other** | **kotlin.Boolean** |  |  [optional]
**iseFTPSupported** | **kotlin.Boolean** |  |  [optional]
**useDistanceForIntervals** | **kotlin.Boolean** |  |  [optional]


<a id="kotlin.collections.List<Types>"></a>
## Enum: types
Name | Value
---- | -----
types | Ride, Run, Swim, WeightTraining, Hike, Walk, AlpineSki, BackcountrySki, Badminton, Canoeing, Crossfit, EBikeRide, EMountainBikeRide, Elliptical, Golf, GravelRide, Handcycle, HighIntensityIntervalTraining, Hockey, IceSkate, InlineSkate, Kayaking, Kitesurf, MountainBikeRide, NordicSki, OpenWaterSwim, Padel, Pilates, Pickleball, Racquetball, Rugby, RockClimbing, RollerSki, Rowing, Sail, Skateboard, Snowboard, Snowshoe, Soccer, Squash, StairStepper, StandUpPaddling, Surfing, TableTennis, Tennis, TrailRun, Transition, Velomobile, VirtualRide, VirtualRow, VirtualRun, WaterSport, Wheelchair, Windsurf, Workout, Yoga, Other


<a id="HrLoadType"></a>
## Enum: hr_load_type
Name | Value
---- | -----
hrLoadType | AVG_HR, HR_ZONES, HRSS


<a id="PaceUnits"></a>
## Enum: pace_units
Name | Value
---- | -----
paceUnits | SECS_100M, SECS_100Y, MINS_KM, MINS_MILE, SECS_500M


<a id="PaceLoadType"></a>
## Enum: pace_load_type
Name | Value
---- | -----
paceLoadType | SWIM, RUN


<a id="GapModel"></a>
## Enum: gap_model
Name | Value
---- | -----
gapModel | NONE, STRAVA_RUN


<a id="ElevationCorrection"></a>
## Enum: elevation_correction
Name | Value
---- | -----
elevationCorrection | NO, AUTO, YES


<a id="LoadOrder"></a>
## Enum: load_order
Name | Value
---- | -----
loadOrder | POWER_HR_PACE, POWER_PACE_HR, HR_POWER_PACE, HR_PACE_POWER, PACE_POWER_HR, PACE_HR_POWER


<a id="TizOrder"></a>
## Enum: tiz_order
Name | Value
---- | -----
tizOrder | POWER_HR_PACE, POWER_PACE_HR, HR_POWER_PACE, HR_PACE_POWER, PACE_POWER_HR, PACE_HR_POWER


<a id="WorkoutOrder"></a>
## Enum: workout_order
Name | Value
---- | -----
workoutOrder | POWER_HR_PACE, POWER_PACE_HR, HR_POWER_PACE, HR_PACE_POWER, PACE_POWER_HR, PACE_HR_POWER


<a id="IntervalDisplay"></a>
## Enum: interval_display
Name | Value
---- | -----
intervalDisplay | POWER_HR_PACE, POWER_PACE_HR, HR_POWER_PACE, HR_PACE_POWER, PACE_POWER_HR, PACE_HR_POWER



