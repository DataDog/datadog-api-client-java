/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.datadog.api.client.JsonTimeSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Number of RUM Sessions recorded for each hour for a given organization. */
@JsonPropertyOrder({
  UsageRumSessionsHour.JSON_PROPERTY_HOUR,
  UsageRumSessionsHour.JSON_PROPERTY_ORG_NAME,
  UsageRumSessionsHour.JSON_PROPERTY_PUBLIC_ID,
  UsageRumSessionsHour.JSON_PROPERTY_REPLAY_SESSION_COUNT,
  UsageRumSessionsHour.JSON_PROPERTY_SESSION_COUNT,
  UsageRumSessionsHour.JSON_PROPERTY_SESSION_COUNT_ANDROID,
  UsageRumSessionsHour.JSON_PROPERTY_SESSION_COUNT_IOS,
  UsageRumSessionsHour.JSON_PROPERTY_SESSION_COUNT_REACTNATIVE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageRumSessionsHour {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HOUR = "hour";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_REPLAY_SESSION_COUNT = "replay_session_count";
  private Long replaySessionCount;

  public static final String JSON_PROPERTY_SESSION_COUNT = "session_count";
  private JsonNullable<Long> sessionCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_SESSION_COUNT_ANDROID = "session_count_android";
  private JsonNullable<Long> sessionCountAndroid = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_SESSION_COUNT_IOS = "session_count_ios";
  private JsonNullable<Long> sessionCountIos = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_SESSION_COUNT_REACTNATIVE = "session_count_reactnative";
  private JsonNullable<Long> sessionCountReactnative = JsonNullable.<Long>undefined();

  public UsageRumSessionsHour hour(OffsetDateTime hour) {
    this.hour = hour;
    return this;
  }

  /**
   * The hour for the usage.
   *
   * @return hour
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getHour() {
    return hour;
  }

  public void setHour(OffsetDateTime hour) {
    this.hour = hour;
  }

  public UsageRumSessionsHour orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

  /**
   * The organization name.
   *
   * @return orgName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  public UsageRumSessionsHour publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * The organization public ID.
   *
   * @return publicId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicId() {
    return publicId;
  }

  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }

  public UsageRumSessionsHour replaySessionCount(Long replaySessionCount) {
    this.replaySessionCount = replaySessionCount;
    return this;
  }

  /**
   * Contains the number of RUM Replay Sessions (data available beginning November 1, 2021).
   *
   * @return replaySessionCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPLAY_SESSION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getReplaySessionCount() {
    return replaySessionCount;
  }

  public void setReplaySessionCount(Long replaySessionCount) {
    this.replaySessionCount = replaySessionCount;
  }

  public UsageRumSessionsHour sessionCount(Long sessionCount) {
    this.sessionCount = JsonNullable.<Long>of(sessionCount);
    return this;
  }

  /**
   * Contains the number of browser RUM Lite Sessions.
   *
   * @return sessionCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getSessionCount() {
    return sessionCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SESSION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getSessionCount_JsonNullable() {
    return sessionCount;
  }

  @JsonProperty(JSON_PROPERTY_SESSION_COUNT)
  public void setSessionCount_JsonNullable(JsonNullable<Long> sessionCount) {
    this.sessionCount = sessionCount;
  }

  public void setSessionCount(Long sessionCount) {
    this.sessionCount = JsonNullable.<Long>of(sessionCount);
  }

  public UsageRumSessionsHour sessionCountAndroid(Long sessionCountAndroid) {
    this.sessionCountAndroid = JsonNullable.<Long>of(sessionCountAndroid);
    return this;
  }

  /**
   * Contains the number of mobile RUM Sessions on Android (data available beginning December 1,
   * 2020).
   *
   * @return sessionCountAndroid
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getSessionCountAndroid() {
    return sessionCountAndroid.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SESSION_COUNT_ANDROID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getSessionCountAndroid_JsonNullable() {
    return sessionCountAndroid;
  }

  @JsonProperty(JSON_PROPERTY_SESSION_COUNT_ANDROID)
  public void setSessionCountAndroid_JsonNullable(JsonNullable<Long> sessionCountAndroid) {
    this.sessionCountAndroid = sessionCountAndroid;
  }

  public void setSessionCountAndroid(Long sessionCountAndroid) {
    this.sessionCountAndroid = JsonNullable.<Long>of(sessionCountAndroid);
  }

  public UsageRumSessionsHour sessionCountIos(Long sessionCountIos) {
    this.sessionCountIos = JsonNullable.<Long>of(sessionCountIos);
    return this;
  }

  /**
   * Contains the number of mobile RUM Sessions on iOS (data available beginning December 1, 2020).
   *
   * @return sessionCountIos
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getSessionCountIos() {
    return sessionCountIos.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SESSION_COUNT_IOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getSessionCountIos_JsonNullable() {
    return sessionCountIos;
  }

  @JsonProperty(JSON_PROPERTY_SESSION_COUNT_IOS)
  public void setSessionCountIos_JsonNullable(JsonNullable<Long> sessionCountIos) {
    this.sessionCountIos = sessionCountIos;
  }

  public void setSessionCountIos(Long sessionCountIos) {
    this.sessionCountIos = JsonNullable.<Long>of(sessionCountIos);
  }

  public UsageRumSessionsHour sessionCountReactnative(Long sessionCountReactnative) {
    this.sessionCountReactnative = JsonNullable.<Long>of(sessionCountReactnative);
    return this;
  }

  /**
   * Contains the number of mobile RUM Sessions on React Native (data available beginning May 1,
   * 2022).
   *
   * @return sessionCountReactnative
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getSessionCountReactnative() {
    return sessionCountReactnative.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SESSION_COUNT_REACTNATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getSessionCountReactnative_JsonNullable() {
    return sessionCountReactnative;
  }

  @JsonProperty(JSON_PROPERTY_SESSION_COUNT_REACTNATIVE)
  public void setSessionCountReactnative_JsonNullable(JsonNullable<Long> sessionCountReactnative) {
    this.sessionCountReactnative = sessionCountReactnative;
  }

  public void setSessionCountReactnative(Long sessionCountReactnative) {
    this.sessionCountReactnative = JsonNullable.<Long>of(sessionCountReactnative);
  }

  /** Return true if this UsageRumSessionsHour object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageRumSessionsHour usageRumSessionsHour = (UsageRumSessionsHour) o;
    return Objects.equals(this.hour, usageRumSessionsHour.hour)
        && Objects.equals(this.orgName, usageRumSessionsHour.orgName)
        && Objects.equals(this.publicId, usageRumSessionsHour.publicId)
        && Objects.equals(this.replaySessionCount, usageRumSessionsHour.replaySessionCount)
        && Objects.equals(this.sessionCount, usageRumSessionsHour.sessionCount)
        && Objects.equals(this.sessionCountAndroid, usageRumSessionsHour.sessionCountAndroid)
        && Objects.equals(this.sessionCountIos, usageRumSessionsHour.sessionCountIos)
        && Objects.equals(
            this.sessionCountReactnative, usageRumSessionsHour.sessionCountReactnative);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        hour,
        orgName,
        publicId,
        replaySessionCount,
        sessionCount,
        sessionCountAndroid,
        sessionCountIos,
        sessionCountReactnative);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageRumSessionsHour {\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    replaySessionCount: ").append(toIndentedString(replaySessionCount)).append("\n");
    sb.append("    sessionCount: ").append(toIndentedString(sessionCount)).append("\n");
    sb.append("    sessionCountAndroid: ")
        .append(toIndentedString(sessionCountAndroid))
        .append("\n");
    sb.append("    sessionCountIos: ").append(toIndentedString(sessionCountIos)).append("\n");
    sb.append("    sessionCountReactnative: ")
        .append(toIndentedString(sessionCountReactnative))
        .append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
