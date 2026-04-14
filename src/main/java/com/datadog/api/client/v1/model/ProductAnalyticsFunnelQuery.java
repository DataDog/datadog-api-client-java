/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** User journey funnel query definition. */
@JsonPropertyOrder({
  ProductAnalyticsFunnelQuery.JSON_PROPERTY_COMPUTE,
  ProductAnalyticsFunnelQuery.JSON_PROPERTY_DATA_SOURCE,
  ProductAnalyticsFunnelQuery.JSON_PROPERTY_GROUP_BY,
  ProductAnalyticsFunnelQuery.JSON_PROPERTY_SEARCH,
  ProductAnalyticsFunnelQuery.JSON_PROPERTY_SUBQUERY_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsFunnelQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private ProductAnalyticsFunnelCompute compute;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private ProductAnalyticsFunnelDataSource dataSource;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<ProductAnalyticsFunnelGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_SEARCH = "search";
  private UserJourneySearch search;

  public static final String JSON_PROPERTY_SUBQUERY_ID = "subquery_id";
  private String subqueryId;

  public ProductAnalyticsFunnelQuery() {}

  @JsonCreator
  public ProductAnalyticsFunnelQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          ProductAnalyticsFunnelDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEARCH) UserJourneySearch search) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.search = search;
    this.unparsed |= search.unparsed;
  }

  public ProductAnalyticsFunnelQuery compute(ProductAnalyticsFunnelCompute compute) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    return this;
  }

  /**
   * Compute configuration for user journey funnel.
   *
   * @return compute
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsFunnelCompute getCompute() {
    return compute;
  }

  public void setCompute(ProductAnalyticsFunnelCompute compute) {
    this.compute = compute;
  }

  public ProductAnalyticsFunnelQuery dataSource(ProductAnalyticsFunnelDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * Data source for user journey funnel queries.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsFunnelDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(ProductAnalyticsFunnelDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public ProductAnalyticsFunnelQuery groupBy(List<ProductAnalyticsFunnelGroupBy> groupBy) {
    this.groupBy = groupBy;
    for (ProductAnalyticsFunnelGroupBy item : groupBy) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ProductAnalyticsFunnelQuery addGroupByItem(ProductAnalyticsFunnelGroupBy groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * Group by configuration.
   *
   * @return groupBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ProductAnalyticsFunnelGroupBy> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<ProductAnalyticsFunnelGroupBy> groupBy) {
    this.groupBy = groupBy;
  }

  public ProductAnalyticsFunnelQuery search(UserJourneySearch search) {
    this.search = search;
    this.unparsed |= search.unparsed;
    return this;
  }

  /**
   * User journey search configuration.
   *
   * @return search
   */
  @JsonProperty(JSON_PROPERTY_SEARCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UserJourneySearch getSearch() {
    return search;
  }

  public void setSearch(UserJourneySearch search) {
    this.search = search;
  }

  public ProductAnalyticsFunnelQuery subqueryId(String subqueryId) {
    this.subqueryId = subqueryId;
    return this;
  }

  /**
   * Subquery ID.
   *
   * @return subqueryId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBQUERY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSubqueryId() {
    return subqueryId;
  }

  public void setSubqueryId(String subqueryId) {
    this.subqueryId = subqueryId;
  }

  /** Return true if this ProductAnalyticsFunnelQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsFunnelQuery productAnalyticsFunnelQuery = (ProductAnalyticsFunnelQuery) o;
    return Objects.equals(this.compute, productAnalyticsFunnelQuery.compute)
        && Objects.equals(this.dataSource, productAnalyticsFunnelQuery.dataSource)
        && Objects.equals(this.groupBy, productAnalyticsFunnelQuery.groupBy)
        && Objects.equals(this.search, productAnalyticsFunnelQuery.search)
        && Objects.equals(this.subqueryId, productAnalyticsFunnelQuery.subqueryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compute, dataSource, groupBy, search, subqueryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsFunnelQuery {\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    subqueryId: ").append(toIndentedString(subqueryId)).append("\n");
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
