/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Options for scheduled rules. When this field is present, the rule runs based on the schedule.
 * When absent, it runs real-time on ingested logs.
 */
@JsonPropertyOrder({
  SecurityMonitoringSchedulingOptions.JSON_PROPERTY_RRULE,
  SecurityMonitoringSchedulingOptions.JSON_PROPERTY_START,
  SecurityMonitoringSchedulingOptions.JSON_PROPERTY_TIMEZONE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringSchedulingOptions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_RRULE = "rrule";
  private String rrule;

  public static final String JSON_PROPERTY_START = "start";
  private String start;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public SecurityMonitoringSchedulingOptions rrule(String rrule) {
    this.rrule = rrule;
    return this;
  }

  /**
   * Schedule for the rule queries, written in RRULE syntax. See <a
   * href="https://icalendar.org/iCalendar-RFC-5545/3-8-5-3-recurrence-rule.html">RFC</a> for syntax
   * reference.
   *
   * @return rrule
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RRULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRrule() {
    return rrule;
  }

  public void setRrule(String rrule) {
    this.rrule = rrule;
  }

  public SecurityMonitoringSchedulingOptions start(String start) {
    this.start = start;
    return this;
  }

  /**
   * Start date for the schedule, in ISO 8601 format without timezone.
   *
   * @return start
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  public SecurityMonitoringSchedulingOptions timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * Time zone of the start date, in the <a
   * href="https://en.wikipedia.org/wiki/List_of_tz_database_time_zones">tz database</a> format.
   *
   * @return timezone
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
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
   * @return SecurityMonitoringSchedulingOptions
   */
  @JsonAnySetter
  public SecurityMonitoringSchedulingOptions putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecurityMonitoringSchedulingOptions object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringSchedulingOptions securityMonitoringSchedulingOptions =
        (SecurityMonitoringSchedulingOptions) o;
    return Objects.equals(this.rrule, securityMonitoringSchedulingOptions.rrule)
        && Objects.equals(this.start, securityMonitoringSchedulingOptions.start)
        && Objects.equals(this.timezone, securityMonitoringSchedulingOptions.timezone)
        && Objects.equals(
            this.additionalProperties, securityMonitoringSchedulingOptions.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rrule, start, timezone, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSchedulingOptions {\n");
    sb.append("    rrule: ").append(toIndentedString(rrule)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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
