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

/** A signal associated with a replay issue, capturing user interaction details. */
@JsonPropertyOrder({
  ReplayAnalysisSignal.JSON_PROPERTY_EVENT,
  ReplayAnalysisSignal.JSON_PROPERTY_SIGNAL_TYPE,
  ReplayAnalysisSignal.JSON_PROPERTY_TIMESTAMP_MS,
  ReplayAnalysisSignal.JSON_PROPERTY_USER_PATTERN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ReplayAnalysisSignal {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EVENT = "event";
  private String event;

  public static final String JSON_PROPERTY_SIGNAL_TYPE = "signal_type";
  private String signalType;

  public static final String JSON_PROPERTY_TIMESTAMP_MS = "timestamp_ms";
  private Long timestampMs;

  public static final String JSON_PROPERTY_USER_PATTERN = "user_pattern";
  private String userPattern;

  public ReplayAnalysisSignal() {}

  @JsonCreator
  public ReplayAnalysisSignal(
      @JsonProperty(required = true, value = JSON_PROPERTY_EVENT) String event,
      @JsonProperty(required = true, value = JSON_PROPERTY_SIGNAL_TYPE) String signalType,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIMESTAMP_MS) Long timestampMs,
      @JsonProperty(required = true, value = JSON_PROPERTY_USER_PATTERN) String userPattern) {
    this.event = event;
    this.signalType = signalType;
    this.timestampMs = timestampMs;
    this.userPattern = userPattern;
  }

  public ReplayAnalysisSignal event(String event) {
    this.event = event;
    return this;
  }

  /**
   * Event name associated with the signal.
   *
   * @return event
   */
  @JsonProperty(JSON_PROPERTY_EVENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  public ReplayAnalysisSignal signalType(String signalType) {
    this.signalType = signalType;
    return this;
  }

  /**
   * Type of signal captured.
   *
   * @return signalType
   */
  @JsonProperty(JSON_PROPERTY_SIGNAL_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSignalType() {
    return signalType;
  }

  public void setSignalType(String signalType) {
    this.signalType = signalType;
  }

  public ReplayAnalysisSignal timestampMs(Long timestampMs) {
    this.timestampMs = timestampMs;
    return this;
  }

  /**
   * Absolute timestamp of the signal in milliseconds.
   *
   * @return timestampMs
   */
  @JsonProperty(JSON_PROPERTY_TIMESTAMP_MS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTimestampMs() {
    return timestampMs;
  }

  public void setTimestampMs(Long timestampMs) {
    this.timestampMs = timestampMs;
  }

  public ReplayAnalysisSignal userPattern(String userPattern) {
    this.userPattern = userPattern;
    return this;
  }

  /**
   * User behavior pattern identified for the signal.
   *
   * @return userPattern
   */
  @JsonProperty(JSON_PROPERTY_USER_PATTERN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUserPattern() {
    return userPattern;
  }

  public void setUserPattern(String userPattern) {
    this.userPattern = userPattern;
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
   * @return ReplayAnalysisSignal
   */
  @JsonAnySetter
  public ReplayAnalysisSignal putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ReplayAnalysisSignal object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplayAnalysisSignal replayAnalysisSignal = (ReplayAnalysisSignal) o;
    return Objects.equals(this.event, replayAnalysisSignal.event)
        && Objects.equals(this.signalType, replayAnalysisSignal.signalType)
        && Objects.equals(this.timestampMs, replayAnalysisSignal.timestampMs)
        && Objects.equals(this.userPattern, replayAnalysisSignal.userPattern)
        && Objects.equals(this.additionalProperties, replayAnalysisSignal.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, signalType, timestampMs, userPattern, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplayAnalysisSignal {\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    signalType: ").append(toIndentedString(signalType)).append("\n");
    sb.append("    timestampMs: ").append(toIndentedString(timestampMs)).append("\n");
    sb.append("    userPattern: ").append(toIndentedString(userPattern)).append("\n");
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
