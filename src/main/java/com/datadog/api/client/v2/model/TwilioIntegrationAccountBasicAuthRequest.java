/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Username and password authentication. */
@JsonPropertyOrder({
  TwilioIntegrationAccountBasicAuthRequest.JSON_PROPERTY_AUTH_TYPE,
  TwilioIntegrationAccountBasicAuthRequest.JSON_PROPERTY_PASSWORD,
  TwilioIntegrationAccountBasicAuthRequest.JSON_PROPERTY_USERNAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TwilioIntegrationAccountBasicAuthRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH_TYPE = "auth_type";
  private TwilioIntegrationAccountBasicAuthType authType =
      TwilioIntegrationAccountBasicAuthType.BASIC;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public TwilioIntegrationAccountBasicAuthRequest() {}

  @JsonCreator
  public TwilioIntegrationAccountBasicAuthRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTH_TYPE)
          TwilioIntegrationAccountBasicAuthType authType,
      @JsonProperty(required = true, value = JSON_PROPERTY_PASSWORD) String password,
      @JsonProperty(required = true, value = JSON_PROPERTY_USERNAME) String username) {
    this.authType = authType;
    this.unparsed |= !authType.isValid();
    this.password = password;
    this.username = username;
  }

  public TwilioIntegrationAccountBasicAuthRequest authType(
      TwilioIntegrationAccountBasicAuthType authType) {
    this.authType = authType;
    this.unparsed |= !authType.isValid();
    return this;
  }

  /**
   * The authentication method type.
   *
   * @return authType
   */
  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TwilioIntegrationAccountBasicAuthType getAuthType() {
    return authType;
  }

  public void setAuthType(TwilioIntegrationAccountBasicAuthType authType) {
    if (!authType.isValid()) {
      this.unparsed = true;
    }
    this.authType = authType;
  }

  public TwilioIntegrationAccountBasicAuthRequest password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Secret password or private key.
   *
   * @return password
   */
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public TwilioIntegrationAccountBasicAuthRequest username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Non-secret username or public identifier for the credential pair.
   *
   * @return username
   */
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  /** Return true if this TwilioIntegrationAccountBasicAuthRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TwilioIntegrationAccountBasicAuthRequest twilioIntegrationAccountBasicAuthRequest =
        (TwilioIntegrationAccountBasicAuthRequest) o;
    return Objects.equals(this.authType, twilioIntegrationAccountBasicAuthRequest.authType)
        && Objects.equals(this.password, twilioIntegrationAccountBasicAuthRequest.password)
        && Objects.equals(this.username, twilioIntegrationAccountBasicAuthRequest.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, password, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwilioIntegrationAccountBasicAuthRequest {\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append('}');
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
