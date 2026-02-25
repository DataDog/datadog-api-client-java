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

/** A JSON:API resource object. See: https://jsonapi.org/format/#document-resource-objects */
@JsonPropertyOrder({
  WidgetResourceObjectInput.JSON_PROPERTY_ATTRIBUTES,
  WidgetResourceObjectInput.JSON_PROPERTY_ID,
  WidgetResourceObjectInput.JSON_PROPERTY_LINKS,
  WidgetResourceObjectInput.JSON_PROPERTY_META,
  WidgetResourceObjectInput.JSON_PROPERTY_RELATIONSHIPS,
  WidgetResourceObjectInput.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WidgetResourceObjectInput {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private JsonNullable<ResourceObjectInputAttributes> attributes =
      JsonNullable.<ResourceObjectInputAttributes>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LINKS = "links";
  private WidgetLinks links;

  public static final String JSON_PROPERTY_META = "meta";
  private JsonNullable<Map<String, Object>> meta = JsonNullable.<Map<String, Object>>undefined();

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private JsonNullable<Map<String, WidgetRelationshipObjectInput>> relationships =
      JsonNullable.<Map<String, WidgetRelationshipObjectInput>>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public WidgetResourceObjectInput() {}

  @JsonCreator
  public WidgetResourceObjectInput(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) String type) {
    this.id = id;
    this.type = type;
  }

  public WidgetResourceObjectInput attributes(ResourceObjectInputAttributes attributes) {
    this.attributes = JsonNullable.<ResourceObjectInputAttributes>of(attributes);
    return this;
  }

  /**
   * Getattributes
   *
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public ResourceObjectInputAttributes getAttributes() {
    return attributes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<ResourceObjectInputAttributes> getAttributes_JsonNullable() {
    return attributes;
  }

  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  public void setAttributes_JsonNullable(JsonNullable<ResourceObjectInputAttributes> attributes) {
    this.attributes = attributes;
  }

  public void setAttributes(ResourceObjectInputAttributes attributes) {
    this.attributes = JsonNullable.<ResourceObjectInputAttributes>of(attributes);
  }

  public WidgetResourceObjectInput id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Getid
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public WidgetResourceObjectInput links(WidgetLinks links) {
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

  public WidgetResourceObjectInput meta(Map<String, Object> meta) {
    this.meta = JsonNullable.<Map<String, Object>>of(meta);
    return this;
  }

  public WidgetResourceObjectInput putMetaItem(String key, Object metaItem) {
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

  public WidgetResourceObjectInput relationships(
      Map<String, WidgetRelationshipObjectInput> relationships) {
    this.relationships = JsonNullable.<Map<String, WidgetRelationshipObjectInput>>of(relationships);
    return this;
  }

  public WidgetResourceObjectInput putRelationshipsItem(
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

  public WidgetResourceObjectInput type(String type) {
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
   * @return WidgetResourceObjectInput
   */
  @JsonAnySetter
  public WidgetResourceObjectInput putAdditionalProperty(String key, Object value) {
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

  /** Return true if this WidgetResourceObjectInput object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetResourceObjectInput widgetResourceObjectInput = (WidgetResourceObjectInput) o;
    return Objects.equals(this.attributes, widgetResourceObjectInput.attributes)
        && Objects.equals(this.id, widgetResourceObjectInput.id)
        && Objects.equals(this.links, widgetResourceObjectInput.links)
        && Objects.equals(this.meta, widgetResourceObjectInput.meta)
        && Objects.equals(this.relationships, widgetResourceObjectInput.relationships)
        && Objects.equals(this.type, widgetResourceObjectInput.type)
        && Objects.equals(
            this.additionalProperties, widgetResourceObjectInput.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, links, meta, relationships, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetResourceObjectInput {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
