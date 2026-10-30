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

/**
 * A message in the conversation. Content is required for user, system, developer, and tool
 * messages, but may be omitted for assistant messages. For those non-assistant roles, a plain
 * content string may be empty, but a multipart content array must contain at least one valid
 * content part. Only assistant messages may contain tool calls, and tool call entries must not be
 * null. Tool messages must include a non-empty <code>tool_call_id</code>; other message roles must
 * not include a non-empty <code>tool_call_id</code>.
 */
@JsonPropertyOrder({
  AIGuardMessage.JSON_PROPERTY_CONTENT,
  AIGuardMessage.JSON_PROPERTY_ROLE,
  AIGuardMessage.JSON_PROPERTY_TOOL_CALL_ID,
  AIGuardMessage.JSON_PROPERTY_TOOL_CALLS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AIGuardMessage {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTENT = "content";
  private AIGuardMessageContent content;

  public static final String JSON_PROPERTY_ROLE = "role";
  private AIGuardMessageRole role;

  public static final String JSON_PROPERTY_TOOL_CALL_ID = "tool_call_id";
  private String toolCallId;

  public static final String JSON_PROPERTY_TOOL_CALLS = "tool_calls";
  private List<AIGuardToolCall> toolCalls = null;

  public AIGuardMessage() {}

  @JsonCreator
  public AIGuardMessage(
      @JsonProperty(required = true, value = JSON_PROPERTY_ROLE) AIGuardMessageRole role) {
    this.role = role;
    this.unparsed |= !role.isValid();
  }

  public AIGuardMessage content(AIGuardMessageContent content) {
    this.content = content;
    this.unparsed |= content.unparsed;
    return this;
  }

  /**
   * The content of a message, either a plain string or a list of OpenAI-style content parts.
   *
   * @return content
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AIGuardMessageContent getContent() {
    return content;
  }

  public void setContent(AIGuardMessageContent content) {
    this.content = content;
    if (content != null) {
      this.unparsed |= content.unparsed;
    }
  }

  public AIGuardMessage role(AIGuardMessageRole role) {
    this.role = role;
    this.unparsed |= !role.isValid();
    return this;
  }

  /**
   * The role of the message author in the conversation.
   *
   * @return role
   */
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AIGuardMessageRole getRole() {
    return role;
  }

  public void setRole(AIGuardMessageRole role) {
    if (!role.isValid()) {
      this.unparsed = true;
    }
    this.role = role;
  }

  public AIGuardMessage toolCallId(String toolCallId) {
    this.toolCallId = toolCallId;
    return this;
  }

  /**
   * The identifier of the tool call this message responds to, present on tool result messages.
   *
   * @return toolCallId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOOL_CALL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getToolCallId() {
    return toolCallId;
  }

  public void setToolCallId(String toolCallId) {
    this.toolCallId = toolCallId;
  }

  public AIGuardMessage toolCalls(List<AIGuardToolCall> toolCalls) {
    this.toolCalls = toolCalls;
    if (toolCalls != null) {
      for (AIGuardToolCall item : toolCalls) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public AIGuardMessage addToolCallsItem(AIGuardToolCall toolCallsItem) {
    if (this.toolCalls == null) {
      this.toolCalls = new ArrayList<>();
    }
    this.toolCalls.add(toolCallsItem);
    this.unparsed |= toolCallsItem.unparsed;
    return this;
  }

  /**
   * The tool calls emitted by the assistant, present on assistant messages that call tools.
   *
   * @return toolCalls
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOOL_CALLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AIGuardToolCall> getToolCalls() {
    return toolCalls;
  }

  public void setToolCalls(List<AIGuardToolCall> toolCalls) {
    this.toolCalls = toolCalls;
    if (toolCalls != null) {
      for (AIGuardToolCall item : toolCalls) {
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
   * @return AIGuardMessage
   */
  @JsonAnySetter
  public AIGuardMessage putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AIGuardMessage object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AIGuardMessage aiGuardMessage = (AIGuardMessage) o;
    return Objects.equals(this.content, aiGuardMessage.content)
        && Objects.equals(this.role, aiGuardMessage.role)
        && Objects.equals(this.toolCallId, aiGuardMessage.toolCallId)
        && Objects.equals(this.toolCalls, aiGuardMessage.toolCalls)
        && Objects.equals(this.additionalProperties, aiGuardMessage.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, role, toolCallId, toolCalls, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AIGuardMessage {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    toolCallId: ").append(toIndentedString(toolCallId)).append("\n");
    sb.append("    toolCalls: ").append(toIndentedString(toolCalls)).append("\n");
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
