/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**

 */
@JsonPropertyOrder({
  IncidentHandleRelationshipsRequest.JSON_PROPERTY_COMMANDER_USER,
  IncidentHandleRelationshipsRequest.JSON_PROPERTY_INCIDENT_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentHandleRelationshipsRequest {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMMANDER_USER = "commander_user";
  private IncidentHandleRelationship commanderUser;

  public static final String JSON_PROPERTY_INCIDENT_TYPE = "incident_type";
  private IncidentHandleRelationship incidentType;

  public IncidentHandleRelationshipsRequest() {}

  @JsonCreator
  public IncidentHandleRelationshipsRequest(
            @JsonProperty(required=true, value=JSON_PROPERTY_INCIDENT_TYPE)IncidentHandleRelationship incidentType) {
        this.incidentType = incidentType;
        this.unparsed |= incidentType.unparsed;
  }
  public IncidentHandleRelationshipsRequest commanderUser(IncidentHandleRelationship commanderUser) {
    this.commanderUser = commanderUser;
    this.unparsed |= commanderUser.unparsed;
    return this;
  }

  /**
   * <p>GetcommanderUser</p>
   * @return commanderUser
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COMMANDER_USER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public IncidentHandleRelationship getCommanderUser() {
        return commanderUser;
      }
  public void setCommanderUser(IncidentHandleRelationship commanderUser) {
    this.commanderUser = commanderUser;
  }
  public IncidentHandleRelationshipsRequest incidentType(IncidentHandleRelationship incidentType) {
    this.incidentType = incidentType;
    this.unparsed |= incidentType.unparsed;
    return this;
  }

  /**
   * <p>GetincidentType</p>
   * @return incidentType
  **/
      @JsonProperty(JSON_PROPERTY_INCIDENT_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public IncidentHandleRelationship getIncidentType() {
        return incidentType;
      }
  public void setIncidentType(IncidentHandleRelationship incidentType) {
    this.incidentType = incidentType;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return IncidentHandleRelationshipsRequest
   */
  @JsonAnySetter
  public IncidentHandleRelationshipsRequest putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this IncidentHandleRelationshipsRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentHandleRelationshipsRequest incidentHandleRelationshipsRequest = (IncidentHandleRelationshipsRequest) o;
    return Objects.equals(this.commanderUser, incidentHandleRelationshipsRequest.commanderUser) && Objects.equals(this.incidentType, incidentHandleRelationshipsRequest.incidentType) && Objects.equals(this.additionalProperties, incidentHandleRelationshipsRequest.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(commanderUser,incidentType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentHandleRelationshipsRequest {\n");
    sb.append("    commanderUser: ").append(toIndentedString(commanderUser)).append("\n");
    sb.append("    incidentType: ").append(toIndentedString(incidentType)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
