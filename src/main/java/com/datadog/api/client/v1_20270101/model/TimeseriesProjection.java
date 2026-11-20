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
  TimeseriesProjection.JSON_PROPERTY_DIMENSIONS,
  TimeseriesProjection.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimeseriesProjection {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DIMENSIONS = "dimensions";
  private List<TimeseriesProjectionDimensionsItems> dimensions = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private TimeseriesProjectionType type;

  public TimeseriesProjection() {}

  @JsonCreator
  public TimeseriesProjection(
      @JsonProperty(required = true, value = JSON_PROPERTY_DIMENSIONS)
          List<TimeseriesProjectionDimensionsItems> dimensions,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) TimeseriesProjectionType type) {
    this.dimensions = dimensions;
    for (TimeseriesProjectionDimensionsItems item : dimensions) {
      this.unparsed |= item.unparsed;
    }
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public TimeseriesProjection dimensions(List<TimeseriesProjectionDimensionsItems> dimensions) {
    this.dimensions = dimensions;
    for (TimeseriesProjectionDimensionsItems item : dimensions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TimeseriesProjection addDimensionsItem(
      TimeseriesProjectionDimensionsItems dimensionsItem) {
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
  public List<TimeseriesProjectionDimensionsItems> getDimensions() {
    return dimensions;
  }

  public void setDimensions(List<TimeseriesProjectionDimensionsItems> dimensions) {
    this.dimensions = dimensions;
    if (dimensions != null) {
      for (TimeseriesProjectionDimensionsItems item : dimensions) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public TimeseriesProjection type(TimeseriesProjectionType type) {
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
  public TimeseriesProjectionType getType() {
    return type;
  }

  public void setType(TimeseriesProjectionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this TimeseriesProjection object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesProjection timeseriesProjection = (TimeseriesProjection) o;
    return Objects.equals(this.dimensions, timeseriesProjection.dimensions)
        && Objects.equals(this.type, timeseriesProjection.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensions, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesProjection {\n");
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
