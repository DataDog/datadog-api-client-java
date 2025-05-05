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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Holds time zone information and a list of time restrictions for a routing rule. */
@JsonPropertyOrder({
  TimeRestrictions.JSON_PROPERTY_RESTRICTIONS,
  TimeRestrictions.JSON_PROPERTY_TIME_ZONE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimeRestrictions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_RESTRICTIONS = "restrictions";
  private List<TimeRestriction> restrictions = new ArrayList<>();

  public static final String JSON_PROPERTY_TIME_ZONE = "time_zone";
  private String timeZone;

  public TimeRestrictions() {}

  @JsonCreator
  public TimeRestrictions(
      @JsonProperty(required = true, value = JSON_PROPERTY_RESTRICTIONS)
          List<TimeRestriction> restrictions,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIME_ZONE) String timeZone) {
    this.restrictions = restrictions;
    this.timeZone = timeZone;
  }

  public TimeRestrictions restrictions(List<TimeRestriction> restrictions) {
    this.restrictions = restrictions;
    for (TimeRestriction item : restrictions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TimeRestrictions addRestrictionsItem(TimeRestriction restrictionsItem) {
    this.restrictions.add(restrictionsItem);
    this.unparsed |= restrictionsItem.unparsed;
    return this;
  }

  /**
   * Defines the list of time-based restrictions.
   *
   * @return restrictions
   */
  @JsonProperty(JSON_PROPERTY_RESTRICTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<TimeRestriction> getRestrictions() {
    return restrictions;
  }

  public void setRestrictions(List<TimeRestriction> restrictions) {
    this.restrictions = restrictions;
  }

  public TimeRestrictions timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * Specifies the time zone applicable to the restrictions.
   *
   * @return timeZone
   */
  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
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
   * @return TimeRestrictions
   */
  @JsonAnySetter
  public TimeRestrictions putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TimeRestrictions object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeRestrictions timeRestrictions = (TimeRestrictions) o;
    return Objects.equals(this.restrictions, timeRestrictions.restrictions)
        && Objects.equals(this.timeZone, timeRestrictions.timeZone)
        && Objects.equals(this.additionalProperties, timeRestrictions.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(restrictions, timeZone, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeRestrictions {\n");
    sb.append("    restrictions: ").append(toIndentedString(restrictions)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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
