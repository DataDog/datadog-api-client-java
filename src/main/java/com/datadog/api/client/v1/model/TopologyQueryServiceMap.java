/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>Query to the service map topology data source.</p>
 */
@JsonPropertyOrder({
  TopologyQueryServiceMap.JSON_PROPERTY_DATA_SOURCE,
  TopologyQueryServiceMap.JSON_PROPERTY_FILTERS,
  TopologyQueryServiceMap.JSON_PROPERTY_QUERY_STRING,
  TopologyQueryServiceMap.JSON_PROPERTY_SERVICE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TopologyQueryServiceMap {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private TopologyQueryServiceMapDataSource dataSource;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<String> filters = new ArrayList<>();

  public static final String JSON_PROPERTY_QUERY_STRING = "query_string";
  private String queryString;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public TopologyQueryServiceMap() {}

  @JsonCreator
  public TopologyQueryServiceMap(
            @JsonProperty(required=true, value=JSON_PROPERTY_DATA_SOURCE)TopologyQueryServiceMapDataSource dataSource,
            @JsonProperty(required=true, value=JSON_PROPERTY_FILTERS)List<String> filters,
            @JsonProperty(required=true, value=JSON_PROPERTY_SERVICE)String service) {
        this.dataSource = dataSource;
        this.unparsed |= !dataSource.isValid();
        this.filters = filters;
        this.service = service;
  }
  public TopologyQueryServiceMap dataSource(TopologyQueryServiceMapDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * <p>Name of the data source.</p>
   * @return dataSource
  **/
      @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public TopologyQueryServiceMapDataSource getDataSource() {
        return dataSource;
      }
  public void setDataSource(TopologyQueryServiceMapDataSource dataSource) {
    if (!dataSource.isValid()) {
        this.unparsed = true;
    }
    this.dataSource = dataSource;
  }
  public TopologyQueryServiceMap filters(List<String> filters) {
    this.filters = filters;
    return this;
  }
  public TopologyQueryServiceMap addFiltersItem(String filtersItem) {
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * <p>Your environment and primary tag (or * if enabled for your account).</p>
   * @return filters
  **/
      @JsonProperty(JSON_PROPERTY_FILTERS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<String> getFilters() {
        return filters;
      }
  public void setFilters(List<String> filters) {
    this.filters = filters;
  }
  public TopologyQueryServiceMap queryString(String queryString) {
    this.queryString = queryString;
    return this;
  }

  /**
   * <p>A search string for filtering services. When set, this replaces the <code>service</code> field.</p>
   * @return queryString
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_QUERY_STRING)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getQueryString() {
        return queryString;
      }
  public void setQueryString(String queryString) {
    this.queryString = queryString;
  }
  public TopologyQueryServiceMap service(String service) {
    this.service = service;
    return this;
  }

  /**
   * <p>(deprecated) Name of the service. Leave this empty and use query_string instead.</p>
   * @return service
  **/
      @JsonProperty(JSON_PROPERTY_SERVICE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getService() {
        return service;
      }
  public void setService(String service) {
    this.service = service;
  }

  /**
   * Return true if this TopologyQueryServiceMap object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopologyQueryServiceMap topologyQueryServiceMap = (TopologyQueryServiceMap) o;
    return Objects.equals(this.dataSource, topologyQueryServiceMap.dataSource) && Objects.equals(this.filters, topologyQueryServiceMap.filters) && Objects.equals(this.queryString, topologyQueryServiceMap.queryString) && Objects.equals(this.service, topologyQueryServiceMap.service);
  }


  @Override
  public int hashCode() {
    return Objects.hash(dataSource,filters,queryString,service);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopologyQueryServiceMap {\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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
