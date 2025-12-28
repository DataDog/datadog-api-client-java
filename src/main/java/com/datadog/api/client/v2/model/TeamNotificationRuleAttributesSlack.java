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

/** Slack notification settings for the team */
@JsonPropertyOrder({
  TeamNotificationRuleAttributesSlack.JSON_PROPERTY_CHANNEL,
  TeamNotificationRuleAttributesSlack.JSON_PROPERTY_WORKSPACE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamNotificationRuleAttributesSlack {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHANNEL = "channel";
  private String channel;

  public static final String JSON_PROPERTY_WORKSPACE = "workspace";
  private String workspace;

  public TeamNotificationRuleAttributesSlack channel(String channel) {
    this.channel = channel;
    return this;
  }

  /**
   * Channel for slack notification
   *
   * @return channel
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }

  public TeamNotificationRuleAttributesSlack workspace(String workspace) {
    this.workspace = workspace;
    return this;
  }

  /**
   * Workspace for slack notification
   *
   * @return workspace
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORKSPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getWorkspace() {
    return workspace;
  }

  public void setWorkspace(String workspace) {
    this.workspace = workspace;
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
   * @return TeamNotificationRuleAttributesSlack
   */
  @JsonAnySetter
  public TeamNotificationRuleAttributesSlack putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TeamNotificationRuleAttributesSlack object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamNotificationRuleAttributesSlack teamNotificationRuleAttributesSlack =
        (TeamNotificationRuleAttributesSlack) o;
    return Objects.equals(this.channel, teamNotificationRuleAttributesSlack.channel)
        && Objects.equals(this.workspace, teamNotificationRuleAttributesSlack.workspace)
        && Objects.equals(
            this.additionalProperties, teamNotificationRuleAttributesSlack.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, workspace, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamNotificationRuleAttributesSlack {\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
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
