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
import org.openapitools.jackson.nullable.JsonNullable;

/** */
@JsonPropertyOrder({
  CreateOrUpdateWidgetRequestResourceObjectRequest.JSON_PROPERTY_ATTRIBUTES,
  CreateOrUpdateWidgetRequestResourceObjectRequest.JSON_PROPERTY_ID,
  CreateOrUpdateWidgetRequestResourceObjectRequest.JSON_PROPERTY_LID,
  CreateOrUpdateWidgetRequestResourceObjectRequest.JSON_PROPERTY_LINKS,
  CreateOrUpdateWidgetRequestResourceObjectRequest.JSON_PROPERTY_META,
  CreateOrUpdateWidgetRequestResourceObjectRequest.JSON_PROPERTY_RELATIONSHIPS,
  CreateOrUpdateWidgetRequestResourceObjectRequest.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateOrUpdateWidgetRequestResourceObjectRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private CreateOrUpdateWidgetRequestAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LID = "lid";
  private JsonNullable<String> lid = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LINKS = "links";
  private WidgetLinks links;

  public static final String JSON_PROPERTY_META = "meta";
  private JsonNullable<Map<String, Object>> meta = JsonNullable.<Map<String, Object>>undefined();

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private JsonNullable<Map<String, WidgetRelationshipObjectInput>> relationships =
      JsonNullable.<Map<String, WidgetRelationshipObjectInput>>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public CreateOrUpdateWidgetRequestResourceObjectRequest() {}

  @JsonCreator
  public CreateOrUpdateWidgetRequestResourceObjectRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          CreateOrUpdateWidgetRequestAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) String type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.type = type;
  }

  public CreateOrUpdateWidgetRequestResourceObjectRequest attributes(
      CreateOrUpdateWidgetRequestAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Getattributes
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CreateOrUpdateWidgetRequestAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(CreateOrUpdateWidgetRequestAttributes attributes) {
    this.attributes = attributes;
  }

  public CreateOrUpdateWidgetRequestResourceObjectRequest id(String id) {
    this.id = JsonNullable.<String>of(id);
    return this;
  }

  /**
   * Getid
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getId() {
    return id.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getId_JsonNullable() {
    return id;
  }

  @JsonProperty(JSON_PROPERTY_ID)
  public void setId_JsonNullable(JsonNullable<String> id) {
    this.id = id;
  }

  public void setId(String id) {
    this.id = JsonNullable.<String>of(id);
  }

  public CreateOrUpdateWidgetRequestResourceObjectRequest lid(String lid) {
    this.lid = JsonNullable.<String>of(lid);
    return this;
  }

  /**
   * Getlid
   *
   * @return lid
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getLid() {
    return lid.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getLid_JsonNullable() {
    return lid;
  }

  @JsonProperty(JSON_PROPERTY_LID)
  public void setLid_JsonNullable(JsonNullable<String> lid) {
    this.lid = lid;
  }

  public void setLid(String lid) {
    this.lid = JsonNullable.<String>of(lid);
  }

  public CreateOrUpdateWidgetRequestResourceObjectRequest links(WidgetLinks links) {
    this.links = links;
    this.unparsed |= links.unparsed;
    return this;
  }

  /**
   * A JSON:API "links" member See: https://jsonapi.org/format/#document-links
   *
   * @return links
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetLinks getLinks() {
    return links;
  }

  public void setLinks(WidgetLinks links) {
    this.links = links;
  }

  public CreateOrUpdateWidgetRequestResourceObjectRequest meta(Map<String, Object> meta) {
    this.meta = JsonNullable.<Map<String, Object>>of(meta);
    return this;
  }

  public CreateOrUpdateWidgetRequestResourceObjectRequest putMetaItem(String key, Object metaItem) {
    if (this.meta == null || !this.meta.isPresent()) {
      this.meta = JsonNullable.<Map<String, Object>>of(new HashMap<>());
    }
    try {
      this.meta.get().put(key, metaItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Getmeta
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Map<String, Object> getMeta() {
    return meta.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Map<String, Object>> getMeta_JsonNullable() {
    return meta;
  }

  @JsonProperty(JSON_PROPERTY_META)
  public void setMeta_JsonNullable(JsonNullable<Map<String, Object>> meta) {
    this.meta = meta;
  }

  public void setMeta(Map<String, Object> meta) {
    this.meta = JsonNullable.<Map<String, Object>>of(meta);
  }

  public CreateOrUpdateWidgetRequestResourceObjectRequest relationships(
      Map<String, WidgetRelationshipObjectInput> relationships) {
    this.relationships = JsonNullable.<Map<String, WidgetRelationshipObjectInput>>of(relationships);
    return this;
  }

  public CreateOrUpdateWidgetRequestResourceObjectRequest putRelationshipsItem(
      String key, WidgetRelationshipObjectInput relationshipsItem) {
    if (this.relationships == null || !this.relationships.isPresent()) {
      this.relationships =
          JsonNullable.<Map<String, WidgetRelationshipObjectInput>>of(new HashMap<>());
    }
    try {
      this.relationships.get().put(key, relationshipsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Getrelationships
   *
   * @return relationships
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Map<String, WidgetRelationshipObjectInput> getRelationships() {
    return relationships.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Map<String, WidgetRelationshipObjectInput>> getRelationships_JsonNullable() {
    return relationships;
  }

  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  public void setRelationships_JsonNullable(
      JsonNullable<Map<String, WidgetRelationshipObjectInput>> relationships) {
    this.relationships = relationships;
  }

  public void setRelationships(Map<String, WidgetRelationshipObjectInput> relationships) {
    this.relationships = JsonNullable.<Map<String, WidgetRelationshipObjectInput>>of(relationships);
  }

  public CreateOrUpdateWidgetRequestResourceObjectRequest type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Gettype
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
   * @return CreateOrUpdateWidgetRequestResourceObjectRequest
   */
  @JsonAnySetter
  public CreateOrUpdateWidgetRequestResourceObjectRequest putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this CreateOrUpdateWidgetRequestResourceObjectRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOrUpdateWidgetRequestResourceObjectRequest
        createOrUpdateWidgetRequestResourceObjectRequest =
            (CreateOrUpdateWidgetRequestResourceObjectRequest) o;
    return Objects.equals(
            this.attributes, createOrUpdateWidgetRequestResourceObjectRequest.attributes)
        && Objects.equals(this.id, createOrUpdateWidgetRequestResourceObjectRequest.id)
        && Objects.equals(this.lid, createOrUpdateWidgetRequestResourceObjectRequest.lid)
        && Objects.equals(this.links, createOrUpdateWidgetRequestResourceObjectRequest.links)
        && Objects.equals(this.meta, createOrUpdateWidgetRequestResourceObjectRequest.meta)
        && Objects.equals(
            this.relationships, createOrUpdateWidgetRequestResourceObjectRequest.relationships)
        && Objects.equals(this.type, createOrUpdateWidgetRequestResourceObjectRequest.type)
        && Objects.equals(
            this.additionalProperties,
            createOrUpdateWidgetRequestResourceObjectRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        attributes, id, lid, links, meta, relationships, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrUpdateWidgetRequestResourceObjectRequest {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lid: ").append(toIndentedString(lid)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
