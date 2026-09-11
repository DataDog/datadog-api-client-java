/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Writable attributes used to update a Snowflake integration account. Every field is optional; only
 * the fields provided are changed. When <code>dataflows</code> is provided, only the dataflow ids
 * included in the request are modified; dataflows omitted from the map keep their current
 * configuration, as do the settings of an included dataflow that provides only <code>enabled</code>
 * . <code>authentication</code> is the exception to partial updates: when provided it is replaced
 * as a whole, so it must carry every field that creating an account requires.
 */
@JsonPropertyOrder({
  SnowflakeIntegrationAccountUpdateAttributes.JSON_PROPERTY_AUTHENTICATION,
  SnowflakeIntegrationAccountUpdateAttributes.JSON_PROPERTY_DATAFLOWS,
  SnowflakeIntegrationAccountUpdateAttributes.JSON_PROPERTY_NAME,
  SnowflakeIntegrationAccountUpdateAttributes.JSON_PROPERTY_SETTINGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SnowflakeIntegrationAccountUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHENTICATION = "authentication";
  private SnowflakeIntegrationAccountAuthenticationRequest authentication;

  public static final String JSON_PROPERTY_DATAFLOWS = "dataflows";
  private SnowflakeIntegrationDataflowsRequest dataflows;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private SnowflakeIntegrationAccountSettingsUpdate settings;

  public SnowflakeIntegrationAccountUpdateAttributes authentication(
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SnowflakeIntegrationAccountAuthenticationRequest getAuthentication() {
    return authentication;
  }

  public void setAuthentication(SnowflakeIntegrationAccountAuthenticationRequest authentication) {
    this.authentication = authentication;
    if (authentication != null) {
      this.unparsed |= authentication.unparsed;
    }
  }

  public SnowflakeIntegrationAccountUpdateAttributes dataflows(
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

  public SnowflakeIntegrationAccountUpdateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Human-readable name of the Snowflake integration account. Must be unique within your Datadog
   * organization.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SnowflakeIntegrationAccountUpdateAttributes settings(
      SnowflakeIntegrationAccountSettingsUpdate settings) {
    this.settings = settings;
    this.unparsed |= settings.unparsed;
    return this;
  }

  /**
   * Settings for updating the Snowflake integration account. Only the fields provided are changed.
   *
   * @return settings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SnowflakeIntegrationAccountSettingsUpdate getSettings() {
    return settings;
  }

  public void setSettings(SnowflakeIntegrationAccountSettingsUpdate settings) {
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
   * @return SnowflakeIntegrationAccountUpdateAttributes
   */
  @JsonAnySetter
  public SnowflakeIntegrationAccountUpdateAttributes putAdditionalProperty(
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

  /** Return true if this SnowflakeIntegrationAccountUpdateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnowflakeIntegrationAccountUpdateAttributes snowflakeIntegrationAccountUpdateAttributes =
        (SnowflakeIntegrationAccountUpdateAttributes) o;
    return Objects.equals(
            this.authentication, snowflakeIntegrationAccountUpdateAttributes.authentication)
        && Objects.equals(this.dataflows, snowflakeIntegrationAccountUpdateAttributes.dataflows)
        && Objects.equals(this.name, snowflakeIntegrationAccountUpdateAttributes.name)
        && Objects.equals(this.settings, snowflakeIntegrationAccountUpdateAttributes.settings)
        && Objects.equals(
            this.additionalProperties,
            snowflakeIntegrationAccountUpdateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authentication, dataflows, name, settings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnowflakeIntegrationAccountUpdateAttributes {\n");
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
