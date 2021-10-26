/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** The request for a logs list. */
@ApiModel(description = "The request for a logs list.")
@JsonPropertyOrder({
  LogsListRequest.JSON_PROPERTY_FILTER,
  LogsListRequest.JSON_PROPERTY_OPTIONS,
  LogsListRequest.JSON_PROPERTY_PAGE,
  LogsListRequest.JSON_PROPERTY_SORT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogsListRequest {
  @JsonIgnore public boolean unparsed = false;
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
   * Get filter
   *
   * @return filter
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * Get options
   *
   * @return options
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * Get page
   *
   * @return page
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * Get sort
   *
   * @return sort
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogsSort getSort() {
    return sort;
  }

  public void setSort(LogsSort sort) {
    if (!sort.isValid()) {
      this.unparsed = true;
    }
    this.sort = sort;
  }

  /** Return true if this LogsListRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsListRequest logsListRequest = (LogsListRequest) o;
    return Objects.equals(this.filter, logsListRequest.filter)
        && Objects.equals(this.options, logsListRequest.options)
        && Objects.equals(this.page, logsListRequest.page)
        && Objects.equals(this.sort, logsListRequest.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, options, page, sort);
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
