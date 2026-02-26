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

/** */
@JsonPropertyOrder({
  IncidentHandleRelationships.JSON_PROPERTY_COMMANDER_USER,
  IncidentHandleRelationships.JSON_PROPERTY_CREATED_BY_USER,
  IncidentHandleRelationships.JSON_PROPERTY_INCIDENT_TYPE,
  IncidentHandleRelationships.JSON_PROPERTY_LAST_MODIFIED_BY_USER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentHandleRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMMANDER_USER = "commander_user";
  private IncidentHandleRelationship commanderUser;

  public static final String JSON_PROPERTY_CREATED_BY_USER = "created_by_user";
  private IncidentHandleRelationship createdByUser;

  public static final String JSON_PROPERTY_INCIDENT_TYPE = "incident_type";
  private IncidentHandleRelationship incidentType;

  public static final String JSON_PROPERTY_LAST_MODIFIED_BY_USER = "last_modified_by_user";
  private IncidentHandleRelationship lastModifiedByUser;

  public IncidentHandleRelationships() {}

  @JsonCreator
  public IncidentHandleRelationships(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_BY_USER)
          IncidentHandleRelationship createdByUser,
      @JsonProperty(required = true, value = JSON_PROPERTY_INCIDENT_TYPE)
          IncidentHandleRelationship incidentType,
      @JsonProperty(required = true, value = JSON_PROPERTY_LAST_MODIFIED_BY_USER)
          IncidentHandleRelationship lastModifiedByUser) {
    this.createdByUser = createdByUser;
    this.unparsed |= createdByUser.unparsed;
    this.incidentType = incidentType;
    this.unparsed |= incidentType.unparsed;
    this.lastModifiedByUser = lastModifiedByUser;
    this.unparsed |= lastModifiedByUser.unparsed;
  }

  public IncidentHandleRelationships commanderUser(IncidentHandleRelationship commanderUser) {
    this.commanderUser = commanderUser;
    this.unparsed |= commanderUser.unparsed;
    return this;
  }

  /**
   * GetcommanderUser
   *
   * @return commanderUser
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMANDER_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncidentHandleRelationship getCommanderUser() {
    return commanderUser;
  }

  public void setCommanderUser(IncidentHandleRelationship commanderUser) {
    this.commanderUser = commanderUser;
  }

  public IncidentHandleRelationships createdByUser(IncidentHandleRelationship createdByUser) {
    this.createdByUser = createdByUser;
    this.unparsed |= createdByUser.unparsed;
    return this;
  }

  /**
   * GetcreatedByUser
   *
   * @return createdByUser
   */
  @JsonProperty(JSON_PROPERTY_CREATED_BY_USER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentHandleRelationship getCreatedByUser() {
    return createdByUser;
  }

  public void setCreatedByUser(IncidentHandleRelationship createdByUser) {
    this.createdByUser = createdByUser;
  }

  public IncidentHandleRelationships incidentType(IncidentHandleRelationship incidentType) {
    this.incidentType = incidentType;
    this.unparsed |= incidentType.unparsed;
    return this;
  }

  /**
   * GetincidentType
   *
   * @return incidentType
   */
  @JsonProperty(JSON_PROPERTY_INCIDENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentHandleRelationship getIncidentType() {
    return incidentType;
  }

  public void setIncidentType(IncidentHandleRelationship incidentType) {
    this.incidentType = incidentType;
  }

  public IncidentHandleRelationships lastModifiedByUser(
      IncidentHandleRelationship lastModifiedByUser) {
    this.lastModifiedByUser = lastModifiedByUser;
    this.unparsed |= lastModifiedByUser.unparsed;
    return this;
  }

  /**
   * GetlastModifiedByUser
   *
   * @return lastModifiedByUser
   */
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_BY_USER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentHandleRelationship getLastModifiedByUser() {
    return lastModifiedByUser;
  }

  public void setLastModifiedByUser(IncidentHandleRelationship lastModifiedByUser) {
    this.lastModifiedByUser = lastModifiedByUser;
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
   * @return IncidentHandleRelationships
   */
  @JsonAnySetter
  public IncidentHandleRelationships putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentHandleRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentHandleRelationships incidentHandleRelationships = (IncidentHandleRelationships) o;
    return Objects.equals(this.commanderUser, incidentHandleRelationships.commanderUser)
        && Objects.equals(this.createdByUser, incidentHandleRelationships.createdByUser)
        && Objects.equals(this.incidentType, incidentHandleRelationships.incidentType)
        && Objects.equals(this.lastModifiedByUser, incidentHandleRelationships.lastModifiedByUser)
        && Objects.equals(
            this.additionalProperties, incidentHandleRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        commanderUser, createdByUser, incidentType, lastModifiedByUser, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentHandleRelationships {\n");
    sb.append("    commanderUser: ").append(toIndentedString(commanderUser)).append("\n");
    sb.append("    createdByUser: ").append(toIndentedString(createdByUser)).append("\n");
    sb.append("    incidentType: ").append(toIndentedString(incidentType)).append("\n");
    sb.append("    lastModifiedByUser: ").append(toIndentedString(lastModifiedByUser)).append("\n");
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
