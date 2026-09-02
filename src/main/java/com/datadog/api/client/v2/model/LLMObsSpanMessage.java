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

/** A single message in a span input or output. */
@JsonPropertyOrder({
  LLMObsSpanMessage.JSON_PROPERTY_CONTENT,
  LLMObsSpanMessage.JSON_PROPERTY_ID,
  LLMObsSpanMessage.JSON_PROPERTY_ROLE,
  LLMObsSpanMessage.JSON_PROPERTY_TOOL_CALLS,
  LLMObsSpanMessage.JSON_PROPERTY_TOOL_RESULTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsSpanMessage {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ROLE = "role";
  private String role;

  public static final String JSON_PROPERTY_TOOL_CALLS = "tool_calls";
  private List<LLMObsSpanToolCall> toolCalls = null;

  public static final String JSON_PROPERTY_TOOL_RESULTS = "tool_results";
  private List<LLMObsSpanToolResult> toolResults = null;

  public LLMObsSpanMessage content(String content) {
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

  public LLMObsSpanMessage id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the message.
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

  public LLMObsSpanMessage role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Role of the message sender (e.g., user, assistant, system).
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

  public LLMObsSpanMessage toolCalls(List<LLMObsSpanToolCall> toolCalls) {
    this.toolCalls = toolCalls;
    if (toolCalls != null) {
      for (LLMObsSpanToolCall item : toolCalls) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public LLMObsSpanMessage addToolCallsItem(LLMObsSpanToolCall toolCallsItem) {
    if (this.toolCalls == null) {
      this.toolCalls = new ArrayList<>();
    }
    this.toolCalls.add(toolCallsItem);
    this.unparsed |= toolCallsItem.unparsed;
    return this;
  }

  /**
   * Tool calls made in this message.
   *
   * @return toolCalls
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOOL_CALLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LLMObsSpanToolCall> getToolCalls() {
    return toolCalls;
  }

  public void setToolCalls(List<LLMObsSpanToolCall> toolCalls) {
    this.toolCalls = toolCalls;
    if (toolCalls != null) {
      for (LLMObsSpanToolCall item : toolCalls) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public LLMObsSpanMessage toolResults(List<LLMObsSpanToolResult> toolResults) {
    this.toolResults = toolResults;
    if (toolResults != null) {
      for (LLMObsSpanToolResult item : toolResults) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public LLMObsSpanMessage addToolResultsItem(LLMObsSpanToolResult toolResultsItem) {
    if (this.toolResults == null) {
      this.toolResults = new ArrayList<>();
    }
    this.toolResults.add(toolResultsItem);
    this.unparsed |= toolResultsItem.unparsed;
    return this;
  }

  /**
   * Tool results returned in this message.
   *
   * @return toolResults
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOOL_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LLMObsSpanToolResult> getToolResults() {
    return toolResults;
  }

  public void setToolResults(List<LLMObsSpanToolResult> toolResults) {
    this.toolResults = toolResults;
    if (toolResults != null) {
      for (LLMObsSpanToolResult item : toolResults) {
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
   * @return LLMObsSpanMessage
   */
  @JsonAnySetter
  public LLMObsSpanMessage putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsSpanMessage object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsSpanMessage llmObsSpanMessage = (LLMObsSpanMessage) o;
    return Objects.equals(this.content, llmObsSpanMessage.content)
        && Objects.equals(this.id, llmObsSpanMessage.id)
        && Objects.equals(this.role, llmObsSpanMessage.role)
        && Objects.equals(this.toolCalls, llmObsSpanMessage.toolCalls)
        && Objects.equals(this.toolResults, llmObsSpanMessage.toolResults)
        && Objects.equals(this.additionalProperties, llmObsSpanMessage.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, id, role, toolCalls, toolResults, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsSpanMessage {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
