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

/** Most anomalous point within the detected interval. */
@JsonPropertyOrder({
  TimeseriesAnomalyInvestigationMaximumDeviation.JSON_PROPERTY_DELTA_FROM_BOUNDARY,
  TimeseriesAnomalyInvestigationMaximumDeviation.JSON_PROPERTY_TIMESTAMP,
  TimeseriesAnomalyInvestigationMaximumDeviation.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimeseriesAnomalyInvestigationMaximumDeviation {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DELTA_FROM_BOUNDARY = "delta_from_boundary";
  private Double deltaFromBoundary;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private Long timestamp;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Double value;

  public TimeseriesAnomalyInvestigationMaximumDeviation() {}

  @JsonCreator
  public TimeseriesAnomalyInvestigationMaximumDeviation(
      @JsonProperty(required = true, value = JSON_PROPERTY_DELTA_FROM_BOUNDARY)
          Double deltaFromBoundary,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIMESTAMP) Long timestamp,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE) Double value) {
    this.deltaFromBoundary = deltaFromBoundary;
    this.timestamp = timestamp;
    this.value = value;
  }

  public TimeseriesAnomalyInvestigationMaximumDeviation deltaFromBoundary(
      Double deltaFromBoundary) {
    this.deltaFromBoundary = deltaFromBoundary;
    return this;
  }

  /**
   * Absolute distance between the observed value and the nearest anomaly boundary. minimum: 0
   *
   * @return deltaFromBoundary
   */
  @JsonProperty(JSON_PROPERTY_DELTA_FROM_BOUNDARY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getDeltaFromBoundary() {
    return deltaFromBoundary;
  }

  public void setDeltaFromBoundary(Double deltaFromBoundary) {
    this.deltaFromBoundary = deltaFromBoundary;
  }

  public TimeseriesAnomalyInvestigationMaximumDeviation timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Point timestamp in milliseconds since the Unix epoch.
   *
   * @return timestamp
   */
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public TimeseriesAnomalyInvestigationMaximumDeviation value(Double value) {
    this.value = value;
    return this;
  }

  /**
   * Observed value at the point.
   *
   * @return value
   */
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
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
   * @return TimeseriesAnomalyInvestigationMaximumDeviation
   */
  @JsonAnySetter
  public TimeseriesAnomalyInvestigationMaximumDeviation putAdditionalProperty(
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

  /** Return true if this TimeseriesAnomalyInvestigationMaximumDeviation object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesAnomalyInvestigationMaximumDeviation timeseriesAnomalyInvestigationMaximumDeviation =
        (TimeseriesAnomalyInvestigationMaximumDeviation) o;
    return Objects.equals(
            this.deltaFromBoundary,
            timeseriesAnomalyInvestigationMaximumDeviation.deltaFromBoundary)
        && Objects.equals(this.timestamp, timeseriesAnomalyInvestigationMaximumDeviation.timestamp)
        && Objects.equals(this.value, timeseriesAnomalyInvestigationMaximumDeviation.value)
        && Objects.equals(
            this.additionalProperties,
            timeseriesAnomalyInvestigationMaximumDeviation.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deltaFromBoundary, timestamp, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesAnomalyInvestigationMaximumDeviation {\n");
    sb.append("    deltaFromBoundary: ").append(toIndentedString(deltaFromBoundary)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
