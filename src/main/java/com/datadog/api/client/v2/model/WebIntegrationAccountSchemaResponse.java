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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Response containing the JSON schema for an integration's account configuration. This schema
 * defines the required and optional fields for both settings and secrets, including field types,
 * validation rules, and descriptions.
 *
 * <p>The response is a standard <a href="https://json-schema.org/draft-07/schema#">JSON Schema
 * (draft-07)</a> document describing the account configuration structure. Since this is a dynamic
 * JSON Schema, the exact properties will vary by integration.
 */
@JsonPropertyOrder({
  WebIntegrationAccountSchemaResponse.JSON_PROPERTY__SCHEMA,
  WebIntegrationAccountSchemaResponse.JSON_PROPERTY_ADDITIONAL_PROPERTIES,
  WebIntegrationAccountSchemaResponse.JSON_PROPERTY_PROPERTIES,
  WebIntegrationAccountSchemaResponse.JSON_PROPERTY_REQUIRED,
  WebIntegrationAccountSchemaResponse.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WebIntegrationAccountSchemaResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY__SCHEMA = "$schema";
  private String Schema;

  public static final String JSON_PROPERTY_ADDITIONAL_PROPERTIES = "additionalProperties";
  private Boolean additionalProperties;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private WebIntegrationAccountSchemaResponseProperties properties;

  public static final String JSON_PROPERTY_REQUIRED = "required";
  private List<String> required = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public WebIntegrationAccountSchemaResponse() {}

  @JsonCreator
  public WebIntegrationAccountSchemaResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY__SCHEMA) String Schema,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROPERTIES)
          WebIntegrationAccountSchemaResponseProperties properties,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUIRED) List<String> required,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) String type) {
    this.Schema = Schema;
    this.properties = properties;
    this.unparsed |= properties.unparsed;
    this.required = required;
    this.type = type;
  }

  public WebIntegrationAccountSchemaResponse Schema(String Schema) {
    this.Schema = Schema;
    return this;
  }

  /**
   * The JSON Schema version URI.
   *
   * @return Schema
   */
  @JsonProperty(JSON_PROPERTY__SCHEMA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSchema() {
    return Schema;
  }

  public void setSchema(String Schema) {
    this.Schema = Schema;
  }

  public WebIntegrationAccountSchemaResponse additionalProperties(Boolean additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  /**
   * Whether additional properties are allowed at the root level (typically false).
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

  public WebIntegrationAccountSchemaResponse properties(
      WebIntegrationAccountSchemaResponseProperties properties) {
    this.properties = properties;
    this.unparsed |= properties.unparsed;
    return this;
  }

  /**
   * The properties object containing settings and secrets schema definitions. Both are always
   * present in every integration schema.
   *
   * @return properties
   */
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public WebIntegrationAccountSchemaResponseProperties getProperties() {
    return properties;
  }

  public void setProperties(WebIntegrationAccountSchemaResponseProperties properties) {
    this.properties = properties;
  }

  public WebIntegrationAccountSchemaResponse required(List<String> required) {
    this.required = required;
    return this;
  }

  public WebIntegrationAccountSchemaResponse addRequiredItem(String requiredItem) {
    this.required.add(requiredItem);
    return this;
  }

  /**
   * List of required top-level properties.
   *
   * @return required
   */
  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getRequired() {
    return required;
  }

  public void setRequired(List<String> required) {
    this.required = required;
  }

  public WebIntegrationAccountSchemaResponse type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The root type of the schema (always "object").
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * @return WebIntegrationAccountSchemaResponse
   */
  @JsonAnySetter
  public WebIntegrationAccountSchemaResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this WebIntegrationAccountSchemaResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebIntegrationAccountSchemaResponse webIntegrationAccountSchemaResponse =
        (WebIntegrationAccountSchemaResponse) o;
    return Objects.equals(this.Schema, webIntegrationAccountSchemaResponse.Schema)
        && Objects.equals(
            this.additionalProperties, webIntegrationAccountSchemaResponse.additionalProperties)
        && Objects.equals(this.properties, webIntegrationAccountSchemaResponse.properties)
        && Objects.equals(this.required, webIntegrationAccountSchemaResponse.required)
        && Objects.equals(this.type, webIntegrationAccountSchemaResponse.type)
        && Objects.equals(
            this.additionalProperties, webIntegrationAccountSchemaResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        Schema, additionalProperties, properties, required, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebIntegrationAccountSchemaResponse {\n");
    sb.append("    Schema: ").append(toIndentedString(Schema)).append("\n");
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
