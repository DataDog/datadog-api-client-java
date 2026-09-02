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

/** An individual team's ownership entry within a teams ownership rule. */
@JsonPropertyOrder({
  TeamsOwnershipRuleTeamMapping.JSON_PROPERTY_MAPPING_ID,
  TeamsOwnershipRuleTeamMapping.JSON_PROPERTY_TEAM_HANDLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamsOwnershipRuleTeamMapping {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MAPPING_ID = "mapping_id";
  private String mappingId;

  public static final String JSON_PROPERTY_TEAM_HANDLE = "team_handle";
  private String teamHandle;

  public TeamsOwnershipRuleTeamMapping() {}

  @JsonCreator
  public TeamsOwnershipRuleTeamMapping(
      @JsonProperty(required = true, value = JSON_PROPERTY_MAPPING_ID) String mappingId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TEAM_HANDLE) String teamHandle) {
    this.mappingId = mappingId;
    this.teamHandle = teamHandle;
  }

  public TeamsOwnershipRuleTeamMapping mappingId(String mappingId) {
    this.mappingId = mappingId;
    return this;
  }

  /**
   * The ID of the underlying mapping, used to delete this team's ownership individually.
   *
   * @return mappingId
   */
  @JsonProperty(JSON_PROPERTY_MAPPING_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMappingId() {
    return mappingId;
  }

  public void setMappingId(String mappingId) {
    this.mappingId = mappingId;
  }

  public TeamsOwnershipRuleTeamMapping teamHandle(String teamHandle) {
    this.teamHandle = teamHandle;
    return this;
  }

  /**
   * The handle of the owning team.
   *
   * @return teamHandle
   */
  @JsonProperty(JSON_PROPERTY_TEAM_HANDLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTeamHandle() {
    return teamHandle;
  }

  public void setTeamHandle(String teamHandle) {
    this.teamHandle = teamHandle;
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
   * @return TeamsOwnershipRuleTeamMapping
   */
  @JsonAnySetter
  public TeamsOwnershipRuleTeamMapping putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TeamsOwnershipRuleTeamMapping object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamsOwnershipRuleTeamMapping teamsOwnershipRuleTeamMapping = (TeamsOwnershipRuleTeamMapping) o;
    return Objects.equals(this.mappingId, teamsOwnershipRuleTeamMapping.mappingId)
        && Objects.equals(this.teamHandle, teamsOwnershipRuleTeamMapping.teamHandle)
        && Objects.equals(
            this.additionalProperties, teamsOwnershipRuleTeamMapping.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mappingId, teamHandle, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamsOwnershipRuleTeamMapping {\n");
    sb.append("    mappingId: ").append(toIndentedString(mappingId)).append("\n");
    sb.append("    teamHandle: ").append(toIndentedString(teamHandle)).append("\n");
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
