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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The object sent with the request to retrieve a list of logs from your organization. */
@JsonPropertyOrder({
  LogsAggregateRequest.JSON_PROPERTY_COMPUTE,
  LogsAggregateRequest.JSON_PROPERTY_FILTER,
  LogsAggregateRequest.JSON_PROPERTY_GROUP_BY,
  LogsAggregateRequest.JSON_PROPERTY_OPTIONS,
  LogsAggregateRequest.JSON_PROPERTY_PAGE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsAggregateRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private List<LogsCompute> compute = null;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private LogsQueryFilter filter;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<LogsGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private LogsQueryOptions options;

  public static final String JSON_PROPERTY_PAGE = "page";
  private LogsAggregateRequestPage page;

  public LogsAggregateRequest compute(List<LogsCompute> compute) {
    this.compute = compute;
    for (LogsCompute item : compute) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LogsAggregateRequest addComputeItem(LogsCompute computeItem) {
    if (this.compute == null) {
      this.compute = new ArrayList<>();
    }
    this.compute.add(computeItem);
    this.unparsed |= computeItem.unparsed;
    return this;
  }

  /**
   * The list of metrics or timeseries to compute for the retrieved buckets.
   *
   * @return compute
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LogsCompute> getCompute() {
    return compute;
  }

  public void setCompute(List<LogsCompute> compute) {
    this.compute = compute;
  }

  public LogsAggregateRequest filter(LogsQueryFilter filter) {
    this.filter = filter;
    this.unparsed |= filter.unparsed;
    return this;
  }

  /**
   * The search and filter query settings
   *
   * @return filter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogsQueryFilter getFilter() {
    return filter;
  }

  public void setFilter(LogsQueryFilter filter) {
    this.filter = filter;
  }

  public LogsAggregateRequest groupBy(List<LogsGroupBy> groupBy) {
    this.groupBy = groupBy;
    for (LogsGroupBy item : groupBy) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LogsAggregateRequest addGroupByItem(LogsGroupBy groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * The rules for the group by
   *
   * @return groupBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LogsGroupBy> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<LogsGroupBy> groupBy) {
    this.groupBy = groupBy;
  }

  public LogsAggregateRequest options(LogsQueryOptions options) {
    this.options = options;
    this.unparsed |= options.unparsed;
    return this;
  }

  /**
   * Global query options that are used during the query. Note: These fields are currently
   * deprecated and do not affect the query results.
   *
   * @return options
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogsQueryOptions getOptions() {
    return options;
  }

  @Deprecated
  public void setOptions(LogsQueryOptions options) {
    this.options = options;
  }

  public LogsAggregateRequest page(LogsAggregateRequestPage page) {
    this.page = page;
    this.unparsed |= page.unparsed;
    return this;
  }

  /**
   * Paging settings
   *
   * @return page
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogsAggregateRequestPage getPage() {
    return page;
  }

  public void setPage(LogsAggregateRequestPage page) {
    this.page = page;
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
   * @return LogsAggregateRequest
   */
  @JsonAnySetter
  public LogsAggregateRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LogsAggregateRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsAggregateRequest logsAggregateRequest = (LogsAggregateRequest) o;
    return Objects.equals(this.compute, logsAggregateRequest.compute)
        && Objects.equals(this.filter, logsAggregateRequest.filter)
        && Objects.equals(this.groupBy, logsAggregateRequest.groupBy)
        && Objects.equals(this.options, logsAggregateRequest.options)
        && Objects.equals(this.page, logsAggregateRequest.page)
        && Objects.equals(this.additionalProperties, logsAggregateRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compute, filter, groupBy, options, page, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsAggregateRequest {\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
