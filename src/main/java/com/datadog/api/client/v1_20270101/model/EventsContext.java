/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  EventsContext.JSON_PROPERTY_CONTEXT_EVENT,
  EventsContext.JSON_PROPERTY_TO_EVENT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EventsContext {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTEXT_EVENT = "context_event";
  private String contextEvent;

  public static final String JSON_PROPERTY_TO_EVENT = "to_event";
  private String toEvent;

  public EventsContext contextEvent(String contextEvent) {
    this.contextEvent = contextEvent;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return contextEvent
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTEXT_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getContextEvent() {
    return contextEvent;
  }

  public void setContextEvent(String contextEvent) {
    this.contextEvent = contextEvent;
  }

  public EventsContext toEvent(String toEvent) {
    this.toEvent = toEvent;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return toEvent
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getToEvent() {
    return toEvent;
  }

  public void setToEvent(String toEvent) {
    this.toEvent = toEvent;
  }

  /** Return true if this EventsContext object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventsContext eventsContext = (EventsContext) o;
    return Objects.equals(this.contextEvent, eventsContext.contextEvent)
        && Objects.equals(this.toEvent, eventsContext.toEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextEvent, toEvent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventsContext {\n");
    sb.append("    contextEvent: ").append(toIndentedString(contextEvent)).append("\n");
    sb.append("    toEvent: ").append(toIndentedString(toEvent)).append("\n");
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
