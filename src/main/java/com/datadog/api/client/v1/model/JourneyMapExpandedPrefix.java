/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** A path expanded to show the events that follow it. */
@JsonPropertyOrder({
  JourneyMapExpandedPrefix.JSON_PROPERTY_EVENTS,
  JourneyMapExpandedPrefix.JSON_PROPERTY_PATH_LIMIT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class JourneyMapExpandedPrefix {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EVENTS = "events";
  private List<String> events = new ArrayList<>();

  public static final String JSON_PROPERTY_PATH_LIMIT = "path_limit";
  private Long pathLimit;

  public JourneyMapExpandedPrefix() {}

  @JsonCreator
  public JourneyMapExpandedPrefix(
      @JsonProperty(required = true, value = JSON_PROPERTY_EVENTS) List<String> events) {
    this.events = events;
  }

  public JourneyMapExpandedPrefix events(List<String> events) {
    this.events = events;
    return this;
  }

  public JourneyMapExpandedPrefix addEventsItem(String eventsItem) {
    this.events.add(eventsItem);
    return this;
  }

  /**
   * Events of the expanded path, in order.
   *
   * @return events
   */
  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getEvents() {
    return events;
  }

  public void setEvents(List<String> events) {
    this.events = events;
  }

  public JourneyMapExpandedPrefix pathLimit(Long pathLimit) {
    this.pathLimit = pathLimit;
    return this;
  }

  /**
   * Maximum number of paths shown after the expanded path. minimum: 1 maximum: 10
   *
   * @return pathLimit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATH_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPathLimit() {
    return pathLimit;
  }

  public void setPathLimit(Long pathLimit) {
    this.pathLimit = pathLimit;
  }

  /** Return true if this JourneyMapExpandedPrefix object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyMapExpandedPrefix journeyMapExpandedPrefix = (JourneyMapExpandedPrefix) o;
    return Objects.equals(this.events, journeyMapExpandedPrefix.events)
        && Objects.equals(this.pathLimit, journeyMapExpandedPrefix.pathLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events, pathLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyMapExpandedPrefix {\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    pathLimit: ").append(toIndentedString(pathLimit)).append("\n");
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
