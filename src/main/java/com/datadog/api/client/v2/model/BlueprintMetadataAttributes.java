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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The attributes of a blueprint metadata resource. */
@JsonPropertyOrder({
  BlueprintMetadataAttributes.JSON_PROPERTY_CREATED_AT,
  BlueprintMetadataAttributes.JSON_PROPERTY_DESCRIPTION,
  BlueprintMetadataAttributes.JSON_PROPERTY_NAME,
  BlueprintMetadataAttributes.JSON_PROPERTY_SLUG,
  BlueprintMetadataAttributes.JSON_PROPERTY_TAGS,
  BlueprintMetadataAttributes.JSON_PROPERTY_TILE_BACKGROUND,
  BlueprintMetadataAttributes.JSON_PROPERTY_TILE_ICON_ACTION_FQN,
  BlueprintMetadataAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class BlueprintMetadataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SLUG = "slug";
  private String slug;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TILE_BACKGROUND = "tile_background";
  private String tileBackground;

  public static final String JSON_PROPERTY_TILE_ICON_ACTION_FQN = "tile_icon_action_fqn";
  private String tileIconActionFqn;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public BlueprintMetadataAttributes() {}

  @JsonCreator
  public BlueprintMetadataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SLUG) String slug,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt) {
    this.createdAt = createdAt;
    this.description = description;
    this.name = name;
    this.slug = slug;
    this.updatedAt = updatedAt;
  }

  public BlueprintMetadataAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The timestamp when the blueprint was created.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public BlueprintMetadataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of what the blueprint does.
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BlueprintMetadataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The human-readable name of the blueprint.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BlueprintMetadataAttributes slug(String slug) {
    this.slug = slug;
    return this;
  }

  /**
   * The unique slug identifier of the blueprint.
   *
   * @return slug
   */
  @JsonProperty(JSON_PROPERTY_SLUG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public BlueprintMetadataAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public BlueprintMetadataAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags associated with the blueprint.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public BlueprintMetadataAttributes tileBackground(String tileBackground) {
    this.tileBackground = tileBackground;
    return this;
  }

  /**
   * The background style of the blueprint tile.
   *
   * @return tileBackground
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TILE_BACKGROUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTileBackground() {
    return tileBackground;
  }

  public void setTileBackground(String tileBackground) {
    this.tileBackground = tileBackground;
  }

  public BlueprintMetadataAttributes tileIconActionFqn(String tileIconActionFqn) {
    this.tileIconActionFqn = tileIconActionFqn;
    return this;
  }

  /**
   * The fully qualified name of the action used as the tile icon.
   *
   * @return tileIconActionFqn
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TILE_ICON_ACTION_FQN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTileIconActionFqn() {
    return tileIconActionFqn;
  }

  public void setTileIconActionFqn(String tileIconActionFqn) {
    this.tileIconActionFqn = tileIconActionFqn;
  }

  public BlueprintMetadataAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The timestamp when the blueprint was last updated.
   *
   * @return updatedAt
   */
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
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
   * @return BlueprintMetadataAttributes
   */
  @JsonAnySetter
  public BlueprintMetadataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this BlueprintMetadataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlueprintMetadataAttributes blueprintMetadataAttributes = (BlueprintMetadataAttributes) o;
    return Objects.equals(this.createdAt, blueprintMetadataAttributes.createdAt)
        && Objects.equals(this.description, blueprintMetadataAttributes.description)
        && Objects.equals(this.name, blueprintMetadataAttributes.name)
        && Objects.equals(this.slug, blueprintMetadataAttributes.slug)
        && Objects.equals(this.tags, blueprintMetadataAttributes.tags)
        && Objects.equals(this.tileBackground, blueprintMetadataAttributes.tileBackground)
        && Objects.equals(this.tileIconActionFqn, blueprintMetadataAttributes.tileIconActionFqn)
        && Objects.equals(this.updatedAt, blueprintMetadataAttributes.updatedAt)
        && Objects.equals(
            this.additionalProperties, blueprintMetadataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        description,
        name,
        slug,
        tags,
        tileBackground,
        tileIconActionFqn,
        updatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlueprintMetadataAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    tileBackground: ").append(toIndentedString(tileBackground)).append("\n");
    sb.append("    tileIconActionFqn: ").append(toIndentedString(tileIconActionFqn)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
