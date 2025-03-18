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

/** Included schema. */
@JsonPropertyOrder({EntityResponseIncludedSchemaAttributes.JSON_PROPERTY_SCHEMA})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EntityResponseIncludedSchemaAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SCHEMA = "schema";
  private EntityV3 schema;

  public EntityResponseIncludedSchemaAttributes() {}

  @JsonCreator
  public EntityResponseIncludedSchemaAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_SCHEMA) EntityV3 schema) {
    this.schema = schema;
    this.unparsed |= schema.unparsed;
  }

  public EntityResponseIncludedSchemaAttributes schema(EntityV3 schema) {
    this.schema = schema;
    this.unparsed |= schema.unparsed;
    return this;
  }

  /**
   * Entity schema v3.
   *
   * @return schema
   */
  @JsonProperty(JSON_PROPERTY_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EntityV3 getSchema() {
    return schema;
  }

  public void setSchema(EntityV3 schema) {
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
   * @return EntityResponseIncludedSchemaAttributes
   */
  @JsonAnySetter
  public EntityResponseIncludedSchemaAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this EntityResponseIncludedSchemaAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityResponseIncludedSchemaAttributes entityResponseIncludedSchemaAttributes =
        (EntityResponseIncludedSchemaAttributes) o;
    return Objects.equals(this.schema, entityResponseIncludedSchemaAttributes.schema)
        && Objects.equals(
            this.additionalProperties, entityResponseIncludedSchemaAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schema, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityResponseIncludedSchemaAttributes {\n");
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
