/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  ScatterplotProjection.JSON_PROPERTY_DIMENSIONS,
  ScatterplotProjection.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScatterplotProjection {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DIMENSIONS = "dimensions";
  private List<ScatterplotProjectionDimensionsItems> dimensions = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private ScatterplotProjectionType type;

  public ScatterplotProjection() {}

  @JsonCreator
  public ScatterplotProjection(
      @JsonProperty(required = true, value = JSON_PROPERTY_DIMENSIONS)
          List<ScatterplotProjectionDimensionsItems> dimensions,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) ScatterplotProjectionType type) {
    this.dimensions = dimensions;
    for (ScatterplotProjectionDimensionsItems item : dimensions) {
      this.unparsed |= item.unparsed;
    }
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ScatterplotProjection dimensions(List<ScatterplotProjectionDimensionsItems> dimensions) {
    this.dimensions = dimensions;
    for (ScatterplotProjectionDimensionsItems item : dimensions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ScatterplotProjection addDimensionsItem(
      ScatterplotProjectionDimensionsItems dimensionsItem) {
    this.dimensions.add(dimensionsItem);
    this.unparsed |= dimensionsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return dimensions
   */
  @JsonProperty(JSON_PROPERTY_DIMENSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ScatterplotProjectionDimensionsItems> getDimensions() {
    return dimensions;
  }

  public void setDimensions(List<ScatterplotProjectionDimensionsItems> dimensions) {
    this.dimensions = dimensions;
    if (dimensions != null) {
      for (ScatterplotProjectionDimensionsItems item : dimensions) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ScatterplotProjection type(ScatterplotProjectionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ScatterplotProjectionType getType() {
    return type;
  }

  public void setType(ScatterplotProjectionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this ScatterplotProjection object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScatterplotProjection scatterplotProjection = (ScatterplotProjection) o;
    return Objects.equals(this.dimensions, scatterplotProjection.dimensions)
        && Objects.equals(this.type, scatterplotProjection.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensions, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScatterplotProjection {\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
