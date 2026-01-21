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
 * Attributes for updating a web integration account. All fields are optional - only provide the
 * fields you want to update. Partial updates are supported, allowing you to modify specific
 * settings or secrets without providing all fields.
 */
@JsonPropertyOrder({
  WebIntegrationAccountUpdateRequestAttributes.JSON_PROPERTY_NAME,
  WebIntegrationAccountUpdateRequestAttributes.JSON_PROPERTY_SECRETS,
  WebIntegrationAccountUpdateRequestAttributes.JSON_PROPERTY_SETTINGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WebIntegrationAccountUpdateRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SECRETS = "secrets";
  private Map<String, Object> secrets = null;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private Map<String, Object> settings = null;

  public WebIntegrationAccountUpdateRequestAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the account.
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

  public WebIntegrationAccountUpdateRequestAttributes secrets(Map<String, Object> secrets) {
    this.secrets = secrets;
    return this;
  }

  public WebIntegrationAccountUpdateRequestAttributes putSecretsItem(
      String key, Object secretsItem) {
    if (this.secrets == null) {
      this.secrets = new HashMap<>();
    }
    this.secrets.put(key, secretsItem);
    return this;
  }

  /**
   * Sensitive credentials to update. Only the secrets provided will be updated. These values are
   * write-only and never returned in responses.
   *
   * @return secrets
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECRETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getSecrets() {
    return secrets;
  }

  public void setSecrets(Map<String, Object> secrets) {
    this.secrets = secrets;
  }

  public WebIntegrationAccountUpdateRequestAttributes settings(Map<String, Object> settings) {
    this.settings = settings;
    return this;
  }

  public WebIntegrationAccountUpdateRequestAttributes putSettingsItem(
      String key, Object settingsItem) {
    if (this.settings == null) {
      this.settings = new HashMap<>();
    }
    this.settings.put(key, settingsItem);
    return this;
  }

  /**
   * Integration-specific settings to update. Only the fields provided will be updated. The
   * structure varies by integration type. Refer to the integration's schema for available fields.
   *
   * @return settings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getSettings() {
    return settings;
  }

  public void setSettings(Map<String, Object> settings) {
    this.settings = settings;
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
   * @return WebIntegrationAccountUpdateRequestAttributes
   */
  @JsonAnySetter
  public WebIntegrationAccountUpdateRequestAttributes putAdditionalProperty(
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

  /** Return true if this WebIntegrationAccountUpdateRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebIntegrationAccountUpdateRequestAttributes webIntegrationAccountUpdateRequestAttributes =
        (WebIntegrationAccountUpdateRequestAttributes) o;
    return Objects.equals(this.name, webIntegrationAccountUpdateRequestAttributes.name)
        && Objects.equals(this.secrets, webIntegrationAccountUpdateRequestAttributes.secrets)
        && Objects.equals(this.settings, webIntegrationAccountUpdateRequestAttributes.settings)
        && Objects.equals(
            this.additionalProperties,
            webIntegrationAccountUpdateRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, secrets, settings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebIntegrationAccountUpdateRequestAttributes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
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
