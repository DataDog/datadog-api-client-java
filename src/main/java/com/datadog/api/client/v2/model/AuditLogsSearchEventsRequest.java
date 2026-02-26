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
import java.util.UUID;
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
   * <p>The request for a Audit Logs events list.</p>
 */
@JsonPropertyOrder({
  AuditLogsSearchEventsRequest.JSON_PROPERTY_FILTER,
  AuditLogsSearchEventsRequest.JSON_PROPERTY_OPTIONS,
  AuditLogsSearchEventsRequest.JSON_PROPERTY_PAGE,
  AuditLogsSearchEventsRequest.JSON_PROPERTY_SORT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AuditLogsSearchEventsRequest {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILTER = "filter";
  private AuditLogsQueryFilter filter;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private AuditLogsQueryOptions options;

  public static final String JSON_PROPERTY_PAGE = "page";
  private AuditLogsQueryPageOptions page;

  public static final String JSON_PROPERTY_SORT = "sort";
  private AuditLogsSort sort;

  public AuditLogsSearchEventsRequest filter(AuditLogsQueryFilter filter) {
    this.filter = filter;
    this.unparsed |= filter.unparsed;
    return this;
  }

  /**
   * <p>Search and filter query settings.</p>
   * @return filter
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FILTER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public AuditLogsQueryFilter getFilter() {
        return filter;
      }
  public void setFilter(AuditLogsQueryFilter filter) {
    this.filter = filter;
  }
  public AuditLogsSearchEventsRequest options(AuditLogsQueryOptions options) {
    this.options = options;
    this.unparsed |= options.unparsed;
    return this;
  }

  /**
   * <p>Global query options that are used during the query.
   * Note: Specify either timezone or time offset, not both. Otherwise, the query fails.</p>
   * @return options
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OPTIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public AuditLogsQueryOptions getOptions() {
        return options;
      }
  public void setOptions(AuditLogsQueryOptions options) {
    this.options = options;
  }
  public AuditLogsSearchEventsRequest page(AuditLogsQueryPageOptions page) {
    this.page = page;
    this.unparsed |= page.unparsed;
    return this;
  }

  /**
   * <p>Paging attributes for listing events.</p>
   * @return page
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public AuditLogsQueryPageOptions getPage() {
        return page;
      }
  public void setPage(AuditLogsQueryPageOptions page) {
    this.page = page;
  }
  public AuditLogsSearchEventsRequest sort(AuditLogsSort sort) {
    this.sort = sort;
    this.unparsed |= !sort.isValid();
    return this;
  }

  /**
   * <p>Sort parameters when querying events.</p>
   * @return sort
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SORT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public AuditLogsSort getSort() {
        return sort;
      }
  public void setSort(AuditLogsSort sort) {
    if (!sort.isValid()) {
        this.unparsed = true;
    }
    this.sort = sort;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return AuditLogsSearchEventsRequest
   */
  @JsonAnySetter
  public AuditLogsSearchEventsRequest putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this AuditLogsSearchEventsRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogsSearchEventsRequest auditLogsSearchEventsRequest = (AuditLogsSearchEventsRequest) o;
    return Objects.equals(this.filter, auditLogsSearchEventsRequest.filter) && Objects.equals(this.options, auditLogsSearchEventsRequest.options) && Objects.equals(this.page, auditLogsSearchEventsRequest.page) && Objects.equals(this.sort, auditLogsSearchEventsRequest.sort) && Objects.equals(this.additionalProperties, auditLogsSearchEventsRequest.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(filter,options,page,sort, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogsSearchEventsRequest {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
