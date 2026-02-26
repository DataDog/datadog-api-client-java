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
import java.util.UUID;
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
   * <p>Relation response data.</p>
 */
@JsonPropertyOrder({
  RelationResponse.JSON_PROPERTY_ATTRIBUTES,
  RelationResponse.JSON_PROPERTY_ID,
  RelationResponse.JSON_PROPERTY_META,
  RelationResponse.JSON_PROPERTY_RELATIONSHIPS,
  RelationResponse.JSON_PROPERTY_SUBTYPE,
  RelationResponse.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RelationResponse {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private RelationAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_META = "meta";
  private RelationMeta meta;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private RelationRelationships relationships;

  public static final String JSON_PROPERTY_SUBTYPE = "subtype";
  private String subtype;

  public static final String JSON_PROPERTY_TYPE = "type";
  private RelationResponseType type;

  public RelationResponse attributes(RelationAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * <p>Relation attributes.</p>
   * @return attributes
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public RelationAttributes getAttributes() {
        return attributes;
      }
  public void setAttributes(RelationAttributes attributes) {
    this.attributes = attributes;
  }
  public RelationResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>Relation ID.</p>
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
  public RelationResponse meta(RelationMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * <p>Relation metadata.</p>
   * @return meta
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_META)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public RelationMeta getMeta() {
        return meta;
      }
  public void setMeta(RelationMeta meta) {
    this.meta = meta;
  }
  public RelationResponse relationships(RelationRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * <p>Relation relationships.</p>
   * @return relationships
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public RelationRelationships getRelationships() {
        return relationships;
      }
  public void setRelationships(RelationRelationships relationships) {
    this.relationships = relationships;
  }
  public RelationResponse subtype(String subtype) {
    this.subtype = subtype;
    return this;
  }

  /**
   * <p>Relation subtype.</p>
   * @return subtype
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SUBTYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSubtype() {
        return subtype;
      }
  public void setSubtype(String subtype) {
    this.subtype = subtype;
  }
  public RelationResponse type(RelationResponseType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Relation type.</p>
   * @return type
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public RelationResponseType getType() {
        return type;
      }
  public void setType(RelationResponseType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return RelationResponse
   */
  @JsonAnySetter
  public RelationResponse putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this RelationResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationResponse relationResponse = (RelationResponse) o;
    return Objects.equals(this.attributes, relationResponse.attributes) && Objects.equals(this.id, relationResponse.id) && Objects.equals(this.meta, relationResponse.meta) && Objects.equals(this.relationships, relationResponse.relationships) && Objects.equals(this.subtype, relationResponse.subtype) && Objects.equals(this.type, relationResponse.type) && Objects.equals(this.additionalProperties, relationResponse.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(attributes,id,meta,relationships,subtype,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationResponse {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
