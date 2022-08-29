/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** The incident's relationships from a response. */
@JsonPropertyOrder({
  IncidentResponseRelationships.JSON_PROPERTY_COMMANDER_USER,
  IncidentResponseRelationships.JSON_PROPERTY_CREATED_BY_USER,
  IncidentResponseRelationships.JSON_PROPERTY_INTEGRATIONS,
  IncidentResponseRelationships.JSON_PROPERTY_LAST_MODIFIED_BY_USER,
  IncidentResponseRelationships.JSON_PROPERTY_POSTMORTEM
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentResponseRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMMANDER_USER = "commander_user";
  private NullableRelationshipToUser commanderUser;

  public static final String JSON_PROPERTY_CREATED_BY_USER = "created_by_user";
  private RelationshipToUser createdByUser;

  public static final String JSON_PROPERTY_INTEGRATIONS = "integrations";
  private RelationshipToIncidentIntegrationMetadatas integrations;

  public static final String JSON_PROPERTY_LAST_MODIFIED_BY_USER = "last_modified_by_user";
  private RelationshipToUser lastModifiedByUser;

  public static final String JSON_PROPERTY_POSTMORTEM = "postmortem";
  private RelationshipToIncidentPostmortem postmortem;

  public IncidentResponseRelationships commanderUser(NullableRelationshipToUser commanderUser) {
    this.commanderUser = commanderUser;
    this.unparsed |= commanderUser.unparsed;
    return this;
  }

  /**
   * Relationship to user.
   *
   * @return commanderUser
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMANDER_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NullableRelationshipToUser getCommanderUser() {
    return commanderUser;
  }

  public void setCommanderUser(NullableRelationshipToUser commanderUser) {
    this.commanderUser = commanderUser;
  }

  public IncidentResponseRelationships createdByUser(RelationshipToUser createdByUser) {
    this.createdByUser = createdByUser;
    this.unparsed |= createdByUser.unparsed;
    return this;
  }

  /**
   * Relationship to user.
   *
   * @return createdByUser
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToUser getCreatedByUser() {
    return createdByUser;
  }

  public void setCreatedByUser(RelationshipToUser createdByUser) {
    this.createdByUser = createdByUser;
  }

  public IncidentResponseRelationships integrations(
      RelationshipToIncidentIntegrationMetadatas integrations) {
    this.integrations = integrations;
    this.unparsed |= integrations.unparsed;
    return this;
  }

  /**
   * A relationship reference for multiple integration metadata objects.
   *
   * @return integrations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToIncidentIntegrationMetadatas getIntegrations() {
    return integrations;
  }

  public void setIntegrations(RelationshipToIncidentIntegrationMetadatas integrations) {
    this.integrations = integrations;
  }

  public IncidentResponseRelationships lastModifiedByUser(RelationshipToUser lastModifiedByUser) {
    this.lastModifiedByUser = lastModifiedByUser;
    this.unparsed |= lastModifiedByUser.unparsed;
    return this;
  }

  /**
   * Relationship to user.
   *
   * @return lastModifiedByUser
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_BY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToUser getLastModifiedByUser() {
    return lastModifiedByUser;
  }

  public void setLastModifiedByUser(RelationshipToUser lastModifiedByUser) {
    this.lastModifiedByUser = lastModifiedByUser;
  }

  public IncidentResponseRelationships postmortem(RelationshipToIncidentPostmortem postmortem) {
    this.postmortem = postmortem;
    this.unparsed |= postmortem.unparsed;
    return this;
  }

  /**
   * A relationship reference for postmortems.
   *
   * @return postmortem
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSTMORTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToIncidentPostmortem getPostmortem() {
    return postmortem;
  }

  public void setPostmortem(RelationshipToIncidentPostmortem postmortem) {
    this.postmortem = postmortem;
  }

  /** Return true if this IncidentResponseRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentResponseRelationships incidentResponseRelationships = (IncidentResponseRelationships) o;
    return Objects.equals(this.commanderUser, incidentResponseRelationships.commanderUser)
        && Objects.equals(this.createdByUser, incidentResponseRelationships.createdByUser)
        && Objects.equals(this.integrations, incidentResponseRelationships.integrations)
        && Objects.equals(this.lastModifiedByUser, incidentResponseRelationships.lastModifiedByUser)
        && Objects.equals(this.postmortem, incidentResponseRelationships.postmortem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commanderUser, createdByUser, integrations, lastModifiedByUser, postmortem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentResponseRelationships {\n");
    sb.append("    commanderUser: ").append(toIndentedString(commanderUser)).append("\n");
    sb.append("    createdByUser: ").append(toIndentedString(createdByUser)).append("\n");
    sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
    sb.append("    lastModifiedByUser: ").append(toIndentedString(lastModifiedByUser)).append("\n");
    sb.append("    postmortem: ").append(toIndentedString(postmortem)).append("\n");
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
