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

/** LLM inference parameters for a custom evaluator. */
@JsonPropertyOrder({
  LLMObsCustomEvalConfigInferenceParams.JSON_PROPERTY_FREQUENCY_PENALTY,
  LLMObsCustomEvalConfigInferenceParams.JSON_PROPERTY_MAX_TOKENS,
  LLMObsCustomEvalConfigInferenceParams.JSON_PROPERTY_PRESENCE_PENALTY,
  LLMObsCustomEvalConfigInferenceParams.JSON_PROPERTY_TEMPERATURE,
  LLMObsCustomEvalConfigInferenceParams.JSON_PROPERTY_TOP_K,
  LLMObsCustomEvalConfigInferenceParams.JSON_PROPERTY_TOP_P
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsCustomEvalConfigInferenceParams {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FREQUENCY_PENALTY = "frequency_penalty";
  private Double frequencyPenalty;

  public static final String JSON_PROPERTY_MAX_TOKENS = "max_tokens";
  private Long maxTokens;

  public static final String JSON_PROPERTY_PRESENCE_PENALTY = "presence_penalty";
  private Double presencePenalty;

  public static final String JSON_PROPERTY_TEMPERATURE = "temperature";
  private Double temperature;

  public static final String JSON_PROPERTY_TOP_K = "top_k";
  private Long topK;

  public static final String JSON_PROPERTY_TOP_P = "top_p";
  private Double topP;

  public LLMObsCustomEvalConfigInferenceParams frequencyPenalty(Double frequencyPenalty) {
    this.frequencyPenalty = frequencyPenalty;
    return this;
  }

  /**
   * Frequency penalty to reduce repetition.
   *
   * @return frequencyPenalty
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FREQUENCY_PENALTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getFrequencyPenalty() {
    return frequencyPenalty;
  }

  public void setFrequencyPenalty(Double frequencyPenalty) {
    this.frequencyPenalty = frequencyPenalty;
  }

  public LLMObsCustomEvalConfigInferenceParams maxTokens(Long maxTokens) {
    this.maxTokens = maxTokens;
    return this;
  }

  /**
   * Maximum number of tokens to generate.
   *
   * @return maxTokens
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_TOKENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxTokens() {
    return maxTokens;
  }

  public void setMaxTokens(Long maxTokens) {
    this.maxTokens = maxTokens;
  }

  public LLMObsCustomEvalConfigInferenceParams presencePenalty(Double presencePenalty) {
    this.presencePenalty = presencePenalty;
    return this;
  }

  /**
   * Presence penalty to reduce repetition.
   *
   * @return presencePenalty
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRESENCE_PENALTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPresencePenalty() {
    return presencePenalty;
  }

  public void setPresencePenalty(Double presencePenalty) {
    this.presencePenalty = presencePenalty;
  }

  public LLMObsCustomEvalConfigInferenceParams temperature(Double temperature) {
    this.temperature = temperature;
    return this;
  }

  /**
   * Sampling temperature for the LLM.
   *
   * @return temperature
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPERATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTemperature() {
    return temperature;
  }

  public void setTemperature(Double temperature) {
    this.temperature = temperature;
  }

  public LLMObsCustomEvalConfigInferenceParams topK(Long topK) {
    this.topK = topK;
    return this;
  }

  /**
   * Top-k sampling parameter.
   *
   * @return topK
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOP_K)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTopK() {
    return topK;
  }

  public void setTopK(Long topK) {
    this.topK = topK;
  }

  public LLMObsCustomEvalConfigInferenceParams topP(Double topP) {
    this.topP = topP;
    return this;
  }

  /**
   * Top-p (nucleus) sampling parameter.
   *
   * @return topP
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOP_P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTopP() {
    return topP;
  }

  public void setTopP(Double topP) {
    this.topP = topP;
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
   * @return LLMObsCustomEvalConfigInferenceParams
   */
  @JsonAnySetter
  public LLMObsCustomEvalConfigInferenceParams putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsCustomEvalConfigInferenceParams object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsCustomEvalConfigInferenceParams llmObsCustomEvalConfigInferenceParams =
        (LLMObsCustomEvalConfigInferenceParams) o;
    return Objects.equals(
            this.frequencyPenalty, llmObsCustomEvalConfigInferenceParams.frequencyPenalty)
        && Objects.equals(this.maxTokens, llmObsCustomEvalConfigInferenceParams.maxTokens)
        && Objects.equals(
            this.presencePenalty, llmObsCustomEvalConfigInferenceParams.presencePenalty)
        && Objects.equals(this.temperature, llmObsCustomEvalConfigInferenceParams.temperature)
        && Objects.equals(this.topK, llmObsCustomEvalConfigInferenceParams.topK)
        && Objects.equals(this.topP, llmObsCustomEvalConfigInferenceParams.topP)
        && Objects.equals(
            this.additionalProperties, llmObsCustomEvalConfigInferenceParams.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        frequencyPenalty,
        maxTokens,
        presencePenalty,
        temperature,
        topK,
        topP,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsCustomEvalConfigInferenceParams {\n");
    sb.append("    frequencyPenalty: ").append(toIndentedString(frequencyPenalty)).append("\n");
    sb.append("    maxTokens: ").append(toIndentedString(maxTokens)).append("\n");
    sb.append("    presencePenalty: ").append(toIndentedString(presencePenalty)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    topK: ").append(toIndentedString(topK)).append("\n");
    sb.append("    topP: ").append(toIndentedString(topP)).append("\n");
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
