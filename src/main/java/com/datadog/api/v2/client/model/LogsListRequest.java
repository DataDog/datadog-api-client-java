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

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v2.client.model.LogsListRequestFilter;
import com.datadog.api.v2.client.model.LogsListRequestPage;
import com.datadog.api.v2.client.model.LogsSort;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v2.client.JSON;


/**
 * The request for a logs list.
 */
@ApiModel(description = "The request for a logs list.")
@JsonPropertyOrder({
  LogsListRequest.JSON_PROPERTY_FILTER,
  LogsListRequest.JSON_PROPERTY_PAGE,
  LogsListRequest.JSON_PROPERTY_SORT
})

public class LogsListRequest {
  public static final String JSON_PROPERTY_FILTER = "filter";
  private LogsListRequestFilter filter;

  public static final String JSON_PROPERTY_PAGE = "page";
  private LogsListRequestPage page;

  public static final String JSON_PROPERTY_SORT = "sort";
  private LogsSort sort;


  public LogsListRequest filter(LogsListRequestFilter filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LogsListRequestFilter getFilter() {
    return filter;
  }


  public void setFilter(LogsListRequestFilter filter) {
    this.filter = filter;
  }


  public LogsListRequest page(LogsListRequestPage page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
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
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LogsSort getSort() {
    return sort;
  }


  public void setSort(LogsSort sort) {
    this.sort = sort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsListRequest logsListRequest = (LogsListRequest) o;
    return Objects.equals(this.filter, logsListRequest.filter) &&
        Objects.equals(this.page, logsListRequest.page) &&
        Objects.equals(this.sort, logsListRequest.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, page, sort);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsListRequest {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

