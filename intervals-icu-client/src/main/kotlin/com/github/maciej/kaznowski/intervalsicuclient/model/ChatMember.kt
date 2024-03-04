/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.github.maciej.kaznowski.intervalsicuclient.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param athleteId 
 * @param name 
 * @param profileMedium 
 * @param role 
 * @param coach 
 */
@JsonClass(generateAdapter = true)

data class ChatMember (

    @Json(name = "athlete_id")
    val athleteId: kotlin.String? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "profile_medium")
    val profileMedium: kotlin.String? = null,

    @Json(name = "role")
    val role: ChatMember.Role? = null,

    @Json(name = "coach")
    val coach: kotlin.Boolean? = null

) {

    /**
     * 
     *
     * Values: MEMBER,ADMIN
     */
    @JsonClass(generateAdapter = false)
    enum class Role(val value: kotlin.String) {
        @Json(name = "MEMBER") MEMBER("MEMBER"),
        @Json(name = "ADMIN") ADMIN("ADMIN");
    }
}
