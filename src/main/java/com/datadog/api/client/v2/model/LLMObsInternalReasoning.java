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
import org.openapitools.jackson.nullable.JsonNullable;

/** The model's internal reasoning or thinking output, if available. */
@JsonPropertyOrder({
  LLMObsInternalReasoning.JSON_PROPERTY_REASONING_TOKENS,
  LLMObsInternalReasoning.JSON_PROPERTY_TEXT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsInternalReasoning {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_REASONING_TOKENS = "reasoning_tokens";
  private JsonNullable<Long> reasoningTokens = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public LLMObsInternalReasoning() {}

  @JsonCreator
  public LLMObsInternalReasoning(
      @JsonProperty(required = true, value = JSON_PROPERTY_TEXT) String text) {
    this.text = text;
  }

  public LLMObsInternalReasoning reasoningTokens(Long reasoningTokens) {
    this.reasoningTokens = JsonNullable.<Long>of(reasoningTokens);
    return this;
  }

  /**
   * Number of tokens used for internal reasoning.
   *
   * @return reasoningTokens
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getReasoningTokens() {
    return reasoningTokens.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REASONING_TOKENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getReasoningTokens_JsonNullable() {
    return reasoningTokens;
  }

  @JsonProperty(JSON_PROPERTY_REASONING_TOKENS)
  public void setReasoningTokens_JsonNullable(JsonNullable<Long> reasoningTokens) {
    this.reasoningTokens = reasoningTokens;
  }

  public void setReasoningTokens(Long reasoningTokens) {
    this.reasoningTokens = JsonNullable.<Long>of(reasoningTokens);
  }

  public LLMObsInternalReasoning text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The reasoning text produced by the model.
   *
   * @return text
   */
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
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
   * @return LLMObsInternalReasoning
   */
  @JsonAnySetter
  public LLMObsInternalReasoning putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsInternalReasoning object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsInternalReasoning llmObsInternalReasoning = (LLMObsInternalReasoning) o;
    return Objects.equals(this.reasoningTokens, llmObsInternalReasoning.reasoningTokens)
        && Objects.equals(this.text, llmObsInternalReasoning.text)
        && Objects.equals(this.additionalProperties, llmObsInternalReasoning.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reasoningTokens, text, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsInternalReasoning {\n");
    sb.append("    reasoningTokens: ").append(toIndentedString(reasoningTokens)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
