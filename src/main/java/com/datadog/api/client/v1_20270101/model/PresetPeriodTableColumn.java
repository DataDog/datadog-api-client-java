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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  PresetPeriodTableColumn.JSON_PROPERTY_ALIAS,
  PresetPeriodTableColumn.JSON_PROPERTY_COMPARISON,
  PresetPeriodTableColumn.JSON_PROPERTY_FORMAT,
  PresetPeriodTableColumn.JSON_PROPERTY_FUNCTIONS,
  PresetPeriodTableColumn.JSON_PROPERTY_IS_HIDDEN,
  PresetPeriodTableColumn.JSON_PROPERTY_NAME,
  PresetPeriodTableColumn.JSON_PROPERTY_PRESET,
  PresetPeriodTableColumn.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PresetPeriodTableColumn {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_COMPARISON = "comparison";
  private TableColumnComparison comparison;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private TableColumnFormat format;

  public static final String JSON_PROPERTY_FUNCTIONS = "functions";
  private List<TableColumnFunction> functions = null;

  public static final String JSON_PROPERTY_IS_HIDDEN = "is_hidden";
  private Boolean isHidden;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PRESET = "preset";
  private PresetPeriodTableColumnPreset preset;

  public static final String JSON_PROPERTY_TYPE = "type";
  private PresetPeriodTableColumnType type;

  public PresetPeriodTableColumn() {}

  @JsonCreator
  public PresetPeriodTableColumn(
      @JsonProperty(required = true, value = JSON_PROPERTY_FORMAT) TableColumnFormat format,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_PRESET)
          PresetPeriodTableColumnPreset preset,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) PresetPeriodTableColumnType type) {
    this.format = format;
    this.unparsed |= format.unparsed;
    this.name = name;
    this.preset = preset;
    this.unparsed |= preset.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public PresetPeriodTableColumn alias(String alias) {
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

  public PresetPeriodTableColumn comparison(TableColumnComparison comparison) {
    this.comparison = comparison;
    this.unparsed |= comparison.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return comparison
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPARISON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TableColumnComparison getComparison() {
    return comparison;
  }

  public void setComparison(TableColumnComparison comparison) {
    this.comparison = comparison;
    if (comparison != null) {
      this.unparsed |= comparison.unparsed;
    }
  }

  public PresetPeriodTableColumn format(TableColumnFormat format) {
    this.format = format;
    this.unparsed |= format.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return format
   */
  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TableColumnFormat getFormat() {
    return format;
  }

  public void setFormat(TableColumnFormat format) {
    this.format = format;
    if (format != null) {
      this.unparsed |= format.unparsed;
    }
  }

  public PresetPeriodTableColumn functions(List<TableColumnFunction> functions) {
    this.functions = functions;
    if (functions != null) {
      for (TableColumnFunction item : functions) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public PresetPeriodTableColumn addFunctionsItem(TableColumnFunction functionsItem) {
    if (this.functions == null) {
      this.functions = new ArrayList<>();
    }
    this.functions.add(functionsItem);
    this.unparsed |= functionsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return functions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FUNCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<TableColumnFunction> getFunctions() {
    return functions;
  }

  public void setFunctions(List<TableColumnFunction> functions) {
    this.functions = functions;
    if (functions != null) {
      for (TableColumnFunction item : functions) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public PresetPeriodTableColumn isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public PresetPeriodTableColumn name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public PresetPeriodTableColumn preset(PresetPeriodTableColumnPreset preset) {
    this.preset = preset;
    this.unparsed |= preset.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return preset
   */
  @JsonProperty(JSON_PROPERTY_PRESET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public PresetPeriodTableColumnPreset getPreset() {
    return preset;
  }

  public void setPreset(PresetPeriodTableColumnPreset preset) {
    this.preset = preset;
    if (preset != null) {
      this.unparsed |= preset.unparsed;
    }
  }

  public PresetPeriodTableColumn type(PresetPeriodTableColumnType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public PresetPeriodTableColumnType getType() {
    return type;
  }

  public void setType(PresetPeriodTableColumnType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this PresetPeriodTableColumn object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PresetPeriodTableColumn presetPeriodTableColumn = (PresetPeriodTableColumn) o;
    return Objects.equals(this.alias, presetPeriodTableColumn.alias)
        && Objects.equals(this.comparison, presetPeriodTableColumn.comparison)
        && Objects.equals(this.format, presetPeriodTableColumn.format)
        && Objects.equals(this.functions, presetPeriodTableColumn.functions)
        && Objects.equals(this.isHidden, presetPeriodTableColumn.isHidden)
        && Objects.equals(this.name, presetPeriodTableColumn.name)
        && Objects.equals(this.preset, presetPeriodTableColumn.preset)
        && Objects.equals(this.type, presetPeriodTableColumn.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, comparison, format, functions, isHidden, name, preset, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresetPeriodTableColumn {\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    comparison: ").append(toIndentedString(comparison)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    functions: ").append(toIndentedString(functions)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    preset: ").append(toIndentedString(preset)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
