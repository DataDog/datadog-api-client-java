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

/** Anthropic-specific metadata for an inference request. */
@JsonPropertyOrder({
  LLMObsAnthropicMetadata.JSON_PROPERTY_EFFORT,
  LLMObsAnthropicMetadata.JSON_PROPERTY_THINKING
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsAnthropicMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EFFORT = "effort";
  private JsonNullable<LLMObsAnthropicEffort> effort =
      JsonNullable.<LLMObsAnthropicEffort>undefined();

  public static final String JSON_PROPERTY_THINKING = "thinking";
  private LLMObsAnthropicThinkingConfig thinking;

  public LLMObsAnthropicMetadata effort(LLMObsAnthropicEffort effort) {
    this.effort = JsonNullable.<LLMObsAnthropicEffort>of(effort);
    return this;
  }

  /**
   * The effort level for Anthropic inference.
   *
   * @return effort
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public LLMObsAnthropicEffort getEffort() {
    return effort.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EFFORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<LLMObsAnthropicEffort> getEffort_JsonNullable() {
    return effort;
  }

  @JsonProperty(JSON_PROPERTY_EFFORT)
  public void setEffort_JsonNullable(JsonNullable<LLMObsAnthropicEffort> effort) {
    this.effort = effort;
  }

  public void setEffort(LLMObsAnthropicEffort effort) {
    if (!effort.isValid()) {
      this.unparsed = true;
    }
    this.effort = JsonNullable.<LLMObsAnthropicEffort>of(effort);
  }

  public LLMObsAnthropicMetadata thinking(LLMObsAnthropicThinkingConfig thinking) {
    this.thinking = thinking;
    this.unparsed |= thinking.unparsed;
    return this;
  }

  /**
   * Configuration for Anthropic extended thinking feature.
   *
   * @return thinking
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THINKING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsAnthropicThinkingConfig getThinking() {
    return thinking;
  }

  public void setThinking(LLMObsAnthropicThinkingConfig thinking) {
    this.thinking = thinking;
    if (thinking != null) {
      this.unparsed |= thinking.unparsed;
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
   * @return LLMObsAnthropicMetadata
   */
  @JsonAnySetter
  public LLMObsAnthropicMetadata putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsAnthropicMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsAnthropicMetadata llmObsAnthropicMetadata = (LLMObsAnthropicMetadata) o;
    return Objects.equals(this.effort, llmObsAnthropicMetadata.effort)
        && Objects.equals(this.thinking, llmObsAnthropicMetadata.thinking)
        && Objects.equals(this.additionalProperties, llmObsAnthropicMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effort, thinking, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsAnthropicMetadata {\n");
    sb.append("    effort: ").append(toIndentedString(effort)).append("\n");
    sb.append("    thinking: ").append(toIndentedString(thinking)).append("\n");
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
