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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Item in the Slack integration metadata channel array. */
@JsonPropertyOrder({
  SlackIntegrationMetadataChannelItem.JSON_PROPERTY_CHANNEL_ID,
  SlackIntegrationMetadataChannelItem.JSON_PROPERTY_CHANNEL_NAME,
  SlackIntegrationMetadataChannelItem.JSON_PROPERTY_REDIRECT_URL,
  SlackIntegrationMetadataChannelItem.JSON_PROPERTY_TEAM_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SlackIntegrationMetadataChannelItem {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHANNEL_ID = "channel_id";
  private String channelId;

  public static final String JSON_PROPERTY_CHANNEL_NAME = "channel_name";
  private String channelName;

  public static final String JSON_PROPERTY_REDIRECT_URL = "redirect_url";
  private String redirectUrl;

  public static final String JSON_PROPERTY_TEAM_ID = "team_id";
  private String teamId;

  public SlackIntegrationMetadataChannelItem() {}

  @JsonCreator
  public SlackIntegrationMetadataChannelItem(
      @JsonProperty(required = true, value = JSON_PROPERTY_CHANNEL_ID) String channelId,
      @JsonProperty(required = true, value = JSON_PROPERTY_CHANNEL_NAME) String channelName,
      @JsonProperty(required = true, value = JSON_PROPERTY_REDIRECT_URL) String redirectUrl) {
    this.channelId = channelId;
    this.channelName = channelName;
    this.redirectUrl = redirectUrl;
  }

  public SlackIntegrationMetadataChannelItem channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * Slack channel ID.
   *
   * @return channelId
   */
  @JsonProperty(JSON_PROPERTY_CHANNEL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public SlackIntegrationMetadataChannelItem channelName(String channelName) {
    this.channelName = channelName;
    return this;
  }

  /**
   * Name of the Slack channel.
   *
   * @return channelName
   */
  @JsonProperty(JSON_PROPERTY_CHANNEL_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getChannelName() {
    return channelName;
  }

  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }

  public SlackIntegrationMetadataChannelItem redirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }

  /**
   * URL redirecting to the Slack channel.
   *
   * @return redirectUrl
   */
  @JsonProperty(JSON_PROPERTY_REDIRECT_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRedirectUrl() {
    return redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  public SlackIntegrationMetadataChannelItem teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * Slack team ID.
   *
   * @return teamId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTeamId() {
    return teamId;
  }

  public void setTeamId(String teamId) {
    this.teamId = teamId;
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
   * @return SlackIntegrationMetadataChannelItem
   */
  @JsonAnySetter
  public SlackIntegrationMetadataChannelItem putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SlackIntegrationMetadataChannelItem object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlackIntegrationMetadataChannelItem slackIntegrationMetadataChannelItem =
        (SlackIntegrationMetadataChannelItem) o;
    return Objects.equals(this.channelId, slackIntegrationMetadataChannelItem.channelId)
        && Objects.equals(this.channelName, slackIntegrationMetadataChannelItem.channelName)
        && Objects.equals(this.redirectUrl, slackIntegrationMetadataChannelItem.redirectUrl)
        && Objects.equals(this.teamId, slackIntegrationMetadataChannelItem.teamId)
        && Objects.equals(
            this.additionalProperties, slackIntegrationMetadataChannelItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, channelName, redirectUrl, teamId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlackIntegrationMetadataChannelItem {\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
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
