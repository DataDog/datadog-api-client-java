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

/** Sends a message to a Microsoft Teams channel. */
@JsonPropertyOrder({
  SendTeamsMessageAction.JSON_PROPERTY_CHANNEL,
  SendTeamsMessageAction.JSON_PROPERTY_TEAM,
  SendTeamsMessageAction.JSON_PROPERTY_TENANT,
  SendTeamsMessageAction.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SendTeamsMessageAction {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHANNEL = "channel";
  private String channel;

  public static final String JSON_PROPERTY_TEAM = "team";
  private String team;

  public static final String JSON_PROPERTY_TENANT = "tenant";
  private String tenant;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SendTeamsMessageActionType type = SendTeamsMessageActionType.SEND_TEAMS_MESSAGE;

  public SendTeamsMessageAction() {}

  @JsonCreator
  public SendTeamsMessageAction(
      @JsonProperty(required = true, value = JSON_PROPERTY_CHANNEL) String channel,
      @JsonProperty(required = true, value = JSON_PROPERTY_TEAM) String team,
      @JsonProperty(required = true, value = JSON_PROPERTY_TENANT) String tenant,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) SendTeamsMessageActionType type) {
    this.channel = channel;
    this.team = team;
    this.tenant = tenant;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SendTeamsMessageAction channel(String channel) {
    this.channel = channel;
    return this;
  }

  /**
   * The channel ID.
   *
   * @return channel
   */
  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }

  public SendTeamsMessageAction team(String team) {
    this.team = team;
    return this;
  }

  /**
   * The team ID.
   *
   * @return team
   */
  @JsonProperty(JSON_PROPERTY_TEAM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }

  public SendTeamsMessageAction tenant(String tenant) {
    this.tenant = tenant;
    return this;
  }

  /**
   * The tenant ID.
   *
   * @return tenant
   */
  @JsonProperty(JSON_PROPERTY_TENANT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTenant() {
    return tenant;
  }

  public void setTenant(String tenant) {
    this.tenant = tenant;
  }

  public SendTeamsMessageAction type(SendTeamsMessageActionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Indicates that the action is a send Microsoft Teams message action.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SendTeamsMessageActionType getType() {
    return type;
  }

  public void setType(SendTeamsMessageActionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return SendTeamsMessageAction
   */
  @JsonAnySetter
  public SendTeamsMessageAction putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SendTeamsMessageAction object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendTeamsMessageAction sendTeamsMessageAction = (SendTeamsMessageAction) o;
    return Objects.equals(this.channel, sendTeamsMessageAction.channel)
        && Objects.equals(this.team, sendTeamsMessageAction.team)
        && Objects.equals(this.tenant, sendTeamsMessageAction.tenant)
        && Objects.equals(this.type, sendTeamsMessageAction.type)
        && Objects.equals(this.additionalProperties, sendTeamsMessageAction.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, team, tenant, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendTeamsMessageAction {\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
