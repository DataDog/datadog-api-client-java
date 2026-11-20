/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  DistributionXAxis.JSON_PROPERTY_INCLUDE_ZERO,
  DistributionXAxis.JSON_PROPERTY_MAX,
  DistributionXAxis.JSON_PROPERTY_MIN,
  DistributionXAxis.JSON_PROPERTY_NUM_BUCKETS,
  DistributionXAxis.JSON_PROPERTY_SCALE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DistributionXAxis {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INCLUDE_ZERO = "include_zero";
  private Boolean includeZero;

  public static final String JSON_PROPERTY_MAX = "max";
  private AxisBound max;

  public static final String JSON_PROPERTY_MIN = "min";
  private AxisBound min;

  public static final String JSON_PROPERTY_NUM_BUCKETS = "num_buckets";
  private Double numBuckets;

  public static final String JSON_PROPERTY_SCALE = "scale";
  private DistributionScaleType scale;

  public DistributionXAxis includeZero(Boolean includeZero) {
    this.includeZero = includeZero;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public DistributionXAxis max(AxisBound max) {
    this.max = max;
    this.unparsed |= max.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return max
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AxisBound getMax() {
    return max;
  }

  public void setMax(AxisBound max) {
    this.max = max;
    if (max != null) {
      this.unparsed |= max.unparsed;
    }
  }

  public DistributionXAxis min(AxisBound min) {
    this.min = min;
    this.unparsed |= min.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return min
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AxisBound getMin() {
    return min;
  }

  public void setMin(AxisBound min) {
    this.min = min;
    if (min != null) {
      this.unparsed |= min.unparsed;
    }
  }

  public DistributionXAxis numBuckets(Double numBuckets) {
    this.numBuckets = numBuckets;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return numBuckets
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUM_BUCKETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNumBuckets() {
    return numBuckets;
  }

  public void setNumBuckets(Double numBuckets) {
    this.numBuckets = numBuckets;
  }

  public DistributionXAxis scale(DistributionScaleType scale) {
    this.scale = scale;
    this.unparsed |= !scale.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return scale
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DistributionScaleType getScale() {
    return scale;
  }

  public void setScale(DistributionScaleType scale) {
    if (!scale.isValid()) {
      this.unparsed = true;
    }
    this.scale = scale;
  }

  /** Return true if this DistributionXAxis object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributionXAxis distributionXAxis = (DistributionXAxis) o;
    return Objects.equals(this.includeZero, distributionXAxis.includeZero)
        && Objects.equals(this.max, distributionXAxis.max)
        && Objects.equals(this.min, distributionXAxis.min)
        && Objects.equals(this.numBuckets, distributionXAxis.numBuckets)
        && Objects.equals(this.scale, distributionXAxis.scale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeZero, max, min, numBuckets, scale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributionXAxis {\n");
    sb.append("    includeZero: ").append(toIndentedString(includeZero)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    numBuckets: ").append(toIndentedString(numBuckets)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
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
