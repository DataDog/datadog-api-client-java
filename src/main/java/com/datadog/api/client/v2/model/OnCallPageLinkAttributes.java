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
 * The attributes of a Page link. A Page can be the child of another Datadog resource (for example,
 * when an incident triggers it), or the parent of one (for example, when the Page is escalated to
 * an incident).
 */
@JsonPropertyOrder({
  OnCallPageLinkAttributes.JSON_PROPERTY_CHILD_ENTITY_ID,
  OnCallPageLinkAttributes.JSON_PROPERTY_CHILD_ENTITY_TYPE,
  OnCallPageLinkAttributes.JSON_PROPERTY_PARENT_ENTITY_ID,
  OnCallPageLinkAttributes.JSON_PROPERTY_PARENT_ENTITY_TYPE,
  OnCallPageLinkAttributes.JSON_PROPERTY_RELATIONSHIP
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OnCallPageLinkAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHILD_ENTITY_ID = "child_entity_id";
  private String childEntityId;

  public static final String JSON_PROPERTY_CHILD_ENTITY_TYPE = "child_entity_type";
  private OnCallPageLinkEntityType childEntityType;

  public static final String JSON_PROPERTY_PARENT_ENTITY_ID = "parent_entity_id";
  private String parentEntityId;

  public static final String JSON_PROPERTY_PARENT_ENTITY_TYPE = "parent_entity_type";
  private OnCallPageLinkEntityType parentEntityType;

  public static final String JSON_PROPERTY_RELATIONSHIP = "relationship";
  private OnCallPageLinkRelationshipType relationship;

  public OnCallPageLinkAttributes() {}

  @JsonCreator
  public OnCallPageLinkAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CHILD_ENTITY_ID) String childEntityId,
      @JsonProperty(required = true, value = JSON_PROPERTY_CHILD_ENTITY_TYPE)
          OnCallPageLinkEntityType childEntityType,
      @JsonProperty(required = true, value = JSON_PROPERTY_PARENT_ENTITY_ID) String parentEntityId,
      @JsonProperty(required = true, value = JSON_PROPERTY_PARENT_ENTITY_TYPE)
          OnCallPageLinkEntityType parentEntityType,
      @JsonProperty(required = true, value = JSON_PROPERTY_RELATIONSHIP)
          OnCallPageLinkRelationshipType relationship) {
    this.childEntityId = childEntityId;
    this.childEntityType = childEntityType;
    this.unparsed |= !childEntityType.isValid();
    this.parentEntityId = parentEntityId;
    this.parentEntityType = parentEntityType;
    this.unparsed |= !parentEntityType.isValid();
    this.relationship = relationship;
    this.unparsed |= !relationship.isValid();
  }

  public OnCallPageLinkAttributes childEntityId(String childEntityId) {
    this.childEntityId = childEntityId;
    return this;
  }

  /**
   * The ID of the child resource.
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

  public OnCallPageLinkAttributes childEntityType(OnCallPageLinkEntityType childEntityType) {
    this.childEntityType = childEntityType;
    this.unparsed |= !childEntityType.isValid();
    return this;
  }

  /**
   * The type of a resource linked to a Page.
   *
   * @return childEntityType
   */
  @JsonProperty(JSON_PROPERTY_CHILD_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OnCallPageLinkEntityType getChildEntityType() {
    return childEntityType;
  }

  public void setChildEntityType(OnCallPageLinkEntityType childEntityType) {
    if (!childEntityType.isValid()) {
      this.unparsed = true;
    }
    this.childEntityType = childEntityType;
  }

  public OnCallPageLinkAttributes parentEntityId(String parentEntityId) {
    this.parentEntityId = parentEntityId;
    return this;
  }

  /**
   * The ID of the parent resource.
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

  public OnCallPageLinkAttributes parentEntityType(OnCallPageLinkEntityType parentEntityType) {
    this.parentEntityType = parentEntityType;
    this.unparsed |= !parentEntityType.isValid();
    return this;
  }

  /**
   * The type of a resource linked to a Page.
   *
   * @return parentEntityType
   */
  @JsonProperty(JSON_PROPERTY_PARENT_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OnCallPageLinkEntityType getParentEntityType() {
    return parentEntityType;
  }

  public void setParentEntityType(OnCallPageLinkEntityType parentEntityType) {
    if (!parentEntityType.isValid()) {
      this.unparsed = true;
    }
    this.parentEntityType = parentEntityType;
  }

  public OnCallPageLinkAttributes relationship(OnCallPageLinkRelationshipType relationship) {
    this.relationship = relationship;
    this.unparsed |= !relationship.isValid();
    return this;
  }

  /**
   * How the parent resource relates to the child resource.
   *
   * @return relationship
   */
  @JsonProperty(JSON_PROPERTY_RELATIONSHIP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OnCallPageLinkRelationshipType getRelationship() {
    return relationship;
  }

  public void setRelationship(OnCallPageLinkRelationshipType relationship) {
    if (!relationship.isValid()) {
      this.unparsed = true;
    }
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
   * @return OnCallPageLinkAttributes
   */
  @JsonAnySetter
  public OnCallPageLinkAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OnCallPageLinkAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnCallPageLinkAttributes onCallPageLinkAttributes = (OnCallPageLinkAttributes) o;
    return Objects.equals(this.childEntityId, onCallPageLinkAttributes.childEntityId)
        && Objects.equals(this.childEntityType, onCallPageLinkAttributes.childEntityType)
        && Objects.equals(this.parentEntityId, onCallPageLinkAttributes.parentEntityId)
        && Objects.equals(this.parentEntityType, onCallPageLinkAttributes.parentEntityType)
        && Objects.equals(this.relationship, onCallPageLinkAttributes.relationship)
        && Objects.equals(this.additionalProperties, onCallPageLinkAttributes.additionalProperties);
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
    sb.append("class OnCallPageLinkAttributes {\n");
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
