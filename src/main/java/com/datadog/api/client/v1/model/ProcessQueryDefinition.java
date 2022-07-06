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

/** The process query to use in the widget. */
@JsonPropertyOrder({
  ProcessQueryDefinition.JSON_PROPERTY_FILTER_BY,
  ProcessQueryDefinition.JSON_PROPERTY_LIMIT,
  ProcessQueryDefinition.JSON_PROPERTY_METRIC,
  ProcessQueryDefinition.JSON_PROPERTY_SEARCH_BY
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProcessQueryDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILTER_BY = "filter_by";
  private List<String> filterBy = null;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public static final String JSON_PROPERTY_SEARCH_BY = "search_by";
  private String searchBy;

  public ProcessQueryDefinition() {}

  @JsonCreator
  public ProcessQueryDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_METRIC) String metric) {
    this.metric = metric;
  }

  public ProcessQueryDefinition filterBy(List<String> filterBy) {
    this.filterBy = filterBy;
    return this;
  }

  public ProcessQueryDefinition addFilterByItem(String filterByItem) {
    if (this.filterBy == null) {
      this.filterBy = new ArrayList<>();
    }
    this.filterBy.add(filterByItem);
    return this;
  }

  /**
   * List of processes.
   *
   * @return filterBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getFilterBy() {
    return filterBy;
  }

  public void setFilterBy(List<String> filterBy) {
    this.filterBy = filterBy;
  }

  public ProcessQueryDefinition limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Max number of items in the filter list. minimum: 0
   *
   * @return limit
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  public ProcessQueryDefinition metric(String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * Your chosen metric.
   *
   * @return metric
   */
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMetric() {
    return metric;
  }

  public void setMetric(String metric) {
    this.metric = metric;
  }

  public ProcessQueryDefinition searchBy(String searchBy) {
    this.searchBy = searchBy;
    return this;
  }

  /**
   * Your chosen search term.
   *
   * @return searchBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEARCH_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSearchBy() {
    return searchBy;
  }

  public void setSearchBy(String searchBy) {
    this.searchBy = searchBy;
  }

  /** Return true if this ProcessQueryDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessQueryDefinition processQueryDefinition = (ProcessQueryDefinition) o;
    return Objects.equals(this.filterBy, processQueryDefinition.filterBy)
        && Objects.equals(this.limit, processQueryDefinition.limit)
        && Objects.equals(this.metric, processQueryDefinition.metric)
        && Objects.equals(this.searchBy, processQueryDefinition.searchBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterBy, limit, metric, searchBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessQueryDefinition {\n");
    sb.append("    filterBy: ").append(toIndentedString(filterBy)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    searchBy: ").append(toIndentedString(searchBy)).append("\n");
    sb.append("}");
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
