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

/** Relationships of a role assignment. */
@JsonPropertyOrder({
  IncidentRoleAssignmentRelationshipsResponse.JSON_PROPERTY_CREATED_BY_USER,
  IncidentRoleAssignmentRelationshipsResponse.JSON_PROPERTY_LAST_MODIFIED_BY_USER,
  IncidentRoleAssignmentRelationshipsResponse.JSON_PROPERTY_RESERVED_ROLE,
  IncidentRoleAssignmentRelationshipsResponse.JSON_PROPERTY_RESPONDER,
  IncidentRoleAssignmentRelationshipsResponse.JSON_PROPERTY_USER_DEFINED_ROLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentRoleAssignmentRelationshipsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_BY_USER = "created_by_user";
  private IncidentRoleAssignmentResponderRelationship createdByUser;

  public static final String JSON_PROPERTY_LAST_MODIFIED_BY_USER = "last_modified_by_user";
  private IncidentRoleAssignmentResponderRelationship lastModifiedByUser;

  public static final String JSON_PROPERTY_RESERVED_ROLE = "reserved_role";
  private IncidentRoleAssignmentRoleRelationship reservedRole;

  public static final String JSON_PROPERTY_RESPONDER = "responder";
  private IncidentRoleAssignmentResponderRelationship responder;

  public static final String JSON_PROPERTY_USER_DEFINED_ROLE = "user_defined_role";
  private IncidentRoleAssignmentRoleRelationship userDefinedRole;

  public IncidentRoleAssignmentRelationshipsResponse() {}

  @JsonCreator
  public IncidentRoleAssignmentRelationshipsResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONDER)
          IncidentRoleAssignmentResponderRelationship responder) {
    this.responder = responder;
    this.unparsed |= responder.unparsed;
  }

  public IncidentRoleAssignmentRelationshipsResponse createdByUser(
      IncidentRoleAssignmentResponderRelationship createdByUser) {
    this.createdByUser = createdByUser;
    this.unparsed |= createdByUser.unparsed;
    return this;
  }

  /**
   * Relationship to a responder.
   *
   * @return createdByUser
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncidentRoleAssignmentResponderRelationship getCreatedByUser() {
    return createdByUser;
  }

  public void setCreatedByUser(IncidentRoleAssignmentResponderRelationship createdByUser) {
    this.createdByUser = createdByUser;
  }

  public IncidentRoleAssignmentRelationshipsResponse lastModifiedByUser(
      IncidentRoleAssignmentResponderRelationship lastModifiedByUser) {
    this.lastModifiedByUser = lastModifiedByUser;
    this.unparsed |= lastModifiedByUser.unparsed;
    return this;
  }

  /**
   * Relationship to a responder.
   *
   * @return lastModifiedByUser
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_BY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncidentRoleAssignmentResponderRelationship getLastModifiedByUser() {
    return lastModifiedByUser;
  }

  public void setLastModifiedByUser(
      IncidentRoleAssignmentResponderRelationship lastModifiedByUser) {
    this.lastModifiedByUser = lastModifiedByUser;
  }

  public IncidentRoleAssignmentRelationshipsResponse reservedRole(
      IncidentRoleAssignmentRoleRelationship reservedRole) {
    this.reservedRole = reservedRole;
    this.unparsed |= reservedRole.unparsed;
    return this;
  }

  /**
   * Relationship to a role.
   *
   * @return reservedRole
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESERVED_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncidentRoleAssignmentRoleRelationship getReservedRole() {
    return reservedRole;
  }

  public void setReservedRole(IncidentRoleAssignmentRoleRelationship reservedRole) {
    this.reservedRole = reservedRole;
  }

  public IncidentRoleAssignmentRelationshipsResponse responder(
      IncidentRoleAssignmentResponderRelationship responder) {
    this.responder = responder;
    this.unparsed |= responder.unparsed;
    return this;
  }

  /**
   * Relationship to a responder.
   *
   * @return responder
   */
  @JsonProperty(JSON_PROPERTY_RESPONDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentRoleAssignmentResponderRelationship getResponder() {
    return responder;
  }

  public void setResponder(IncidentRoleAssignmentResponderRelationship responder) {
    this.responder = responder;
  }

  public IncidentRoleAssignmentRelationshipsResponse userDefinedRole(
      IncidentRoleAssignmentRoleRelationship userDefinedRole) {
    this.userDefinedRole = userDefinedRole;
    this.unparsed |= userDefinedRole.unparsed;
    return this;
  }

  /**
   * Relationship to a role.
   *
   * @return userDefinedRole
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_DEFINED_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncidentRoleAssignmentRoleRelationship getUserDefinedRole() {
    return userDefinedRole;
  }

  public void setUserDefinedRole(IncidentRoleAssignmentRoleRelationship userDefinedRole) {
    this.userDefinedRole = userDefinedRole;
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
   * @return IncidentRoleAssignmentRelationshipsResponse
   */
  @JsonAnySetter
  public IncidentRoleAssignmentRelationshipsResponse putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this IncidentRoleAssignmentRelationshipsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentRoleAssignmentRelationshipsResponse incidentRoleAssignmentRelationshipsResponse =
        (IncidentRoleAssignmentRelationshipsResponse) o;
    return Objects.equals(
            this.createdByUser, incidentRoleAssignmentRelationshipsResponse.createdByUser)
        && Objects.equals(
            this.lastModifiedByUser, incidentRoleAssignmentRelationshipsResponse.lastModifiedByUser)
        && Objects.equals(
            this.reservedRole, incidentRoleAssignmentRelationshipsResponse.reservedRole)
        && Objects.equals(this.responder, incidentRoleAssignmentRelationshipsResponse.responder)
        && Objects.equals(
            this.userDefinedRole, incidentRoleAssignmentRelationshipsResponse.userDefinedRole)
        && Objects.equals(
            this.additionalProperties,
            incidentRoleAssignmentRelationshipsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdByUser,
        lastModifiedByUser,
        reservedRole,
        responder,
        userDefinedRole,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentRoleAssignmentRelationshipsResponse {\n");
    sb.append("    createdByUser: ").append(toIndentedString(createdByUser)).append("\n");
    sb.append("    lastModifiedByUser: ").append(toIndentedString(lastModifiedByUser)).append("\n");
    sb.append("    reservedRole: ").append(toIndentedString(reservedRole)).append("\n");
    sb.append("    responder: ").append(toIndentedString(responder)).append("\n");
    sb.append("    userDefinedRole: ").append(toIndentedString(userDefinedRole)).append("\n");
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
