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

/** Attributes used to create an AI Gateway provider. */
@JsonPropertyOrder({
  AiGatewayProviderCreateAttributes.JSON_PROPERTY_COST_MULTIPLIER,
  AiGatewayProviderCreateAttributes.JSON_PROPERTY_INITIAL_BINDINGS,
  AiGatewayProviderCreateAttributes.JSON_PROPERTY_INTEGRATION_ACCOUNT_ID,
  AiGatewayProviderCreateAttributes.JSON_PROPERTY_INTEGRATION_CONFIG,
  AiGatewayProviderCreateAttributes.JSON_PROPERTY_KNOWN_PROVIDER,
  AiGatewayProviderCreateAttributes.JSON_PROPERTY_MODELS,
  AiGatewayProviderCreateAttributes.JSON_PROPERTY_NAME,
  AiGatewayProviderCreateAttributes.JSON_PROPERTY_SLUG
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayProviderCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COST_MULTIPLIER = "cost_multiplier";
  private Double costMultiplier = 1.0;

  public static final String JSON_PROPERTY_INITIAL_BINDINGS = "initial_bindings";
  private List<AiGatewayProviderInitialBinding> initialBindings = null;

  public static final String JSON_PROPERTY_INTEGRATION_ACCOUNT_ID = "integration_account_id";
  private String integrationAccountId;

  public static final String JSON_PROPERTY_INTEGRATION_CONFIG = "integration_config";
  private AiGatewayProviderIntegrationConfig integrationConfig;

  public static final String JSON_PROPERTY_KNOWN_PROVIDER = "known_provider";
  private AiGatewayKnownProvider knownProvider;

  public static final String JSON_PROPERTY_MODELS = "models";
  private List<AiGatewayModelInput> models = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SLUG = "slug";
  private String slug;

  public AiGatewayProviderCreateAttributes() {}

  @JsonCreator
  public AiGatewayProviderCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SLUG) String slug) {
    this.name = name;
    this.slug = slug;
  }

  public AiGatewayProviderCreateAttributes costMultiplier(Double costMultiplier) {
    this.costMultiplier = costMultiplier;
    return this;
  }

  /**
   * Multiplier applied to provider costs. Must be greater than 0 and at most 1000000. minimum: 0
   * maximum: 1000000
   *
   * @return costMultiplier
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COST_MULTIPLIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCostMultiplier() {
    return costMultiplier;
  }

  public void setCostMultiplier(Double costMultiplier) {
    this.costMultiplier = costMultiplier;
  }

  public AiGatewayProviderCreateAttributes initialBindings(
      List<AiGatewayProviderInitialBinding> initialBindings) {
    this.initialBindings = initialBindings;
    if (initialBindings != null) {
      for (AiGatewayProviderInitialBinding item : initialBindings) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public AiGatewayProviderCreateAttributes addInitialBindingsItem(
      AiGatewayProviderInitialBinding initialBindingsItem) {
    if (this.initialBindings == null) {
      this.initialBindings = new ArrayList<>();
    }
    this.initialBindings.add(initialBindingsItem);
    this.unparsed |= initialBindingsItem.unparsed;
    return this;
  }

  /**
   * Reserved for initial View/Edit permissions. Supplying this attribute, including an empty array
   * or null, returns HTTP 503 before discovery or persistence. Omit it for normal creation.
   *
   * @return initialBindings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INITIAL_BINDINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AiGatewayProviderInitialBinding> getInitialBindings() {
    return initialBindings;
  }

  public void setInitialBindings(List<AiGatewayProviderInitialBinding> initialBindings) {
    this.initialBindings = initialBindings;
    if (initialBindings != null) {
      for (AiGatewayProviderInitialBinding item : initialBindings) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public AiGatewayProviderCreateAttributes integrationAccountId(String integrationAccountId) {
    this.integrationAccountId = integrationAccountId;
    return this;
  }

  /**
   * Provider integration account identifier.
   *
   * @return integrationAccountId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATION_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIntegrationAccountId() {
    return integrationAccountId;
  }

  public void setIntegrationAccountId(String integrationAccountId) {
    this.integrationAccountId = integrationAccountId;
  }

  public AiGatewayProviderCreateAttributes integrationConfig(
      AiGatewayProviderIntegrationConfig integrationConfig) {
    this.integrationConfig = integrationConfig;
    this.unparsed |= integrationConfig.unparsed;
    return this;
  }

  /**
   * Provider-specific integration configuration.
   *
   * @return integrationConfig
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATION_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AiGatewayProviderIntegrationConfig getIntegrationConfig() {
    return integrationConfig;
  }

  public void setIntegrationConfig(AiGatewayProviderIntegrationConfig integrationConfig) {
    this.integrationConfig = integrationConfig;
    if (integrationConfig != null) {
      this.unparsed |= integrationConfig.unparsed;
    }
  }

  public AiGatewayProviderCreateAttributes knownProvider(AiGatewayKnownProvider knownProvider) {
    this.knownProvider = knownProvider;
    this.unparsed |= !knownProvider.isValid();
    return this;
  }

  /**
   * Known provider implementation.
   *
   * @return knownProvider
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KNOWN_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AiGatewayKnownProvider getKnownProvider() {
    return knownProvider;
  }

  public void setKnownProvider(AiGatewayKnownProvider knownProvider) {
    if (!knownProvider.isValid()) {
      this.unparsed = true;
    }
    this.knownProvider = knownProvider;
  }

  public AiGatewayProviderCreateAttributes models(List<AiGatewayModelInput> models) {
    this.models = models;
    if (models != null) {
      for (AiGatewayModelInput item : models) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public AiGatewayProviderCreateAttributes addModelsItem(AiGatewayModelInput modelsItem) {
    if (this.models == null) {
      this.models = new ArrayList<>();
    }
    this.models.add(modelsItem);
    this.unparsed |= modelsItem.unparsed;
    return this;
  }

  /**
   * Manually managed models to add alongside models discovered from the provider integration.
   *
   * @return models
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AiGatewayModelInput> getModels() {
    return models;
  }

  public void setModels(List<AiGatewayModelInput> models) {
    this.models = models;
    if (models != null) {
      for (AiGatewayModelInput item : models) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public AiGatewayProviderCreateAttributes name(String name) {
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

  public AiGatewayProviderCreateAttributes slug(String slug) {
    this.slug = slug;
    return this;
  }

  /**
   * Immutable routing identifier.
   *
   * @return slug
   */
  @JsonProperty(JSON_PROPERTY_SLUG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
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
   * @return AiGatewayProviderCreateAttributes
   */
  @JsonAnySetter
  public AiGatewayProviderCreateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayProviderCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayProviderCreateAttributes aiGatewayProviderCreateAttributes =
        (AiGatewayProviderCreateAttributes) o;
    return Objects.equals(this.costMultiplier, aiGatewayProviderCreateAttributes.costMultiplier)
        && Objects.equals(this.initialBindings, aiGatewayProviderCreateAttributes.initialBindings)
        && Objects.equals(
            this.integrationAccountId, aiGatewayProviderCreateAttributes.integrationAccountId)
        && Objects.equals(
            this.integrationConfig, aiGatewayProviderCreateAttributes.integrationConfig)
        && Objects.equals(this.knownProvider, aiGatewayProviderCreateAttributes.knownProvider)
        && Objects.equals(this.models, aiGatewayProviderCreateAttributes.models)
        && Objects.equals(this.name, aiGatewayProviderCreateAttributes.name)
        && Objects.equals(this.slug, aiGatewayProviderCreateAttributes.slug)
        && Objects.equals(
            this.additionalProperties, aiGatewayProviderCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        costMultiplier,
        initialBindings,
        integrationAccountId,
        integrationConfig,
        knownProvider,
        models,
        name,
        slug,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayProviderCreateAttributes {\n");
    sb.append("    costMultiplier: ").append(toIndentedString(costMultiplier)).append("\n");
    sb.append("    initialBindings: ").append(toIndentedString(initialBindings)).append("\n");
    sb.append("    integrationAccountId: ")
        .append(toIndentedString(integrationAccountId))
        .append("\n");
    sb.append("    integrationConfig: ").append(toIndentedString(integrationConfig)).append("\n");
    sb.append("    knownProvider: ").append(toIndentedString(knownProvider)).append("\n");
    sb.append("    models: ").append(toIndentedString(models)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
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
