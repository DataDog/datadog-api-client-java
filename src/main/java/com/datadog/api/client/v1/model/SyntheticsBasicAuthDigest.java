/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>Object to handle digest authentication when performing the test.</p>
 */
@JsonPropertyOrder({
  SyntheticsBasicAuthDigest.JSON_PROPERTY_PASSWORD,
  SyntheticsBasicAuthDigest.JSON_PROPERTY_TYPE,
  SyntheticsBasicAuthDigest.JSON_PROPERTY_USERNAME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsBasicAuthDigest {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SyntheticsBasicAuthDigestType type = SyntheticsBasicAuthDigestType.DIGEST;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public SyntheticsBasicAuthDigest() {}

  @JsonCreator
  public SyntheticsBasicAuthDigest(
            @JsonProperty(required=true, value=JSON_PROPERTY_PASSWORD)String password,
            @JsonProperty(required=true, value=JSON_PROPERTY_USERNAME)String username) {
        this.password = password;
        this.username = username;
  }
  public SyntheticsBasicAuthDigest password(String password) {
    this.password = password;
    return this;
  }

  /**
   * <p>Password to use for the digest authentication.</p>
   * @return password
  **/
      @JsonProperty(JSON_PROPERTY_PASSWORD)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getPassword() {
        return password;
      }
  public void setPassword(String password) {
    this.password = password;
  }
  public SyntheticsBasicAuthDigest type(SyntheticsBasicAuthDigestType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The type of basic authentication to use when performing the test.</p>
   * @return type
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsBasicAuthDigestType getType() {
        return type;
      }
  public void setType(SyntheticsBasicAuthDigestType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }
  public SyntheticsBasicAuthDigest username(String username) {
    this.username = username;
    return this;
  }

  /**
   * <p>Username to use for the digest authentication.</p>
   * @return username
  **/
      @JsonProperty(JSON_PROPERTY_USERNAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getUsername() {
        return username;
      }
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Return true if this SyntheticsBasicAuthDigest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsBasicAuthDigest syntheticsBasicAuthDigest = (SyntheticsBasicAuthDigest) o;
    return Objects.equals(this.password, syntheticsBasicAuthDigest.password) && Objects.equals(this.type, syntheticsBasicAuthDigest.type) && Objects.equals(this.username, syntheticsBasicAuthDigest.username);
  }


  @Override
  public int hashCode() {
    return Objects.hash(password,type,username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsBasicAuthDigest {\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
