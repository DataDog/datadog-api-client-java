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

/** Response containing timeseries savings metrics for cloud commitment programs. */
@JsonPropertyOrder({
  CommitmentsSavingsTimeseriesResponse.JSON_PROPERTY_ACTUAL_COST,
  CommitmentsSavingsTimeseriesResponse.JSON_PROPERTY_EFFECTIVE_SAVINGS_RATE,
  CommitmentsSavingsTimeseriesResponse.JSON_PROPERTY_ON_DEMAND_EQUIVALENT_COST,
  CommitmentsSavingsTimeseriesResponse.JSON_PROPERTY_REALIZED_SAVINGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CommitmentsSavingsTimeseriesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTUAL_COST = "actual_cost";
  private CommitmentsTimeseriesMetric actualCost;

  public static final String JSON_PROPERTY_EFFECTIVE_SAVINGS_RATE = "effective_savings_rate";
  private CommitmentsTimeseriesMetric effectiveSavingsRate;

  public static final String JSON_PROPERTY_ON_DEMAND_EQUIVALENT_COST = "on_demand_equivalent_cost";
  private CommitmentsTimeseriesMetric onDemandEquivalentCost;

  public static final String JSON_PROPERTY_REALIZED_SAVINGS = "realized_savings";
  private CommitmentsTimeseriesMetric realizedSavings;

  public CommitmentsSavingsTimeseriesResponse() {}

  @JsonCreator
  public CommitmentsSavingsTimeseriesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACTUAL_COST)
          CommitmentsTimeseriesMetric actualCost,
      @JsonProperty(required = true, value = JSON_PROPERTY_EFFECTIVE_SAVINGS_RATE)
          CommitmentsTimeseriesMetric effectiveSavingsRate,
      @JsonProperty(required = true, value = JSON_PROPERTY_ON_DEMAND_EQUIVALENT_COST)
          CommitmentsTimeseriesMetric onDemandEquivalentCost,
      @JsonProperty(required = true, value = JSON_PROPERTY_REALIZED_SAVINGS)
          CommitmentsTimeseriesMetric realizedSavings) {
    this.actualCost = actualCost;
    this.unparsed |= actualCost.unparsed;
    this.effectiveSavingsRate = effectiveSavingsRate;
    this.unparsed |= effectiveSavingsRate.unparsed;
    this.onDemandEquivalentCost = onDemandEquivalentCost;
    this.unparsed |= onDemandEquivalentCost.unparsed;
    this.realizedSavings = realizedSavings;
    this.unparsed |= realizedSavings.unparsed;
  }

  public CommitmentsSavingsTimeseriesResponse actualCost(CommitmentsTimeseriesMetric actualCost) {
    this.actualCost = actualCost;
    this.unparsed |= actualCost.unparsed;
    return this;
  }

  /**
   * A timeseries metric containing timestamps, series values, and optional unit metadata.
   *
   * @return actualCost
   */
  @JsonProperty(JSON_PROPERTY_ACTUAL_COST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CommitmentsTimeseriesMetric getActualCost() {
    return actualCost;
  }

  public void setActualCost(CommitmentsTimeseriesMetric actualCost) {
    this.actualCost = actualCost;
  }

  public CommitmentsSavingsTimeseriesResponse effectiveSavingsRate(
      CommitmentsTimeseriesMetric effectiveSavingsRate) {
    this.effectiveSavingsRate = effectiveSavingsRate;
    this.unparsed |= effectiveSavingsRate.unparsed;
    return this;
  }

  /**
   * A timeseries metric containing timestamps, series values, and optional unit metadata.
   *
   * @return effectiveSavingsRate
   */
  @JsonProperty(JSON_PROPERTY_EFFECTIVE_SAVINGS_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CommitmentsTimeseriesMetric getEffectiveSavingsRate() {
    return effectiveSavingsRate;
  }

  public void setEffectiveSavingsRate(CommitmentsTimeseriesMetric effectiveSavingsRate) {
    this.effectiveSavingsRate = effectiveSavingsRate;
  }

  public CommitmentsSavingsTimeseriesResponse onDemandEquivalentCost(
      CommitmentsTimeseriesMetric onDemandEquivalentCost) {
    this.onDemandEquivalentCost = onDemandEquivalentCost;
    this.unparsed |= onDemandEquivalentCost.unparsed;
    return this;
  }

  /**
   * A timeseries metric containing timestamps, series values, and optional unit metadata.
   *
   * @return onDemandEquivalentCost
   */
  @JsonProperty(JSON_PROPERTY_ON_DEMAND_EQUIVALENT_COST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CommitmentsTimeseriesMetric getOnDemandEquivalentCost() {
    return onDemandEquivalentCost;
  }

  public void setOnDemandEquivalentCost(CommitmentsTimeseriesMetric onDemandEquivalentCost) {
    this.onDemandEquivalentCost = onDemandEquivalentCost;
  }

  public CommitmentsSavingsTimeseriesResponse realizedSavings(
      CommitmentsTimeseriesMetric realizedSavings) {
    this.realizedSavings = realizedSavings;
    this.unparsed |= realizedSavings.unparsed;
    return this;
  }

  /**
   * A timeseries metric containing timestamps, series values, and optional unit metadata.
   *
   * @return realizedSavings
   */
  @JsonProperty(JSON_PROPERTY_REALIZED_SAVINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CommitmentsTimeseriesMetric getRealizedSavings() {
    return realizedSavings;
  }

  public void setRealizedSavings(CommitmentsTimeseriesMetric realizedSavings) {
    this.realizedSavings = realizedSavings;
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
   * @return CommitmentsSavingsTimeseriesResponse
   */
  @JsonAnySetter
  public CommitmentsSavingsTimeseriesResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CommitmentsSavingsTimeseriesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommitmentsSavingsTimeseriesResponse commitmentsSavingsTimeseriesResponse =
        (CommitmentsSavingsTimeseriesResponse) o;
    return Objects.equals(this.actualCost, commitmentsSavingsTimeseriesResponse.actualCost)
        && Objects.equals(
            this.effectiveSavingsRate, commitmentsSavingsTimeseriesResponse.effectiveSavingsRate)
        && Objects.equals(
            this.onDemandEquivalentCost,
            commitmentsSavingsTimeseriesResponse.onDemandEquivalentCost)
        && Objects.equals(
            this.realizedSavings, commitmentsSavingsTimeseriesResponse.realizedSavings)
        && Objects.equals(
            this.additionalProperties, commitmentsSavingsTimeseriesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        actualCost,
        effectiveSavingsRate,
        onDemandEquivalentCost,
        realizedSavings,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommitmentsSavingsTimeseriesResponse {\n");
    sb.append("    actualCost: ").append(toIndentedString(actualCost)).append("\n");
    sb.append("    effectiveSavingsRate: ")
        .append(toIndentedString(effectiveSavingsRate))
        .append("\n");
    sb.append("    onDemandEquivalentCost: ")
        .append(toIndentedString(onDemandEquivalentCost))
        .append("\n");
    sb.append("    realizedSavings: ").append(toIndentedString(realizedSavings)).append("\n");
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
