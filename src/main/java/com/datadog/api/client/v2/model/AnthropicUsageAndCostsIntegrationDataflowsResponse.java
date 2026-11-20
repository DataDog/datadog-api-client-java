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

/** Data Datadog collects from Anthropic Usage and Costs, keyed by dataflow ID. */
@JsonPropertyOrder({
  AnthropicUsageAndCostsIntegrationDataflowsResponse.JSON_PROPERTY_ANTHROPIC_CLOUD_COST_METRICS,
  AnthropicUsageAndCostsIntegrationDataflowsResponse.JSON_PROPERTY_ANTHROPIC_USAGE_METRICS,
  AnthropicUsageAndCostsIntegrationDataflowsResponse.JSON_PROPERTY_CLAUDE_DAILY_USAGE_DORA_METRICS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AnthropicUsageAndCostsIntegrationDataflowsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ANTHROPIC_CLOUD_COST_METRICS =
      "anthropic-cloud-cost-metrics";
  private AnthropicUsageAndCostsCloudCostMetricsIntegrationDataflowResponse
      anthropicCloudCostMetrics;

  public static final String JSON_PROPERTY_ANTHROPIC_USAGE_METRICS = "anthropic-usage-metrics";
  private AnthropicUsageAndCostsUsageMetricsIntegrationDataflowResponse anthropicUsageMetrics;

  public static final String JSON_PROPERTY_CLAUDE_DAILY_USAGE_DORA_METRICS =
      "claude-daily-usage-dora-metrics";
  private AnthropicUsageAndCostsDailyUsageDoraMetricsIntegrationDataflowResponse
      claudeDailyUsageDoraMetrics;

  public AnthropicUsageAndCostsIntegrationDataflowsResponse anthropicCloudCostMetrics(
      AnthropicUsageAndCostsCloudCostMetricsIntegrationDataflowResponse anthropicCloudCostMetrics) {
    this.anthropicCloudCostMetrics = anthropicCloudCostMetrics;
    this.unparsed |= anthropicCloudCostMetrics.unparsed;
    return this;
  }

  /**
   * Anthropic costs by model, workspace, and service tier, in <a
   * href="https://docs.datadoghq.com/cloud_cost_management/">Cloud Cost Management</a>. Requires
   * Cloud Cost Management on your Datadog organization. Without it, this dataflow collects no data.
   *
   * @return anthropicCloudCostMetrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANTHROPIC_CLOUD_COST_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AnthropicUsageAndCostsCloudCostMetricsIntegrationDataflowResponse
      getAnthropicCloudCostMetrics() {
    return anthropicCloudCostMetrics;
  }

  public void setAnthropicCloudCostMetrics(
      AnthropicUsageAndCostsCloudCostMetricsIntegrationDataflowResponse anthropicCloudCostMetrics) {
    this.anthropicCloudCostMetrics = anthropicCloudCostMetrics;
    if (anthropicCloudCostMetrics != null) {
      this.unparsed |= anthropicCloudCostMetrics.unparsed;
    }
  }

  public AnthropicUsageAndCostsIntegrationDataflowsResponse anthropicUsageMetrics(
      AnthropicUsageAndCostsUsageMetricsIntegrationDataflowResponse anthropicUsageMetrics) {
    this.anthropicUsageMetrics = anthropicUsageMetrics;
    this.unparsed |= anthropicUsageMetrics.unparsed;
    return this;
  }

  /**
   * Anthropic usage metrics, such as input, output, and cache token consumption by model,
   * workspace, and service tier. With an Analytics API key, usage is also broken down by user,
   * product, context window, inference geography, and speed. This dataflow is always on and cannot
   * be turned off, which is why it appears in responses only.
   *
   * @return anthropicUsageMetrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANTHROPIC_USAGE_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AnthropicUsageAndCostsUsageMetricsIntegrationDataflowResponse getAnthropicUsageMetrics() {
    return anthropicUsageMetrics;
  }

  public void setAnthropicUsageMetrics(
      AnthropicUsageAndCostsUsageMetricsIntegrationDataflowResponse anthropicUsageMetrics) {
    this.anthropicUsageMetrics = anthropicUsageMetrics;
    if (anthropicUsageMetrics != null) {
      this.unparsed |= anthropicUsageMetrics.unparsed;
    }
  }

  public AnthropicUsageAndCostsIntegrationDataflowsResponse claudeDailyUsageDoraMetrics(
      AnthropicUsageAndCostsDailyUsageDoraMetricsIntegrationDataflowResponse
          claudeDailyUsageDoraMetrics) {
    this.claudeDailyUsageDoraMetrics = claudeDailyUsageDoraMetrics;
    this.unparsed |= claudeDailyUsageDoraMetrics.unparsed;
    return this;
  }

  /**
   * Daily Claude usage data used for DORA Metrics. This dataflow is always on and cannot be turned
   * off, which is why it appears in responses only.
   *
   * @return claudeDailyUsageDoraMetrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLAUDE_DAILY_USAGE_DORA_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AnthropicUsageAndCostsDailyUsageDoraMetricsIntegrationDataflowResponse
      getClaudeDailyUsageDoraMetrics() {
    return claudeDailyUsageDoraMetrics;
  }

  public void setClaudeDailyUsageDoraMetrics(
      AnthropicUsageAndCostsDailyUsageDoraMetricsIntegrationDataflowResponse
          claudeDailyUsageDoraMetrics) {
    this.claudeDailyUsageDoraMetrics = claudeDailyUsageDoraMetrics;
    if (claudeDailyUsageDoraMetrics != null) {
      this.unparsed |= claudeDailyUsageDoraMetrics.unparsed;
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
   * @return AnthropicUsageAndCostsIntegrationDataflowsResponse
   */
  @JsonAnySetter
  public AnthropicUsageAndCostsIntegrationDataflowsResponse putAdditionalProperty(
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

  /**
   * Return true if this AnthropicUsageAndCostsIntegrationDataflowsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnthropicUsageAndCostsIntegrationDataflowsResponse
        anthropicUsageAndCostsIntegrationDataflowsResponse =
            (AnthropicUsageAndCostsIntegrationDataflowsResponse) o;
    return Objects.equals(
            this.anthropicCloudCostMetrics,
            anthropicUsageAndCostsIntegrationDataflowsResponse.anthropicCloudCostMetrics)
        && Objects.equals(
            this.anthropicUsageMetrics,
            anthropicUsageAndCostsIntegrationDataflowsResponse.anthropicUsageMetrics)
        && Objects.equals(
            this.claudeDailyUsageDoraMetrics,
            anthropicUsageAndCostsIntegrationDataflowsResponse.claudeDailyUsageDoraMetrics)
        && Objects.equals(
            this.additionalProperties,
            anthropicUsageAndCostsIntegrationDataflowsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        anthropicCloudCostMetrics,
        anthropicUsageMetrics,
        claudeDailyUsageDoraMetrics,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnthropicUsageAndCostsIntegrationDataflowsResponse {\n");
    sb.append("    anthropicCloudCostMetrics: ")
        .append(toIndentedString(anthropicCloudCostMetrics))
        .append("\n");
    sb.append("    anthropicUsageMetrics: ")
        .append(toIndentedString(anthropicUsageMetrics))
        .append("\n");
    sb.append("    claudeDailyUsageDoraMetrics: ")
        .append(toIndentedString(claudeDailyUsageDoraMetrics))
        .append("\n");
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
