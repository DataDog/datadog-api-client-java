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

/** Complete set of rates required for custom pricing. */
@JsonPropertyOrder({
  AiGatewayModelPricingRequiredRates.JSON_PROPERTY_CACHE_READ_COST_PER_MTOK,
  AiGatewayModelPricingRequiredRates.JSON_PROPERTY_CACHE_WRITE_COST_PER_MTOK,
  AiGatewayModelPricingRequiredRates.JSON_PROPERTY_NON_CACHED_INPUT_COST_PER_MTOK,
  AiGatewayModelPricingRequiredRates.JSON_PROPERTY_OUTPUT_COST_PER_MTOK
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayModelPricingRequiredRates {
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

  public AiGatewayModelPricingRequiredRates() {}

  @JsonCreator
  public AiGatewayModelPricingRequiredRates(
      @JsonProperty(required = true, value = JSON_PROPERTY_CACHE_READ_COST_PER_MTOK)
          Double cacheReadCostPerMtok,
      @JsonProperty(required = true, value = JSON_PROPERTY_CACHE_WRITE_COST_PER_MTOK)
          Double cacheWriteCostPerMtok,
      @JsonProperty(required = true, value = JSON_PROPERTY_NON_CACHED_INPUT_COST_PER_MTOK)
          Double nonCachedInputCostPerMtok,
      @JsonProperty(required = true, value = JSON_PROPERTY_OUTPUT_COST_PER_MTOK)
          Double outputCostPerMtok) {
    this.cacheReadCostPerMtok = cacheReadCostPerMtok;
    this.cacheWriteCostPerMtok = cacheWriteCostPerMtok;
    this.nonCachedInputCostPerMtok = nonCachedInputCostPerMtok;
    this.outputCostPerMtok = outputCostPerMtok;
  }

  public AiGatewayModelPricingRequiredRates cacheReadCostPerMtok(Double cacheReadCostPerMtok) {
    this.cacheReadCostPerMtok = cacheReadCostPerMtok;
    return this;
  }

  /**
   * Cost per million tokens for cache reads. minimum: 0
   *
   * @return cacheReadCostPerMtok
   */
  @JsonProperty(JSON_PROPERTY_CACHE_READ_COST_PER_MTOK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getCacheReadCostPerMtok() {
    return cacheReadCostPerMtok;
  }

  public void setCacheReadCostPerMtok(Double cacheReadCostPerMtok) {
    this.cacheReadCostPerMtok = cacheReadCostPerMtok;
  }

  public AiGatewayModelPricingRequiredRates cacheWriteCostPerMtok(Double cacheWriteCostPerMtok) {
    this.cacheWriteCostPerMtok = cacheWriteCostPerMtok;
    return this;
  }

  /**
   * Cost per million tokens for cache writes. minimum: 0
   *
   * @return cacheWriteCostPerMtok
   */
  @JsonProperty(JSON_PROPERTY_CACHE_WRITE_COST_PER_MTOK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getCacheWriteCostPerMtok() {
    return cacheWriteCostPerMtok;
  }

  public void setCacheWriteCostPerMtok(Double cacheWriteCostPerMtok) {
    this.cacheWriteCostPerMtok = cacheWriteCostPerMtok;
  }

  public AiGatewayModelPricingRequiredRates nonCachedInputCostPerMtok(
      Double nonCachedInputCostPerMtok) {
    this.nonCachedInputCostPerMtok = nonCachedInputCostPerMtok;
    return this;
  }

  /**
   * Cost per million tokens for non-cached input. minimum: 0
   *
   * @return nonCachedInputCostPerMtok
   */
  @JsonProperty(JSON_PROPERTY_NON_CACHED_INPUT_COST_PER_MTOK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getNonCachedInputCostPerMtok() {
    return nonCachedInputCostPerMtok;
  }

  public void setNonCachedInputCostPerMtok(Double nonCachedInputCostPerMtok) {
    this.nonCachedInputCostPerMtok = nonCachedInputCostPerMtok;
  }

  public AiGatewayModelPricingRequiredRates outputCostPerMtok(Double outputCostPerMtok) {
    this.outputCostPerMtok = outputCostPerMtok;
    return this;
  }

  /**
   * Cost per million tokens for output. minimum: 0
   *
   * @return outputCostPerMtok
   */
  @JsonProperty(JSON_PROPERTY_OUTPUT_COST_PER_MTOK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getOutputCostPerMtok() {
    return outputCostPerMtok;
  }

  public void setOutputCostPerMtok(Double outputCostPerMtok) {
    this.outputCostPerMtok = outputCostPerMtok;
  }

  /** Return true if this AiGatewayModelPricingRequiredRates object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayModelPricingRequiredRates aiGatewayModelPricingRequiredRates =
        (AiGatewayModelPricingRequiredRates) o;
    return Objects.equals(
            this.cacheReadCostPerMtok, aiGatewayModelPricingRequiredRates.cacheReadCostPerMtok)
        && Objects.equals(
            this.cacheWriteCostPerMtok, aiGatewayModelPricingRequiredRates.cacheWriteCostPerMtok)
        && Objects.equals(
            this.nonCachedInputCostPerMtok,
            aiGatewayModelPricingRequiredRates.nonCachedInputCostPerMtok)
        && Objects.equals(
            this.outputCostPerMtok, aiGatewayModelPricingRequiredRates.outputCostPerMtok);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cacheReadCostPerMtok, cacheWriteCostPerMtok, nonCachedInputCostPerMtok, outputCostPerMtok);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayModelPricingRequiredRates {\n");
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
