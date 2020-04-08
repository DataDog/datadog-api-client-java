/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * TODO.
 */
@ApiModel(description = "TODO.")
@JsonPropertyOrder({
  SyntheticsTestRequestBasicAuth.JSON_PROPERTY_PASSWORD,
  SyntheticsTestRequestBasicAuth.JSON_PROPERTY_USERNAME
})

public class SyntheticsTestRequestBasicAuth {
  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;


  public SyntheticsTestRequestBasicAuth password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * TODO.
   * @return password
  **/
  @ApiModelProperty(required = true, value = "TODO.")
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public SyntheticsTestRequestBasicAuth username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * TODO.
   * @return username
  **/
  @ApiModelProperty(required = true, value = "TODO.")
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestRequestBasicAuth syntheticsTestRequestBasicAuth = (SyntheticsTestRequestBasicAuth) o;
    return Objects.equals(this.password, syntheticsTestRequestBasicAuth.password) &&
        Objects.equals(this.username, syntheticsTestRequestBasicAuth.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestRequestBasicAuth {\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

