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
  FormulaReferenceTableQuery.JSON_PROPERTY_COMPUTE,
  FormulaReferenceTableQuery.JSON_PROPERTY_DATA_SOURCE,
  FormulaReferenceTableQuery.JSON_PROPERTY_GROUP_BY,
  FormulaReferenceTableQuery.JSON_PROPERTY_NAME,
  FormulaReferenceTableQuery.JSON_PROPERTY_QUERY_FILTER,
  FormulaReferenceTableQuery.JSON_PROPERTY_TABLE_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormulaReferenceTableQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private List<DatasetCompute> compute = new ArrayList<>();

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private FormulaReferenceTableQueryDataSource dataSource;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<DatasetGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY_FILTER = "query_filter";
  private String queryFilter;

  public static final String JSON_PROPERTY_TABLE_NAME = "table_name";
  private String tableName;

  public FormulaReferenceTableQuery() {}

  @JsonCreator
  public FormulaReferenceTableQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPUTE) List<DatasetCompute> compute,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          FormulaReferenceTableQueryDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TABLE_NAME) String tableName) {
    this.compute = compute;
    for (DatasetCompute item : compute) {
      this.unparsed |= item.unparsed;
    }
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.name = name;
    this.tableName = tableName;
  }

  public FormulaReferenceTableQuery compute(List<DatasetCompute> compute) {
    this.compute = compute;
    for (DatasetCompute item : compute) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public FormulaReferenceTableQuery addComputeItem(DatasetCompute computeItem) {
    this.compute.add(computeItem);
    this.unparsed |= computeItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return compute
   */
  @JsonProperty(JSON_PROPERTY_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<DatasetCompute> getCompute() {
    return compute;
  }

  public void setCompute(List<DatasetCompute> compute) {
    this.compute = compute;
    if (compute != null) {
      for (DatasetCompute item : compute) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public FormulaReferenceTableQuery dataSource(FormulaReferenceTableQueryDataSource dataSource) {
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
  public FormulaReferenceTableQueryDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(FormulaReferenceTableQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public FormulaReferenceTableQuery groupBy(List<DatasetGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (DatasetGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public FormulaReferenceTableQuery addGroupByItem(DatasetGroupBy groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return groupBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DatasetGroupBy> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<DatasetGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (DatasetGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public FormulaReferenceTableQuery name(String name) {
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

  public FormulaReferenceTableQuery queryFilter(String queryFilter) {
    this.queryFilter = queryFilter;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return queryFilter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQueryFilter() {
    return queryFilter;
  }

  public void setQueryFilter(String queryFilter) {
    this.queryFilter = queryFilter;
  }

  public FormulaReferenceTableQuery tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return tableName
   */
  @JsonProperty(JSON_PROPERTY_TABLE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  /** Return true if this FormulaReferenceTableQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaReferenceTableQuery formulaReferenceTableQuery = (FormulaReferenceTableQuery) o;
    return Objects.equals(this.compute, formulaReferenceTableQuery.compute)
        && Objects.equals(this.dataSource, formulaReferenceTableQuery.dataSource)
        && Objects.equals(this.groupBy, formulaReferenceTableQuery.groupBy)
        && Objects.equals(this.name, formulaReferenceTableQuery.name)
        && Objects.equals(this.queryFilter, formulaReferenceTableQuery.queryFilter)
        && Objects.equals(this.tableName, formulaReferenceTableQuery.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compute, dataSource, groupBy, name, queryFilter, tableName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaReferenceTableQuery {\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    queryFilter: ").append(toIndentedString(queryFilter)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
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
