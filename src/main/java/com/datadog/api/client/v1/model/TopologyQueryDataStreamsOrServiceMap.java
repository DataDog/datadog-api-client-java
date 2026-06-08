/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Query to service-based topology data sources like the service map or data streams. */
@JsonPropertyOrder({
  TopologyQueryDataStreamsOrServiceMap.JSON_PROPERTY_DATA_SOURCE,
  TopologyQueryDataStreamsOrServiceMap.JSON_PROPERTY_FILTERS,
  TopologyQueryDataStreamsOrServiceMap.JSON_PROPERTY_QUERY_STRING,
  TopologyQueryDataStreamsOrServiceMap.JSON_PROPERTY_SERVICE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TopologyQueryDataStreamsOrServiceMap {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private TopologyQueryDataStreamsOrServiceMapDataSource dataSource;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<String> filters = new ArrayList<>();

  public static final String JSON_PROPERTY_QUERY_STRING = "query_string";
  private String queryString;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public TopologyQueryDataStreamsOrServiceMap() {}

  @JsonCreator
  public TopologyQueryDataStreamsOrServiceMap(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          TopologyQueryDataStreamsOrServiceMapDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_FILTERS) List<String> filters) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.filters = filters;
  }

  public TopologyQueryDataStreamsOrServiceMap dataSource(
      TopologyQueryDataStreamsOrServiceMapDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * Name of the data source
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TopologyQueryDataStreamsOrServiceMapDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(TopologyQueryDataStreamsOrServiceMapDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public TopologyQueryDataStreamsOrServiceMap filters(List<String> filters) {
    this.filters = filters;
    return this;
  }

  public TopologyQueryDataStreamsOrServiceMap addFiltersItem(String filtersItem) {
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * Your environment and primary tag (or * if enabled for your account).
   *
   * @return filters
   */
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getFilters() {
    return filters;
  }

  public void setFilters(List<String> filters) {
    this.filters = filters;
  }

  public TopologyQueryDataStreamsOrServiceMap queryString(String queryString) {
    this.queryString = queryString;
    return this;
  }

  /**
   * A search string for filtering services, used in <code>data_streams</code> queries only. When
   * set, this replaces the <code>service</code> field
   *
   * @return queryString
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQueryString() {
    return queryString;
  }

  public void setQueryString(String queryString) {
    this.queryString = queryString;
  }

  public TopologyQueryDataStreamsOrServiceMap service(String service) {
    this.service = service;
    return this;
  }

  /**
   * Name of the service
   *
   * @return service
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
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
   * @return TopologyQueryDataStreamsOrServiceMap
   */
  @JsonAnySetter
  public TopologyQueryDataStreamsOrServiceMap putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TopologyQueryDataStreamsOrServiceMap object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopologyQueryDataStreamsOrServiceMap topologyQueryDataStreamsOrServiceMap =
        (TopologyQueryDataStreamsOrServiceMap) o;
    return Objects.equals(this.dataSource, topologyQueryDataStreamsOrServiceMap.dataSource)
        && Objects.equals(this.filters, topologyQueryDataStreamsOrServiceMap.filters)
        && Objects.equals(this.queryString, topologyQueryDataStreamsOrServiceMap.queryString)
        && Objects.equals(this.service, topologyQueryDataStreamsOrServiceMap.service)
        && Objects.equals(
            this.additionalProperties, topologyQueryDataStreamsOrServiceMap.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSource, filters, queryString, service, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopologyQueryDataStreamsOrServiceMap {\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
