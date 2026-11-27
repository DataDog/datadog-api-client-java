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
 * Data Datadog collects from OpenAI Usage and Costs, keyed by dataflow ID. Datadog always collects
 * organization usage metrics. Each dataflow in this object adds another type of collection. Set
 * <code>enabled</code> to start or stop a dataflow. The default for each dataflow applies when the
 * account is created. On update, omitted fields keep their current values.
 */
@JsonPropertyOrder({
  OpenAIUsageAndCostsIntegrationDataflowsRequest.JSON_PROPERTY_OPENAI_CLOUD_COST_DATA
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OpenAIUsageAndCostsIntegrationDataflowsRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_OPENAI_CLOUD_COST_DATA = "openai-cloud-cost-data";
  private OpenAIUsageAndCostsCloudCostDataIntegrationDataflowRequest openaiCloudCostData;

  public OpenAIUsageAndCostsIntegrationDataflowsRequest openaiCloudCostData(
      OpenAIUsageAndCostsCloudCostDataIntegrationDataflowRequest openaiCloudCostData) {
    this.openaiCloudCostData = openaiCloudCostData;
    this.unparsed |= openaiCloudCostData.unparsed;
    return this;
  }

  /**
   * OpenAI organization costs, which you can analyze in <a
   * href="https://docs.datadoghq.com/cloud_cost_management/">Cloud Cost Management</a>. See <a
   * href="https://docs.datadoghq.com/cloud_cost_management/saas_costs/?tab=openai#data-collected">collected
   * data</a> for what is included. Cost data appears in Cloud Cost Management within 24 hours after
   * you enable this dataflow.
   *
   * @return openaiCloudCostData
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPENAI_CLOUD_COST_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OpenAIUsageAndCostsCloudCostDataIntegrationDataflowRequest getOpenaiCloudCostData() {
    return openaiCloudCostData;
  }

  public void setOpenaiCloudCostData(
      OpenAIUsageAndCostsCloudCostDataIntegrationDataflowRequest openaiCloudCostData) {
    this.openaiCloudCostData = openaiCloudCostData;
    if (openaiCloudCostData != null) {
      this.unparsed |= openaiCloudCostData.unparsed;
    }
  }

  /** Return true if this OpenAIUsageAndCostsIntegrationDataflowsRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenAIUsageAndCostsIntegrationDataflowsRequest openAiUsageAndCostsIntegrationDataflowsRequest =
        (OpenAIUsageAndCostsIntegrationDataflowsRequest) o;
    return Objects.equals(
        this.openaiCloudCostData,
        openAiUsageAndCostsIntegrationDataflowsRequest.openaiCloudCostData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openaiCloudCostData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenAIUsageAndCostsIntegrationDataflowsRequest {\n");
    sb.append("    openaiCloudCostData: ")
        .append(toIndentedString(openaiCloudCostData))
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
