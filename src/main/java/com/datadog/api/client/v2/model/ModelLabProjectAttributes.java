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
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes of a Model Lab project. */
@JsonPropertyOrder({
  ModelLabProjectAttributes.JSON_PROPERTY_ARTIFACT_STORAGE_LOCATION,
  ModelLabProjectAttributes.JSON_PROPERTY_CREATED_AT,
  ModelLabProjectAttributes.JSON_PROPERTY_DELETED_AT,
  ModelLabProjectAttributes.JSON_PROPERTY_DESCRIPTION,
  ModelLabProjectAttributes.JSON_PROPERTY_EXTERNAL_URL,
  ModelLabProjectAttributes.JSON_PROPERTY_IS_STARRED,
  ModelLabProjectAttributes.JSON_PROPERTY_NAME,
  ModelLabProjectAttributes.JSON_PROPERTY_OWNER_ID,
  ModelLabProjectAttributes.JSON_PROPERTY_TAGS,
  ModelLabProjectAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ModelLabProjectAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARTIFACT_STORAGE_LOCATION = "artifact_storage_location";
  private String artifactStorageLocation;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DELETED_AT = "deleted_at";
  private JsonNullable<OffsetDateTime> deletedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EXTERNAL_URL = "external_url";
  private JsonNullable<String> externalUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IS_STARRED = "is_starred";
  private Boolean isStarred;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OWNER_ID = "owner_id";
  private JsonNullable<String> ownerId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<ModelLabTag> tags = new ArrayList<>();

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public ModelLabProjectAttributes() {}

  @JsonCreator
  public ModelLabProjectAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ARTIFACT_STORAGE_LOCATION)
          String artifactStorageLocation,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_STARRED) Boolean isStarred,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAGS) List<ModelLabTag> tags,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt) {
    this.artifactStorageLocation = artifactStorageLocation;
    this.createdAt = createdAt;
    this.description = description;
    this.isStarred = isStarred;
    this.name = name;
    this.tags = tags;
    for (ModelLabTag item : tags) {
      this.unparsed |= item.unparsed;
    }
    this.updatedAt = updatedAt;
  }

  public ModelLabProjectAttributes artifactStorageLocation(String artifactStorageLocation) {
    this.artifactStorageLocation = artifactStorageLocation;
    return this;
  }

  /**
   * The storage location for project artifacts.
   *
   * @return artifactStorageLocation
   */
  @JsonProperty(JSON_PROPERTY_ARTIFACT_STORAGE_LOCATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getArtifactStorageLocation() {
    return artifactStorageLocation;
  }

  public void setArtifactStorageLocation(String artifactStorageLocation) {
    this.artifactStorageLocation = artifactStorageLocation;
  }

  public ModelLabProjectAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date and time the project was created.
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

  public ModelLabProjectAttributes deletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = JsonNullable.<OffsetDateTime>of(deletedAt);
    return this;
  }

  /**
   * The date and time the project was soft-deleted.
   *
   * @return deletedAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getDeletedAt() {
    return deletedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DELETED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getDeletedAt_JsonNullable() {
    return deletedAt;
  }

  @JsonProperty(JSON_PROPERTY_DELETED_AT)
  public void setDeletedAt_JsonNullable(JsonNullable<OffsetDateTime> deletedAt) {
    this.deletedAt = deletedAt;
  }

  public void setDeletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = JsonNullable.<OffsetDateTime>of(deletedAt);
  }

  public ModelLabProjectAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of the project.
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

  public ModelLabProjectAttributes externalUrl(String externalUrl) {
    this.externalUrl = JsonNullable.<String>of(externalUrl);
    return this;
  }

  /**
   * An optional external URL associated with the project.
   *
   * @return externalUrl
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getExternalUrl() {
    return externalUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXTERNAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getExternalUrl_JsonNullable() {
    return externalUrl;
  }

  @JsonProperty(JSON_PROPERTY_EXTERNAL_URL)
  public void setExternalUrl_JsonNullable(JsonNullable<String> externalUrl) {
    this.externalUrl = externalUrl;
  }

  public void setExternalUrl(String externalUrl) {
    this.externalUrl = JsonNullable.<String>of(externalUrl);
  }

  public ModelLabProjectAttributes isStarred(Boolean isStarred) {
    this.isStarred = isStarred;
    return this;
  }

  /**
   * Whether the project is starred by the current user.
   *
   * @return isStarred
   */
  @JsonProperty(JSON_PROPERTY_IS_STARRED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsStarred() {
    return isStarred;
  }

  public void setIsStarred(Boolean isStarred) {
    this.isStarred = isStarred;
  }

  public ModelLabProjectAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the project.
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

  public ModelLabProjectAttributes ownerId(String ownerId) {
    this.ownerId = JsonNullable.<String>of(ownerId);
    return this;
  }

  /**
   * The UUID of the project owner.
   *
   * @return ownerId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getOwnerId() {
    return ownerId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OWNER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getOwnerId_JsonNullable() {
    return ownerId;
  }

  @JsonProperty(JSON_PROPERTY_OWNER_ID)
  public void setOwnerId_JsonNullable(JsonNullable<String> ownerId) {
    this.ownerId = ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = JsonNullable.<String>of(ownerId);
  }

  public ModelLabProjectAttributes tags(List<ModelLabTag> tags) {
    this.tags = tags;
    for (ModelLabTag item : tags) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ModelLabProjectAttributes addTagsItem(ModelLabTag tagsItem) {
    this.tags.add(tagsItem);
    this.unparsed |= tagsItem.unparsed;
    return this;
  }

  /**
   * The list of tags associated with the project.
   *
   * @return tags
   */
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ModelLabTag> getTags() {
    return tags;
  }

  public void setTags(List<ModelLabTag> tags) {
    this.tags = tags;
    if (tags != null) {
      for (ModelLabTag item : tags) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ModelLabProjectAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The date and time the project was last updated.
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
   * @return ModelLabProjectAttributes
   */
  @JsonAnySetter
  public ModelLabProjectAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ModelLabProjectAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelLabProjectAttributes modelLabProjectAttributes = (ModelLabProjectAttributes) o;
    return Objects.equals(
            this.artifactStorageLocation, modelLabProjectAttributes.artifactStorageLocation)
        && Objects.equals(this.createdAt, modelLabProjectAttributes.createdAt)
        && Objects.equals(this.deletedAt, modelLabProjectAttributes.deletedAt)
        && Objects.equals(this.description, modelLabProjectAttributes.description)
        && Objects.equals(this.externalUrl, modelLabProjectAttributes.externalUrl)
        && Objects.equals(this.isStarred, modelLabProjectAttributes.isStarred)
        && Objects.equals(this.name, modelLabProjectAttributes.name)
        && Objects.equals(this.ownerId, modelLabProjectAttributes.ownerId)
        && Objects.equals(this.tags, modelLabProjectAttributes.tags)
        && Objects.equals(this.updatedAt, modelLabProjectAttributes.updatedAt)
        && Objects.equals(
            this.additionalProperties, modelLabProjectAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        artifactStorageLocation,
        createdAt,
        deletedAt,
        description,
        externalUrl,
        isStarred,
        name,
        ownerId,
        tags,
        updatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelLabProjectAttributes {\n");
    sb.append("    artifactStorageLocation: ")
        .append(toIndentedString(artifactStorageLocation))
        .append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    isStarred: ").append(toIndentedString(isStarred)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
