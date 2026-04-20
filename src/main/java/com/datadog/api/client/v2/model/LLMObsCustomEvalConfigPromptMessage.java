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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** A message in the prompt template for a custom LLM judge evaluator. */
@JsonPropertyOrder({
  LLMObsCustomEvalConfigPromptMessage.JSON_PROPERTY_CONTENT,
  LLMObsCustomEvalConfigPromptMessage.JSON_PROPERTY_CONTENTS,
  LLMObsCustomEvalConfigPromptMessage.JSON_PROPERTY_ROLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsCustomEvalConfigPromptMessage {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_CONTENTS = "contents";
  private List<LLMObsCustomEvalConfigPromptContent> contents = null;

  public static final String JSON_PROPERTY_ROLE = "role";
  private String role;

  public LLMObsCustomEvalConfigPromptMessage() {}

  @JsonCreator
  public LLMObsCustomEvalConfigPromptMessage(
      @JsonProperty(required = true, value = JSON_PROPERTY_ROLE) String role) {
    this.role = role;
  }

  public LLMObsCustomEvalConfigPromptMessage content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Text content of the message.
   *
   * @return content
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public LLMObsCustomEvalConfigPromptMessage contents(
      List<LLMObsCustomEvalConfigPromptContent> contents) {
    this.contents = contents;
    for (LLMObsCustomEvalConfigPromptContent item : contents) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LLMObsCustomEvalConfigPromptMessage addContentsItem(
      LLMObsCustomEvalConfigPromptContent contentsItem) {
    if (this.contents == null) {
      this.contents = new ArrayList<>();
    }
    this.contents.add(contentsItem);
    this.unparsed |= contentsItem.unparsed;
    return this;
  }

  /**
   * Multi-part content blocks for the message.
   *
   * @return contents
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LLMObsCustomEvalConfigPromptContent> getContents() {
    return contents;
  }

  public void setContents(List<LLMObsCustomEvalConfigPromptContent> contents) {
    this.contents = contents;
  }

  public LLMObsCustomEvalConfigPromptMessage role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Role of the message author.
   *
   * @return role
   */
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
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
   * @return LLMObsCustomEvalConfigPromptMessage
   */
  @JsonAnySetter
  public LLMObsCustomEvalConfigPromptMessage putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsCustomEvalConfigPromptMessage object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsCustomEvalConfigPromptMessage llmObsCustomEvalConfigPromptMessage =
        (LLMObsCustomEvalConfigPromptMessage) o;
    return Objects.equals(this.content, llmObsCustomEvalConfigPromptMessage.content)
        && Objects.equals(this.contents, llmObsCustomEvalConfigPromptMessage.contents)
        && Objects.equals(this.role, llmObsCustomEvalConfigPromptMessage.role)
        && Objects.equals(
            this.additionalProperties, llmObsCustomEvalConfigPromptMessage.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, contents, role, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsCustomEvalConfigPromptMessage {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
