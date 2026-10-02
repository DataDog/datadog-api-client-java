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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Optional Datadog measure. Use null when the other measure is selected. */
@JsonPropertyOrder({
  ExperimentsNullableDatadogMetricMeasureInput.JSON_PROPERTY_COLUMN_NAME,
  ExperimentsNullableDatadogMetricMeasureInput.JSON_PROPERTY_COLUMN_TYPE,
  ExperimentsNullableDatadogMetricMeasureInput.JSON_PROPERTY_FILTERS,
  ExperimentsNullableDatadogMetricMeasureInput.JSON_PROPERTY_NAME,
  ExperimentsNullableDatadogMetricMeasureInput.JSON_PROPERTY_QUERY,
  ExperimentsNullableDatadogMetricMeasureInput.JSON_PROPERTY_SOURCE_DEFINITION_FILTER,
  ExperimentsNullableDatadogMetricMeasureInput.JSON_PROPERTY_SOURCE_SUBTYPE,
  ExperimentsNullableDatadogMetricMeasureInput.JSON_PROPERTY_SOURCE_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsNullableDatadogMetricMeasureInput {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMN_NAME = "column_name";
  private String columnName;

  public static final String JSON_PROPERTY_COLUMN_TYPE = "column_type";
  private String columnType;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private Object filters = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_SOURCE_DEFINITION_FILTER = "source_definition_filter";
  private Object sourceDefinitionFilter = null;

  public static final String JSON_PROPERTY_SOURCE_SUBTYPE = "source_subtype";
  private String sourceSubtype;

  public static final String JSON_PROPERTY_SOURCE_TYPE = "source_type";
  private String sourceType;

  public ExperimentsNullableDatadogMetricMeasureInput() {}

  @JsonCreator
  public ExperimentsNullableDatadogMetricMeasureInput(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMN_TYPE) String columnType,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE_SUBTYPE) String sourceSubtype,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE_TYPE) String sourceType) {
    this.columnType = columnType;
    this.name = name;
    this.sourceSubtype = sourceSubtype;
    this.sourceType = sourceType;
  }

  public ExperimentsNullableDatadogMetricMeasureInput columnName(String columnName) {
    this.columnName = columnName;
    return this;
  }

  /**
   * Name of the Datadog event field used by this measure.
   *
   * @return columnName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLUMN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getColumnName() {
    return columnName;
  }

  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }

  public ExperimentsNullableDatadogMetricMeasureInput columnType(String columnType) {
    this.columnType = columnType;
    return this;
  }

  /**
   * Data type of the source column.
   *
   * @return columnType
   */
  @JsonProperty(JSON_PROPERTY_COLUMN_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getColumnType() {
    return columnType;
  }

  public void setColumnType(String columnType) {
    this.columnType = columnType;
  }

  public ExperimentsNullableDatadogMetricMeasureInput filters(Object filters) {
    this.filters = filters;
    return this;
  }

  /**
   * Conditions used to select the metric's source data.
   *
   * @return filters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getFilters() {
    return filters;
  }

  public void setFilters(Object filters) {
    this.filters = filters;
  }

  public ExperimentsNullableDatadogMetricMeasureInput name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name of the Datadog measure.
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

  public ExperimentsNullableDatadogMetricMeasureInput query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Query used to retrieve the Datadog measure.
   *
   * @return query
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public ExperimentsNullableDatadogMetricMeasureInput sourceDefinitionFilter(
      Object sourceDefinitionFilter) {
    this.sourceDefinitionFilter = sourceDefinitionFilter;
    return this;
  }

  /**
   * Filter applied to the Datadog source definition.
   *
   * @return sourceDefinitionFilter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_DEFINITION_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getSourceDefinitionFilter() {
    return sourceDefinitionFilter;
  }

  public void setSourceDefinitionFilter(Object sourceDefinitionFilter) {
    this.sourceDefinitionFilter = sourceDefinitionFilter;
  }

  public ExperimentsNullableDatadogMetricMeasureInput sourceSubtype(String sourceSubtype) {
    this.sourceSubtype = sourceSubtype;
    return this;
  }

  /**
   * Subtype of the Datadog data source.
   *
   * @return sourceSubtype
   */
  @JsonProperty(JSON_PROPERTY_SOURCE_SUBTYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSourceSubtype() {
    return sourceSubtype;
  }

  public void setSourceSubtype(String sourceSubtype) {
    this.sourceSubtype = sourceSubtype;
  }

  public ExperimentsNullableDatadogMetricMeasureInput sourceType(String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  /**
   * Type of Datadog data source used for the measure.
   *
   * @return sourceType
   */
  @JsonProperty(JSON_PROPERTY_SOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
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
   * @return ExperimentsNullableDatadogMetricMeasureInput
   */
  @JsonAnySetter
  public ExperimentsNullableDatadogMetricMeasureInput putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this ExperimentsNullableDatadogMetricMeasureInput object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsNullableDatadogMetricMeasureInput experimentsNullableDatadogMetricMeasureInput =
        (ExperimentsNullableDatadogMetricMeasureInput) o;
    return Objects.equals(this.columnName, experimentsNullableDatadogMetricMeasureInput.columnName)
        && Objects.equals(this.columnType, experimentsNullableDatadogMetricMeasureInput.columnType)
        && Objects.equals(this.filters, experimentsNullableDatadogMetricMeasureInput.filters)
        && Objects.equals(this.name, experimentsNullableDatadogMetricMeasureInput.name)
        && Objects.equals(this.query, experimentsNullableDatadogMetricMeasureInput.query)
        && Objects.equals(
            this.sourceDefinitionFilter,
            experimentsNullableDatadogMetricMeasureInput.sourceDefinitionFilter)
        && Objects.equals(
            this.sourceSubtype, experimentsNullableDatadogMetricMeasureInput.sourceSubtype)
        && Objects.equals(this.sourceType, experimentsNullableDatadogMetricMeasureInput.sourceType)
        && Objects.equals(
            this.additionalProperties,
            experimentsNullableDatadogMetricMeasureInput.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        columnName,
        columnType,
        filters,
        name,
        query,
        sourceDefinitionFilter,
        sourceSubtype,
        sourceType,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsNullableDatadogMetricMeasureInput {\n");
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    columnType: ").append(toIndentedString(columnType)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    sourceDefinitionFilter: ")
        .append(toIndentedString(sourceDefinitionFilter))
        .append("\n");
    sb.append("    sourceSubtype: ").append(toIndentedString(sourceSubtype)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
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
