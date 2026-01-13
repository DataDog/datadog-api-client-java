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

/** X Axis controls for the distribution widget. */
@JsonPropertyOrder({
  DistributionWidgetXAxis.JSON_PROPERTY_INCLUDE_ZERO,
  DistributionWidgetXAxis.JSON_PROPERTY_MAX,
  DistributionWidgetXAxis.JSON_PROPERTY_MIN,
  DistributionWidgetXAxis.JSON_PROPERTY_NUM_BUCKETS,
  DistributionWidgetXAxis.JSON_PROPERTY_SCALE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DistributionWidgetXAxis {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INCLUDE_ZERO = "include_zero";
  private Boolean includeZero;

  public static final String JSON_PROPERTY_MAX = "max";
  private String max = "auto";

  public static final String JSON_PROPERTY_MIN = "min";
  private String min = "auto";

  public static final String JSON_PROPERTY_NUM_BUCKETS = "num_buckets";
  private Long numBuckets;

  public static final String JSON_PROPERTY_SCALE = "scale";
  private String scale = "linear";

  public DistributionWidgetXAxis includeZero(Boolean includeZero) {
    this.includeZero = includeZero;
    return this;
  }

  /**
   * True includes zero.
   *
   * @return includeZero
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_ZERO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIncludeZero() {
    return includeZero;
  }

  public void setIncludeZero(Boolean includeZero) {
    this.includeZero = includeZero;
  }

  public DistributionWidgetXAxis max(String max) {
    this.max = max;
    return this;
  }

  /**
   * Specifies maximum value to show on the x-axis. It takes a number, percentile (p90 === 90th
   * percentile), or auto for default behavior.
   *
   * @return max
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMax() {
    return max;
  }

  public void setMax(String max) {
    this.max = max;
  }

  public DistributionWidgetXAxis min(String min) {
    this.min = min;
    return this;
  }

  /**
   * Specifies minimum value to show on the x-axis. It takes a number, percentile (p90 === 90th
   * percentile), or auto for default behavior.
   *
   * @return min
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMin() {
    return min;
  }

  public void setMin(String min) {
    this.min = min;
  }

  public DistributionWidgetXAxis numBuckets(Long numBuckets) {
    this.numBuckets = numBuckets;
    return this;
  }

  /**
   * Number of value buckets to target, also known as the resolution of the value bins. minimum: 1
   *
   * @return numBuckets
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUM_BUCKETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getNumBuckets() {
    return numBuckets;
  }

  public void setNumBuckets(Long numBuckets) {
    this.numBuckets = numBuckets;
  }

  public DistributionWidgetXAxis scale(String scale) {
    this.scale = scale;
    return this;
  }

  /**
   * Specifies the scale type. Possible values are <code>linear</code>.
   *
   * @return scale
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getScale() {
    return scale;
  }

  public void setScale(String scale) {
    this.scale = scale;
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
   * @return DistributionWidgetXAxis
   */
  @JsonAnySetter
  public DistributionWidgetXAxis putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DistributionWidgetXAxis object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributionWidgetXAxis distributionWidgetXAxis = (DistributionWidgetXAxis) o;
    return Objects.equals(this.includeZero, distributionWidgetXAxis.includeZero)
        && Objects.equals(this.max, distributionWidgetXAxis.max)
        && Objects.equals(this.min, distributionWidgetXAxis.min)
        && Objects.equals(this.numBuckets, distributionWidgetXAxis.numBuckets)
        && Objects.equals(this.scale, distributionWidgetXAxis.scale)
        && Objects.equals(this.additionalProperties, distributionWidgetXAxis.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeZero, max, min, numBuckets, scale, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributionWidgetXAxis {\n");
    sb.append("    includeZero: ").append(toIndentedString(includeZero)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    numBuckets: ").append(toIndentedString(numBuckets)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
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
