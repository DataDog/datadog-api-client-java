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

/** Query definition for a retention scalar or retention timeseries request. */
@JsonPropertyOrder({
  ProductAnalyticsFormulaRetentionQuery.JSON_PROPERTY_COMPUTATION_SCOPE,
  ProductAnalyticsFormulaRetentionQuery.JSON_PROPERTY_COMPUTE,
  ProductAnalyticsFormulaRetentionQuery.JSON_PROPERTY_GROUP_BY,
  ProductAnalyticsFormulaRetentionQuery.JSON_PROPERTY_SEARCH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsFormulaRetentionQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPUTATION_SCOPE = "computation_scope";
  private ProductAnalyticsRetentionScope computationScope;

  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private ProductAnalyticsRetentionCompute compute;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<ProductAnalyticsRetentionGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_SEARCH = "search";
  private ProductAnalyticsRetentionSearch search;

  public ProductAnalyticsFormulaRetentionQuery() {}

  @JsonCreator
  public ProductAnalyticsFormulaRetentionQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPUTE)
          ProductAnalyticsRetentionCompute compute,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEARCH)
          ProductAnalyticsRetentionSearch search) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    this.search = search;
    this.unparsed |= search.unparsed;
  }

  public ProductAnalyticsFormulaRetentionQuery computationScope(
      ProductAnalyticsRetentionScope computationScope) {
    this.computationScope = computationScope;
    this.unparsed |= computationScope.unparsed;
    return this;
  }

  /**
   * Restricts a retention query to part of the grid, so that results can be examined in detail.
   * Omit it to compute the whole grid.
   *
   * @return computationScope
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPUTATION_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsRetentionScope getComputationScope() {
    return computationScope;
  }

  public void setComputationScope(ProductAnalyticsRetentionScope computationScope) {
    this.computationScope = computationScope;
    if (computationScope != null) {
      this.unparsed |= computationScope.unparsed;
    }
  }

  public ProductAnalyticsFormulaRetentionQuery compute(ProductAnalyticsRetentionCompute compute) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    return this;
  }

  /**
   * The metric and aggregation applied to a retention query.
   *
   * @return compute
   */
  @JsonProperty(JSON_PROPERTY_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsRetentionCompute getCompute() {
    return compute;
  }

  public void setCompute(ProductAnalyticsRetentionCompute compute) {
    this.compute = compute;
    if (compute != null) {
      this.unparsed |= compute.unparsed;
    }
  }

  public ProductAnalyticsFormulaRetentionQuery groupBy(
      List<ProductAnalyticsRetentionGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (ProductAnalyticsRetentionGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ProductAnalyticsFormulaRetentionQuery addGroupByItem(
      ProductAnalyticsRetentionGroupBy groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * Splits the results by the values of one or more facets.
   *
   * @return groupBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ProductAnalyticsRetentionGroupBy> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<ProductAnalyticsRetentionGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (ProductAnalyticsRetentionGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ProductAnalyticsFormulaRetentionQuery search(ProductAnalyticsRetentionSearch search) {
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
   * @return ProductAnalyticsFormulaRetentionQuery
   */
  @JsonAnySetter
  public ProductAnalyticsFormulaRetentionQuery putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsFormulaRetentionQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsFormulaRetentionQuery productAnalyticsFormulaRetentionQuery =
        (ProductAnalyticsFormulaRetentionQuery) o;
    return Objects.equals(
            this.computationScope, productAnalyticsFormulaRetentionQuery.computationScope)
        && Objects.equals(this.compute, productAnalyticsFormulaRetentionQuery.compute)
        && Objects.equals(this.groupBy, productAnalyticsFormulaRetentionQuery.groupBy)
        && Objects.equals(this.search, productAnalyticsFormulaRetentionQuery.search)
        && Objects.equals(
            this.additionalProperties, productAnalyticsFormulaRetentionQuery.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(computationScope, compute, groupBy, search, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsFormulaRetentionQuery {\n");
    sb.append("    computationScope: ").append(toIndentedString(computationScope)).append("\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
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
