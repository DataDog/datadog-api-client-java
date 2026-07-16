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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** A single message in an LLM inference conversation. */
@JsonPropertyOrder({
  LLMObsInferenceMessage.JSON_PROPERTY_CONTENT,
  LLMObsInferenceMessage.JSON_PROPERTY_CONTENTS,
  LLMObsInferenceMessage.JSON_PROPERTY_ID,
  LLMObsInferenceMessage.JSON_PROPERTY_ROLE,
  LLMObsInferenceMessage.JSON_PROPERTY_TOOL_CALLS,
  LLMObsInferenceMessage.JSON_PROPERTY_TOOL_RESULTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsInferenceMessage {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_CONTENTS = "contents";
  private List<LLMObsInferenceContent> contents = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ROLE = "role";
  private String role;

  public static final String JSON_PROPERTY_TOOL_CALLS = "tool_calls";
  private List<LLMObsInferenceToolCall> toolCalls = null;

  public static final String JSON_PROPERTY_TOOL_RESULTS = "tool_results";
  private List<LLMObsInferenceToolResult> toolResults = null;

  public LLMObsInferenceMessage content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Plain text content of the message.
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

  public LLMObsInferenceMessage contents(List<LLMObsInferenceContent> contents) {
    this.contents = contents;
    if (contents != null) {
      for (LLMObsInferenceContent item : contents) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public LLMObsInferenceMessage addContentsItem(LLMObsInferenceContent contentsItem) {
    if (this.contents == null) {
      this.contents = new ArrayList<>();
    }
    this.contents.add(contentsItem);
    this.unparsed |= contentsItem.unparsed;
    return this;
  }

  /**
   * List of structured content blocks in a message.
   *
   * @return contents
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LLMObsInferenceContent> getContents() {
    return contents;
  }

  public void setContents(List<LLMObsInferenceContent> contents) {
    this.contents = contents;
    if (contents != null) {
      for (LLMObsInferenceContent item : contents) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public LLMObsInferenceMessage id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the message.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LLMObsInferenceMessage role(String role) {
    this.role = role;
    return this;
  }

  /**
   * The role of the message author.
   *
   * @return role
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public LLMObsInferenceMessage toolCalls(List<LLMObsInferenceToolCall> toolCalls) {
    this.toolCalls = toolCalls;
    if (toolCalls != null) {
      for (LLMObsInferenceToolCall item : toolCalls) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public LLMObsInferenceMessage addToolCallsItem(LLMObsInferenceToolCall toolCallsItem) {
    if (this.toolCalls == null) {
      this.toolCalls = new ArrayList<>();
    }
    this.toolCalls.add(toolCallsItem);
    this.unparsed |= toolCallsItem.unparsed;
    return this;
  }

  /**
   * List of tool calls in a message.
   *
   * @return toolCalls
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOOL_CALLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LLMObsInferenceToolCall> getToolCalls() {
    return toolCalls;
  }

  public void setToolCalls(List<LLMObsInferenceToolCall> toolCalls) {
    this.toolCalls = toolCalls;
    if (toolCalls != null) {
      for (LLMObsInferenceToolCall item : toolCalls) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public LLMObsInferenceMessage toolResults(List<LLMObsInferenceToolResult> toolResults) {
    this.toolResults = toolResults;
    if (toolResults != null) {
      for (LLMObsInferenceToolResult item : toolResults) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public LLMObsInferenceMessage addToolResultsItem(LLMObsInferenceToolResult toolResultsItem) {
    if (this.toolResults == null) {
      this.toolResults = new ArrayList<>();
    }
    this.toolResults.add(toolResultsItem);
    this.unparsed |= toolResultsItem.unparsed;
    return this;
  }

  /**
   * List of tool results in a message.
   *
   * @return toolResults
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOOL_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LLMObsInferenceToolResult> getToolResults() {
    return toolResults;
  }

  public void setToolResults(List<LLMObsInferenceToolResult> toolResults) {
    this.toolResults = toolResults;
    if (toolResults != null) {
      for (LLMObsInferenceToolResult item : toolResults) {
        this.unparsed |= item.unparsed;
      }
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
   * @return LLMObsInferenceMessage
   */
  @JsonAnySetter
  public LLMObsInferenceMessage putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsInferenceMessage object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsInferenceMessage llmObsInferenceMessage = (LLMObsInferenceMessage) o;
    return Objects.equals(this.content, llmObsInferenceMessage.content)
        && Objects.equals(this.contents, llmObsInferenceMessage.contents)
        && Objects.equals(this.id, llmObsInferenceMessage.id)
        && Objects.equals(this.role, llmObsInferenceMessage.role)
        && Objects.equals(this.toolCalls, llmObsInferenceMessage.toolCalls)
        && Objects.equals(this.toolResults, llmObsInferenceMessage.toolResults)
        && Objects.equals(this.additionalProperties, llmObsInferenceMessage.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, contents, id, role, toolCalls, toolResults, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsInferenceMessage {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    toolCalls: ").append(toIndentedString(toolCalls)).append("\n");
    sb.append("    toolResults: ").append(toIndentedString(toolResults)).append("\n");
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
