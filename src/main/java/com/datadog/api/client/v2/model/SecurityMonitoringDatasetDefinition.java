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

/** The definition of a dataset, including its data source, name, indexes, and columns. */
@JsonPropertyOrder({
  SecurityMonitoringDatasetDefinition.JSON_PROPERTY_COLUMNS,
  SecurityMonitoringDatasetDefinition.JSON_PROPERTY_DATA_SOURCE,
  SecurityMonitoringDatasetDefinition.JSON_PROPERTY_INDEXES,
  SecurityMonitoringDatasetDefinition.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringDatasetDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<SecurityMonitoringDatasetDefinitionColumn> columns = new ArrayList<>();

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private String dataSource;

  public static final String JSON_PROPERTY_INDEXES = "indexes";
  private List<String> indexes = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public SecurityMonitoringDatasetDefinition() {}

  @JsonCreator
  public SecurityMonitoringDatasetDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMNS)
          List<SecurityMonitoringDatasetDefinitionColumn> columns,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE) String dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.columns = columns;
    this.dataSource = dataSource;
    this.name = name;
  }

  public SecurityMonitoringDatasetDefinition columns(
      List<SecurityMonitoringDatasetDefinitionColumn> columns) {
    this.columns = columns;
    for (SecurityMonitoringDatasetDefinitionColumn item : columns) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityMonitoringDatasetDefinition addColumnsItem(
      SecurityMonitoringDatasetDefinitionColumn columnsItem) {
    this.columns.add(columnsItem);
    this.unparsed |= columnsItem.unparsed;
    return this;
  }

  /**
   * The columns in the dataset.
   *
   * @return columns
   */
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SecurityMonitoringDatasetDefinitionColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<SecurityMonitoringDatasetDefinitionColumn> columns) {
    this.columns = columns;
  }

  public SecurityMonitoringDatasetDefinition dataSource(String dataSource) {
    this.dataSource = dataSource;
    return this;
  }

  /**
   * The data source for the dataset.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDataSource() {
    return dataSource;
  }

  public void setDataSource(String dataSource) {
    this.dataSource = dataSource;
  }

  public SecurityMonitoringDatasetDefinition indexes(List<String> indexes) {
    this.indexes = indexes;
    return this;
  }

  public SecurityMonitoringDatasetDefinition addIndexesItem(String indexesItem) {
    if (this.indexes == null) {
      this.indexes = new ArrayList<>();
    }
    this.indexes.add(indexesItem);
    return this;
  }

  /**
   * The indexes to use for the dataset.
   *
   * @return indexes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getIndexes() {
    return indexes;
  }

  public void setIndexes(List<String> indexes) {
    this.indexes = indexes;
  }

  public SecurityMonitoringDatasetDefinition name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the dataset. Must start with a letter, contain only lowercase letters, numbers, and
   * underscores, and be at most 255 characters long.
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
   * @return SecurityMonitoringDatasetDefinition
   */
  @JsonAnySetter
  public SecurityMonitoringDatasetDefinition putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecurityMonitoringDatasetDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringDatasetDefinition securityMonitoringDatasetDefinition =
        (SecurityMonitoringDatasetDefinition) o;
    return Objects.equals(this.columns, securityMonitoringDatasetDefinition.columns)
        && Objects.equals(this.dataSource, securityMonitoringDatasetDefinition.dataSource)
        && Objects.equals(this.indexes, securityMonitoringDatasetDefinition.indexes)
        && Objects.equals(this.name, securityMonitoringDatasetDefinition.name)
        && Objects.equals(
            this.additionalProperties, securityMonitoringDatasetDefinition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, dataSource, indexes, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringDatasetDefinition {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
