/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Projection for the DDSQL host map request. Maps dataset columns to map dimensions: <code>node
 * </code> identifies the entity, repeated <code>group</code> entries define the grouping hierarchy
 * (outermost first), and <code>fill</code>/<code>size</code> drive the tile color and size.
 */
@JsonPropertyOrder({
  HostMapWidgetProjection.JSON_PROPERTY_DIMENSIONS,
  HostMapWidgetProjection.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HostMapWidgetProjection {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DIMENSIONS = "dimensions";
  private List<HostMapWidgetProjectionDimensionMapping> dimensions = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private HostMapWidgetProjectionType type;

  public HostMapWidgetProjection() {}

  @JsonCreator
  public HostMapWidgetProjection(
      @JsonProperty(required = true, value = JSON_PROPERTY_DIMENSIONS)
          List<HostMapWidgetProjectionDimensionMapping> dimensions,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) HostMapWidgetProjectionType type) {
    this.dimensions = dimensions;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public HostMapWidgetProjection dimensions(
      List<HostMapWidgetProjectionDimensionMapping> dimensions) {
    this.dimensions = dimensions;
    for (HostMapWidgetProjectionDimensionMapping item : dimensions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public HostMapWidgetProjection addDimensionsItem(
      HostMapWidgetProjectionDimensionMapping dimensionsItem) {
    this.dimensions.add(dimensionsItem);
    this.unparsed |= dimensionsItem.unparsed;
    return this;
  }

  /**
   * List of column-to-dimension mappings for the projection.
   *
   * @return dimensions
   */
  @JsonProperty(JSON_PROPERTY_DIMENSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<HostMapWidgetProjectionDimensionMapping> getDimensions() {
    return dimensions;
  }

  public void setDimensions(List<HostMapWidgetProjectionDimensionMapping> dimensions) {
    this.dimensions = dimensions;
  }

  public HostMapWidgetProjection type(HostMapWidgetProjectionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the host map projection.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public HostMapWidgetProjectionType getType() {
    return type;
  }

  public void setType(HostMapWidgetProjectionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return HostMapWidgetProjection
   */
  @JsonAnySetter
  public HostMapWidgetProjection putAdditionalProperty(String key, Object value) {
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

  /** Return true if this HostMapWidgetProjection object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostMapWidgetProjection hostMapWidgetProjection = (HostMapWidgetProjection) o;
    return Objects.equals(this.dimensions, hostMapWidgetProjection.dimensions)
        && Objects.equals(this.type, hostMapWidgetProjection.type)
        && Objects.equals(this.additionalProperties, hostMapWidgetProjection.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensions, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostMapWidgetProjection {\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
