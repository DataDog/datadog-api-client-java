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

/**
 * The properties object containing settings and secrets schema definitions. Both are always present
 * in every integration schema, but the fields within each vary depending on the specific
 * integration.
 */
@JsonPropertyOrder({
  AmsIntegrationAccountSchemaResponseProperties.JSON_PROPERTY_SECRETS,
  AmsIntegrationAccountSchemaResponseProperties.JSON_PROPERTY_SETTINGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AmsIntegrationAccountSchemaResponseProperties {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SECRETS = "secrets";
  private AmsIntegrationAccountSchemaResponseSecretsObject secrets;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private AmsIntegrationAccountSchemaResponseSettingsObject settings;

  public AmsIntegrationAccountSchemaResponseProperties() {}

  @JsonCreator
  public AmsIntegrationAccountSchemaResponseProperties(
      @JsonProperty(required = true, value = JSON_PROPERTY_SECRETS)
          AmsIntegrationAccountSchemaResponseSecretsObject secrets,
      @JsonProperty(required = true, value = JSON_PROPERTY_SETTINGS)
          AmsIntegrationAccountSchemaResponseSettingsObject settings) {
    this.secrets = secrets;
    this.unparsed |= secrets.unparsed;
    this.settings = settings;
    this.unparsed |= settings.unparsed;
  }

  public AmsIntegrationAccountSchemaResponseProperties secrets(
      AmsIntegrationAccountSchemaResponseSecretsObject secrets) {
    this.secrets = secrets;
    this.unparsed |= secrets.unparsed;
    return this;
  }

  /**
   * JSON Schema definition for the secrets object. Contains sensitive credentials required for the
   * integration such as API keys, tokens, and passwords. These values are write-only and never
   * returned in responses.
   *
   * @return secrets
   */
  @JsonProperty(JSON_PROPERTY_SECRETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AmsIntegrationAccountSchemaResponseSecretsObject getSecrets() {
    return secrets;
  }

  public void setSecrets(AmsIntegrationAccountSchemaResponseSecretsObject secrets) {
    this.secrets = secrets;
  }

  public AmsIntegrationAccountSchemaResponseProperties settings(
      AmsIntegrationAccountSchemaResponseSettingsObject settings) {
    this.settings = settings;
    this.unparsed |= settings.unparsed;
    return this;
  }

  /**
   * JSON Schema definition for the settings object. Contains integration-specific configuration
   * fields such as account identifiers, feature toggles, and non-sensitive configuration options.
   *
   * @return settings
   */
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AmsIntegrationAccountSchemaResponseSettingsObject getSettings() {
    return settings;
  }

  public void setSettings(AmsIntegrationAccountSchemaResponseSettingsObject settings) {
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
   * @return AmsIntegrationAccountSchemaResponseProperties
   */
  @JsonAnySetter
  public AmsIntegrationAccountSchemaResponseProperties putAdditionalProperty(
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

  /** Return true if this AmsIntegrationAccountSchemaResponseProperties object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmsIntegrationAccountSchemaResponseProperties amsIntegrationAccountSchemaResponseProperties =
        (AmsIntegrationAccountSchemaResponseProperties) o;
    return Objects.equals(this.secrets, amsIntegrationAccountSchemaResponseProperties.secrets)
        && Objects.equals(this.settings, amsIntegrationAccountSchemaResponseProperties.settings)
        && Objects.equals(
            this.additionalProperties,
            amsIntegrationAccountSchemaResponseProperties.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secrets, settings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmsIntegrationAccountSchemaResponseProperties {\n");
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
