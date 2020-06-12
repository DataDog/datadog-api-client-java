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
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v2.client.JSON;


/**
 * Attributes of the created user.
 */
@ApiModel(description = "Attributes of the created user.")
@JsonPropertyOrder({
  UserCreateAttributes.JSON_PROPERTY_EMAIL,
  UserCreateAttributes.JSON_PROPERTY_NAME,
  UserCreateAttributes.JSON_PROPERTY_TITLE
})

public class UserCreateAttributes {
  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;


  public UserCreateAttributes email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email of the user.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email of the user.")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public UserCreateAttributes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the user.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the user.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UserCreateAttributes title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the user.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The title of the user.")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCreateAttributes userCreateAttributes = (UserCreateAttributes) o;
    return Objects.equals(this.email, userCreateAttributes.email) &&
        Objects.equals(this.name, userCreateAttributes.name) &&
        Objects.equals(this.title, userCreateAttributes.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, name, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCreateAttributes {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

