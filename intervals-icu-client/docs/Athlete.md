
# Athlete

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** |  |  [optional]
**name** | **kotlin.String** |  |  [optional]
**firstname** | **kotlin.String** |  |  [optional]
**lastname** | **kotlin.String** |  |  [optional]
**profileMedium** | **kotlin.String** |  |  [optional]
**measurementPreference** | **kotlin.String** |  |  [optional]
**weightPrefLb** | **kotlin.Boolean** |  |  [optional]
**fahrenheit** | **kotlin.Boolean** |  |  [optional]
**windSpeed** | [**inline**](#WindSpeed) |  |  [optional]
**rain** | [**inline**](#Rain) |  |  [optional]
**weight** | **kotlin.Float** |  |  [optional]
**email** | **kotlin.String** |  |  [optional]
**sex** | **kotlin.String** |  |  [optional]
**city** | **kotlin.String** |  |  [optional]
**state** | **kotlin.String** |  |  [optional]
**country** | **kotlin.String** |  |  [optional]
**bikes** | [**kotlin.collections.List&lt;StravaGear&gt;**](StravaGear.md) |  |  [optional]
**shoes** | [**kotlin.collections.List&lt;StravaGear&gt;**](StravaGear.md) |  |  [optional]
**timezone** | **kotlin.String** |  |  [optional]
**locale** | **kotlin.String** |  |  [optional]
**visibility** | [**inline**](#Visibility) |  |  [optional]
**icuRestingHr** | **kotlin.Int** |  |  [optional]
**icuWeight** | **kotlin.Float** |  |  [optional]
**icuWeightSync** | [**inline**](#IcuWeightSync) |  |  [optional]
**icuLastSeen** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**icuActivated** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**icuQueuePos** | **kotlin.Int** |  |  [optional]
**icuAdmin** | **kotlin.Boolean** |  |  [optional]
**icuFriendInviteToken** | **kotlin.String** |  |  [optional]
**icuPermission** | [**inline**](#IcuPermission) |  |  [optional]
**icuEffortSecs** | **kotlin.collections.List&lt;kotlin.Int&gt;** |  |  [optional]
**icuCoach** | **kotlin.Boolean** |  |  [optional]
**bio** | **kotlin.String** |  |  [optional]
**website** | **kotlin.String** |  |  [optional]
**icuDateOfBirth** | **kotlin.String** |  |  [optional]
**icuApiKey** | **kotlin.String** |  |  [optional]
**icuTypeSettings** | [**kotlin.collections.List&lt;Settings&gt;**](Settings.md) |  |  [optional]
**icuFormAsPercent** | **kotlin.Boolean** |  |  [optional]
**icuMmpDays** | **kotlin.Int** |  |  [optional]
**icuWellnessPrompt** | **kotlin.Boolean** |  |  [optional]
**icuWellnessKeys** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**icuTrackMenstrualCycle** | **kotlin.Boolean** |  |  [optional]
**icuMenstrualCyclePerm** | [**inline**](#IcuMenstrualCyclePerm) |  |  [optional]
**icuGarminHealth** | **kotlin.Boolean** |  |  [optional]
**icuGarminTraining** | **kotlin.Boolean** |  |  [optional]
**icuGarminSyncActivities** | **kotlin.Boolean** |  |  [optional]
**garminSyncActivityTypes** | [**inline**](#kotlin.collections.List&lt;GarminSyncActivityTypes&gt;) |  |  [optional]
**garminSyncAfter** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**icuGarminDownloadWellness** | **kotlin.Boolean** |  |  [optional]
**icuGarminUploadWorkouts** | **kotlin.Boolean** |  |  [optional]
**icuGarminOutdoorPowerRange** | **kotlin.Float** |  |  [optional]
**icuGarminHrRange** | **kotlin.Float** |  |  [optional]
**garminPaceRange** | **kotlin.Float** |  |  [optional]
**garminPowerTarget** | [**inline**](#GarminPowerTarget) |  |  [optional]
**icuGarminLastUpload** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**icuGarminUploadFilters** | [**kotlin.collections.List&lt;ActivityFilter&gt;**](ActivityFilter.md) |  |  [optional]
**icuGarminWellnessKeys** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**openStepDuration** | **kotlin.Int** |  |  [optional]
**polarScope** | **kotlin.String** |  |  [optional]
**polarSyncActivities** | **kotlin.Boolean** |  |  [optional]
**polarDownloadWellness** | **kotlin.Boolean** |  |  [optional]
**polarWellnessKeys** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**suuntoScope** | **kotlin.String** |  |  [optional]
**suuntoUserId** | **kotlin.String** |  |  [optional]
**suuntoSyncActivities** | **kotlin.Boolean** |  |  [optional]
**suuntoUploadWorkouts** | **kotlin.Boolean** |  |  [optional]
**suuntoOutdoorPowerRange** | **kotlin.Float** |  |  [optional]
**suuntoHrRange** | **kotlin.Float** |  |  [optional]
**suuntoPaceRange** | **kotlin.Float** |  |  [optional]
**suuntoLastUpload** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**suuntoUploadFilters** | [**kotlin.collections.List&lt;ActivityFilter&gt;**](ActivityFilter.md) |  |  [optional]
**corosUserId** | **kotlin.String** |  |  [optional]
**corosSyncActivities** | **kotlin.Boolean** |  |  [optional]
**corosUploadWorkouts** | **kotlin.Boolean** |  |  [optional]
**corosDownloadWellness** | **kotlin.Boolean** |  |  [optional]
**corosLastUpload** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**wahooUserId** | **kotlin.String** |  |  [optional]
**wahooSyncActivities** | **kotlin.Boolean** |  |  [optional]
**wahooUploadWorkouts** | **kotlin.Boolean** |  |  [optional]
**dropboxScope** | **kotlin.String** |  |  [optional]
**ouraScope** | **kotlin.String** |  |  [optional]
**ouraWellnessKeys** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**googleScope** | **kotlin.String** |  |  [optional]
**googleWellnessKeys** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**icuEmailVerified** | **kotlin.Boolean** |  |  [optional]
**icuEmailDisabled** | **kotlin.String** |  |  [optional]
**icuSendAchievements** | **kotlin.Boolean** |  |  [optional]
**icuSendNewsletter** | **kotlin.Boolean** |  |  [optional]
**icuSendPrivateChat** | **kotlin.Boolean** |  |  [optional]
**icuSendPrivateMsg** | **kotlin.Boolean** |  |  [optional]
**icuSendFollowReq** | **kotlin.Boolean** |  |  [optional]
**icuSendGroupChat** | **kotlin.Boolean** |  |  [optional]
**icuSendGroupMsg** | **kotlin.Boolean** |  |  [optional]
**icuSendActivityChat** | **kotlin.Boolean** |  |  [optional]
**icuSendFollowedActivityChat** | **kotlin.Boolean** |  |  [optional]
**icuSendCoachedActivityChat** | **kotlin.Boolean** |  |  [optional]
**icuSendActivityMsg** | **kotlin.Boolean** |  |  [optional]
**icuSendCoachMeReq** | **kotlin.Boolean** |  |  [optional]
**icuSendGearAlerts** | **kotlin.Boolean** |  |  [optional]
**icuSendPlanForWeek** | **kotlin.Boolean** |  |  [optional]
**includeDescrInPlanForWeek** | **kotlin.Boolean** |  |  [optional]
**icuSendFollowedNewActivity** | **kotlin.Boolean** |  |  [optional]
**icuSendCoachedNewActivity** | **kotlin.Boolean** |  |  [optional]
**stravaAllowed** | **kotlin.Boolean** |  |  [optional]
**stravaId** | **kotlin.Int** |  |  [optional]
**scope** | **kotlin.String** |  |  [optional]
**stravaSyncActivities** | **kotlin.Boolean** |  |  [optional]
**stravaSyncOtherActivities** | **kotlin.Boolean** |  |  [optional]
**ignoreStravaGear** | **kotlin.Boolean** |  |  [optional]
**updateStravaName** | **kotlin.Boolean** |  |  [optional]
**plan** | [**inline**](#Plan) |  |  [optional]
**planExpires** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**trialEndDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**hasPassword** | **kotlin.Boolean** |  |  [optional]
**currency** | **kotlin.String** |  |  [optional]
**trainingPlanId** | **kotlin.Int** |  |  [optional]
**trainingPlanStartDate** | **kotlin.String** |  |  [optional]
**stravaAuthorized** | **kotlin.Boolean** |  |  [optional]


<a id="WindSpeed"></a>
## Enum: wind_speed
Name | Value
---- | -----
windSpeed | MPS, KNOTS, KMH, MPH, BFT


<a id="Rain"></a>
## Enum: rain
Name | Value
---- | -----
rain | MM, INCHES


<a id="Visibility"></a>
## Enum: visibility
Name | Value
---- | -----
visibility | PRIVATE, PUBLIC


<a id="IcuWeightSync"></a>
## Enum: icu_weight_sync
Name | Value
---- | -----
icuWeightSync | NONE, STRAVA


<a id="IcuPermission"></a>
## Enum: icu_permission
Name | Value
---- | -----
icuPermission | NONE, READ, WRITE


<a id="IcuMenstrualCyclePerm"></a>
## Enum: icu_menstrual_cycle_perm
Name | Value
---- | -----
icuMenstrualCyclePerm | NONE, READ, WRITE


<a id="kotlin.collections.List<GarminSyncActivityTypes>"></a>
## Enum: garmin_sync_activity_types
Name | Value
---- | -----
garminSyncActivityTypes | Ride, Run, Swim, WeightTraining, Hike, Walk, AlpineSki, BackcountrySki, Badminton, Canoeing, Crossfit, EBikeRide, EMountainBikeRide, Elliptical, Golf, GravelRide, Handcycle, HighIntensityIntervalTraining, Hockey, IceSkate, InlineSkate, Kayaking, Kitesurf, MountainBikeRide, NordicSki, OpenWaterSwim, Padel, Pilates, Pickleball, Racquetball, Rugby, RockClimbing, RollerSki, Rowing, Sail, Skateboard, Snowboard, Snowshoe, Soccer, Squash, StairStepper, StandUpPaddling, Surfing, TableTennis, Tennis, TrailRun, Transition, Velomobile, VirtualRide, VirtualRow, VirtualRun, WaterSport, Wheelchair, Windsurf, Workout, Yoga, Other


<a id="GarminPowerTarget"></a>
## Enum: garmin_power_target
Name | Value
---- | -----
garminPowerTarget | POWER_LAP, POWER, POWER_3S, POWER_10S, POWER_30S


<a id="Plan"></a>
## Enum: plan
Name | Value
---- | -----
plan | FREE, PREMIUM, SUPPORTER, WHITELABEL



