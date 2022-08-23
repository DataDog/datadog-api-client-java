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

/** The object sent with the request to retrieve a list of events from your organization. */
@JsonPropertyOrder({
  EventsListRequest.JSON_PROPERTY_FILTER,
  EventsListRequest.JSON_PROPERTY_OPTIONS,
  EventsListRequest.JSON_PROPERTY_PAGE,
  EventsListRequest.JSON_PROPERTY_SORT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EventsListRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILTER = "filter";
  private EventsQueryFilter filter;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private EventsQueryOptions options;

  public static final String JSON_PROPERTY_PAGE = "page";
  private EventsRequestPage page;

  public static final String JSON_PROPERTY_SORT = "sort";
  private EventsSort sort;

  public EventsListRequest filter(EventsQueryFilter filter) {
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
  public EventsQueryFilter getFilter() {
    return filter;
  }

  public void setFilter(EventsQueryFilter filter) {
    this.filter = filter;
  }

  public EventsListRequest options(EventsQueryOptions options) {
    this.options = options;
    this.unparsed |= options.unparsed;
    return this;
  }

  /**
   * The global query options that are used. Either provide a timezone or a time offset but not
   * both, otherwise the query fails.
   *
   * @return options
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EventsQueryOptions getOptions() {
    return options;
  }

  public void setOptions(EventsQueryOptions options) {
    this.options = options;
  }

  public EventsListRequest page(EventsRequestPage page) {
    this.page = page;
    this.unparsed |= page.unparsed;
    return this;
  }

  /**
   * Pagination settings.
   *
   * @return page
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EventsRequestPage getPage() {
    return page;
  }

  public void setPage(EventsRequestPage page) {
    this.page = page;
  }

  public EventsListRequest sort(EventsSort sort) {
    this.sort = sort;
    this.unparsed |= !sort.isValid();
    return this;
  }

  /**
   * The sort parameters when querying events.
   *
   * @return sort
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EventsSort getSort() {
    return sort;
  }

  public void setSort(EventsSort sort) {
    if (!sort.isValid()) {
      this.unparsed = true;
    }
    this.sort = sort;
  }

  /** Return true if this EventsListRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventsListRequest eventsListRequest = (EventsListRequest) o;
    return Objects.equals(this.filter, eventsListRequest.filter)
        && Objects.equals(this.options, eventsListRequest.options)
        && Objects.equals(this.page, eventsListRequest.page)
        && Objects.equals(this.sort, eventsListRequest.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, options, page, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventsListRequest {\n");
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
