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

/** Service definition attributes. */
@JsonPropertyOrder({
  ServiceDefinitionDataAttributes.JSON_PROPERTY_META,
  ServiceDefinitionDataAttributes.JSON_PROPERTY_SCHEMA
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceDefinitionDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_META = "meta";
  private ServiceDefinitionMeta meta;

  public static final String JSON_PROPERTY_SCHEMA = "schema";
  private ServiceDefinitionSchema schema;

  public ServiceDefinitionDataAttributes meta(ServiceDefinitionMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Metadata about a service definition.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ServiceDefinitionMeta getMeta() {
    return meta;
  }

  public void setMeta(ServiceDefinitionMeta meta) {
    this.meta = meta;
  }

  public ServiceDefinitionDataAttributes schema(ServiceDefinitionSchema schema) {
    this.schema = schema;
    this.unparsed |= schema.unparsed;
    return this;
  }

  /**
   * Service definition schema.
   *
   * @return schema
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ServiceDefinitionSchema getSchema() {
    return schema;
  }

  public void setSchema(ServiceDefinitionSchema schema) {
    this.schema = schema;
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
   * @return ServiceDefinitionDataAttributes
   */
  @JsonAnySetter
  public ServiceDefinitionDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ServiceDefinitionDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceDefinitionDataAttributes serviceDefinitionDataAttributes =
        (ServiceDefinitionDataAttributes) o;
    return Objects.equals(this.meta, serviceDefinitionDataAttributes.meta)
        && Objects.equals(this.schema, serviceDefinitionDataAttributes.schema)
        && Objects.equals(
            this.additionalProperties, serviceDefinitionDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, schema, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDefinitionDataAttributes {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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
