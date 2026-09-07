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
   * <p>The analytics list query definition. It selects the events to return with <code>query</code>, then
   * chooses the columns on each event row, the sort applied to those rows, and a row limit.
   * Unlike the scalar and timeseries queries, a list query returns raw event rows rather than
   * aggregates, so it takes no compute or group-by rule.</p>
 */
@JsonPropertyOrder({
  ProductAnalyticsAnalyticsListQuery.JSON_PROPERTY_AUDIENCE_FILTERS,
  ProductAnalyticsAnalyticsListQuery.JSON_PROPERTY_COLUMNS,
  ProductAnalyticsAnalyticsListQuery.JSON_PROPERTY_LIMIT,
  ProductAnalyticsAnalyticsListQuery.JSON_PROPERTY_QUERY,
  ProductAnalyticsAnalyticsListQuery.JSON_PROPERTY_SORT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsAnalyticsListQuery {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUDIENCE_FILTERS = "audience_filters";
  private ProductAnalyticsAudienceFilters audienceFilters;

  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<String> columns = null;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit;

  public static final String JSON_PROPERTY_QUERY = "query";
  private ProductAnalyticsBaseQuery query;

  public static final String JSON_PROPERTY_SORT = "sort";
  private ProductAnalyticsAnalyticsListSort sort;

  public ProductAnalyticsAnalyticsListQuery() {}

  @JsonCreator
  public ProductAnalyticsAnalyticsListQuery(
            @JsonProperty(required=true, value=JSON_PROPERTY_QUERY)ProductAnalyticsBaseQuery query) {
        this.query = query;
        this.unparsed |= query.unparsed;
  }
  public ProductAnalyticsAnalyticsListQuery audienceFilters(ProductAnalyticsAudienceFilters audienceFilters) {
    this.audienceFilters = audienceFilters;
    this.unparsed |= audienceFilters.unparsed;
    return this;
  }

  /**
   * <p>Audience filter definitions for targeting specific user segments.</p>
   * @return audienceFilters
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AUDIENCE_FILTERS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ProductAnalyticsAudienceFilters getAudienceFilters() {
        return audienceFilters;
      }
  public void setAudienceFilters(ProductAnalyticsAudienceFilters audienceFilters) {
    this.audienceFilters = audienceFilters;
    if (audienceFilters != null) {
      this.unparsed |= audienceFilters.unparsed;
    }
  }
  public ProductAnalyticsAnalyticsListQuery columns(List<String> columns) {
    this.columns = columns;
    return this;
  }
  public ProductAnalyticsAnalyticsListQuery addColumnsItem(String columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

  /**
   * <p>Attribute columns to include in each event row.</p>
   * @return columns
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COLUMNS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getColumns() {
        return columns;
      }
  public void setColumns(List<String> columns) {
    this.columns = columns;
  }
  public ProductAnalyticsAnalyticsListQuery limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * <p>Maximum number of event rows to return.</p>
   * minimum: 1
   * maximum: 1000
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
  public ProductAnalyticsAnalyticsListQuery query(ProductAnalyticsBaseQuery query) {
    this.query = query;
    this.unparsed |= query.unparsed;
    return this;
  }

  /**
   * <p>A query definition discriminated by the <code>data_source</code> field.
   * Use <code>product_analytics</code> for standard event queries, or
   * <code>product_analytics_occurrence</code> for occurrence-filtered queries.</p>
   * @return query
  **/
      @JsonProperty(JSON_PROPERTY_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ProductAnalyticsBaseQuery getQuery() {
        return query;
      }
  public void setQuery(ProductAnalyticsBaseQuery query) {
    this.query = query;
    if (query != null) {
      this.unparsed |= query.unparsed;
    }
  }
  public ProductAnalyticsAnalyticsListQuery sort(ProductAnalyticsAnalyticsListSort sort) {
    this.sort = sort;
    this.unparsed |= sort.unparsed;
    return this;
  }

  /**
   * <p>The sort applied to the returned event rows.</p>
   * @return sort
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SORT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ProductAnalyticsAnalyticsListSort getSort() {
        return sort;
      }
  public void setSort(ProductAnalyticsAnalyticsListSort sort) {
    this.sort = sort;
    if (sort != null) {
      this.unparsed |= sort.unparsed;
    }
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
   * @return ProductAnalyticsAnalyticsListQuery
   */
  @JsonAnySetter
  public ProductAnalyticsAnalyticsListQuery putAdditionalProperty(String key, Object value) {
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
   * Return true if this ProductAnalyticsAnalyticsListQuery object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsAnalyticsListQuery productAnalyticsAnalyticsListQuery = (ProductAnalyticsAnalyticsListQuery) o;
    return Objects.equals(this.audienceFilters, productAnalyticsAnalyticsListQuery.audienceFilters) && Objects.equals(this.columns, productAnalyticsAnalyticsListQuery.columns) && Objects.equals(this.limit, productAnalyticsAnalyticsListQuery.limit) && Objects.equals(this.query, productAnalyticsAnalyticsListQuery.query) && Objects.equals(this.sort, productAnalyticsAnalyticsListQuery.sort) && Objects.equals(this.additionalProperties, productAnalyticsAnalyticsListQuery.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(audienceFilters,columns,limit,query,sort, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsAnalyticsListQuery {\n");
    sb.append("    audienceFilters: ").append(toIndentedString(audienceFilters)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
