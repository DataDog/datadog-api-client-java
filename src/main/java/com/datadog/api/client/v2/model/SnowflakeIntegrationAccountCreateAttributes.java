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

/** Writable attributes used to create a Snowflake integration account. */
@JsonPropertyOrder({
  SnowflakeIntegrationAccountCreateAttributes.JSON_PROPERTY_AUTHENTICATION,
  SnowflakeIntegrationAccountCreateAttributes.JSON_PROPERTY_DATAFLOWS,
  SnowflakeIntegrationAccountCreateAttributes.JSON_PROPERTY_NAME,
  SnowflakeIntegrationAccountCreateAttributes.JSON_PROPERTY_SETTINGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SnowflakeIntegrationAccountCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHENTICATION = "authentication";
  private SnowflakeIntegrationAccountAuthenticationRequest authentication;

  public static final String JSON_PROPERTY_DATAFLOWS = "dataflows";
  private SnowflakeIntegrationDataflowsRequest dataflows;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private SnowflakeIntegrationAccountSettingsRequest settings;

  public SnowflakeIntegrationAccountCreateAttributes() {}

  @JsonCreator
  public SnowflakeIntegrationAccountCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTHENTICATION)
          SnowflakeIntegrationAccountAuthenticationRequest authentication,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SETTINGS)
          SnowflakeIntegrationAccountSettingsRequest settings) {
    this.authentication = authentication;
    this.unparsed |= authentication.unparsed;
    this.name = name;
    this.settings = settings;
    this.unparsed |= settings.unparsed;
  }

  public SnowflakeIntegrationAccountCreateAttributes authentication(
      SnowflakeIntegrationAccountAuthenticationRequest authentication) {
    this.authentication = authentication;
    this.unparsed |= authentication.unparsed;
    return this;
  }

  /**
   * RSA key pair authentication, the only method Snowflake integration accounts support. Generate
   * an RSA key pair and assign the public key to the Snowflake user named in <code>
   * settings.username</code>. Because an update replaces this object as a whole, every required
   * field must be sent again on each update, even when only one of them is changing.
   *
   * @return authentication
   */
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SnowflakeIntegrationAccountAuthenticationRequest getAuthentication() {
    return authentication;
  }

  public void setAuthentication(SnowflakeIntegrationAccountAuthenticationRequest authentication) {
    this.authentication = authentication;
    if (authentication != null) {
      this.unparsed |= authentication.unparsed;
    }
  }

  public SnowflakeIntegrationAccountCreateAttributes dataflows(
      SnowflakeIntegrationDataflowsRequest dataflows) {
    this.dataflows = dataflows;
    this.unparsed |= dataflows.unparsed;
    return this;
  }

  /**
   * Data Datadog collects from Snowflake, keyed by dataflow id. Each dataflow turns on a distinct
   * kind of collection: set <code>enabled</code> to start or stop it, and use <code>settings</code>
   * to configure what it collects. Defaults listed on each dataflow apply when the account is
   * created; on update, omitted fields keep their current values. Every dataflow reads from
   * Snowflake as the user in <code>settings.username</code>, so that user's role must be granted
   * access to the underlying views; a dataflow enabled without those grants is stored but collects
   * no data.
   *
   * @return dataflows
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATAFLOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SnowflakeIntegrationDataflowsRequest getDataflows() {
    return dataflows;
  }

  public void setDataflows(SnowflakeIntegrationDataflowsRequest dataflows) {
    this.dataflows = dataflows;
    if (dataflows != null) {
      this.unparsed |= dataflows.unparsed;
    }
  }

  public SnowflakeIntegrationAccountCreateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Human-readable name of the Snowflake integration account. Must be unique within your Datadog
   * organization.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SnowflakeIntegrationAccountCreateAttributes settings(
      SnowflakeIntegrationAccountSettingsRequest settings) {
    this.settings = settings;
    this.unparsed |= settings.unparsed;
    return this;
  }

  /**
   * Settings for creating the Snowflake integration account.
   *
   * @return settings
   */
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SnowflakeIntegrationAccountSettingsRequest getSettings() {
    return settings;
  }

  public void setSettings(SnowflakeIntegrationAccountSettingsRequest settings) {
    this.settings = settings;
    if (settings != null) {
      this.unparsed |= settings.unparsed;
    }
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
   * @return SnowflakeIntegrationAccountCreateAttributes
   */
  @JsonAnySetter
  public SnowflakeIntegrationAccountCreateAttributes putAdditionalProperty(
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

  /** Return true if this SnowflakeIntegrationAccountCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnowflakeIntegrationAccountCreateAttributes snowflakeIntegrationAccountCreateAttributes =
        (SnowflakeIntegrationAccountCreateAttributes) o;
    return Objects.equals(
            this.authentication, snowflakeIntegrationAccountCreateAttributes.authentication)
        && Objects.equals(this.dataflows, snowflakeIntegrationAccountCreateAttributes.dataflows)
        && Objects.equals(this.name, snowflakeIntegrationAccountCreateAttributes.name)
        && Objects.equals(this.settings, snowflakeIntegrationAccountCreateAttributes.settings)
        && Objects.equals(
            this.additionalProperties,
            snowflakeIntegrationAccountCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authentication, dataflows, name, settings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnowflakeIntegrationAccountCreateAttributes {\n");
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
    sb.append("    dataflows: ").append(toIndentedString(dataflows)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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
