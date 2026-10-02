/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Datadog source and query that supply values for the metric. */
@JsonPropertyOrder({
  ExperimentsMetricV2DTODataAttributesPercentileAggregationDatadogMetricMeasure
      .JSON_PROPERTY_COLUMN_NAME,
  ExperimentsMetricV2DTODataAttributesPercentileAggregationDatadogMetricMeasure
      .JSON_PROPERTY_COLUMN_TYPE,
  ExperimentsMetricV2DTODataAttributesPercentileAggregationDatadogMetricMeasure
      .JSON_PROPERTY_FILTERS,
  ExperimentsMetricV2DTODataAttributesPercentileAggregationDatadogMetricMeasure.JSON_PROPERTY_NAME,
  ExperimentsMetricV2DTODataAttributesPercentileAggregationDatadogMetricMeasure.JSON_PROPERTY_QUERY,
  ExperimentsMetricV2DTODataAttributesPercentileAggregationDatadogMetricMeasure
      .JSON_PROPERTY_SOURCE_DEFINITION_FILTER,
  ExperimentsMetricV2DTODataAttributesPercentileAggregationDatadogMetricMeasure
      .JSON_PROPERTY_SOURCE_SUBTYPE,
  ExperimentsMetricV2DTODataAttributesPercentileAggregationDatadogMetricMeasure
      .JSON_PROPERTY_SOURCE_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsMetricV2DTODataAttributesPercentileAggregationDatadogMetricMeasure {
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

  public ExperimentsMetricV2DTODataAttributesPercentileAggregationDatadogMetricMeasure columnName(
      String columnName) {
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

  public ExperimentsMetricV2DTODataAttributesPercentileAggregationDatadogMetricMeasure columnType(
      String columnType) {
    this.columnType = columnType;
    return this;
  }

  /**
   * Data type of the source column.
   *
   * @return columnType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLUMN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getColumnType() {
    return columnType;
  }

  public void setColumnType(String columnType) {
    this.columnType = columnType;
  }

  public ExperimentsMetricV2DTODataAttributesPercentileAggregationDatadogMetricMeasure filters(
      Object filters) {
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

  public ExperimentsMetricV2DTODataAttributesPercentileAggregationDatadogMetricMeasure name(
      String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name of the Datadog measure.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ExperimentsMetricV2DTODataAttributesPercentileAggregationDatadogMetricMeasure query(
      String query) {
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

  public ExperimentsMetricV2DTODataAttributesPercentileAggregationDatadogMetricMeasure
      sourceDefinitionFilter(Object sourceDefinitionFilter) {
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

  public ExperimentsMetricV2DTODataAttributesPercentileAggregationDatadogMetricMeasure
      sourceSubtype(String sourceSubtype) {
    this.sourceSubtype = sourceSubtype;
    return this;
  }

  /**
   * Subtype of the Datadog data source.
   *
   * @return sourceSubtype
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_SUBTYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSourceSubtype() {
    return sourceSubtype;
  }

  public void setSourceSubtype(String sourceSubtype) {
    this.sourceSubtype = sourceSubtype;
  }

  public ExperimentsMetricV2DTODataAttributesPercentileAggregationDatadogMetricMeasure sourceType(
      String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  /**
   * Type of Datadog data source used for the measure.
   *
   * @return sourceType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * @return ExperimentsMetricV2DTODataAttributesPercentileAggregationDatadogMetricMeasure
   */
  @JsonAnySetter
  public ExperimentsMetricV2DTODataAttributesPercentileAggregationDatadogMetricMeasure
      putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this
   * ExperimentsMetricV2DTODataAttributesPercentileAggregationDatadogMetricMeasure object is equal
   * to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsMetricV2DTODataAttributesPercentileAggregationDatadogMetricMeasure
        experimentsMetricV2DtoDataAttributesPercentileAggregationDatadogMetricMeasure =
            (ExperimentsMetricV2DTODataAttributesPercentileAggregationDatadogMetricMeasure) o;
    return Objects.equals(
            this.columnName,
            experimentsMetricV2DtoDataAttributesPercentileAggregationDatadogMetricMeasure
                .columnName)
        && Objects.equals(
            this.columnType,
            experimentsMetricV2DtoDataAttributesPercentileAggregationDatadogMetricMeasure
                .columnType)
        && Objects.equals(
            this.filters,
            experimentsMetricV2DtoDataAttributesPercentileAggregationDatadogMetricMeasure.filters)
        && Objects.equals(
            this.name,
            experimentsMetricV2DtoDataAttributesPercentileAggregationDatadogMetricMeasure.name)
        && Objects.equals(
            this.query,
            experimentsMetricV2DtoDataAttributesPercentileAggregationDatadogMetricMeasure.query)
        && Objects.equals(
            this.sourceDefinitionFilter,
            experimentsMetricV2DtoDataAttributesPercentileAggregationDatadogMetricMeasure
                .sourceDefinitionFilter)
        && Objects.equals(
            this.sourceSubtype,
            experimentsMetricV2DtoDataAttributesPercentileAggregationDatadogMetricMeasure
                .sourceSubtype)
        && Objects.equals(
            this.sourceType,
            experimentsMetricV2DtoDataAttributesPercentileAggregationDatadogMetricMeasure
                .sourceType)
        && Objects.equals(
            this.additionalProperties,
            experimentsMetricV2DtoDataAttributesPercentileAggregationDatadogMetricMeasure
                .additionalProperties);
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
    sb.append(
        "class ExperimentsMetricV2DTODataAttributesPercentileAggregationDatadogMetricMeasure {\n");
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
