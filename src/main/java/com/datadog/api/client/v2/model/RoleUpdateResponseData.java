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
   * <p>Role object returned by the API.</p>
 */
@JsonPropertyOrder({
  RoleUpdateResponseData.JSON_PROPERTY_ATTRIBUTES,
  RoleUpdateResponseData.JSON_PROPERTY_ID,
  RoleUpdateResponseData.JSON_PROPERTY_RELATIONSHIPS,
  RoleUpdateResponseData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RoleUpdateResponseData {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private RoleUpdateAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private RoleResponseRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private RolesType type = RolesType.ROLES;

  public RoleUpdateResponseData() {}

  @JsonCreator
  public RoleUpdateResponseData(
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)RolesType type) {
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public RoleUpdateResponseData attributes(RoleUpdateAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * <p>Attributes of the role.</p>
   * @return attributes
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public RoleUpdateAttributes getAttributes() {
        return attributes;
      }
  public void setAttributes(RoleUpdateAttributes attributes) {
    this.attributes = attributes;
  }
  public RoleUpdateResponseData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>The unique identifier of the role.</p>
   * @return id
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getId() {
        return id;
      }
  public void setId(String id) {
    this.id = id;
  }
  public RoleUpdateResponseData relationships(RoleResponseRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * <p>Relationships of the role object returned by the API.</p>
   * @return relationships
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public RoleResponseRelationships getRelationships() {
        return relationships;
      }
  public void setRelationships(RoleResponseRelationships relationships) {
    this.relationships = relationships;
  }
  public RoleUpdateResponseData type(RolesType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Roles type.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public RolesType getType() {
        return type;
      }
  public void setType(RolesType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * Return true if this RoleUpdateResponseData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleUpdateResponseData roleUpdateResponseData = (RoleUpdateResponseData) o;
    return Objects.equals(this.attributes, roleUpdateResponseData.attributes) && Objects.equals(this.id, roleUpdateResponseData.id) && Objects.equals(this.relationships, roleUpdateResponseData.relationships) && Objects.equals(this.type, roleUpdateResponseData.type);
  }


  @Override
  public int hashCode() {
    return Objects.hash(attributes,id,relationships,type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleUpdateResponseData {\n");
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
