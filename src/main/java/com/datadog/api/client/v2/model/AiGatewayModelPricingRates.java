/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Pricing rates for a model. */
@JsonPropertyOrder({
  AiGatewayModelPricingRates.JSON_PROPERTY_CACHE_READ_COST_PER_MTOK,
  AiGatewayModelPricingRates.JSON_PROPERTY_CACHE_WRITE_COST_PER_MTOK,
  AiGatewayModelPricingRates.JSON_PROPERTY_NON_CACHED_INPUT_COST_PER_MTOK,
  AiGatewayModelPricingRates.JSON_PROPERTY_OUTPUT_COST_PER_MTOK
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayModelPricingRates {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CACHE_READ_COST_PER_MTOK = "cache_read_cost_per_mtok";
  private Double cacheReadCostPerMtok;

  public static final String JSON_PROPERTY_CACHE_WRITE_COST_PER_MTOK = "cache_write_cost_per_mtok";
  private Double cacheWriteCostPerMtok;

  public static final String JSON_PROPERTY_NON_CACHED_INPUT_COST_PER_MTOK =
      "non_cached_input_cost_per_mtok";
  private Double nonCachedInputCostPerMtok;

  public static final String JSON_PROPERTY_OUTPUT_COST_PER_MTOK = "output_cost_per_mtok";
  private Double outputCostPerMtok;

  public AiGatewayModelPricingRates cacheReadCostPerMtok(Double cacheReadCostPerMtok) {
    this.cacheReadCostPerMtok = cacheReadCostPerMtok;
    return this;
  }

  /**
   * Cost per million tokens for cache reads. minimum: 0
   *
   * @return cacheReadCostPerMtok
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CACHE_READ_COST_PER_MTOK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCacheReadCostPerMtok() {
    return cacheReadCostPerMtok;
  }

  public void setCacheReadCostPerMtok(Double cacheReadCostPerMtok) {
    this.cacheReadCostPerMtok = cacheReadCostPerMtok;
  }

  public AiGatewayModelPricingRates cacheWriteCostPerMtok(Double cacheWriteCostPerMtok) {
    this.cacheWriteCostPerMtok = cacheWriteCostPerMtok;
    return this;
  }

  /**
   * Cost per million tokens for cache writes. minimum: 0
   *
   * @return cacheWriteCostPerMtok
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CACHE_WRITE_COST_PER_MTOK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCacheWriteCostPerMtok() {
    return cacheWriteCostPerMtok;
  }

  public void setCacheWriteCostPerMtok(Double cacheWriteCostPerMtok) {
    this.cacheWriteCostPerMtok = cacheWriteCostPerMtok;
  }

  public AiGatewayModelPricingRates nonCachedInputCostPerMtok(Double nonCachedInputCostPerMtok) {
    this.nonCachedInputCostPerMtok = nonCachedInputCostPerMtok;
    return this;
  }

  /**
   * Cost per million tokens for non-cached input. minimum: 0
   *
   * @return nonCachedInputCostPerMtok
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NON_CACHED_INPUT_COST_PER_MTOK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNonCachedInputCostPerMtok() {
    return nonCachedInputCostPerMtok;
  }

  public void setNonCachedInputCostPerMtok(Double nonCachedInputCostPerMtok) {
    this.nonCachedInputCostPerMtok = nonCachedInputCostPerMtok;
  }

  public AiGatewayModelPricingRates outputCostPerMtok(Double outputCostPerMtok) {
    this.outputCostPerMtok = outputCostPerMtok;
    return this;
  }

  /**
   * Cost per million tokens for output. minimum: 0
   *
   * @return outputCostPerMtok
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OUTPUT_COST_PER_MTOK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOutputCostPerMtok() {
    return outputCostPerMtok;
  }

  public void setOutputCostPerMtok(Double outputCostPerMtok) {
    this.outputCostPerMtok = outputCostPerMtok;
  }

  /** Return true if this AiGatewayModelPricingRates object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayModelPricingRates aiGatewayModelPricingRates = (AiGatewayModelPricingRates) o;
    return Objects.equals(
            this.cacheReadCostPerMtok, aiGatewayModelPricingRates.cacheReadCostPerMtok)
        && Objects.equals(
            this.cacheWriteCostPerMtok, aiGatewayModelPricingRates.cacheWriteCostPerMtok)
        && Objects.equals(
            this.nonCachedInputCostPerMtok, aiGatewayModelPricingRates.nonCachedInputCostPerMtok)
        && Objects.equals(this.outputCostPerMtok, aiGatewayModelPricingRates.outputCostPerMtok);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cacheReadCostPerMtok, cacheWriteCostPerMtok, nonCachedInputCostPerMtok, outputCostPerMtok);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayModelPricingRates {\n");
    sb.append("    cacheReadCostPerMtok: ")
        .append(toIndentedString(cacheReadCostPerMtok))
        .append("\n");
    sb.append("    cacheWriteCostPerMtok: ")
        .append(toIndentedString(cacheWriteCostPerMtok))
        .append("\n");
    sb.append("    nonCachedInputCostPerMtok: ")
        .append(toIndentedString(nonCachedInputCostPerMtok))
        .append("\n");
    sb.append("    outputCostPerMtok: ").append(toIndentedString(outputCostPerMtok)).append("\n");
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
