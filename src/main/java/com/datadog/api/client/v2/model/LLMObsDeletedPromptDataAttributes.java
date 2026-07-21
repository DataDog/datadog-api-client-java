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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Attributes confirming that an LLM Observability prompt was deleted. */
@JsonPropertyOrder({
  LLMObsDeletedPromptDataAttributes.JSON_PROPERTY_DELETED_AT,
  LLMObsDeletedPromptDataAttributes.JSON_PROPERTY_PROMPT_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsDeletedPromptDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DELETED_AT = "deleted_at";
  private OffsetDateTime deletedAt;

  public static final String JSON_PROPERTY_PROMPT_ID = "prompt_id";
  private String promptId;

  public LLMObsDeletedPromptDataAttributes() {}

  @JsonCreator
  public LLMObsDeletedPromptDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DELETED_AT) OffsetDateTime deletedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROMPT_ID) String promptId) {
    this.deletedAt = deletedAt;
    this.promptId = promptId;
  }

  public LLMObsDeletedPromptDataAttributes deletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
    return this;
  }

  /**
   * Timestamp when the prompt was deleted.
   *
   * @return deletedAt
   */
  @JsonProperty(JSON_PROPERTY_DELETED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
  }

  public LLMObsDeletedPromptDataAttributes promptId(String promptId) {
    this.promptId = promptId;
    return this;
  }

  /**
   * Customer-provided identifier of the deleted prompt.
   *
   * @return promptId
   */
  @JsonProperty(JSON_PROPERTY_PROMPT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPromptId() {
    return promptId;
  }

  public void setPromptId(String promptId) {
    this.promptId = promptId;
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
   * @return LLMObsDeletedPromptDataAttributes
   */
  @JsonAnySetter
  public LLMObsDeletedPromptDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsDeletedPromptDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsDeletedPromptDataAttributes llmObsDeletedPromptDataAttributes =
        (LLMObsDeletedPromptDataAttributes) o;
    return Objects.equals(this.deletedAt, llmObsDeletedPromptDataAttributes.deletedAt)
        && Objects.equals(this.promptId, llmObsDeletedPromptDataAttributes.promptId)
        && Objects.equals(
            this.additionalProperties, llmObsDeletedPromptDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedAt, promptId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsDeletedPromptDataAttributes {\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    promptId: ").append(toIndentedString(promptId)).append("\n");
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
