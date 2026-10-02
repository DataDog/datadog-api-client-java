/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/** Complete Datadog OR-of-ANDs entry-point filter expression. */
@JsonPropertyOrder({
  ExperimentsDatadogEntryPointFilter.JSON_PROPERTY_COLUMN,
  ExperimentsDatadogEntryPointFilter.JSON_PROPERTY_COLUMN_TYPE,
  ExperimentsDatadogEntryPointFilter.JSON_PROPERTY_OPERATION,
  ExperimentsDatadogEntryPointFilter.JSON_PROPERTY_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsDatadogEntryPointFilter {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMN = "column";
  private String column;

  public static final String JSON_PROPERTY_COLUMN_TYPE = "column_type";
  private
  ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPointFiltersItemsItemsColumnType
      columnType;

  public static final String JSON_PROPERTY_OPERATION = "operation";
  private
  ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPointFiltersItemsItemsOperation
      operation;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<String> values = new ArrayList<>();

  public ExperimentsDatadogEntryPointFilter() {}

  @JsonCreator
  public ExperimentsDatadogEntryPointFilter(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMN) String column,
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMN_TYPE)
          ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPointFiltersItemsItemsColumnType
              columnType,
      @JsonProperty(required = true, value = JSON_PROPERTY_OPERATION)
          ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPointFiltersItemsItemsOperation
              operation,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUES) List<String> values) {
    this.column = column;
    this.columnType = columnType;
    this.unparsed |= !columnType.isValid();
    this.operation = operation;
    this.unparsed |= !operation.isValid();
    this.values = values;
  }

  public ExperimentsDatadogEntryPointFilter column(String column) {
    this.column = column;
    return this;
  }

  /**
   * Exposure field evaluated by the entry-point filter.
   *
   * @return column
   */
  @JsonProperty(JSON_PROPERTY_COLUMN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getColumn() {
    return column;
  }

  public void setColumn(String column) {
    this.column = column;
  }

  public ExperimentsDatadogEntryPointFilter columnType(
      ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPointFiltersItemsItemsColumnType
          columnType) {
    this.columnType = columnType;
    this.unparsed |= !columnType.isValid();
    return this;
  }

  /**
   * Data type of the column evaluated by the entry-point filter.
   *
   * @return columnType
   */
  @JsonProperty(JSON_PROPERTY_COLUMN_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public
  ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPointFiltersItemsItemsColumnType
      getColumnType() {
    return columnType;
  }

  public void setColumnType(
      ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPointFiltersItemsItemsColumnType
          columnType) {
    if (!columnType.isValid()) {
      this.unparsed = true;
    }
    this.columnType = columnType;
  }

  public ExperimentsDatadogEntryPointFilter operation(
      ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPointFiltersItemsItemsOperation
          operation) {
    this.operation = operation;
    this.unparsed |= !operation.isValid();
    return this;
  }

  /**
   * Comparison applied by the Datadog entry-point filter.
   *
   * @return operation
   */
  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public
  ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPointFiltersItemsItemsOperation
      getOperation() {
    return operation;
  }

  public void setOperation(
      ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPointFiltersItemsItemsOperation
          operation) {
    if (!operation.isValid()) {
      this.unparsed = true;
    }
    this.operation = operation;
  }

  public ExperimentsDatadogEntryPointFilter values(List<String> values) {
    this.values = values;
    return this;
  }

  public ExperimentsDatadogEntryPointFilter addValuesItem(String valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Comparison values used by the filter operation.
   *
   * @return values
   */
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
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
   * @return ExperimentsDatadogEntryPointFilter
   */
  @JsonAnySetter
  public ExperimentsDatadogEntryPointFilter putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsDatadogEntryPointFilter object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsDatadogEntryPointFilter experimentsDatadogEntryPointFilter =
        (ExperimentsDatadogEntryPointFilter) o;
    return Objects.equals(this.column, experimentsDatadogEntryPointFilter.column)
        && Objects.equals(this.columnType, experimentsDatadogEntryPointFilter.columnType)
        && Objects.equals(this.operation, experimentsDatadogEntryPointFilter.operation)
        && Objects.equals(this.values, experimentsDatadogEntryPointFilter.values)
        && Objects.equals(
            this.additionalProperties, experimentsDatadogEntryPointFilter.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column, columnType, operation, values, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsDatadogEntryPointFilter {\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    columnType: ").append(toIndentedString(columnType)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
