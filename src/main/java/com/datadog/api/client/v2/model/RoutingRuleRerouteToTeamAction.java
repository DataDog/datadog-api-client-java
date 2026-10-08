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
import java.util.UUID;

/**
 * Reroutes the page to another team, which then evaluates it against its own routing rules. Each
 * routing rule can include this action only once. It can be combined only with <code>
 * send_slack_message</code> and <code>send_teams_message</code> actions. It can't be used with
 * <code>escalation_policy</code> or <code>workflow</code> actions, or when the routing rule sets
 * <code>policy_id</code>.
 */
@JsonPropertyOrder({
  RoutingRuleRerouteToTeamAction.JSON_PROPERTY_DESTINATION_TEAM_ID,
  RoutingRuleRerouteToTeamAction.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RoutingRuleRerouteToTeamAction {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESTINATION_TEAM_ID = "destination_team_id";
  private UUID destinationTeamId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private RoutingRuleRerouteToTeamActionType type =
      RoutingRuleRerouteToTeamActionType.REROUTE_TO_TEAM;

  public RoutingRuleRerouteToTeamAction() {}

  @JsonCreator
  public RoutingRuleRerouteToTeamAction(
      @JsonProperty(required = true, value = JSON_PROPERTY_DESTINATION_TEAM_ID)
          UUID destinationTeamId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          RoutingRuleRerouteToTeamActionType type) {
    this.destinationTeamId = destinationTeamId;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public RoutingRuleRerouteToTeamAction destinationTeamId(UUID destinationTeamId) {
    this.destinationTeamId = destinationTeamId;
    return this;
  }

  /**
   * The ID of the team to reroute the page to.
   *
   * @return destinationTeamId
   */
  @JsonProperty(JSON_PROPERTY_DESTINATION_TEAM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getDestinationTeamId() {
    return destinationTeamId;
  }

  public void setDestinationTeamId(UUID destinationTeamId) {
    this.destinationTeamId = destinationTeamId;
  }

  public RoutingRuleRerouteToTeamAction type(RoutingRuleRerouteToTeamActionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Indicates that the action reroutes the page to another team's routing rules.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RoutingRuleRerouteToTeamActionType getType() {
    return type;
  }

  public void setType(RoutingRuleRerouteToTeamActionType type) {
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
   * @return RoutingRuleRerouteToTeamAction
   */
  @JsonAnySetter
  public RoutingRuleRerouteToTeamAction putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RoutingRuleRerouteToTeamAction object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoutingRuleRerouteToTeamAction routingRuleRerouteToTeamAction =
        (RoutingRuleRerouteToTeamAction) o;
    return Objects.equals(this.destinationTeamId, routingRuleRerouteToTeamAction.destinationTeamId)
        && Objects.equals(this.type, routingRuleRerouteToTeamAction.type)
        && Objects.equals(
            this.additionalProperties, routingRuleRerouteToTeamAction.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationTeamId, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutingRuleRerouteToTeamAction {\n");
    sb.append("    destinationTeamId: ").append(toIndentedString(destinationTeamId)).append("\n");
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
