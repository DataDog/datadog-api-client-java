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

/** Slack routing options for report delivery. */
@JsonPropertyOrder({
  SlackRoutingOptions.JSON_PROPERTY_CHANNEL_ID,
  SlackRoutingOptions.JSON_PROPERTY_CHANNEL_NAME,
  SlackRoutingOptions.JSON_PROPERTY_WORKSPACE_ID,
  SlackRoutingOptions.JSON_PROPERTY_WORKSPACE_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SlackRoutingOptions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHANNEL_ID = "channel_id";
  private String channelId;

  public static final String JSON_PROPERTY_CHANNEL_NAME = "channel_name";
  private String channelName;

  public static final String JSON_PROPERTY_WORKSPACE_ID = "workspace_id";
  private String workspaceId;

  public static final String JSON_PROPERTY_WORKSPACE_NAME = "workspace_name";
  private String workspaceName;

  public SlackRoutingOptions channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * Slack channel ID.
   *
   * @return channelId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANNEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public SlackRoutingOptions channelName(String channelName) {
    this.channelName = channelName;
    return this;
  }

  /**
   * Slack channel name.
   *
   * @return channelName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANNEL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getChannelName() {
    return channelName;
  }

  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }

  public SlackRoutingOptions workspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  /**
   * Slack workspace ID.
   *
   * @return workspaceId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORKSPACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getWorkspaceId() {
    return workspaceId;
  }

  public void setWorkspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
  }

  public SlackRoutingOptions workspaceName(String workspaceName) {
    this.workspaceName = workspaceName;
    return this;
  }

  /**
   * Slack workspace name.
   *
   * @return workspaceName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORKSPACE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getWorkspaceName() {
    return workspaceName;
  }

  public void setWorkspaceName(String workspaceName) {
    this.workspaceName = workspaceName;
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
   * @return SlackRoutingOptions
   */
  @JsonAnySetter
  public SlackRoutingOptions putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SlackRoutingOptions object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlackRoutingOptions slackRoutingOptions = (SlackRoutingOptions) o;
    return Objects.equals(this.channelId, slackRoutingOptions.channelId)
        && Objects.equals(this.channelName, slackRoutingOptions.channelName)
        && Objects.equals(this.workspaceId, slackRoutingOptions.workspaceId)
        && Objects.equals(this.workspaceName, slackRoutingOptions.workspaceName)
        && Objects.equals(this.additionalProperties, slackRoutingOptions.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, channelName, workspaceId, workspaceName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlackRoutingOptions {\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
    sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
    sb.append("    workspaceName: ").append(toIndentedString(workspaceName)).append("\n");
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
