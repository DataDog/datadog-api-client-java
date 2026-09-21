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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * RSA key pair authentication, the only method Snowflake integration accounts support. Only the
 * fields provided are changed; omit <code>private_key</code> to keep the stored one.
 */
@JsonPropertyOrder({
  SnowflakeIntegrationAccountPrivateKeyAuthUpdate.JSON_PROPERTY_AUTH_TYPE,
  SnowflakeIntegrationAccountPrivateKeyAuthUpdate.JSON_PROPERTY_PRIVATE_KEY,
  SnowflakeIntegrationAccountPrivateKeyAuthUpdate.JSON_PROPERTY_PRIVATE_KEY_NAME,
  SnowflakeIntegrationAccountPrivateKeyAuthUpdate.JSON_PROPERTY_PRIVATE_KEY_PASSPHRASE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SnowflakeIntegrationAccountPrivateKeyAuthUpdate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH_TYPE = "auth_type";
  private SnowflakeIntegrationAccountPrivateKeyAuthType authType =
      SnowflakeIntegrationAccountPrivateKeyAuthType.SNOWFLAKE_PRIVATE_KEY;

  public static final String JSON_PROPERTY_PRIVATE_KEY = "private_key";
  private String privateKey;

  public static final String JSON_PROPERTY_PRIVATE_KEY_NAME = "private_key_name";
  private String privateKeyName;

  public static final String JSON_PROPERTY_PRIVATE_KEY_PASSPHRASE = "private_key_passphrase";
  private JsonNullable<String> privateKeyPassphrase = JsonNullable.<String>undefined();

  public SnowflakeIntegrationAccountPrivateKeyAuthUpdate() {}

  @JsonCreator
  public SnowflakeIntegrationAccountPrivateKeyAuthUpdate(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTH_TYPE)
          SnowflakeIntegrationAccountPrivateKeyAuthType authType) {
    this.authType = authType;
    this.unparsed |= !authType.isValid();
  }

  public SnowflakeIntegrationAccountPrivateKeyAuthUpdate authType(
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

  public SnowflakeIntegrationAccountPrivateKeyAuthUpdate privateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

  /**
   * The private key, in PEM format.
   *
   * @return privateKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIVATE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPrivateKey() {
    return privateKey;
  }

  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }

  public SnowflakeIntegrationAccountPrivateKeyAuthUpdate privateKeyName(String privateKeyName) {
    this.privateKeyName = privateKeyName;
    return this;
  }

  /**
   * Name that distinguishes this private key from other keys in Datadog.
   *
   * @return privateKeyName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIVATE_KEY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPrivateKeyName() {
    return privateKeyName;
  }

  public void setPrivateKeyName(String privateKeyName) {
    this.privateKeyName = privateKeyName;
  }

  public SnowflakeIntegrationAccountPrivateKeyAuthUpdate privateKeyPassphrase(
      String privateKeyPassphrase) {
    this.privateKeyPassphrase = JsonNullable.<String>of(privateKeyPassphrase);
    return this;
  }

  /**
   * Passphrase that decrypts the private key. Provide it only when the key is encrypted. Omit it to
   * keep the stored passphrase, send <code>null</code> or an empty string to remove it, or send a
   * value to replace it.
   *
   * @return privateKeyPassphrase
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getPrivateKeyPassphrase() {
    return privateKeyPassphrase.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRIVATE_KEY_PASSPHRASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getPrivateKeyPassphrase_JsonNullable() {
    return privateKeyPassphrase;
  }

  @JsonProperty(JSON_PROPERTY_PRIVATE_KEY_PASSPHRASE)
  public void setPrivateKeyPassphrase_JsonNullable(JsonNullable<String> privateKeyPassphrase) {
    this.privateKeyPassphrase = privateKeyPassphrase;
  }

  public void setPrivateKeyPassphrase(String privateKeyPassphrase) {
    this.privateKeyPassphrase = JsonNullable.<String>of(privateKeyPassphrase);
  }

  /** Return true if this SnowflakeIntegrationAccountPrivateKeyAuthUpdate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnowflakeIntegrationAccountPrivateKeyAuthUpdate
        snowflakeIntegrationAccountPrivateKeyAuthUpdate =
            (SnowflakeIntegrationAccountPrivateKeyAuthUpdate) o;
    return Objects.equals(this.authType, snowflakeIntegrationAccountPrivateKeyAuthUpdate.authType)
        && Objects.equals(
            this.privateKey, snowflakeIntegrationAccountPrivateKeyAuthUpdate.privateKey)
        && Objects.equals(
            this.privateKeyName, snowflakeIntegrationAccountPrivateKeyAuthUpdate.privateKeyName)
        && Objects.equals(
            this.privateKeyPassphrase,
            snowflakeIntegrationAccountPrivateKeyAuthUpdate.privateKeyPassphrase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, privateKey, privateKeyName, privateKeyPassphrase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnowflakeIntegrationAccountPrivateKeyAuthUpdate {\n");
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
