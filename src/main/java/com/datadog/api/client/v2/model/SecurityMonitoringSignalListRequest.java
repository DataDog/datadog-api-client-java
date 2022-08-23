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
import java.util.Objects;

/** The request for a security signal list. */
@JsonPropertyOrder({
  SecurityMonitoringSignalListRequest.JSON_PROPERTY_FILTER,
  SecurityMonitoringSignalListRequest.JSON_PROPERTY_PAGE,
  SecurityMonitoringSignalListRequest.JSON_PROPERTY_SORT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringSignalListRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILTER = "filter";
  private SecurityMonitoringSignalListRequestFilter filter;

  public static final String JSON_PROPERTY_PAGE = "page";
  private SecurityMonitoringSignalListRequestPage page;

  public static final String JSON_PROPERTY_SORT = "sort";
  private SecurityMonitoringSignalsSort sort;

  public SecurityMonitoringSignalListRequest filter(
      SecurityMonitoringSignalListRequestFilter filter) {
    this.filter = filter;
    this.unparsed |= filter.unparsed;
    return this;
  }

  /**
   * Search filters for listing security signals.
   *
   * @return filter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringSignalListRequestFilter getFilter() {
    return filter;
  }

  public void setFilter(SecurityMonitoringSignalListRequestFilter filter) {
    this.filter = filter;
  }

  public SecurityMonitoringSignalListRequest page(SecurityMonitoringSignalListRequestPage page) {
    this.page = page;
    this.unparsed |= page.unparsed;
    return this;
  }

  /**
   * The paging attributes for listing security signals.
   *
   * @return page
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringSignalListRequestPage getPage() {
    return page;
  }

  public void setPage(SecurityMonitoringSignalListRequestPage page) {
    this.page = page;
  }

  public SecurityMonitoringSignalListRequest sort(SecurityMonitoringSignalsSort sort) {
    this.sort = sort;
    this.unparsed |= !sort.isValid();
    return this;
  }

  /**
   * The sort parameters used for querying security signals.
   *
   * @return sort
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringSignalsSort getSort() {
    return sort;
  }

  public void setSort(SecurityMonitoringSignalsSort sort) {
    if (!sort.isValid()) {
      this.unparsed = true;
    }
    this.sort = sort;
  }

  /** Return true if this SecurityMonitoringSignalListRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringSignalListRequest securityMonitoringSignalListRequest =
        (SecurityMonitoringSignalListRequest) o;
    return Objects.equals(this.filter, securityMonitoringSignalListRequest.filter)
        && Objects.equals(this.page, securityMonitoringSignalListRequest.page)
        && Objects.equals(this.sort, securityMonitoringSignalListRequest.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, page, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSignalListRequest {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
