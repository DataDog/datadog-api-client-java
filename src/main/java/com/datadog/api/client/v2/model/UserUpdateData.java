/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Object to update a user.</p>
 */
@JsonPropertyOrder({
  UserUpdateData.JSON_PROPERTY_ATTRIBUTES,
  UserUpdateData.JSON_PROPERTY_ID,
  UserUpdateData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UserUpdateData {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private UserUpdateAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private UsersType type = UsersType.USERS;

  public UserUpdateData() {}

  @JsonCreator
  public UserUpdateData(
            @JsonProperty(required=true, value=JSON_PROPERTY_ATTRIBUTES)UserUpdateAttributes attributes,
            @JsonProperty(required=true, value=JSON_PROPERTY_ID)String id,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)UsersType type) {
        this.attributes = attributes;
        this.unparsed |= attributes.unparsed;
        this.id = id;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public UserUpdateData attributes(UserUpdateAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * <p>Attributes of the edited user.</p>
   * @return attributes
  **/
      @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public UserUpdateAttributes getAttributes() {
        return attributes;
      }
  public void setAttributes(UserUpdateAttributes attributes) {
    this.attributes = attributes;
  }
  public UserUpdateData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>ID of the user.</p>
   * @return id
  **/
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getId() {
        return id;
      }
  public void setId(String id) {
    this.id = id;
  }
  public UserUpdateData type(UsersType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Users resource type.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public UsersType getType() {
        return type;
      }
  public void setType(UsersType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * Return true if this UserUpdateData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserUpdateData userUpdateData = (UserUpdateData) o;
    return Objects.equals(this.attributes, userUpdateData.attributes) && Objects.equals(this.id, userUpdateData.id) && Objects.equals(this.type, userUpdateData.type);
  }


  @Override
  public int hashCode() {
    return Objects.hash(attributes,id,type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUpdateData {\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
