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

/** Data Datadog collects from OpenAI Usage and Costs, keyed by dataflow ID. */
@JsonPropertyOrder({
  OpenAIUsageAndCostsIntegrationDataflowsResponse.JSON_PROPERTY_OPENAI_CLOUD_COST_DATA,
  OpenAIUsageAndCostsIntegrationDataflowsResponse.JSON_PROPERTY_OPENAI_USAGE_METRICS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OpenAIUsageAndCostsIntegrationDataflowsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_OPENAI_CLOUD_COST_DATA = "openai-cloud-cost-data";
  private OpenAIUsageAndCostsCloudCostDataIntegrationDataflowResponse openaiCloudCostData;

  public static final String JSON_PROPERTY_OPENAI_USAGE_METRICS = "openai-usage-metrics";
  private OpenAIUsageAndCostsUsageMetricsIntegrationDataflowResponse openaiUsageMetrics;

  public OpenAIUsageAndCostsIntegrationDataflowsResponse openaiCloudCostData(
      OpenAIUsageAndCostsCloudCostDataIntegrationDataflowResponse openaiCloudCostData) {
    this.openaiCloudCostData = openaiCloudCostData;
    this.unparsed |= openaiCloudCostData.unparsed;
    return this;
  }

  /**
   * OpenAI organization costs, which you can analyze in <a
   * href="https://docs.datadoghq.com/cloud_cost_management/">Cloud Cost Management</a>. See <a
   * href="https://docs.datadoghq.com/cloud_cost_management/saas_costs/?tab=openai#data-collected">collected
   * data</a> for what is included.
   *
   * @return openaiCloudCostData
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPENAI_CLOUD_COST_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OpenAIUsageAndCostsCloudCostDataIntegrationDataflowResponse getOpenaiCloudCostData() {
    return openaiCloudCostData;
  }

  public void setOpenaiCloudCostData(
      OpenAIUsageAndCostsCloudCostDataIntegrationDataflowResponse openaiCloudCostData) {
    this.openaiCloudCostData = openaiCloudCostData;
    if (openaiCloudCostData != null) {
      this.unparsed |= openaiCloudCostData.unparsed;
    }
  }

  public OpenAIUsageAndCostsIntegrationDataflowsResponse openaiUsageMetrics(
      OpenAIUsageAndCostsUsageMetricsIntegrationDataflowResponse openaiUsageMetrics) {
    this.openaiUsageMetrics = openaiUsageMetrics;
    this.unparsed |= openaiUsageMetrics.unparsed;
    return this;
  }

  /**
   * Organization usage metrics under the <code>openai.*</code> namespace, such as <code>
   * openai.completions.*</code>, <code>openai.embeddings.*</code>, <code>openai.images.*</code>,
   * <code>openai.moderations.*</code>, <code>openai.audio_speeches.*</code>, <code>
   * openai.audio_transcriptions.*</code>, <code>openai.code_interpreter_sessions.*</code>, and
   * <code>openai.vector_stores.*</code>. This dataflow is always on and cannot be turned off, so it
   * appears only in responses.
   *
   * @return openaiUsageMetrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPENAI_USAGE_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OpenAIUsageAndCostsUsageMetricsIntegrationDataflowResponse getOpenaiUsageMetrics() {
    return openaiUsageMetrics;
  }

  public void setOpenaiUsageMetrics(
      OpenAIUsageAndCostsUsageMetricsIntegrationDataflowResponse openaiUsageMetrics) {
    this.openaiUsageMetrics = openaiUsageMetrics;
    if (openaiUsageMetrics != null) {
      this.unparsed |= openaiUsageMetrics.unparsed;
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
   * @return OpenAIUsageAndCostsIntegrationDataflowsResponse
   */
  @JsonAnySetter
  public OpenAIUsageAndCostsIntegrationDataflowsResponse putAdditionalProperty(
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

  /** Return true if this OpenAIUsageAndCostsIntegrationDataflowsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenAIUsageAndCostsIntegrationDataflowsResponse
        openAiUsageAndCostsIntegrationDataflowsResponse =
            (OpenAIUsageAndCostsIntegrationDataflowsResponse) o;
    return Objects.equals(
            this.openaiCloudCostData,
            openAiUsageAndCostsIntegrationDataflowsResponse.openaiCloudCostData)
        && Objects.equals(
            this.openaiUsageMetrics,
            openAiUsageAndCostsIntegrationDataflowsResponse.openaiUsageMetrics)
        && Objects.equals(
            this.additionalProperties,
            openAiUsageAndCostsIntegrationDataflowsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openaiCloudCostData, openaiUsageMetrics, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenAIUsageAndCostsIntegrationDataflowsResponse {\n");
    sb.append("    openaiCloudCostData: ")
        .append(toIndentedString(openaiCloudCostData))
        .append("\n");
    sb.append("    openaiUsageMetrics: ").append(toIndentedString(openaiUsageMetrics)).append("\n");
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
