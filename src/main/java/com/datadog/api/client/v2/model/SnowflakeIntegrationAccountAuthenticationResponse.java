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

/** Authentication configured on the Snowflake integration account. */
@JsonPropertyOrder({
  SnowflakeIntegrationAccountAuthenticationResponse.JSON_PROPERTY_AUTH_TYPE,
  SnowflakeIntegrationAccountAuthenticationResponse.JSON_PROPERTY_PRIVATE_KEY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SnowflakeIntegrationAccountAuthenticationResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH_TYPE = "auth_type";
  private SnowflakeIntegrationAccountPrivateKeyAuthType authType =
      SnowflakeIntegrationAccountPrivateKeyAuthType.SNOWFLAKE_PRIVATE_KEY;

  public static final String JSON_PROPERTY_PRIVATE_KEY_NAME = "private_key_name";
  private String privateKeyName;

  public SnowflakeIntegrationAccountAuthenticationResponse() {}

  @JsonCreator
  public SnowflakeIntegrationAccountAuthenticationResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTH_TYPE)
          SnowflakeIntegrationAccountPrivateKeyAuthType authType,
      @JsonProperty(required = true, value = JSON_PROPERTY_PRIVATE_KEY_NAME)
          String privateKeyName) {
    this.authType = authType;
    this.unparsed |= !authType.isValid();
    this.privateKeyName = privateKeyName;
  }

  public SnowflakeIntegrationAccountAuthenticationResponse authType(
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

  public SnowflakeIntegrationAccountAuthenticationResponse privateKeyName(String privateKeyName) {
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
   * @return SnowflakeIntegrationAccountAuthenticationResponse
   */
  @JsonAnySetter
  public SnowflakeIntegrationAccountAuthenticationResponse putAdditionalProperty(
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

  /** Return true if this SnowflakeIntegrationAccountAuthenticationResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnowflakeIntegrationAccountAuthenticationResponse
        snowflakeIntegrationAccountAuthenticationResponse =
            (SnowflakeIntegrationAccountAuthenticationResponse) o;
    return Objects.equals(this.authType, snowflakeIntegrationAccountAuthenticationResponse.authType)
        && Objects.equals(
            this.privateKeyName, snowflakeIntegrationAccountAuthenticationResponse.privateKeyName)
        && Objects.equals(
            this.additionalProperties,
            snowflakeIntegrationAccountAuthenticationResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, privateKeyName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnowflakeIntegrationAccountAuthenticationResponse {\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    privateKeyName: ").append(toIndentedString(privateKeyName)).append("\n");
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
