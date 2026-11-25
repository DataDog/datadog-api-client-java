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
  FormulaChangeTrackingQuery.JSON_PROPERTY_COMPUTE,
  FormulaChangeTrackingQuery.JSON_PROPERTY_DATA_SOURCE,
  FormulaChangeTrackingQuery.JSON_PROPERTY_GROUP_BY,
  FormulaChangeTrackingQuery.JSON_PROPERTY_NAME,
  FormulaChangeTrackingQuery.JSON_PROPERTY_SEARCH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormulaChangeTrackingQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private FormulaAndFunctionEventQueryDefinitionCompute compute;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private FormulaChangeTrackingQueryDataSource dataSource;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<FormulaAndFunctionEventQueryGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SEARCH = "search";
  private FormulaChangeTrackingQuerySearch search;

  public FormulaChangeTrackingQuery() {}

  @JsonCreator
  public FormulaChangeTrackingQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPUTE)
          FormulaAndFunctionEventQueryDefinitionCompute compute,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          FormulaChangeTrackingQueryDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEARCH)
          FormulaChangeTrackingQuerySearch search) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.name = name;
    this.search = search;
    this.unparsed |= search.unparsed;
  }

  public FormulaChangeTrackingQuery compute(FormulaAndFunctionEventQueryDefinitionCompute compute) {
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
  public FormulaAndFunctionEventQueryDefinitionCompute getCompute() {
    return compute;
  }

  public void setCompute(FormulaAndFunctionEventQueryDefinitionCompute compute) {
    this.compute = compute;
    if (compute != null) {
      this.unparsed |= compute.unparsed;
    }
  }

  public FormulaChangeTrackingQuery dataSource(FormulaChangeTrackingQueryDataSource dataSource) {
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
  public FormulaChangeTrackingQueryDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(FormulaChangeTrackingQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public FormulaChangeTrackingQuery groupBy(List<FormulaAndFunctionEventQueryGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (FormulaAndFunctionEventQueryGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public FormulaChangeTrackingQuery addGroupByItem(
      FormulaAndFunctionEventQueryGroupBy groupByItem) {
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
  public List<FormulaAndFunctionEventQueryGroupBy> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<FormulaAndFunctionEventQueryGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (FormulaAndFunctionEventQueryGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public FormulaChangeTrackingQuery name(String name) {
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

  public FormulaChangeTrackingQuery search(FormulaChangeTrackingQuerySearch search) {
    this.search = search;
    this.unparsed |= search.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return search
   */
  @JsonProperty(JSON_PROPERTY_SEARCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FormulaChangeTrackingQuerySearch getSearch() {
    return search;
  }

  public void setSearch(FormulaChangeTrackingQuerySearch search) {
    this.search = search;
    if (search != null) {
      this.unparsed |= search.unparsed;
    }
  }

  /** Return true if this FormulaChangeTrackingQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaChangeTrackingQuery formulaChangeTrackingQuery = (FormulaChangeTrackingQuery) o;
    return Objects.equals(this.compute, formulaChangeTrackingQuery.compute)
        && Objects.equals(this.dataSource, formulaChangeTrackingQuery.dataSource)
        && Objects.equals(this.groupBy, formulaChangeTrackingQuery.groupBy)
        && Objects.equals(this.name, formulaChangeTrackingQuery.name)
        && Objects.equals(this.search, formulaChangeTrackingQuery.search);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compute, dataSource, groupBy, name, search);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaChangeTrackingQuery {\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
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
