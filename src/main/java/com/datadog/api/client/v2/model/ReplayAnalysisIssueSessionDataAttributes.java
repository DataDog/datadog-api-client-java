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

/** Attributes of a session related to a RUM replay analysis issue. */
@JsonPropertyOrder({
  ReplayAnalysisIssueSessionDataAttributes.JSON_PROPERTY_SESSION_START_TIMESTAMP_MS,
  ReplayAnalysisIssueSessionDataAttributes.JSON_PROPERTY_SIGNALS,
  ReplayAnalysisIssueSessionDataAttributes.JSON_PROPERTY_VIEW_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ReplayAnalysisIssueSessionDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SESSION_START_TIMESTAMP_MS =
      "session_start_timestamp_ms";
  private Long sessionStartTimestampMs;

  public static final String JSON_PROPERTY_SIGNALS = "signals";
  private List<ReplayAnalysisSignal> signals = new ArrayList<>();

  public static final String JSON_PROPERTY_VIEW_NAME = "view_name";
  private String viewName;

  public ReplayAnalysisIssueSessionDataAttributes() {}

  @JsonCreator
  public ReplayAnalysisIssueSessionDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_SESSION_START_TIMESTAMP_MS)
          Long sessionStartTimestampMs,
      @JsonProperty(required = true, value = JSON_PROPERTY_SIGNALS)
          List<ReplayAnalysisSignal> signals,
      @JsonProperty(required = true, value = JSON_PROPERTY_VIEW_NAME) String viewName) {
    this.sessionStartTimestampMs = sessionStartTimestampMs;
    this.signals = signals;
    this.viewName = viewName;
  }

  public ReplayAnalysisIssueSessionDataAttributes sessionStartTimestampMs(
      Long sessionStartTimestampMs) {
    this.sessionStartTimestampMs = sessionStartTimestampMs;
    return this;
  }

  /**
   * Session start timestamp in milliseconds.
   *
   * @return sessionStartTimestampMs
   */
  @JsonProperty(JSON_PROPERTY_SESSION_START_TIMESTAMP_MS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSessionStartTimestampMs() {
    return sessionStartTimestampMs;
  }

  public void setSessionStartTimestampMs(Long sessionStartTimestampMs) {
    this.sessionStartTimestampMs = sessionStartTimestampMs;
  }

  public ReplayAnalysisIssueSessionDataAttributes signals(List<ReplayAnalysisSignal> signals) {
    this.signals = signals;
    for (ReplayAnalysisSignal item : signals) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ReplayAnalysisIssueSessionDataAttributes addSignalsItem(ReplayAnalysisSignal signalsItem) {
    this.signals.add(signalsItem);
    this.unparsed |= signalsItem.unparsed;
    return this;
  }

  /**
   * List of signals observed in this session.
   *
   * @return signals
   */
  @JsonProperty(JSON_PROPERTY_SIGNALS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ReplayAnalysisSignal> getSignals() {
    return signals;
  }

  public void setSignals(List<ReplayAnalysisSignal> signals) {
    this.signals = signals;
  }

  public ReplayAnalysisIssueSessionDataAttributes viewName(String viewName) {
    this.viewName = viewName;
    return this;
  }

  /**
   * Name of the view where the issue was observed.
   *
   * @return viewName
   */
  @JsonProperty(JSON_PROPERTY_VIEW_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getViewName() {
    return viewName;
  }

  public void setViewName(String viewName) {
    this.viewName = viewName;
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
   * @return ReplayAnalysisIssueSessionDataAttributes
   */
  @JsonAnySetter
  public ReplayAnalysisIssueSessionDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ReplayAnalysisIssueSessionDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplayAnalysisIssueSessionDataAttributes replayAnalysisIssueSessionDataAttributes =
        (ReplayAnalysisIssueSessionDataAttributes) o;
    return Objects.equals(
            this.sessionStartTimestampMs,
            replayAnalysisIssueSessionDataAttributes.sessionStartTimestampMs)
        && Objects.equals(this.signals, replayAnalysisIssueSessionDataAttributes.signals)
        && Objects.equals(this.viewName, replayAnalysisIssueSessionDataAttributes.viewName)
        && Objects.equals(
            this.additionalProperties,
            replayAnalysisIssueSessionDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionStartTimestampMs, signals, viewName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplayAnalysisIssueSessionDataAttributes {\n");
    sb.append("    sessionStartTimestampMs: ")
        .append(toIndentedString(sessionStartTimestampMs))
        .append("\n");
    sb.append("    signals: ").append(toIndentedString(signals)).append("\n");
    sb.append("    viewName: ").append(toIndentedString(viewName)).append("\n");
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
