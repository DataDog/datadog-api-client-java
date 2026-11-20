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
  HeatmapBackendDefinitionYaxis.JSON_PROPERTY_INCLUDE_ZERO,
  HeatmapBackendDefinitionYaxis.JSON_PROPERTY_LABEL,
  HeatmapBackendDefinitionYaxis.JSON_PROPERTY_MAX,
  HeatmapBackendDefinitionYaxis.JSON_PROPERTY_MIN,
  HeatmapBackendDefinitionYaxis.JSON_PROPERTY_NUM_BUCKETS,
  HeatmapBackendDefinitionYaxis.JSON_PROPERTY_SCALE,
  HeatmapBackendDefinitionYaxis.JSON_PROPERTY_SHOW_UNIT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HeatmapBackendDefinitionYaxis {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INCLUDE_ZERO = "include_zero";
  private Boolean includeZero;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_MAX = "max";
  private String max;

  public static final String JSON_PROPERTY_MIN = "min";
  private String min;

  public static final String JSON_PROPERTY_NUM_BUCKETS = "num_buckets";
  private Double numBuckets;

  public static final String JSON_PROPERTY_SCALE = "scale";
  private ScaleType scale;

  public static final String JSON_PROPERTY_SHOW_UNIT = "show_unit";
  private Boolean showUnit;

  public HeatmapBackendDefinitionYaxis includeZero(Boolean includeZero) {
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

  public HeatmapBackendDefinitionYaxis label(String label) {
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

  public HeatmapBackendDefinitionYaxis max(String max) {
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

  public HeatmapBackendDefinitionYaxis min(String min) {
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

  public HeatmapBackendDefinitionYaxis numBuckets(Double numBuckets) {
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

  public HeatmapBackendDefinitionYaxis scale(ScaleType scale) {
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

  public HeatmapBackendDefinitionYaxis showUnit(Boolean showUnit) {
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

  /** Return true if this HeatmapBackendDefinitionYaxis object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeatmapBackendDefinitionYaxis heatmapBackendDefinitionYaxis = (HeatmapBackendDefinitionYaxis) o;
    return Objects.equals(this.includeZero, heatmapBackendDefinitionYaxis.includeZero)
        && Objects.equals(this.label, heatmapBackendDefinitionYaxis.label)
        && Objects.equals(this.max, heatmapBackendDefinitionYaxis.max)
        && Objects.equals(this.min, heatmapBackendDefinitionYaxis.min)
        && Objects.equals(this.numBuckets, heatmapBackendDefinitionYaxis.numBuckets)
        && Objects.equals(this.scale, heatmapBackendDefinitionYaxis.scale)
        && Objects.equals(this.showUnit, heatmapBackendDefinitionYaxis.showUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeZero, label, max, min, numBuckets, scale, showUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeatmapBackendDefinitionYaxis {\n");
    sb.append("    includeZero: ").append(toIndentedString(includeZero)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    numBuckets: ").append(toIndentedString(numBuckets)).append("\n");
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
