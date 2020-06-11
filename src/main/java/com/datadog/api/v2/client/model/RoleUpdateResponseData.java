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

import java.util.Objects;
import java.util.Arrays;
import com.datadog.api.v2.client.model.RoleResponseRelationships;
import com.datadog.api.v2.client.model.RoleUpdateAttributes;
import com.datadog.api.v2.client.model.RolesType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Role object returned by the API.
 */
@ApiModel(description = "Role object returned by the API.")
@JsonPropertyOrder({
  RoleUpdateResponseData.JSON_PROPERTY_ATTRIBUTES,
  RoleUpdateResponseData.JSON_PROPERTY_ID,
  RoleUpdateResponseData.JSON_PROPERTY_RELATIONSHIPS,
  RoleUpdateResponseData.JSON_PROPERTY_TYPE
})

public class RoleUpdateResponseData {
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private RoleUpdateAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private RoleResponseRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private RolesType type = RolesType.ROLES;


  public RoleUpdateResponseData attributes(RoleUpdateAttributes attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RoleUpdateAttributes getAttributes() {
    return attributes;
  }


  public void setAttributes(RoleUpdateAttributes attributes) {
    this.attributes = attributes;
  }


  public RoleUpdateResponseData id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the role.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the role.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public RoleUpdateResponseData relationships(RoleResponseRelationships relationships) {
    
    this.relationships = relationships;
    return this;
  }

   /**
   * Get relationships
   * @return relationships
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RoleResponseRelationships getRelationships() {
    return relationships;
  }


  public void setRelationships(RoleResponseRelationships relationships) {
    this.relationships = relationships;
  }


  public RoleUpdateResponseData type(RolesType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RolesType getType() {
    return type;
  }


  public void setType(RolesType type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleUpdateResponseData roleUpdateResponseData = (RoleUpdateResponseData) o;
    return Objects.equals(this.attributes, roleUpdateResponseData.attributes) &&
        Objects.equals(this.id, roleUpdateResponseData.id) &&
        Objects.equals(this.relationships, roleUpdateResponseData.relationships) &&
        Objects.equals(this.type, roleUpdateResponseData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, relationships, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleUpdateResponseData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

