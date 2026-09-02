/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Object describing the retry strategy to apply to a Synthetic test. */
@JsonPropertyOrder({
  SyntheticsTestOptionsRetry.JSON_PROPERTY_COUNT,
  SyntheticsTestOptionsRetry.JSON_PROPERTY_INTERVAL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestOptionsRetry {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COUNT = "count";
  private Long count;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private Double interval;

  public SyntheticsTestOptionsRetry count(Long count) {
    this.count = count;
    return this;
  }

  /**
   * Number of times a test needs to be retried before marking a location as failed. Defaults to 0.
   *
   * @return count
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public SyntheticsTestOptionsRetry interval(Double interval) {
    this.interval = interval;
    return this;
  }

  /**
   * Time interval between retries (in milliseconds). Defaults to 300ms.
   *
   * @return interval
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInterval() {
    return interval;
  }

  public void setInterval(Double interval) {
    this.interval = interval;
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
   * @return SyntheticsTestOptionsRetry
   */
  @JsonAnySetter
  public SyntheticsTestOptionsRetry putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestOptionsRetry object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestOptionsRetry syntheticsTestOptionsRetry = (SyntheticsTestOptionsRetry) o;
    return Objects.equals(this.count, syntheticsTestOptionsRetry.count)
        && Objects.equals(this.interval, syntheticsTestOptionsRetry.interval)
        && Objects.equals(
            this.additionalProperties, syntheticsTestOptionsRetry.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, interval, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestOptionsRetry {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
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
