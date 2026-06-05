/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** The configuration used when <code>mode</code> is <code>custom</code>. */
@JsonPropertyOrder({
  RumRateLimitCustomConfig.JSON_PROPERTY_DAILY_RESET_TIME,
  RumRateLimitCustomConfig.JSON_PROPERTY_DAILY_RESET_TIMEZONE,
  RumRateLimitCustomConfig.JSON_PROPERTY_QUOTA_REACHED_ACTION,
  RumRateLimitCustomConfig.JSON_PROPERTY_SESSION_LIMIT,
  RumRateLimitCustomConfig.JSON_PROPERTY_WINDOW_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumRateLimitCustomConfig {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DAILY_RESET_TIME = "daily_reset_time";
  private String dailyResetTime;

  public static final String JSON_PROPERTY_DAILY_RESET_TIMEZONE = "daily_reset_timezone";
  private String dailyResetTimezone;

  public static final String JSON_PROPERTY_QUOTA_REACHED_ACTION = "quota_reached_action";
  private RumRateLimitQuotaReachedAction quotaReachedAction;

  public static final String JSON_PROPERTY_SESSION_LIMIT = "session_limit";
  private Long sessionLimit;

  public static final String JSON_PROPERTY_WINDOW_TYPE = "window_type";
  private RumRateLimitWindowType windowType;

  public RumRateLimitCustomConfig() {}

  @JsonCreator
  public RumRateLimitCustomConfig(
      @JsonProperty(required = true, value = JSON_PROPERTY_DAILY_RESET_TIME) String dailyResetTime,
      @JsonProperty(required = true, value = JSON_PROPERTY_DAILY_RESET_TIMEZONE)
          String dailyResetTimezone,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUOTA_REACHED_ACTION)
          RumRateLimitQuotaReachedAction quotaReachedAction,
      @JsonProperty(required = true, value = JSON_PROPERTY_SESSION_LIMIT) Long sessionLimit,
      @JsonProperty(required = true, value = JSON_PROPERTY_WINDOW_TYPE)
          RumRateLimitWindowType windowType) {
    this.dailyResetTime = dailyResetTime;
    this.dailyResetTimezone = dailyResetTimezone;
    this.quotaReachedAction = quotaReachedAction;
    this.unparsed |= !quotaReachedAction.isValid();
    this.sessionLimit = sessionLimit;
    this.windowType = windowType;
    this.unparsed |= !windowType.isValid();
  }

  public RumRateLimitCustomConfig dailyResetTime(String dailyResetTime) {
    this.dailyResetTime = dailyResetTime;
    return this;
  }

  /**
   * The time of day when the daily quota resets, in <code>HH:MM</code> 24-hour format.
   *
   * @return dailyResetTime
   */
  @JsonProperty(JSON_PROPERTY_DAILY_RESET_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDailyResetTime() {
    return dailyResetTime;
  }

  public void setDailyResetTime(String dailyResetTime) {
    this.dailyResetTime = dailyResetTime;
  }

  public RumRateLimitCustomConfig dailyResetTimezone(String dailyResetTimezone) {
    this.dailyResetTimezone = dailyResetTimezone;
    return this;
  }

  /**
   * The timezone offset used for the daily reset time, in <code>±HH:MM</code> format.
   *
   * @return dailyResetTimezone
   */
  @JsonProperty(JSON_PROPERTY_DAILY_RESET_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDailyResetTimezone() {
    return dailyResetTimezone;
  }

  public void setDailyResetTimezone(String dailyResetTimezone) {
    this.dailyResetTimezone = dailyResetTimezone;
  }

  public RumRateLimitCustomConfig quotaReachedAction(
      RumRateLimitQuotaReachedAction quotaReachedAction) {
    this.quotaReachedAction = quotaReachedAction;
    this.unparsed |= !quotaReachedAction.isValid();
    return this;
  }

  /**
   * The action to take when the session quota is reached.
   *
   * @return quotaReachedAction
   */
  @JsonProperty(JSON_PROPERTY_QUOTA_REACHED_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RumRateLimitQuotaReachedAction getQuotaReachedAction() {
    return quotaReachedAction;
  }

  public void setQuotaReachedAction(RumRateLimitQuotaReachedAction quotaReachedAction) {
    if (!quotaReachedAction.isValid()) {
      this.unparsed = true;
    }
    this.quotaReachedAction = quotaReachedAction;
  }

  public RumRateLimitCustomConfig sessionLimit(Long sessionLimit) {
    this.sessionLimit = sessionLimit;
    return this;
  }

  /**
   * The maximum number of sessions allowed within the window. minimum: 1
   *
   * @return sessionLimit
   */
  @JsonProperty(JSON_PROPERTY_SESSION_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSessionLimit() {
    return sessionLimit;
  }

  public void setSessionLimit(Long sessionLimit) {
    this.sessionLimit = sessionLimit;
  }

  public RumRateLimitCustomConfig windowType(RumRateLimitWindowType windowType) {
    this.windowType = windowType;
    this.unparsed |= !windowType.isValid();
    return this;
  }

  /**
   * The window type over which the session limit is enforced.
   *
   * @return windowType
   */
  @JsonProperty(JSON_PROPERTY_WINDOW_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RumRateLimitWindowType getWindowType() {
    return windowType;
  }

  public void setWindowType(RumRateLimitWindowType windowType) {
    if (!windowType.isValid()) {
      this.unparsed = true;
    }
    this.windowType = windowType;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return RumRateLimitCustomConfig
   */
  @JsonAnySetter
  public RumRateLimitCustomConfig putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  /** Return true if this RumRateLimitCustomConfig object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumRateLimitCustomConfig rumRateLimitCustomConfig = (RumRateLimitCustomConfig) o;
    return Objects.equals(this.dailyResetTime, rumRateLimitCustomConfig.dailyResetTime)
        && Objects.equals(this.dailyResetTimezone, rumRateLimitCustomConfig.dailyResetTimezone)
        && Objects.equals(this.quotaReachedAction, rumRateLimitCustomConfig.quotaReachedAction)
        && Objects.equals(this.sessionLimit, rumRateLimitCustomConfig.sessionLimit)
        && Objects.equals(this.windowType, rumRateLimitCustomConfig.windowType)
        && Objects.equals(this.additionalProperties, rumRateLimitCustomConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dailyResetTime,
        dailyResetTimezone,
        quotaReachedAction,
        sessionLimit,
        windowType,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumRateLimitCustomConfig {\n");
    sb.append("    dailyResetTime: ").append(toIndentedString(dailyResetTime)).append("\n");
    sb.append("    dailyResetTimezone: ").append(toIndentedString(dailyResetTimezone)).append("\n");
    sb.append("    quotaReachedAction: ").append(toIndentedString(quotaReachedAction)).append("\n");
    sb.append("    sessionLimit: ").append(toIndentedString(sessionLimit)).append("\n");
    sb.append("    windowType: ").append(toIndentedString(windowType)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
