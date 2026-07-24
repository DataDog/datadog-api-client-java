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
import org.openapitools.jackson.nullable.JsonNullable;

/** The postmortem's relationships. */
@JsonPropertyOrder({
  IncidentPostmortemRelationships.JSON_PROPERTY_INCIDENT,
  IncidentPostmortemRelationships.JSON_PROPERTY_LAST_MODIFIED_BY_USER,
  IncidentPostmortemRelationships.JSON_PROPERTY_POSTMORTEM_OWNER_RESPONDER,
  IncidentPostmortemRelationships.JSON_PROPERTY_POSTMORTEM_OWNER_USER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentPostmortemRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INCIDENT = "incident";
  private RelationshipToIncident incident;

  public static final String JSON_PROPERTY_LAST_MODIFIED_BY_USER = "last_modified_by_user";
  private RelationshipToUser lastModifiedByUser;

  public static final String JSON_PROPERTY_POSTMORTEM_OWNER_RESPONDER =
      "postmortem_owner_responder";
  private JsonNullable<RelationshipToIncidentResponder> postmortemOwnerResponder =
      JsonNullable.<RelationshipToIncidentResponder>undefined();

  public static final String JSON_PROPERTY_POSTMORTEM_OWNER_USER = "postmortem_owner_user";
  private JsonNullable<NullableRelationshipToUser> postmortemOwnerUser =
      JsonNullable.<NullableRelationshipToUser>undefined();

  public IncidentPostmortemRelationships incident(RelationshipToIncident incident) {
    this.incident = incident;
    this.unparsed |= incident.unparsed;
    return this;
  }

  /**
   * Relationship to incident.
   *
   * @return incident
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCIDENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToIncident getIncident() {
    return incident;
  }

  public void setIncident(RelationshipToIncident incident) {
    this.incident = incident;
  }

  public IncidentPostmortemRelationships lastModifiedByUser(RelationshipToUser lastModifiedByUser) {
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

  public IncidentPostmortemRelationships postmortemOwnerResponder(
      RelationshipToIncidentResponder postmortemOwnerResponder) {
    this.postmortemOwnerResponder =
        JsonNullable.<RelationshipToIncidentResponder>of(postmortemOwnerResponder);
    return this;
  }

  /**
   * A relationship reference for a single incident responder.
   *
   * @return postmortemOwnerResponder
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public RelationshipToIncidentResponder getPostmortemOwnerResponder() {
    return postmortemOwnerResponder.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_POSTMORTEM_OWNER_RESPONDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<RelationshipToIncidentResponder> getPostmortemOwnerResponder_JsonNullable() {
    return postmortemOwnerResponder;
  }

  @JsonProperty(JSON_PROPERTY_POSTMORTEM_OWNER_RESPONDER)
  public void setPostmortemOwnerResponder_JsonNullable(
      JsonNullable<RelationshipToIncidentResponder> postmortemOwnerResponder) {
    this.postmortemOwnerResponder = postmortemOwnerResponder;
  }

  public void setPostmortemOwnerResponder(
      RelationshipToIncidentResponder postmortemOwnerResponder) {
    this.postmortemOwnerResponder =
        JsonNullable.<RelationshipToIncidentResponder>of(postmortemOwnerResponder);
  }

  public IncidentPostmortemRelationships postmortemOwnerUser(
      NullableRelationshipToUser postmortemOwnerUser) {
    this.postmortemOwnerUser = JsonNullable.<NullableRelationshipToUser>of(postmortemOwnerUser);
    return this;
  }

  /**
   * Relationship to user.
   *
   * @return postmortemOwnerUser
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public NullableRelationshipToUser getPostmortemOwnerUser() {
    return postmortemOwnerUser.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_POSTMORTEM_OWNER_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<NullableRelationshipToUser> getPostmortemOwnerUser_JsonNullable() {
    return postmortemOwnerUser;
  }

  @JsonProperty(JSON_PROPERTY_POSTMORTEM_OWNER_USER)
  public void setPostmortemOwnerUser_JsonNullable(
      JsonNullable<NullableRelationshipToUser> postmortemOwnerUser) {
    this.postmortemOwnerUser = postmortemOwnerUser;
  }

  public void setPostmortemOwnerUser(NullableRelationshipToUser postmortemOwnerUser) {
    this.postmortemOwnerUser = JsonNullable.<NullableRelationshipToUser>of(postmortemOwnerUser);
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
   * @return IncidentPostmortemRelationships
   */
  @JsonAnySetter
  public IncidentPostmortemRelationships putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentPostmortemRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentPostmortemRelationships incidentPostmortemRelationships =
        (IncidentPostmortemRelationships) o;
    return Objects.equals(this.incident, incidentPostmortemRelationships.incident)
        && Objects.equals(
            this.lastModifiedByUser, incidentPostmortemRelationships.lastModifiedByUser)
        && Objects.equals(
            this.postmortemOwnerResponder, incidentPostmortemRelationships.postmortemOwnerResponder)
        && Objects.equals(
            this.postmortemOwnerUser, incidentPostmortemRelationships.postmortemOwnerUser)
        && Objects.equals(
            this.additionalProperties, incidentPostmortemRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        incident,
        lastModifiedByUser,
        postmortemOwnerResponder,
        postmortemOwnerUser,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentPostmortemRelationships {\n");
    sb.append("    incident: ").append(toIndentedString(incident)).append("\n");
    sb.append("    lastModifiedByUser: ").append(toIndentedString(lastModifiedByUser)).append("\n");
    sb.append("    postmortemOwnerResponder: ")
        .append(toIndentedString(postmortemOwnerResponder))
        .append("\n");
    sb.append("    postmortemOwnerUser: ")
        .append(toIndentedString(postmortemOwnerUser))
        .append("\n");
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
