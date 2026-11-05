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

/** Provider entries grouped under one canonical model ID. */
@JsonPropertyOrder({
  AiGatewayModelsByCanonicalAttributes.JSON_PROPERTY_MODEL_ID_CANONICAL,
  AiGatewayModelsByCanonicalAttributes.JSON_PROPERTY_PROVIDERS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayModelsByCanonicalAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MODEL_ID_CANONICAL = "model_id_canonical";
  private String modelIdCanonical;

  public static final String JSON_PROPERTY_PROVIDERS = "providers";
  private List<AiGatewayProviderModelEntry> providers = new ArrayList<>();

  public AiGatewayModelsByCanonicalAttributes() {}

  @JsonCreator
  public AiGatewayModelsByCanonicalAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_MODEL_ID_CANONICAL)
          String modelIdCanonical,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROVIDERS)
          List<AiGatewayProviderModelEntry> providers) {
    this.modelIdCanonical = modelIdCanonical;
    this.providers = providers;
    for (AiGatewayProviderModelEntry item : providers) {
      this.unparsed |= item.unparsed;
    }
  }

  public AiGatewayModelsByCanonicalAttributes modelIdCanonical(String modelIdCanonical) {
    this.modelIdCanonical = modelIdCanonical;
    return this;
  }

  /**
   * Provider-independent model identifier.
   *
   * @return modelIdCanonical
   */
  @JsonProperty(JSON_PROPERTY_MODEL_ID_CANONICAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getModelIdCanonical() {
    return modelIdCanonical;
  }

  public void setModelIdCanonical(String modelIdCanonical) {
    this.modelIdCanonical = modelIdCanonical;
  }

  public AiGatewayModelsByCanonicalAttributes providers(
      List<AiGatewayProviderModelEntry> providers) {
    this.providers = providers;
    for (AiGatewayProviderModelEntry item : providers) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AiGatewayModelsByCanonicalAttributes addProvidersItem(
      AiGatewayProviderModelEntry providersItem) {
    this.providers.add(providersItem);
    this.unparsed |= providersItem.unparsed;
    return this;
  }

  /**
   * Getproviders
   *
   * @return providers
   */
  @JsonProperty(JSON_PROPERTY_PROVIDERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<AiGatewayProviderModelEntry> getProviders() {
    return providers;
  }

  public void setProviders(List<AiGatewayProviderModelEntry> providers) {
    this.providers = providers;
    if (providers != null) {
      for (AiGatewayProviderModelEntry item : providers) {
        this.unparsed |= item.unparsed;
      }
    }
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
   * @return AiGatewayModelsByCanonicalAttributes
   */
  @JsonAnySetter
  public AiGatewayModelsByCanonicalAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayModelsByCanonicalAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayModelsByCanonicalAttributes aiGatewayModelsByCanonicalAttributes =
        (AiGatewayModelsByCanonicalAttributes) o;
    return Objects.equals(
            this.modelIdCanonical, aiGatewayModelsByCanonicalAttributes.modelIdCanonical)
        && Objects.equals(this.providers, aiGatewayModelsByCanonicalAttributes.providers)
        && Objects.equals(
            this.additionalProperties, aiGatewayModelsByCanonicalAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelIdCanonical, providers, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayModelsByCanonicalAttributes {\n");
    sb.append("    modelIdCanonical: ").append(toIndentedString(modelIdCanonical)).append("\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
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
