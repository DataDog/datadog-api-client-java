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

/** One published price. Prices can differ by operation, mode, service tier, and input length. */
@JsonPropertyOrder({
  AiGatewayModelAutomaticPricingRate.JSON_PROPERTY_AMOUNT,
  AiGatewayModelAutomaticPricingRate.JSON_PROPERTY_COMPONENT,
  AiGatewayModelAutomaticPricingRate.JSON_PROPERTY_CONTEXT_MAX_TOKENS,
  AiGatewayModelAutomaticPricingRate.JSON_PROPERTY_CONTEXT_MIN_TOKENS,
  AiGatewayModelAutomaticPricingRate.JSON_PROPERTY_CURRENCY,
  AiGatewayModelAutomaticPricingRate.JSON_PROPERTY_MODE,
  AiGatewayModelAutomaticPricingRate.JSON_PROPERTY_OPERATION,
  AiGatewayModelAutomaticPricingRate.JSON_PROPERTY_SERVICE_TIER,
  AiGatewayModelAutomaticPricingRate.JSON_PROPERTY_UNIT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayModelAutomaticPricingRate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private String amount;

  public static final String JSON_PROPERTY_COMPONENT = "component";
  private String component;

  public static final String JSON_PROPERTY_CONTEXT_MAX_TOKENS = "context_max_tokens";
  private Long contextMaxTokens;

  public static final String JSON_PROPERTY_CONTEXT_MIN_TOKENS = "context_min_tokens";
  private Long contextMinTokens;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_MODE = "mode";
  private String mode;

  public static final String JSON_PROPERTY_OPERATION = "operation";
  private String operation;

  public static final String JSON_PROPERTY_SERVICE_TIER = "service_tier";
  private String serviceTier;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private String unit;

  public AiGatewayModelAutomaticPricingRate() {}

  @JsonCreator
  public AiGatewayModelAutomaticPricingRate(
      @JsonProperty(required = true, value = JSON_PROPERTY_AMOUNT) String amount,
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPONENT) String component,
      @JsonProperty(required = true, value = JSON_PROPERTY_CURRENCY) String currency,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODE) String mode,
      @JsonProperty(required = true, value = JSON_PROPERTY_UNIT) String unit) {
    this.amount = amount;
    this.component = component;
    this.currency = currency;
    this.mode = mode;
    this.unit = unit;
  }

  public AiGatewayModelAutomaticPricingRate amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Exact decimal amount per unit, zero or greater, represented as a string to preserve precision.
   * Supports fixed decimal and exponent notation.
   *
   * @return amount
   */
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public AiGatewayModelAutomaticPricingRate component(String component) {
    this.component = component;
    return this;
  }

  /**
   * Token category priced, such as <code>input</code>, <code>output</code>, <code>cache_read</code>
   * , or <code>cache_write</code>.
   *
   * @return component
   */
  @JsonProperty(JSON_PROPERTY_COMPONENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getComponent() {
    return component;
  }

  public void setComponent(String component) {
    this.component = component;
  }

  public AiGatewayModelAutomaticPricingRate contextMaxTokens(Long contextMaxTokens) {
    this.contextMaxTokens = contextMaxTokens;
    return this;
  }

  /**
   * Largest input length covered by this price. Omitted when there is no upper bound. minimum: 1
   *
   * @return contextMaxTokens
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTEXT_MAX_TOKENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getContextMaxTokens() {
    return contextMaxTokens;
  }

  public void setContextMaxTokens(Long contextMaxTokens) {
    this.contextMaxTokens = contextMaxTokens;
  }

  public AiGatewayModelAutomaticPricingRate contextMinTokens(Long contextMinTokens) {
    this.contextMinTokens = contextMinTokens;
    return this;
  }

  /**
   * Input length above which this price applies. Omitted for the base tier. minimum: 0
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

  public AiGatewayModelAutomaticPricingRate currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency of the price. The only supported value is USD.
   *
   * @return currency
   */
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public AiGatewayModelAutomaticPricingRate mode(String mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Source mode name. <code>standard</code> is the base mode. Other values, such as <code>fast
   * </code>, are source-defined and selected by <code>mode_triggers</code>.
   *
   * @return mode
   */
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public AiGatewayModelAutomaticPricingRate operation(String operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Operation the price applies to. Omitted when it applies to every operation.
   *
   * @return operation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  public AiGatewayModelAutomaticPricingRate serviceTier(String serviceTier) {
    this.serviceTier = serviceTier;
    return this;
  }

  /**
   * Provider service tier explicitly associated with this mode by the source. Omitted when unknown.
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

  public AiGatewayModelAutomaticPricingRate unit(String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Unit of the quoted amount. The only supported value is million_tokens.
   *
   * @return unit
   */
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
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
   * @return AiGatewayModelAutomaticPricingRate
   */
  @JsonAnySetter
  public AiGatewayModelAutomaticPricingRate putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayModelAutomaticPricingRate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayModelAutomaticPricingRate aiGatewayModelAutomaticPricingRate =
        (AiGatewayModelAutomaticPricingRate) o;
    return Objects.equals(this.amount, aiGatewayModelAutomaticPricingRate.amount)
        && Objects.equals(this.component, aiGatewayModelAutomaticPricingRate.component)
        && Objects.equals(
            this.contextMaxTokens, aiGatewayModelAutomaticPricingRate.contextMaxTokens)
        && Objects.equals(
            this.contextMinTokens, aiGatewayModelAutomaticPricingRate.contextMinTokens)
        && Objects.equals(this.currency, aiGatewayModelAutomaticPricingRate.currency)
        && Objects.equals(this.mode, aiGatewayModelAutomaticPricingRate.mode)
        && Objects.equals(this.operation, aiGatewayModelAutomaticPricingRate.operation)
        && Objects.equals(this.serviceTier, aiGatewayModelAutomaticPricingRate.serviceTier)
        && Objects.equals(this.unit, aiGatewayModelAutomaticPricingRate.unit)
        && Objects.equals(
            this.additionalProperties, aiGatewayModelAutomaticPricingRate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        amount,
        component,
        contextMaxTokens,
        contextMinTokens,
        currency,
        mode,
        operation,
        serviceTier,
        unit,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayModelAutomaticPricingRate {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    contextMaxTokens: ").append(toIndentedString(contextMaxTokens)).append("\n");
    sb.append("    contextMinTokens: ").append(toIndentedString(contextMinTokens)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    serviceTier: ").append(toIndentedString(serviceTier)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
