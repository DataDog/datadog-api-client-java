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
  Axis.JSON_PROPERTY_INCLUDE_ZERO,
  Axis.JSON_PROPERTY_LABEL,
  Axis.JSON_PROPERTY_MAX,
  Axis.JSON_PROPERTY_MIN,
  Axis.JSON_PROPERTY_SCALE,
  Axis.JSON_PROPERTY_UNITS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class Axis {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INCLUDE_ZERO = "include_zero";
  private Boolean includeZero;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_MAX = "max";
  private AxisBound max;

  public static final String JSON_PROPERTY_MIN = "min";
  private AxisBound min;

  public static final String JSON_PROPERTY_SCALE = "scale";
  private ScaleType scale;

  public static final String JSON_PROPERTY_UNITS = "units";
  private Boolean units;

  public Axis includeZero(Boolean includeZero) {
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

  public Axis label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return label
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Axis max(AxisBound max) {
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

  public Axis min(AxisBound min) {
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

  public Axis scale(ScaleType scale) {
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
  public ScaleType getScale() {
    return scale;
  }

  public void setScale(ScaleType scale) {
    if (!scale.isValid()) {
      this.unparsed = true;
    }
    this.scale = scale;
  }

  public Axis units(Boolean units) {
    this.units = units;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return units
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getUnits() {
    return units;
  }

  public void setUnits(Boolean units) {
    this.units = units;
  }

  /** Return true if this Axis object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Axis axis = (Axis) o;
    return Objects.equals(this.includeZero, axis.includeZero)
        && Objects.equals(this.label, axis.label)
        && Objects.equals(this.max, axis.max)
        && Objects.equals(this.min, axis.min)
        && Objects.equals(this.scale, axis.scale)
        && Objects.equals(this.units, axis.units);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeZero, label, max, min, scale, units);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Axis {\n");
    sb.append("    includeZero: ").append(toIndentedString(includeZero)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
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
