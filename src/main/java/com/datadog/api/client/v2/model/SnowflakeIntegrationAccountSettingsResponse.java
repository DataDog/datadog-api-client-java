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

/** Settings configured on the Snowflake integration account. */
@JsonPropertyOrder({
  SnowflakeIntegrationAccountSettingsResponse.JSON_PROPERTY_SNOWFLAKE_ACCOUNT_IDENTIFIER,
  SnowflakeIntegrationAccountSettingsResponse.JSON_PROPERTY_USERNAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SnowflakeIntegrationAccountSettingsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SNOWFLAKE_ACCOUNT_IDENTIFIER =
      "snowflake_account_identifier";
  private String snowflakeAccountIdentifier;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public SnowflakeIntegrationAccountSettingsResponse() {}

  @JsonCreator
  public SnowflakeIntegrationAccountSettingsResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_SNOWFLAKE_ACCOUNT_IDENTIFIER)
          String snowflakeAccountIdentifier,
      @JsonProperty(required = true, value = JSON_PROPERTY_USERNAME) String username) {
    this.snowflakeAccountIdentifier = snowflakeAccountIdentifier;
    this.username = username;
  }

  public SnowflakeIntegrationAccountSettingsResponse snowflakeAccountIdentifier(
      String snowflakeAccountIdentifier) {
    this.snowflakeAccountIdentifier = snowflakeAccountIdentifier;
    return this;
  }

  /**
   * Identifier of the Snowflake account being monitored.
   *
   * @return snowflakeAccountIdentifier
   */
  @JsonProperty(JSON_PROPERTY_SNOWFLAKE_ACCOUNT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSnowflakeAccountIdentifier() {
    return snowflakeAccountIdentifier;
  }

  public void setSnowflakeAccountIdentifier(String snowflakeAccountIdentifier) {
    this.snowflakeAccountIdentifier = snowflakeAccountIdentifier;
  }

  public SnowflakeIntegrationAccountSettingsResponse username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Snowflake user Datadog authenticates as.
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
   * @return SnowflakeIntegrationAccountSettingsResponse
   */
  @JsonAnySetter
  public SnowflakeIntegrationAccountSettingsResponse putAdditionalProperty(
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

  /** Return true if this SnowflakeIntegrationAccountSettingsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnowflakeIntegrationAccountSettingsResponse snowflakeIntegrationAccountSettingsResponse =
        (SnowflakeIntegrationAccountSettingsResponse) o;
    return Objects.equals(
            this.snowflakeAccountIdentifier,
            snowflakeIntegrationAccountSettingsResponse.snowflakeAccountIdentifier)
        && Objects.equals(this.username, snowflakeIntegrationAccountSettingsResponse.username)
        && Objects.equals(
            this.additionalProperties,
            snowflakeIntegrationAccountSettingsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snowflakeAccountIdentifier, username, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnowflakeIntegrationAccountSettingsResponse {\n");
    sb.append("    snowflakeAccountIdentifier: ")
        .append(toIndentedString(snowflakeAccountIdentifier))
        .append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
