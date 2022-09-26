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

/** Query for matching rule on signals */
@JsonPropertyOrder({
  SecurityMonitoringSignalRuleQueryCreate.JSON_PROPERTY_AGGREGATION,
  SecurityMonitoringSignalRuleQueryCreate.JSON_PROPERTY_CORRELATED_BY_FIELDS,
  SecurityMonitoringSignalRuleQueryCreate.JSON_PROPERTY_CORRELATED_QUERY_INDEX,
  SecurityMonitoringSignalRuleQueryCreate.JSON_PROPERTY_METRICS,
  SecurityMonitoringSignalRuleQueryCreate.JSON_PROPERTY_NAME,
  SecurityMonitoringSignalRuleQueryCreate.JSON_PROPERTY_RULE_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringSignalRuleQueryCreate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private SecurityMonitoringRuleQueryAggregation aggregation;

  public static final String JSON_PROPERTY_CORRELATED_BY_FIELDS = "correlatedByFields";
  private List<String> correlatedByFields = null;

  public static final String JSON_PROPERTY_CORRELATED_QUERY_INDEX = "correlatedQueryIndex";
  private Integer correlatedQueryIndex;

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private List<String> metrics = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RULE_ID = "ruleId";
  private String ruleId;

  public SecurityMonitoringSignalRuleQueryCreate() {}

  @JsonCreator
  public SecurityMonitoringSignalRuleQueryCreate(
      @JsonProperty(required = true, value = JSON_PROPERTY_RULE_ID) String ruleId) {
    this.ruleId = ruleId;
  }

  public SecurityMonitoringSignalRuleQueryCreate aggregation(
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

  public SecurityMonitoringSignalRuleQueryCreate correlatedByFields(
      List<String> correlatedByFields) {
    this.correlatedByFields = correlatedByFields;
    return this;
  }

  public SecurityMonitoringSignalRuleQueryCreate addCorrelatedByFieldsItem(
      String correlatedByFieldsItem) {
    if (this.correlatedByFields == null) {
      this.correlatedByFields = new ArrayList<>();
    }
    this.correlatedByFields.add(correlatedByFieldsItem);
    return this;
  }

  /**
   * Fields to group by.
   *
   * @return correlatedByFields
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CORRELATED_BY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getCorrelatedByFields() {
    return correlatedByFields;
  }

  public void setCorrelatedByFields(List<String> correlatedByFields) {
    this.correlatedByFields = correlatedByFields;
  }

  public SecurityMonitoringSignalRuleQueryCreate correlatedQueryIndex(
      Integer correlatedQueryIndex) {
    this.correlatedQueryIndex = correlatedQueryIndex;
    return this;
  }

  /**
   * Index of the rule query used to retrieve the correlated field. maximum: 9
   *
   * @return correlatedQueryIndex
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CORRELATED_QUERY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getCorrelatedQueryIndex() {
    return correlatedQueryIndex;
  }

  public void setCorrelatedQueryIndex(Integer correlatedQueryIndex) {
    this.correlatedQueryIndex = correlatedQueryIndex;
  }

  public SecurityMonitoringSignalRuleQueryCreate metrics(List<String> metrics) {
    this.metrics = metrics;
    return this;
  }

  public SecurityMonitoringSignalRuleQueryCreate addMetricsItem(String metricsItem) {
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

  public SecurityMonitoringSignalRuleQueryCreate name(String name) {
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

  public SecurityMonitoringSignalRuleQueryCreate ruleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

  /**
   * Rule ID to match on signals.
   *
   * @return ruleId
   */
  @JsonProperty(JSON_PROPERTY_RULE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRuleId() {
    return ruleId;
  }

  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }

  /** Return true if this SecurityMonitoringSignalRuleQueryCreate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringSignalRuleQueryCreate securityMonitoringSignalRuleQueryCreate =
        (SecurityMonitoringSignalRuleQueryCreate) o;
    return Objects.equals(this.aggregation, securityMonitoringSignalRuleQueryCreate.aggregation)
        && Objects.equals(
            this.correlatedByFields, securityMonitoringSignalRuleQueryCreate.correlatedByFields)
        && Objects.equals(
            this.correlatedQueryIndex, securityMonitoringSignalRuleQueryCreate.correlatedQueryIndex)
        && Objects.equals(this.metrics, securityMonitoringSignalRuleQueryCreate.metrics)
        && Objects.equals(this.name, securityMonitoringSignalRuleQueryCreate.name)
        && Objects.equals(this.ruleId, securityMonitoringSignalRuleQueryCreate.ruleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        aggregation, correlatedByFields, correlatedQueryIndex, metrics, name, ruleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSignalRuleQueryCreate {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    correlatedByFields: ").append(toIndentedString(correlatedByFields)).append("\n");
    sb.append("    correlatedQueryIndex: ")
        .append(toIndentedString(correlatedQueryIndex))
        .append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
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
