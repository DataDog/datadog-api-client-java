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

/** Response data related to the scanning groups. */
@JsonPropertyOrder({
  SensitiveDataScannerGetConfigResponseData.JSON_PROPERTY_ATTRIBUTES,
  SensitiveDataScannerGetConfigResponseData.JSON_PROPERTY_ID,
  SensitiveDataScannerGetConfigResponseData.JSON_PROPERTY_RELATIONSHIPS,
  SensitiveDataScannerGetConfigResponseData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SensitiveDataScannerGetConfigResponseData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private Map<String, Object> attributes = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private SensitiveDataScannerConfigurationRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SensitiveDataScannerConfigurationType type =
      SensitiveDataScannerConfigurationType.SENSITIVE_DATA_SCANNER_CONFIGURATIONS;

  public SensitiveDataScannerGetConfigResponseData attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }

  public SensitiveDataScannerGetConfigResponseData putAttributesItem(
      String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

  /**
   * Attributes of the Sensitive Data configuration.
   *
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }

  public SensitiveDataScannerGetConfigResponseData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the configuration.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SensitiveDataScannerGetConfigResponseData relationships(
      SensitiveDataScannerConfigurationRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * Relationships of the configuration.
   *
   * @return relationships
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SensitiveDataScannerConfigurationRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(SensitiveDataScannerConfigurationRelationships relationships) {
    this.relationships = relationships;
  }

  public SensitiveDataScannerGetConfigResponseData type(
      SensitiveDataScannerConfigurationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Sensitive Data Scanner configuration type.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SensitiveDataScannerConfigurationType getType() {
    return type;
  }

  public void setType(SensitiveDataScannerConfigurationType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
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
   * @return SensitiveDataScannerGetConfigResponseData
   */
  @JsonAnySetter
  public SensitiveDataScannerGetConfigResponseData putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SensitiveDataScannerGetConfigResponseData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitiveDataScannerGetConfigResponseData sensitiveDataScannerGetConfigResponseData =
        (SensitiveDataScannerGetConfigResponseData) o;
    return Objects.equals(this.attributes, sensitiveDataScannerGetConfigResponseData.attributes)
        && Objects.equals(this.id, sensitiveDataScannerGetConfigResponseData.id)
        && Objects.equals(
            this.relationships, sensitiveDataScannerGetConfigResponseData.relationships)
        && Objects.equals(this.type, sensitiveDataScannerGetConfigResponseData.type)
        && Objects.equals(
            this.additionalProperties,
            sensitiveDataScannerGetConfigResponseData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, relationships, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensitiveDataScannerGetConfigResponseData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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
