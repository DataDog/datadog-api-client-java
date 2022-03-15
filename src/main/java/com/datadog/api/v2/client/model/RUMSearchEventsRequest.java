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

/** The request for a RUM events list. */
@ApiModel(description = "The request for a RUM events list.")
@JsonPropertyOrder({
  RUMSearchEventsRequest.JSON_PROPERTY_FILTER,
  RUMSearchEventsRequest.JSON_PROPERTY_OPTIONS,
  RUMSearchEventsRequest.JSON_PROPERTY_PAGE,
  RUMSearchEventsRequest.JSON_PROPERTY_SORT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RUMSearchEventsRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILTER = "filter";
  private RUMQueryFilter filter;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private RUMQueryOptions options;

  public static final String JSON_PROPERTY_PAGE = "page";
  private RUMQueryPageOptions page;

  public static final String JSON_PROPERTY_SORT = "sort";
  private RUMSort sort;

  public RUMSearchEventsRequest filter(RUMQueryFilter filter) {
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
  public RUMQueryFilter getFilter() {
    return filter;
  }

  public void setFilter(RUMQueryFilter filter) {
    this.filter = filter;
  }

  public RUMSearchEventsRequest options(RUMQueryOptions options) {
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
  public RUMQueryOptions getOptions() {
    return options;
  }

  public void setOptions(RUMQueryOptions options) {
    this.options = options;
  }

  public RUMSearchEventsRequest page(RUMQueryPageOptions page) {
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
  public RUMQueryPageOptions getPage() {
    return page;
  }

  public void setPage(RUMQueryPageOptions page) {
    this.page = page;
  }

  public RUMSearchEventsRequest sort(RUMSort sort) {
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
  public RUMSort getSort() {
    return sort;
  }

  public void setSort(RUMSort sort) {
    if (!sort.isValid()) {
      this.unparsed = true;
    }
    this.sort = sort;
  }

  /** Return true if this RUMSearchEventsRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RUMSearchEventsRequest ruMSearchEventsRequest = (RUMSearchEventsRequest) o;
    return Objects.equals(this.filter, ruMSearchEventsRequest.filter)
        && Objects.equals(this.options, ruMSearchEventsRequest.options)
        && Objects.equals(this.page, ruMSearchEventsRequest.page)
        && Objects.equals(this.sort, ruMSearchEventsRequest.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, options, page, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RUMSearchEventsRequest {\n");
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
