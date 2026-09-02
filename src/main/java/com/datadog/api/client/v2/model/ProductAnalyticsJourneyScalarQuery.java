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

/** Query definition for a journey scalar request. */
@JsonPropertyOrder({
  ProductAnalyticsJourneyScalarQuery.JSON_PROPERTY_COMPUTE,
  ProductAnalyticsJourneyScalarQuery.JSON_PROPERTY_GROUP_BY,
  ProductAnalyticsJourneyScalarQuery.JSON_PROPERTY_QUERY_ID,
  ProductAnalyticsJourneyScalarQuery.JSON_PROPERTY_SEARCH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsJourneyScalarQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private ProductAnalyticsJourneyScalarCompute compute;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<ProductAnalyticsGraphQueryGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_QUERY_ID = "query_id";
  private String queryId;

  public static final String JSON_PROPERTY_SEARCH = "search";
  private ProductAnalyticsJourneySearch search;

  public ProductAnalyticsJourneyScalarQuery() {}

  @JsonCreator
  public ProductAnalyticsJourneyScalarQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPUTE)
          ProductAnalyticsJourneyScalarCompute compute,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEARCH)
          ProductAnalyticsJourneySearch search) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    this.search = search;
    this.unparsed |= search.unparsed;
  }

  public ProductAnalyticsJourneyScalarQuery compute(ProductAnalyticsJourneyScalarCompute compute) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    return this;
  }

  /**
   * Defines the metric computed over the journey for a scalar query.
   *
   * @return compute
   */
  @JsonProperty(JSON_PROPERTY_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsJourneyScalarCompute getCompute() {
    return compute;
  }

  public void setCompute(ProductAnalyticsJourneyScalarCompute compute) {
    this.compute = compute;
    if (compute != null) {
      this.unparsed |= compute.unparsed;
    }
  }

  public ProductAnalyticsJourneyScalarQuery groupBy(
      List<ProductAnalyticsGraphQueryGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (ProductAnalyticsGraphQueryGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ProductAnalyticsJourneyScalarQuery addGroupByItem(
      ProductAnalyticsGraphQueryGroupBy groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * Segments the results by the values of one or more facets.
   *
   * @return groupBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ProductAnalyticsGraphQueryGroupBy> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<ProductAnalyticsGraphQueryGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (ProductAnalyticsGraphQueryGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ProductAnalyticsJourneyScalarQuery queryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  /**
   * Caller-defined identifier echoed back in the results.
   *
   * @return queryId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQueryId() {
    return queryId;
  }

  public void setQueryId(String queryId) {
    this.queryId = queryId;
  }

  public ProductAnalyticsJourneyScalarQuery search(ProductAnalyticsJourneySearch search) {
    this.search = search;
    this.unparsed |= search.unparsed;
    return this;
  }

  /**
   * Defines the steps of the journey and the filters applied to it.
   *
   * @return search
   */
  @JsonProperty(JSON_PROPERTY_SEARCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsJourneySearch getSearch() {
    return search;
  }

  public void setSearch(ProductAnalyticsJourneySearch search) {
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
   * @return ProductAnalyticsJourneyScalarQuery
   */
  @JsonAnySetter
  public ProductAnalyticsJourneyScalarQuery putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsJourneyScalarQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsJourneyScalarQuery productAnalyticsJourneyScalarQuery =
        (ProductAnalyticsJourneyScalarQuery) o;
    return Objects.equals(this.compute, productAnalyticsJourneyScalarQuery.compute)
        && Objects.equals(this.groupBy, productAnalyticsJourneyScalarQuery.groupBy)
        && Objects.equals(this.queryId, productAnalyticsJourneyScalarQuery.queryId)
        && Objects.equals(this.search, productAnalyticsJourneyScalarQuery.search)
        && Objects.equals(
            this.additionalProperties, productAnalyticsJourneyScalarQuery.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compute, groupBy, queryId, search, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsJourneyScalarQuery {\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
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
