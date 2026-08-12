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

/** The projection configuration for a scatterplot data projection request. */
@JsonPropertyOrder({
  ScatterplotDataProjectionProjection.JSON_PROPERTY_DIMENSIONS,
  ScatterplotDataProjectionProjection.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScatterplotDataProjectionProjection {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DIMENSIONS = "dimensions";
  private List<ScatterplotDataProjectionDimension> dimensions = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private ScatterplotDataProjectionProjectionType type;

  public ScatterplotDataProjectionProjection() {}

  @JsonCreator
  public ScatterplotDataProjectionProjection(
      @JsonProperty(required = true, value = JSON_PROPERTY_DIMENSIONS)
          List<ScatterplotDataProjectionDimension> dimensions,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ScatterplotDataProjectionProjectionType type) {
    this.dimensions = dimensions;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ScatterplotDataProjectionProjection dimensions(
      List<ScatterplotDataProjectionDimension> dimensions) {
    this.dimensions = dimensions;
    for (ScatterplotDataProjectionDimension item : dimensions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ScatterplotDataProjectionProjection addDimensionsItem(
      ScatterplotDataProjectionDimension dimensionsItem) {
    this.dimensions.add(dimensionsItem);
    this.unparsed |= dimensionsItem.unparsed;
    return this;
  }

  /**
   * Dimension mappings for the scatterplot axes.
   *
   * @return dimensions
   */
  @JsonProperty(JSON_PROPERTY_DIMENSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ScatterplotDataProjectionDimension> getDimensions() {
    return dimensions;
  }

  public void setDimensions(List<ScatterplotDataProjectionDimension> dimensions) {
    this.dimensions = dimensions;
  }

  public ScatterplotDataProjectionProjection type(ScatterplotDataProjectionProjectionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of the scatterplot data projection.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ScatterplotDataProjectionProjectionType getType() {
    return type;
  }

  public void setType(ScatterplotDataProjectionProjectionType type) {
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
   * @return ScatterplotDataProjectionProjection
   */
  @JsonAnySetter
  public ScatterplotDataProjectionProjection putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ScatterplotDataProjectionProjection object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScatterplotDataProjectionProjection scatterplotDataProjectionProjection =
        (ScatterplotDataProjectionProjection) o;
    return Objects.equals(this.dimensions, scatterplotDataProjectionProjection.dimensions)
        && Objects.equals(this.type, scatterplotDataProjectionProjection.type)
        && Objects.equals(
            this.additionalProperties, scatterplotDataProjectionProjection.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensions, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScatterplotDataProjectionProjection {\n");
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
