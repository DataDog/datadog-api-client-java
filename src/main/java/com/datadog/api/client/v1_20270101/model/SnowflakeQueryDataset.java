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
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  SnowflakeQueryDataset.JSON_PROPERTY_DATA_SOURCE,
  SnowflakeQueryDataset.JSON_PROPERTY_NAME,
  SnowflakeQueryDataset.JSON_PROPERTY_SQL_QUERY,
  SnowflakeQueryDataset.JSON_PROPERTY_WAREHOUSE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SnowflakeQueryDataset {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private SnowflakeQueryDatasetDataSource dataSource;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SQL_QUERY = "sql_query";
  private String sqlQuery;

  public static final String JSON_PROPERTY_WAREHOUSE = "warehouse";
  private String warehouse;

  public SnowflakeQueryDataset() {}

  @JsonCreator
  public SnowflakeQueryDataset(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          SnowflakeQueryDatasetDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SQL_QUERY) String sqlQuery) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.name = name;
    this.sqlQuery = sqlQuery;
  }

  public SnowflakeQueryDataset dataSource(SnowflakeQueryDatasetDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SnowflakeQueryDatasetDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(SnowflakeQueryDatasetDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public SnowflakeQueryDataset name(String name) {
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

  public SnowflakeQueryDataset sqlQuery(String sqlQuery) {
    this.sqlQuery = sqlQuery;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return sqlQuery
   */
  @JsonProperty(JSON_PROPERTY_SQL_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSqlQuery() {
    return sqlQuery;
  }

  public void setSqlQuery(String sqlQuery) {
    this.sqlQuery = sqlQuery;
  }

  public SnowflakeQueryDataset warehouse(String warehouse) {
    this.warehouse = warehouse;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return warehouse
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WAREHOUSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getWarehouse() {
    return warehouse;
  }

  public void setWarehouse(String warehouse) {
    this.warehouse = warehouse;
  }

  /** Return true if this SnowflakeQueryDataset object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnowflakeQueryDataset snowflakeQueryDataset = (SnowflakeQueryDataset) o;
    return Objects.equals(this.dataSource, snowflakeQueryDataset.dataSource)
        && Objects.equals(this.name, snowflakeQueryDataset.name)
        && Objects.equals(this.sqlQuery, snowflakeQueryDataset.sqlQuery)
        && Objects.equals(this.warehouse, snowflakeQueryDataset.warehouse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSource, name, sqlQuery, warehouse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnowflakeQueryDataset {\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sqlQuery: ").append(toIndentedString(sqlQuery)).append("\n");
    sb.append("    warehouse: ").append(toIndentedString(warehouse)).append("\n");
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
