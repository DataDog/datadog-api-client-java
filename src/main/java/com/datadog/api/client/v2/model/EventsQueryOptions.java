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
 * The global query options that are used. Either provide a timezone or a time offset but not both,
 * otherwise the query fails.
 */
@JsonPropertyOrder({
  EventsQueryOptions.JSON_PROPERTY_TIME_OFFSET,
  EventsQueryOptions.JSON_PROPERTY_TIMEZONE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EventsQueryOptions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TIME_OFFSET = "timeOffset";
  private Long timeOffset;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone = "UTC";

  public EventsQueryOptions timeOffset(Long timeOffset) {
    this.timeOffset = timeOffset;
    return this;
  }

  /**
   * The time offset to apply to the query in seconds.
   *
   * @return timeOffset
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTimeOffset() {
    return timeOffset;
  }

  public void setTimeOffset(Long timeOffset) {
    this.timeOffset = timeOffset;
  }

  public EventsQueryOptions timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * The timezone can be specified as GMT, UTC, an offset from UTC (like UTC+1), or as a Timezone
   * Database identifier (like America/New_York).
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
   * @return EventsQueryOptions
   */
  @JsonAnySetter
  public EventsQueryOptions putAdditionalProperty(String key, Object value) {
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

  /** Return true if this EventsQueryOptions object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventsQueryOptions eventsQueryOptions = (EventsQueryOptions) o;
    return Objects.equals(this.timeOffset, eventsQueryOptions.timeOffset)
        && Objects.equals(this.timezone, eventsQueryOptions.timezone)
        && Objects.equals(this.additionalProperties, eventsQueryOptions.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeOffset, timezone, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventsQueryOptions {\n");
    sb.append("    timeOffset: ").append(toIndentedString(timeOffset)).append("\n");
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
