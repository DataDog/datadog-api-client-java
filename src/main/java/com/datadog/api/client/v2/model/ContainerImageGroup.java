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

/** Container Image Group object. */
@JsonPropertyOrder({
  ContainerImageGroup.JSON_PROPERTY_ATTRIBUTES,
  ContainerImageGroup.JSON_PROPERTY_ID,
  ContainerImageGroup.JSON_PROPERTY_RELATIONSHIPS,
  ContainerImageGroup.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ContainerImageGroup {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private ContainerImageGroupAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private ContainerImageGroupRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ContainerImageGroupType type = ContainerImageGroupType.CONTAINER_IMAGE_GROUP;

  public ContainerImageGroup attributes(ContainerImageGroupAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes for a Container Image Group.
   *
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ContainerImageGroupAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(ContainerImageGroupAttributes attributes) {
    this.attributes = attributes;
  }

  public ContainerImageGroup id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Container Image Group ID.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ContainerImageGroup relationships(ContainerImageGroupRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * Relationships inside a Container Image Group.
   *
   * @return relationships
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ContainerImageGroupRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(ContainerImageGroupRelationships relationships) {
    this.relationships = relationships;
  }

  public ContainerImageGroup type(ContainerImageGroupType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of Container Image Group.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ContainerImageGroupType getType() {
    return type;
  }

  public void setType(ContainerImageGroupType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return ContainerImageGroup
   */
  @JsonAnySetter
  public ContainerImageGroup putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ContainerImageGroup object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerImageGroup containerImageGroup = (ContainerImageGroup) o;
    return Objects.equals(this.attributes, containerImageGroup.attributes)
        && Objects.equals(this.id, containerImageGroup.id)
        && Objects.equals(this.relationships, containerImageGroup.relationships)
        && Objects.equals(this.type, containerImageGroup.type)
        && Objects.equals(this.additionalProperties, containerImageGroup.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, relationships, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerImageGroup {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
