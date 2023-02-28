/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
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
        && Objects.equals(this.schema, serviceDefinitionDataAttributes.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, schema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDefinitionDataAttributes {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("}");
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
