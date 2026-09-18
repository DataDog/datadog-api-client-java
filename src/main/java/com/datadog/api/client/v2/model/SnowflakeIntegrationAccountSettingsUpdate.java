/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/**
 * Settings for updating the Snowflake integration account. Only the fields provided are changed.
 */
@JsonPropertyOrder({
  SnowflakeIntegrationAccountSettingsUpdate.JSON_PROPERTY_SNOWFLAKE_ACCOUNT_IDENTIFIER,
  SnowflakeIntegrationAccountSettingsUpdate.JSON_PROPERTY_USERNAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SnowflakeIntegrationAccountSettingsUpdate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SNOWFLAKE_ACCOUNT_IDENTIFIER =
      "snowflake_account_identifier";
  private String snowflakeAccountIdentifier;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public SnowflakeIntegrationAccountSettingsUpdate snowflakeAccountIdentifier(
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNOWFLAKE_ACCOUNT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSnowflakeAccountIdentifier() {
    return snowflakeAccountIdentifier;
  }

  public void setSnowflakeAccountIdentifier(String snowflakeAccountIdentifier) {
    this.snowflakeAccountIdentifier = snowflakeAccountIdentifier;
  }

  public SnowflakeIntegrationAccountSettingsUpdate username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Snowflake user Datadog authenticates as. Create a dedicated user for Datadog and grant it a
   * role with access to the data you want to collect.
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

  /** Return true if this SnowflakeIntegrationAccountSettingsUpdate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnowflakeIntegrationAccountSettingsUpdate snowflakeIntegrationAccountSettingsUpdate =
        (SnowflakeIntegrationAccountSettingsUpdate) o;
    return Objects.equals(
            this.snowflakeAccountIdentifier,
            snowflakeIntegrationAccountSettingsUpdate.snowflakeAccountIdentifier)
        && Objects.equals(this.username, snowflakeIntegrationAccountSettingsUpdate.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snowflakeAccountIdentifier, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnowflakeIntegrationAccountSettingsUpdate {\n");
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
