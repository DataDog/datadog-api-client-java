/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>The request for a logs list.</p>
 */
@JsonPropertyOrder({
  LogsListRequest.JSON_PROPERTY_FILTER,
  LogsListRequest.JSON_PROPERTY_OPTIONS,
  LogsListRequest.JSON_PROPERTY_PAGE,
  LogsListRequest.JSON_PROPERTY_SORT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsListRequest {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILTER = "filter";
  private LogsQueryFilter filter;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private LogsQueryOptions options;

  public static final String JSON_PROPERTY_PAGE = "page";
  private LogsListRequestPage page;

  public static final String JSON_PROPERTY_SORT = "sort";
  private LogsSort sort;

  public LogsListRequest filter(LogsQueryFilter filter) {
    this.filter = filter;
    this.unparsed |= filter.unparsed;
    return this;
  }

  /**
   * <p>The search and filter query settings</p>
   * @return filter
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FILTER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public LogsQueryFilter getFilter() {
        return filter;
      }
  public void setFilter(LogsQueryFilter filter) {
    this.filter = filter;
  }
  public LogsListRequest options(LogsQueryOptions options) {
    this.options = options;
    this.unparsed |= options.unparsed;
    return this;
  }

  /**
   * <p>Global query options that are used during the query.
   * Note: You should only supply timezone or time offset but not both otherwise the query will fail.</p>
   * @return options
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OPTIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public LogsQueryOptions getOptions() {
        return options;
      }
  public void setOptions(LogsQueryOptions options) {
    this.options = options;
  }
  public LogsListRequest page(LogsListRequestPage page) {
    this.page = page;
    this.unparsed |= page.unparsed;
    return this;
  }

  /**
   * <p>Paging attributes for listing logs.</p>
   * @return page
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public LogsListRequestPage getPage() {
        return page;
      }
  public void setPage(LogsListRequestPage page) {
    this.page = page;
  }
  public LogsListRequest sort(LogsSort sort) {
    this.sort = sort;
    this.unparsed |= !sort.isValid();
    return this;
  }

  /**
   * <p>Sort parameters when querying logs.</p>
   * @return sort
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SORT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public LogsSort getSort() {
        return sort;
      }
  public void setSort(LogsSort sort) {
    if (!sort.isValid()) {
        this.unparsed = true;
    }
    this.sort = sort;
  }

  /**
   * Return true if this LogsListRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsListRequest logsListRequest = (LogsListRequest) o;
    return Objects.equals(this.filter, logsListRequest.filter) && Objects.equals(this.options, logsListRequest.options) && Objects.equals(this.page, logsListRequest.page) && Objects.equals(this.sort, logsListRequest.sort);
  }


  @Override
  public int hashCode() {
    return Objects.hash(filter,options,page,sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsListRequest {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
