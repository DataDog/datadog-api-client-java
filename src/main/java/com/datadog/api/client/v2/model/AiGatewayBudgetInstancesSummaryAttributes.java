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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/** Aggregate state across budget instance counters. */
@JsonPropertyOrder({
  AiGatewayBudgetInstancesSummaryAttributes.JSON_PROPERTY_BUDGET_ID,
  AiGatewayBudgetInstancesSummaryAttributes.JSON_PROPERTY_EXCEEDED_CAPACITY_COUNT,
  AiGatewayBudgetInstancesSummaryAttributes.JSON_PROPERTY_INSTANCE_COUNT,
  AiGatewayBudgetInstancesSummaryAttributes.JSON_PROPERTY_OVER_WARNING_THRESHOLD_COUNT,
  AiGatewayBudgetInstancesSummaryAttributes.JSON_PROPERTY_RESTRICTED_DETAILS,
  AiGatewayBudgetInstancesSummaryAttributes.JSON_PROPERTY_TOTAL_SPEND_MICROCENTS,
  AiGatewayBudgetInstancesSummaryAttributes.JSON_PROPERTY_WINDOW_START
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayBudgetInstancesSummaryAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BUDGET_ID = "budget_id";
  private UUID budgetId;

  public static final String JSON_PROPERTY_EXCEEDED_CAPACITY_COUNT = "exceeded_capacity_count";
  private Long exceededCapacityCount;

  public static final String JSON_PROPERTY_INSTANCE_COUNT = "instance_count";
  private Long instanceCount;

  public static final String JSON_PROPERTY_OVER_WARNING_THRESHOLD_COUNT =
      "over_warning_threshold_count";
  private Long overWarningThresholdCount;

  public static final String JSON_PROPERTY_RESTRICTED_DETAILS = "restricted_details";
  private Boolean restrictedDetails;

  public static final String JSON_PROPERTY_TOTAL_SPEND_MICROCENTS = "total_spend_microcents";
  private Long totalSpendMicrocents;

  public static final String JSON_PROPERTY_WINDOW_START = "window_start";
  private OffsetDateTime windowStart;

  public AiGatewayBudgetInstancesSummaryAttributes() {}

  @JsonCreator
  public AiGatewayBudgetInstancesSummaryAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_BUDGET_ID) UUID budgetId,
      @JsonProperty(required = true, value = JSON_PROPERTY_EXCEEDED_CAPACITY_COUNT)
          Long exceededCapacityCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_INSTANCE_COUNT) Long instanceCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_OVER_WARNING_THRESHOLD_COUNT)
          Long overWarningThresholdCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESTRICTED_DETAILS)
          Boolean restrictedDetails,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL_SPEND_MICROCENTS)
          Long totalSpendMicrocents,
      @JsonProperty(required = true, value = JSON_PROPERTY_WINDOW_START)
          OffsetDateTime windowStart) {
    this.budgetId = budgetId;
    this.exceededCapacityCount = exceededCapacityCount;
    this.instanceCount = instanceCount;
    this.overWarningThresholdCount = overWarningThresholdCount;
    this.restrictedDetails = restrictedDetails;
    this.totalSpendMicrocents = totalSpendMicrocents;
    this.windowStart = windowStart;
  }

  public AiGatewayBudgetInstancesSummaryAttributes budgetId(UUID budgetId) {
    this.budgetId = budgetId;
    return this;
  }

  /**
   * Budget identifier.
   *
   * @return budgetId
   */
  @JsonProperty(JSON_PROPERTY_BUDGET_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getBudgetId() {
    return budgetId;
  }

  public void setBudgetId(UUID budgetId) {
    this.budgetId = budgetId;
  }

  public AiGatewayBudgetInstancesSummaryAttributes exceededCapacityCount(
      Long exceededCapacityCount) {
    this.exceededCapacityCount = exceededCapacityCount;
    return this;
  }

  /**
   * Number of instances at or above capacity.
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

  public AiGatewayBudgetInstancesSummaryAttributes instanceCount(Long instanceCount) {
    this.instanceCount = instanceCount;
    return this;
  }

  /**
   * Number of instance counters.
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

  public AiGatewayBudgetInstancesSummaryAttributes overWarningThresholdCount(
      Long overWarningThresholdCount) {
    this.overWarningThresholdCount = overWarningThresholdCount;
    return this;
  }

  /**
   * Number of instances at or above the warning threshold.
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

  public AiGatewayBudgetInstancesSummaryAttributes restrictedDetails(Boolean restrictedDetails) {
    this.restrictedDetails = restrictedDetails;
    return this;
  }

  /**
   * Whether instances were withheld because their provider or model is hidden. Summary counts and
   * totals exclude those instances.
   *
   * @return restrictedDetails
   */
  @JsonProperty(JSON_PROPERTY_RESTRICTED_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getRestrictedDetails() {
    return restrictedDetails;
  }

  public void setRestrictedDetails(Boolean restrictedDetails) {
    this.restrictedDetails = restrictedDetails;
  }

  public AiGatewayBudgetInstancesSummaryAttributes totalSpendMicrocents(Long totalSpendMicrocents) {
    this.totalSpendMicrocents = totalSpendMicrocents;
    return this;
  }

  /**
   * Spend summed across all instances, in microcents.
   *
   * @return totalSpendMicrocents
   */
  @JsonProperty(JSON_PROPERTY_TOTAL_SPEND_MICROCENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTotalSpendMicrocents() {
    return totalSpendMicrocents;
  }

  public void setTotalSpendMicrocents(Long totalSpendMicrocents) {
    this.totalSpendMicrocents = totalSpendMicrocents;
  }

  public AiGatewayBudgetInstancesSummaryAttributes windowStart(OffsetDateTime windowStart) {
    this.windowStart = windowStart;
    return this;
  }

  /**
   * Start of the accounting window.
   *
   * @return windowStart
   */
  @JsonProperty(JSON_PROPERTY_WINDOW_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getWindowStart() {
    return windowStart;
  }

  public void setWindowStart(OffsetDateTime windowStart) {
    this.windowStart = windowStart;
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
   * @return AiGatewayBudgetInstancesSummaryAttributes
   */
  @JsonAnySetter
  public AiGatewayBudgetInstancesSummaryAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayBudgetInstancesSummaryAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayBudgetInstancesSummaryAttributes aiGatewayBudgetInstancesSummaryAttributes =
        (AiGatewayBudgetInstancesSummaryAttributes) o;
    return Objects.equals(this.budgetId, aiGatewayBudgetInstancesSummaryAttributes.budgetId)
        && Objects.equals(
            this.exceededCapacityCount,
            aiGatewayBudgetInstancesSummaryAttributes.exceededCapacityCount)
        && Objects.equals(
            this.instanceCount, aiGatewayBudgetInstancesSummaryAttributes.instanceCount)
        && Objects.equals(
            this.overWarningThresholdCount,
            aiGatewayBudgetInstancesSummaryAttributes.overWarningThresholdCount)
        && Objects.equals(
            this.restrictedDetails, aiGatewayBudgetInstancesSummaryAttributes.restrictedDetails)
        && Objects.equals(
            this.totalSpendMicrocents,
            aiGatewayBudgetInstancesSummaryAttributes.totalSpendMicrocents)
        && Objects.equals(this.windowStart, aiGatewayBudgetInstancesSummaryAttributes.windowStart)
        && Objects.equals(
            this.additionalProperties,
            aiGatewayBudgetInstancesSummaryAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        budgetId,
        exceededCapacityCount,
        instanceCount,
        overWarningThresholdCount,
        restrictedDetails,
        totalSpendMicrocents,
        windowStart,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayBudgetInstancesSummaryAttributes {\n");
    sb.append("    budgetId: ").append(toIndentedString(budgetId)).append("\n");
    sb.append("    exceededCapacityCount: ")
        .append(toIndentedString(exceededCapacityCount))
        .append("\n");
    sb.append("    instanceCount: ").append(toIndentedString(instanceCount)).append("\n");
    sb.append("    overWarningThresholdCount: ")
        .append(toIndentedString(overWarningThresholdCount))
        .append("\n");
    sb.append("    restrictedDetails: ").append(toIndentedString(restrictedDetails)).append("\n");
    sb.append("    totalSpendMicrocents: ")
        .append(toIndentedString(totalSpendMicrocents))
        .append("\n");
    sb.append("    windowStart: ").append(toIndentedString(windowStart)).append("\n");
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
