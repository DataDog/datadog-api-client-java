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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

/** Targeting rule (allocation) details for a feature flag environment. */
@JsonPropertyOrder({
  Allocation.JSON_PROPERTY_CREATED_AT,
  Allocation.JSON_PROPERTY_ENVIRONMENT_IDS,
  Allocation.JSON_PROPERTY_EXPERIMENT_ID,
  Allocation.JSON_PROPERTY_EXPOSURE_SCHEDULE,
  Allocation.JSON_PROPERTY_GUARDRAIL_METRICS,
  Allocation.JSON_PROPERTY_ID,
  Allocation.JSON_PROPERTY_KEY,
  Allocation.JSON_PROPERTY_NAME,
  Allocation.JSON_PROPERTY_ORDER_POSITION,
  Allocation.JSON_PROPERTY_TARGETING_RULES,
  Allocation.JSON_PROPERTY_TYPE,
  Allocation.JSON_PROPERTY_UPDATED_AT,
  Allocation.JSON_PROPERTY_VARIANT_WEIGHTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class Allocation {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_ENVIRONMENT_IDS = "environment_ids";
  private List<UUID> environmentIds = new ArrayList<>();

  public static final String JSON_PROPERTY_EXPERIMENT_ID = "experiment_id";
  private JsonNullable<String> experimentId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EXPOSURE_SCHEDULE = "exposure_schedule";
  private AllocationExposureSchedule exposureSchedule;

  public static final String JSON_PROPERTY_GUARDRAIL_METRICS = "guardrail_metrics";
  private List<GuardrailMetric> guardrailMetrics = new ArrayList<>();

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORDER_POSITION = "order_position";
  private Long orderPosition;

  public static final String JSON_PROPERTY_TARGETING_RULES = "targeting_rules";
  private List<TargetingRule> targetingRules = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private AllocationType type;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_VARIANT_WEIGHTS = "variant_weights";
  private List<VariantWeight> variantWeights = new ArrayList<>();

  public Allocation() {}

  @JsonCreator
  public Allocation(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENVIRONMENT_IDS)
          List<UUID> environmentIds,
      @JsonProperty(required = true, value = JSON_PROPERTY_GUARDRAIL_METRICS)
          List<GuardrailMetric> guardrailMetrics,
      @JsonProperty(required = true, value = JSON_PROPERTY_KEY) String key,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_ORDER_POSITION) Long orderPosition,
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGETING_RULES)
          List<TargetingRule> targetingRules,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) AllocationType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_VARIANT_WEIGHTS)
          List<VariantWeight> variantWeights) {
    this.createdAt = createdAt;
    this.environmentIds = environmentIds;
    this.guardrailMetrics = guardrailMetrics;
    this.key = key;
    this.name = name;
    this.orderPosition = orderPosition;
    this.targetingRules = targetingRules;
    this.type = type;
    this.unparsed |= !type.isValid();
    this.updatedAt = updatedAt;
    this.variantWeights = variantWeights;
  }

  public Allocation createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The timestamp when the targeting rule allocation was created.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Allocation environmentIds(List<UUID> environmentIds) {
    this.environmentIds = environmentIds;
    return this;
  }

  public Allocation addEnvironmentIdsItem(UUID environmentIdsItem) {
    this.environmentIds.add(environmentIdsItem);
    return this;
  }

  /**
   * Environment IDs associated with this targeting rule allocation.
   *
   * @return environmentIds
   */
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<UUID> getEnvironmentIds() {
    return environmentIds;
  }

  public void setEnvironmentIds(List<UUID> environmentIds) {
    this.environmentIds = environmentIds;
  }

  public Allocation experimentId(String experimentId) {
    this.experimentId = JsonNullable.<String>of(experimentId);
    return this;
  }

  /**
   * The experiment ID linked to this targeting rule allocation.
   *
   * @return experimentId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getExperimentId() {
    return experimentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPERIMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getExperimentId_JsonNullable() {
    return experimentId;
  }

  @JsonProperty(JSON_PROPERTY_EXPERIMENT_ID)
  public void setExperimentId_JsonNullable(JsonNullable<String> experimentId) {
    this.experimentId = experimentId;
  }

  public void setExperimentId(String experimentId) {
    this.experimentId = JsonNullable.<String>of(experimentId);
  }

  public Allocation exposureSchedule(AllocationExposureSchedule exposureSchedule) {
    this.exposureSchedule = exposureSchedule;
    this.unparsed |= exposureSchedule.unparsed;
    return this;
  }

  /**
   * Progressive release details for a targeting rule allocation.
   *
   * @return exposureSchedule
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPOSURE_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AllocationExposureSchedule getExposureSchedule() {
    return exposureSchedule;
  }

  public void setExposureSchedule(AllocationExposureSchedule exposureSchedule) {
    this.exposureSchedule = exposureSchedule;
  }

  public Allocation guardrailMetrics(List<GuardrailMetric> guardrailMetrics) {
    this.guardrailMetrics = guardrailMetrics;
    for (GuardrailMetric item : guardrailMetrics) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public Allocation addGuardrailMetricsItem(GuardrailMetric guardrailMetricsItem) {
    this.guardrailMetrics.add(guardrailMetricsItem);
    this.unparsed |= guardrailMetricsItem.unparsed;
    return this;
  }

  /**
   * Guardrail metrics associated with this targeting rule allocation.
   *
   * @return guardrailMetrics
   */
  @JsonProperty(JSON_PROPERTY_GUARDRAIL_METRICS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<GuardrailMetric> getGuardrailMetrics() {
    return guardrailMetrics;
  }

  public void setGuardrailMetrics(List<GuardrailMetric> guardrailMetrics) {
    this.guardrailMetrics = guardrailMetrics;
  }

  public Allocation id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the targeting rule allocation.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Allocation key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The unique key of the targeting rule allocation.
   *
   * @return key
   */
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Allocation name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The display name of the targeting rule.
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

  public Allocation orderPosition(Long orderPosition) {
    this.orderPosition = orderPosition;
    return this;
  }

  /**
   * Sort order position within the environment.
   *
   * @return orderPosition
   */
  @JsonProperty(JSON_PROPERTY_ORDER_POSITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getOrderPosition() {
    return orderPosition;
  }

  public void setOrderPosition(Long orderPosition) {
    this.orderPosition = orderPosition;
  }

  public Allocation targetingRules(List<TargetingRule> targetingRules) {
    this.targetingRules = targetingRules;
    for (TargetingRule item : targetingRules) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public Allocation addTargetingRulesItem(TargetingRule targetingRulesItem) {
    this.targetingRules.add(targetingRulesItem);
    this.unparsed |= targetingRulesItem.unparsed;
    return this;
  }

  /**
   * Conditions associated with this targeting rule allocation.
   *
   * @return targetingRules
   */
  @JsonProperty(JSON_PROPERTY_TARGETING_RULES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<TargetingRule> getTargetingRules() {
    return targetingRules;
  }

  public void setTargetingRules(List<TargetingRule> targetingRules) {
    this.targetingRules = targetingRules;
  }

  public Allocation type(AllocationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of targeting rule (called allocation in the API model).
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AllocationType getType() {
    return type;
  }

  public void setType(AllocationType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public Allocation updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The timestamp when the targeting rule allocation was last updated.
   *
   * @return updatedAt
   */
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Allocation variantWeights(List<VariantWeight> variantWeights) {
    this.variantWeights = variantWeights;
    for (VariantWeight item : variantWeights) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public Allocation addVariantWeightsItem(VariantWeight variantWeightsItem) {
    this.variantWeights.add(variantWeightsItem);
    this.unparsed |= variantWeightsItem.unparsed;
    return this;
  }

  /**
   * Weighted variant assignments for this targeting rule allocation.
   *
   * @return variantWeights
   */
  @JsonProperty(JSON_PROPERTY_VARIANT_WEIGHTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<VariantWeight> getVariantWeights() {
    return variantWeights;
  }

  public void setVariantWeights(List<VariantWeight> variantWeights) {
    this.variantWeights = variantWeights;
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
   * @return Allocation
   */
  @JsonAnySetter
  public Allocation putAdditionalProperty(String key, Object value) {
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

  /** Return true if this Allocation object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Allocation allocation = (Allocation) o;
    return Objects.equals(this.createdAt, allocation.createdAt)
        && Objects.equals(this.environmentIds, allocation.environmentIds)
        && Objects.equals(this.experimentId, allocation.experimentId)
        && Objects.equals(this.exposureSchedule, allocation.exposureSchedule)
        && Objects.equals(this.guardrailMetrics, allocation.guardrailMetrics)
        && Objects.equals(this.id, allocation.id)
        && Objects.equals(this.key, allocation.key)
        && Objects.equals(this.name, allocation.name)
        && Objects.equals(this.orderPosition, allocation.orderPosition)
        && Objects.equals(this.targetingRules, allocation.targetingRules)
        && Objects.equals(this.type, allocation.type)
        && Objects.equals(this.updatedAt, allocation.updatedAt)
        && Objects.equals(this.variantWeights, allocation.variantWeights)
        && Objects.equals(this.additionalProperties, allocation.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        environmentIds,
        experimentId,
        exposureSchedule,
        guardrailMetrics,
        id,
        key,
        name,
        orderPosition,
        targetingRules,
        type,
        updatedAt,
        variantWeights,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Allocation {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    environmentIds: ").append(toIndentedString(environmentIds)).append("\n");
    sb.append("    experimentId: ").append(toIndentedString(experimentId)).append("\n");
    sb.append("    exposureSchedule: ").append(toIndentedString(exposureSchedule)).append("\n");
    sb.append("    guardrailMetrics: ").append(toIndentedString(guardrailMetrics)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orderPosition: ").append(toIndentedString(orderPosition)).append("\n");
    sb.append("    targetingRules: ").append(toIndentedString(targetingRules)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    variantWeights: ").append(toIndentedString(variantWeights)).append("\n");
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
