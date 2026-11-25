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
  GeomapPointsProjection.JSON_PROPERTY_DIMENSIONS,
  GeomapPointsProjection.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GeomapPointsProjection {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DIMENSIONS = "dimensions";
  private List<GeomapPointsProjectionDimensionsItems> dimensions = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private GeomapPointsProjectionType type;

  public GeomapPointsProjection() {}

  @JsonCreator
  public GeomapPointsProjection(
      @JsonProperty(required = true, value = JSON_PROPERTY_DIMENSIONS)
          List<GeomapPointsProjectionDimensionsItems> dimensions,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) GeomapPointsProjectionType type) {
    this.dimensions = dimensions;
    for (GeomapPointsProjectionDimensionsItems item : dimensions) {
      this.unparsed |= item.unparsed;
    }
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public GeomapPointsProjection dimensions(List<GeomapPointsProjectionDimensionsItems> dimensions) {
    this.dimensions = dimensions;
    for (GeomapPointsProjectionDimensionsItems item : dimensions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public GeomapPointsProjection addDimensionsItem(
      GeomapPointsProjectionDimensionsItems dimensionsItem) {
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
  public List<GeomapPointsProjectionDimensionsItems> getDimensions() {
    return dimensions;
  }

  public void setDimensions(List<GeomapPointsProjectionDimensionsItems> dimensions) {
    this.dimensions = dimensions;
    if (dimensions != null) {
      for (GeomapPointsProjectionDimensionsItems item : dimensions) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public GeomapPointsProjection type(GeomapPointsProjectionType type) {
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
  public GeomapPointsProjectionType getType() {
    return type;
  }

  public void setType(GeomapPointsProjectionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this GeomapPointsProjection object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeomapPointsProjection geomapPointsProjection = (GeomapPointsProjection) o;
    return Objects.equals(this.dimensions, geomapPointsProjection.dimensions)
        && Objects.equals(this.type, geomapPointsProjection.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensions, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeomapPointsProjection {\n");
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
