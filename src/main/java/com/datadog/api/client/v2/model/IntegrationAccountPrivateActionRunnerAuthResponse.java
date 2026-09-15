/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** The Private Action Runner authentication method configured on the account. */
@JsonPropertyOrder({
  IntegrationAccountPrivateActionRunnerAuthResponse.JSON_PROPERTY_AUTH_TYPE,
  IntegrationAccountPrivateActionRunnerAuthResponse.JSON_PROPERTY_CONNECTION_ID,
  IntegrationAccountPrivateActionRunnerAuthResponse.JSON_PROPERTY_SECRET_PATH,
  IntegrationAccountPrivateActionRunnerAuthResponse.JSON_PROPERTY_USER_UUID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IntegrationAccountPrivateActionRunnerAuthResponse {
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

  public IntegrationAccountPrivateActionRunnerAuthResponse() {}

  @JsonCreator
  public IntegrationAccountPrivateActionRunnerAuthResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTH_TYPE)
          IntegrationAccountPrivateActionRunnerAuthType authType,
      @JsonProperty(required = true, value = JSON_PROPERTY_CONNECTION_ID) String connectionId,
      @JsonProperty(required = true, value = JSON_PROPERTY_USER_UUID) String userUuid) {
    this.authType = authType;
    this.unparsed |= !authType.isValid();
    this.connectionId = connectionId;
    this.userUuid = userUuid;
  }

  public IntegrationAccountPrivateActionRunnerAuthResponse authType(
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

  public IntegrationAccountPrivateActionRunnerAuthResponse connectionId(String connectionId) {
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

  public IntegrationAccountPrivateActionRunnerAuthResponse secretPath(String secretPath) {
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

  public IntegrationAccountPrivateActionRunnerAuthResponse userUuid(String userUuid) {
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

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return IntegrationAccountPrivateActionRunnerAuthResponse
   */
  @JsonAnySetter
  public IntegrationAccountPrivateActionRunnerAuthResponse putAdditionalProperty(
      String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  /** Return true if this IntegrationAccountPrivateActionRunnerAuthResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationAccountPrivateActionRunnerAuthResponse
        integrationAccountPrivateActionRunnerAuthResponse =
            (IntegrationAccountPrivateActionRunnerAuthResponse) o;
    return Objects.equals(this.authType, integrationAccountPrivateActionRunnerAuthResponse.authType)
        && Objects.equals(
            this.connectionId, integrationAccountPrivateActionRunnerAuthResponse.connectionId)
        && Objects.equals(
            this.secretPath, integrationAccountPrivateActionRunnerAuthResponse.secretPath)
        && Objects.equals(this.userUuid, integrationAccountPrivateActionRunnerAuthResponse.userUuid)
        && Objects.equals(
            this.additionalProperties,
            integrationAccountPrivateActionRunnerAuthResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, connectionId, secretPath, userUuid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationAccountPrivateActionRunnerAuthResponse {\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    secretPath: ").append(toIndentedString(secretPath)).append("\n");
    sb.append("    userUuid: ").append(toIndentedString(userUuid)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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
