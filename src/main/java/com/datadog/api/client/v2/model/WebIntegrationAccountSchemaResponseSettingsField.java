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
 * JSON Schema definition for a single field within settings or secrets. The exact fields vary by
 * integration.
 */
@JsonPropertyOrder({
  WebIntegrationAccountSchemaResponseSettingsField.JSON_PROPERTY_ADDITIONAL_PROPERTIES,
  WebIntegrationAccountSchemaResponseSettingsField.JSON_PROPERTY_DEFAULT,
  WebIntegrationAccountSchemaResponseSettingsField.JSON_PROPERTY_DESCRIPTION,
  WebIntegrationAccountSchemaResponseSettingsField.JSON_PROPERTY_ITEMS,
  WebIntegrationAccountSchemaResponseSettingsField.JSON_PROPERTY_MIN_LENGTH,
  WebIntegrationAccountSchemaResponseSettingsField.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WebIntegrationAccountSchemaResponseSettingsField {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ADDITIONAL_PROPERTIES = "additionalProperties";
  private Boolean additionalProperties;

  public static final String JSON_PROPERTY_DEFAULT = "default";
  private Object _default = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ITEMS = "items";
  private Object items;

  public static final String JSON_PROPERTY_MIN_LENGTH = "minLength";
  private Long minLength;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public WebIntegrationAccountSchemaResponseSettingsField additionalProperties(
      Boolean additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  /**
   * Whether additional properties are allowed for this field.
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

  public WebIntegrationAccountSchemaResponseSettingsField _default(Object _default) {
    this._default = _default;
    return this;
  }

  /**
   * Default value for the field if not provided.
   *
   * @return _default
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getDefault() {
    return _default;
  }

  public void setDefault(Object _default) {
    this._default = _default;
  }

  public WebIntegrationAccountSchemaResponseSettingsField description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Human-readable description of the field's purpose.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public WebIntegrationAccountSchemaResponseSettingsField items(Object items) {
    this.items = items;
    return this;
  }

  /**
   * Schema for array items when type is "array".
   *
   * @return items
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getItems() {
    return items;
  }

  public void setItems(Object items) {
    this.items = items;
  }

  public WebIntegrationAccountSchemaResponseSettingsField minLength(Long minLength) {
    this.minLength = minLength;
    return this;
  }

  /**
   * Minimum length for string fields.
   *
   * @return minLength
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMinLength() {
    return minLength;
  }

  public void setMinLength(Long minLength) {
    this.minLength = minLength;
  }

  public WebIntegrationAccountSchemaResponseSettingsField type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The data type of the field (string, boolean, integer, array, object).
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
   * @return WebIntegrationAccountSchemaResponseSettingsField
   */
  @JsonAnySetter
  public WebIntegrationAccountSchemaResponseSettingsField putAdditionalProperty(
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

  /** Return true if this WebIntegrationAccountSchemaResponseSettingsField object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebIntegrationAccountSchemaResponseSettingsField
        webIntegrationAccountSchemaResponseSettingsField =
            (WebIntegrationAccountSchemaResponseSettingsField) o;
    return Objects.equals(
            this.additionalProperties,
            webIntegrationAccountSchemaResponseSettingsField.additionalProperties)
        && Objects.equals(this._default, webIntegrationAccountSchemaResponseSettingsField._default)
        && Objects.equals(
            this.description, webIntegrationAccountSchemaResponseSettingsField.description)
        && Objects.equals(this.items, webIntegrationAccountSchemaResponseSettingsField.items)
        && Objects.equals(
            this.minLength, webIntegrationAccountSchemaResponseSettingsField.minLength)
        && Objects.equals(this.type, webIntegrationAccountSchemaResponseSettingsField.type)
        && Objects.equals(
            this.additionalProperties,
            webIntegrationAccountSchemaResponseSettingsField.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        additionalProperties, _default, description, items, minLength, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebIntegrationAccountSchemaResponseSettingsField {\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
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
