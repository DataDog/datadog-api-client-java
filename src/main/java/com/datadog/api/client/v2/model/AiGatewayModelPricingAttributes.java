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
  AiGatewayModelPricingAttributes.JSON_PROPERTY_AUTHORITATIVE,
  AiGatewayModelPricingAttributes.JSON_PROPERTY_AUTOMATIC_PRICING,
  AiGatewayModelPricingAttributes.JSON_PROPERTY_BLOCKS_BUDGETED_REQUESTS,
  AiGatewayModelPricingAttributes.JSON_PROPERTY_COST_MULTIPLIER,
  AiGatewayModelPricingAttributes.JSON_PROPERTY_DURATION_PRICED,
  AiGatewayModelPricingAttributes.JSON_PROPERTY_EFFECTIVE_SOURCE,
  AiGatewayModelPricingAttributes.JSON_PROPERTY_PRICING_CONFIG,
  AiGatewayModelPricingAttributes.JSON_PROPERTY_STATUS,
  AiGatewayModelPricingAttributes.JSON_PROPERTY_UNPRICED_DESCRIPTION,
  AiGatewayModelPricingAttributes.JSON_PROPERTY_UNPRICED_REASON
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayModelPricingAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHORITATIVE = "authoritative";
  private Boolean authoritative;

  public static final String JSON_PROPERTY_AUTOMATIC_PRICING = "automatic_pricing";
  private AiGatewayModelAutomaticPricing automaticPricing;

  public static final String JSON_PROPERTY_BLOCKS_BUDGETED_REQUESTS = "blocks_budgeted_requests";
  private Boolean blocksBudgetedRequests;

  public static final String JSON_PROPERTY_COST_MULTIPLIER = "cost_multiplier";
  private Double costMultiplier;

  public static final String JSON_PROPERTY_DURATION_PRICED = "duration_priced";
  private Boolean durationPriced;

  public static final String JSON_PROPERTY_EFFECTIVE_SOURCE = "effective_source";
  private AiGatewayModelPricingEffectiveSource effectiveSource;

  public static final String JSON_PROPERTY_PRICING_CONFIG = "pricing_config";
  private AiGatewayModelPricingConfig pricingConfig;

  public static final String JSON_PROPERTY_STATUS = "status";
  private AiGatewayModelPricingStatus status;

  public static final String JSON_PROPERTY_UNPRICED_DESCRIPTION = "unpriced_description";
  private String unpricedDescription;

  public static final String JSON_PROPERTY_UNPRICED_REASON = "unpriced_reason";
  private String unpricedReason;

  public AiGatewayModelPricingAttributes authoritative(Boolean authoritative) {
    this.authoritative = authoritative;
    return this;
  }

  /**
   * True when automatic pricing is authoritative for this organization and provider.
   *
   * @return authoritative
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHORITATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAuthoritative() {
    return authoritative;
  }

  public void setAuthoritative(Boolean authoritative) {
    this.authoritative = authoritative;
  }

  public AiGatewayModelPricingAttributes automaticPricing(
      AiGatewayModelAutomaticPricing automaticPricing) {
    this.automaticPricing = automaticPricing;
    this.unparsed |= automaticPricing.unparsed;
    return this;
  }

  /**
   * The automatically synced published price. Present only when it is the effective price.
   *
   * @return automaticPricing
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTOMATIC_PRICING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AiGatewayModelAutomaticPricing getAutomaticPricing() {
    return automaticPricing;
  }

  public void setAutomaticPricing(AiGatewayModelAutomaticPricing automaticPricing) {
    this.automaticPricing = automaticPricing;
    if (automaticPricing != null) {
      this.unparsed |= automaticPricing.unparsed;
    }
  }

  public AiGatewayModelPricingAttributes blocksBudgetedRequests(Boolean blocksBudgetedRequests) {
    this.blocksBudgetedRequests = blocksBudgetedRequests;
    return this;
  }

  /**
   * True when a <code>BLOCK</code> budget covering this model rejects its requests before they
   * reach the provider.
   *
   * @return blocksBudgetedRequests
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLOCKS_BUDGETED_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getBlocksBudgetedRequests() {
    return blocksBudgetedRequests;
  }

  public void setBlocksBudgetedRequests(Boolean blocksBudgetedRequests) {
    this.blocksBudgetedRequests = blocksBudgetedRequests;
  }

  public AiGatewayModelPricingAttributes costMultiplier(Double costMultiplier) {
    this.costMultiplier = costMultiplier;
    return this;
  }

  /**
   * Effective provider multiplier applied to every reported rate.
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

  public AiGatewayModelPricingAttributes durationPriced(Boolean durationPriced) {
    this.durationPriced = durationPriced;
    return this;
  }

  /**
   * True when the provider bills this model per minute of audio instead of per token, as with
   * transcription models. The gateway prices only per token, so it can't charge for these models,
   * and a per-token override can't express their rate.
   *
   * @return durationPriced
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION_PRICED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDurationPriced() {
    return durationPriced;
  }

  public void setDurationPriced(Boolean durationPriced) {
    this.durationPriced = durationPriced;
  }

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

  public AiGatewayModelPricingAttributes status(AiGatewayModelPricingStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * Whether the gateway has a price for the model.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AiGatewayModelPricingStatus getStatus() {
    return status;
  }

  public void setStatus(AiGatewayModelPricingStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public AiGatewayModelPricingAttributes unpricedDescription(String unpricedDescription) {
    this.unpricedDescription = unpricedDescription;
    return this;
  }

  /**
   * Human-readable sentence for <code>unpriced_reason</code>. Omitted when the model is priced or
   * the code has no description yet.
   *
   * @return unpricedDescription
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNPRICED_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUnpricedDescription() {
    return unpricedDescription;
  }

  public void setUnpricedDescription(String unpricedDescription) {
    this.unpricedDescription = unpricedDescription;
  }

  public AiGatewayModelPricingAttributes unpricedReason(String unpricedReason) {
    this.unpricedReason = unpricedReason;
    return this;
  }

  /**
   * Stable code explaining why the model has no price, such as <code>automatic_price_absent</code>.
   * Omitted when the model is priced.
   *
   * @return unpricedReason
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNPRICED_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUnpricedReason() {
    return unpricedReason;
  }

  public void setUnpricedReason(String unpricedReason) {
    this.unpricedReason = unpricedReason;
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
    return Objects.equals(this.authoritative, aiGatewayModelPricingAttributes.authoritative)
        && Objects.equals(this.automaticPricing, aiGatewayModelPricingAttributes.automaticPricing)
        && Objects.equals(
            this.blocksBudgetedRequests, aiGatewayModelPricingAttributes.blocksBudgetedRequests)
        && Objects.equals(this.costMultiplier, aiGatewayModelPricingAttributes.costMultiplier)
        && Objects.equals(this.durationPriced, aiGatewayModelPricingAttributes.durationPriced)
        && Objects.equals(this.effectiveSource, aiGatewayModelPricingAttributes.effectiveSource)
        && Objects.equals(this.pricingConfig, aiGatewayModelPricingAttributes.pricingConfig)
        && Objects.equals(this.status, aiGatewayModelPricingAttributes.status)
        && Objects.equals(
            this.unpricedDescription, aiGatewayModelPricingAttributes.unpricedDescription)
        && Objects.equals(this.unpricedReason, aiGatewayModelPricingAttributes.unpricedReason)
        && Objects.equals(
            this.additionalProperties, aiGatewayModelPricingAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        authoritative,
        automaticPricing,
        blocksBudgetedRequests,
        costMultiplier,
        durationPriced,
        effectiveSource,
        pricingConfig,
        status,
        unpricedDescription,
        unpricedReason,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayModelPricingAttributes {\n");
    sb.append("    authoritative: ").append(toIndentedString(authoritative)).append("\n");
    sb.append("    automaticPricing: ").append(toIndentedString(automaticPricing)).append("\n");
    sb.append("    blocksBudgetedRequests: ")
        .append(toIndentedString(blocksBudgetedRequests))
        .append("\n");
    sb.append("    costMultiplier: ").append(toIndentedString(costMultiplier)).append("\n");
    sb.append("    durationPriced: ").append(toIndentedString(durationPriced)).append("\n");
    sb.append("    effectiveSource: ").append(toIndentedString(effectiveSource)).append("\n");
    sb.append("    pricingConfig: ").append(toIndentedString(pricingConfig)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    unpricedDescription: ")
        .append(toIndentedString(unpricedDescription))
        .append("\n");
    sb.append("    unpricedReason: ").append(toIndentedString(unpricedReason)).append("\n");
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
