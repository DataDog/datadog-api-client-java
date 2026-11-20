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
  NumberReferenceTableColumn.JSON_PROPERTY_ALIAS,
  NumberReferenceTableColumn.JSON_PROPERTY_COMPARISON,
  NumberReferenceTableColumn.JSON_PROPERTY_FORMAT,
  NumberReferenceTableColumn.JSON_PROPERTY_FUNCTIONS,
  NumberReferenceTableColumn.JSON_PROPERTY_IS_HIDDEN,
  NumberReferenceTableColumn.JSON_PROPERTY_NAME,
  NumberReferenceTableColumn.JSON_PROPERTY_REFERENCE,
  NumberReferenceTableColumn.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NumberReferenceTableColumn {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_COMPARISON = "comparison";
  private TableColumnComparison comparison;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private NumberBarTableColumnFormat format;

  public static final String JSON_PROPERTY_FUNCTIONS = "functions";
  private List<TableColumnFunction> functions = null;

  public static final String JSON_PROPERTY_IS_HIDDEN = "is_hidden";
  private Boolean isHidden;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private NumberReferenceTableColumnReference reference;

  public static final String JSON_PROPERTY_TYPE = "type";
  private NumberReferenceTableColumnType type;

  public NumberReferenceTableColumn() {}

  @JsonCreator
  public NumberReferenceTableColumn(
      @JsonProperty(required = true, value = JSON_PROPERTY_FORMAT)
          NumberBarTableColumnFormat format,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_REFERENCE)
          NumberReferenceTableColumnReference reference,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          NumberReferenceTableColumnType type) {
    this.format = format;
    this.unparsed |= format.unparsed;
    this.name = name;
    this.reference = reference;
    this.unparsed |= reference.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public NumberReferenceTableColumn alias(String alias) {
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

  public NumberReferenceTableColumn comparison(TableColumnComparison comparison) {
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

  public NumberReferenceTableColumn format(NumberBarTableColumnFormat format) {
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
  public NumberBarTableColumnFormat getFormat() {
    return format;
  }

  public void setFormat(NumberBarTableColumnFormat format) {
    this.format = format;
    if (format != null) {
      this.unparsed |= format.unparsed;
    }
  }

  public NumberReferenceTableColumn functions(List<TableColumnFunction> functions) {
    this.functions = functions;
    if (functions != null) {
      for (TableColumnFunction item : functions) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public NumberReferenceTableColumn addFunctionsItem(TableColumnFunction functionsItem) {
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

  public NumberReferenceTableColumn isHidden(Boolean isHidden) {
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

  public NumberReferenceTableColumn name(String name) {
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

  public NumberReferenceTableColumn reference(NumberReferenceTableColumnReference reference) {
    this.reference = reference;
    this.unparsed |= reference.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return reference
   */
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public NumberReferenceTableColumnReference getReference() {
    return reference;
  }

  public void setReference(NumberReferenceTableColumnReference reference) {
    this.reference = reference;
    if (reference != null) {
      this.unparsed |= reference.unparsed;
    }
  }

  public NumberReferenceTableColumn type(NumberReferenceTableColumnType type) {
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
  public NumberReferenceTableColumnType getType() {
    return type;
  }

  public void setType(NumberReferenceTableColumnType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this NumberReferenceTableColumn object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumberReferenceTableColumn numberReferenceTableColumn = (NumberReferenceTableColumn) o;
    return Objects.equals(this.alias, numberReferenceTableColumn.alias)
        && Objects.equals(this.comparison, numberReferenceTableColumn.comparison)
        && Objects.equals(this.format, numberReferenceTableColumn.format)
        && Objects.equals(this.functions, numberReferenceTableColumn.functions)
        && Objects.equals(this.isHidden, numberReferenceTableColumn.isHidden)
        && Objects.equals(this.name, numberReferenceTableColumn.name)
        && Objects.equals(this.reference, numberReferenceTableColumn.reference)
        && Objects.equals(this.type, numberReferenceTableColumn.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, comparison, format, functions, isHidden, name, reference, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberReferenceTableColumn {\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    comparison: ").append(toIndentedString(comparison)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    functions: ").append(toIndentedString(functions)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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
