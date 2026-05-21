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

/** Attributes of a case link. */
@JsonPropertyOrder({
  IncidentCaseLinkDataAttributes.JSON_PROPERTY_ENTITY_ID,
  IncidentCaseLinkDataAttributes.JSON_PROPERTY_IS_PAGE,
  IncidentCaseLinkDataAttributes.JSON_PROPERTY_RELATIONSHIP
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentCaseLinkDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENTITY_ID = "entity_id";
  private String entityId;

  public static final String JSON_PROPERTY_IS_PAGE = "is_page";
  private Boolean isPage;

  public static final String JSON_PROPERTY_RELATIONSHIP = "relationship";
  private String relationship;

  public IncidentCaseLinkDataAttributes() {}

  @JsonCreator
  public IncidentCaseLinkDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENTITY_ID) String entityId,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_PAGE) Boolean isPage,
      @JsonProperty(required = true, value = JSON_PROPERTY_RELATIONSHIP) String relationship) {
    this.entityId = entityId;
    this.isPage = isPage;
    this.relationship = relationship;
  }

  public IncidentCaseLinkDataAttributes entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * The entity identifier.
   *
   * @return entityId
   */
  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public IncidentCaseLinkDataAttributes isPage(Boolean isPage) {
    this.isPage = isPage;
    return this;
  }

  /**
   * Whether this is a page link.
   *
   * @return isPage
   */
  @JsonProperty(JSON_PROPERTY_IS_PAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsPage() {
    return isPage;
  }

  public void setIsPage(Boolean isPage) {
    this.isPage = isPage;
  }

  public IncidentCaseLinkDataAttributes relationship(String relationship) {
    this.relationship = relationship;
    return this;
  }

  /**
   * The relationship type.
   *
   * @return relationship
   */
  @JsonProperty(JSON_PROPERTY_RELATIONSHIP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRelationship() {
    return relationship;
  }

  public void setRelationship(String relationship) {
    this.relationship = relationship;
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
   * @return IncidentCaseLinkDataAttributes
   */
  @JsonAnySetter
  public IncidentCaseLinkDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentCaseLinkDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentCaseLinkDataAttributes incidentCaseLinkDataAttributes =
        (IncidentCaseLinkDataAttributes) o;
    return Objects.equals(this.entityId, incidentCaseLinkDataAttributes.entityId)
        && Objects.equals(this.isPage, incidentCaseLinkDataAttributes.isPage)
        && Objects.equals(this.relationship, incidentCaseLinkDataAttributes.relationship)
        && Objects.equals(
            this.additionalProperties, incidentCaseLinkDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, isPage, relationship, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentCaseLinkDataAttributes {\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    isPage: ").append(toIndentedString(isPage)).append("\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
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
