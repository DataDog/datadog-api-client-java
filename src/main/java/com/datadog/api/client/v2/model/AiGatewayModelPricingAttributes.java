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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Attributes of a model pricing resource. */
@JsonPropertyOrder({
  AiGatewayModelPricingAttributes.JSON_PROPERTY_EFFECTIVE_SOURCE,
  AiGatewayModelPricingAttributes.JSON_PROPERTY_PRICING_CONFIG
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayModelPricingAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EFFECTIVE_SOURCE = "effective_source";
  private AiGatewayModelPricingEffectiveSource effectiveSource;

  public static final String JSON_PROPERTY_PRICING_CONFIG = "pricing_config";
  private AiGatewayModelPricingConfig pricingConfig;

  public AiGatewayModelPricingAttributes effectiveSource(
      AiGatewayModelPricingEffectiveSource effectiveSource) {
    this.effectiveSource = effectiveSource;
    this.unparsed |= !effectiveSource.isValid();
    return this;
  }

  /**
   * Effective source of the model pricing data.
   *
   * @return effectiveSource
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EFFECTIVE_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AiGatewayModelPricingEffectiveSource getEffectiveSource() {
    return effectiveSource;
  }

  public void setEffectiveSource(AiGatewayModelPricingEffectiveSource effectiveSource) {
    if (!effectiveSource.isValid()) {
      this.unparsed = true;
    }
    this.effectiveSource = effectiveSource;
  }

  public AiGatewayModelPricingAttributes pricingConfig(AiGatewayModelPricingConfig pricingConfig) {
    this.pricingConfig = pricingConfig;
    this.unparsed |= pricingConfig.unparsed;
    return this;
  }

  /**
   * Pricing configuration for a model.
   *
   * @return pricingConfig
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRICING_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AiGatewayModelPricingConfig getPricingConfig() {
    return pricingConfig;
  }

  public void setPricingConfig(AiGatewayModelPricingConfig pricingConfig) {
    this.pricingConfig = pricingConfig;
    if (pricingConfig != null) {
      this.unparsed |= pricingConfig.unparsed;
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
   * @return AiGatewayModelPricingAttributes
   */
  @JsonAnySetter
  public AiGatewayModelPricingAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayModelPricingAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayModelPricingAttributes aiGatewayModelPricingAttributes =
        (AiGatewayModelPricingAttributes) o;
    return Objects.equals(this.effectiveSource, aiGatewayModelPricingAttributes.effectiveSource)
        && Objects.equals(this.pricingConfig, aiGatewayModelPricingAttributes.pricingConfig)
        && Objects.equals(
            this.additionalProperties, aiGatewayModelPricingAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectiveSource, pricingConfig, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayModelPricingAttributes {\n");
    sb.append("    effectiveSource: ").append(toIndentedString(effectiveSource)).append("\n");
    sb.append("    pricingConfig: ").append(toIndentedString(pricingConfig)).append("\n");
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
