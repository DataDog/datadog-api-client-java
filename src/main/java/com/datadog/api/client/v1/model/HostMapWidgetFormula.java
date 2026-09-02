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

/**
 * Formula for the infrastructure host map widget that specifies both the expression and the visual
 * dimension it populates.
 */
@JsonPropertyOrder({
  HostMapWidgetFormula.JSON_PROPERTY_ALIAS,
  HostMapWidgetFormula.JSON_PROPERTY_DIMENSION,
  HostMapWidgetFormula.JSON_PROPERTY_FORMULA,
  HostMapWidgetFormula.JSON_PROPERTY_NUMBER_FORMAT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HostMapWidgetFormula {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_DIMENSION = "dimension";
  private HostMapWidgetDimension dimension;

  public static final String JSON_PROPERTY_FORMULA = "formula";
  private String formula;

  public static final String JSON_PROPERTY_NUMBER_FORMAT = "number_format";
  private WidgetNumberFormat numberFormat;

  public HostMapWidgetFormula() {}

  @JsonCreator
  public HostMapWidgetFormula(
      @JsonProperty(required = true, value = JSON_PROPERTY_DIMENSION)
          HostMapWidgetDimension dimension,
      @JsonProperty(required = true, value = JSON_PROPERTY_FORMULA) String formula) {
    this.dimension = dimension;
    this.unparsed |= !dimension.isValid();
    this.formula = formula;
  }

  public HostMapWidgetFormula alias(String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * Expression alias.
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

  public HostMapWidgetFormula dimension(HostMapWidgetDimension dimension) {
    this.dimension = dimension;
    this.unparsed |= !dimension.isValid();
    return this;
  }

  /**
   * Visual dimension for the host map widget. Used both by infrastructure-backed formulas and by
   * DDSQL projection columns; <code>group</code> is only meaningful for DDSQL projection columns,
   * where repeated entries define the grouping hierarchy.
   *
   * @return dimension
   */
  @JsonProperty(JSON_PROPERTY_DIMENSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public HostMapWidgetDimension getDimension() {
    return dimension;
  }

  public void setDimension(HostMapWidgetDimension dimension) {
    if (!dimension.isValid()) {
      this.unparsed = true;
    }
    this.dimension = dimension;
  }

  public HostMapWidgetFormula formula(String formula) {
    this.formula = formula;
    return this;
  }

  /**
   * String expression built from queries, formulas, and functions.
   *
   * @return formula
   */
  @JsonProperty(JSON_PROPERTY_FORMULA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFormula() {
    return formula;
  }

  public void setFormula(String formula) {
    this.formula = formula;
  }

  public HostMapWidgetFormula numberFormat(WidgetNumberFormat numberFormat) {
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
    if (numberFormat != null) {
      this.unparsed |= numberFormat.unparsed;
    }
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
   * @return HostMapWidgetFormula
   */
  @JsonAnySetter
  public HostMapWidgetFormula putAdditionalProperty(String key, Object value) {
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

  /** Return true if this HostMapWidgetFormula object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostMapWidgetFormula hostMapWidgetFormula = (HostMapWidgetFormula) o;
    return Objects.equals(this.alias, hostMapWidgetFormula.alias)
        && Objects.equals(this.dimension, hostMapWidgetFormula.dimension)
        && Objects.equals(this.formula, hostMapWidgetFormula.formula)
        && Objects.equals(this.numberFormat, hostMapWidgetFormula.numberFormat)
        && Objects.equals(this.additionalProperties, hostMapWidgetFormula.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, dimension, formula, numberFormat, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostMapWidgetFormula {\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
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
