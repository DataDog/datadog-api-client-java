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

/** A single dimension mapping for a scatterplot data projection. */
@JsonPropertyOrder({
  ScatterplotDataProjectionDimension.JSON_PROPERTY_ALIAS,
  ScatterplotDataProjectionDimension.JSON_PROPERTY_COLUMN,
  ScatterplotDataProjectionDimension.JSON_PROPERTY_DIMENSION,
  ScatterplotDataProjectionDimension.JSON_PROPERTY_NUMBER_FORMAT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScatterplotDataProjectionDimension {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_COLUMN = "column";
  private String column;

  public static final String JSON_PROPERTY_DIMENSION = "dimension";
  private ScatterplotDimension dimension;

  public static final String JSON_PROPERTY_NUMBER_FORMAT = "number_format";
  private WidgetNumberFormat numberFormat;

  public ScatterplotDataProjectionDimension() {}

  @JsonCreator
  public ScatterplotDataProjectionDimension(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMN) String column,
      @JsonProperty(required = true, value = JSON_PROPERTY_DIMENSION)
          ScatterplotDimension dimension) {
    this.column = column;
    this.dimension = dimension;
    this.unparsed |= !dimension.isValid();
  }

  public ScatterplotDataProjectionDimension alias(String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * Display alias for the dimension.
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

  public ScatterplotDataProjectionDimension column(String column) {
    this.column = column;
    return this;
  }

  /**
   * The column name from the data source.
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

  public ScatterplotDataProjectionDimension dimension(ScatterplotDimension dimension) {
    this.dimension = dimension;
    this.unparsed |= !dimension.isValid();
    return this;
  }

  /**
   * Dimension of the Scatterplot.
   *
   * @return dimension
   */
  @JsonProperty(JSON_PROPERTY_DIMENSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ScatterplotDimension getDimension() {
    return dimension;
  }

  public void setDimension(ScatterplotDimension dimension) {
    if (!dimension.isValid()) {
      this.unparsed = true;
    }
    this.dimension = dimension;
  }

  public ScatterplotDataProjectionDimension numberFormat(WidgetNumberFormat numberFormat) {
    this.numberFormat = numberFormat;
    this.unparsed |= numberFormat.unparsed;
    return this;
  }

  /**
   * Number format options for the widget.
   *
   * @return numberFormat
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetNumberFormat getNumberFormat() {
    return numberFormat;
  }

  public void setNumberFormat(WidgetNumberFormat numberFormat) {
    this.numberFormat = numberFormat;
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
   * @return ScatterplotDataProjectionDimension
   */
  @JsonAnySetter
  public ScatterplotDataProjectionDimension putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ScatterplotDataProjectionDimension object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScatterplotDataProjectionDimension scatterplotDataProjectionDimension =
        (ScatterplotDataProjectionDimension) o;
    return Objects.equals(this.alias, scatterplotDataProjectionDimension.alias)
        && Objects.equals(this.column, scatterplotDataProjectionDimension.column)
        && Objects.equals(this.dimension, scatterplotDataProjectionDimension.dimension)
        && Objects.equals(this.numberFormat, scatterplotDataProjectionDimension.numberFormat)
        && Objects.equals(
            this.additionalProperties, scatterplotDataProjectionDimension.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, column, dimension, numberFormat, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScatterplotDataProjectionDimension {\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    numberFormat: ").append(toIndentedString(numberFormat)).append("\n");
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
