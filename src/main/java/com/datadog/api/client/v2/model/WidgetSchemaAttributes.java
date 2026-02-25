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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** */
@JsonPropertyOrder({
  WidgetSchemaAttributes.JSON_PROPERTY_CREATED_AT,
  WidgetSchemaAttributes.JSON_PROPERTY_DEFINITION,
  WidgetSchemaAttributes.JSON_PROPERTY_IS_FAVORITED,
  WidgetSchemaAttributes.JSON_PROPERTY_MODIFIED_AT,
  WidgetSchemaAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WidgetSchemaAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_DEFINITION = "definition";
  private Definition definition;

  public static final String JSON_PROPERTY_IS_FAVORITED = "is_favorited";
  private Boolean isFavorited;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private String modifiedAt;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = new ArrayList<>();

  public WidgetSchemaAttributes() {}

  @JsonCreator
  public WidgetSchemaAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) String createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_DEFINITION) Definition definition,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_FAVORITED) Boolean isFavorited,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_AT) String modifiedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAGS) List<String> tags) {
    this.createdAt = createdAt;
    this.definition = definition;
    this.unparsed |= definition.unparsed;
    this.isFavorited = isFavorited;
    this.modifiedAt = modifiedAt;
    this.tags = tags;
    if (tags != null) {}
  }

  public WidgetSchemaAttributes createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * ISO 8601 timestamp of when the widget was created.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public WidgetSchemaAttributes definition(Definition definition) {
    this.definition = definition;
    this.unparsed |= definition.unparsed;
    return this;
  }

  /**
   * The definition of a widget, including its type and configuration.
   *
   * @return definition
   */
  @JsonProperty(JSON_PROPERTY_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Definition getDefinition() {
    return definition;
  }

  public void setDefinition(Definition definition) {
    this.definition = definition;
  }

  public WidgetSchemaAttributes isFavorited(Boolean isFavorited) {
    this.isFavorited = isFavorited;
    return this;
  }

  /**
   * Deprecated: this field is not functional and always returns False.
   *
   * @return isFavorited
   * @deprecated
   */
  @Deprecated
  @JsonProperty(JSON_PROPERTY_IS_FAVORITED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsFavorited() {
    return isFavorited;
  }

  @Deprecated
  public void setIsFavorited(Boolean isFavorited) {
    this.isFavorited = isFavorited;
  }

  public WidgetSchemaAttributes modifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * ISO 8601 timestamp of when the widget was last modified.
   *
   * @return modifiedAt
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public WidgetSchemaAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public WidgetSchemaAttributes addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * User-defined tags for organizing widgets.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
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
   * @return WidgetSchemaAttributes
   */
  @JsonAnySetter
  public WidgetSchemaAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this WidgetSchemaAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetSchemaAttributes widgetSchemaAttributes = (WidgetSchemaAttributes) o;
    return Objects.equals(this.createdAt, widgetSchemaAttributes.createdAt)
        && Objects.equals(this.definition, widgetSchemaAttributes.definition)
        && Objects.equals(this.isFavorited, widgetSchemaAttributes.isFavorited)
        && Objects.equals(this.modifiedAt, widgetSchemaAttributes.modifiedAt)
        && Objects.equals(this.tags, widgetSchemaAttributes.tags)
        && Objects.equals(this.additionalProperties, widgetSchemaAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, definition, isFavorited, modifiedAt, tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetSchemaAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    isFavorited: ").append(toIndentedString(isFavorited)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
