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
   * <p>The process query to use in the widget.</p>
 */
@JsonPropertyOrder({
  ProcessQueryDefinition.JSON_PROPERTY_FILTER_BY,
  ProcessQueryDefinition.JSON_PROPERTY_LIMIT,
  ProcessQueryDefinition.JSON_PROPERTY_METRIC,
  ProcessQueryDefinition.JSON_PROPERTY_SEARCH_BY
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProcessQueryDefinition {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILTER_BY = "filter_by";
  private List<String> filterBy = null;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public static final String JSON_PROPERTY_SEARCH_BY = "search_by";
  private String searchBy;

  public ProcessQueryDefinition() {}

  @JsonCreator
  public ProcessQueryDefinition(
            @JsonProperty(required=true, value=JSON_PROPERTY_METRIC)String metric) {
        this.metric = metric;
  }
  public ProcessQueryDefinition filterBy(List<String> filterBy) {
    this.filterBy = filterBy;
    return this;
  }
  public ProcessQueryDefinition addFilterByItem(String filterByItem) {
    if (this.filterBy == null) {
      this.filterBy = new ArrayList<>();
    }
    this.filterBy.add(filterByItem);
    return this;
  }

  /**
   * <p>List of processes.</p>
   * @return filterBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FILTER_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getFilterBy() {
        return filterBy;
      }
  public void setFilterBy(List<String> filterBy) {
    this.filterBy = filterBy;
  }
  public ProcessQueryDefinition limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * <p>Max number of items in the filter list.</p>
   * minimum: 0
   * @return limit
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LIMIT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getLimit() {
        return limit;
      }
  public void setLimit(Long limit) {
    this.limit = limit;
  }
  public ProcessQueryDefinition metric(String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * <p>Your chosen metric.</p>
   * @return metric
  **/
      @JsonProperty(JSON_PROPERTY_METRIC)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getMetric() {
        return metric;
      }
  public void setMetric(String metric) {
    this.metric = metric;
  }
  public ProcessQueryDefinition searchBy(String searchBy) {
    this.searchBy = searchBy;
    return this;
  }

  /**
   * <p>Your chosen search term.</p>
   * @return searchBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SEARCH_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSearchBy() {
        return searchBy;
      }
  public void setSearchBy(String searchBy) {
    this.searchBy = searchBy;
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
   * @return ProcessQueryDefinition
   */
  @JsonAnySetter
  public ProcessQueryDefinition putAdditionalProperty(String key, Object value) {
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
   * Return true if this ProcessQueryDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessQueryDefinition processQueryDefinition = (ProcessQueryDefinition) o;
    return Objects.equals(this.filterBy, processQueryDefinition.filterBy) && Objects.equals(this.limit, processQueryDefinition.limit) && Objects.equals(this.metric, processQueryDefinition.metric) && Objects.equals(this.searchBy, processQueryDefinition.searchBy) && Objects.equals(this.additionalProperties, processQueryDefinition.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(filterBy,limit,metric,searchBy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessQueryDefinition {\n");
    sb.append("    filterBy: ").append(toIndentedString(filterBy)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    searchBy: ").append(toIndentedString(searchBy)).append("\n");
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
