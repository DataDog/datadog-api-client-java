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

/** Y Axis controls for the distribution widget. */
@JsonPropertyOrder({
  DistributionWidgetYAxis.JSON_PROPERTY_INCLUDE_ZERO,
  DistributionWidgetYAxis.JSON_PROPERTY_LABEL,
  DistributionWidgetYAxis.JSON_PROPERTY_MAX,
  DistributionWidgetYAxis.JSON_PROPERTY_MIN,
  DistributionWidgetYAxis.JSON_PROPERTY_SCALE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DistributionWidgetYAxis {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INCLUDE_ZERO = "include_zero";
  private Boolean includeZero;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_MAX = "max";
  private String max = "auto";

  public static final String JSON_PROPERTY_MIN = "min";
  private String min = "auto";

  public static final String JSON_PROPERTY_SCALE = "scale";
  private String scale = "linear";

  public DistributionWidgetYAxis includeZero(Boolean includeZero) {
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

  public DistributionWidgetYAxis label(String label) {
    this.label = label;
    return this;
  }

  /**
   * The label of the axis to display on the graph.
   *
   * @return label
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public DistributionWidgetYAxis max(String max) {
    this.max = max;
    return this;
  }

  /**
   * Specifies the maximum value to show on the y-axis. It takes a number, or auto for default
   * behavior.
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

  public DistributionWidgetYAxis min(String min) {
    this.min = min;
    return this;
  }

  /**
   * Specifies minimum value to show on the y-axis. It takes a number, or auto for default behavior.
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

  public DistributionWidgetYAxis scale(String scale) {
    this.scale = scale;
    return this;
  }

  /**
   * Specifies the scale type. Possible values are <code>linear</code> or <code>log</code>.
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

  /** Return true if this DistributionWidgetYAxis object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributionWidgetYAxis distributionWidgetYAxis = (DistributionWidgetYAxis) o;
    return Objects.equals(this.includeZero, distributionWidgetYAxis.includeZero)
        && Objects.equals(this.label, distributionWidgetYAxis.label)
        && Objects.equals(this.max, distributionWidgetYAxis.max)
        && Objects.equals(this.min, distributionWidgetYAxis.min)
        && Objects.equals(this.scale, distributionWidgetYAxis.scale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeZero, label, max, min, scale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributionWidgetYAxis {\n");
    sb.append("    includeZero: ").append(toIndentedString(includeZero)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
