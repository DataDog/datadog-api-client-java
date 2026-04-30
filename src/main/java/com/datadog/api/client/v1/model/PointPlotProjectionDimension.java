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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Dimension mapping for the point plot projection. */
@JsonPropertyOrder({
  PointPlotProjectionDimension.JSON_PROPERTY_ALIAS,
  PointPlotProjectionDimension.JSON_PROPERTY_COLUMN,
  PointPlotProjectionDimension.JSON_PROPERTY_DIMENSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PointPlotProjectionDimension {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_COLUMN = "column";
  private String column;

  public static final String JSON_PROPERTY_DIMENSION = "dimension";
  private PointPlotDimension dimension;

  public PointPlotProjectionDimension() {}

  @JsonCreator
  public PointPlotProjectionDimension(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMN) String column,
      @JsonProperty(required = true, value = JSON_PROPERTY_DIMENSION)
          PointPlotDimension dimension) {
    this.column = column;
    this.dimension = dimension;
    this.unparsed |= !dimension.isValid();
  }

  public PointPlotProjectionDimension alias(String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * Alias for the column.
   *
   * @return alias
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public PointPlotProjectionDimension column(String column) {
    this.column = column;
    return this;
  }

  /**
   * Source column name from the dataset.
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

  public PointPlotProjectionDimension dimension(PointPlotDimension dimension) {
    this.dimension = dimension;
    this.unparsed |= !dimension.isValid();
    return this;
  }

  /**
   * Dimension of the point plot.
   *
   * @return dimension
   */
  @JsonProperty(JSON_PROPERTY_DIMENSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public PointPlotDimension getDimension() {
    return dimension;
  }

  public void setDimension(PointPlotDimension dimension) {
    if (!dimension.isValid()) {
      this.unparsed = true;
    }
    this.dimension = dimension;
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
   * @return PointPlotProjectionDimension
   */
  @JsonAnySetter
  public PointPlotProjectionDimension putAdditionalProperty(String key, Object value) {
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

  /** Return true if this PointPlotProjectionDimension object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointPlotProjectionDimension pointPlotProjectionDimension = (PointPlotProjectionDimension) o;
    return Objects.equals(this.alias, pointPlotProjectionDimension.alias)
        && Objects.equals(this.column, pointPlotProjectionDimension.column)
        && Objects.equals(this.dimension, pointPlotProjectionDimension.dimension)
        && Objects.equals(
            this.additionalProperties, pointPlotProjectionDimension.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, column, dimension, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointPlotProjectionDimension {\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
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
