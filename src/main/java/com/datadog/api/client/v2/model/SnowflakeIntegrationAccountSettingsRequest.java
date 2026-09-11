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

/** Settings for creating the Snowflake integration account. */
@JsonPropertyOrder({
  SnowflakeIntegrationAccountSettingsRequest.JSON_PROPERTY_SNOWFLAKE_ACCOUNT_IDENTIFIER,
  SnowflakeIntegrationAccountSettingsRequest.JSON_PROPERTY_USERNAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SnowflakeIntegrationAccountSettingsRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SNOWFLAKE_ACCOUNT_IDENTIFIER =
      "snowflake_account_identifier";
  private String snowflakeAccountIdentifier;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public SnowflakeIntegrationAccountSettingsRequest() {}

  @JsonCreator
  public SnowflakeIntegrationAccountSettingsRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_SNOWFLAKE_ACCOUNT_IDENTIFIER)
          String snowflakeAccountIdentifier,
      @JsonProperty(required = true, value = JSON_PROPERTY_USERNAME) String username) {
    this.snowflakeAccountIdentifier = snowflakeAccountIdentifier;
    this.username = username;
  }

  public SnowflakeIntegrationAccountSettingsRequest snowflakeAccountIdentifier(
      String snowflakeAccountIdentifier) {
    this.snowflakeAccountIdentifier = snowflakeAccountIdentifier;
    return this;
  }

  /**
   * Identifier of the Snowflake account to monitor, either as <code>organization-account</code> or
   * as the legacy <code>account_name.region_id.cloud_provider</code> account locator. An account
   * identifier can be configured once per Datadog organization; reusing one is rejected with a
   * <code>422</code> response. Accounts reached through AWS PrivateLink are not supported.
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

  public SnowflakeIntegrationAccountSettingsRequest username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Snowflake user Datadog authenticates as. Create a dedicated user for Datadog and grant it a
   * role with access to the data you want to collect.
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

  /** Return true if this SnowflakeIntegrationAccountSettingsRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnowflakeIntegrationAccountSettingsRequest snowflakeIntegrationAccountSettingsRequest =
        (SnowflakeIntegrationAccountSettingsRequest) o;
    return Objects.equals(
            this.snowflakeAccountIdentifier,
            snowflakeIntegrationAccountSettingsRequest.snowflakeAccountIdentifier)
        && Objects.equals(this.username, snowflakeIntegrationAccountSettingsRequest.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snowflakeAccountIdentifier, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnowflakeIntegrationAccountSettingsRequest {\n");
    sb.append("    snowflakeAccountIdentifier: ")
        .append(toIndentedString(snowflakeAccountIdentifier))
        .append("\n");
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
