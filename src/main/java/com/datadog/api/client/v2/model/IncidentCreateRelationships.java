/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** The relationships the incident will have with other resources once created. */
@JsonPropertyOrder({IncidentCreateRelationships.JSON_PROPERTY_COMMANDER_USER})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentCreateRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMMANDER_USER = "commander_user";
  private NullableRelationshipToUser commanderUser;

  public IncidentCreateRelationships() {}

  @JsonCreator
  public IncidentCreateRelationships(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMMANDER_USER)
          NullableRelationshipToUser commanderUser) {
    this.commanderUser = commanderUser;
    this.unparsed |= commanderUser.unparsed;
  }

  public IncidentCreateRelationships commanderUser(NullableRelationshipToUser commanderUser) {
    this.commanderUser = commanderUser;
    this.unparsed |= commanderUser.unparsed;
    return this;
  }

  /**
   * Relationship to user.
   *
   * @return commanderUser
   */
  @JsonProperty(JSON_PROPERTY_COMMANDER_USER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public NullableRelationshipToUser getCommanderUser() {
    return commanderUser;
  }

  public void setCommanderUser(NullableRelationshipToUser commanderUser) {
    this.commanderUser = commanderUser;
  }

  /** Return true if this IncidentCreateRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentCreateRelationships incidentCreateRelationships = (IncidentCreateRelationships) o;
    return Objects.equals(this.commanderUser, incidentCreateRelationships.commanderUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commanderUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentCreateRelationships {\n");
    sb.append("    commanderUser: ").append(toIndentedString(commanderUser)).append("\n");
    sb.append("}");
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
