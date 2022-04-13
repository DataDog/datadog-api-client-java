/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Role object returned by the API. */
@JsonPropertyOrder({
  RoleCreateResponseData.JSON_PROPERTY_ATTRIBUTES,
  RoleCreateResponseData.JSON_PROPERTY_ID,
  RoleCreateResponseData.JSON_PROPERTY_RELATIONSHIPS,
  RoleCreateResponseData.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RoleCreateResponseData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private RoleCreateAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private RoleResponseRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private RolesType type = RolesType.ROLES;

  public RoleCreateResponseData() {}

  @JsonCreator
  public RoleCreateResponseData(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) RolesType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public RoleCreateResponseData attributes(RoleCreateAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Get attributes
   *
   * @return attributes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RoleCreateAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(RoleCreateAttributes attributes) {
    this.attributes = attributes;
  }

  public RoleCreateResponseData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the role.
   *
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RoleCreateResponseData relationships(RoleResponseRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * Get relationships
   *
   * @return relationships
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RoleResponseRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(RoleResponseRelationships relationships) {
    this.relationships = relationships;
  }

  public RoleCreateResponseData type(RolesType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RolesType getType() {
    return type;
  }

  public void setType(RolesType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this RoleCreateResponseData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleCreateResponseData roleCreateResponseData = (RoleCreateResponseData) o;
    return Objects.equals(this.attributes, roleCreateResponseData.attributes)
        && Objects.equals(this.id, roleCreateResponseData.id)
        && Objects.equals(this.relationships, roleCreateResponseData.relationships)
        && Objects.equals(this.type, roleCreateResponseData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, relationships, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleCreateResponseData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
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
