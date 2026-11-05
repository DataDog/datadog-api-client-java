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

/** Accounting state enforced for an AI Gateway budget's active period. */
@JsonPropertyOrder({
  AiGatewayBudgetPeriodAttributes.JSON_PROPERTY_BUDGET_ID,
  AiGatewayBudgetPeriodAttributes.JSON_PROPERTY_CURRENT_SPEND_MICROCENTS,
  AiGatewayBudgetPeriodAttributes.JSON_PROPERTY_DEFAULT_CAPACITY_MICROCENTS,
  AiGatewayBudgetPeriodAttributes.JSON_PROPERTY_EFFECTIVE_CAPACITY_MICROCENTS,
  AiGatewayBudgetPeriodAttributes.JSON_PROPERTY_MONITOR_ID,
  AiGatewayBudgetPeriodAttributes.JSON_PROPERTY_WINDOW_END,
  AiGatewayBudgetPeriodAttributes.JSON_PROPERTY_WINDOW_START
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayBudgetPeriodAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BUDGET_ID = "budget_id";
  private UUID budgetId;

  public static final String JSON_PROPERTY_CURRENT_SPEND_MICROCENTS = "current_spend_microcents";
  private Long currentSpendMicrocents;

  public static final String JSON_PROPERTY_DEFAULT_CAPACITY_MICROCENTS =
      "default_capacity_microcents";
  private Long defaultCapacityMicrocents;

  public static final String JSON_PROPERTY_EFFECTIVE_CAPACITY_MICROCENTS =
      "effective_capacity_microcents";
  private Long effectiveCapacityMicrocents;

  public static final String JSON_PROPERTY_MONITOR_ID = "monitor_id";
  private Long monitorId;

  public static final String JSON_PROPERTY_WINDOW_END = "window_end";
  private OffsetDateTime windowEnd;

  public static final String JSON_PROPERTY_WINDOW_START = "window_start";
  private OffsetDateTime windowStart;

  public AiGatewayBudgetPeriodAttributes() {}

  @JsonCreator
  public AiGatewayBudgetPeriodAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_BUDGET_ID) UUID budgetId,
      @JsonProperty(required = true, value = JSON_PROPERTY_CURRENT_SPEND_MICROCENTS)
          Long currentSpendMicrocents,
      @JsonProperty(required = true, value = JSON_PROPERTY_DEFAULT_CAPACITY_MICROCENTS)
          Long defaultCapacityMicrocents,
      @JsonProperty(required = true, value = JSON_PROPERTY_EFFECTIVE_CAPACITY_MICROCENTS)
          Long effectiveCapacityMicrocents,
      @JsonProperty(required = true, value = JSON_PROPERTY_MONITOR_ID) Long monitorId,
      @JsonProperty(required = true, value = JSON_PROPERTY_WINDOW_END) OffsetDateTime windowEnd,
      @JsonProperty(required = true, value = JSON_PROPERTY_WINDOW_START)
          OffsetDateTime windowStart) {
    this.budgetId = budgetId;
    this.currentSpendMicrocents = currentSpendMicrocents;
    this.defaultCapacityMicrocents = defaultCapacityMicrocents;
    this.effectiveCapacityMicrocents = effectiveCapacityMicrocents;
    this.monitorId = monitorId;
    if (monitorId != null) {}
    this.windowEnd = windowEnd;
    this.windowStart = windowStart;
  }

  public AiGatewayBudgetPeriodAttributes budgetId(UUID budgetId) {
    this.budgetId = budgetId;
    return this;
  }

  /**
   * Budget resource identifier.
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

  public AiGatewayBudgetPeriodAttributes currentSpendMicrocents(Long currentSpendMicrocents) {
    this.currentSpendMicrocents = currentSpendMicrocents;
    return this;
  }

  /**
   * Spend currently counted against the active accounting period.
   *
   * @return currentSpendMicrocents
   */
  @JsonProperty(JSON_PROPERTY_CURRENT_SPEND_MICROCENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getCurrentSpendMicrocents() {
    return currentSpendMicrocents;
  }

  public void setCurrentSpendMicrocents(Long currentSpendMicrocents) {
    this.currentSpendMicrocents = currentSpendMicrocents;
  }

  public AiGatewayBudgetPeriodAttributes defaultCapacityMicrocents(Long defaultCapacityMicrocents) {
    this.defaultCapacityMicrocents = defaultCapacityMicrocents;
    return this;
  }

  /**
   * Capacity that new accounting periods inherit from the budget definition.
   *
   * @return defaultCapacityMicrocents
   */
  @JsonProperty(JSON_PROPERTY_DEFAULT_CAPACITY_MICROCENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getDefaultCapacityMicrocents() {
    return defaultCapacityMicrocents;
  }

  public void setDefaultCapacityMicrocents(Long defaultCapacityMicrocents) {
    this.defaultCapacityMicrocents = defaultCapacityMicrocents;
  }

  public AiGatewayBudgetPeriodAttributes effectiveCapacityMicrocents(
      Long effectiveCapacityMicrocents) {
    this.effectiveCapacityMicrocents = effectiveCapacityMicrocents;
    return this;
  }

  /**
   * Capacity enforced for the active accounting period.
   *
   * @return effectiveCapacityMicrocents
   */
  @JsonProperty(JSON_PROPERTY_EFFECTIVE_CAPACITY_MICROCENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getEffectiveCapacityMicrocents() {
    return effectiveCapacityMicrocents;
  }

  public void setEffectiveCapacityMicrocents(Long effectiveCapacityMicrocents) {
    this.effectiveCapacityMicrocents = effectiveCapacityMicrocents;
  }

  public AiGatewayBudgetPeriodAttributes monitorId(Long monitorId) {
    this.monitorId = monitorId;
    if (monitorId != null) {}
    return this;
  }

  /**
   * Datadog monitor ID provisioned for this budget. Null when monitor provisioning was skipped or
   * failed.
   *
   * @return monitorId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITOR_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getMonitorId() {
    return monitorId;
  }

  public void setMonitorId(Long monitorId) {
    this.monitorId = monitorId;
  }

  public AiGatewayBudgetPeriodAttributes windowEnd(OffsetDateTime windowEnd) {
    this.windowEnd = windowEnd;
    return this;
  }

  /**
   * End of the active accounting window.
   *
   * @return windowEnd
   */
  @JsonProperty(JSON_PROPERTY_WINDOW_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getWindowEnd() {
    return windowEnd;
  }

  public void setWindowEnd(OffsetDateTime windowEnd) {
    this.windowEnd = windowEnd;
  }

  public AiGatewayBudgetPeriodAttributes windowStart(OffsetDateTime windowStart) {
    this.windowStart = windowStart;
    return this;
  }

  /**
   * Start of the active accounting window.
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
   * @return AiGatewayBudgetPeriodAttributes
   */
  @JsonAnySetter
  public AiGatewayBudgetPeriodAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayBudgetPeriodAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayBudgetPeriodAttributes aiGatewayBudgetPeriodAttributes =
        (AiGatewayBudgetPeriodAttributes) o;
    return Objects.equals(this.budgetId, aiGatewayBudgetPeriodAttributes.budgetId)
        && Objects.equals(
            this.currentSpendMicrocents, aiGatewayBudgetPeriodAttributes.currentSpendMicrocents)
        && Objects.equals(
            this.defaultCapacityMicrocents,
            aiGatewayBudgetPeriodAttributes.defaultCapacityMicrocents)
        && Objects.equals(
            this.effectiveCapacityMicrocents,
            aiGatewayBudgetPeriodAttributes.effectiveCapacityMicrocents)
        && Objects.equals(this.monitorId, aiGatewayBudgetPeriodAttributes.monitorId)
        && Objects.equals(this.windowEnd, aiGatewayBudgetPeriodAttributes.windowEnd)
        && Objects.equals(this.windowStart, aiGatewayBudgetPeriodAttributes.windowStart)
        && Objects.equals(
            this.additionalProperties, aiGatewayBudgetPeriodAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        budgetId,
        currentSpendMicrocents,
        defaultCapacityMicrocents,
        effectiveCapacityMicrocents,
        monitorId,
        windowEnd,
        windowStart,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayBudgetPeriodAttributes {\n");
    sb.append("    budgetId: ").append(toIndentedString(budgetId)).append("\n");
    sb.append("    currentSpendMicrocents: ")
        .append(toIndentedString(currentSpendMicrocents))
        .append("\n");
    sb.append("    defaultCapacityMicrocents: ")
        .append(toIndentedString(defaultCapacityMicrocents))
        .append("\n");
    sb.append("    effectiveCapacityMicrocents: ")
        .append(toIndentedString(effectiveCapacityMicrocents))
        .append("\n");
    sb.append("    monitorId: ").append(toIndentedString(monitorId)).append("\n");
    sb.append("    windowEnd: ").append(toIndentedString(windowEnd)).append("\n");
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
