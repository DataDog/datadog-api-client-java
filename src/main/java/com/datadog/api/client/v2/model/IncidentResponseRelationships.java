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

/** The incident's relationships from a response. */
@JsonPropertyOrder({
  IncidentResponseRelationships.JSON_PROPERTY_ATTACHMENTS,
  IncidentResponseRelationships.JSON_PROPERTY_COMMANDER_USER,
  IncidentResponseRelationships.JSON_PROPERTY_CREATED_BY_USER,
  IncidentResponseRelationships.JSON_PROPERTY_DECLARED_BY_USER,
  IncidentResponseRelationships.JSON_PROPERTY_IMPACTS,
  IncidentResponseRelationships.JSON_PROPERTY_INTEGRATIONS,
  IncidentResponseRelationships.JSON_PROPERTY_LAST_MODIFIED_BY_USER,
  IncidentResponseRelationships.JSON_PROPERTY_RESPONDERS,
  IncidentResponseRelationships.JSON_PROPERTY_USER_DEFINED_FIELDS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentResponseRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTACHMENTS = "attachments";
  private RelationshipToIncidentAttachment attachments;

  public static final String JSON_PROPERTY_COMMANDER_USER = "commander_user";
  private JsonNullable<NullableRelationshipToUser> commanderUser =
      JsonNullable.<NullableRelationshipToUser>undefined();

  public static final String JSON_PROPERTY_CREATED_BY_USER = "created_by_user";
  private RelationshipToUser createdByUser;

  public static final String JSON_PROPERTY_DECLARED_BY_USER = "declared_by_user";
  private RelationshipToUser declaredByUser;

  public static final String JSON_PROPERTY_IMPACTS = "impacts";
  private RelationshipToIncidentImpacts impacts;

  public static final String JSON_PROPERTY_INTEGRATIONS = "integrations";
  private RelationshipToIncidentIntegrationMetadatas integrations;

  public static final String JSON_PROPERTY_LAST_MODIFIED_BY_USER = "last_modified_by_user";
  private RelationshipToUser lastModifiedByUser;

  public static final String JSON_PROPERTY_RESPONDERS = "responders";
  private RelationshipToIncidentResponders responders;

  public static final String JSON_PROPERTY_USER_DEFINED_FIELDS = "user_defined_fields";
  private RelationshipToIncidentUserDefinedFields userDefinedFields;

  public IncidentResponseRelationships attachments(RelationshipToIncidentAttachment attachments) {
    this.attachments = attachments;
    this.unparsed |= attachments.unparsed;
    return this;
  }

  /**
   * A relationship reference for attachments.
   *
   * @return attachments
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToIncidentAttachment getAttachments() {
    return attachments;
  }

  public void setAttachments(RelationshipToIncidentAttachment attachments) {
    this.attachments = attachments;
  }

  public IncidentResponseRelationships commanderUser(NullableRelationshipToUser commanderUser) {
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

  public IncidentResponseRelationships declaredByUser(RelationshipToUser declaredByUser) {
    this.declaredByUser = declaredByUser;
    this.unparsed |= declaredByUser.unparsed;
    return this;
  }

  /**
   * Relationship to user.
   *
   * @return declaredByUser
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DECLARED_BY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToUser getDeclaredByUser() {
    return declaredByUser;
  }

  public void setDeclaredByUser(RelationshipToUser declaredByUser) {
    this.declaredByUser = declaredByUser;
  }

  public IncidentResponseRelationships impacts(RelationshipToIncidentImpacts impacts) {
    this.impacts = impacts;
    this.unparsed |= impacts.unparsed;
    return this;
  }

  /**
   * Relationship to impacts.
   *
   * @return impacts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMPACTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToIncidentImpacts getImpacts() {
    return impacts;
  }

  public void setImpacts(RelationshipToIncidentImpacts impacts) {
    this.impacts = impacts;
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

  public IncidentResponseRelationships responders(RelationshipToIncidentResponders responders) {
    this.responders = responders;
    this.unparsed |= responders.unparsed;
    return this;
  }

  /**
   * Relationship to incident responders.
   *
   * @return responders
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONDERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToIncidentResponders getResponders() {
    return responders;
  }

  public void setResponders(RelationshipToIncidentResponders responders) {
    this.responders = responders;
  }

  public IncidentResponseRelationships userDefinedFields(
      RelationshipToIncidentUserDefinedFields userDefinedFields) {
    this.userDefinedFields = userDefinedFields;
    this.unparsed |= userDefinedFields.unparsed;
    return this;
  }

  /**
   * Relationship to incident user defined fields.
   *
   * @return userDefinedFields
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_DEFINED_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToIncidentUserDefinedFields getUserDefinedFields() {
    return userDefinedFields;
  }

  public void setUserDefinedFields(RelationshipToIncidentUserDefinedFields userDefinedFields) {
    this.userDefinedFields = userDefinedFields;
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
   * @return IncidentResponseRelationships
   */
  @JsonAnySetter
  public IncidentResponseRelationships putAdditionalProperty(String key, Object value) {
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
    return Objects.equals(this.attachments, incidentResponseRelationships.attachments)
        && Objects.equals(this.commanderUser, incidentResponseRelationships.commanderUser)
        && Objects.equals(this.createdByUser, incidentResponseRelationships.createdByUser)
        && Objects.equals(this.declaredByUser, incidentResponseRelationships.declaredByUser)
        && Objects.equals(this.impacts, incidentResponseRelationships.impacts)
        && Objects.equals(this.integrations, incidentResponseRelationships.integrations)
        && Objects.equals(this.lastModifiedByUser, incidentResponseRelationships.lastModifiedByUser)
        && Objects.equals(this.responders, incidentResponseRelationships.responders)
        && Objects.equals(this.userDefinedFields, incidentResponseRelationships.userDefinedFields)
        && Objects.equals(
            this.additionalProperties, incidentResponseRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        attachments,
        commanderUser,
        createdByUser,
        declaredByUser,
        impacts,
        integrations,
        lastModifiedByUser,
        responders,
        userDefinedFields,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentResponseRelationships {\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    commanderUser: ").append(toIndentedString(commanderUser)).append("\n");
    sb.append("    createdByUser: ").append(toIndentedString(createdByUser)).append("\n");
    sb.append("    declaredByUser: ").append(toIndentedString(declaredByUser)).append("\n");
    sb.append("    impacts: ").append(toIndentedString(impacts)).append("\n");
    sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
    sb.append("    lastModifiedByUser: ").append(toIndentedString(lastModifiedByUser)).append("\n");
    sb.append("    responders: ").append(toIndentedString(responders)).append("\n");
    sb.append("    userDefinedFields: ").append(toIndentedString(userDefinedFields)).append("\n");
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
