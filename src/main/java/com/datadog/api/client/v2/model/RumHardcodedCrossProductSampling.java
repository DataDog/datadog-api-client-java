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

/** Cross-product retention settings for a hardcoded retention filter. */
@JsonPropertyOrder({
  RumHardcodedCrossProductSampling.JSON_PROPERTY_SESSION_REPLAY_ENABLED,
  RumHardcodedCrossProductSampling.JSON_PROPERTY_SESSION_REPLAY_SAMPLE_RATE,
  RumHardcodedCrossProductSampling.JSON_PROPERTY_TRACE_ENABLED,
  RumHardcodedCrossProductSampling.JSON_PROPERTY_TRACE_SAMPLE_RATE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumHardcodedCrossProductSampling {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SESSION_REPLAY_ENABLED = "session_replay_enabled";
  private Boolean sessionReplayEnabled;

  public static final String JSON_PROPERTY_SESSION_REPLAY_SAMPLE_RATE =
      "session_replay_sample_rate";
  private Double sessionReplaySampleRate;

  public static final String JSON_PROPERTY_TRACE_ENABLED = "trace_enabled";
  private Boolean traceEnabled;

  public static final String JSON_PROPERTY_TRACE_SAMPLE_RATE = "trace_sample_rate";
  private Double traceSampleRate;

  public RumHardcodedCrossProductSampling sessionReplayEnabled(Boolean sessionReplayEnabled) {
    this.sessionReplayEnabled = sessionReplayEnabled;
    return this;
  }

  /**
   * Indicates whether Session Replay cross-product retention is active.
   *
   * @return sessionReplayEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SESSION_REPLAY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSessionReplayEnabled() {
    return sessionReplayEnabled;
  }

  public void setSessionReplayEnabled(Boolean sessionReplayEnabled) {
    this.sessionReplayEnabled = sessionReplayEnabled;
  }

  public RumHardcodedCrossProductSampling sessionReplaySampleRate(Double sessionReplaySampleRate) {
    this.sessionReplaySampleRate = sessionReplaySampleRate;
    return this;
  }

  /**
   * Percentage (0–100) of retained sessions with an ingested replay whose replay data is kept.
   * minimum: 0 maximum: 100
   *
   * @return sessionReplaySampleRate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SESSION_REPLAY_SAMPLE_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSessionReplaySampleRate() {
    return sessionReplaySampleRate;
  }

  public void setSessionReplaySampleRate(Double sessionReplaySampleRate) {
    this.sessionReplaySampleRate = sessionReplaySampleRate;
  }

  public RumHardcodedCrossProductSampling traceEnabled(Boolean traceEnabled) {
    this.traceEnabled = traceEnabled;
    return this;
  }

  /**
   * Indicates whether Trace cross-product retention is active.
   *
   * @return traceEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACE_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getTraceEnabled() {
    return traceEnabled;
  }

  public void setTraceEnabled(Boolean traceEnabled) {
    this.traceEnabled = traceEnabled;
  }

  public RumHardcodedCrossProductSampling traceSampleRate(Double traceSampleRate) {
    this.traceSampleRate = traceSampleRate;
    return this;
  }

  /**
   * Percentage (0–100) of retained sessions with ingested traces whose traces are indexed. minimum:
   * 0 maximum: 100
   *
   * @return traceSampleRate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACE_SAMPLE_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTraceSampleRate() {
    return traceSampleRate;
  }

  public void setTraceSampleRate(Double traceSampleRate) {
    this.traceSampleRate = traceSampleRate;
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
   * @return RumHardcodedCrossProductSampling
   */
  @JsonAnySetter
  public RumHardcodedCrossProductSampling putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RumHardcodedCrossProductSampling object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumHardcodedCrossProductSampling rumHardcodedCrossProductSampling =
        (RumHardcodedCrossProductSampling) o;
    return Objects.equals(
            this.sessionReplayEnabled, rumHardcodedCrossProductSampling.sessionReplayEnabled)
        && Objects.equals(
            this.sessionReplaySampleRate, rumHardcodedCrossProductSampling.sessionReplaySampleRate)
        && Objects.equals(this.traceEnabled, rumHardcodedCrossProductSampling.traceEnabled)
        && Objects.equals(this.traceSampleRate, rumHardcodedCrossProductSampling.traceSampleRate)
        && Objects.equals(
            this.additionalProperties, rumHardcodedCrossProductSampling.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        sessionReplayEnabled,
        sessionReplaySampleRate,
        traceEnabled,
        traceSampleRate,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumHardcodedCrossProductSampling {\n");
    sb.append("    sessionReplayEnabled: ")
        .append(toIndentedString(sessionReplayEnabled))
        .append("\n");
    sb.append("    sessionReplaySampleRate: ")
        .append(toIndentedString(sessionReplaySampleRate))
        .append("\n");
    sb.append("    traceEnabled: ").append(toIndentedString(traceEnabled)).append("\n");
    sb.append("    traceSampleRate: ").append(toIndentedString(traceSampleRate)).append("\n");
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
