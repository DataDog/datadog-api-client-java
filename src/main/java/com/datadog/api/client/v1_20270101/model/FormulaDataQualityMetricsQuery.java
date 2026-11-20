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
  FormulaDataQualityMetricsQuery.JSON_PROPERTY_ANOMALY_OPTIONS,
  FormulaDataQualityMetricsQuery.JSON_PROPERTY_DATA_SOURCE,
  FormulaDataQualityMetricsQuery.JSON_PROPERTY_FILTER,
  FormulaDataQualityMetricsQuery.JSON_PROPERTY_GROUP_BY,
  FormulaDataQualityMetricsQuery.JSON_PROPERTY_MEASURE,
  FormulaDataQualityMetricsQuery.JSON_PROPERTY_NAME,
  FormulaDataQualityMetricsQuery.JSON_PROPERTY_SCOPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormulaDataQualityMetricsQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ANOMALY_OPTIONS = "anomaly_options";
  private FormulaDataQualityMetricsQueryAnomalyOptions anomalyOptions;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private FormulaDataQualityMetricsQueryDataSource dataSource;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private String filter;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<String> groupBy = null;

  public static final String JSON_PROPERTY_MEASURE = "measure";
  private String measure;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public FormulaDataQualityMetricsQuery() {}

  @JsonCreator
  public FormulaDataQualityMetricsQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          FormulaDataQualityMetricsQueryDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_FILTER) String filter,
      @JsonProperty(required = true, value = JSON_PROPERTY_MEASURE) String measure,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.filter = filter;
    this.measure = measure;
    this.name = name;
  }

  public FormulaDataQualityMetricsQuery anomalyOptions(
      FormulaDataQualityMetricsQueryAnomalyOptions anomalyOptions) {
    this.anomalyOptions = anomalyOptions;
    this.unparsed |= anomalyOptions.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return anomalyOptions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANOMALY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FormulaDataQualityMetricsQueryAnomalyOptions getAnomalyOptions() {
    return anomalyOptions;
  }

  public void setAnomalyOptions(FormulaDataQualityMetricsQueryAnomalyOptions anomalyOptions) {
    this.anomalyOptions = anomalyOptions;
    if (anomalyOptions != null) {
      this.unparsed |= anomalyOptions.unparsed;
    }
  }

  public FormulaDataQualityMetricsQuery dataSource(
      FormulaDataQualityMetricsQueryDataSource dataSource) {
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
  public FormulaDataQualityMetricsQueryDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(FormulaDataQualityMetricsQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public FormulaDataQualityMetricsQuery filter(String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return filter
   */
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }

  public FormulaDataQualityMetricsQuery groupBy(List<String> groupBy) {
    this.groupBy = groupBy;
    return this;
  }

  public FormulaDataQualityMetricsQuery addGroupByItem(String groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
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
  public List<String> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<String> groupBy) {
    this.groupBy = groupBy;
  }

  public FormulaDataQualityMetricsQuery measure(String measure) {
    this.measure = measure;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return measure
   */
  @JsonProperty(JSON_PROPERTY_MEASURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMeasure() {
    return measure;
  }

  public void setMeasure(String measure) {
    this.measure = measure;
  }

  public FormulaDataQualityMetricsQuery name(String name) {
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

  public FormulaDataQualityMetricsQuery scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return scope
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  /** Return true if this FormulaDataQualityMetricsQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaDataQualityMetricsQuery formulaDataQualityMetricsQuery =
        (FormulaDataQualityMetricsQuery) o;
    return Objects.equals(this.anomalyOptions, formulaDataQualityMetricsQuery.anomalyOptions)
        && Objects.equals(this.dataSource, formulaDataQualityMetricsQuery.dataSource)
        && Objects.equals(this.filter, formulaDataQualityMetricsQuery.filter)
        && Objects.equals(this.groupBy, formulaDataQualityMetricsQuery.groupBy)
        && Objects.equals(this.measure, formulaDataQualityMetricsQuery.measure)
        && Objects.equals(this.name, formulaDataQualityMetricsQuery.name)
        && Objects.equals(this.scope, formulaDataQualityMetricsQuery.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anomalyOptions, dataSource, filter, groupBy, measure, name, scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaDataQualityMetricsQuery {\n");
    sb.append("    anomalyOptions: ").append(toIndentedString(anomalyOptions)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    measure: ").append(toIndentedString(measure)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
