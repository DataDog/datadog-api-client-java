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
 * Private Action Runner authentication. The runner holds the credentials, so this method carries no
 * secrets; <code>connection_id</code> and <code>user_uuid</code> must be provided on every
 * submission.
 */
@JsonPropertyOrder({
  IntegrationAccountPrivateActionRunnerAuthRequest.JSON_PROPERTY_AUTH_TYPE,
  IntegrationAccountPrivateActionRunnerAuthRequest.JSON_PROPERTY_CONNECTION_ID,
  IntegrationAccountPrivateActionRunnerAuthRequest.JSON_PROPERTY_SECRET_PATH,
  IntegrationAccountPrivateActionRunnerAuthRequest.JSON_PROPERTY_USER_UUID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IntegrationAccountPrivateActionRunnerAuthRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH_TYPE = "auth_type";
  private IntegrationAccountPrivateActionRunnerAuthType authType =
      IntegrationAccountPrivateActionRunnerAuthType.PRIVATE_ACTION_RUNNER;

  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private String connectionId;

  public static final String JSON_PROPERTY_SECRET_PATH = "secret_path";
  private String secretPath;

  public static final String JSON_PROPERTY_USER_UUID = "user_uuid";
  private String userUuid;

  public IntegrationAccountPrivateActionRunnerAuthRequest() {}

  @JsonCreator
  public IntegrationAccountPrivateActionRunnerAuthRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTH_TYPE)
          IntegrationAccountPrivateActionRunnerAuthType authType,
      @JsonProperty(required = true, value = JSON_PROPERTY_CONNECTION_ID) String connectionId,
      @JsonProperty(required = true, value = JSON_PROPERTY_USER_UUID) String userUuid) {
    this.authType = authType;
    this.unparsed |= !authType.isValid();
    this.connectionId = connectionId;
    this.userUuid = userUuid;
  }

  public IntegrationAccountPrivateActionRunnerAuthRequest authType(
      IntegrationAccountPrivateActionRunnerAuthType authType) {
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
  public IntegrationAccountPrivateActionRunnerAuthType getAuthType() {
    return authType;
  }

  public void setAuthType(IntegrationAccountPrivateActionRunnerAuthType authType) {
    if (!authType.isValid()) {
      this.unparsed = true;
    }
    this.authType = authType;
  }

  public IntegrationAccountPrivateActionRunnerAuthRequest connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

  /**
   * Unique identifier of the Private Action Runner connection holding the credentials.
   *
   * @return connectionId
   */
  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }

  public IntegrationAccountPrivateActionRunnerAuthRequest secretPath(String secretPath) {
    this.secretPath = secretPath;
    return this;
  }

  /**
   * Path of the credential inside the secret backend configured on the runner.
   *
   * @return secretPath
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECRET_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSecretPath() {
    return secretPath;
  }

  public void setSecretPath(String secretPath) {
    this.secretPath = secretPath;
  }

  public IntegrationAccountPrivateActionRunnerAuthRequest userUuid(String userUuid) {
    this.userUuid = userUuid;
    return this;
  }

  /**
   * Unique identifier of the user the Private Action Runner connection belongs to.
   *
   * @return userUuid
   */
  @JsonProperty(JSON_PROPERTY_USER_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUserUuid() {
    return userUuid;
  }

  public void setUserUuid(String userUuid) {
    this.userUuid = userUuid;
  }

  /** Return true if this IntegrationAccountPrivateActionRunnerAuthRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationAccountPrivateActionRunnerAuthRequest
        integrationAccountPrivateActionRunnerAuthRequest =
            (IntegrationAccountPrivateActionRunnerAuthRequest) o;
    return Objects.equals(this.authType, integrationAccountPrivateActionRunnerAuthRequest.authType)
        && Objects.equals(
            this.connectionId, integrationAccountPrivateActionRunnerAuthRequest.connectionId)
        && Objects.equals(
            this.secretPath, integrationAccountPrivateActionRunnerAuthRequest.secretPath)
        && Objects.equals(this.userUuid, integrationAccountPrivateActionRunnerAuthRequest.userUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, connectionId, secretPath, userUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationAccountPrivateActionRunnerAuthRequest {\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    secretPath: ").append(toIndentedString(secretPath)).append("\n");
    sb.append("    userUuid: ").append(toIndentedString(userUuid)).append("\n");
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
