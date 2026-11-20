/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  TableFormula20270101OneOf4462669760.JSON_PROPERTY_ALIAS,
  TableFormula20270101OneOf4462669760.JSON_PROPERTY_CELL_DISPLAY_MODE,
  TableFormula20270101OneOf4462669760.JSON_PROPERTY_CELL_DISPLAY_MODE_OPTIONS,
  TableFormula20270101OneOf4462669760.JSON_PROPERTY_CONDITIONAL_FORMATS,
  TableFormula20270101OneOf4462669760.JSON_PROPERTY_FORMULA,
  TableFormula20270101OneOf4462669760.JSON_PROPERTY_LIMIT,
  TableFormula20270101OneOf4462669760.JSON_PROPERTY_NUMBER_FORMAT,
  TableFormula20270101OneOf4462669760.JSON_PROPERTY_STYLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TableFormula20270101OneOf4462669760 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_CELL_DISPLAY_MODE = "cell_display_mode";
  private TableFormulaAnyOfAnyOfItemCellDisplayMode4452532448_20270101 cellDisplayMode;

  public static final String JSON_PROPERTY_CELL_DISPLAY_MODE_OPTIONS = "cell_display_mode_options";
  private TableTrendCellDisplayModeOptions_20270101 cellDisplayModeOptions;

  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private ConditionalFormats_20270101 conditionalFormats;

  public static final String JSON_PROPERTY_FORMULA = "formula";
  private String formula;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private TableFormulaAnyOfAnyOfItemLimit4452334816_20270101 limit;

  public static final String JSON_PROPERTY_NUMBER_FORMAT = "number_format";
  private WidgetNumberFormat_20270101 numberFormat;

  public static final String JSON_PROPERTY_STYLE = "style";
  private WidgetFormulaStyle_20270101 style;

  public TableFormula20270101OneOf4462669760() {}

  @JsonCreator
  public TableFormula20270101OneOf4462669760(
      @JsonProperty(required = true, value = JSON_PROPERTY_CELL_DISPLAY_MODE)
          TableFormulaAnyOfAnyOfItemCellDisplayMode4452532448_20270101 cellDisplayMode,
      @JsonProperty(required = true, value = JSON_PROPERTY_FORMULA) String formula) {
    this.cellDisplayMode = cellDisplayMode;
    this.unparsed |= !cellDisplayMode.isValid();
    this.formula = formula;
  }

  public TableFormula20270101OneOf4462669760 alias(String alias) {
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

  public TableFormula20270101OneOf4462669760 cellDisplayMode(
      TableFormulaAnyOfAnyOfItemCellDisplayMode4452532448_20270101 cellDisplayMode) {
    this.cellDisplayMode = cellDisplayMode;
    this.unparsed |= !cellDisplayMode.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return cellDisplayMode
   */
  @JsonProperty(JSON_PROPERTY_CELL_DISPLAY_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TableFormulaAnyOfAnyOfItemCellDisplayMode4452532448_20270101 getCellDisplayMode() {
    return cellDisplayMode;
  }

  public void setCellDisplayMode(
      TableFormulaAnyOfAnyOfItemCellDisplayMode4452532448_20270101 cellDisplayMode) {
    if (!cellDisplayMode.isValid()) {
      this.unparsed = true;
    }
    this.cellDisplayMode = cellDisplayMode;
  }

  public TableFormula20270101OneOf4462669760 cellDisplayModeOptions(
      TableTrendCellDisplayModeOptions_20270101 cellDisplayModeOptions) {
    this.cellDisplayModeOptions = cellDisplayModeOptions;
    this.unparsed |= cellDisplayModeOptions.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return cellDisplayModeOptions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CELL_DISPLAY_MODE_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TableTrendCellDisplayModeOptions_20270101 getCellDisplayModeOptions() {
    return cellDisplayModeOptions;
  }

  public void setCellDisplayModeOptions(
      TableTrendCellDisplayModeOptions_20270101 cellDisplayModeOptions) {
    this.cellDisplayModeOptions = cellDisplayModeOptions;
    if (cellDisplayModeOptions != null) {
      this.unparsed |= cellDisplayModeOptions.unparsed;
    }
  }

  public TableFormula20270101OneOf4462669760 conditionalFormats(
      ConditionalFormats_20270101 conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    this.unparsed |= conditionalFormats.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return conditionalFormats
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONDITIONAL_FORMATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ConditionalFormats_20270101 getConditionalFormats() {
    return conditionalFormats;
  }

  public void setConditionalFormats(ConditionalFormats_20270101 conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      this.unparsed |= conditionalFormats.unparsed;
    }
  }

  public TableFormula20270101OneOf4462669760 formula(String formula) {
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

  public TableFormula20270101OneOf4462669760 limit(
      TableFormulaAnyOfAnyOfItemLimit4452334816_20270101 limit) {
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
  public TableFormulaAnyOfAnyOfItemLimit4452334816_20270101 getLimit() {
    return limit;
  }

  public void setLimit(TableFormulaAnyOfAnyOfItemLimit4452334816_20270101 limit) {
    this.limit = limit;
    if (limit != null) {
      this.unparsed |= limit.unparsed;
    }
  }

  public TableFormula20270101OneOf4462669760 numberFormat(
      WidgetNumberFormat_20270101 numberFormat) {
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
  public WidgetNumberFormat_20270101 getNumberFormat() {
    return numberFormat;
  }

  public void setNumberFormat(WidgetNumberFormat_20270101 numberFormat) {
    this.numberFormat = numberFormat;
    if (numberFormat != null) {
      this.unparsed |= numberFormat.unparsed;
    }
  }

  public TableFormula20270101OneOf4462669760 style(WidgetFormulaStyle_20270101 style) {
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
  public WidgetFormulaStyle_20270101 getStyle() {
    return style;
  }

  public void setStyle(WidgetFormulaStyle_20270101 style) {
    this.style = style;
    if (style != null) {
      this.unparsed |= style.unparsed;
    }
  }

  /** Return true if this TableFormula20270101OneOf4462669760 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableFormula20270101OneOf4462669760 tableFormula20270101OneOf4462669760 =
        (TableFormula20270101OneOf4462669760) o;
    return Objects.equals(this.alias, tableFormula20270101OneOf4462669760.alias)
        && Objects.equals(this.cellDisplayMode, tableFormula20270101OneOf4462669760.cellDisplayMode)
        && Objects.equals(
            this.cellDisplayModeOptions, tableFormula20270101OneOf4462669760.cellDisplayModeOptions)
        && Objects.equals(
            this.conditionalFormats, tableFormula20270101OneOf4462669760.conditionalFormats)
        && Objects.equals(this.formula, tableFormula20270101OneOf4462669760.formula)
        && Objects.equals(this.limit, tableFormula20270101OneOf4462669760.limit)
        && Objects.equals(this.numberFormat, tableFormula20270101OneOf4462669760.numberFormat)
        && Objects.equals(this.style, tableFormula20270101OneOf4462669760.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        alias,
        cellDisplayMode,
        cellDisplayModeOptions,
        conditionalFormats,
        formula,
        limit,
        numberFormat,
        style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableFormula20270101OneOf4462669760 {\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    cellDisplayMode: ").append(toIndentedString(cellDisplayMode)).append("\n");
    sb.append("    cellDisplayModeOptions: ")
        .append(toIndentedString(cellDisplayModeOptions))
        .append("\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
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
