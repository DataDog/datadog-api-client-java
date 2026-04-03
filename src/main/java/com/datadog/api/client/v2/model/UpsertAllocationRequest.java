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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

/** Request to create or update a targeting rule (allocation) for a feature flag environment. */
@JsonPropertyOrder({
  UpsertAllocationRequest.JSON_PROPERTY_EXPERIMENT_ID,
  UpsertAllocationRequest.JSON_PROPERTY_EXPOSURE_SCHEDULE,
  UpsertAllocationRequest.JSON_PROPERTY_GUARDRAIL_METRICS,
  UpsertAllocationRequest.JSON_PROPERTY_ID,
  UpsertAllocationRequest.JSON_PROPERTY_KEY,
  UpsertAllocationRequest.JSON_PROPERTY_NAME,
  UpsertAllocationRequest.JSON_PROPERTY_TARGETING_RULES,
  UpsertAllocationRequest.JSON_PROPERTY_TYPE,
  UpsertAllocationRequest.JSON_PROPERTY_VARIANT_WEIGHTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UpsertAllocationRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXPERIMENT_ID = "experiment_id";
  private JsonNullable<String> experimentId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EXPOSURE_SCHEDULE = "exposure_schedule";
  private ExposureScheduleRequest exposureSchedule;

  public static final String JSON_PROPERTY_GUARDRAIL_METRICS = "guardrail_metrics";
  private List<GuardrailMetricRequest> guardrailMetrics = null;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TARGETING_RULES = "targeting_rules";
  private List<TargetingRuleRequest> targetingRules = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private AllocationType type;

  public static final String JSON_PROPERTY_VARIANT_WEIGHTS = "variant_weights";
  private List<VariantWeightRequest> variantWeights = null;

  public UpsertAllocationRequest() {}

  @JsonCreator
  public UpsertAllocationRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_KEY) String key,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) AllocationType type) {
    this.key = key;
    this.name = name;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public UpsertAllocationRequest experimentId(String experimentId) {
    this.experimentId = JsonNullable.<String>of(experimentId);
    return this;
  }

  /**
   * The experiment ID for experiment-linked allocations.
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

  public UpsertAllocationRequest exposureSchedule(ExposureScheduleRequest exposureSchedule) {
    this.exposureSchedule = exposureSchedule;
    this.unparsed |= exposureSchedule.unparsed;
    return this;
  }

  /**
   * Progressive release request payload.
   *
   * @return exposureSchedule
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPOSURE_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExposureScheduleRequest getExposureSchedule() {
    return exposureSchedule;
  }

  public void setExposureSchedule(ExposureScheduleRequest exposureSchedule) {
    this.exposureSchedule = exposureSchedule;
  }

  public UpsertAllocationRequest guardrailMetrics(List<GuardrailMetricRequest> guardrailMetrics) {
    this.guardrailMetrics = guardrailMetrics;
    for (GuardrailMetricRequest item : guardrailMetrics) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public UpsertAllocationRequest addGuardrailMetricsItem(
      GuardrailMetricRequest guardrailMetricsItem) {
    if (this.guardrailMetrics == null) {
      this.guardrailMetrics = new ArrayList<>();
    }
    this.guardrailMetrics.add(guardrailMetricsItem);
    this.unparsed |= guardrailMetricsItem.unparsed;
    return this;
  }

  /**
   * Guardrail metrics used to monitor and auto-pause or abort.
   *
   * @return guardrailMetrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GUARDRAIL_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<GuardrailMetricRequest> getGuardrailMetrics() {
    return guardrailMetrics;
  }

  public void setGuardrailMetrics(List<GuardrailMetricRequest> guardrailMetrics) {
    this.guardrailMetrics = guardrailMetrics;
  }

  public UpsertAllocationRequest id(UUID id) {
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

  public UpsertAllocationRequest key(String key) {
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

  public UpsertAllocationRequest name(String name) {
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

  public UpsertAllocationRequest targetingRules(List<TargetingRuleRequest> targetingRules) {
    this.targetingRules = targetingRules;
    for (TargetingRuleRequest item : targetingRules) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public UpsertAllocationRequest addTargetingRulesItem(TargetingRuleRequest targetingRulesItem) {
    if (this.targetingRules == null) {
      this.targetingRules = new ArrayList<>();
    }
    this.targetingRules.add(targetingRulesItem);
    this.unparsed |= targetingRulesItem.unparsed;
    return this;
  }

  /**
   * Targeting rules that determine audience eligibility.
   *
   * @return targetingRules
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGETING_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<TargetingRuleRequest> getTargetingRules() {
    return targetingRules;
  }

  public void setTargetingRules(List<TargetingRuleRequest> targetingRules) {
    this.targetingRules = targetingRules;
  }

  public UpsertAllocationRequest type(AllocationType type) {
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

  public UpsertAllocationRequest variantWeights(List<VariantWeightRequest> variantWeights) {
    this.variantWeights = variantWeights;
    for (VariantWeightRequest item : variantWeights) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public UpsertAllocationRequest addVariantWeightsItem(VariantWeightRequest variantWeightsItem) {
    if (this.variantWeights == null) {
      this.variantWeights = new ArrayList<>();
    }
    this.variantWeights.add(variantWeightsItem);
    this.unparsed |= variantWeightsItem.unparsed;
    return this;
  }

  /**
   * Variant distribution weights.
   *
   * @return variantWeights
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIANT_WEIGHTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<VariantWeightRequest> getVariantWeights() {
    return variantWeights;
  }

  public void setVariantWeights(List<VariantWeightRequest> variantWeights) {
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
   * @return UpsertAllocationRequest
   */
  @JsonAnySetter
  public UpsertAllocationRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UpsertAllocationRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpsertAllocationRequest upsertAllocationRequest = (UpsertAllocationRequest) o;
    return Objects.equals(this.experimentId, upsertAllocationRequest.experimentId)
        && Objects.equals(this.exposureSchedule, upsertAllocationRequest.exposureSchedule)
        && Objects.equals(this.guardrailMetrics, upsertAllocationRequest.guardrailMetrics)
        && Objects.equals(this.id, upsertAllocationRequest.id)
        && Objects.equals(this.key, upsertAllocationRequest.key)
        && Objects.equals(this.name, upsertAllocationRequest.name)
        && Objects.equals(this.targetingRules, upsertAllocationRequest.targetingRules)
        && Objects.equals(this.type, upsertAllocationRequest.type)
        && Objects.equals(this.variantWeights, upsertAllocationRequest.variantWeights)
        && Objects.equals(this.additionalProperties, upsertAllocationRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        experimentId,
        exposureSchedule,
        guardrailMetrics,
        id,
        key,
        name,
        targetingRules,
        type,
        variantWeights,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpsertAllocationRequest {\n");
    sb.append("    experimentId: ").append(toIndentedString(experimentId)).append("\n");
    sb.append("    exposureSchedule: ").append(toIndentedString(exposureSchedule)).append("\n");
    sb.append("    guardrailMetrics: ").append(toIndentedString(guardrailMetrics)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    targetingRules: ").append(toIndentedString(targetingRules)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
