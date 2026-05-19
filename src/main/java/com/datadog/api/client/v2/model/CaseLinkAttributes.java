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

/**
 * Attributes describing a directional relationship between two entities (cases, incidents, or
 * pages).
 */
@JsonPropertyOrder({
  CaseLinkAttributes.JSON_PROPERTY_CHILD_ENTITY_ID,
  CaseLinkAttributes.JSON_PROPERTY_CHILD_ENTITY_TYPE,
  CaseLinkAttributes.JSON_PROPERTY_PARENT_ENTITY_ID,
  CaseLinkAttributes.JSON_PROPERTY_PARENT_ENTITY_TYPE,
  CaseLinkAttributes.JSON_PROPERTY_RELATIONSHIP
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CaseLinkAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHILD_ENTITY_ID = "child_entity_id";
  private String childEntityId;

  public static final String JSON_PROPERTY_CHILD_ENTITY_TYPE = "child_entity_type";
  private String childEntityType;

  public static final String JSON_PROPERTY_PARENT_ENTITY_ID = "parent_entity_id";
  private String parentEntityId;

  public static final String JSON_PROPERTY_PARENT_ENTITY_TYPE = "parent_entity_type";
  private String parentEntityType;

  public static final String JSON_PROPERTY_RELATIONSHIP = "relationship";
  private String relationship;

  public CaseLinkAttributes() {}

  @JsonCreator
  public CaseLinkAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CHILD_ENTITY_ID) String childEntityId,
      @JsonProperty(required = true, value = JSON_PROPERTY_CHILD_ENTITY_TYPE)
          String childEntityType,
      @JsonProperty(required = true, value = JSON_PROPERTY_PARENT_ENTITY_ID) String parentEntityId,
      @JsonProperty(required = true, value = JSON_PROPERTY_PARENT_ENTITY_TYPE)
          String parentEntityType,
      @JsonProperty(required = true, value = JSON_PROPERTY_RELATIONSHIP) String relationship) {
    this.childEntityId = childEntityId;
    this.childEntityType = childEntityType;
    this.parentEntityId = parentEntityId;
    this.parentEntityType = parentEntityType;
    this.relationship = relationship;
  }

  public CaseLinkAttributes childEntityId(String childEntityId) {
    this.childEntityId = childEntityId;
    return this;
  }

  /**
   * The UUID of the child (target) entity in the relationship.
   *
   * @return childEntityId
   */
  @JsonProperty(JSON_PROPERTY_CHILD_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getChildEntityId() {
    return childEntityId;
  }

  public void setChildEntityId(String childEntityId) {
    this.childEntityId = childEntityId;
  }

  public CaseLinkAttributes childEntityType(String childEntityType) {
    this.childEntityType = childEntityType;
    return this;
  }

  /**
   * The type of the child entity. Allowed values: <code>CASE</code>, <code>INCIDENT</code>, <code>
   * PAGE</code>, <code>AGENT_CONVERSATION</code>.
   *
   * @return childEntityType
   */
  @JsonProperty(JSON_PROPERTY_CHILD_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getChildEntityType() {
    return childEntityType;
  }

  public void setChildEntityType(String childEntityType) {
    this.childEntityType = childEntityType;
  }

  public CaseLinkAttributes parentEntityId(String parentEntityId) {
    this.parentEntityId = parentEntityId;
    return this;
  }

  /**
   * The UUID of the parent (source) entity in the relationship.
   *
   * @return parentEntityId
   */
  @JsonProperty(JSON_PROPERTY_PARENT_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getParentEntityId() {
    return parentEntityId;
  }

  public void setParentEntityId(String parentEntityId) {
    this.parentEntityId = parentEntityId;
  }

  public CaseLinkAttributes parentEntityType(String parentEntityType) {
    this.parentEntityType = parentEntityType;
    return this;
  }

  /**
   * The type of the parent entity. Allowed values: <code>CASE</code>, <code>INCIDENT</code>, <code>
   * PAGE</code>, <code>AGENT_CONVERSATION</code>.
   *
   * @return parentEntityType
   */
  @JsonProperty(JSON_PROPERTY_PARENT_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getParentEntityType() {
    return parentEntityType;
  }

  public void setParentEntityType(String parentEntityType) {
    this.parentEntityType = parentEntityType;
  }

  public CaseLinkAttributes relationship(String relationship) {
    this.relationship = relationship;
    return this;
  }

  /**
   * The type of directional relationship. Allowed values: <code>RELATES_TO</code> (bidirectional
   * association), <code>CAUSES</code> (parent causes child), <code>BLOCKS</code> (parent blocks
   * child), <code>DUPLICATES</code> (parent duplicates child), <code>PARENT_OF</code>
   * (hierarchical), <code>SUCCESSOR_OF</code> (sequence), <code>ESCALATES_TO</code> (priority
   * escalation).
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
   * @return CaseLinkAttributes
   */
  @JsonAnySetter
  public CaseLinkAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CaseLinkAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseLinkAttributes caseLinkAttributes = (CaseLinkAttributes) o;
    return Objects.equals(this.childEntityId, caseLinkAttributes.childEntityId)
        && Objects.equals(this.childEntityType, caseLinkAttributes.childEntityType)
        && Objects.equals(this.parentEntityId, caseLinkAttributes.parentEntityId)
        && Objects.equals(this.parentEntityType, caseLinkAttributes.parentEntityType)
        && Objects.equals(this.relationship, caseLinkAttributes.relationship)
        && Objects.equals(this.additionalProperties, caseLinkAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        childEntityId,
        childEntityType,
        parentEntityId,
        parentEntityType,
        relationship,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseLinkAttributes {\n");
    sb.append("    childEntityId: ").append(toIndentedString(childEntityId)).append("\n");
    sb.append("    childEntityType: ").append(toIndentedString(childEntityType)).append("\n");
    sb.append("    parentEntityId: ").append(toIndentedString(parentEntityId)).append("\n");
    sb.append("    parentEntityType: ").append(toIndentedString(parentEntityType)).append("\n");
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
