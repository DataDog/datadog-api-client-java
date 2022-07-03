/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** The log query. */
@JsonPropertyOrder({
  LogQueryDefinition.JSON_PROPERTY_COMPUTE,
  LogQueryDefinition.JSON_PROPERTY_GROUP_BY,
  LogQueryDefinition.JSON_PROPERTY_INDEX,
  LogQueryDefinition.JSON_PROPERTY_MULTI_COMPUTE,
  LogQueryDefinition.JSON_PROPERTY_SEARCH
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogQueryDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private LogsQueryCompute compute;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<LogQueryDefinitionGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_INDEX = "index";
  private String index;

  public static final String JSON_PROPERTY_MULTI_COMPUTE = "multi_compute";
  private List<LogsQueryCompute> multiCompute = null;

  public static final String JSON_PROPERTY_SEARCH = "search";
  private LogQueryDefinitionSearch search;

  public LogQueryDefinition compute(LogsQueryCompute compute) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    return this;
  }

  /**
   * Define computation for a log query.
   *
   * @return compute
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogsQueryCompute getCompute() {
    return compute;
  }

  public void setCompute(LogsQueryCompute compute) {
    this.compute = compute;
  }

  public LogQueryDefinition groupBy(List<LogQueryDefinitionGroupBy> groupBy) {
    this.groupBy = groupBy;
    for (LogQueryDefinitionGroupBy item : groupBy) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LogQueryDefinition addGroupByItem(LogQueryDefinitionGroupBy groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * List of tag prefixes to group by in the case of a cluster check.
   *
   * @return groupBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LogQueryDefinitionGroupBy> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<LogQueryDefinitionGroupBy> groupBy) {
    this.groupBy = groupBy;
  }

  public LogQueryDefinition index(String index) {
    this.index = index;
    return this;
  }

  /**
   * A coma separated-list of index names. Use "*" query all indexes at once. <a
   * href="https://docs.datadoghq.com/logs/indexes/#multiple-indexes">Multiple Indexes</a>
   *
   * @return index
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIndex() {
    return index;
  }

  public void setIndex(String index) {
    this.index = index;
  }

  public LogQueryDefinition multiCompute(List<LogsQueryCompute> multiCompute) {
    this.multiCompute = multiCompute;
    for (LogsQueryCompute item : multiCompute) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LogQueryDefinition addMultiComputeItem(LogsQueryCompute multiComputeItem) {
    if (this.multiCompute == null) {
      this.multiCompute = new ArrayList<>();
    }
    this.multiCompute.add(multiComputeItem);
    this.unparsed |= multiComputeItem.unparsed;
    return this;
  }

  /**
   * This field is mutually exclusive with <code>compute</code>.
   *
   * @return multiCompute
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MULTI_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LogsQueryCompute> getMultiCompute() {
    return multiCompute;
  }

  public void setMultiCompute(List<LogsQueryCompute> multiCompute) {
    this.multiCompute = multiCompute;
  }

  public LogQueryDefinition search(LogQueryDefinitionSearch search) {
    this.search = search;
    this.unparsed |= search.unparsed;
    return this;
  }

  /**
   * The query being made on the logs.
   *
   * @return search
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEARCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogQueryDefinitionSearch getSearch() {
    return search;
  }

  public void setSearch(LogQueryDefinitionSearch search) {
    this.search = search;
  }

  /** Return true if this LogQueryDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogQueryDefinition logQueryDefinition = (LogQueryDefinition) o;
    return Objects.equals(this.compute, logQueryDefinition.compute)
        && Objects.equals(this.groupBy, logQueryDefinition.groupBy)
        && Objects.equals(this.index, logQueryDefinition.index)
        && Objects.equals(this.multiCompute, logQueryDefinition.multiCompute)
        && Objects.equals(this.search, logQueryDefinition.search);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compute, groupBy, index, multiCompute, search);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogQueryDefinition {\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    multiCompute: ").append(toIndentedString(multiCompute)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
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
