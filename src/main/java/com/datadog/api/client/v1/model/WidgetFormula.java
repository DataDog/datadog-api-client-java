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
   * <p>Formula to be used in a widget query.</p>
 */
@JsonPropertyOrder({
  WidgetFormula.JSON_PROPERTY_ALIAS,
  WidgetFormula.JSON_PROPERTY_CELL_DISPLAY_MODE,
  WidgetFormula.JSON_PROPERTY_CONDITIONAL_FORMATS,
  WidgetFormula.JSON_PROPERTY_FORMULA,
  WidgetFormula.JSON_PROPERTY_LIMIT,
  WidgetFormula.JSON_PROPERTY_STYLE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WidgetFormula {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_CELL_DISPLAY_MODE = "cell_display_mode";
  private TableWidgetCellDisplayMode cellDisplayMode;

  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<WidgetConditionalFormat> conditionalFormats = null;

  public static final String JSON_PROPERTY_FORMULA = "formula";
  private String formula;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private WidgetFormulaLimit limit;

  public static final String JSON_PROPERTY_STYLE = "style";
  private WidgetFormulaStyle style;

  public WidgetFormula() {}

  @JsonCreator
  public WidgetFormula(
            @JsonProperty(required=true, value=JSON_PROPERTY_FORMULA)String formula) {
        this.formula = formula;
  }
  public WidgetFormula alias(String alias) {
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
  public WidgetFormula cellDisplayMode(TableWidgetCellDisplayMode cellDisplayMode) {
    this.cellDisplayMode = cellDisplayMode;
    this.unparsed |= !cellDisplayMode.isValid();
    return this;
  }

  /**
   * <p>Define a display mode for the table cell.</p>
   * @return cellDisplayMode
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CELL_DISPLAY_MODE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public TableWidgetCellDisplayMode getCellDisplayMode() {
        return cellDisplayMode;
      }
  public void setCellDisplayMode(TableWidgetCellDisplayMode cellDisplayMode) {
    if (!cellDisplayMode.isValid()) {
        this.unparsed = true;
    }
    this.cellDisplayMode = cellDisplayMode;
  }
  public WidgetFormula conditionalFormats(List<WidgetConditionalFormat> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    for (WidgetConditionalFormat item : conditionalFormats) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public WidgetFormula addConditionalFormatsItem(WidgetConditionalFormat conditionalFormatsItem) {
    if (this.conditionalFormats == null) {
      this.conditionalFormats = new ArrayList<>();
    }
    this.conditionalFormats.add(conditionalFormatsItem);
    this.unparsed |= conditionalFormatsItem.unparsed;
    return this;
  }

  /**
   * <p>List of conditional formats.</p>
   * @return conditionalFormats
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CONDITIONAL_FORMATS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<WidgetConditionalFormat> getConditionalFormats() {
        return conditionalFormats;
      }
  public void setConditionalFormats(List<WidgetConditionalFormat> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
  }
  public WidgetFormula formula(String formula) {
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
  public WidgetFormula limit(WidgetFormulaLimit limit) {
    this.limit = limit;
    this.unparsed |= limit.unparsed;
    return this;
  }

  /**
   * <p>Options for limiting results returned.</p>
   * @return limit
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LIMIT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public WidgetFormulaLimit getLimit() {
        return limit;
      }
  public void setLimit(WidgetFormulaLimit limit) {
    this.limit = limit;
  }
  public WidgetFormula style(WidgetFormulaStyle style) {
    this.style = style;
    this.unparsed |= style.unparsed;
    return this;
  }

  /**
   * <p>Styling options for widget formulas.</p>
   * @return style
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STYLE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public WidgetFormulaStyle getStyle() {
        return style;
      }
  public void setStyle(WidgetFormulaStyle style) {
    this.style = style;
  }

  /**
   * Return true if this WidgetFormula object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetFormula widgetFormula = (WidgetFormula) o;
    return Objects.equals(this.alias, widgetFormula.alias) && Objects.equals(this.cellDisplayMode, widgetFormula.cellDisplayMode) && Objects.equals(this.conditionalFormats, widgetFormula.conditionalFormats) && Objects.equals(this.formula, widgetFormula.formula) && Objects.equals(this.limit, widgetFormula.limit) && Objects.equals(this.style, widgetFormula.style);
  }


  @Override
  public int hashCode() {
    return Objects.hash(alias,cellDisplayMode,conditionalFormats,formula,limit,style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetFormula {\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    cellDisplayMode: ").append(toIndentedString(cellDisplayMode)).append("\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
    sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
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
