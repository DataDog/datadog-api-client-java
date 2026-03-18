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

/** A guided table column that displays the result of evaluating a formula over other columns. */
@JsonPropertyOrder({
  GuidedTableFormulaColumn.JSON_PROPERTY_ALIAS,
  GuidedTableFormulaColumn.JSON_PROPERTY_COMPARISON,
  GuidedTableFormulaColumn.JSON_PROPERTY_FORMAT,
  GuidedTableFormulaColumn.JSON_PROPERTY_FORMULA,
  GuidedTableFormulaColumn.JSON_PROPERTY_IS_HIDDEN,
  GuidedTableFormulaColumn.JSON_PROPERTY_NAME,
  GuidedTableFormulaColumn.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GuidedTableFormulaColumn {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_COMPARISON = "comparison";
  private GuidedTableColumnComparison comparison;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private GuidedTableColumnFormat format;

  public static final String JSON_PROPERTY_FORMULA = "formula";
  private String formula;

  public static final String JSON_PROPERTY_IS_HIDDEN = "is_hidden";
  private Boolean isHidden;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private FormulaType type;

  public GuidedTableFormulaColumn() {}

  @JsonCreator
  public GuidedTableFormulaColumn(
      @JsonProperty(required = true, value = JSON_PROPERTY_FORMAT) GuidedTableColumnFormat format,
      @JsonProperty(required = true, value = JSON_PROPERTY_FORMULA) String formula,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) FormulaType type) {
    this.format = format;
    this.unparsed |= format.unparsed;
    this.formula = formula;
    this.name = name;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public GuidedTableFormulaColumn alias(String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * Display name shown as the column header.
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

  public GuidedTableFormulaColumn comparison(GuidedTableColumnComparison comparison) {
    this.comparison = comparison;
    this.unparsed |= comparison.unparsed;
    return this;
  }

  /**
   * Comparison to display in a guided table column.
   *
   * @return comparison
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPARISON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GuidedTableColumnComparison getComparison() {
    return comparison;
  }

  public void setComparison(GuidedTableColumnComparison comparison) {
    this.comparison = comparison;
  }

  public GuidedTableFormulaColumn format(GuidedTableColumnFormat format) {
    this.format = format;
    this.unparsed |= format.unparsed;
    return this;
  }

  /**
   * Visual formatting applied to values in a guided table column. Supports number/bar mode and
   * trend mode.
   *
   * @return format
   */
  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GuidedTableColumnFormat getFormat() {
    return format;
  }

  public void setFormat(GuidedTableColumnFormat format) {
    this.format = format;
  }

  public GuidedTableFormulaColumn formula(String formula) {
    this.formula = formula;
    return this;
  }

  /**
   * The formula expression to evaluate.
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

  public GuidedTableFormulaColumn isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

  /**
   * Whether this column is hidden in the rendered table.
   *
   * @return isHidden
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_HIDDEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsHidden() {
    return isHidden;
  }

  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }

  public GuidedTableFormulaColumn name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Auto-generated name used to refer to this column.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GuidedTableFormulaColumn type(FormulaType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Set the sort type to formula.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FormulaType getType() {
    return type;
  }

  public void setType(FormulaType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return GuidedTableFormulaColumn
   */
  @JsonAnySetter
  public GuidedTableFormulaColumn putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GuidedTableFormulaColumn object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuidedTableFormulaColumn guidedTableFormulaColumn = (GuidedTableFormulaColumn) o;
    return Objects.equals(this.alias, guidedTableFormulaColumn.alias)
        && Objects.equals(this.comparison, guidedTableFormulaColumn.comparison)
        && Objects.equals(this.format, guidedTableFormulaColumn.format)
        && Objects.equals(this.formula, guidedTableFormulaColumn.formula)
        && Objects.equals(this.isHidden, guidedTableFormulaColumn.isHidden)
        && Objects.equals(this.name, guidedTableFormulaColumn.name)
        && Objects.equals(this.type, guidedTableFormulaColumn.type)
        && Objects.equals(this.additionalProperties, guidedTableFormulaColumn.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        alias, comparison, format, formula, isHidden, name, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuidedTableFormulaColumn {\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    comparison: ").append(toIndentedString(comparison)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
