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

/**
 * Data Datadog collects from Anthropic Usage and Costs, keyed by dataflow ID. Datadog always
 * collects usage metrics. Each dataflow in this object adds another type of collection. Set <code>
 * enabled</code> to start or stop a dataflow. The default for each dataflow applies when the
 * account is created. On update, omitted fields keep their current values. If a dataflow depends on
 * a Datadog product, its description names that product. If you enable a dataflow without that
 * product, Datadog stores the setting but collects no data.
 */
@JsonPropertyOrder({
  AnthropicUsageAndCostsIntegrationDataflowsRequest.JSON_PROPERTY_ANTHROPIC_CLOUD_COST_METRICS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AnthropicUsageAndCostsIntegrationDataflowsRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ANTHROPIC_CLOUD_COST_METRICS =
      "anthropic-cloud-cost-metrics";
  private AnthropicUsageAndCostsCloudCostMetricsIntegrationDataflowRequest
      anthropicCloudCostMetrics;

  public AnthropicUsageAndCostsIntegrationDataflowsRequest anthropicCloudCostMetrics(
      AnthropicUsageAndCostsCloudCostMetricsIntegrationDataflowRequest anthropicCloudCostMetrics) {
    this.anthropicCloudCostMetrics = anthropicCloudCostMetrics;
    this.unparsed |= anthropicCloudCostMetrics.unparsed;
    return this;
  }

  /**
   * Anthropic costs by model, workspace, and service tier, in <a
   * href="https://docs.datadoghq.com/cloud_cost_management/">Cloud Cost Management</a>. Requires
   * Cloud Cost Management on your Datadog organization. Without it, this dataflow collects no data.
   * Cost data appears in Cloud Cost Management within 24 to 48 hours of enabling this dataflow.
   *
   * @return anthropicCloudCostMetrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANTHROPIC_CLOUD_COST_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AnthropicUsageAndCostsCloudCostMetricsIntegrationDataflowRequest
      getAnthropicCloudCostMetrics() {
    return anthropicCloudCostMetrics;
  }

  public void setAnthropicCloudCostMetrics(
      AnthropicUsageAndCostsCloudCostMetricsIntegrationDataflowRequest anthropicCloudCostMetrics) {
    this.anthropicCloudCostMetrics = anthropicCloudCostMetrics;
    if (anthropicCloudCostMetrics != null) {
      this.unparsed |= anthropicCloudCostMetrics.unparsed;
    }
  }

  /** Return true if this AnthropicUsageAndCostsIntegrationDataflowsRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnthropicUsageAndCostsIntegrationDataflowsRequest
        anthropicUsageAndCostsIntegrationDataflowsRequest =
            (AnthropicUsageAndCostsIntegrationDataflowsRequest) o;
    return Objects.equals(
        this.anthropicCloudCostMetrics,
        anthropicUsageAndCostsIntegrationDataflowsRequest.anthropicCloudCostMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anthropicCloudCostMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnthropicUsageAndCostsIntegrationDataflowsRequest {\n");
    sb.append("    anthropicCloudCostMetrics: ")
        .append(toIndentedString(anthropicCloudCostMetrics))
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
