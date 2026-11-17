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

/** The pricing source entry the price was read from. */
@JsonPropertyOrder({
  AiGatewayModelAutomaticPricingSource.JSON_PROPERTY_MATCH_METHOD,
  AiGatewayModelAutomaticPricingSource.JSON_PROPERTY_MODEL_ID,
  AiGatewayModelAutomaticPricingSource.JSON_PROPERTY_NAME,
  AiGatewayModelAutomaticPricingSource.JSON_PROPERTY_PROVIDER_ID,
  AiGatewayModelAutomaticPricingSource.JSON_PROPERTY_REVISION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayModelAutomaticPricingSource {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MATCH_METHOD = "match_method";
  private String matchMethod;

  public static final String JSON_PROPERTY_MODEL_ID = "model_id";
  private String modelId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROVIDER_ID = "provider_id";
  private String providerId;

  public static final String JSON_PROPERTY_REVISION = "revision";
  private String revision;

  public AiGatewayModelAutomaticPricingSource() {}

  @JsonCreator
  public AiGatewayModelAutomaticPricingSource(
      @JsonProperty(required = true, value = JSON_PROPERTY_MATCH_METHOD) String matchMethod,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODEL_ID) String modelId,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROVIDER_ID) String providerId,
      @JsonProperty(required = true, value = JSON_PROPERTY_REVISION) String revision) {
    this.matchMethod = matchMethod;
    this.modelId = modelId;
    this.name = name;
    this.providerId = providerId;
    this.revision = revision;
  }

  public AiGatewayModelAutomaticPricingSource matchMethod(String matchMethod) {
    this.matchMethod = matchMethod;
    return this;
  }

  /**
   * How the gateway matched the model to the source entry, such as <code>wire_id</code>.
   *
   * @return matchMethod
   */
  @JsonProperty(JSON_PROPERTY_MATCH_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMatchMethod() {
    return matchMethod;
  }

  public void setMatchMethod(String matchMethod) {
    this.matchMethod = matchMethod;
  }

  public AiGatewayModelAutomaticPricingSource modelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  /**
   * Model identifier in the source.
   *
   * @return modelId
   */
  @JsonProperty(JSON_PROPERTY_MODEL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getModelId() {
    return modelId;
  }

  public void setModelId(String modelId) {
    this.modelId = modelId;
  }

  public AiGatewayModelAutomaticPricingSource name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Pricing source name.
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

  public AiGatewayModelAutomaticPricingSource providerId(String providerId) {
    this.providerId = providerId;
    return this;
  }

  /**
   * Provider identifier in the source.
   *
   * @return providerId
   */
  @JsonProperty(JSON_PROPERTY_PROVIDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProviderId() {
    return providerId;
  }

  public void setProviderId(String providerId) {
    this.providerId = providerId;
  }

  public AiGatewayModelAutomaticPricingSource revision(String revision) {
    this.revision = revision;
    return this;
  }

  /**
   * Source revision the price was read from.
   *
   * @return revision
   */
  @JsonProperty(JSON_PROPERTY_REVISION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
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
   * @return AiGatewayModelAutomaticPricingSource
   */
  @JsonAnySetter
  public AiGatewayModelAutomaticPricingSource putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayModelAutomaticPricingSource object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayModelAutomaticPricingSource aiGatewayModelAutomaticPricingSource =
        (AiGatewayModelAutomaticPricingSource) o;
    return Objects.equals(this.matchMethod, aiGatewayModelAutomaticPricingSource.matchMethod)
        && Objects.equals(this.modelId, aiGatewayModelAutomaticPricingSource.modelId)
        && Objects.equals(this.name, aiGatewayModelAutomaticPricingSource.name)
        && Objects.equals(this.providerId, aiGatewayModelAutomaticPricingSource.providerId)
        && Objects.equals(this.revision, aiGatewayModelAutomaticPricingSource.revision)
        && Objects.equals(
            this.additionalProperties, aiGatewayModelAutomaticPricingSource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchMethod, modelId, name, providerId, revision, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayModelAutomaticPricingSource {\n");
    sb.append("    matchMethod: ").append(toIndentedString(matchMethod)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
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
