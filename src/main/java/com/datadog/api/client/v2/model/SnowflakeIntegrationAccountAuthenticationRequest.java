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
 * RSA key pair authentication, the only method Snowflake integration accounts support. Generate an
 * RSA key pair and assign the public key to the Snowflake user named in <code>settings.username
 * </code>. Because an update replaces this object as a whole, every required field must be sent
 * again on each update, even when only one of them is changing.
 */
@JsonPropertyOrder({
  SnowflakeIntegrationAccountAuthenticationRequest.JSON_PROPERTY_AUTH_TYPE,
  SnowflakeIntegrationAccountAuthenticationRequest.JSON_PROPERTY_PRIVATE_KEY,
  SnowflakeIntegrationAccountAuthenticationRequest.JSON_PROPERTY_PRIVATE_KEY_NAME,
  SnowflakeIntegrationAccountAuthenticationRequest.JSON_PROPERTY_PRIVATE_KEY_PASSPHRASE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SnowflakeIntegrationAccountAuthenticationRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH_TYPE = "auth_type";
  private SnowflakeIntegrationAccountPrivateKeyAuthType authType =
      SnowflakeIntegrationAccountPrivateKeyAuthType.SNOWFLAKE_PRIVATE_KEY;

  public static final String JSON_PROPERTY_PRIVATE_KEY = "private_key";
  private String privateKey;

  public static final String JSON_PROPERTY_PRIVATE_KEY_NAME = "private_key_name";
  private String privateKeyName;

  public static final String JSON_PROPERTY_PRIVATE_KEY_PASSPHRASE = "private_key_passphrase";
  private String privateKeyPassphrase;

  public SnowflakeIntegrationAccountAuthenticationRequest() {}

  @JsonCreator
  public SnowflakeIntegrationAccountAuthenticationRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTH_TYPE)
          SnowflakeIntegrationAccountPrivateKeyAuthType authType,
      @JsonProperty(required = true, value = JSON_PROPERTY_PRIVATE_KEY) String privateKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_PRIVATE_KEY_NAME)
          String privateKeyName) {
    this.authType = authType;
    this.unparsed |= !authType.isValid();
    this.privateKey = privateKey;
    this.privateKeyName = privateKeyName;
  }

  public SnowflakeIntegrationAccountAuthenticationRequest authType(
      SnowflakeIntegrationAccountPrivateKeyAuthType authType) {
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
  public SnowflakeIntegrationAccountPrivateKeyAuthType getAuthType() {
    return authType;
  }

  public void setAuthType(SnowflakeIntegrationAccountPrivateKeyAuthType authType) {
    if (!authType.isValid()) {
      this.unparsed = true;
    }
    this.authType = authType;
  }

  public SnowflakeIntegrationAccountAuthenticationRequest privateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

  /**
   * The private key, in PEM format.
   *
   * @return privateKey
   */
  @JsonProperty(JSON_PROPERTY_PRIVATE_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPrivateKey() {
    return privateKey;
  }

  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }

  public SnowflakeIntegrationAccountAuthenticationRequest privateKeyName(String privateKeyName) {
    this.privateKeyName = privateKeyName;
    return this;
  }

  /**
   * Name that distinguishes this private key from other keys in Datadog.
   *
   * @return privateKeyName
   */
  @JsonProperty(JSON_PROPERTY_PRIVATE_KEY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPrivateKeyName() {
    return privateKeyName;
  }

  public void setPrivateKeyName(String privateKeyName) {
    this.privateKeyName = privateKeyName;
  }

  public SnowflakeIntegrationAccountAuthenticationRequest privateKeyPassphrase(
      String privateKeyPassphrase) {
    this.privateKeyPassphrase = privateKeyPassphrase;
    return this;
  }

  /**
   * Passphrase that decrypts the private key. Provide it only when the key is encrypted.
   *
   * @return privateKeyPassphrase
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIVATE_KEY_PASSPHRASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPrivateKeyPassphrase() {
    return privateKeyPassphrase;
  }

  public void setPrivateKeyPassphrase(String privateKeyPassphrase) {
    this.privateKeyPassphrase = privateKeyPassphrase;
  }

  /** Return true if this SnowflakeIntegrationAccountAuthenticationRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnowflakeIntegrationAccountAuthenticationRequest
        snowflakeIntegrationAccountAuthenticationRequest =
            (SnowflakeIntegrationAccountAuthenticationRequest) o;
    return Objects.equals(this.authType, snowflakeIntegrationAccountAuthenticationRequest.authType)
        && Objects.equals(
            this.privateKey, snowflakeIntegrationAccountAuthenticationRequest.privateKey)
        && Objects.equals(
            this.privateKeyName, snowflakeIntegrationAccountAuthenticationRequest.privateKeyName)
        && Objects.equals(
            this.privateKeyPassphrase,
            snowflakeIntegrationAccountAuthenticationRequest.privateKeyPassphrase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, privateKey, privateKeyName, privateKeyPassphrase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnowflakeIntegrationAccountAuthenticationRequest {\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    privateKeyName: ").append(toIndentedString(privateKeyName)).append("\n");
    sb.append("    privateKeyPassphrase: ")
        .append(toIndentedString(privateKeyPassphrase))
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
