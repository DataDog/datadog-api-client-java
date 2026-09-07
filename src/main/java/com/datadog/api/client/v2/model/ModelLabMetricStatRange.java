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

/** The range of values for a specific metric statistic. */
@JsonPropertyOrder({
  ModelLabMetricStatRange.JSON_PROPERTY_MAX,
  ModelLabMetricStatRange.JSON_PROPERTY_MIN,
  ModelLabMetricStatRange.JSON_PROPERTY_STAT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ModelLabMetricStatRange {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MAX = "max";
  private Double max;

  public static final String JSON_PROPERTY_MIN = "min";
  private Double min;

  public static final String JSON_PROPERTY_STAT = "stat";
  private String stat;

  public ModelLabMetricStatRange() {}

  @JsonCreator
  public ModelLabMetricStatRange(
      @JsonProperty(required = true, value = JSON_PROPERTY_MAX) Double max,
      @JsonProperty(required = true, value = JSON_PROPERTY_MIN) Double min,
      @JsonProperty(required = true, value = JSON_PROPERTY_STAT) String stat) {
    this.max = max;
    this.min = min;
    this.stat = stat;
  }

  public ModelLabMetricStatRange max(Double max) {
    this.max = max;
    return this;
  }

  /**
   * The maximum value of the statistic.
   *
   * @return max
   */
  @JsonProperty(JSON_PROPERTY_MAX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getMax() {
    return max;
  }

  public void setMax(Double max) {
    this.max = max;
  }

  public ModelLabMetricStatRange min(Double min) {
    this.min = min;
    return this;
  }

  /**
   * The minimum value of the statistic.
   *
   * @return min
   */
  @JsonProperty(JSON_PROPERTY_MIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getMin() {
    return min;
  }

  public void setMin(Double min) {
    this.min = min;
  }

  public ModelLabMetricStatRange stat(String stat) {
    this.stat = stat;
    return this;
  }

  /**
   * The metric statistic name.
   *
   * @return stat
   */
  @JsonProperty(JSON_PROPERTY_STAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getStat() {
    return stat;
  }

  public void setStat(String stat) {
    this.stat = stat;
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
   * @return ModelLabMetricStatRange
   */
  @JsonAnySetter
  public ModelLabMetricStatRange putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ModelLabMetricStatRange object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelLabMetricStatRange modelLabMetricStatRange = (ModelLabMetricStatRange) o;
    return Objects.equals(this.max, modelLabMetricStatRange.max)
        && Objects.equals(this.min, modelLabMetricStatRange.min)
        && Objects.equals(this.stat, modelLabMetricStatRange.stat)
        && Objects.equals(this.additionalProperties, modelLabMetricStatRange.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(max, min, stat, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelLabMetricStatRange {\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
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
