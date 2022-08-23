/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Data related to the creation of a role. */
@JsonPropertyOrder({
  RoleCreateData.JSON_PROPERTY_ATTRIBUTES,
  RoleCreateData.JSON_PROPERTY_RELATIONSHIPS,
  RoleCreateData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RoleCreateData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private RoleCreateAttributes attributes;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private RoleRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private RolesType type = RolesType.ROLES;

  public RoleCreateData() {}

  @JsonCreator
  public RoleCreateData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          RoleCreateAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
  }

  public RoleCreateData attributes(RoleCreateAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes of the created role.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RoleCreateAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(RoleCreateAttributes attributes) {
    this.attributes = attributes;
  }

  public RoleCreateData relationships(RoleRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * Relationships of the role object.
   *
   * @return relationships
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RoleRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(RoleRelationships relationships) {
    this.relationships = relationships;
  }

  public RoleCreateData type(RolesType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Roles type.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RolesType getType() {
    return type;
  }

  public void setType(RolesType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this RoleCreateData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleCreateData roleCreateData = (RoleCreateData) o;
    return Objects.equals(this.attributes, roleCreateData.attributes)
        && Objects.equals(this.relationships, roleCreateData.relationships)
        && Objects.equals(this.type, roleCreateData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, relationships, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleCreateData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
