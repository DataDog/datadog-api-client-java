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

/** Relationships of a postmortem template returned in a response. */
@JsonPropertyOrder({
  PostmortemTemplateResponseRelationships.JSON_PROPERTY_INCIDENT_TYPE,
  PostmortemTemplateResponseRelationships.JSON_PROPERTY_LAST_MODIFIED_BY_USER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PostmortemTemplateResponseRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INCIDENT_TYPE = "incident_type";
  private PostmortemTemplateIncidentTypeRelationship incidentType;

  public static final String JSON_PROPERTY_LAST_MODIFIED_BY_USER = "last_modified_by_user";
  private PostmortemTemplateUserRelationship lastModifiedByUser;

  public PostmortemTemplateResponseRelationships incidentType(
      PostmortemTemplateIncidentTypeRelationship incidentType) {
    this.incidentType = incidentType;
    this.unparsed |= incidentType.unparsed;
    return this;
  }

  /**
   * Relationship to the incident type this template belongs to.
   *
   * @return incidentType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCIDENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PostmortemTemplateIncidentTypeRelationship getIncidentType() {
    return incidentType;
  }

  public void setIncidentType(PostmortemTemplateIncidentTypeRelationship incidentType) {
    this.incidentType = incidentType;
    if (incidentType != null) {
      this.unparsed |= incidentType.unparsed;
    }
  }

  public PostmortemTemplateResponseRelationships lastModifiedByUser(
      PostmortemTemplateUserRelationship lastModifiedByUser) {
    this.lastModifiedByUser = lastModifiedByUser;
    this.unparsed |= lastModifiedByUser.unparsed;
    return this;
  }

  /**
   * Relationship to a user.
   *
   * @return lastModifiedByUser
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_BY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PostmortemTemplateUserRelationship getLastModifiedByUser() {
    return lastModifiedByUser;
  }

  public void setLastModifiedByUser(PostmortemTemplateUserRelationship lastModifiedByUser) {
    this.lastModifiedByUser = lastModifiedByUser;
    if (lastModifiedByUser != null) {
      this.unparsed |= lastModifiedByUser.unparsed;
    }
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
   * @return PostmortemTemplateResponseRelationships
   */
  @JsonAnySetter
  public PostmortemTemplateResponseRelationships putAdditionalProperty(String key, Object value) {
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

  /** Return true if this PostmortemTemplateResponseRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostmortemTemplateResponseRelationships postmortemTemplateResponseRelationships =
        (PostmortemTemplateResponseRelationships) o;
    return Objects.equals(this.incidentType, postmortemTemplateResponseRelationships.incidentType)
        && Objects.equals(
            this.lastModifiedByUser, postmortemTemplateResponseRelationships.lastModifiedByUser)
        && Objects.equals(
            this.additionalProperties,
            postmortemTemplateResponseRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incidentType, lastModifiedByUser, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostmortemTemplateResponseRelationships {\n");
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
