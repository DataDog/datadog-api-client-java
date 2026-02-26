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

/** The relationships for an incident import request. */
@JsonPropertyOrder({
  IncidentImportRelationships.JSON_PROPERTY_COMMANDER_USER,
  IncidentImportRelationships.JSON_PROPERTY_DECLARED_BY_USER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentImportRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMMANDER_USER = "commander_user";
  private JsonNullable<NullableRelationshipToUser> commanderUser =
      JsonNullable.<NullableRelationshipToUser>undefined();

  public static final String JSON_PROPERTY_DECLARED_BY_USER = "declared_by_user";
  private JsonNullable<NullableRelationshipToUser> declaredByUser =
      JsonNullable.<NullableRelationshipToUser>undefined();

  public IncidentImportRelationships commanderUser(NullableRelationshipToUser commanderUser) {
    this.commanderUser = JsonNullable.<NullableRelationshipToUser>of(commanderUser);
    return this;
  }

  /**
   * Relationship to user.
   *
   * @return commanderUser
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public NullableRelationshipToUser getCommanderUser() {
    return commanderUser.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COMMANDER_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<NullableRelationshipToUser> getCommanderUser_JsonNullable() {
    return commanderUser;
  }

  @JsonProperty(JSON_PROPERTY_COMMANDER_USER)
  public void setCommanderUser_JsonNullable(
      JsonNullable<NullableRelationshipToUser> commanderUser) {
    this.commanderUser = commanderUser;
  }

  public void setCommanderUser(NullableRelationshipToUser commanderUser) {
    this.commanderUser = JsonNullable.<NullableRelationshipToUser>of(commanderUser);
  }

  public IncidentImportRelationships declaredByUser(NullableRelationshipToUser declaredByUser) {
    this.declaredByUser = JsonNullable.<NullableRelationshipToUser>of(declaredByUser);
    return this;
  }

  /**
   * Relationship to user.
   *
   * @return declaredByUser
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public NullableRelationshipToUser getDeclaredByUser() {
    return declaredByUser.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DECLARED_BY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<NullableRelationshipToUser> getDeclaredByUser_JsonNullable() {
    return declaredByUser;
  }

  @JsonProperty(JSON_PROPERTY_DECLARED_BY_USER)
  public void setDeclaredByUser_JsonNullable(
      JsonNullable<NullableRelationshipToUser> declaredByUser) {
    this.declaredByUser = declaredByUser;
  }

  public void setDeclaredByUser(NullableRelationshipToUser declaredByUser) {
    this.declaredByUser = JsonNullable.<NullableRelationshipToUser>of(declaredByUser);
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
   * @return IncidentImportRelationships
   */
  @JsonAnySetter
  public IncidentImportRelationships putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentImportRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentImportRelationships incidentImportRelationships = (IncidentImportRelationships) o;
    return Objects.equals(this.commanderUser, incidentImportRelationships.commanderUser)
        && Objects.equals(this.declaredByUser, incidentImportRelationships.declaredByUser)
        && Objects.equals(
            this.additionalProperties, incidentImportRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commanderUser, declaredByUser, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentImportRelationships {\n");
    sb.append("    commanderUser: ").append(toIndentedString(commanderUser)).append("\n");
    sb.append("    declaredByUser: ").append(toIndentedString(declaredByUser)).append("\n");
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
