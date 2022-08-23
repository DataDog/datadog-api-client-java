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
   * <p>Formula to be used in a Scatterplot widget query.</p>
 */
@JsonPropertyOrder({
  ScatterplotWidgetFormula.JSON_PROPERTY_ALIAS,
  ScatterplotWidgetFormula.JSON_PROPERTY_DIMENSION,
  ScatterplotWidgetFormula.JSON_PROPERTY_FORMULA
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScatterplotWidgetFormula {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_DIMENSION = "dimension";
  private ScatterplotDimension dimension;

  public static final String JSON_PROPERTY_FORMULA = "formula";
  private String formula;

  public ScatterplotWidgetFormula() {}

  @JsonCreator
  public ScatterplotWidgetFormula(
            @JsonProperty(required=true, value=JSON_PROPERTY_DIMENSION)ScatterplotDimension dimension,
            @JsonProperty(required=true, value=JSON_PROPERTY_FORMULA)String formula) {
        this.dimension = dimension;
        this.unparsed |= !dimension.isValid();
        this.formula = formula;
  }
  public ScatterplotWidgetFormula alias(String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * <p>Expression alias.</p>
   * @return alias
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ALIAS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAlias() {
        return alias;
      }
  public void setAlias(String alias) {
    this.alias = alias;
  }
  public ScatterplotWidgetFormula dimension(ScatterplotDimension dimension) {
    this.dimension = dimension;
    this.unparsed |= !dimension.isValid();
    return this;
  }

  /**
   * <p>Dimension of the Scatterplot.</p>
   * @return dimension
  **/
      @JsonProperty(JSON_PROPERTY_DIMENSION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ScatterplotDimension getDimension() {
        return dimension;
      }
  public void setDimension(ScatterplotDimension dimension) {
    if (!dimension.isValid()) {
        this.unparsed = true;
    }
    this.dimension = dimension;
  }
  public ScatterplotWidgetFormula formula(String formula) {
    this.formula = formula;
    return this;
  }

  /**
   * <p>String expression built from queries, formulas, and functions.</p>
   * @return formula
  **/
      @JsonProperty(JSON_PROPERTY_FORMULA)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getFormula() {
        return formula;
      }
  public void setFormula(String formula) {
    this.formula = formula;
  }

  /**
   * Return true if this ScatterplotWidgetFormula object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScatterplotWidgetFormula scatterplotWidgetFormula = (ScatterplotWidgetFormula) o;
    return Objects.equals(this.alias, scatterplotWidgetFormula.alias) && Objects.equals(this.dimension, scatterplotWidgetFormula.dimension) && Objects.equals(this.formula, scatterplotWidgetFormula.formula);
  }


  @Override
  public int hashCode() {
    return Objects.hash(alias,dimension,formula);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScatterplotWidgetFormula {\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
    sb.append("}");
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
