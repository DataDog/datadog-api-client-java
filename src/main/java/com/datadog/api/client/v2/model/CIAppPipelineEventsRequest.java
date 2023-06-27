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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** The request for a pipelines search. */
@JsonPropertyOrder({
  CIAppPipelineEventsRequest.JSON_PROPERTY_FILTER,
  CIAppPipelineEventsRequest.JSON_PROPERTY_OPTIONS,
  CIAppPipelineEventsRequest.JSON_PROPERTY_PAGE,
  CIAppPipelineEventsRequest.JSON_PROPERTY_SORT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CIAppPipelineEventsRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILTER = "filter";
  private CIAppPipelinesQueryFilter filter;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private CIAppQueryOptions options;

  public static final String JSON_PROPERTY_PAGE = "page";
  private CIAppQueryPageOptions page;

  public static final String JSON_PROPERTY_SORT = "sort";
  private CIAppSort sort;

  public CIAppPipelineEventsRequest filter(CIAppPipelinesQueryFilter filter) {
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

  public CIAppPipelineEventsRequest options(CIAppQueryOptions options) {
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

  public CIAppPipelineEventsRequest page(CIAppQueryPageOptions page) {
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

  public CIAppPipelineEventsRequest sort(CIAppSort sort) {
    this.sort = sort;
    this.unparsed |= !sort.isValid();
    return this;
  }

  /**
   * Sort parameters when querying events.
   *
   * @return sort
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CIAppSort getSort() {
    return sort;
  }

  public void setSort(CIAppSort sort) {
    if (!sort.isValid()) {
      this.unparsed = true;
    }
    this.sort = sort;
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
   * @return CIAppPipelineEventsRequest
   */
  @JsonAnySetter
  public CIAppPipelineEventsRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CIAppPipelineEventsRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CIAppPipelineEventsRequest ciAppPipelineEventsRequest = (CIAppPipelineEventsRequest) o;
    return Objects.equals(this.filter, ciAppPipelineEventsRequest.filter)
        && Objects.equals(this.options, ciAppPipelineEventsRequest.options)
        && Objects.equals(this.page, ciAppPipelineEventsRequest.page)
        && Objects.equals(this.sort, ciAppPipelineEventsRequest.sort)
        && Objects.equals(
            this.additionalProperties, ciAppPipelineEventsRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, options, page, sort, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CIAppPipelineEventsRequest {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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
