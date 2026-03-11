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

/** Configuration for cross-product sampling when creating a retention filter. */
@JsonPropertyOrder({
  RumCrossProductSamplingCreate.JSON_PROPERTY_TRACE_ENABLED,
  RumCrossProductSamplingCreate.JSON_PROPERTY_TRACE_SAMPLE_RATE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumCrossProductSamplingCreate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TRACE_ENABLED = "trace_enabled";
  private Boolean traceEnabled;

  public static final String JSON_PROPERTY_TRACE_SAMPLE_RATE = "trace_sample_rate";
  private Double traceSampleRate;

  public RumCrossProductSamplingCreate() {}

  @JsonCreator
  public RumCrossProductSamplingCreate(
      @JsonProperty(required = true, value = JSON_PROPERTY_TRACE_SAMPLE_RATE)
          Double traceSampleRate) {
    this.traceSampleRate = traceSampleRate;
  }

  public RumCrossProductSamplingCreate traceEnabled(Boolean traceEnabled) {
    this.traceEnabled = traceEnabled;
    return this;
  }

  /**
   * Indicates whether trace cross-product sampling is enabled.
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

  public RumCrossProductSamplingCreate traceSampleRate(Double traceSampleRate) {
    this.traceSampleRate = traceSampleRate;
    return this;
  }

  /**
   * The percentage (0-100) of retained sessions with ingested traces whose traces are indexed.
   * minimum: 0 maximum: 100
   *
   * @return traceSampleRate
   */
  @JsonProperty(JSON_PROPERTY_TRACE_SAMPLE_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * @return RumCrossProductSamplingCreate
   */
  @JsonAnySetter
  public RumCrossProductSamplingCreate putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RumCrossProductSamplingCreate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumCrossProductSamplingCreate rumCrossProductSamplingCreate = (RumCrossProductSamplingCreate) o;
    return Objects.equals(this.traceEnabled, rumCrossProductSamplingCreate.traceEnabled)
        && Objects.equals(this.traceSampleRate, rumCrossProductSamplingCreate.traceSampleRate)
        && Objects.equals(
            this.additionalProperties, rumCrossProductSamplingCreate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(traceEnabled, traceSampleRate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumCrossProductSamplingCreate {\n");
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
