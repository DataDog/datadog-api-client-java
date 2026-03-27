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
   * <p>An app definition object. This contains only basic information about the app such as ID, name, and tags.</p>
 */
@JsonPropertyOrder({
  ListAppsResponseDataItems.JSON_PROPERTY_ATTRIBUTES,
  ListAppsResponseDataItems.JSON_PROPERTY_ID,
  ListAppsResponseDataItems.JSON_PROPERTY_META,
  ListAppsResponseDataItems.JSON_PROPERTY_RELATIONSHIPS,
  ListAppsResponseDataItems.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ListAppsResponseDataItems {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private ListAppsResponseDataItemsAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_META = "meta";
  private AppMeta meta;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private ListAppsResponseDataItemsRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private AppDefinitionType type = AppDefinitionType.APPDEFINITIONS;

  public ListAppsResponseDataItems() {}

  @JsonCreator
  public ListAppsResponseDataItems(
            @JsonProperty(required=true, value=JSON_PROPERTY_ATTRIBUTES)ListAppsResponseDataItemsAttributes attributes,
            @JsonProperty(required=true, value=JSON_PROPERTY_ID)UUID id,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)AppDefinitionType type) {
        this.attributes = attributes;
        this.unparsed |= attributes.unparsed;
        this.id = id;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public ListAppsResponseDataItems attributes(ListAppsResponseDataItemsAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * <p>Basic information about the app such as name, description, and tags.</p>
   * @return attributes
  **/
      @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ListAppsResponseDataItemsAttributes getAttributes() {
        return attributes;
      }
  public void setAttributes(ListAppsResponseDataItemsAttributes attributes) {
    this.attributes = attributes;
  }
  public ListAppsResponseDataItems id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * <p>The ID of the app.</p>
   * @return id
  **/
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public UUID getId() {
        return id;
      }
  public void setId(UUID id) {
    this.id = id;
  }
  public ListAppsResponseDataItems meta(AppMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * <p>Metadata of an app.</p>
   * @return meta
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_META)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public AppMeta getMeta() {
        return meta;
      }
  public void setMeta(AppMeta meta) {
    this.meta = meta;
  }
  public ListAppsResponseDataItems relationships(ListAppsResponseDataItemsRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * <p>The app's publication information.</p>
   * @return relationships
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ListAppsResponseDataItemsRelationships getRelationships() {
        return relationships;
      }
  public void setRelationships(ListAppsResponseDataItemsRelationships relationships) {
    this.relationships = relationships;
  }
  public ListAppsResponseDataItems type(AppDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The app definition type.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public AppDefinitionType getType() {
        return type;
      }
  public void setType(AppDefinitionType type) {
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
   * @return ListAppsResponseDataItems
   */
  @JsonAnySetter
  public ListAppsResponseDataItems putAdditionalProperty(String key, Object value) {
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
   * Return true if this ListAppsResponseDataItems object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAppsResponseDataItems listAppsResponseDataItems = (ListAppsResponseDataItems) o;
    return Objects.equals(this.attributes, listAppsResponseDataItems.attributes) && Objects.equals(this.id, listAppsResponseDataItems.id) && Objects.equals(this.meta, listAppsResponseDataItems.meta) && Objects.equals(this.relationships, listAppsResponseDataItems.relationships) && Objects.equals(this.type, listAppsResponseDataItems.type) && Objects.equals(this.additionalProperties, listAppsResponseDataItems.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(attributes,id,meta,relationships,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAppsResponseDataItems {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
