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

/** Data Datadog collects from OpenAI LLM Evaluations, keyed by dataflow ID. */
@JsonPropertyOrder({
  OpenAILLMEvaluationsIntegrationDataflowsResponse.JSON_PROPERTY_OPENAI_LLM_COMPLETIONS,
  OpenAILLMEvaluationsIntegrationDataflowsResponse.JSON_PROPERTY_OPENAI_PROJECT_CLOUD_COST_DATA
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OpenAILLMEvaluationsIntegrationDataflowsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_OPENAI_LLM_COMPLETIONS = "openai-llm-completions";
  private OpenAILLMEvaluationsLLMCompletionsIntegrationDataflowResponse openaiLlmCompletions;

  public static final String JSON_PROPERTY_OPENAI_PROJECT_CLOUD_COST_DATA =
      "openai-project-cloud-cost-data";
  private OpenAILLMEvaluationsProjectCloudCostDataIntegrationDataflowResponse
      openaiProjectCloudCostData;

  public OpenAILLMEvaluationsIntegrationDataflowsResponse openaiLlmCompletions(
      OpenAILLMEvaluationsLLMCompletionsIntegrationDataflowResponse openaiLlmCompletions) {
    this.openaiLlmCompletions = openaiLlmCompletions;
    this.unparsed |= openaiLlmCompletions.unparsed;
    return this;
  }

  /**
   * Makes the key in <code>authentication</code> available to run evaluations in <a
   * href="https://docs.datadoghq.com/llm_observability/">LLM Observability</a>.
   *
   * @return openaiLlmCompletions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPENAI_LLM_COMPLETIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OpenAILLMEvaluationsLLMCompletionsIntegrationDataflowResponse getOpenaiLlmCompletions() {
    return openaiLlmCompletions;
  }

  public void setOpenaiLlmCompletions(
      OpenAILLMEvaluationsLLMCompletionsIntegrationDataflowResponse openaiLlmCompletions) {
    this.openaiLlmCompletions = openaiLlmCompletions;
    if (openaiLlmCompletions != null) {
      this.unparsed |= openaiLlmCompletions.unparsed;
    }
  }

  public OpenAILLMEvaluationsIntegrationDataflowsResponse openaiProjectCloudCostData(
      OpenAILLMEvaluationsProjectCloudCostDataIntegrationDataflowResponse
          openaiProjectCloudCostData) {
    this.openaiProjectCloudCostData = openaiProjectCloudCostData;
    this.unparsed |= openaiProjectCloudCostData.unparsed;
    return this;
  }

  /**
   * Costs of the OpenAI project that the key in <code>authentication</code> belongs to, which you
   * can analyze in <a href="https://docs.datadoghq.com/cloud_cost_management/">Cloud Cost
   * Management</a>.
   *
   * @return openaiProjectCloudCostData
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPENAI_PROJECT_CLOUD_COST_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OpenAILLMEvaluationsProjectCloudCostDataIntegrationDataflowResponse
      getOpenaiProjectCloudCostData() {
    return openaiProjectCloudCostData;
  }

  public void setOpenaiProjectCloudCostData(
      OpenAILLMEvaluationsProjectCloudCostDataIntegrationDataflowResponse
          openaiProjectCloudCostData) {
    this.openaiProjectCloudCostData = openaiProjectCloudCostData;
    if (openaiProjectCloudCostData != null) {
      this.unparsed |= openaiProjectCloudCostData.unparsed;
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
   * @return OpenAILLMEvaluationsIntegrationDataflowsResponse
   */
  @JsonAnySetter
  public OpenAILLMEvaluationsIntegrationDataflowsResponse putAdditionalProperty(
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

  /** Return true if this OpenAILLMEvaluationsIntegrationDataflowsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenAILLMEvaluationsIntegrationDataflowsResponse
        openAillmEvaluationsIntegrationDataflowsResponse =
            (OpenAILLMEvaluationsIntegrationDataflowsResponse) o;
    return Objects.equals(
            this.openaiLlmCompletions,
            openAillmEvaluationsIntegrationDataflowsResponse.openaiLlmCompletions)
        && Objects.equals(
            this.openaiProjectCloudCostData,
            openAillmEvaluationsIntegrationDataflowsResponse.openaiProjectCloudCostData)
        && Objects.equals(
            this.additionalProperties,
            openAillmEvaluationsIntegrationDataflowsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openaiLlmCompletions, openaiProjectCloudCostData, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenAILLMEvaluationsIntegrationDataflowsResponse {\n");
    sb.append("    openaiLlmCompletions: ")
        .append(toIndentedString(openaiLlmCompletions))
        .append("\n");
    sb.append("    openaiProjectCloudCostData: ")
        .append(toIndentedString(openaiProjectCloudCostData))
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
