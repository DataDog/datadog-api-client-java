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
   * <p>The notification rule's resource relationships.</p>
 */
@JsonPropertyOrder({
  IncidentNotificationRuleRelationships.JSON_PROPERTY_CREATED_BY_USER,
  IncidentNotificationRuleRelationships.JSON_PROPERTY_INCIDENT_TYPE,
  IncidentNotificationRuleRelationships.JSON_PROPERTY_LAST_MODIFIED_BY_USER,
  IncidentNotificationRuleRelationships.JSON_PROPERTY_NOTIFICATION_TEMPLATE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentNotificationRuleRelationships {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_BY_USER = "created_by_user";
  private RelationshipToUser createdByUser;

  public static final String JSON_PROPERTY_INCIDENT_TYPE = "incident_type";
  private RelationshipToIncidentType incidentType;

  public static final String JSON_PROPERTY_LAST_MODIFIED_BY_USER = "last_modified_by_user";
  private RelationshipToUser lastModifiedByUser;

  public static final String JSON_PROPERTY_NOTIFICATION_TEMPLATE = "notification_template";
  private RelationshipToIncidentNotificationTemplate notificationTemplate;

  public IncidentNotificationRuleRelationships createdByUser(RelationshipToUser createdByUser) {
    this.createdByUser = createdByUser;
    this.unparsed |= createdByUser.unparsed;
    return this;
  }

  /**
   * <p>Relationship to user.</p>
   * @return createdByUser
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_BY_USER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public RelationshipToUser getCreatedByUser() {
        return createdByUser;
      }
  public void setCreatedByUser(RelationshipToUser createdByUser) {
    this.createdByUser = createdByUser;
  }
  public IncidentNotificationRuleRelationships incidentType(RelationshipToIncidentType incidentType) {
    this.incidentType = incidentType;
    this.unparsed |= incidentType.unparsed;
    return this;
  }

  /**
   * <p>Relationship to an incident type.</p>
   * @return incidentType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INCIDENT_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public RelationshipToIncidentType getIncidentType() {
        return incidentType;
      }
  public void setIncidentType(RelationshipToIncidentType incidentType) {
    this.incidentType = incidentType;
  }
  public IncidentNotificationRuleRelationships lastModifiedByUser(RelationshipToUser lastModifiedByUser) {
    this.lastModifiedByUser = lastModifiedByUser;
    this.unparsed |= lastModifiedByUser.unparsed;
    return this;
  }

  /**
   * <p>Relationship to user.</p>
   * @return lastModifiedByUser
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_BY_USER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public RelationshipToUser getLastModifiedByUser() {
        return lastModifiedByUser;
      }
  public void setLastModifiedByUser(RelationshipToUser lastModifiedByUser) {
    this.lastModifiedByUser = lastModifiedByUser;
  }
  public IncidentNotificationRuleRelationships notificationTemplate(RelationshipToIncidentNotificationTemplate notificationTemplate) {
    this.notificationTemplate = notificationTemplate;
    this.unparsed |= notificationTemplate.unparsed;
    return this;
  }

  /**
   * <p>A relationship reference to a notification template.</p>
   * @return notificationTemplate
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NOTIFICATION_TEMPLATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public RelationshipToIncidentNotificationTemplate getNotificationTemplate() {
        return notificationTemplate;
      }
  public void setNotificationTemplate(RelationshipToIncidentNotificationTemplate notificationTemplate) {
    this.notificationTemplate = notificationTemplate;
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
   * @return IncidentNotificationRuleRelationships
   */
  @JsonAnySetter
  public IncidentNotificationRuleRelationships putAdditionalProperty(String key, Object value) {
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
   * Return true if this IncidentNotificationRuleRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentNotificationRuleRelationships incidentNotificationRuleRelationships = (IncidentNotificationRuleRelationships) o;
    return Objects.equals(this.createdByUser, incidentNotificationRuleRelationships.createdByUser) && Objects.equals(this.incidentType, incidentNotificationRuleRelationships.incidentType) && Objects.equals(this.lastModifiedByUser, incidentNotificationRuleRelationships.lastModifiedByUser) && Objects.equals(this.notificationTemplate, incidentNotificationRuleRelationships.notificationTemplate) && Objects.equals(this.additionalProperties, incidentNotificationRuleRelationships.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(createdByUser,incidentType,lastModifiedByUser,notificationTemplate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentNotificationRuleRelationships {\n");
    sb.append("    createdByUser: ").append(toIndentedString(createdByUser)).append("\n");
    sb.append("    incidentType: ").append(toIndentedString(incidentType)).append("\n");
    sb.append("    lastModifiedByUser: ").append(toIndentedString(lastModifiedByUser)).append("\n");
    sb.append("    notificationTemplate: ").append(toIndentedString(notificationTemplate)).append("\n");
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
