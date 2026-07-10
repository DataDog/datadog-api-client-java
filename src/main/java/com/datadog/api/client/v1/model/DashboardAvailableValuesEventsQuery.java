/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Query for available values using an events-based data source (spans, logs, or rum). */
@JsonPropertyOrder({
  DashboardAvailableValuesEventsQuery.JSON_PROPERTY_DATA_SOURCE,
  DashboardAvailableValuesEventsQuery.JSON_PROPERTY_GROUP_BY,
  DashboardAvailableValuesEventsQuery.JSON_PROPERTY_SEARCH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DashboardAvailableValuesEventsQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private DashboardAvailableValuesEventsDataSource dataSource;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<DashboardAvailableValuesEventsQueryGroupByItems> groupBy = new ArrayList<>();

  public static final String JSON_PROPERTY_SEARCH = "search";
  private DashboardAvailableValuesEventsQuerySearch search;

  public DashboardAvailableValuesEventsQuery() {}

  @JsonCreator
  public DashboardAvailableValuesEventsQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          DashboardAvailableValuesEventsDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_GROUP_BY)
          List<DashboardAvailableValuesEventsQueryGroupByItems> groupBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEARCH)
          DashboardAvailableValuesEventsQuerySearch search) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.groupBy = groupBy;
    this.search = search;
    this.unparsed |= search.unparsed;
  }

  public DashboardAvailableValuesEventsQuery dataSource(
      DashboardAvailableValuesEventsDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * The events-based data source for the query.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DashboardAvailableValuesEventsDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(DashboardAvailableValuesEventsDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public DashboardAvailableValuesEventsQuery groupBy(
      List<DashboardAvailableValuesEventsQueryGroupByItems> groupBy) {
    this.groupBy = groupBy;
    for (DashboardAvailableValuesEventsQueryGroupByItems item : groupBy) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DashboardAvailableValuesEventsQuery addGroupByItem(
      DashboardAvailableValuesEventsQueryGroupByItems groupByItem) {
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * The fields to group by in the query.
   *
   * @return groupBy
   */
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<DashboardAvailableValuesEventsQueryGroupByItems> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<DashboardAvailableValuesEventsQueryGroupByItems> groupBy) {
    this.groupBy = groupBy;
  }

  public DashboardAvailableValuesEventsQuery search(
      DashboardAvailableValuesEventsQuerySearch search) {
    this.search = search;
    this.unparsed |= search.unparsed;
    return this;
  }

  /**
   * The search filter for the query.
   *
   * @return search
   */
  @JsonProperty(JSON_PROPERTY_SEARCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DashboardAvailableValuesEventsQuerySearch getSearch() {
    return search;
  }

  public void setSearch(DashboardAvailableValuesEventsQuerySearch search) {
    this.search = search;
  }

  /** Return true if this DashboardAvailableValuesEventsQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardAvailableValuesEventsQuery dashboardAvailableValuesEventsQuery =
        (DashboardAvailableValuesEventsQuery) o;
    return Objects.equals(this.dataSource, dashboardAvailableValuesEventsQuery.dataSource)
        && Objects.equals(this.groupBy, dashboardAvailableValuesEventsQuery.groupBy)
        && Objects.equals(this.search, dashboardAvailableValuesEventsQuery.search);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSource, groupBy, search);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardAvailableValuesEventsQuery {\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
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
