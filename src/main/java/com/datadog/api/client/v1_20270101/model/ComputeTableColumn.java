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
  ComputeTableColumn.JSON_PROPERTY_ALIAS,
  ComputeTableColumn.JSON_PROPERTY_COMPARISON,
  ComputeTableColumn.JSON_PROPERTY_COMPUTE,
  ComputeTableColumn.JSON_PROPERTY_FORMAT,
  ComputeTableColumn.JSON_PROPERTY_FUNCTIONS,
  ComputeTableColumn.JSON_PROPERTY_IS_HIDDEN,
  ComputeTableColumn.JSON_PROPERTY_NAME,
  ComputeTableColumn.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ComputeTableColumn {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_COMPARISON = "comparison";
  private TableColumnComparison comparison;

  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private ComputeTableColumnCompute compute;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private TableColumnFormat format;

  public static final String JSON_PROPERTY_FUNCTIONS = "functions";
  private List<TableColumnFunction> functions = null;

  public static final String JSON_PROPERTY_IS_HIDDEN = "is_hidden";
  private Boolean isHidden;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ComputeTableColumnType type;

  public ComputeTableColumn() {}

  @JsonCreator
  public ComputeTableColumn(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPUTE)
          ComputeTableColumnCompute compute,
      @JsonProperty(required = true, value = JSON_PROPERTY_FORMAT) TableColumnFormat format,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) ComputeTableColumnType type) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    this.format = format;
    this.unparsed |= format.unparsed;
    this.name = name;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ComputeTableColumn alias(String alias) {
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

  public ComputeTableColumn comparison(TableColumnComparison comparison) {
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

  public ComputeTableColumn compute(ComputeTableColumnCompute compute) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return compute
   */
  @JsonProperty(JSON_PROPERTY_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ComputeTableColumnCompute getCompute() {
    return compute;
  }

  public void setCompute(ComputeTableColumnCompute compute) {
    this.compute = compute;
    if (compute != null) {
      this.unparsed |= compute.unparsed;
    }
  }

  public ComputeTableColumn format(TableColumnFormat format) {
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

  public ComputeTableColumn functions(List<TableColumnFunction> functions) {
    this.functions = functions;
    if (functions != null) {
      for (TableColumnFunction item : functions) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ComputeTableColumn addFunctionsItem(TableColumnFunction functionsItem) {
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

  public ComputeTableColumn isHidden(Boolean isHidden) {
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

  public ComputeTableColumn name(String name) {
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

  public ComputeTableColumn type(ComputeTableColumnType type) {
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
  public ComputeTableColumnType getType() {
    return type;
  }

  public void setType(ComputeTableColumnType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this ComputeTableColumn object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComputeTableColumn computeTableColumn = (ComputeTableColumn) o;
    return Objects.equals(this.alias, computeTableColumn.alias)
        && Objects.equals(this.comparison, computeTableColumn.comparison)
        && Objects.equals(this.compute, computeTableColumn.compute)
        && Objects.equals(this.format, computeTableColumn.format)
        && Objects.equals(this.functions, computeTableColumn.functions)
        && Objects.equals(this.isHidden, computeTableColumn.isHidden)
        && Objects.equals(this.name, computeTableColumn.name)
        && Objects.equals(this.type, computeTableColumn.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, comparison, compute, format, functions, isHidden, name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputeTableColumn {\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    comparison: ").append(toIndentedString(comparison)).append("\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    functions: ").append(toIndentedString(functions)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
