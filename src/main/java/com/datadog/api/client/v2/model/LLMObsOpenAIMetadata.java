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
import org.openapitools.jackson.nullable.JsonNullable;

/** OpenAI-specific metadata for an inference request. */
@JsonPropertyOrder({
  LLMObsOpenAIMetadata.JSON_PROPERTY_REASONING_EFFORT,
  LLMObsOpenAIMetadata.JSON_PROPERTY_REASONING_SUMMARY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsOpenAIMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_REASONING_EFFORT = "reasoning_effort";
  private JsonNullable<LLMObsOpenAIReasoningEffort> reasoningEffort =
      JsonNullable.<LLMObsOpenAIReasoningEffort>undefined();

  public static final String JSON_PROPERTY_REASONING_SUMMARY = "reasoning_summary";
  private JsonNullable<LLMObsOpenAIReasoningSummary> reasoningSummary =
      JsonNullable.<LLMObsOpenAIReasoningSummary>undefined();

  public LLMObsOpenAIMetadata reasoningEffort(LLMObsOpenAIReasoningEffort reasoningEffort) {
    this.reasoningEffort = JsonNullable.<LLMObsOpenAIReasoningEffort>of(reasoningEffort);
    return this;
  }

  /**
   * The reasoning effort level for OpenAI models that support it.
   *
   * @return reasoningEffort
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public LLMObsOpenAIReasoningEffort getReasoningEffort() {
    return reasoningEffort.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REASONING_EFFORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<LLMObsOpenAIReasoningEffort> getReasoningEffort_JsonNullable() {
    return reasoningEffort;
  }

  @JsonProperty(JSON_PROPERTY_REASONING_EFFORT)
  public void setReasoningEffort_JsonNullable(
      JsonNullable<LLMObsOpenAIReasoningEffort> reasoningEffort) {
    this.reasoningEffort = reasoningEffort;
  }

  public void setReasoningEffort(LLMObsOpenAIReasoningEffort reasoningEffort) {
    if (!reasoningEffort.isValid()) {
      this.unparsed = true;
    }
    this.reasoningEffort = JsonNullable.<LLMObsOpenAIReasoningEffort>of(reasoningEffort);
  }

  public LLMObsOpenAIMetadata reasoningSummary(LLMObsOpenAIReasoningSummary reasoningSummary) {
    this.reasoningSummary = JsonNullable.<LLMObsOpenAIReasoningSummary>of(reasoningSummary);
    return this;
  }

  /**
   * The verbosity of the reasoning summary.
   *
   * @return reasoningSummary
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public LLMObsOpenAIReasoningSummary getReasoningSummary() {
    return reasoningSummary.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REASONING_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<LLMObsOpenAIReasoningSummary> getReasoningSummary_JsonNullable() {
    return reasoningSummary;
  }

  @JsonProperty(JSON_PROPERTY_REASONING_SUMMARY)
  public void setReasoningSummary_JsonNullable(
      JsonNullable<LLMObsOpenAIReasoningSummary> reasoningSummary) {
    this.reasoningSummary = reasoningSummary;
  }

  public void setReasoningSummary(LLMObsOpenAIReasoningSummary reasoningSummary) {
    if (!reasoningSummary.isValid()) {
      this.unparsed = true;
    }
    this.reasoningSummary = JsonNullable.<LLMObsOpenAIReasoningSummary>of(reasoningSummary);
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
   * @return LLMObsOpenAIMetadata
   */
  @JsonAnySetter
  public LLMObsOpenAIMetadata putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsOpenAIMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsOpenAIMetadata llmObsOpenAiMetadata = (LLMObsOpenAIMetadata) o;
    return Objects.equals(this.reasoningEffort, llmObsOpenAiMetadata.reasoningEffort)
        && Objects.equals(this.reasoningSummary, llmObsOpenAiMetadata.reasoningSummary)
        && Objects.equals(this.additionalProperties, llmObsOpenAiMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reasoningEffort, reasoningSummary, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsOpenAIMetadata {\n");
    sb.append("    reasoningEffort: ").append(toIndentedString(reasoningEffort)).append("\n");
    sb.append("    reasoningSummary: ").append(toIndentedString(reasoningSummary)).append("\n");
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
