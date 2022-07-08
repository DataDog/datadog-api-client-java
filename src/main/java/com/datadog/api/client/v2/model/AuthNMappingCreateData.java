/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Data for creating an AuthN Mapping. */
@JsonPropertyOrder({
  AuthNMappingCreateData.JSON_PROPERTY_ATTRIBUTES,
  AuthNMappingCreateData.JSON_PROPERTY_RELATIONSHIPS,
  AuthNMappingCreateData.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AuthNMappingCreateData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private AuthNMappingCreateAttributes attributes;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private AuthNMappingCreateRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private AuthNMappingsType type = AuthNMappingsType.AUTHN_MAPPINGS;

  public AuthNMappingCreateData() {}

  @JsonCreator
  public AuthNMappingCreateData(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) AuthNMappingsType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public AuthNMappingCreateData attributes(AuthNMappingCreateAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Key/Value pair of attributes used for create request.
   *
   * @return attributes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AuthNMappingCreateAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(AuthNMappingCreateAttributes attributes) {
    this.attributes = attributes;
  }

  public AuthNMappingCreateData relationships(AuthNMappingCreateRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * Relationship of AuthN Mapping create object to Role.
   *
   * @return relationships
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AuthNMappingCreateRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(AuthNMappingCreateRelationships relationships) {
    this.relationships = relationships;
  }

  public AuthNMappingCreateData type(AuthNMappingsType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * AuthN Mappings resource type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AuthNMappingsType getType() {
    return type;
  }

  public void setType(AuthNMappingsType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this AuthNMappingCreateData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthNMappingCreateData authNMappingCreateData = (AuthNMappingCreateData) o;
    return Objects.equals(this.attributes, authNMappingCreateData.attributes)
        && Objects.equals(this.relationships, authNMappingCreateData.relationships)
        && Objects.equals(this.type, authNMappingCreateData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, relationships, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthNMappingCreateData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
