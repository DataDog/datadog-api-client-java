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
   * <p>Datadog application key.</p>
 */
@JsonPropertyOrder({
  FullApplicationKey.JSON_PROPERTY_ATTRIBUTES,
  FullApplicationKey.JSON_PROPERTY_ID,
  FullApplicationKey.JSON_PROPERTY_RELATIONSHIPS,
  FullApplicationKey.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FullApplicationKey {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private FullApplicationKeyAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private ApplicationKeyRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ApplicationKeysType type = ApplicationKeysType.APPLICATION_KEYS;

  public FullApplicationKey attributes(FullApplicationKeyAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * <p>Attributes of a full application key.</p>
   * @return attributes
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public FullApplicationKeyAttributes getAttributes() {
        return attributes;
      }
  public void setAttributes(FullApplicationKeyAttributes attributes) {
    this.attributes = attributes;
  }
  public FullApplicationKey id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>ID of the application key.</p>
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
  public FullApplicationKey relationships(ApplicationKeyRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * <p>Resources related to the application key.</p>
   * @return relationships
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ApplicationKeyRelationships getRelationships() {
        return relationships;
      }
  public void setRelationships(ApplicationKeyRelationships relationships) {
    this.relationships = relationships;
  }
  public FullApplicationKey type(ApplicationKeysType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Application Keys resource type.</p>
   * @return type
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ApplicationKeysType getType() {
        return type;
      }
  public void setType(ApplicationKeysType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * Return true if this FullApplicationKey object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullApplicationKey fullApplicationKey = (FullApplicationKey) o;
    return Objects.equals(this.attributes, fullApplicationKey.attributes) && Objects.equals(this.id, fullApplicationKey.id) && Objects.equals(this.relationships, fullApplicationKey.relationships) && Objects.equals(this.type, fullApplicationKey.type);
  }


  @Override
  public int hashCode() {
    return Objects.hash(attributes,id,relationships,type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullApplicationKey {\n");
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
