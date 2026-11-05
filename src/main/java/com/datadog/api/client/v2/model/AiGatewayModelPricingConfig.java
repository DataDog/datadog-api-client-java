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

/** Pricing configuration for a model. */
@JsonPropertyOrder({
  AiGatewayModelPricingConfig.JSON_PROPERTY_OVERRIDES,
  AiGatewayModelPricingConfig.JSON_PROPERTY_RATES,
  AiGatewayModelPricingConfig.JSON_PROPERTY_SOURCE,
  AiGatewayModelPricingConfig.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayModelPricingConfig {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_OVERRIDES = "overrides";
  private AiGatewayModelPricingRates overrides;

  public static final String JSON_PROPERTY_RATES = "rates";
  private AiGatewayModelPricingRates rates;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private AiGatewayModelPricingSource source;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public AiGatewayModelPricingConfig() {}

  @JsonCreator
  public AiGatewayModelPricingConfig(
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE)
          AiGatewayModelPricingSource source,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERSION) Long version) {
    this.source = source;
    this.unparsed |= source.unparsed;
    this.version = version;
  }

  public AiGatewayModelPricingConfig overrides(AiGatewayModelPricingRates overrides) {
    this.overrides = overrides;
    this.unparsed |= overrides.unparsed;
    return this;
  }

  /**
   * Pricing rates for a model.
   *
   * @return overrides
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVERRIDES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AiGatewayModelPricingRates getOverrides() {
    return overrides;
  }

  public void setOverrides(AiGatewayModelPricingRates overrides) {
    this.overrides = overrides;
    if (overrides != null) {
      this.unparsed |= overrides.unparsed;
    }
  }

  public AiGatewayModelPricingConfig rates(AiGatewayModelPricingRates rates) {
    this.rates = rates;
    this.unparsed |= rates.unparsed;
    return this;
  }

  /**
   * Pricing rates for a model.
   *
   * @return rates
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AiGatewayModelPricingRates getRates() {
    return rates;
  }

  public void setRates(AiGatewayModelPricingRates rates) {
    this.rates = rates;
    if (rates != null) {
      this.unparsed |= rates.unparsed;
    }
  }

  public AiGatewayModelPricingConfig source(AiGatewayModelPricingSource source) {
    this.source = source;
    this.unparsed |= source.unparsed;
    return this;
  }

  /**
   * Source information for a model's pricing.
   *
   * @return source
   */
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiGatewayModelPricingSource getSource() {
    return source;
  }

  public void setSource(AiGatewayModelPricingSource source) {
    this.source = source;
    if (source != null) {
      this.unparsed |= source.unparsed;
    }
  }

  public AiGatewayModelPricingConfig version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * Pricing configuration version. The only supported version is <code>1</code>. minimum: 1
   * maximum: 1
   *
   * @return version
   */
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
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
   * @return AiGatewayModelPricingConfig
   */
  @JsonAnySetter
  public AiGatewayModelPricingConfig putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayModelPricingConfig object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayModelPricingConfig aiGatewayModelPricingConfig = (AiGatewayModelPricingConfig) o;
    return Objects.equals(this.overrides, aiGatewayModelPricingConfig.overrides)
        && Objects.equals(this.rates, aiGatewayModelPricingConfig.rates)
        && Objects.equals(this.source, aiGatewayModelPricingConfig.source)
        && Objects.equals(this.version, aiGatewayModelPricingConfig.version)
        && Objects.equals(
            this.additionalProperties, aiGatewayModelPricingConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overrides, rates, source, version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayModelPricingConfig {\n");
    sb.append("    overrides: ").append(toIndentedString(overrides)).append("\n");
    sb.append("    rates: ").append(toIndentedString(rates)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
