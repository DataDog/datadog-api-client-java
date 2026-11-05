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

/** AI Gateway provider configuration and metadata. */
@JsonPropertyOrder({
  AiGatewayProviderAttributes.JSON_PROPERTY_COST_MULTIPLIER,
  AiGatewayProviderAttributes.JSON_PROPERTY_CREATED_AT,
  AiGatewayProviderAttributes.JSON_PROPERTY_INTEGRATION_ACCOUNT_ID,
  AiGatewayProviderAttributes.JSON_PROPERTY_INTEGRATION_CONFIG,
  AiGatewayProviderAttributes.JSON_PROPERTY_KNOWN_PROVIDER,
  AiGatewayProviderAttributes.JSON_PROPERTY_NAME,
  AiGatewayProviderAttributes.JSON_PROPERTY_SLUG,
  AiGatewayProviderAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayProviderAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COST_MULTIPLIER = "cost_multiplier";
  private Double costMultiplier;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_INTEGRATION_ACCOUNT_ID = "integration_account_id";
  private String integrationAccountId;

  public static final String JSON_PROPERTY_INTEGRATION_CONFIG = "integration_config";
  private AiGatewayProviderIntegrationConfig integrationConfig;

  public static final String JSON_PROPERTY_KNOWN_PROVIDER = "known_provider";
  private AiGatewayKnownProvider knownProvider;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SLUG = "slug";
  private String slug;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public AiGatewayProviderAttributes() {}

  @JsonCreator
  public AiGatewayProviderAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_COST_MULTIPLIER) Double costMultiplier,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_INTEGRATION_ACCOUNT_ID)
          String integrationAccountId,
      @JsonProperty(required = true, value = JSON_PROPERTY_KNOWN_PROVIDER)
          AiGatewayKnownProvider knownProvider,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SLUG) String slug,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt) {
    this.costMultiplier = costMultiplier;
    this.createdAt = createdAt;
    this.integrationAccountId = integrationAccountId;
    this.knownProvider = knownProvider;
    this.unparsed |= !knownProvider.isValid();
    this.name = name;
    this.slug = slug;
    this.updatedAt = updatedAt;
  }

  public AiGatewayProviderAttributes costMultiplier(Double costMultiplier) {
    this.costMultiplier = costMultiplier;
    return this;
  }

  /**
   * Multiplier applied to provider costs.
   *
   * @return costMultiplier
   */
  @JsonProperty(JSON_PROPERTY_COST_MULTIPLIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getCostMultiplier() {
    return costMultiplier;
  }

  public void setCostMultiplier(Double costMultiplier) {
    this.costMultiplier = costMultiplier;
  }

  public AiGatewayProviderAttributes createdAt(OffsetDateTime createdAt) {
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

  public AiGatewayProviderAttributes integrationAccountId(String integrationAccountId) {
    this.integrationAccountId = integrationAccountId;
    return this;
  }

  /**
   * Provider integration account identifier.
   *
   * @return integrationAccountId
   */
  @JsonProperty(JSON_PROPERTY_INTEGRATION_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIntegrationAccountId() {
    return integrationAccountId;
  }

  public void setIntegrationAccountId(String integrationAccountId) {
    this.integrationAccountId = integrationAccountId;
  }

  public AiGatewayProviderAttributes integrationConfig(
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

  public AiGatewayProviderAttributes knownProvider(AiGatewayKnownProvider knownProvider) {
    this.knownProvider = knownProvider;
    this.unparsed |= !knownProvider.isValid();
    return this;
  }

  /**
   * Known provider implementation.
   *
   * @return knownProvider
   */
  @JsonProperty(JSON_PROPERTY_KNOWN_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiGatewayKnownProvider getKnownProvider() {
    return knownProvider;
  }

  public void setKnownProvider(AiGatewayKnownProvider knownProvider) {
    if (!knownProvider.isValid()) {
      this.unparsed = true;
    }
    this.knownProvider = knownProvider;
  }

  public AiGatewayProviderAttributes name(String name) {
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

  public AiGatewayProviderAttributes slug(String slug) {
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

  public AiGatewayProviderAttributes updatedAt(OffsetDateTime updatedAt) {
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
   * @return AiGatewayProviderAttributes
   */
  @JsonAnySetter
  public AiGatewayProviderAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayProviderAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayProviderAttributes aiGatewayProviderAttributes = (AiGatewayProviderAttributes) o;
    return Objects.equals(this.costMultiplier, aiGatewayProviderAttributes.costMultiplier)
        && Objects.equals(this.createdAt, aiGatewayProviderAttributes.createdAt)
        && Objects.equals(
            this.integrationAccountId, aiGatewayProviderAttributes.integrationAccountId)
        && Objects.equals(this.integrationConfig, aiGatewayProviderAttributes.integrationConfig)
        && Objects.equals(this.knownProvider, aiGatewayProviderAttributes.knownProvider)
        && Objects.equals(this.name, aiGatewayProviderAttributes.name)
        && Objects.equals(this.slug, aiGatewayProviderAttributes.slug)
        && Objects.equals(this.updatedAt, aiGatewayProviderAttributes.updatedAt)
        && Objects.equals(
            this.additionalProperties, aiGatewayProviderAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        costMultiplier,
        createdAt,
        integrationAccountId,
        integrationConfig,
        knownProvider,
        name,
        slug,
        updatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayProviderAttributes {\n");
    sb.append("    costMultiplier: ").append(toIndentedString(costMultiplier)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    integrationAccountId: ")
        .append(toIndentedString(integrationAccountId))
        .append("\n");
    sb.append("    integrationConfig: ").append(toIndentedString(integrationConfig)).append("\n");
    sb.append("    knownProvider: ").append(toIndentedString(knownProvider)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
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
