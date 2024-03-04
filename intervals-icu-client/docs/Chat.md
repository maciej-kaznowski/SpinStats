
# Chat

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** |  |  [optional]
**type** | [**inline**](#Type) |  |  [optional]
**updated** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**name** | **kotlin.String** |  |  [optional]
**picture** | **kotlin.String** |  |  [optional]
**description** | **kotlin.String** |  |  [optional]
**url** | **kotlin.String** |  |  [optional]
**slug** | **kotlin.String** |  |  [optional]
**pub** | **kotlin.Boolean** |  |  [optional]
**joinPolicy** | [**inline**](#JoinPolicy) |  |  [optional]
**sidebarLogo** | **kotlin.String** |  |  [optional]
**sidebarColor** | **kotlin.String** |  |  [optional]
**sidebarDark** | **kotlin.Boolean** |  |  [optional]
**sidebarTopColor** | **kotlin.String** |  |  [optional]
**hideMembers** | **kotlin.Boolean** |  |  [optional]
**primaryGroup** | **kotlin.Boolean** |  |  [optional]
**members** | [**kotlin.collections.List&lt;ChatMember&gt;**](ChatMember.md) |  |  [optional]
**athleteId** | **kotlin.String** |  |  [optional]
**activityId** | **kotlin.String** |  |  [optional]
**otherAthleteId** | **kotlin.String** |  |  [optional]
**otherAthleteSex** | **kotlin.String** |  |  [optional]
**followsYou** | **kotlin.String** |  |  [optional]
**youFollow** | **kotlin.String** |  |  [optional]
**role** | [**inline**](#Role) |  |  [optional]
**newMessageCount** | **kotlin.Int** |  |  [optional]
**kicked** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**kickedById** | **kotlin.String** |  |  [optional]
**lastSeenMessageId** | **kotlin.Long** |  |  [optional]
**muteUntil** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**sharedFolders** | [**kotlin.collections.List&lt;Folder&gt;**](Folder.md) |  |  [optional]


<a id="Type"></a>
## Enum: type
Name | Value
---- | -----
type | PRIVATE, GROUP, ACTIVITY


<a id="JoinPolicy"></a>
## Enum: join_policy
Name | Value
---- | -----
joinPolicy | OPEN, ASK, INVITE_ONLY


<a id="Role"></a>
## Enum: role
Name | Value
---- | -----
role | MEMBER, ADMIN



