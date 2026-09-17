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

/**
 * Username and password authentication. Only the fields provided are changed; omit <code>password
 * </code> to keep the stored one.
 */
@JsonPropertyOrder({
  ElasticCloudIntegrationAccountBasicAuthUpdate.JSON_PROPERTY_AUTH_TYPE,
  ElasticCloudIntegrationAccountBasicAuthUpdate.JSON_PROPERTY_PASSWORD,
  ElasticCloudIntegrationAccountBasicAuthUpdate.JSON_PROPERTY_USERNAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ElasticCloudIntegrationAccountBasicAuthUpdate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH_TYPE = "auth_type";
  private ElasticCloudIntegrationAccountBasicAuthType authType =
      ElasticCloudIntegrationAccountBasicAuthType.BASIC;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public ElasticCloudIntegrationAccountBasicAuthUpdate() {}

  @JsonCreator
  public ElasticCloudIntegrationAccountBasicAuthUpdate(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTH_TYPE)
          ElasticCloudIntegrationAccountBasicAuthType authType) {
    this.authType = authType;
    this.unparsed |= !authType.isValid();
  }

  public ElasticCloudIntegrationAccountBasicAuthUpdate authType(
      ElasticCloudIntegrationAccountBasicAuthType authType) {
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
  public ElasticCloudIntegrationAccountBasicAuthType getAuthType() {
    return authType;
  }

  public void setAuthType(ElasticCloudIntegrationAccountBasicAuthType authType) {
    if (!authType.isValid()) {
      this.unparsed = true;
    }
    this.authType = authType;
  }

  public ElasticCloudIntegrationAccountBasicAuthUpdate password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Secret password or private key.
   *
   * @return password
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ElasticCloudIntegrationAccountBasicAuthUpdate username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Non-secret username or public identifier for the credential pair.
   *
   * @return username
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  /** Return true if this ElasticCloudIntegrationAccountBasicAuthUpdate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElasticCloudIntegrationAccountBasicAuthUpdate elasticCloudIntegrationAccountBasicAuthUpdate =
        (ElasticCloudIntegrationAccountBasicAuthUpdate) o;
    return Objects.equals(this.authType, elasticCloudIntegrationAccountBasicAuthUpdate.authType)
        && Objects.equals(this.password, elasticCloudIntegrationAccountBasicAuthUpdate.password)
        && Objects.equals(this.username, elasticCloudIntegrationAccountBasicAuthUpdate.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, password, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElasticCloudIntegrationAccountBasicAuthUpdate {\n");
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
