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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * A guided table column that displays values for the previous time period based on another column's
 * full query.
 */
@JsonPropertyOrder({
  GuidedTablePresetColumn.JSON_PROPERTY_ALIAS,
  GuidedTablePresetColumn.JSON_PROPERTY_COMPARISON,
  GuidedTablePresetColumn.JSON_PROPERTY_FORMAT,
  GuidedTablePresetColumn.JSON_PROPERTY_FUNCTIONS,
  GuidedTablePresetColumn.JSON_PROPERTY_IS_HIDDEN,
  GuidedTablePresetColumn.JSON_PROPERTY_NAME,
  GuidedTablePresetColumn.JSON_PROPERTY_PRESET,
  GuidedTablePresetColumn.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GuidedTablePresetColumn {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_COMPARISON = "comparison";
  private GuidedTableColumnComparison comparison;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private GuidedTableColumnFormat format;

  public static final String JSON_PROPERTY_FUNCTIONS = "functions";
  private List<GuidedTableColumnFunction> functions = null;

  public static final String JSON_PROPERTY_IS_HIDDEN = "is_hidden";
  private Boolean isHidden;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PRESET = "preset";
  private GuidedTablePresetColumnPreset preset;

  public static final String JSON_PROPERTY_TYPE = "type";
  private GuidedTablePresetColumnType type;

  public GuidedTablePresetColumn() {}

  @JsonCreator
  public GuidedTablePresetColumn(
      @JsonProperty(required = true, value = JSON_PROPERTY_FORMAT) GuidedTableColumnFormat format,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_PRESET)
          GuidedTablePresetColumnPreset preset,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) GuidedTablePresetColumnType type) {
    this.format = format;
    this.unparsed |= format.unparsed;
    this.name = name;
    this.preset = preset;
    this.unparsed |= preset.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public GuidedTablePresetColumn alias(String alias) {
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

  public GuidedTablePresetColumn comparison(GuidedTableColumnComparison comparison) {
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

  public GuidedTablePresetColumn format(GuidedTableColumnFormat format) {
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

  public GuidedTablePresetColumn functions(List<GuidedTableColumnFunction> functions) {
    this.functions = functions;
    for (GuidedTableColumnFunction item : functions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public GuidedTablePresetColumn addFunctionsItem(GuidedTableColumnFunction functionsItem) {
    if (this.functions == null) {
      this.functions = new ArrayList<>();
    }
    this.functions.add(functionsItem);
    this.unparsed |= functionsItem.unparsed;
    return this;
  }

  /**
   * Functions to apply sequentially to the computed value.
   *
   * @return functions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FUNCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<GuidedTableColumnFunction> getFunctions() {
    return functions;
  }

  public void setFunctions(List<GuidedTableColumnFunction> functions) {
    this.functions = functions;
  }

  public GuidedTablePresetColumn isHidden(Boolean isHidden) {
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

  public GuidedTablePresetColumn name(String name) {
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

  public GuidedTablePresetColumn preset(GuidedTablePresetColumnPreset preset) {
    this.preset = preset;
    this.unparsed |= preset.unparsed;
    return this;
  }

  /**
   * Preset configuration.
   *
   * @return preset
   */
  @JsonProperty(JSON_PROPERTY_PRESET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GuidedTablePresetColumnPreset getPreset() {
    return preset;
  }

  public void setPreset(GuidedTablePresetColumnPreset preset) {
    this.preset = preset;
  }

  public GuidedTablePresetColumn type(GuidedTablePresetColumnType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Gettype
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GuidedTablePresetColumnType getType() {
    return type;
  }

  public void setType(GuidedTablePresetColumnType type) {
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
   * @return GuidedTablePresetColumn
   */
  @JsonAnySetter
  public GuidedTablePresetColumn putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GuidedTablePresetColumn object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuidedTablePresetColumn guidedTablePresetColumn = (GuidedTablePresetColumn) o;
    return Objects.equals(this.alias, guidedTablePresetColumn.alias)
        && Objects.equals(this.comparison, guidedTablePresetColumn.comparison)
        && Objects.equals(this.format, guidedTablePresetColumn.format)
        && Objects.equals(this.functions, guidedTablePresetColumn.functions)
        && Objects.equals(this.isHidden, guidedTablePresetColumn.isHidden)
        && Objects.equals(this.name, guidedTablePresetColumn.name)
        && Objects.equals(this.preset, guidedTablePresetColumn.preset)
        && Objects.equals(this.type, guidedTablePresetColumn.type)
        && Objects.equals(this.additionalProperties, guidedTablePresetColumn.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        alias, comparison, format, functions, isHidden, name, preset, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuidedTablePresetColumn {\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    comparison: ").append(toIndentedString(comparison)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    functions: ").append(toIndentedString(functions)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    preset: ").append(toIndentedString(preset)).append("\n");
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
