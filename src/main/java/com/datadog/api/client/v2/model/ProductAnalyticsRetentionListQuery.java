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

/** Query definition for a retention list request. */
@JsonPropertyOrder({
  ProductAnalyticsRetentionListQuery.JSON_PROPERTY_COLUMNS,
  ProductAnalyticsRetentionListQuery.JSON_PROPERTY_COMPUTATION_SCOPE,
  ProductAnalyticsRetentionListQuery.JSON_PROPERTY_LIMIT,
  ProductAnalyticsRetentionListQuery.JSON_PROPERTY_SEARCH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsRetentionListQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<ProductAnalyticsRetentionListColumn> columns = null;

  public static final String JSON_PROPERTY_COMPUTATION_SCOPE = "computation_scope";
  private ProductAnalyticsRetentionCellScope computationScope;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit;

  public static final String JSON_PROPERTY_SEARCH = "search";
  private ProductAnalyticsRetentionSearch search;

  public ProductAnalyticsRetentionListQuery() {}

  @JsonCreator
  public ProductAnalyticsRetentionListQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPUTATION_SCOPE)
          ProductAnalyticsRetentionCellScope computationScope,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEARCH)
          ProductAnalyticsRetentionSearch search) {
    this.computationScope = computationScope;
    this.unparsed |= computationScope.unparsed;
    this.search = search;
    this.unparsed |= search.unparsed;
  }

  public ProductAnalyticsRetentionListQuery columns(
      List<ProductAnalyticsRetentionListColumn> columns) {
    this.columns = columns;
    if (columns != null) {
      for (ProductAnalyticsRetentionListColumn item : columns) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ProductAnalyticsRetentionListQuery addColumnsItem(
      ProductAnalyticsRetentionListColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    this.unparsed |= columnsItem.unparsed;
    return this;
  }

  /**
   * The attribute columns to include in each returned row.
   *
   * @return columns
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ProductAnalyticsRetentionListColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<ProductAnalyticsRetentionListColumn> columns) {
    this.columns = columns;
    if (columns != null) {
      for (ProductAnalyticsRetentionListColumn item : columns) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ProductAnalyticsRetentionListQuery computationScope(
      ProductAnalyticsRetentionCellScope computationScope) {
    this.computationScope = computationScope;
    this.unparsed |= computationScope.unparsed;
    return this;
  }

  /**
   * Narrows a retention query to a single cell, at the intersection of one cohort and one return
   * period.
   *
   * @return computationScope
   */
  @JsonProperty(JSON_PROPERTY_COMPUTATION_SCOPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsRetentionCellScope getComputationScope() {
    return computationScope;
  }

  public void setComputationScope(ProductAnalyticsRetentionCellScope computationScope) {
    this.computationScope = computationScope;
    if (computationScope != null) {
      this.unparsed |= computationScope.unparsed;
    }
  }

  public ProductAnalyticsRetentionListQuery limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Maximum number of rows to return. Use <code>0</code> for no limit. minimum: 0
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

  public ProductAnalyticsRetentionListQuery search(ProductAnalyticsRetentionSearch search) {
    this.search = search;
    this.unparsed |= search.unparsed;
    return this;
  }

  /**
   * Defines the cohort and return criteria that make up a retention query.
   *
   * @return search
   */
  @JsonProperty(JSON_PROPERTY_SEARCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsRetentionSearch getSearch() {
    return search;
  }

  public void setSearch(ProductAnalyticsRetentionSearch search) {
    this.search = search;
    if (search != null) {
      this.unparsed |= search.unparsed;
    }
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
   * @return ProductAnalyticsRetentionListQuery
   */
  @JsonAnySetter
  public ProductAnalyticsRetentionListQuery putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsRetentionListQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsRetentionListQuery productAnalyticsRetentionListQuery =
        (ProductAnalyticsRetentionListQuery) o;
    return Objects.equals(this.columns, productAnalyticsRetentionListQuery.columns)
        && Objects.equals(
            this.computationScope, productAnalyticsRetentionListQuery.computationScope)
        && Objects.equals(this.limit, productAnalyticsRetentionListQuery.limit)
        && Objects.equals(this.search, productAnalyticsRetentionListQuery.search)
        && Objects.equals(
            this.additionalProperties, productAnalyticsRetentionListQuery.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, computationScope, limit, search, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsRetentionListQuery {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    computationScope: ").append(toIndentedString(computationScope)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
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
