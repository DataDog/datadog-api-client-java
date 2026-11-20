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
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  CustomTopologyMapProjectionDimensionsItems.JSON_PROPERTY_COLUMN,
  CustomTopologyMapProjectionDimensionsItems.JSON_PROPERTY_DIMENSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomTopologyMapProjectionDimensionsItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMN = "column";
  private String column;

  public static final String JSON_PROPERTY_DIMENSION = "dimension";
  private CustomTopologyMapNodeDimension dimension;

  public CustomTopologyMapProjectionDimensionsItems() {}

  @JsonCreator
  public CustomTopologyMapProjectionDimensionsItems(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMN) String column,
      @JsonProperty(required = true, value = JSON_PROPERTY_DIMENSION)
          CustomTopologyMapNodeDimension dimension) {
    this.column = column;
    this.dimension = dimension;
    this.unparsed |= dimension.unparsed;
  }

  public CustomTopologyMapProjectionDimensionsItems column(String column) {
    this.column = column;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return column
   */
  @JsonProperty(JSON_PROPERTY_COLUMN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getColumn() {
    return column;
  }

  public void setColumn(String column) {
    this.column = column;
  }

  public CustomTopologyMapProjectionDimensionsItems dimension(
      CustomTopologyMapNodeDimension dimension) {
    this.dimension = dimension;
    this.unparsed |= dimension.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return dimension
   */
  @JsonProperty(JSON_PROPERTY_DIMENSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CustomTopologyMapNodeDimension getDimension() {
    return dimension;
  }

  public void setDimension(CustomTopologyMapNodeDimension dimension) {
    this.dimension = dimension;
    if (dimension != null) {
      this.unparsed |= dimension.unparsed;
    }
  }

  /** Return true if this CustomTopologyMapProjectionDimensionsItems object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomTopologyMapProjectionDimensionsItems customTopologyMapProjectionDimensionsItems =
        (CustomTopologyMapProjectionDimensionsItems) o;
    return Objects.equals(this.column, customTopologyMapProjectionDimensionsItems.column)
        && Objects.equals(this.dimension, customTopologyMapProjectionDimensionsItems.dimension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column, dimension);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomTopologyMapProjectionDimensionsItems {\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
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
