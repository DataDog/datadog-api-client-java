/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes used to update an AI Gateway model group. */
@JsonPropertyOrder({
  AiGatewayModelGroupUpdateAttributes.JSON_PROPERTY_ALLOW_FAST_MODE,
  AiGatewayModelGroupUpdateAttributes.JSON_PROPERTY_EXPECTED_REVISION,
  AiGatewayModelGroupUpdateAttributes.JSON_PROPERTY_MAX_REASONING_LEVEL,
  AiGatewayModelGroupUpdateAttributes.JSON_PROPERTY_MODEL_IDS,
  AiGatewayModelGroupUpdateAttributes.JSON_PROPERTY_NAME,
  AiGatewayModelGroupUpdateAttributes.JSON_PROPERTY_PROVIDER_IDS,
  AiGatewayModelGroupUpdateAttributes.JSON_PROPERTY_ROUTING_RULE_SLUGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayModelGroupUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOW_FAST_MODE = "allow_fast_mode";
  private Boolean allowFastMode;

  public static final String JSON_PROPERTY_EXPECTED_REVISION = "expected_revision";
  private Long expectedRevision;

  public static final String JSON_PROPERTY_MAX_REASONING_LEVEL = "max_reasoning_level";
  private JsonNullable<AiGatewayNullableMaxReasoningLevel> maxReasoningLevel =
      JsonNullable.<AiGatewayNullableMaxReasoningLevel>undefined();

  public static final String JSON_PROPERTY_MODEL_IDS = "model_ids";
  private List<Long> modelIds = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROVIDER_IDS = "provider_ids";
  private List<Long> providerIds = null;

  public static final String JSON_PROPERTY_ROUTING_RULE_SLUGS = "routing_rule_slugs";
  private List<String> routingRuleSlugs = null;

  public AiGatewayModelGroupUpdateAttributes allowFastMode(Boolean allowFastMode) {
    this.allowFastMode = allowFastMode;
    return this;
  }

  /**
   * Whether fast mode is allowed for models and routing rules in the group.
   *
   * @return allowFastMode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_FAST_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAllowFastMode() {
    return allowFastMode;
  }

  public void setAllowFastMode(Boolean allowFastMode) {
    this.allowFastMode = allowFastMode;
  }

  public AiGatewayModelGroupUpdateAttributes expectedRevision(Long expectedRevision) {
    this.expectedRevision = expectedRevision;
    return this;
  }

  /**
   * Required when updating the default model group. Must match its current revision; a stale
   * revision returns HTTP 409. Omit for named policies. minimum: 0
   *
   * @return expectedRevision
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPECTED_REVISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getExpectedRevision() {
    return expectedRevision;
  }

  public void setExpectedRevision(Long expectedRevision) {
    this.expectedRevision = expectedRevision;
  }

  public AiGatewayModelGroupUpdateAttributes maxReasoningLevel(
      AiGatewayNullableMaxReasoningLevel maxReasoningLevel) {
    this.maxReasoningLevel = JsonNullable.<AiGatewayNullableMaxReasoningLevel>of(maxReasoningLevel);
    return this;
  }

  /**
   * Maximum reasoning level permitted by a model group.
   *
   * @return maxReasoningLevel
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public AiGatewayNullableMaxReasoningLevel getMaxReasoningLevel() {
    return maxReasoningLevel.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MAX_REASONING_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<AiGatewayNullableMaxReasoningLevel> getMaxReasoningLevel_JsonNullable() {
    return maxReasoningLevel;
  }

  @JsonProperty(JSON_PROPERTY_MAX_REASONING_LEVEL)
  public void setMaxReasoningLevel_JsonNullable(
      JsonNullable<AiGatewayNullableMaxReasoningLevel> maxReasoningLevel) {
    this.maxReasoningLevel = maxReasoningLevel;
  }

  public void setMaxReasoningLevel(AiGatewayNullableMaxReasoningLevel maxReasoningLevel) {
    if (!maxReasoningLevel.isValid()) {
      this.unparsed = true;
    }
    this.maxReasoningLevel = JsonNullable.<AiGatewayNullableMaxReasoningLevel>of(maxReasoningLevel);
  }

  public AiGatewayModelGroupUpdateAttributes modelIds(List<Long> modelIds) {
    this.modelIds = modelIds;
    return this;
  }

  public AiGatewayModelGroupUpdateAttributes addModelIdsItem(Long modelIdsItem) {
    if (this.modelIds == null) {
      this.modelIds = new ArrayList<>();
    }
    this.modelIds.add(modelIdsItem);
    return this;
  }

  /**
   * Individually selected model catalog IDs. Replaces this selection only. Omit to preserve it; an
   * empty array clears it. Null is invalid. Individual selections do not include future models. New
   * selections require provider View; retaining or removing saved hidden selections requires only
   * parent Edit.
   *
   * @return modelIds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODEL_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Long> getModelIds() {
    return modelIds;
  }

  public void setModelIds(List<Long> modelIds) {
    this.modelIds = modelIds;
  }

  public AiGatewayModelGroupUpdateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Human-readable resource name.
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

  public AiGatewayModelGroupUpdateAttributes providerIds(List<Long> providerIds) {
    this.providerIds = providerIds;
    return this;
  }

  public AiGatewayModelGroupUpdateAttributes addProviderIdsItem(Long providerIdsItem) {
    if (this.providerIds == null) {
      this.providerIds = new ArrayList<>();
    }
    this.providerIds.add(providerIdsItem);
    return this;
  }

  /**
   * Explicit provider selections, including current and future models. Omit to preserve selections
   * on update; an empty array clears them. Null is invalid. New selections require provider View;
   * saved hidden IDs can be retained or removed.
   *
   * @return providerIds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVIDER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Long> getProviderIds() {
    return providerIds;
  }

  public void setProviderIds(List<Long> providerIds) {
    this.providerIds = providerIds;
  }

  public AiGatewayModelGroupUpdateAttributes routingRuleSlugs(List<String> routingRuleSlugs) {
    this.routingRuleSlugs = routingRuleSlugs;
    return this;
  }

  public AiGatewayModelGroupUpdateAttributes addRoutingRuleSlugsItem(String routingRuleSlugsItem) {
    if (this.routingRuleSlugs == null) {
      this.routingRuleSlugs = new ArrayList<>();
    }
    this.routingRuleSlugs.add(routingRuleSlugsItem);
    return this;
  }

  /**
   * Organization-unique routing rule slugs. Replaces route selections only. Omit to preserve them;
   * an empty array clears them. Null is invalid.
   *
   * @return routingRuleSlugs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROUTING_RULE_SLUGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getRoutingRuleSlugs() {
    return routingRuleSlugs;
  }

  public void setRoutingRuleSlugs(List<String> routingRuleSlugs) {
    this.routingRuleSlugs = routingRuleSlugs;
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
   * @return AiGatewayModelGroupUpdateAttributes
   */
  @JsonAnySetter
  public AiGatewayModelGroupUpdateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayModelGroupUpdateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayModelGroupUpdateAttributes aiGatewayModelGroupUpdateAttributes =
        (AiGatewayModelGroupUpdateAttributes) o;
    return Objects.equals(this.allowFastMode, aiGatewayModelGroupUpdateAttributes.allowFastMode)
        && Objects.equals(
            this.expectedRevision, aiGatewayModelGroupUpdateAttributes.expectedRevision)
        && Objects.equals(
            this.maxReasoningLevel, aiGatewayModelGroupUpdateAttributes.maxReasoningLevel)
        && Objects.equals(this.modelIds, aiGatewayModelGroupUpdateAttributes.modelIds)
        && Objects.equals(this.name, aiGatewayModelGroupUpdateAttributes.name)
        && Objects.equals(this.providerIds, aiGatewayModelGroupUpdateAttributes.providerIds)
        && Objects.equals(
            this.routingRuleSlugs, aiGatewayModelGroupUpdateAttributes.routingRuleSlugs)
        && Objects.equals(
            this.additionalProperties, aiGatewayModelGroupUpdateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowFastMode,
        expectedRevision,
        maxReasoningLevel,
        modelIds,
        name,
        providerIds,
        routingRuleSlugs,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayModelGroupUpdateAttributes {\n");
    sb.append("    allowFastMode: ").append(toIndentedString(allowFastMode)).append("\n");
    sb.append("    expectedRevision: ").append(toIndentedString(expectedRevision)).append("\n");
    sb.append("    maxReasoningLevel: ").append(toIndentedString(maxReasoningLevel)).append("\n");
    sb.append("    modelIds: ").append(toIndentedString(modelIds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    providerIds: ").append(toIndentedString(providerIds)).append("\n");
    sb.append("    routingRuleSlugs: ").append(toIndentedString(routingRuleSlugs)).append("\n");
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
