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
  BackendTimeseriesAxisDefinition.JSON_PROPERTY_INCLUDE_ZERO,
  BackendTimeseriesAxisDefinition.JSON_PROPERTY_LABEL,
  BackendTimeseriesAxisDefinition.JSON_PROPERTY_MAX,
  BackendTimeseriesAxisDefinition.JSON_PROPERTY_MIN,
  BackendTimeseriesAxisDefinition.JSON_PROPERTY_SCALE,
  BackendTimeseriesAxisDefinition.JSON_PROPERTY_SHOW_UNIT,
  BackendTimeseriesAxisDefinition.JSON_PROPERTY_STACK
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class BackendTimeseriesAxisDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INCLUDE_ZERO = "include_zero";
  private Boolean includeZero;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_MAX = "max";
  private String max;

  public static final String JSON_PROPERTY_MIN = "min";
  private String min;

  public static final String JSON_PROPERTY_SCALE = "scale";
  private ScaleType scale;

  public static final String JSON_PROPERTY_SHOW_UNIT = "show_unit";
  private Boolean showUnit;

  public static final String JSON_PROPERTY_STACK = "stack";
  private TimeseriesStackMode stack;

  public BackendTimeseriesAxisDefinition includeZero(Boolean includeZero) {
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

  public BackendTimeseriesAxisDefinition label(String label) {
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

  public BackendTimeseriesAxisDefinition max(String max) {
    this.max = max;
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
  public String getMax() {
    return max;
  }

  public void setMax(String max) {
    this.max = max;
  }

  public BackendTimeseriesAxisDefinition min(String min) {
    this.min = min;
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
  public String getMin() {
    return min;
  }

  public void setMin(String min) {
    this.min = min;
  }

  public BackendTimeseriesAxisDefinition scale(ScaleType scale) {
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

  public BackendTimeseriesAxisDefinition showUnit(Boolean showUnit) {
    this.showUnit = showUnit;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return showUnit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowUnit() {
    return showUnit;
  }

  public void setShowUnit(Boolean showUnit) {
    this.showUnit = showUnit;
  }

  public BackendTimeseriesAxisDefinition stack(TimeseriesStackMode stack) {
    this.stack = stack;
    this.unparsed |= !stack.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return stack
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TimeseriesStackMode getStack() {
    return stack;
  }

  public void setStack(TimeseriesStackMode stack) {
    if (!stack.isValid()) {
      this.unparsed = true;
    }
    this.stack = stack;
  }

  /** Return true if this BackendTimeseriesAxisDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackendTimeseriesAxisDefinition backendTimeseriesAxisDefinition =
        (BackendTimeseriesAxisDefinition) o;
    return Objects.equals(this.includeZero, backendTimeseriesAxisDefinition.includeZero)
        && Objects.equals(this.label, backendTimeseriesAxisDefinition.label)
        && Objects.equals(this.max, backendTimeseriesAxisDefinition.max)
        && Objects.equals(this.min, backendTimeseriesAxisDefinition.min)
        && Objects.equals(this.scale, backendTimeseriesAxisDefinition.scale)
        && Objects.equals(this.showUnit, backendTimeseriesAxisDefinition.showUnit)
        && Objects.equals(this.stack, backendTimeseriesAxisDefinition.stack);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeZero, label, max, min, scale, showUnit, stack);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackendTimeseriesAxisDefinition {\n");
    sb.append("    includeZero: ").append(toIndentedString(includeZero)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    showUnit: ").append(toIndentedString(showUnit)).append("\n");
    sb.append("    stack: ").append(toIndentedString(stack)).append("\n");
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
