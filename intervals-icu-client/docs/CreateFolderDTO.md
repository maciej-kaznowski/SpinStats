
# CreateFolderDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**athleteId** | **kotlin.String** |  |  [optional]
**id** | **kotlin.Int** |  |  [optional]
**type** | [**inline**](#Type) |  |  [optional]
**name** | **kotlin.String** |  |  [optional]
**description** | **kotlin.String** |  |  [optional]
**children** | [**kotlin.collections.List&lt;Workout&gt;**](Workout.md) |  |  [optional]
**visibility** | [**inline**](#Visibility) |  |  [optional]
**startDateLocal** | **kotlin.String** |  |  [optional]
**rolloutWeeks** | **kotlin.Int** |  |  [optional]
**autoRolloutDay** | **kotlin.Int** |  |  [optional]
**readOnlyWorkouts** | **kotlin.Boolean** |  |  [optional]
**startingCtl** | **kotlin.Int** |  |  [optional]
**startingAtl** | **kotlin.Int** |  |  [optional]
**activityTypes** | [**inline**](#kotlin.collections.List&lt;ActivityTypes&gt;) |  |  [optional]
**numWorkouts** | **kotlin.Int** |  |  [optional]
**durationWeeks** | **kotlin.Int** |  |  [optional]
**hoursPerWeekMin** | **kotlin.Int** |  |  [optional]
**hoursPerWeekMax** | **kotlin.Int** |  |  [optional]
**workoutTargets** | [**inline**](#kotlin.collections.List&lt;WorkoutTargets&gt;) |  |  [optional]
**blurb** | **kotlin.String** |  |  [optional]
**canEdit** | **kotlin.Boolean** |  |  [optional]
**sharedWithCount** | **kotlin.Int** |  |  [optional]
**shareToken** | **kotlin.String** |  |  [optional]
**owner** | [**AthleteSearchResult**](AthleteSearchResult.md) |  |  [optional]
**copyFolderId** | **kotlin.Int** |  |  [optional]


<a id="Type"></a>
## Enum: type
Name | Value
---- | -----
type | FOLDER, PLAN


<a id="Visibility"></a>
## Enum: visibility
Name | Value
---- | -----
visibility | PRIVATE, PUBLIC


<a id="kotlin.collections.List<ActivityTypes>"></a>
## Enum: activity_types
Name | Value
---- | -----
activityTypes | Ride, Run, Swim, WeightTraining, Hike, Walk, AlpineSki, BackcountrySki, Badminton, Canoeing, Crossfit, EBikeRide, EMountainBikeRide, Elliptical, Golf, GravelRide, Handcycle, HighIntensityIntervalTraining, Hockey, IceSkate, InlineSkate, Kayaking, Kitesurf, MountainBikeRide, NordicSki, OpenWaterSwim, Padel, Pilates, Pickleball, Racquetball, Rugby, RockClimbing, RollerSki, Rowing, Sail, Skateboard, Snowboard, Snowshoe, Soccer, Squash, StairStepper, StandUpPaddling, Surfing, TableTennis, Tennis, TrailRun, Transition, Velomobile, VirtualRide, VirtualRow, VirtualRun, WaterSport, Wheelchair, Windsurf, Workout, Yoga, Other


<a id="kotlin.collections.List<WorkoutTargets>"></a>
## Enum: workout_targets
Name | Value
---- | -----
workoutTargets | AUTO, POWER, HR, PACE



