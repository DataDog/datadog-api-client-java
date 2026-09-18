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
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Private Action Runner authentication. The runner holds the Databricks credentials, so this method
 * carries no secrets. Only the fields provided are changed.
 */
@JsonPropertyOrder({
  DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate.JSON_PROPERTY_AUTH_TYPE,
  DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate.JSON_PROPERTY_CONNECTION_ID,
  DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate.JSON_PROPERTY_SECRET_PATH,
  DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate.JSON_PROPERTY_USER_UUID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH_TYPE = "auth_type";
  private DatabricksIntegrationAccountPrivateActionRunnerAuthType authType =
      DatabricksIntegrationAccountPrivateActionRunnerAuthType.PRIVATE_ACTION_RUNNER;

  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private UUID connectionId;

  public static final String JSON_PROPERTY_SECRET_PATH = "secret_path";
  private JsonNullable<String> secretPath = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_USER_UUID = "user_uuid";
  private UUID userUuid;

  public DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate() {}

  @JsonCreator
  public DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTH_TYPE)
          DatabricksIntegrationAccountPrivateActionRunnerAuthType authType) {
    this.authType = authType;
    this.unparsed |= !authType.isValid();
  }

  public DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate authType(
      DatabricksIntegrationAccountPrivateActionRunnerAuthType authType) {
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
  public DatabricksIntegrationAccountPrivateActionRunnerAuthType getAuthType() {
    return authType;
  }

  public void setAuthType(DatabricksIntegrationAccountPrivateActionRunnerAuthType authType) {
    if (!authType.isValid()) {
      this.unparsed = true;
    }
    this.authType = authType;
  }

  public DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate connectionId(UUID connectionId) {
    this.connectionId = connectionId;
    return this;
  }

  /**
   * Unique identifier of the Private Action Runner connection holding the credentials.
   *
   * @return connectionId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(UUID connectionId) {
    this.connectionId = connectionId;
  }

  public DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate secretPath(String secretPath) {
    this.secretPath = JsonNullable.<String>of(secretPath);
    return this;
  }

  /**
   * Path of the credential inside the secret backend configured on the runner. Omit it to keep the
   * stored path, send <code>null</code> or an empty string to remove it, or send a value to replace
   * it.
   *
   * @return secretPath
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getSecretPath() {
    return secretPath.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SECRET_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSecretPath_JsonNullable() {
    return secretPath;
  }

  @JsonProperty(JSON_PROPERTY_SECRET_PATH)
  public void setSecretPath_JsonNullable(JsonNullable<String> secretPath) {
    this.secretPath = secretPath;
  }

  public void setSecretPath(String secretPath) {
    this.secretPath = JsonNullable.<String>of(secretPath);
  }

  public DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate userUuid(UUID userUuid) {
    this.userUuid = userUuid;
    return this;
  }

  /**
   * Unique identifier of the user the Private Action Runner connection belongs to.
   *
   * @return userUuid
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getUserUuid() {
    return userUuid;
  }

  public void setUserUuid(UUID userUuid) {
    this.userUuid = userUuid;
  }

  /**
   * Return true if this DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate object is equal
   * to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate
        databricksIntegrationAccountPrivateActionRunnerAuthUpdate =
            (DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate) o;
    return Objects.equals(
            this.authType, databricksIntegrationAccountPrivateActionRunnerAuthUpdate.authType)
        && Objects.equals(
            this.connectionId,
            databricksIntegrationAccountPrivateActionRunnerAuthUpdate.connectionId)
        && Objects.equals(
            this.secretPath, databricksIntegrationAccountPrivateActionRunnerAuthUpdate.secretPath)
        && Objects.equals(
            this.userUuid, databricksIntegrationAccountPrivateActionRunnerAuthUpdate.userUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, connectionId, secretPath, userUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate {\n");
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
