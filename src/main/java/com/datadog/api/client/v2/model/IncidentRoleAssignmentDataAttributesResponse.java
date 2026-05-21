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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Attributes of an incident role assignment. */
@JsonPropertyOrder({
  IncidentRoleAssignmentDataAttributesResponse.JSON_PROPERTY_CREATED,
  IncidentRoleAssignmentDataAttributesResponse.JSON_PROPERTY_MODIFIED,
  IncidentRoleAssignmentDataAttributesResponse.JSON_PROPERTY_RESPONDER_TYPE,
  IncidentRoleAssignmentDataAttributesResponse.JSON_PROPERTY_ROLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentRoleAssignmentDataAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private OffsetDateTime modified;

  public static final String JSON_PROPERTY_RESPONDER_TYPE = "responder_type";
  private String responderType;

  public static final String JSON_PROPERTY_ROLE = "role";
  private String role;

  public IncidentRoleAssignmentDataAttributesResponse() {}

  @JsonCreator
  public IncidentRoleAssignmentDataAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED) OffsetDateTime created,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED) OffsetDateTime modified,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONDER_TYPE) String responderType,
      @JsonProperty(required = true, value = JSON_PROPERTY_ROLE) String role) {
    this.created = created;
    this.modified = modified;
    this.responderType = responderType;
    this.role = role;
  }

  public IncidentRoleAssignmentDataAttributesResponse created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Timestamp when the role assignment was created.
   *
   * @return created
   */
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public IncidentRoleAssignmentDataAttributesResponse modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

  /**
   * Timestamp when the role assignment was last modified.
   *
   * @return modified
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getModified() {
    return modified;
  }

  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }

  public IncidentRoleAssignmentDataAttributesResponse responderType(String responderType) {
    this.responderType = responderType;
    return this;
  }

  /**
   * The type of the responder.
   *
   * @return responderType
   */
  @JsonProperty(JSON_PROPERTY_RESPONDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getResponderType() {
    return responderType;
  }

  public void setResponderType(String responderType) {
    this.responderType = responderType;
  }

  public IncidentRoleAssignmentDataAttributesResponse role(String role) {
    this.role = role;
    return this;
  }

  /**
   * The name of the assigned role.
   *
   * @return role
   */
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
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
   * @return IncidentRoleAssignmentDataAttributesResponse
   */
  @JsonAnySetter
  public IncidentRoleAssignmentDataAttributesResponse putAdditionalProperty(
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

  /** Return true if this IncidentRoleAssignmentDataAttributesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentRoleAssignmentDataAttributesResponse incidentRoleAssignmentDataAttributesResponse =
        (IncidentRoleAssignmentDataAttributesResponse) o;
    return Objects.equals(this.created, incidentRoleAssignmentDataAttributesResponse.created)
        && Objects.equals(this.modified, incidentRoleAssignmentDataAttributesResponse.modified)
        && Objects.equals(
            this.responderType, incidentRoleAssignmentDataAttributesResponse.responderType)
        && Objects.equals(this.role, incidentRoleAssignmentDataAttributesResponse.role)
        && Objects.equals(
            this.additionalProperties,
            incidentRoleAssignmentDataAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, modified, responderType, role, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentRoleAssignmentDataAttributesResponse {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    responderType: ").append(toIndentedString(responderType)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
