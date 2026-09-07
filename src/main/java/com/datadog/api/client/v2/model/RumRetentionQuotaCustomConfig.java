/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>The configuration used when <code>mode</code> is <code>custom</code>.</p>
 */
@JsonPropertyOrder({
  RumRetentionQuotaCustomConfig.JSON_PROPERTY_DAILY_RESET_TIME,
  RumRetentionQuotaCustomConfig.JSON_PROPERTY_DAILY_RESET_TIMEZONE,
  RumRetentionQuotaCustomConfig.JSON_PROPERTY_QUOTA_REACHED_ACTION,
  RumRetentionQuotaCustomConfig.JSON_PROPERTY_SESSION_LIMIT,
  RumRetentionQuotaCustomConfig.JSON_PROPERTY_WINDOW_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumRetentionQuotaCustomConfig {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DAILY_RESET_TIME = "daily_reset_time";
  private String dailyResetTime;

  public static final String JSON_PROPERTY_DAILY_RESET_TIMEZONE = "daily_reset_timezone";
  private String dailyResetTimezone;

  public static final String JSON_PROPERTY_QUOTA_REACHED_ACTION = "quota_reached_action";
  private RumRetentionQuotaReachedAction quotaReachedAction;

  public static final String JSON_PROPERTY_SESSION_LIMIT = "session_limit";
  private Long sessionLimit;

  public static final String JSON_PROPERTY_WINDOW_TYPE = "window_type";
  private RumRetentionQuotaWindowType windowType;

  public RumRetentionQuotaCustomConfig() {}

  @JsonCreator
  public RumRetentionQuotaCustomConfig(
            @JsonProperty(required=true, value=JSON_PROPERTY_DAILY_RESET_TIME)String dailyResetTime,
            @JsonProperty(required=true, value=JSON_PROPERTY_DAILY_RESET_TIMEZONE)String dailyResetTimezone,
            @JsonProperty(required=true, value=JSON_PROPERTY_QUOTA_REACHED_ACTION)RumRetentionQuotaReachedAction quotaReachedAction,
            @JsonProperty(required=true, value=JSON_PROPERTY_SESSION_LIMIT)Long sessionLimit,
            @JsonProperty(required=true, value=JSON_PROPERTY_WINDOW_TYPE)RumRetentionQuotaWindowType windowType) {
        this.dailyResetTime = dailyResetTime;
        this.dailyResetTimezone = dailyResetTimezone;
        this.quotaReachedAction = quotaReachedAction;
        this.unparsed |= !quotaReachedAction.isValid();
        this.sessionLimit = sessionLimit;
        this.windowType = windowType;
        this.unparsed |= !windowType.isValid();
  }
  public RumRetentionQuotaCustomConfig dailyResetTime(String dailyResetTime) {
    this.dailyResetTime = dailyResetTime;
    return this;
  }

  /**
   * <p>The time of day when the daily quota resets, in <code>HH:MM</code> 24-hour format.</p>
   * @return dailyResetTime
  **/
      @JsonProperty(JSON_PROPERTY_DAILY_RESET_TIME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getDailyResetTime() {
        return dailyResetTime;
      }
  public void setDailyResetTime(String dailyResetTime) {
    this.dailyResetTime = dailyResetTime;
  }
  public RumRetentionQuotaCustomConfig dailyResetTimezone(String dailyResetTimezone) {
    this.dailyResetTimezone = dailyResetTimezone;
    return this;
  }

  /**
   * <p>The timezone offset used for the daily reset time, in <code>±HH:MM</code> format.</p>
   * @return dailyResetTimezone
  **/
      @JsonProperty(JSON_PROPERTY_DAILY_RESET_TIMEZONE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getDailyResetTimezone() {
        return dailyResetTimezone;
      }
  public void setDailyResetTimezone(String dailyResetTimezone) {
    this.dailyResetTimezone = dailyResetTimezone;
  }
  public RumRetentionQuotaCustomConfig quotaReachedAction(RumRetentionQuotaReachedAction quotaReachedAction) {
    this.quotaReachedAction = quotaReachedAction;
    this.unparsed |= !quotaReachedAction.isValid();
    return this;
  }

  /**
   * <p>The action to take when the session quota is reached.</p>
   * @return quotaReachedAction
  **/
      @JsonProperty(JSON_PROPERTY_QUOTA_REACHED_ACTION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public RumRetentionQuotaReachedAction getQuotaReachedAction() {
        return quotaReachedAction;
      }
  public void setQuotaReachedAction(RumRetentionQuotaReachedAction quotaReachedAction) {
    if (!quotaReachedAction.isValid()) {
        this.unparsed = true;
    }
    this.quotaReachedAction = quotaReachedAction;
  }
  public RumRetentionQuotaCustomConfig sessionLimit(Long sessionLimit) {
    this.sessionLimit = sessionLimit;
    return this;
  }

  /**
   * <p>The maximum number of sessions allowed within the window. Must be at least <code>1000</code>.</p>
   * minimum: 1000
   * @return sessionLimit
  **/
      @JsonProperty(JSON_PROPERTY_SESSION_LIMIT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getSessionLimit() {
        return sessionLimit;
      }
  public void setSessionLimit(Long sessionLimit) {
    this.sessionLimit = sessionLimit;
  }
  public RumRetentionQuotaCustomConfig windowType(RumRetentionQuotaWindowType windowType) {
    this.windowType = windowType;
    this.unparsed |= !windowType.isValid();
    return this;
  }

  /**
   * <p>The window type over which the session limit is enforced.</p>
   * @return windowType
  **/
      @JsonProperty(JSON_PROPERTY_WINDOW_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public RumRetentionQuotaWindowType getWindowType() {
        return windowType;
      }
  public void setWindowType(RumRetentionQuotaWindowType windowType) {
    if (!windowType.isValid()) {
        this.unparsed = true;
    }
    this.windowType = windowType;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return RumRetentionQuotaCustomConfig
   */
  @JsonAnySetter
  public RumRetentionQuotaCustomConfig putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this RumRetentionQuotaCustomConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumRetentionQuotaCustomConfig rumRetentionQuotaCustomConfig = (RumRetentionQuotaCustomConfig) o;
    return Objects.equals(this.dailyResetTime, rumRetentionQuotaCustomConfig.dailyResetTime) && Objects.equals(this.dailyResetTimezone, rumRetentionQuotaCustomConfig.dailyResetTimezone) && Objects.equals(this.quotaReachedAction, rumRetentionQuotaCustomConfig.quotaReachedAction) && Objects.equals(this.sessionLimit, rumRetentionQuotaCustomConfig.sessionLimit) && Objects.equals(this.windowType, rumRetentionQuotaCustomConfig.windowType) && Objects.equals(this.additionalProperties, rumRetentionQuotaCustomConfig.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(dailyResetTime,dailyResetTimezone,quotaReachedAction,sessionLimit,windowType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumRetentionQuotaCustomConfig {\n");
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
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
