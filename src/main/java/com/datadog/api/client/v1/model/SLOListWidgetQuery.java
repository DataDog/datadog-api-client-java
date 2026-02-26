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

/** Updated SLO List widget. */
@JsonPropertyOrder({
  SLOListWidgetQuery.JSON_PROPERTY_LIMIT,
  SLOListWidgetQuery.JSON_PROPERTY_QUERY_STRING,
  SLOListWidgetQuery.JSON_PROPERTY_SORT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOListWidgetQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit = 100l;

  public static final String JSON_PROPERTY_QUERY_STRING = "query_string";
  private String queryString;

  public static final String JSON_PROPERTY_SORT = "sort";
  private List<WidgetFieldSort> sort = null;

  public SLOListWidgetQuery() {}

  @JsonCreator
  public SLOListWidgetQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY_STRING) String queryString) {
    this.queryString = queryString;
  }

  public SLOListWidgetQuery limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Maximum number of results to display in the table. minimum: 1 maximum: 100
   *
   * @return limit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  public SLOListWidgetQuery queryString(String queryString) {
    this.queryString = queryString;
    return this;
  }

  /**
   * Widget query.
   *
   * @return queryString
   */
  @JsonProperty(JSON_PROPERTY_QUERY_STRING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQueryString() {
    return queryString;
  }

  public void setQueryString(String queryString) {
    this.queryString = queryString;
  }

  public SLOListWidgetQuery sort(List<WidgetFieldSort> sort) {
    this.sort = sort;
    for (WidgetFieldSort item : sort) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SLOListWidgetQuery addSortItem(WidgetFieldSort sortItem) {
    if (this.sort == null) {
      this.sort = new ArrayList<>();
    }
    this.sort.add(sortItem);
    this.unparsed |= sortItem.unparsed;
    return this;
  }

  /**
   * Options for sorting results.
   *
   * @return sort
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<WidgetFieldSort> getSort() {
    return sort;
  }

  public void setSort(List<WidgetFieldSort> sort) {
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
   * @return SLOListWidgetQuery
   */
  @JsonAnySetter
  public SLOListWidgetQuery putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SLOListWidgetQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOListWidgetQuery sloListWidgetQuery = (SLOListWidgetQuery) o;
    return Objects.equals(this.limit, sloListWidgetQuery.limit)
        && Objects.equals(this.queryString, sloListWidgetQuery.queryString)
        && Objects.equals(this.sort, sloListWidgetQuery.sort)
        && Objects.equals(this.additionalProperties, sloListWidgetQuery.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, queryString, sort, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOListWidgetQuery {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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
