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
  CompositeReferentialDataQuery.JSON_PROPERTY_COLUMNS,
  CompositeReferentialDataQuery.JSON_PROPERTY_COMPUTE,
  CompositeReferentialDataQuery.JSON_PROPERTY_DATA_SOURCE,
  CompositeReferentialDataQuery.JSON_PROPERTY_GROUP_BY,
  CompositeReferentialDataQuery.JSON_PROPERTY_NAME,
  CompositeReferentialDataQuery.JSON_PROPERTY_QUERY_FILTER,
  CompositeReferentialDataQuery.JSON_PROPERTY_TABLE_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CompositeReferentialDataQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<ListColumn> columns = null;

  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private List<CompositeReferentialDataQueryComputeItems> compute = null;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private CompositeReferentialDataQueryDataSource dataSource;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<String> groupBy = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY_FILTER = "query_filter";
  private String queryFilter;

  public static final String JSON_PROPERTY_TABLE_NAME = "table_name";
  private String tableName;

  public CompositeReferentialDataQuery() {}

  @JsonCreator
  public CompositeReferentialDataQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          CompositeReferentialDataQueryDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TABLE_NAME) String tableName) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.name = name;
    this.tableName = tableName;
  }

  public CompositeReferentialDataQuery columns(List<ListColumn> columns) {
    this.columns = columns;
    if (columns != null) {
      for (ListColumn item : columns) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public CompositeReferentialDataQuery addColumnsItem(ListColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    this.unparsed |= columnsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return columns
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ListColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<ListColumn> columns) {
    this.columns = columns;
    if (columns != null) {
      for (ListColumn item : columns) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public CompositeReferentialDataQuery compute(
      List<CompositeReferentialDataQueryComputeItems> compute) {
    this.compute = compute;
    if (compute != null) {
      for (CompositeReferentialDataQueryComputeItems item : compute) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public CompositeReferentialDataQuery addComputeItem(
      CompositeReferentialDataQueryComputeItems computeItem) {
    if (this.compute == null) {
      this.compute = new ArrayList<>();
    }
    this.compute.add(computeItem);
    this.unparsed |= computeItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return compute
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<CompositeReferentialDataQueryComputeItems> getCompute() {
    return compute;
  }

  public void setCompute(List<CompositeReferentialDataQueryComputeItems> compute) {
    this.compute = compute;
    if (compute != null) {
      for (CompositeReferentialDataQueryComputeItems item : compute) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public CompositeReferentialDataQuery dataSource(
      CompositeReferentialDataQueryDataSource dataSource) {
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
  public CompositeReferentialDataQueryDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(CompositeReferentialDataQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public CompositeReferentialDataQuery groupBy(List<String> groupBy) {
    this.groupBy = groupBy;
    return this;
  }

  public CompositeReferentialDataQuery addGroupByItem(String groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
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
  public List<String> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<String> groupBy) {
    this.groupBy = groupBy;
  }

  public CompositeReferentialDataQuery name(String name) {
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

  public CompositeReferentialDataQuery queryFilter(String queryFilter) {
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

  public CompositeReferentialDataQuery tableName(String tableName) {
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

  /** Return true if this CompositeReferentialDataQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompositeReferentialDataQuery compositeReferentialDataQuery = (CompositeReferentialDataQuery) o;
    return Objects.equals(this.columns, compositeReferentialDataQuery.columns)
        && Objects.equals(this.compute, compositeReferentialDataQuery.compute)
        && Objects.equals(this.dataSource, compositeReferentialDataQuery.dataSource)
        && Objects.equals(this.groupBy, compositeReferentialDataQuery.groupBy)
        && Objects.equals(this.name, compositeReferentialDataQuery.name)
        && Objects.equals(this.queryFilter, compositeReferentialDataQuery.queryFilter)
        && Objects.equals(this.tableName, compositeReferentialDataQuery.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, compute, dataSource, groupBy, name, queryFilter, tableName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompositeReferentialDataQuery {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
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
