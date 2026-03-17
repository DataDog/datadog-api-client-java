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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * JSON Schema definition for the settings object. Contains integration-specific configuration
 * fields such as account identifiers, feature toggles, and non-sensitive configuration options.
 */
@JsonPropertyOrder({
  WebIntegrationAccountSchemaResponseSettingsObject.JSON_PROPERTY_ADDITIONAL_PROPERTIES,
  WebIntegrationAccountSchemaResponseSettingsObject.JSON_PROPERTY_PROPERTIES,
  WebIntegrationAccountSchemaResponseSettingsObject.JSON_PROPERTY_REQUIRED,
  WebIntegrationAccountSchemaResponseSettingsObject.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WebIntegrationAccountSchemaResponseSettingsObject {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ADDITIONAL_PROPERTIES = "additionalProperties";
  private Boolean additionalProperties;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private Map<String, WebIntegrationAccountSchemaResponseSettingsField> properties = null;

  public static final String JSON_PROPERTY_REQUIRED = "required";
  private List<String> required = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public WebIntegrationAccountSchemaResponseSettingsObject additionalProperties(
      Boolean additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  /**
   * Whether additional properties are allowed (typically false).
   *
   * @return additionalProperties
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Boolean additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public WebIntegrationAccountSchemaResponseSettingsObject properties(
      Map<String, WebIntegrationAccountSchemaResponseSettingsField> properties) {
    this.properties = properties;
    return this;
  }

  public WebIntegrationAccountSchemaResponseSettingsObject putPropertiesItem(
      String key, WebIntegrationAccountSchemaResponseSettingsField propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

  /**
   * The individual setting fields for this integration. Field names and types vary by integration.
   *
   * @return properties
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, WebIntegrationAccountSchemaResponseSettingsField> getProperties() {
    return properties;
  }

  public void setProperties(
      Map<String, WebIntegrationAccountSchemaResponseSettingsField> properties) {
    this.properties = properties;
  }

  public WebIntegrationAccountSchemaResponseSettingsObject required(List<String> required) {
    this.required = required;
    return this;
  }

  public WebIntegrationAccountSchemaResponseSettingsObject addRequiredItem(String requiredItem) {
    if (this.required == null) {
      this.required = new ArrayList<>();
    }
    this.required.add(requiredItem);
    return this;
  }

  /**
   * List of required setting field names.
   *
   * @return required
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getRequired() {
    return required;
  }

  public void setRequired(List<String> required) {
    this.required = required;
  }

  public WebIntegrationAccountSchemaResponseSettingsObject type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Always "object" for the settings container.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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
   * @return WebIntegrationAccountSchemaResponseSettingsObject
   */
  @JsonAnySetter
  public WebIntegrationAccountSchemaResponseSettingsObject putAdditionalProperty(
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

  /** Return true if this WebIntegrationAccountSchemaResponseSettingsObject object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebIntegrationAccountSchemaResponseSettingsObject
        webIntegrationAccountSchemaResponseSettingsObject =
            (WebIntegrationAccountSchemaResponseSettingsObject) o;
    return Objects.equals(
            this.additionalProperties,
            webIntegrationAccountSchemaResponseSettingsObject.additionalProperties)
        && Objects.equals(
            this.properties, webIntegrationAccountSchemaResponseSettingsObject.properties)
        && Objects.equals(this.required, webIntegrationAccountSchemaResponseSettingsObject.required)
        && Objects.equals(this.type, webIntegrationAccountSchemaResponseSettingsObject.type)
        && Objects.equals(
            this.additionalProperties,
            webIntegrationAccountSchemaResponseSettingsObject.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalProperties, properties, required, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebIntegrationAccountSchemaResponseSettingsObject {\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
