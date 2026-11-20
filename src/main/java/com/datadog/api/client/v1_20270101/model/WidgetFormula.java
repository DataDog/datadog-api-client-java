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
  WidgetFormula.JSON_PROPERTY_ALIAS,
  WidgetFormula.JSON_PROPERTY_FORMULA,
  WidgetFormula.JSON_PROPERTY_LIMIT,
  WidgetFormula.JSON_PROPERTY_NUMBER_FORMAT,
  WidgetFormula.JSON_PROPERTY_STYLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WidgetFormula {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_FORMULA = "formula";
  private String formula;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private WidgetFormulaLimit limit;

  public static final String JSON_PROPERTY_NUMBER_FORMAT = "number_format";
  private WidgetNumberFormat numberFormat;

  public static final String JSON_PROPERTY_STYLE = "style";
  private WidgetFormulaStyle style;

  public WidgetFormula() {}

  @JsonCreator
  public WidgetFormula(
      @JsonProperty(required = true, value = JSON_PROPERTY_FORMULA) String formula) {
    this.formula = formula;
  }

  public WidgetFormula alias(String alias) {
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

  public WidgetFormula formula(String formula) {
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

  public WidgetFormula limit(WidgetFormulaLimit limit) {
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
  public WidgetFormulaLimit getLimit() {
    return limit;
  }

  public void setLimit(WidgetFormulaLimit limit) {
    this.limit = limit;
    if (limit != null) {
      this.unparsed |= limit.unparsed;
    }
  }

  public WidgetFormula numberFormat(WidgetNumberFormat numberFormat) {
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

  public WidgetFormula style(WidgetFormulaStyle style) {
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

  /** Return true if this WidgetFormula object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetFormula widgetFormula = (WidgetFormula) o;
    return Objects.equals(this.alias, widgetFormula.alias)
        && Objects.equals(this.formula, widgetFormula.formula)
        && Objects.equals(this.limit, widgetFormula.limit)
        && Objects.equals(this.numberFormat, widgetFormula.numberFormat)
        && Objects.equals(this.style, widgetFormula.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, formula, limit, numberFormat, style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetFormula {\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
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
