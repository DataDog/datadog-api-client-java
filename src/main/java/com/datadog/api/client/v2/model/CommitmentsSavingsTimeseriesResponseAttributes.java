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

/** Attributes of a timeseries savings response. */
@JsonPropertyOrder({
  CommitmentsSavingsTimeseriesResponseAttributes.JSON_PROPERTY_ACTUAL_COST,
  CommitmentsSavingsTimeseriesResponseAttributes.JSON_PROPERTY_EFFECTIVE_SAVINGS_RATE,
  CommitmentsSavingsTimeseriesResponseAttributes.JSON_PROPERTY_META,
  CommitmentsSavingsTimeseriesResponseAttributes.JSON_PROPERTY_ON_DEMAND_EQUIVALENT_COST,
  CommitmentsSavingsTimeseriesResponseAttributes.JSON_PROPERTY_QUERY_DEFINITION,
  CommitmentsSavingsTimeseriesResponseAttributes.JSON_PROPERTY_REALIZED_SAVINGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CommitmentsSavingsTimeseriesResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTUAL_COST = "actual_cost";
  private CommitmentsTimeseriesMetric actualCost;

  public static final String JSON_PROPERTY_EFFECTIVE_SAVINGS_RATE = "effective_savings_rate";
  private CommitmentsTimeseriesMetric effectiveSavingsRate;

  public static final String JSON_PROPERTY_META = "meta";
  private CommitmentsUnusedCostMeta meta;

  public static final String JSON_PROPERTY_ON_DEMAND_EQUIVALENT_COST = "on_demand_equivalent_cost";
  private CommitmentsTimeseriesMetric onDemandEquivalentCost;

  public static final String JSON_PROPERTY_QUERY_DEFINITION = "query_definition";
  private CommitmentsQueryDefinition queryDefinition;

  public static final String JSON_PROPERTY_REALIZED_SAVINGS = "realized_savings";
  private CommitmentsTimeseriesMetric realizedSavings;

  public CommitmentsSavingsTimeseriesResponseAttributes() {}

  @JsonCreator
  public CommitmentsSavingsTimeseriesResponseAttributes(
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

  public CommitmentsSavingsTimeseriesResponseAttributes actualCost(
      CommitmentsTimeseriesMetric actualCost) {
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
    if (actualCost != null) {
      this.unparsed |= actualCost.unparsed;
    }
  }

  public CommitmentsSavingsTimeseriesResponseAttributes effectiveSavingsRate(
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
    if (effectiveSavingsRate != null) {
      this.unparsed |= effectiveSavingsRate.unparsed;
    }
  }

  public CommitmentsSavingsTimeseriesResponseAttributes meta(CommitmentsUnusedCostMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Metadata reporting that the cost data lacks the unused costs of some commitments, as with Azure
   * exports scoped below the billing profile. Utilization is then overstated, and realized savings
   * and effective savings rate are upper bounds. Omitted when the unused costs are available.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CommitmentsUnusedCostMeta getMeta() {
    return meta;
  }

  public void setMeta(CommitmentsUnusedCostMeta meta) {
    this.meta = meta;
    if (meta != null) {
      this.unparsed |= meta.unparsed;
    }
  }

  public CommitmentsSavingsTimeseriesResponseAttributes onDemandEquivalentCost(
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
    if (onDemandEquivalentCost != null) {
      this.unparsed |= onDemandEquivalentCost.unparsed;
    }
  }

  public CommitmentsSavingsTimeseriesResponseAttributes queryDefinition(
      CommitmentsQueryDefinition queryDefinition) {
    this.queryDefinition = queryDefinition;
    this.unparsed |= queryDefinition.unparsed;
    return this;
  }

  /**
   * The query that produces the response values, in the same format as dashboard and notebook
   * widget requests, so a client can graph the values in a widget. Each formula's <code>id</code>
   * names the response value that it produces.
   *
   * @return queryDefinition
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CommitmentsQueryDefinition getQueryDefinition() {
    return queryDefinition;
  }

  public void setQueryDefinition(CommitmentsQueryDefinition queryDefinition) {
    this.queryDefinition = queryDefinition;
    if (queryDefinition != null) {
      this.unparsed |= queryDefinition.unparsed;
    }
  }

  public CommitmentsSavingsTimeseriesResponseAttributes realizedSavings(
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
    if (realizedSavings != null) {
      this.unparsed |= realizedSavings.unparsed;
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
   * @return CommitmentsSavingsTimeseriesResponseAttributes
   */
  @JsonAnySetter
  public CommitmentsSavingsTimeseriesResponseAttributes putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this CommitmentsSavingsTimeseriesResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommitmentsSavingsTimeseriesResponseAttributes commitmentsSavingsTimeseriesResponseAttributes =
        (CommitmentsSavingsTimeseriesResponseAttributes) o;
    return Objects.equals(
            this.actualCost, commitmentsSavingsTimeseriesResponseAttributes.actualCost)
        && Objects.equals(
            this.effectiveSavingsRate,
            commitmentsSavingsTimeseriesResponseAttributes.effectiveSavingsRate)
        && Objects.equals(this.meta, commitmentsSavingsTimeseriesResponseAttributes.meta)
        && Objects.equals(
            this.onDemandEquivalentCost,
            commitmentsSavingsTimeseriesResponseAttributes.onDemandEquivalentCost)
        && Objects.equals(
            this.queryDefinition, commitmentsSavingsTimeseriesResponseAttributes.queryDefinition)
        && Objects.equals(
            this.realizedSavings, commitmentsSavingsTimeseriesResponseAttributes.realizedSavings)
        && Objects.equals(
            this.additionalProperties,
            commitmentsSavingsTimeseriesResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        actualCost,
        effectiveSavingsRate,
        meta,
        onDemandEquivalentCost,
        queryDefinition,
        realizedSavings,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommitmentsSavingsTimeseriesResponseAttributes {\n");
    sb.append("    actualCost: ").append(toIndentedString(actualCost)).append("\n");
    sb.append("    effectiveSavingsRate: ")
        .append(toIndentedString(effectiveSavingsRate))
        .append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    onDemandEquivalentCost: ")
        .append(toIndentedString(onDemandEquivalentCost))
        .append("\n");
    sb.append("    queryDefinition: ").append(toIndentedString(queryDefinition)).append("\n");
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
