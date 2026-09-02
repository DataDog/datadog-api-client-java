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

/** Configuration for a Slack emoji reaction trigger. */
@JsonPropertyOrder({
  SlackReactionConfig.JSON_PROPERTY_REACTION_EMOJI,
  SlackReactionConfig.JSON_PROPERTY_TEAM_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SlackReactionConfig {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_REACTION_EMOJI = "reactionEmoji";
  private String reactionEmoji;

  public static final String JSON_PROPERTY_TEAM_ID = "teamId";
  private String teamId;

  public SlackReactionConfig() {}

  @JsonCreator
  public SlackReactionConfig(
      @JsonProperty(required = true, value = JSON_PROPERTY_REACTION_EMOJI) String reactionEmoji,
      @JsonProperty(required = true, value = JSON_PROPERTY_TEAM_ID) String teamId) {
    this.reactionEmoji = reactionEmoji;
    this.teamId = teamId;
  }

  public SlackReactionConfig reactionEmoji(String reactionEmoji) {
    this.reactionEmoji = reactionEmoji;
    return this;
  }

  /**
   * The Slack emoji reaction name.
   *
   * @return reactionEmoji
   */
  @JsonProperty(JSON_PROPERTY_REACTION_EMOJI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getReactionEmoji() {
    return reactionEmoji;
  }

  public void setReactionEmoji(String reactionEmoji) {
    this.reactionEmoji = reactionEmoji;
  }

  public SlackReactionConfig teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * The Slack workspace ID.
   *
   * @return teamId
   */
  @JsonProperty(JSON_PROPERTY_TEAM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * @return SlackReactionConfig
   */
  @JsonAnySetter
  public SlackReactionConfig putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SlackReactionConfig object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlackReactionConfig slackReactionConfig = (SlackReactionConfig) o;
    return Objects.equals(this.reactionEmoji, slackReactionConfig.reactionEmoji)
        && Objects.equals(this.teamId, slackReactionConfig.teamId)
        && Objects.equals(this.additionalProperties, slackReactionConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reactionEmoji, teamId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlackReactionConfig {\n");
    sb.append("    reactionEmoji: ").append(toIndentedString(reactionEmoji)).append("\n");
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
