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

/** Data object representing an org authorized client. */
@JsonPropertyOrder({
  OrgAuthorizedClientData.JSON_PROPERTY_ATTRIBUTES,
  OrgAuthorizedClientData.JSON_PROPERTY_ID,
  OrgAuthorizedClientData.JSON_PROPERTY_RELATIONSHIPS,
  OrgAuthorizedClientData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OrgAuthorizedClientData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private OrgAuthorizedClientAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private OrgAuthorizedClientRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private OrgAuthorizedClientType type;

  public OrgAuthorizedClientData() {}

  @JsonCreator
  public OrgAuthorizedClientData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          OrgAuthorizedClientAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_RELATIONSHIPS)
          OrgAuthorizedClientRelationships relationships,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) OrgAuthorizedClientType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.id = id;
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public OrgAuthorizedClientData attributes(OrgAuthorizedClientAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes of an org authorized client.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OrgAuthorizedClientAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(OrgAuthorizedClientAttributes attributes) {
    this.attributes = attributes;
  }

  public OrgAuthorizedClientData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the org authorized client.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OrgAuthorizedClientData relationships(OrgAuthorizedClientRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * Relationships for an org authorized client.
   *
   * @return relationships
   */
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OrgAuthorizedClientRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(OrgAuthorizedClientRelationships relationships) {
    this.relationships = relationships;
  }

  public OrgAuthorizedClientData type(OrgAuthorizedClientType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The resource type for org authorized clients.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OrgAuthorizedClientType getType() {
    return type;
  }

  public void setType(OrgAuthorizedClientType type) {
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
   * @return OrgAuthorizedClientData
   */
  @JsonAnySetter
  public OrgAuthorizedClientData putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OrgAuthorizedClientData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgAuthorizedClientData orgAuthorizedClientData = (OrgAuthorizedClientData) o;
    return Objects.equals(this.attributes, orgAuthorizedClientData.attributes)
        && Objects.equals(this.id, orgAuthorizedClientData.id)
        && Objects.equals(this.relationships, orgAuthorizedClientData.relationships)
        && Objects.equals(this.type, orgAuthorizedClientData.type)
        && Objects.equals(this.additionalProperties, orgAuthorizedClientData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, relationships, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgAuthorizedClientData {\n");
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
