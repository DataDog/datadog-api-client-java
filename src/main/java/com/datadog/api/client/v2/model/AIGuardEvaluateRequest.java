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

/** The evaluation request payload containing conversation messages and optional metadata. */
@JsonPropertyOrder({
  AIGuardEvaluateRequest.JSON_PROPERTY_MESSAGES,
  AIGuardEvaluateRequest.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AIGuardEvaluateRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MESSAGES = "messages";
  private List<AIGuardMessage> messages = new ArrayList<>();

  public static final String JSON_PROPERTY_META = "meta";
  private AIGuardMeta meta;

  public AIGuardEvaluateRequest() {}

  @JsonCreator
  public AIGuardEvaluateRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_MESSAGES)
          List<AIGuardMessage> messages) {
    this.messages = messages;
  }

  public AIGuardEvaluateRequest messages(List<AIGuardMessage> messages) {
    this.messages = messages;
    for (AIGuardMessage item : messages) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AIGuardEvaluateRequest addMessagesItem(AIGuardMessage messagesItem) {
    this.messages.add(messagesItem);
    this.unparsed |= messagesItem.unparsed;
    return this;
  }

  /**
   * The list of conversation messages to evaluate. Must contain at least one message.
   *
   * @return messages
   */
  @JsonProperty(JSON_PROPERTY_MESSAGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<AIGuardMessage> getMessages() {
    return messages;
  }

  public void setMessages(List<AIGuardMessage> messages) {
    this.messages = messages;
  }

  public AIGuardEvaluateRequest meta(AIGuardMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Optional metadata providing context about the originating service and request.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AIGuardMeta getMeta() {
    return meta;
  }

  public void setMeta(AIGuardMeta meta) {
    this.meta = meta;
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
   * @return AIGuardEvaluateRequest
   */
  @JsonAnySetter
  public AIGuardEvaluateRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AIGuardEvaluateRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AIGuardEvaluateRequest aiGuardEvaluateRequest = (AIGuardEvaluateRequest) o;
    return Objects.equals(this.messages, aiGuardEvaluateRequest.messages)
        && Objects.equals(this.meta, aiGuardEvaluateRequest.meta)
        && Objects.equals(this.additionalProperties, aiGuardEvaluateRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages, meta, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AIGuardEvaluateRequest {\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
