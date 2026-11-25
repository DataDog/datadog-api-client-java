/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  FormulaProductAnalyticsExtendedQuery.JSON_PROPERTY_AUDIENCE_FILTERS,
  FormulaProductAnalyticsExtendedQuery.JSON_PROPERTY_COMPUTE,
  FormulaProductAnalyticsExtendedQuery.JSON_PROPERTY_DATA_SOURCE,
  FormulaProductAnalyticsExtendedQuery.JSON_PROPERTY_GROUP_BY,
  FormulaProductAnalyticsExtendedQuery.JSON_PROPERTY_INDEXES,
  FormulaProductAnalyticsExtendedQuery.JSON_PROPERTY_NAME,
  FormulaProductAnalyticsExtendedQuery.JSON_PROPERTY_QUERY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormulaProductAnalyticsExtendedQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUDIENCE_FILTERS = "audience_filters";
  private AudienceFilters audienceFilters;

  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private ProductAnalyticsCompute compute;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private FormulaProductAnalyticsExtendedQueryDataSource dataSource;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<ProductAnalyticsGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_INDEXES = "indexes";
  private com.datadog.api.client.v1.model.FormulaProductAnalyticsExtendedQuery20270101Indexes
      indexes;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private BaseProductAnalyticsQuery query;

  public FormulaProductAnalyticsExtendedQuery() {}

  @JsonCreator
  public FormulaProductAnalyticsExtendedQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPUTE) ProductAnalyticsCompute compute,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          FormulaProductAnalyticsExtendedQueryDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) BaseProductAnalyticsQuery query) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.name = name;
    this.query = query;
    this.unparsed |= query.unparsed;
  }

  public FormulaProductAnalyticsExtendedQuery audienceFilters(AudienceFilters audienceFilters) {
    this.audienceFilters = audienceFilters;
    this.unparsed |= audienceFilters.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return audienceFilters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCE_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AudienceFilters getAudienceFilters() {
    return audienceFilters;
  }

  public void setAudienceFilters(AudienceFilters audienceFilters) {
    this.audienceFilters = audienceFilters;
    if (audienceFilters != null) {
      this.unparsed |= audienceFilters.unparsed;
    }
  }

  public FormulaProductAnalyticsExtendedQuery compute(ProductAnalyticsCompute compute) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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
    if (compute != null) {
      this.unparsed |= compute.unparsed;
    }
  }

  public FormulaProductAnalyticsExtendedQuery dataSource(
      FormulaProductAnalyticsExtendedQueryDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FormulaProductAnalyticsExtendedQueryDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(FormulaProductAnalyticsExtendedQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public FormulaProductAnalyticsExtendedQuery groupBy(List<ProductAnalyticsGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (ProductAnalyticsGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public FormulaProductAnalyticsExtendedQuery addGroupByItem(ProductAnalyticsGroupBy groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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
    if (groupBy != null) {
      for (ProductAnalyticsGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public FormulaProductAnalyticsExtendedQuery indexes(
      com.datadog.api.client.v1.model.FormulaProductAnalyticsExtendedQuery20270101Indexes indexes) {
    this.indexes = indexes;
    this.unparsed |= indexes.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return indexes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.datadog.api.client.v1.model.FormulaProductAnalyticsExtendedQuery20270101Indexes
      getIndexes() {
    return indexes;
  }

  public void setIndexes(
      com.datadog.api.client.v1.model.FormulaProductAnalyticsExtendedQuery20270101Indexes indexes) {
    this.indexes = indexes;
    if (indexes != null) {
      this.unparsed |= indexes.unparsed;
    }
  }

  public FormulaProductAnalyticsExtendedQuery name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FormulaProductAnalyticsExtendedQuery query(BaseProductAnalyticsQuery query) {
    this.query = query;
    this.unparsed |= query.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public BaseProductAnalyticsQuery getQuery() {
    return query;
  }

  public void setQuery(BaseProductAnalyticsQuery query) {
    this.query = query;
    if (query != null) {
      this.unparsed |= query.unparsed;
    }
  }

  /** Return true if this FormulaProductAnalyticsExtendedQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaProductAnalyticsExtendedQuery formulaProductAnalyticsExtendedQuery =
        (FormulaProductAnalyticsExtendedQuery) o;
    return Objects.equals(
            this.audienceFilters, formulaProductAnalyticsExtendedQuery.audienceFilters)
        && Objects.equals(this.compute, formulaProductAnalyticsExtendedQuery.compute)
        && Objects.equals(this.dataSource, formulaProductAnalyticsExtendedQuery.dataSource)
        && Objects.equals(this.groupBy, formulaProductAnalyticsExtendedQuery.groupBy)
        && Objects.equals(this.indexes, formulaProductAnalyticsExtendedQuery.indexes)
        && Objects.equals(this.name, formulaProductAnalyticsExtendedQuery.name)
        && Objects.equals(this.query, formulaProductAnalyticsExtendedQuery.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceFilters, compute, dataSource, groupBy, indexes, name, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaProductAnalyticsExtendedQuery {\n");
    sb.append("    audienceFilters: ").append(toIndentedString(audienceFilters)).append("\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
