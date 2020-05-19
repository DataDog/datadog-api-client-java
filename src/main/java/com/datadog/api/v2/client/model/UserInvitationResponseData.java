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
import com.datadog.api.v2.client.model.UserInvitationDataAttributes;
import com.datadog.api.v2.client.model.UserInvitationsType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object of a user invitation returned by the API.
 */
@ApiModel(description = "Object of a user invitation returned by the API.")
@JsonPropertyOrder({
  UserInvitationResponseData.JSON_PROPERTY_ATTRIBUTES,
  UserInvitationResponseData.JSON_PROPERTY_ID,
  UserInvitationResponseData.JSON_PROPERTY_TYPE
})

public class UserInvitationResponseData {
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private UserInvitationDataAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private UserInvitationsType type = UserInvitationsType.USER_INVITATIONS;


  public UserInvitationResponseData attributes(UserInvitationDataAttributes attributes) {
    
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

  public UserInvitationDataAttributes getAttributes() {
    return attributes;
  }


  public void setAttributes(UserInvitationDataAttributes attributes) {
    this.attributes = attributes;
  }


  public UserInvitationResponseData id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the user invitation.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the user invitation.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public UserInvitationResponseData type(UserInvitationsType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserInvitationsType getType() {
    return type;
  }


  public void setType(UserInvitationsType type) {
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
    UserInvitationResponseData userInvitationResponseData = (UserInvitationResponseData) o;
    return Objects.equals(this.attributes, userInvitationResponseData.attributes) &&
        Objects.equals(this.id, userInvitationResponseData.id) &&
        Objects.equals(this.type, userInvitationResponseData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInvitationResponseData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

