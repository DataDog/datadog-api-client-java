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
  ScatterplotFormula.JSON_PROPERTY_ALIAS,
  ScatterplotFormula.JSON_PROPERTY_DIMENSION,
  ScatterplotFormula.JSON_PROPERTY_FORMULA,
  ScatterplotFormula.JSON_PROPERTY_LIMIT,
  ScatterplotFormula.JSON_PROPERTY_NUMBER_FORMAT,
  ScatterplotFormula.JSON_PROPERTY_STYLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScatterplotFormula {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_DIMENSION = "dimension";
  private ScatterPlotDimension dimension;

  public static final String JSON_PROPERTY_FORMULA = "formula";
  private String formula;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private ScatterplotFormulaLimit limit;

  public static final String JSON_PROPERTY_NUMBER_FORMAT = "number_format";
  private WidgetNumberFormat numberFormat;

  public static final String JSON_PROPERTY_STYLE = "style";
  private WidgetFormulaStyle style;

  public ScatterplotFormula() {}

  @JsonCreator
  public ScatterplotFormula(
      @JsonProperty(required = true, value = JSON_PROPERTY_DIMENSION)
          ScatterPlotDimension dimension,
      @JsonProperty(required = true, value = JSON_PROPERTY_FORMULA) String formula) {
    this.dimension = dimension;
    this.unparsed |= !dimension.isValid();
    this.formula = formula;
  }

  public ScatterplotFormula alias(String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public ScatterplotFormula dimension(ScatterPlotDimension dimension) {
    this.dimension = dimension;
    this.unparsed |= !dimension.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return dimension
   */
  @JsonProperty(JSON_PROPERTY_DIMENSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ScatterPlotDimension getDimension() {
    return dimension;
  }

  public void setDimension(ScatterPlotDimension dimension) {
    if (!dimension.isValid()) {
      this.unparsed = true;
    }
    this.dimension = dimension;
  }

  public ScatterplotFormula formula(String formula) {
    this.formula = formula;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public ScatterplotFormula limit(ScatterplotFormulaLimit limit) {
    this.limit = limit;
    this.unparsed |= limit.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return limit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ScatterplotFormulaLimit getLimit() {
    return limit;
  }

  public void setLimit(ScatterplotFormulaLimit limit) {
    this.limit = limit;
    if (limit != null) {
      this.unparsed |= limit.unparsed;
    }
  }

  public ScatterplotFormula numberFormat(WidgetNumberFormat numberFormat) {
    this.numberFormat = numberFormat;
    this.unparsed |= numberFormat.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public ScatterplotFormula style(WidgetFormulaStyle style) {
    this.style = style;
    this.unparsed |= style.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return style
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetFormulaStyle getStyle() {
    return style;
  }

  public void setStyle(WidgetFormulaStyle style) {
    this.style = style;
    if (style != null) {
      this.unparsed |= style.unparsed;
    }
  }

  /** Return true if this ScatterplotFormula object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScatterplotFormula scatterplotFormula = (ScatterplotFormula) o;
    return Objects.equals(this.alias, scatterplotFormula.alias)
        && Objects.equals(this.dimension, scatterplotFormula.dimension)
        && Objects.equals(this.formula, scatterplotFormula.formula)
        && Objects.equals(this.limit, scatterplotFormula.limit)
        && Objects.equals(this.numberFormat, scatterplotFormula.numberFormat)
        && Objects.equals(this.style, scatterplotFormula.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, dimension, formula, limit, numberFormat, style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScatterplotFormula {\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    numberFormat: ").append(toIndentedString(numberFormat)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
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
