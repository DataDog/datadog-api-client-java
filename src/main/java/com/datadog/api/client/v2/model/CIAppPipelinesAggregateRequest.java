/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The object sent with the request to retrieve aggregation buckets of pipeline events from your
 * organization.
 */
@JsonPropertyOrder({
  CIAppPipelinesAggregateRequest.JSON_PROPERTY_COMPUTE,
  CIAppPipelinesAggregateRequest.JSON_PROPERTY_FILTER,
  CIAppPipelinesAggregateRequest.JSON_PROPERTY_GROUP_BY,
  CIAppPipelinesAggregateRequest.JSON_PROPERTY_OPTIONS,
  CIAppPipelinesAggregateRequest.JSON_PROPERTY_PAGE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CIAppPipelinesAggregateRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private List<CIAppCompute> compute = null;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private CIAppPipelinesQueryFilter filter;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<CIAppPipelinesGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private CIAppQueryOptions options;

  public static final String JSON_PROPERTY_PAGE = "page";
  private CIAppQueryPageOptions page;

  public CIAppPipelinesAggregateRequest compute(List<CIAppCompute> compute) {
    this.compute = compute;
    for (CIAppCompute item : compute) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CIAppPipelinesAggregateRequest addComputeItem(CIAppCompute computeItem) {
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
  public List<CIAppCompute> getCompute() {
    return compute;
  }

  public void setCompute(List<CIAppCompute> compute) {
    this.compute = compute;
  }

  public CIAppPipelinesAggregateRequest filter(CIAppPipelinesQueryFilter filter) {
    this.filter = filter;
    this.unparsed |= filter.unparsed;
    return this;
  }

  /**
   * The search and filter query settings.
   *
   * @return filter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CIAppPipelinesQueryFilter getFilter() {
    return filter;
  }

  public void setFilter(CIAppPipelinesQueryFilter filter) {
    this.filter = filter;
  }

  public CIAppPipelinesAggregateRequest groupBy(List<CIAppPipelinesGroupBy> groupBy) {
    this.groupBy = groupBy;
    for (CIAppPipelinesGroupBy item : groupBy) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CIAppPipelinesAggregateRequest addGroupByItem(CIAppPipelinesGroupBy groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * The rules for the group-by.
   *
   * @return groupBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<CIAppPipelinesGroupBy> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<CIAppPipelinesGroupBy> groupBy) {
    this.groupBy = groupBy;
  }

  public CIAppPipelinesAggregateRequest options(CIAppQueryOptions options) {
    this.options = options;
    this.unparsed |= options.unparsed;
    return this;
  }

  /**
   * Global query options that are used during the query. Only supply timezone or time offset, not
   * both. Otherwise, the query fails.
   *
   * @return options
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CIAppQueryOptions getOptions() {
    return options;
  }

  public void setOptions(CIAppQueryOptions options) {
    this.options = options;
  }

  public CIAppPipelinesAggregateRequest page(CIAppQueryPageOptions page) {
    this.page = page;
    this.unparsed |= page.unparsed;
    return this;
  }

  /**
   * Paging attributes for listing events.
   *
   * @return page
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CIAppQueryPageOptions getPage() {
    return page;
  }

  public void setPage(CIAppQueryPageOptions page) {
    this.page = page;
  }

  /** Return true if this CIAppPipelinesAggregateRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CIAppPipelinesAggregateRequest ciAppPipelinesAggregateRequest =
        (CIAppPipelinesAggregateRequest) o;
    return Objects.equals(this.compute, ciAppPipelinesAggregateRequest.compute)
        && Objects.equals(this.filter, ciAppPipelinesAggregateRequest.filter)
        && Objects.equals(this.groupBy, ciAppPipelinesAggregateRequest.groupBy)
        && Objects.equals(this.options, ciAppPipelinesAggregateRequest.options)
        && Objects.equals(this.page, ciAppPipelinesAggregateRequest.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compute, filter, groupBy, options, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CIAppPipelinesAggregateRequest {\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
