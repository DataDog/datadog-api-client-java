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
  BackendDistributionYAxis.JSON_PROPERTY_INCLUDE_ZERO,
  BackendDistributionYAxis.JSON_PROPERTY_LABEL,
  BackendDistributionYAxis.JSON_PROPERTY_MAX,
  BackendDistributionYAxis.JSON_PROPERTY_MIN,
  BackendDistributionYAxis.JSON_PROPERTY_SCALE,
  BackendDistributionYAxis.JSON_PROPERTY_SHOW_UNIT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class BackendDistributionYAxis {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INCLUDE_ZERO = "include_zero";
  private Boolean includeZero;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_MAX = "max";
  private com.datadog.api.client.v1.model.BackendDistributionYAxis20270101Max max;

  public static final String JSON_PROPERTY_MIN = "min";
  private com.datadog.api.client.v1.model.BackendDistributionYAxis20270101Min min;

  public static final String JSON_PROPERTY_SCALE = "scale";
  private BackendDistributionYAxisScale scale;

  public static final String JSON_PROPERTY_SHOW_UNIT = "show_unit";
  private Boolean showUnit;

  public BackendDistributionYAxis includeZero(Boolean includeZero) {
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

  public BackendDistributionYAxis label(String label) {
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

  public BackendDistributionYAxis max(
      com.datadog.api.client.v1.model.BackendDistributionYAxis20270101Max max) {
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
  public com.datadog.api.client.v1.model.BackendDistributionYAxis20270101Max getMax() {
    return max;
  }

  public void setMax(com.datadog.api.client.v1.model.BackendDistributionYAxis20270101Max max) {
    this.max = max;
    if (max != null) {
      this.unparsed |= max.unparsed;
    }
  }

  public BackendDistributionYAxis min(
      com.datadog.api.client.v1.model.BackendDistributionYAxis20270101Min min) {
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
  public com.datadog.api.client.v1.model.BackendDistributionYAxis20270101Min getMin() {
    return min;
  }

  public void setMin(com.datadog.api.client.v1.model.BackendDistributionYAxis20270101Min min) {
    this.min = min;
    if (min != null) {
      this.unparsed |= min.unparsed;
    }
  }

  public BackendDistributionYAxis scale(BackendDistributionYAxisScale scale) {
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
  public BackendDistributionYAxisScale getScale() {
    return scale;
  }

  public void setScale(BackendDistributionYAxisScale scale) {
    if (!scale.isValid()) {
      this.unparsed = true;
    }
    this.scale = scale;
  }

  public BackendDistributionYAxis showUnit(Boolean showUnit) {
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

  /** Return true if this BackendDistributionYAxis object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackendDistributionYAxis backendDistributionYAxis = (BackendDistributionYAxis) o;
    return Objects.equals(this.includeZero, backendDistributionYAxis.includeZero)
        && Objects.equals(this.label, backendDistributionYAxis.label)
        && Objects.equals(this.max, backendDistributionYAxis.max)
        && Objects.equals(this.min, backendDistributionYAxis.min)
        && Objects.equals(this.scale, backendDistributionYAxis.scale)
        && Objects.equals(this.showUnit, backendDistributionYAxis.showUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeZero, label, max, min, scale, showUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackendDistributionYAxis {\n");
    sb.append("    includeZero: ").append(toIndentedString(includeZero)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    showUnit: ").append(toIndentedString(showUnit)).append("\n");
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
