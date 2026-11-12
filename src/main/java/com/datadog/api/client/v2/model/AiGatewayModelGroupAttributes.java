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

/** Complete AI Gateway model group configuration. */
@JsonPropertyOrder({
  AiGatewayModelGroupAttributes.JSON_PROPERTY_ALLOW_FAST_MODE,
  AiGatewayModelGroupAttributes.JSON_PROPERTY_CREATED_AT,
  AiGatewayModelGroupAttributes.JSON_PROPERTY_MAX_REASONING_LEVEL,
  AiGatewayModelGroupAttributes.JSON_PROPERTY_MODEL_IDS,
  AiGatewayModelGroupAttributes.JSON_PROPERTY_MODELS,
  AiGatewayModelGroupAttributes.JSON_PROPERTY_NAME,
  AiGatewayModelGroupAttributes.JSON_PROPERTY_PROVIDER_IDS,
  AiGatewayModelGroupAttributes.JSON_PROPERTY_PROVIDERS,
  AiGatewayModelGroupAttributes.JSON_PROPERTY_REVISION,
  AiGatewayModelGroupAttributes.JSON_PROPERTY_ROUTING_RULES,
  AiGatewayModelGroupAttributes.JSON_PROPERTY_ROUTING_RULES_RESTRICTED,
  AiGatewayModelGroupAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayModelGroupAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOW_FAST_MODE = "allow_fast_mode";
  private Boolean allowFastMode;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_MAX_REASONING_LEVEL = "max_reasoning_level";
  private AiGatewayNullableMaxReasoningLevel maxReasoningLevel;

  public static final String JSON_PROPERTY_MODEL_IDS = "model_ids";
  private List<Long> modelIds = new ArrayList<>();

  public static final String JSON_PROPERTY_MODELS = "models";
  private List<AiGatewayModelGroupModel> models = new ArrayList<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROVIDER_IDS = "provider_ids";
  private List<Long> providerIds = new ArrayList<>();

  public static final String JSON_PROPERTY_PROVIDERS = "providers";
  private List<AiGatewayModelGroupProvider> providers = new ArrayList<>();

  public static final String JSON_PROPERTY_REVISION = "revision";
  private Long revision;

  public static final String JSON_PROPERTY_ROUTING_RULES = "routing_rules";
  private List<AiGatewayModelGroupRoutingRule> routingRules = new ArrayList<>();

  public static final String JSON_PROPERTY_ROUTING_RULES_RESTRICTED = "routing_rules_restricted";
  private Boolean routingRulesRestricted;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public AiGatewayModelGroupAttributes() {}

  @JsonCreator
  public AiGatewayModelGroupAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ALLOW_FAST_MODE) Boolean allowFastMode,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_MAX_REASONING_LEVEL)
          AiGatewayNullableMaxReasoningLevel maxReasoningLevel,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODEL_IDS) List<Long> modelIds,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODELS)
          List<AiGatewayModelGroupModel> models,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROVIDER_IDS) List<Long> providerIds,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROVIDERS)
          List<AiGatewayModelGroupProvider> providers,
      @JsonProperty(required = true, value = JSON_PROPERTY_ROUTING_RULES)
          List<AiGatewayModelGroupRoutingRule> routingRules,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt) {
    this.allowFastMode = allowFastMode;
    this.createdAt = createdAt;
    this.maxReasoningLevel = maxReasoningLevel;
    if (maxReasoningLevel != null) {
      this.unparsed |= !maxReasoningLevel.isValid();
    }
    this.modelIds = modelIds;
    this.models = models;
    for (AiGatewayModelGroupModel item : models) {
      this.unparsed |= item.unparsed;
    }
    this.name = name;
    this.providerIds = providerIds;
    this.providers = providers;
    for (AiGatewayModelGroupProvider item : providers) {
      this.unparsed |= item.unparsed;
    }
    this.routingRules = routingRules;
    for (AiGatewayModelGroupRoutingRule item : routingRules) {
      this.unparsed |= item.unparsed;
    }
    this.updatedAt = updatedAt;
  }

  public AiGatewayModelGroupAttributes allowFastMode(Boolean allowFastMode) {
    this.allowFastMode = allowFastMode;
    return this;
  }

  /**
   * Whether fast mode is allowed for models and routing rules in the group.
   *
   * @return allowFastMode
   */
  @JsonProperty(JSON_PROPERTY_ALLOW_FAST_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getAllowFastMode() {
    return allowFastMode;
  }

  public void setAllowFastMode(Boolean allowFastMode) {
    this.allowFastMode = allowFastMode;
  }

  public AiGatewayModelGroupAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Time when the resource was created.
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

  public AiGatewayModelGroupAttributes maxReasoningLevel(
      AiGatewayNullableMaxReasoningLevel maxReasoningLevel) {
    this.maxReasoningLevel = maxReasoningLevel;
    if (maxReasoningLevel != null) {
      this.unparsed |= !maxReasoningLevel.isValid();
    }
    return this;
  }

  /**
   * Maximum reasoning level permitted by a model group.
   *
   * @return maxReasoningLevel
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_REASONING_LEVEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiGatewayNullableMaxReasoningLevel getMaxReasoningLevel() {
    return maxReasoningLevel;
  }

  public void setMaxReasoningLevel(AiGatewayNullableMaxReasoningLevel maxReasoningLevel) {
    if (!maxReasoningLevel.isValid()) {
      this.unparsed = true;
    }
    this.maxReasoningLevel = maxReasoningLevel;
  }

  public AiGatewayModelGroupAttributes modelIds(List<Long> modelIds) {
    this.modelIds = modelIds;
    return this;
  }

  public AiGatewayModelGroupAttributes addModelIdsItem(Long modelIdsItem) {
    this.modelIds.add(modelIdsItem);
    return this;
  }

  /**
   * All saved model catalog IDs, including selections whose provider metadata is hidden. Preserve
   * these IDs independently of the visible catalog.
   *
   * @return modelIds
   */
  @JsonProperty(JSON_PROPERTY_MODEL_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<Long> getModelIds() {
    return modelIds;
  }

  public void setModelIds(List<Long> modelIds) {
    this.modelIds = modelIds;
  }

  public AiGatewayModelGroupAttributes models(List<AiGatewayModelGroupModel> models) {
    this.models = models;
    for (AiGatewayModelGroupModel item : models) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AiGatewayModelGroupAttributes addModelsItem(AiGatewayModelGroupModel modelsItem) {
    this.models.add(modelsItem);
    this.unparsed |= modelsItem.unparsed;
    return this;
  }

  /**
   * Metadata for saved model selections whose providers the caller can view. Missing metadata does
   * not remove a saved ID.
   *
   * @return models
   */
  @JsonProperty(JSON_PROPERTY_MODELS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<AiGatewayModelGroupModel> getModels() {
    return models;
  }

  public void setModels(List<AiGatewayModelGroupModel> models) {
    this.models = models;
    if (models != null) {
      for (AiGatewayModelGroupModel item : models) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public AiGatewayModelGroupAttributes name(String name) {
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

  public AiGatewayModelGroupAttributes providerIds(List<Long> providerIds) {
    this.providerIds = providerIds;
    return this;
  }

  public AiGatewayModelGroupAttributes addProviderIdsItem(Long providerIdsItem) {
    this.providerIds.add(providerIdsItem);
    return this;
  }

  /**
   * All explicitly selected provider IDs, including hidden providers. Embedded provider metadata
   * includes only viewable providers.
   *
   * @return providerIds
   */
  @JsonProperty(JSON_PROPERTY_PROVIDER_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<Long> getProviderIds() {
    return providerIds;
  }

  public void setProviderIds(List<Long> providerIds) {
    this.providerIds = providerIds;
  }

  public AiGatewayModelGroupAttributes providers(List<AiGatewayModelGroupProvider> providers) {
    this.providers = providers;
    for (AiGatewayModelGroupProvider item : providers) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AiGatewayModelGroupAttributes addProvidersItem(AiGatewayModelGroupProvider providersItem) {
    this.providers.add(providersItem);
    this.unparsed |= providersItem.unparsed;
    return this;
  }

  /**
   * Viewable explicitly selected providers, separate from individually selected models. Use
   * provider_ids to retain all selections.
   *
   * @return providers
   */
  @JsonProperty(JSON_PROPERTY_PROVIDERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<AiGatewayModelGroupProvider> getProviders() {
    return providers;
  }

  public void setProviders(List<AiGatewayModelGroupProvider> providers) {
    this.providers = providers;
    if (providers != null) {
      for (AiGatewayModelGroupProvider item : providers) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public AiGatewayModelGroupAttributes revision(Long revision) {
    this.revision = revision;
    return this;
  }

  /**
   * Revision of the organization-wide policy. Present for the default model group and absent for
   * named policies. minimum: 0
   *
   * @return revision
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRevision() {
    return revision;
  }

  public void setRevision(Long revision) {
    this.revision = revision;
  }

  public AiGatewayModelGroupAttributes routingRules(
      List<AiGatewayModelGroupRoutingRule> routingRules) {
    this.routingRules = routingRules;
    for (AiGatewayModelGroupRoutingRule item : routingRules) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AiGatewayModelGroupAttributes addRoutingRulesItem(
      AiGatewayModelGroupRoutingRule routingRulesItem) {
    this.routingRules.add(routingRulesItem);
    this.unparsed |= routingRulesItem.unparsed;
    return this;
  }

  /**
   * GetroutingRules
   *
   * @return routingRules
   */
  @JsonProperty(JSON_PROPERTY_ROUTING_RULES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<AiGatewayModelGroupRoutingRule> getRoutingRules() {
    return routingRules;
  }

  public void setRoutingRules(List<AiGatewayModelGroupRoutingRule> routingRules) {
    this.routingRules = routingRules;
    if (routingRules != null) {
      for (AiGatewayModelGroupRoutingRule item : routingRules) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  /**
   * Whether some saved routes are hidden from the caller. Omit routing_rule_slugs to preserve all
   * memberships; replacing the visible selection also preserves saved hidden memberships.
   *
   * @return routingRulesRestricted
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROUTING_RULES_RESTRICTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getRoutingRulesRestricted() {
    return routingRulesRestricted;
  }

  public AiGatewayModelGroupAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Time when the resource was last updated.
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
   * @return AiGatewayModelGroupAttributes
   */
  @JsonAnySetter
  public AiGatewayModelGroupAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayModelGroupAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayModelGroupAttributes aiGatewayModelGroupAttributes = (AiGatewayModelGroupAttributes) o;
    return Objects.equals(this.allowFastMode, aiGatewayModelGroupAttributes.allowFastMode)
        && Objects.equals(this.createdAt, aiGatewayModelGroupAttributes.createdAt)
        && Objects.equals(this.maxReasoningLevel, aiGatewayModelGroupAttributes.maxReasoningLevel)
        && Objects.equals(this.modelIds, aiGatewayModelGroupAttributes.modelIds)
        && Objects.equals(this.models, aiGatewayModelGroupAttributes.models)
        && Objects.equals(this.name, aiGatewayModelGroupAttributes.name)
        && Objects.equals(this.providerIds, aiGatewayModelGroupAttributes.providerIds)
        && Objects.equals(this.providers, aiGatewayModelGroupAttributes.providers)
        && Objects.equals(this.revision, aiGatewayModelGroupAttributes.revision)
        && Objects.equals(this.routingRules, aiGatewayModelGroupAttributes.routingRules)
        && Objects.equals(
            this.routingRulesRestricted, aiGatewayModelGroupAttributes.routingRulesRestricted)
        && Objects.equals(this.updatedAt, aiGatewayModelGroupAttributes.updatedAt)
        && Objects.equals(
            this.additionalProperties, aiGatewayModelGroupAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowFastMode,
        createdAt,
        maxReasoningLevel,
        modelIds,
        models,
        name,
        providerIds,
        providers,
        revision,
        routingRules,
        routingRulesRestricted,
        updatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayModelGroupAttributes {\n");
    sb.append("    allowFastMode: ").append(toIndentedString(allowFastMode)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    maxReasoningLevel: ").append(toIndentedString(maxReasoningLevel)).append("\n");
    sb.append("    modelIds: ").append(toIndentedString(modelIds)).append("\n");
    sb.append("    models: ").append(toIndentedString(models)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    providerIds: ").append(toIndentedString(providerIds)).append("\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    routingRules: ").append(toIndentedString(routingRules)).append("\n");
    sb.append("    routingRulesRestricted: ")
        .append(toIndentedString(routingRulesRestricted))
        .append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
