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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** Relationship of AuthN Mapping create object to Role. */
@ApiModel(description = "Relationship of AuthN Mapping create object to Role.")
@JsonPropertyOrder({AuthNMappingCreateRelationships.JSON_PROPERTY_ROLE})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthNMappingCreateRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ROLE = "role";
  private RelationshipToRole role;

  public AuthNMappingCreateRelationships role(RelationshipToRole role) {
    this.role = role;
    this.unparsed |= role.unparsed;
    return this;
  }

  /**
   * Get role
   *
   * @return role
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToRole getRole() {
    return role;
  }

  public void setRole(RelationshipToRole role) {
    this.role = role;
  }

  /** Return true if this AuthNMappingCreateRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthNMappingCreateRelationships authNMappingCreateRelationships =
        (AuthNMappingCreateRelationships) o;
    return Objects.equals(this.role, authNMappingCreateRelationships.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthNMappingCreateRelationships {\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
