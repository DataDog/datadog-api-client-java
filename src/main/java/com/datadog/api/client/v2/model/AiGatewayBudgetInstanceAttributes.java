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

/** One budget instance counter. */
@JsonPropertyOrder({
  AiGatewayBudgetInstanceAttributes.JSON_PROPERTY_BUDGET_ID,
  AiGatewayBudgetInstanceAttributes.JSON_PROPERTY_EFFECTIVE_CAPACITY_MICROCENTS,
  AiGatewayBudgetInstanceAttributes.JSON_PROPERTY_INSTANCE_KEY,
  AiGatewayBudgetInstanceAttributes.JSON_PROPERTY_MODIFIED_AT,
  AiGatewayBudgetInstanceAttributes.JSON_PROPERTY_SPEND_MICROCENTS,
  AiGatewayBudgetInstanceAttributes.JSON_PROPERTY_SPLIT_DIMS,
  AiGatewayBudgetInstanceAttributes.JSON_PROPERTY_WINDOW_START
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayBudgetInstanceAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BUDGET_ID = "budget_id";
  private UUID budgetId;

  public static final String JSON_PROPERTY_EFFECTIVE_CAPACITY_MICROCENTS =
      "effective_capacity_microcents";
  private Long effectiveCapacityMicrocents;

  public static final String JSON_PROPERTY_INSTANCE_KEY = "instance_key";
  private String instanceKey;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_SPEND_MICROCENTS = "spend_microcents";
  private Long spendMicrocents;

  public static final String JSON_PROPERTY_SPLIT_DIMS = "split_dims";
  private Map<String, String> splitDims = new HashMap<String, String>();

  public static final String JSON_PROPERTY_WINDOW_START = "window_start";
  private OffsetDateTime windowStart;

  public AiGatewayBudgetInstanceAttributes() {}

  @JsonCreator
  public AiGatewayBudgetInstanceAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_BUDGET_ID) UUID budgetId,
      @JsonProperty(required = true, value = JSON_PROPERTY_EFFECTIVE_CAPACITY_MICROCENTS)
          Long effectiveCapacityMicrocents,
      @JsonProperty(required = true, value = JSON_PROPERTY_INSTANCE_KEY) String instanceKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_AT) OffsetDateTime modifiedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_SPEND_MICROCENTS) Long spendMicrocents,
      @JsonProperty(required = true, value = JSON_PROPERTY_SPLIT_DIMS)
          Map<String, String> splitDims,
      @JsonProperty(required = true, value = JSON_PROPERTY_WINDOW_START)
          OffsetDateTime windowStart) {
    this.budgetId = budgetId;
    this.effectiveCapacityMicrocents = effectiveCapacityMicrocents;
    this.instanceKey = instanceKey;
    this.modifiedAt = modifiedAt;
    this.spendMicrocents = spendMicrocents;
    this.splitDims = splitDims;
    this.windowStart = windowStart;
  }

  public AiGatewayBudgetInstanceAttributes budgetId(UUID budgetId) {
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

  public AiGatewayBudgetInstanceAttributes effectiveCapacityMicrocents(
      Long effectiveCapacityMicrocents) {
    this.effectiveCapacityMicrocents = effectiveCapacityMicrocents;
    return this;
  }

  /**
   * Capacity enforced for this instance, in microcents.
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

  public AiGatewayBudgetInstanceAttributes instanceKey(String instanceKey) {
    this.instanceKey = instanceKey;
    return this;
  }

  /**
   * Opaque canonical counter key. Empty for legacy pooled counters.
   *
   * @return instanceKey
   */
  @JsonProperty(JSON_PROPERTY_INSTANCE_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getInstanceKey() {
    return instanceKey;
  }

  public void setInstanceKey(String instanceKey) {
    this.instanceKey = instanceKey;
  }

  public AiGatewayBudgetInstanceAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Time the instance counter was last modified.
   *
   * @return modifiedAt
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public AiGatewayBudgetInstanceAttributes spendMicrocents(Long spendMicrocents) {
    this.spendMicrocents = spendMicrocents;
    return this;
  }

  /**
   * Spend counted against this instance, in microcents.
   *
   * @return spendMicrocents
   */
  @JsonProperty(JSON_PROPERTY_SPEND_MICROCENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSpendMicrocents() {
    return spendMicrocents;
  }

  public void setSpendMicrocents(Long spendMicrocents) {
    this.spendMicrocents = spendMicrocents;
  }

  public AiGatewayBudgetInstanceAttributes splitDims(Map<String, String> splitDims) {
    this.splitDims = splitDims;
    return this;
  }

  public AiGatewayBudgetInstanceAttributes putSplitDimsItem(String key, String splitDimsItem) {
    this.splitDims.put(key, splitDimsItem);
    return this;
  }

  /**
   * Dimension values decoded from instance_key. User and Team values are raw UUIDs.
   *
   * @return splitDims
   */
  @JsonProperty(JSON_PROPERTY_SPLIT_DIMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, String> getSplitDims() {
    return splitDims;
  }

  public void setSplitDims(Map<String, String> splitDims) {
    this.splitDims = splitDims;
  }

  public AiGatewayBudgetInstanceAttributes windowStart(OffsetDateTime windowStart) {
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
   * @return AiGatewayBudgetInstanceAttributes
   */
  @JsonAnySetter
  public AiGatewayBudgetInstanceAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayBudgetInstanceAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayBudgetInstanceAttributes aiGatewayBudgetInstanceAttributes =
        (AiGatewayBudgetInstanceAttributes) o;
    return Objects.equals(this.budgetId, aiGatewayBudgetInstanceAttributes.budgetId)
        && Objects.equals(
            this.effectiveCapacityMicrocents,
            aiGatewayBudgetInstanceAttributes.effectiveCapacityMicrocents)
        && Objects.equals(this.instanceKey, aiGatewayBudgetInstanceAttributes.instanceKey)
        && Objects.equals(this.modifiedAt, aiGatewayBudgetInstanceAttributes.modifiedAt)
        && Objects.equals(this.spendMicrocents, aiGatewayBudgetInstanceAttributes.spendMicrocents)
        && Objects.equals(this.splitDims, aiGatewayBudgetInstanceAttributes.splitDims)
        && Objects.equals(this.windowStart, aiGatewayBudgetInstanceAttributes.windowStart)
        && Objects.equals(
            this.additionalProperties, aiGatewayBudgetInstanceAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        budgetId,
        effectiveCapacityMicrocents,
        instanceKey,
        modifiedAt,
        spendMicrocents,
        splitDims,
        windowStart,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayBudgetInstanceAttributes {\n");
    sb.append("    budgetId: ").append(toIndentedString(budgetId)).append("\n");
    sb.append("    effectiveCapacityMicrocents: ")
        .append(toIndentedString(effectiveCapacityMicrocents))
        .append("\n");
    sb.append("    instanceKey: ").append(toIndentedString(instanceKey)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    spendMicrocents: ").append(toIndentedString(spendMicrocents)).append("\n");
    sb.append("    splitDims: ").append(toIndentedString(splitDims)).append("\n");
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
