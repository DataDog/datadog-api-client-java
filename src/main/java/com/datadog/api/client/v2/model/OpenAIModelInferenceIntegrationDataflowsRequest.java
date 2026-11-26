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
 * Data Datadog collects from OpenAI Model Inference, keyed by dataflow ID. Each dataflow turns on a
 * distinct type of collection. Set <code>enabled</code> to start or stop a dataflow. The default
 * for each dataflow applies when the account is created. On update, omitted fields keep their
 * current values.
 */
@JsonPropertyOrder({
  OpenAIModelInferenceIntegrationDataflowsRequest.JSON_PROPERTY_OPENAI_LLM_COMPLETIONS,
  OpenAIModelInferenceIntegrationDataflowsRequest.JSON_PROPERTY_OPENAI_PROJECT_CLOUD_COST_DATA
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OpenAIModelInferenceIntegrationDataflowsRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_OPENAI_LLM_COMPLETIONS = "openai-llm-completions";
  private OpenAIModelInferenceLLMCompletionsIntegrationDataflowRequest openaiLlmCompletions;

  public static final String JSON_PROPERTY_OPENAI_PROJECT_CLOUD_COST_DATA =
      "openai-project-cloud-cost-data";
  private OpenAIModelInferenceProjectCloudCostDataIntegrationDataflowRequest
      openaiProjectCloudCostData;

  public OpenAIModelInferenceIntegrationDataflowsRequest openaiLlmCompletions(
      OpenAIModelInferenceLLMCompletionsIntegrationDataflowRequest openaiLlmCompletions) {
    this.openaiLlmCompletions = openaiLlmCompletions;
    this.unparsed |= openaiLlmCompletions.unparsed;
    return this;
  }

  /**
   * Makes the key in <code>authentication</code> available to run evaluations in <a
   * href="https://docs.datadoghq.com/llm_observability/">LLM Observability</a>. While this dataflow
   * is enabled, the API returns a <code>422</code> response for a key that cannot call the OpenAI
   * chat completions endpoint.
   *
   * @return openaiLlmCompletions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPENAI_LLM_COMPLETIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OpenAIModelInferenceLLMCompletionsIntegrationDataflowRequest getOpenaiLlmCompletions() {
    return openaiLlmCompletions;
  }

  public void setOpenaiLlmCompletions(
      OpenAIModelInferenceLLMCompletionsIntegrationDataflowRequest openaiLlmCompletions) {
    this.openaiLlmCompletions = openaiLlmCompletions;
    if (openaiLlmCompletions != null) {
      this.unparsed |= openaiLlmCompletions.unparsed;
    }
  }

  public OpenAIModelInferenceIntegrationDataflowsRequest openaiProjectCloudCostData(
      OpenAIModelInferenceProjectCloudCostDataIntegrationDataflowRequest
          openaiProjectCloudCostData) {
    this.openaiProjectCloudCostData = openaiProjectCloudCostData;
    this.unparsed |= openaiProjectCloudCostData.unparsed;
    return this;
  }

  /**
   * Costs of the OpenAI project that owns the key in <code>authentication</code>. Analyze these
   * costs in <a href="https://docs.datadoghq.com/cloud_cost_management/">Cloud Cost Management</a>.
   * Cost data appears in Cloud Cost Management within 24 hours after you enable this dataflow.
   *
   * @return openaiProjectCloudCostData
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPENAI_PROJECT_CLOUD_COST_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OpenAIModelInferenceProjectCloudCostDataIntegrationDataflowRequest
      getOpenaiProjectCloudCostData() {
    return openaiProjectCloudCostData;
  }

  public void setOpenaiProjectCloudCostData(
      OpenAIModelInferenceProjectCloudCostDataIntegrationDataflowRequest
          openaiProjectCloudCostData) {
    this.openaiProjectCloudCostData = openaiProjectCloudCostData;
    if (openaiProjectCloudCostData != null) {
      this.unparsed |= openaiProjectCloudCostData.unparsed;
    }
  }

  /** Return true if this OpenAIModelInferenceIntegrationDataflowsRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenAIModelInferenceIntegrationDataflowsRequest
        openAiModelInferenceIntegrationDataflowsRequest =
            (OpenAIModelInferenceIntegrationDataflowsRequest) o;
    return Objects.equals(
            this.openaiLlmCompletions,
            openAiModelInferenceIntegrationDataflowsRequest.openaiLlmCompletions)
        && Objects.equals(
            this.openaiProjectCloudCostData,
            openAiModelInferenceIntegrationDataflowsRequest.openaiProjectCloudCostData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openaiLlmCompletions, openaiProjectCloudCostData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenAIModelInferenceIntegrationDataflowsRequest {\n");
    sb.append("    openaiLlmCompletions: ")
        .append(toIndentedString(openaiLlmCompletions))
        .append("\n");
    sb.append("    openaiProjectCloudCostData: ")
        .append(toIndentedString(openaiProjectCloudCostData))
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
