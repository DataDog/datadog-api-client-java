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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Health across all counters in the active accounting window. Includes hidden counters; contains no
 * scope values or identities.
 */
@JsonPropertyOrder({
  AiGatewayBudgetReportingSummary.JSON_PROPERTY_EXCEEDED_CAPACITY_COUNT,
  AiGatewayBudgetReportingSummary.JSON_PROPERTY_INSTANCE_COUNT,
  AiGatewayBudgetReportingSummary.JSON_PROPERTY_LIMIT_MODE,
  AiGatewayBudgetReportingSummary.JSON_PROPERTY_OVER_WARNING_THRESHOLD_COUNT,
  AiGatewayBudgetReportingSummary.JSON_PROPERTY_TOTAL_CAPACITY_MICROCENTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayBudgetReportingSummary {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXCEEDED_CAPACITY_COUNT = "exceeded_capacity_count";
  private Long exceededCapacityCount;

  public static final String JSON_PROPERTY_INSTANCE_COUNT = "instance_count";
  private Long instanceCount;

  public static final String JSON_PROPERTY_LIMIT_MODE = "limit_mode";
  private AiGatewayBudgetLimitMode limitMode;

  public static final String JSON_PROPERTY_OVER_WARNING_THRESHOLD_COUNT =
      "over_warning_threshold_count";
  private Long overWarningThresholdCount;

  public static final String JSON_PROPERTY_TOTAL_CAPACITY_MICROCENTS = "total_capacity_microcents";
  private Long totalCapacityMicrocents;

  public AiGatewayBudgetReportingSummary() {}

  @JsonCreator
  public AiGatewayBudgetReportingSummary(
      @JsonProperty(required = true, value = JSON_PROPERTY_EXCEEDED_CAPACITY_COUNT)
          Long exceededCapacityCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_INSTANCE_COUNT) Long instanceCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_LIMIT_MODE)
          AiGatewayBudgetLimitMode limitMode,
      @JsonProperty(required = true, value = JSON_PROPERTY_OVER_WARNING_THRESHOLD_COUNT)
          Long overWarningThresholdCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL_CAPACITY_MICROCENTS)
          Long totalCapacityMicrocents) {
    this.exceededCapacityCount = exceededCapacityCount;
    this.instanceCount = instanceCount;
    this.limitMode = limitMode;
    this.unparsed |= !limitMode.isValid();
    this.overWarningThresholdCount = overWarningThresholdCount;
    this.totalCapacityMicrocents = totalCapacityMicrocents;
  }

  public AiGatewayBudgetReportingSummary exceededCapacityCount(Long exceededCapacityCount) {
    this.exceededCapacityCount = exceededCapacityCount;
    return this;
  }

  /**
   * Number of counters at or above capacity.
   *
   * @return exceededCapacityCount
   */
  @JsonProperty(JSON_PROPERTY_EXCEEDED_CAPACITY_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getExceededCapacityCount() {
    return exceededCapacityCount;
  }

  public void setExceededCapacityCount(Long exceededCapacityCount) {
    this.exceededCapacityCount = exceededCapacityCount;
  }

  public AiGatewayBudgetReportingSummary instanceCount(Long instanceCount) {
    this.instanceCount = instanceCount;
    return this;
  }

  /**
   * Number of counters in the active window. Counters are created on first use.
   *
   * @return instanceCount
   */
  @JsonProperty(JSON_PROPERTY_INSTANCE_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getInstanceCount() {
    return instanceCount;
  }

  public void setInstanceCount(Long instanceCount) {
    this.instanceCount = instanceCount;
  }

  public AiGatewayBudgetReportingSummary limitMode(AiGatewayBudgetLimitMode limitMode) {
    this.limitMode = limitMode;
    this.unparsed |= !limitMode.isValid();
    return this;
  }

  /**
   * How the budget limit applies. <code>shared</code> is one limit for all matching traffic. <code>
   * per_instance</code> is one limit for each counter of a template budget that splits by value.
   *
   * @return limitMode
   */
  @JsonProperty(JSON_PROPERTY_LIMIT_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiGatewayBudgetLimitMode getLimitMode() {
    return limitMode;
  }

  public void setLimitMode(AiGatewayBudgetLimitMode limitMode) {
    if (!limitMode.isValid()) {
      this.unparsed = true;
    }
    this.limitMode = limitMode;
  }

  public AiGatewayBudgetReportingSummary overWarningThresholdCount(Long overWarningThresholdCount) {
    this.overWarningThresholdCount = overWarningThresholdCount;
    return this;
  }

  /**
   * Number of counters at or above the warning threshold.
   *
   * @return overWarningThresholdCount
   */
  @JsonProperty(JSON_PROPERTY_OVER_WARNING_THRESHOLD_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getOverWarningThresholdCount() {
    return overWarningThresholdCount;
  }

  public void setOverWarningThresholdCount(Long overWarningThresholdCount) {
    this.overWarningThresholdCount = overWarningThresholdCount;
  }

  public AiGatewayBudgetReportingSummary totalCapacityMicrocents(Long totalCapacityMicrocents) {
    this.totalCapacityMicrocents = totalCapacityMicrocents;
    return this;
  }

  /**
   * Combined capacity of the counters in the active window, in microcents. A shared budget reports
   * its configured limit before its first counter exists.
   *
   * @return totalCapacityMicrocents
   */
  @JsonProperty(JSON_PROPERTY_TOTAL_CAPACITY_MICROCENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTotalCapacityMicrocents() {
    return totalCapacityMicrocents;
  }

  public void setTotalCapacityMicrocents(Long totalCapacityMicrocents) {
    this.totalCapacityMicrocents = totalCapacityMicrocents;
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
   * @return AiGatewayBudgetReportingSummary
   */
  @JsonAnySetter
  public AiGatewayBudgetReportingSummary putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayBudgetReportingSummary object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayBudgetReportingSummary aiGatewayBudgetReportingSummary =
        (AiGatewayBudgetReportingSummary) o;
    return Objects.equals(
            this.exceededCapacityCount, aiGatewayBudgetReportingSummary.exceededCapacityCount)
        && Objects.equals(this.instanceCount, aiGatewayBudgetReportingSummary.instanceCount)
        && Objects.equals(this.limitMode, aiGatewayBudgetReportingSummary.limitMode)
        && Objects.equals(
            this.overWarningThresholdCount,
            aiGatewayBudgetReportingSummary.overWarningThresholdCount)
        && Objects.equals(
            this.totalCapacityMicrocents, aiGatewayBudgetReportingSummary.totalCapacityMicrocents)
        && Objects.equals(
            this.additionalProperties, aiGatewayBudgetReportingSummary.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        exceededCapacityCount,
        instanceCount,
        limitMode,
        overWarningThresholdCount,
        totalCapacityMicrocents,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayBudgetReportingSummary {\n");
    sb.append("    exceededCapacityCount: ")
        .append(toIndentedString(exceededCapacityCount))
        .append("\n");
    sb.append("    instanceCount: ").append(toIndentedString(instanceCount)).append("\n");
    sb.append("    limitMode: ").append(toIndentedString(limitMode)).append("\n");
    sb.append("    overWarningThresholdCount: ")
        .append(toIndentedString(overWarningThresholdCount))
        .append("\n");
    sb.append("    totalCapacityMicrocents: ")
        .append(toIndentedString(totalCapacityMicrocents))
        .append("\n");
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
