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
  FormulaRetentionQuery.JSON_PROPERTY_COMPUTATION_SCOPE,
  FormulaRetentionQuery.JSON_PROPERTY_COMPUTE,
  FormulaRetentionQuery.JSON_PROPERTY_DATA_SOURCE,
  FormulaRetentionQuery.JSON_PROPERTY_EXCLUDE_ANONYMOUS_TRAFFIC,
  FormulaRetentionQuery.JSON_PROPERTY_GROUP_BY,
  FormulaRetentionQuery.JSON_PROPERTY_NAME,
  FormulaRetentionQuery.JSON_PROPERTY_SAMPLING,
  FormulaRetentionQuery.JSON_PROPERTY_SEARCH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormulaRetentionQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPUTATION_SCOPE = "computation_scope";
  private ComputationScope computationScope;

  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private RetentionCompute compute;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private FormulaRetentionQueryDataSource dataSource;

  public static final String JSON_PROPERTY_EXCLUDE_ANONYMOUS_TRAFFIC = "exclude_anonymous_traffic";
  private Boolean excludeAnonymousTraffic;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<RetentionGroupByItems> groupBy = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SAMPLING = "sampling";
  private FormulaRetentionQuerySampling sampling;

  public static final String JSON_PROPERTY_SEARCH = "search";
  private RetentionSearch search;

  public FormulaRetentionQuery() {}

  @JsonCreator
  public FormulaRetentionQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPUTE) RetentionCompute compute,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          FormulaRetentionQueryDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEARCH) RetentionSearch search) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.name = name;
    this.search = search;
    this.unparsed |= search.unparsed;
  }

  public FormulaRetentionQuery computationScope(ComputationScope computationScope) {
    this.computationScope = computationScope;
    this.unparsed |= computationScope.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return computationScope
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPUTATION_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ComputationScope getComputationScope() {
    return computationScope;
  }

  public void setComputationScope(ComputationScope computationScope) {
    this.computationScope = computationScope;
    if (computationScope != null) {
      this.unparsed |= computationScope.unparsed;
    }
  }

  public FormulaRetentionQuery compute(RetentionCompute compute) {
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
  public RetentionCompute getCompute() {
    return compute;
  }

  public void setCompute(RetentionCompute compute) {
    this.compute = compute;
    if (compute != null) {
      this.unparsed |= compute.unparsed;
    }
  }

  public FormulaRetentionQuery dataSource(FormulaRetentionQueryDataSource dataSource) {
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
  public FormulaRetentionQueryDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(FormulaRetentionQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public FormulaRetentionQuery excludeAnonymousTraffic(Boolean excludeAnonymousTraffic) {
    this.excludeAnonymousTraffic = excludeAnonymousTraffic;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return excludeAnonymousTraffic
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCLUDE_ANONYMOUS_TRAFFIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getExcludeAnonymousTraffic() {
    return excludeAnonymousTraffic;
  }

  public void setExcludeAnonymousTraffic(Boolean excludeAnonymousTraffic) {
    this.excludeAnonymousTraffic = excludeAnonymousTraffic;
  }

  public FormulaRetentionQuery groupBy(List<RetentionGroupByItems> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (RetentionGroupByItems item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public FormulaRetentionQuery addGroupByItem(RetentionGroupByItems groupByItem) {
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
  public List<RetentionGroupByItems> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<RetentionGroupByItems> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (RetentionGroupByItems item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public FormulaRetentionQuery name(String name) {
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

  public FormulaRetentionQuery sampling(FormulaRetentionQuerySampling sampling) {
    this.sampling = sampling;
    this.unparsed |= sampling.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return sampling
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SAMPLING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FormulaRetentionQuerySampling getSampling() {
    return sampling;
  }

  public void setSampling(FormulaRetentionQuerySampling sampling) {
    this.sampling = sampling;
    if (sampling != null) {
      this.unparsed |= sampling.unparsed;
    }
  }

  public FormulaRetentionQuery search(RetentionSearch search) {
    this.search = search;
    this.unparsed |= search.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return search
   */
  @JsonProperty(JSON_PROPERTY_SEARCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RetentionSearch getSearch() {
    return search;
  }

  public void setSearch(RetentionSearch search) {
    this.search = search;
    if (search != null) {
      this.unparsed |= search.unparsed;
    }
  }

  /** Return true if this FormulaRetentionQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaRetentionQuery formulaRetentionQuery = (FormulaRetentionQuery) o;
    return Objects.equals(this.computationScope, formulaRetentionQuery.computationScope)
        && Objects.equals(this.compute, formulaRetentionQuery.compute)
        && Objects.equals(this.dataSource, formulaRetentionQuery.dataSource)
        && Objects.equals(
            this.excludeAnonymousTraffic, formulaRetentionQuery.excludeAnonymousTraffic)
        && Objects.equals(this.groupBy, formulaRetentionQuery.groupBy)
        && Objects.equals(this.name, formulaRetentionQuery.name)
        && Objects.equals(this.sampling, formulaRetentionQuery.sampling)
        && Objects.equals(this.search, formulaRetentionQuery.search);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        computationScope,
        compute,
        dataSource,
        excludeAnonymousTraffic,
        groupBy,
        name,
        sampling,
        search);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaRetentionQuery {\n");
    sb.append("    computationScope: ").append(toIndentedString(computationScope)).append("\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    excludeAnonymousTraffic: ")
        .append(toIndentedString(excludeAnonymousTraffic))
        .append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sampling: ").append(toIndentedString(sampling)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
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
