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

/** Custom pricing configuration. All four rates are required. */
@JsonPropertyOrder({
  AiGatewayModelPricingCustomRequestConfig.JSON_PROPERTY_RATES,
  AiGatewayModelPricingCustomRequestConfig.JSON_PROPERTY_SOURCE,
  AiGatewayModelPricingCustomRequestConfig.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayModelPricingCustomRequestConfig {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_RATES = "rates";
  private AiGatewayModelPricingRequiredRates rates;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private AiGatewayModelPricingCustomRequestSource source;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public AiGatewayModelPricingCustomRequestConfig() {}

  @JsonCreator
  public AiGatewayModelPricingCustomRequestConfig(
      @JsonProperty(required = true, value = JSON_PROPERTY_RATES)
          AiGatewayModelPricingRequiredRates rates,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE)
          AiGatewayModelPricingCustomRequestSource source,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERSION) Long version) {
    this.rates = rates;
    this.unparsed |= rates.unparsed;
    this.source = source;
    this.unparsed |= source.unparsed;
    this.version = version;
  }

  public AiGatewayModelPricingCustomRequestConfig rates(AiGatewayModelPricingRequiredRates rates) {
    this.rates = rates;
    this.unparsed |= rates.unparsed;
    return this;
  }

  /**
   * Complete set of rates required for custom pricing.
   *
   * @return rates
   */
  @JsonProperty(JSON_PROPERTY_RATES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiGatewayModelPricingRequiredRates getRates() {
    return rates;
  }

  public void setRates(AiGatewayModelPricingRequiredRates rates) {
    this.rates = rates;
    if (rates != null) {
      this.unparsed |= rates.unparsed;
    }
  }

  public AiGatewayModelPricingCustomRequestConfig source(
      AiGatewayModelPricingCustomRequestSource source) {
    this.source = source;
    this.unparsed |= source.unparsed;
    return this;
  }

  /**
   * Source for a custom pricing configuration.
   *
   * @return source
   */
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiGatewayModelPricingCustomRequestSource getSource() {
    return source;
  }

  public void setSource(AiGatewayModelPricingCustomRequestSource source) {
    this.source = source;
    if (source != null) {
      this.unparsed |= source.unparsed;
    }
  }

  public AiGatewayModelPricingCustomRequestConfig version(Long version) {
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

  /** Return true if this AiGatewayModelPricingCustomRequestConfig object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayModelPricingCustomRequestConfig aiGatewayModelPricingCustomRequestConfig =
        (AiGatewayModelPricingCustomRequestConfig) o;
    return Objects.equals(this.rates, aiGatewayModelPricingCustomRequestConfig.rates)
        && Objects.equals(this.source, aiGatewayModelPricingCustomRequestConfig.source)
        && Objects.equals(this.version, aiGatewayModelPricingCustomRequestConfig.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rates, source, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayModelPricingCustomRequestConfig {\n");
    sb.append("    rates: ").append(toIndentedString(rates)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
