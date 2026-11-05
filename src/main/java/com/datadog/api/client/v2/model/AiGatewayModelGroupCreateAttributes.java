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

/** Attributes used to create an AI Gateway model group. */
@JsonPropertyOrder({
  AiGatewayModelGroupCreateAttributes.JSON_PROPERTY_ALLOW_FAST_MODE,
  AiGatewayModelGroupCreateAttributes.JSON_PROPERTY_BINDINGS,
  AiGatewayModelGroupCreateAttributes.JSON_PROPERTY_MAX_REASONING_LEVEL,
  AiGatewayModelGroupCreateAttributes.JSON_PROPERTY_MODEL_IDS,
  AiGatewayModelGroupCreateAttributes.JSON_PROPERTY_NAME,
  AiGatewayModelGroupCreateAttributes.JSON_PROPERTY_PROVIDER_IDS,
  AiGatewayModelGroupCreateAttributes.JSON_PROPERTY_ROUTING_RULE_SLUGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayModelGroupCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOW_FAST_MODE = "allow_fast_mode";
  private Boolean allowFastMode = true;

  public static final String JSON_PROPERTY_BINDINGS = "bindings";
  private List<AiGatewayModelGroupBinding> bindings = null;

  public static final String JSON_PROPERTY_MAX_REASONING_LEVEL = "max_reasoning_level";
  private AiGatewayMaxReasoningLevel maxReasoningLevel;

  public static final String JSON_PROPERTY_MODEL_IDS = "model_ids";
  private List<Long> modelIds = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROVIDER_IDS = "provider_ids";
  private List<Long> providerIds = null;

  public static final String JSON_PROPERTY_ROUTING_RULE_SLUGS = "routing_rule_slugs";
  private List<String> routingRuleSlugs = null;

  public AiGatewayModelGroupCreateAttributes() {}

  @JsonCreator
  public AiGatewayModelGroupCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.name = name;
  }

  public AiGatewayModelGroupCreateAttributes allowFastMode(Boolean allowFastMode) {
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

  public AiGatewayModelGroupCreateAttributes bindings(List<AiGatewayModelGroupBinding> bindings) {
    this.bindings = bindings;
    if (bindings != null) {
      for (AiGatewayModelGroupBinding item : bindings) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public AiGatewayModelGroupCreateAttributes addBindingsItem(
      AiGatewayModelGroupBinding bindingsItem) {
    if (this.bindings == null) {
      this.bindings = new ArrayList<>();
    }
    this.bindings.add(bindingsItem);
    this.unparsed |= bindingsItem.unparsed;
    return this;
  }

  /**
   * Optional initial model-group access bindings.
   *
   * @return bindings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BINDINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AiGatewayModelGroupBinding> getBindings() {
    return bindings;
  }

  public void setBindings(List<AiGatewayModelGroupBinding> bindings) {
    this.bindings = bindings;
    if (bindings != null) {
      for (AiGatewayModelGroupBinding item : bindings) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public AiGatewayModelGroupCreateAttributes maxReasoningLevel(
      AiGatewayMaxReasoningLevel maxReasoningLevel) {
    this.maxReasoningLevel = maxReasoningLevel;
    this.unparsed |= !maxReasoningLevel.isValid();
    return this;
  }

  /**
   * Maximum reasoning level permitted by a model group.
   *
   * @return maxReasoningLevel
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_REASONING_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AiGatewayMaxReasoningLevel getMaxReasoningLevel() {
    return maxReasoningLevel;
  }

  public void setMaxReasoningLevel(AiGatewayMaxReasoningLevel maxReasoningLevel) {
    if (!maxReasoningLevel.isValid()) {
      this.unparsed = true;
    }
    this.maxReasoningLevel = maxReasoningLevel;
  }

  public AiGatewayModelGroupCreateAttributes modelIds(List<Long> modelIds) {
    this.modelIds = modelIds;
    return this;
  }

  public AiGatewayModelGroupCreateAttributes addModelIdsItem(Long modelIdsItem) {
    if (this.modelIds == null) {
      this.modelIds = new ArrayList<>();
    }
    this.modelIds.add(modelIdsItem);
    return this;
  }

  /**
   * Model catalog IDs to select. New selections require provider View.
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

  public AiGatewayModelGroupCreateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Human-readable resource name.
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

  public AiGatewayModelGroupCreateAttributes providerIds(List<Long> providerIds) {
    this.providerIds = providerIds;
    return this;
  }

  public AiGatewayModelGroupCreateAttributes addProviderIdsItem(Long providerIdsItem) {
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

  public AiGatewayModelGroupCreateAttributes routingRuleSlugs(List<String> routingRuleSlugs) {
    this.routingRuleSlugs = routingRuleSlugs;
    return this;
  }

  public AiGatewayModelGroupCreateAttributes addRoutingRuleSlugsItem(String routingRuleSlugsItem) {
    if (this.routingRuleSlugs == null) {
      this.routingRuleSlugs = new ArrayList<>();
    }
    this.routingRuleSlugs.add(routingRuleSlugsItem);
    return this;
  }

  /**
   * Organization-unique routing rule slugs, such as coding-route.
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
   * @return AiGatewayModelGroupCreateAttributes
   */
  @JsonAnySetter
  public AiGatewayModelGroupCreateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayModelGroupCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayModelGroupCreateAttributes aiGatewayModelGroupCreateAttributes =
        (AiGatewayModelGroupCreateAttributes) o;
    return Objects.equals(this.allowFastMode, aiGatewayModelGroupCreateAttributes.allowFastMode)
        && Objects.equals(this.bindings, aiGatewayModelGroupCreateAttributes.bindings)
        && Objects.equals(
            this.maxReasoningLevel, aiGatewayModelGroupCreateAttributes.maxReasoningLevel)
        && Objects.equals(this.modelIds, aiGatewayModelGroupCreateAttributes.modelIds)
        && Objects.equals(this.name, aiGatewayModelGroupCreateAttributes.name)
        && Objects.equals(this.providerIds, aiGatewayModelGroupCreateAttributes.providerIds)
        && Objects.equals(
            this.routingRuleSlugs, aiGatewayModelGroupCreateAttributes.routingRuleSlugs)
        && Objects.equals(
            this.additionalProperties, aiGatewayModelGroupCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowFastMode,
        bindings,
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
    sb.append("class AiGatewayModelGroupCreateAttributes {\n");
    sb.append("    allowFastMode: ").append(toIndentedString(allowFastMode)).append("\n");
    sb.append("    bindings: ").append(toIndentedString(bindings)).append("\n");
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
