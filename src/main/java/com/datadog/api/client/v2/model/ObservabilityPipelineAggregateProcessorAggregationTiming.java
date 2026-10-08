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

/**
 * Configures how metrics are assigned to aggregation windows. When omitted, metrics are grouped
 * using system time.
 */
@JsonPropertyOrder({
  ObservabilityPipelineAggregateProcessorAggregationTiming.JSON_PROPERTY_ALLOWED_LATENESS_SECS,
  ObservabilityPipelineAggregateProcessorAggregationTiming.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineAggregateProcessorAggregationTiming {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOWED_LATENESS_SECS = "allowed_lateness_secs";
  private Long allowedLatenessSecs;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineAggregateProcessorAggregationTimingType type;

  public ObservabilityPipelineAggregateProcessorAggregationTiming() {}

  @JsonCreator
  public ObservabilityPipelineAggregateProcessorAggregationTiming(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineAggregateProcessorAggregationTimingType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineAggregateProcessorAggregationTiming allowedLatenessSecs(
      Long allowedLatenessSecs) {
    this.allowedLatenessSecs = allowedLatenessSecs;
    return this;
  }

  /**
   * Grace period, in seconds, for late-arriving metrics when using event time. Defaults to 10
   * seconds when omitted. minimum: 0 maximum: 3600
   *
   * @return allowedLatenessSecs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOWED_LATENESS_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAllowedLatenessSecs() {
    return allowedLatenessSecs;
  }

  public void setAllowedLatenessSecs(Long allowedLatenessSecs) {
    this.allowedLatenessSecs = allowedLatenessSecs;
  }

  public ObservabilityPipelineAggregateProcessorAggregationTiming type(
      ObservabilityPipelineAggregateProcessorAggregationTimingType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Determines whether metrics are assigned to aggregation windows based on when they are processed
   * or their timestamps.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineAggregateProcessorAggregationTimingType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineAggregateProcessorAggregationTimingType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return ObservabilityPipelineAggregateProcessorAggregationTiming
   */
  @JsonAnySetter
  public ObservabilityPipelineAggregateProcessorAggregationTiming putAdditionalProperty(
      String key, Object value) {
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

  /**
   * Return true if this ObservabilityPipelineAggregateProcessorAggregationTiming object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineAggregateProcessorAggregationTiming
        observabilityPipelineAggregateProcessorAggregationTiming =
            (ObservabilityPipelineAggregateProcessorAggregationTiming) o;
    return Objects.equals(
            this.allowedLatenessSecs,
            observabilityPipelineAggregateProcessorAggregationTiming.allowedLatenessSecs)
        && Objects.equals(this.type, observabilityPipelineAggregateProcessorAggregationTiming.type)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineAggregateProcessorAggregationTiming.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedLatenessSecs, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineAggregateProcessorAggregationTiming {\n");
    sb.append("    allowedLatenessSecs: ")
        .append(toIndentedString(allowedLatenessSecs))
        .append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
