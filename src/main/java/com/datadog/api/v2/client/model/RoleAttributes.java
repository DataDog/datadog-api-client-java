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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Attributes of the role.
 */
@ApiModel(description = "Attributes of the role.")
@JsonPropertyOrder({
  RoleAttributes.JSON_PROPERTY_CREATED_AT,
  RoleAttributes.JSON_PROPERTY_MODIFIED_AT,
  RoleAttributes.JSON_PROPERTY_NAME
})

public class RoleAttributes {
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;


   /**
   * Creation time of the role.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Creation time of the role.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * Time of last role modification.
   * @return modifiedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time of last role modification.")
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }




  public RoleAttributes name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the role.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the role.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleAttributes roleAttributes = (RoleAttributes) o;
    return Objects.equals(this.createdAt, roleAttributes.createdAt) &&
        Objects.equals(this.modifiedAt, roleAttributes.modifiedAt) &&
        Objects.equals(this.name, roleAttributes.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, modifiedAt, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

