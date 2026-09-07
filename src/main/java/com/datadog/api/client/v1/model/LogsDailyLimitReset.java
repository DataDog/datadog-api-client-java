/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Object containing options to override the default daily limit reset time. */
@JsonPropertyOrder({
  LogsDailyLimitReset.JSON_PROPERTY_RESET_TIME,
  LogsDailyLimitReset.JSON_PROPERTY_RESET_UTC_OFFSET
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsDailyLimitReset {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_RESET_TIME = "reset_time";
  private String resetTime;

  public static final String JSON_PROPERTY_RESET_UTC_OFFSET = "reset_utc_offset";
  private String resetUtcOffset;

  public LogsDailyLimitReset resetTime(String resetTime) {
    this.resetTime = resetTime;
    return this;
  }

  /**
   * String in <code>HH:00</code> format representing the time of day the daily limit should be
   * reset. The hours must be between 00 and 23 (inclusive).
   *
   * @return resetTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESET_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResetTime() {
    return resetTime;
  }

  public void setResetTime(String resetTime) {
    this.resetTime = resetTime;
  }

  public LogsDailyLimitReset resetUtcOffset(String resetUtcOffset) {
    this.resetUtcOffset = resetUtcOffset;
    return this;
  }

  /**
   * String in <code>(-|+)HH:00</code> format representing the UTC offset to apply to the given
   * reset time. The hours must be between -12 and +14 (inclusive).
   *
   * @return resetUtcOffset
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESET_UTC_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResetUtcOffset() {
    return resetUtcOffset;
  }

  public void setResetUtcOffset(String resetUtcOffset) {
    this.resetUtcOffset = resetUtcOffset;
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
   * @return LogsDailyLimitReset
   */
  @JsonAnySetter
  public LogsDailyLimitReset putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LogsDailyLimitReset object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsDailyLimitReset logsDailyLimitReset = (LogsDailyLimitReset) o;
    return Objects.equals(this.resetTime, logsDailyLimitReset.resetTime)
        && Objects.equals(this.resetUtcOffset, logsDailyLimitReset.resetUtcOffset)
        && Objects.equals(this.additionalProperties, logsDailyLimitReset.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resetTime, resetUtcOffset, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsDailyLimitReset {\n");
    sb.append("    resetTime: ").append(toIndentedString(resetTime)).append("\n");
    sb.append("    resetUtcOffset: ").append(toIndentedString(resetUtcOffset)).append("\n");
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
