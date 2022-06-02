/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** X Axis controls for the distribution widget. */
@JsonPropertyOrder({
  DistributionWidgetXAxis.JSON_PROPERTY_INCLUDE_ZERO,
  DistributionWidgetXAxis.JSON_PROPERTY_MAX,
  DistributionWidgetXAxis.JSON_PROPERTY_MIN,
  DistributionWidgetXAxis.JSON_PROPERTY_SCALE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DistributionWidgetXAxis {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INCLUDE_ZERO = "include_zero";
  private Boolean includeZero;

  public static final String JSON_PROPERTY_MAX = "max";
  private String max = "auto";

  public static final String JSON_PROPERTY_MIN = "min";
  private String min = "auto";

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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMin() {
    return min;
  }

  public void setMin(String min) {
    this.min = min;
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
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getScale() {
    return scale;
  }

  public void setScale(String scale) {
    this.scale = scale;
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
        && Objects.equals(this.scale, distributionWidgetXAxis.scale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeZero, max, min, scale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributionWidgetXAxis {\n");
    sb.append("    includeZero: ").append(toIndentedString(includeZero)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("}");
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
