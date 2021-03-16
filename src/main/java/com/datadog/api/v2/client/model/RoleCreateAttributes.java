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
import java.time.OffsetDateTime;
import java.util.Objects;

/** Attributes of the created role. */
@ApiModel(description = "Attributes of the created role.")
@JsonPropertyOrder({
  RoleCreateAttributes.JSON_PROPERTY_CREATED_AT,
  RoleCreateAttributes.JSON_PROPERTY_MODIFIED_AT,
  RoleCreateAttributes.JSON_PROPERTY_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RoleCreateAttributes {
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  /**
   * Creation time of the role.
   *
   * @return createdAt
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Creation time of the role.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  /**
   * Time of last role modification.
   *
   * @return modifiedAt
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time of last role modification.")
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public RoleCreateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the role.
   *
   * @return name
   */
  @ApiModelProperty(example = "developers", required = true, value = "Name of the role.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /** Return true if this RoleCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleCreateAttributes roleCreateAttributes = (RoleCreateAttributes) o;
    return Objects.equals(this.createdAt, roleCreateAttributes.createdAt)
        && Objects.equals(this.modifiedAt, roleCreateAttributes.modifiedAt)
        && Objects.equals(this.name, roleCreateAttributes.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, modifiedAt, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleCreateAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
