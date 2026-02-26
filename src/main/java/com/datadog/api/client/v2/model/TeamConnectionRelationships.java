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

/** Relationships of the team connection. */
@JsonPropertyOrder({
  TeamConnectionRelationships.JSON_PROPERTY_CONNECTED_TEAM,
  TeamConnectionRelationships.JSON_PROPERTY_TEAM
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamConnectionRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONNECTED_TEAM = "connected_team";
  private ConnectedTeamRef connectedTeam;

  public static final String JSON_PROPERTY_TEAM = "team";
  private TeamRef team;

  public TeamConnectionRelationships connectedTeam(ConnectedTeamRef connectedTeam) {
    this.connectedTeam = connectedTeam;
    this.unparsed |= connectedTeam.unparsed;
    return this;
  }

  /**
   * Reference to a team from an external system.
   *
   * @return connectedTeam
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECTED_TEAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ConnectedTeamRef getConnectedTeam() {
    return connectedTeam;
  }

  public void setConnectedTeam(ConnectedTeamRef connectedTeam) {
    this.connectedTeam = connectedTeam;
  }

  public TeamConnectionRelationships team(TeamRef team) {
    this.team = team;
    this.unparsed |= team.unparsed;
    return this;
  }

  /**
   * Reference to a Datadog team.
   *
   * @return team
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TeamRef getTeam() {
    return team;
  }

  public void setTeam(TeamRef team) {
    this.team = team;
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
   * @return TeamConnectionRelationships
   */
  @JsonAnySetter
  public TeamConnectionRelationships putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TeamConnectionRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamConnectionRelationships teamConnectionRelationships = (TeamConnectionRelationships) o;
    return Objects.equals(this.connectedTeam, teamConnectionRelationships.connectedTeam)
        && Objects.equals(this.team, teamConnectionRelationships.team)
        && Objects.equals(
            this.additionalProperties, teamConnectionRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectedTeam, team, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamConnectionRelationships {\n");
    sb.append("    connectedTeam: ").append(toIndentedString(connectedTeam)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
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
