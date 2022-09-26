/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Query for matching rule. */
@JsonPropertyOrder({
  SecurityMonitoringStandardRuleQueryCreate.JSON_PROPERTY_AGGREGATION,
  SecurityMonitoringStandardRuleQueryCreate.JSON_PROPERTY_DISTINCT_FIELDS,
  SecurityMonitoringStandardRuleQueryCreate.JSON_PROPERTY_GROUP_BY_FIELDS,
  SecurityMonitoringStandardRuleQueryCreate.JSON_PROPERTY_METRIC,
  SecurityMonitoringStandardRuleQueryCreate.JSON_PROPERTY_METRICS,
  SecurityMonitoringStandardRuleQueryCreate.JSON_PROPERTY_NAME,
  SecurityMonitoringStandardRuleQueryCreate.JSON_PROPERTY_QUERY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringStandardRuleQueryCreate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private SecurityMonitoringRuleQueryAggregation aggregation;

  public static final String JSON_PROPERTY_DISTINCT_FIELDS = "distinctFields";
  private List<String> distinctFields = null;

  public static final String JSON_PROPERTY_GROUP_BY_FIELDS = "groupByFields";
  private List<String> groupByFields = null;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private List<String> metrics = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public SecurityMonitoringStandardRuleQueryCreate() {}

  @JsonCreator
  public SecurityMonitoringStandardRuleQueryCreate(
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query) {
    this.query = query;
  }

  public SecurityMonitoringStandardRuleQueryCreate aggregation(
      SecurityMonitoringRuleQueryAggregation aggregation) {
    this.aggregation = aggregation;
    this.unparsed |= !aggregation.isValid();
    return this;
  }

  /**
   * The aggregation type.
   *
   * @return aggregation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringRuleQueryAggregation getAggregation() {
    return aggregation;
  }

  public void setAggregation(SecurityMonitoringRuleQueryAggregation aggregation) {
    if (!aggregation.isValid()) {
      this.unparsed = true;
    }
    this.aggregation = aggregation;
  }

  public SecurityMonitoringStandardRuleQueryCreate distinctFields(List<String> distinctFields) {
    this.distinctFields = distinctFields;
    return this;
  }

  public SecurityMonitoringStandardRuleQueryCreate addDistinctFieldsItem(
      String distinctFieldsItem) {
    if (this.distinctFields == null) {
      this.distinctFields = new ArrayList<>();
    }
    this.distinctFields.add(distinctFieldsItem);
    return this;
  }

  /**
   * Field for which the cardinality is measured. Sent as an array.
   *
   * @return distinctFields
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISTINCT_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getDistinctFields() {
    return distinctFields;
  }

  public void setDistinctFields(List<String> distinctFields) {
    this.distinctFields = distinctFields;
  }

  public SecurityMonitoringStandardRuleQueryCreate groupByFields(List<String> groupByFields) {
    this.groupByFields = groupByFields;
    return this;
  }

  public SecurityMonitoringStandardRuleQueryCreate addGroupByFieldsItem(String groupByFieldsItem) {
    if (this.groupByFields == null) {
      this.groupByFields = new ArrayList<>();
    }
    this.groupByFields.add(groupByFieldsItem);
    return this;
  }

  /**
   * Fields to group by.
   *
   * @return groupByFields
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getGroupByFields() {
    return groupByFields;
  }

  public void setGroupByFields(List<String> groupByFields) {
    this.groupByFields = groupByFields;
  }

  public SecurityMonitoringStandardRuleQueryCreate metric(String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * The target field to aggregate over when using the sum or max aggregations.
   *
   * @return metric
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMetric() {
    return metric;
  }

  public void setMetric(String metric) {
    this.metric = metric;
  }

  public SecurityMonitoringStandardRuleQueryCreate metrics(List<String> metrics) {
    this.metrics = metrics;
    return this;
  }

  public SecurityMonitoringStandardRuleQueryCreate addMetricsItem(String metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

  /**
   * Group of target fields to aggregate over when using the new value aggregations.
   *
   * @return metrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getMetrics() {
    return metrics;
  }

  public void setMetrics(List<String> metrics) {
    this.metrics = metrics;
  }

  public SecurityMonitoringStandardRuleQueryCreate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the query.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SecurityMonitoringStandardRuleQueryCreate query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Query to run on logs.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  /** Return true if this SecurityMonitoringStandardRuleQueryCreate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringStandardRuleQueryCreate securityMonitoringStandardRuleQueryCreate =
        (SecurityMonitoringStandardRuleQueryCreate) o;
    return Objects.equals(this.aggregation, securityMonitoringStandardRuleQueryCreate.aggregation)
        && Objects.equals(
            this.distinctFields, securityMonitoringStandardRuleQueryCreate.distinctFields)
        && Objects.equals(
            this.groupByFields, securityMonitoringStandardRuleQueryCreate.groupByFields)
        && Objects.equals(this.metric, securityMonitoringStandardRuleQueryCreate.metric)
        && Objects.equals(this.metrics, securityMonitoringStandardRuleQueryCreate.metrics)
        && Objects.equals(this.name, securityMonitoringStandardRuleQueryCreate.name)
        && Objects.equals(this.query, securityMonitoringStandardRuleQueryCreate.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregation, distinctFields, groupByFields, metric, metrics, name, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringStandardRuleQueryCreate {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    distinctFields: ").append(toIndentedString(distinctFields)).append("\n");
    sb.append("    groupByFields: ").append(toIndentedString(groupByFields)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("}");
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
