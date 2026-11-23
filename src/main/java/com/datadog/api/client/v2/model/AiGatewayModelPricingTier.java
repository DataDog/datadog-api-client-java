/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/**
 * Custom price for requests at or above <code>context_min_tokens</code> input tokens, in <code>
 * service_tier</code> when it is set. Each tier needs a <code>service_tier</code>, a positive
 * <code>context_min_tokens</code>, or both. Rates it omits keep the base custom rate.
 */
@JsonPropertyOrder({
  AiGatewayModelPricingTier.JSON_PROPERTY_CONTEXT_MIN_TOKENS,
  AiGatewayModelPricingTier.JSON_PROPERTY_RATES,
  AiGatewayModelPricingTier.JSON_PROPERTY_SERVICE_TIER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayModelPricingTier {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTEXT_MIN_TOKENS = "context_min_tokens";
  private Long contextMinTokens;

  public static final String JSON_PROPERTY_RATES = "rates";
  private AiGatewayModelPricingRates rates;

  public static final String JSON_PROPERTY_SERVICE_TIER = "service_tier";
  private String serviceTier;

  public AiGatewayModelPricingTier() {}

  @JsonCreator
  public AiGatewayModelPricingTier(
      @JsonProperty(required = true, value = JSON_PROPERTY_RATES)
          AiGatewayModelPricingRates rates) {
    this.rates = rates;
    this.unparsed |= rates.unparsed;
  }

  public AiGatewayModelPricingTier contextMinTokens(Long contextMinTokens) {
    this.contextMinTokens = contextMinTokens;
    return this;
  }

  /**
   * Minimum input tokens for the price to apply. minimum: 0
   *
   * @return contextMinTokens
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTEXT_MIN_TOKENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getContextMinTokens() {
    return contextMinTokens;
  }

  public void setContextMinTokens(Long contextMinTokens) {
    this.contextMinTokens = contextMinTokens;
  }

  public AiGatewayModelPricingTier rates(AiGatewayModelPricingRates rates) {
    this.rates = rates;
    this.unparsed |= rates.unparsed;
    return this;
  }

  /**
   * Pricing rates for a model.
   *
   * @return rates
   */
  @JsonProperty(JSON_PROPERTY_RATES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiGatewayModelPricingRates getRates() {
    return rates;
  }

  public void setRates(AiGatewayModelPricingRates rates) {
    this.rates = rates;
    if (rates != null) {
      this.unparsed |= rates.unparsed;
    }
  }

  public AiGatewayModelPricingTier serviceTier(String serviceTier) {
    this.serviceTier = serviceTier;
    return this;
  }

  /**
   * Provider service tier the price applies to. Lowercase letters, digits, <code>_</code> and
   * <code>-</code>.
   *
   * @return serviceTier
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_TIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getServiceTier() {
    return serviceTier;
  }

  public void setServiceTier(String serviceTier) {
    this.serviceTier = serviceTier;
  }

  /** Return true if this AiGatewayModelPricingTier object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayModelPricingTier aiGatewayModelPricingTier = (AiGatewayModelPricingTier) o;
    return Objects.equals(this.contextMinTokens, aiGatewayModelPricingTier.contextMinTokens)
        && Objects.equals(this.rates, aiGatewayModelPricingTier.rates)
        && Objects.equals(this.serviceTier, aiGatewayModelPricingTier.serviceTier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextMinTokens, rates, serviceTier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayModelPricingTier {\n");
    sb.append("    contextMinTokens: ").append(toIndentedString(contextMinTokens)).append("\n");
    sb.append("    rates: ").append(toIndentedString(rates)).append("\n");
    sb.append("    serviceTier: ").append(toIndentedString(serviceTier)).append("\n");
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
