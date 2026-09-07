/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Y Axis controls for the distribution widget.</p>
 */
@JsonPropertyOrder({
  DistributionWidgetYAxis.JSON_PROPERTY_INCLUDE_ZERO,
  DistributionWidgetYAxis.JSON_PROPERTY_LABEL,
  DistributionWidgetYAxis.JSON_PROPERTY_MAX,
  DistributionWidgetYAxis.JSON_PROPERTY_MIN,
  DistributionWidgetYAxis.JSON_PROPERTY_SCALE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DistributionWidgetYAxis {
  @JsonIgnore
  public boolean unparsed = false;
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
   * <p>True includes zero.</p>
   * @return includeZero
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INCLUDE_ZERO)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>The label of the axis to display on the graph.</p>
   * @return label
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LABEL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Specifies the maximum value to show on the y-axis. It takes a number, or auto for default behavior.</p>
   * @return max
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MAX)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Specifies minimum value to show on the y-axis. It takes a number, or auto for default behavior.</p>
   * @return min
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MIN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Specifies the scale type. Possible values are <code>linear</code> or <code>log</code>.</p>
   * @return scale
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SCALE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getScale() {
        return scale;
      }
  public void setScale(String scale) {
    this.scale = scale;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return DistributionWidgetYAxis
   */
  @JsonAnySetter
  public DistributionWidgetYAxis putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this DistributionWidgetYAxis object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributionWidgetYAxis distributionWidgetYAxis = (DistributionWidgetYAxis) o;
    return Objects.equals(this.includeZero, distributionWidgetYAxis.includeZero) && Objects.equals(this.label, distributionWidgetYAxis.label) && Objects.equals(this.max, distributionWidgetYAxis.max) && Objects.equals(this.min, distributionWidgetYAxis.min) && Objects.equals(this.scale, distributionWidgetYAxis.scale) && Objects.equals(this.additionalProperties, distributionWidgetYAxis.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(includeZero,label,max,min,scale, additionalProperties);
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
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
