/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Sends a message to a Slack channel.</p>
 */
@JsonPropertyOrder({
  SendSlackMessageAction.JSON_PROPERTY_CHANNEL,
  SendSlackMessageAction.JSON_PROPERTY_TYPE,
  SendSlackMessageAction.JSON_PROPERTY_WORKSPACE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SendSlackMessageAction {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHANNEL = "channel";
  private String channel;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SendSlackMessageActionType type = SendSlackMessageActionType.SEND_SLACK_MESSAGE;

  public static final String JSON_PROPERTY_WORKSPACE = "workspace";
  private String workspace;

  public SendSlackMessageAction() {}

  @JsonCreator
  public SendSlackMessageAction(
            @JsonProperty(required=true, value=JSON_PROPERTY_CHANNEL)String channel,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)SendSlackMessageActionType type,
            @JsonProperty(required=true, value=JSON_PROPERTY_WORKSPACE)String workspace) {
        this.channel = channel;
        this.type = type;
        this.unparsed |= !type.isValid();
        this.workspace = workspace;
  }
  public SendSlackMessageAction channel(String channel) {
    this.channel = channel;
    return this;
  }

  /**
   * <p>The channel ID.</p>
   * @return channel
  **/
      @JsonProperty(JSON_PROPERTY_CHANNEL)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getChannel() {
        return channel;
      }
  public void setChannel(String channel) {
    this.channel = channel;
  }
  public SendSlackMessageAction type(SendSlackMessageActionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Indicates that the action is a send Slack message action.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SendSlackMessageActionType getType() {
        return type;
      }
  public void setType(SendSlackMessageActionType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }
  public SendSlackMessageAction workspace(String workspace) {
    this.workspace = workspace;
    return this;
  }

  /**
   * <p>The workspace ID.</p>
   * @return workspace
  **/
      @JsonProperty(JSON_PROPERTY_WORKSPACE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getWorkspace() {
        return workspace;
      }
  public void setWorkspace(String workspace) {
    this.workspace = workspace;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SendSlackMessageAction
   */
  @JsonAnySetter
  public SendSlackMessageAction putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this SendSlackMessageAction object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendSlackMessageAction sendSlackMessageAction = (SendSlackMessageAction) o;
    return Objects.equals(this.channel, sendSlackMessageAction.channel) && Objects.equals(this.type, sendSlackMessageAction.type) && Objects.equals(this.workspace, sendSlackMessageAction.workspace) && Objects.equals(this.additionalProperties, sendSlackMessageAction.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(channel,type,workspace, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendSlackMessageAction {\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
