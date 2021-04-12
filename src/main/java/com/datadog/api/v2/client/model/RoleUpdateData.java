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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** Data related to the update of a role. */
@ApiModel(description = "Data related to the update of a role.")
@JsonPropertyOrder({
  RoleUpdateData.JSON_PROPERTY_ATTRIBUTES,
  RoleUpdateData.JSON_PROPERTY_ID,
  RoleUpdateData.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RoleUpdateData {
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private RoleUpdateAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private RolesType type = RolesType.ROLES;

  public RoleUpdateData attributes(RoleUpdateAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Get attributes
   *
   * @return attributes
   */
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RoleUpdateAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(RoleUpdateAttributes attributes) {
    this.attributes = attributes;
  }

  public RoleUpdateData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the role.
   *
   * @return id
   */
  @ApiModelProperty(
      example = "00000000-0000-0000-0000-000000000000",
      required = true,
      value = "ID of the role.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RoleUpdateData type(RolesType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RolesType getType() {
    return type;
  }

  public void setType(RolesType type) {
    this.type = type;
  }

  /** Return true if this RoleUpdateData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleUpdateData roleUpdateData = (RoleUpdateData) o;
    return Objects.equals(this.attributes, roleUpdateData.attributes)
        && Objects.equals(this.id, roleUpdateData.id)
        && Objects.equals(this.type, roleUpdateData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleUpdateData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
