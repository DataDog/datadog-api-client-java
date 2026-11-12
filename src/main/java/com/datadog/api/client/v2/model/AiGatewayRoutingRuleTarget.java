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
import org.openapitools.jackson.nullable.JsonNullable;

/** Model target or reference to another routing rule. */
@JsonPropertyOrder({
  AiGatewayRoutingRuleTarget.JSON_PROPERTY_DEFAULT,
  AiGatewayRoutingRuleTarget.JSON_PROPERTY_ID,
  AiGatewayRoutingRuleTarget.JSON_PROPERTY_MODEL,
  AiGatewayRoutingRuleTarget.JSON_PROPERTY_MODEL_ID,
  AiGatewayRoutingRuleTarget.JSON_PROPERTY_PROVIDER,
  AiGatewayRoutingRuleTarget.JSON_PROPERTY_REASONING_LEVEL,
  AiGatewayRoutingRuleTarget.JSON_PROPERTY_RUBRIC,
  AiGatewayRoutingRuleTarget.JSON_PROPERTY_SLUG,
  AiGatewayRoutingRuleTarget.JSON_PROPERTY_TYPE,
  AiGatewayRoutingRuleTarget.JSON_PROPERTY_WEIGHT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayRoutingRuleTarget {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEFAULT = "default";
  private Boolean _default;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_MODEL = "model";
  private String model;

  public static final String JSON_PROPERTY_MODEL_ID = "model_id";
  private Long modelId;

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  private String provider;

  public static final String JSON_PROPERTY_REASONING_LEVEL = "reasoning_level";
  private JsonNullable<AiGatewayRoutingReasoningLevel> reasoningLevel =
      JsonNullable.<AiGatewayRoutingReasoningLevel>undefined();

  public static final String JSON_PROPERTY_RUBRIC = "rubric";
  private String rubric;

  public static final String JSON_PROPERTY_SLUG = "slug";
  private String slug;

  public static final String JSON_PROPERTY_TYPE = "type";
  private AiGatewayRoutingRuleTargetType type;

  public static final String JSON_PROPERTY_WEIGHT = "weight";
  private Long weight;

  public AiGatewayRoutingRuleTarget() {}

  @JsonCreator
  public AiGatewayRoutingRuleTarget(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          AiGatewayRoutingRuleTargetType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public AiGatewayRoutingRuleTarget _default(Boolean _default) {
    this._default = _default;
    return this;
  }

  /**
   * Present and true for the default classified destination.
   *
   * @return _default
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }

  public AiGatewayRoutingRuleTarget id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Saved target row ID. On replacement, retain this ID only within its original route and at most
   * once. A stale or foreign ID is rejected. minimum: 1
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public AiGatewayRoutingRuleTarget model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Model name or pattern. Omitted when the caller cannot view its provider.
   *
   * @return model
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public AiGatewayRoutingRuleTarget modelId(Long modelId) {
    this.modelId = modelId;
    return this;
  }

  /**
   * Opaque model catalog ID for a concrete model target. New selections require provider View;
   * saved selections can be retained without metadata. minimum: 1
   *
   * @return modelId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getModelId() {
    return modelId;
  }

  public void setModelId(Long modelId) {
    this.modelId = modelId;
  }

  public AiGatewayRoutingRuleTarget provider(String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Provider slug. Omitted for dynamic resolution and when the caller cannot view its provider.
   *
   * @return provider
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public AiGatewayRoutingRuleTarget reasoningLevel(AiGatewayRoutingReasoningLevel reasoningLevel) {
    this.reasoningLevel = JsonNullable.<AiGatewayRoutingReasoningLevel>of(reasoningLevel);
    return this;
  }

  /**
   * Optional reasoning effort preference for this model destination. Must be supported by the
   * selected model and provider. For provider "*", every eligible provider must support the level.
   * An explicit value overrides the request's reasoning setting, subject to model-group policy.
   * Omitted or null preserves request and provider behavior; none is an explicit level, not the
   * default. On update, omission preserves a saved target override; null explicitly clears it.
   * Routing-rule references cannot set this field; each referenced model destination owns its
   * override. If an override cannot be applied at runtime, the gateway keeps the destination and
   * restores the caller's original reasoning settings, or preserves the provider default when
   * omitted. It rechecks all applicable route and model-group policies against those settings
   * before sending. Model-group max_reasoning_level enforces hard limits; the override is not an
   * additional cap. Normal fallback applies if governance denies the resulting request or the
   * destination cannot otherwise serve it. Metrics and span tags record the override outcome and
   * incompatibility reason. When response headers have not already been committed, <code>
   * X-Ai-Gateway-Reasoning-Override</code> reports applied or not_applied for the returned attempt,
   * and <code>X-Ai-Gateway-Reasoning-Override-Reason</code> reports the reason when not applied.
   *
   * @return reasoningLevel
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public AiGatewayRoutingReasoningLevel getReasoningLevel() {
    return reasoningLevel.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REASONING_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<AiGatewayRoutingReasoningLevel> getReasoningLevel_JsonNullable() {
    return reasoningLevel;
  }

  @JsonProperty(JSON_PROPERTY_REASONING_LEVEL)
  public void setReasoningLevel_JsonNullable(
      JsonNullable<AiGatewayRoutingReasoningLevel> reasoningLevel) {
    this.reasoningLevel = reasoningLevel;
  }

  public void setReasoningLevel(AiGatewayRoutingReasoningLevel reasoningLevel) {
    if (!reasoningLevel.isValid()) {
      this.unparsed = true;
    }
    this.reasoningLevel = JsonNullable.<AiGatewayRoutingReasoningLevel>of(reasoningLevel);
  }

  public AiGatewayRoutingRuleTarget rubric(String rubric) {
    this.rubric = rubric;
    return this;
  }

  /**
   * Destination rubric, present only for non-default targets in classified tiers.
   *
   * @return rubric
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUBRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRubric() {
    return rubric;
  }

  public void setRubric(String rubric) {
    this.rubric = rubric;
  }

  public AiGatewayRoutingRuleTarget slug(String slug) {
    this.slug = slug;
    return this;
  }

  /**
   * Referenced route slug. Omitted when the caller lacks View; only the parent-local occurrence ID
   * remains.
   *
   * @return slug
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLUG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public AiGatewayRoutingRuleTarget type(AiGatewayRoutingRuleTargetType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of routing target.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiGatewayRoutingRuleTargetType getType() {
    return type;
  }

  public void setType(AiGatewayRoutingRuleTargetType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public AiGatewayRoutingRuleTarget weight(Long weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Effective relative weight. Returned only for targets in weighted_affinity tiers. minimum: 1
   * maximum: 10000
   *
   * @return weight
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getWeight() {
    return weight;
  }

  public void setWeight(Long weight) {
    this.weight = weight;
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
   * @return AiGatewayRoutingRuleTarget
   */
  @JsonAnySetter
  public AiGatewayRoutingRuleTarget putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayRoutingRuleTarget object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayRoutingRuleTarget aiGatewayRoutingRuleTarget = (AiGatewayRoutingRuleTarget) o;
    return Objects.equals(this._default, aiGatewayRoutingRuleTarget._default)
        && Objects.equals(this.id, aiGatewayRoutingRuleTarget.id)
        && Objects.equals(this.model, aiGatewayRoutingRuleTarget.model)
        && Objects.equals(this.modelId, aiGatewayRoutingRuleTarget.modelId)
        && Objects.equals(this.provider, aiGatewayRoutingRuleTarget.provider)
        && Objects.equals(this.reasoningLevel, aiGatewayRoutingRuleTarget.reasoningLevel)
        && Objects.equals(this.rubric, aiGatewayRoutingRuleTarget.rubric)
        && Objects.equals(this.slug, aiGatewayRoutingRuleTarget.slug)
        && Objects.equals(this.type, aiGatewayRoutingRuleTarget.type)
        && Objects.equals(this.weight, aiGatewayRoutingRuleTarget.weight)
        && Objects.equals(
            this.additionalProperties, aiGatewayRoutingRuleTarget.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        _default,
        id,
        model,
        modelId,
        provider,
        reasoningLevel,
        rubric,
        slug,
        type,
        weight,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayRoutingRuleTarget {\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    reasoningLevel: ").append(toIndentedString(reasoningLevel)).append("\n");
    sb.append("    rubric: ").append(toIndentedString(rubric)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
