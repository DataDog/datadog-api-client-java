/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/** The analytics query definition containing a base query, compute rule, and optional grouping. */
@JsonPropertyOrder({
  ProductAnalyticsAnalyticsQuery.JSON_PROPERTY_AUDIENCE_FILTERS,
  ProductAnalyticsAnalyticsQuery.JSON_PROPERTY_COMPUTE,
  ProductAnalyticsAnalyticsQuery.JSON_PROPERTY_GROUP_BY,
  ProductAnalyticsAnalyticsQuery.JSON_PROPERTY_INDEXES,
  ProductAnalyticsAnalyticsQuery.JSON_PROPERTY_QUERY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsAnalyticsQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUDIENCE_FILTERS = "audience_filters";
  private ProductAnalyticsAudienceFilters audienceFilters;

  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private ProductAnalyticsCompute compute;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<ProductAnalyticsGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_INDEXES = "indexes";
  private List<String> indexes = null;

  public static final String JSON_PROPERTY_QUERY = "query";
  private ProductAnalyticsBaseQuery query;

  public ProductAnalyticsAnalyticsQuery() {}

  @JsonCreator
  public ProductAnalyticsAnalyticsQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPUTE) ProductAnalyticsCompute compute,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) ProductAnalyticsBaseQuery query) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    this.query = query;
    this.unparsed |= query.unparsed;
  }

  public ProductAnalyticsAnalyticsQuery audienceFilters(
      ProductAnalyticsAudienceFilters audienceFilters) {
    this.audienceFilters = audienceFilters;
    this.unparsed |= audienceFilters.unparsed;
    return this;
  }

  /**
   * Audience filter definitions for targeting specific user segments.
   *
   * @return audienceFilters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCE_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsAudienceFilters getAudienceFilters() {
    return audienceFilters;
  }

  public void setAudienceFilters(ProductAnalyticsAudienceFilters audienceFilters) {
    this.audienceFilters = audienceFilters;
  }

  public ProductAnalyticsAnalyticsQuery compute(ProductAnalyticsCompute compute) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    return this;
  }

  /**
   * A compute rule for aggregating data.
   *
   * @return compute
   */
  @JsonProperty(JSON_PROPERTY_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsCompute getCompute() {
    return compute;
  }

  public void setCompute(ProductAnalyticsCompute compute) {
    this.compute = compute;
  }

  public ProductAnalyticsAnalyticsQuery groupBy(List<ProductAnalyticsGroupBy> groupBy) {
    this.groupBy = groupBy;
    for (ProductAnalyticsGroupBy item : groupBy) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ProductAnalyticsAnalyticsQuery addGroupByItem(ProductAnalyticsGroupBy groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * Group-by rules for segmenting results.
   *
   * @return groupBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ProductAnalyticsGroupBy> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<ProductAnalyticsGroupBy> groupBy) {
    this.groupBy = groupBy;
  }

  public ProductAnalyticsAnalyticsQuery indexes(List<String> indexes) {
    this.indexes = indexes;
    return this;
  }

  public ProductAnalyticsAnalyticsQuery addIndexesItem(String indexesItem) {
    if (this.indexes == null) {
      this.indexes = new ArrayList<>();
    }
    this.indexes.add(indexesItem);
    return this;
  }

  /**
   * Restrict the query to specific indexes. Max 1 entry.
   *
   * @return indexes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getIndexes() {
    return indexes;
  }

  public void setIndexes(List<String> indexes) {
    this.indexes = indexes;
  }

  public ProductAnalyticsAnalyticsQuery query(ProductAnalyticsBaseQuery query) {
    this.query = query;
    this.unparsed |= query.unparsed;
    return this;
  }

  /**
   * A query definition discriminated by the <code>data_source</code> field. Use <code>
   * product_analytics</code> for standard event queries, or <code>product_analytics_occurrence
   * </code> for occurrence-filtered queries.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsBaseQuery getQuery() {
    return query;
  }

  public void setQuery(ProductAnalyticsBaseQuery query) {
    this.query = query;
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
   * @return ProductAnalyticsAnalyticsQuery
   */
  @JsonAnySetter
  public ProductAnalyticsAnalyticsQuery putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsAnalyticsQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsAnalyticsQuery productAnalyticsAnalyticsQuery =
        (ProductAnalyticsAnalyticsQuery) o;
    return Objects.equals(this.audienceFilters, productAnalyticsAnalyticsQuery.audienceFilters)
        && Objects.equals(this.compute, productAnalyticsAnalyticsQuery.compute)
        && Objects.equals(this.groupBy, productAnalyticsAnalyticsQuery.groupBy)
        && Objects.equals(this.indexes, productAnalyticsAnalyticsQuery.indexes)
        && Objects.equals(this.query, productAnalyticsAnalyticsQuery.query)
        && Objects.equals(
            this.additionalProperties, productAnalyticsAnalyticsQuery.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceFilters, compute, groupBy, indexes, query, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsAnalyticsQuery {\n");
    sb.append("    audienceFilters: ").append(toIndentedString(audienceFilters)).append("\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
