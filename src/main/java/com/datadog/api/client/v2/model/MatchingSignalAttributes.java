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

/** Attributes of a matching security signal. */
@JsonPropertyOrder({
  MatchingSignalAttributes.JSON_PROPERTY_EVENT_TRACKER_ID,
  MatchingSignalAttributes.JSON_PROPERTY_SEVERITY,
  MatchingSignalAttributes.JSON_PROPERTY_TITLE,
  MatchingSignalAttributes.JSON_PROPERTY_TRIGGER_TIME_MS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MatchingSignalAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EVENT_TRACKER_ID = "event_tracker_id";
  private String eventTrackerId;

  public static final String JSON_PROPERTY_SEVERITY = "severity";
  private String severity;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TRIGGER_TIME_MS = "trigger_time_ms";
  private Long triggerTimeMs;

  public MatchingSignalAttributes() {}

  @JsonCreator
  public MatchingSignalAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_EVENT_TRACKER_ID) String eventTrackerId,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEVERITY) String severity,
      @JsonProperty(required = true, value = JSON_PROPERTY_TITLE) String title,
      @JsonProperty(required = true, value = JSON_PROPERTY_TRIGGER_TIME_MS) Long triggerTimeMs) {
    this.eventTrackerId = eventTrackerId;
    this.severity = severity;
    this.title = title;
    this.triggerTimeMs = triggerTimeMs;
  }

  public MatchingSignalAttributes eventTrackerId(String eventTrackerId) {
    this.eventTrackerId = eventTrackerId;
    return this;
  }

  /**
   * The tracker ID linking the signal back to the originating event. Distinct from <code>id</code>,
   * which identifies the matching signal itself.
   *
   * @return eventTrackerId
   */
  @JsonProperty(JSON_PROPERTY_EVENT_TRACKER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEventTrackerId() {
    return eventTrackerId;
  }

  public void setEventTrackerId(String eventTrackerId) {
    this.eventTrackerId = eventTrackerId;
  }

  public MatchingSignalAttributes severity(String severity) {
    this.severity = severity;
    return this;
  }

  /**
   * The severity of the signal.
   *
   * @return severity
   */
  @JsonProperty(JSON_PROPERTY_SEVERITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSeverity() {
    return severity;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }

  public MatchingSignalAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the signal.
   *
   * @return title
   */
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public MatchingSignalAttributes triggerTimeMs(Long triggerTimeMs) {
    this.triggerTimeMs = triggerTimeMs;
    return this;
  }

  /**
   * The Unix timestamp (in milliseconds) at which the signal was triggered.
   *
   * @return triggerTimeMs
   */
  @JsonProperty(JSON_PROPERTY_TRIGGER_TIME_MS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTriggerTimeMs() {
    return triggerTimeMs;
  }

  public void setTriggerTimeMs(Long triggerTimeMs) {
    this.triggerTimeMs = triggerTimeMs;
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
   * @return MatchingSignalAttributes
   */
  @JsonAnySetter
  public MatchingSignalAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MatchingSignalAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchingSignalAttributes matchingSignalAttributes = (MatchingSignalAttributes) o;
    return Objects.equals(this.eventTrackerId, matchingSignalAttributes.eventTrackerId)
        && Objects.equals(this.severity, matchingSignalAttributes.severity)
        && Objects.equals(this.title, matchingSignalAttributes.title)
        && Objects.equals(this.triggerTimeMs, matchingSignalAttributes.triggerTimeMs)
        && Objects.equals(this.additionalProperties, matchingSignalAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTrackerId, severity, title, triggerTimeMs, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchingSignalAttributes {\n");
    sb.append("    eventTrackerId: ").append(toIndentedString(eventTrackerId)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    triggerTimeMs: ").append(toIndentedString(triggerTimeMs)).append("\n");
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
