/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Data for updating an AuthN Mapping.</p>
 */
@JsonPropertyOrder({
  AuthNMappingUpdateData.JSON_PROPERTY_ATTRIBUTES,
  AuthNMappingUpdateData.JSON_PROPERTY_ID,
  AuthNMappingUpdateData.JSON_PROPERTY_RELATIONSHIPS,
  AuthNMappingUpdateData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AuthNMappingUpdateData {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private AuthNMappingUpdateAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private AuthNMappingUpdateRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private AuthNMappingsType type = AuthNMappingsType.AUTHN_MAPPINGS;

  public AuthNMappingUpdateData() {}

  @JsonCreator
  public AuthNMappingUpdateData(
            @JsonProperty(required=true, value=JSON_PROPERTY_ID)String id,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)AuthNMappingsType type) {
        this.id = id;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public AuthNMappingUpdateData attributes(AuthNMappingUpdateAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * <p>Key/Value pair of attributes used for update request.</p>
   * @return attributes
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public AuthNMappingUpdateAttributes getAttributes() {
        return attributes;
      }
  public void setAttributes(AuthNMappingUpdateAttributes attributes) {
    this.attributes = attributes;
  }
  public AuthNMappingUpdateData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>ID of the AuthN Mapping.</p>
   * @return id
  **/
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getId() {
        return id;
      }
  public void setId(String id) {
    this.id = id;
  }
  public AuthNMappingUpdateData relationships(AuthNMappingUpdateRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * <p>Relationship of AuthN Mapping update object to Role.</p>
   * @return relationships
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public AuthNMappingUpdateRelationships getRelationships() {
        return relationships;
      }
  public void setRelationships(AuthNMappingUpdateRelationships relationships) {
    this.relationships = relationships;
  }
  public AuthNMappingUpdateData type(AuthNMappingsType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>AuthN Mappings resource type.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public AuthNMappingsType getType() {
        return type;
      }
  public void setType(AuthNMappingsType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * Return true if this AuthNMappingUpdateData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthNMappingUpdateData authNMappingUpdateData = (AuthNMappingUpdateData) o;
    return Objects.equals(this.attributes, authNMappingUpdateData.attributes) && Objects.equals(this.id, authNMappingUpdateData.id) && Objects.equals(this.relationships, authNMappingUpdateData.relationships) && Objects.equals(this.type, authNMappingUpdateData.type);
  }


  @Override
  public int hashCode() {
    return Objects.hash(attributes,id,relationships,type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthNMappingUpdateData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
