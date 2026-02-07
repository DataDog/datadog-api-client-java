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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Metadata about the notebook. */
@JsonPropertyOrder({
  NotebookSearchMetadata.JSON_PROPERTY_AUTHOR,
  NotebookSearchMetadata.JSON_PROPERTY_CELL_COUNT,
  NotebookSearchMetadata.JSON_PROPERTY_CREATED_AT,
  NotebookSearchMetadata.JSON_PROPERTY_DELETED_AT,
  NotebookSearchMetadata.JSON_PROPERTY_EXPERIENCE_TYPE,
  NotebookSearchMetadata.JSON_PROPERTY_HAS_COMPUTATIONAL_CELLS,
  NotebookSearchMetadata.JSON_PROPERTY_IS_FAVORITED,
  NotebookSearchMetadata.JSON_PROPERTY_IS_TEMPLATE,
  NotebookSearchMetadata.JSON_PROPERTY_MODIFIED_AT,
  NotebookSearchMetadata.JSON_PROPERTY_STATUS,
  NotebookSearchMetadata.JSON_PROPERTY_TAKE_SNAPSHOTS,
  NotebookSearchMetadata.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NotebookSearchMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHOR = "author";
  private NotebookSearchUser author;

  public static final String JSON_PROPERTY_CELL_COUNT = "cell_count";
  private Long cellCount;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DELETED_AT = "deleted_at";
  private OffsetDateTime deletedAt;

  public static final String JSON_PROPERTY_EXPERIENCE_TYPE = "experience_type";
  private String experienceType;

  public static final String JSON_PROPERTY_HAS_COMPUTATIONAL_CELLS = "has_computational_cells";
  private Boolean hasComputationalCells;

  public static final String JSON_PROPERTY_IS_FAVORITED = "is_favorited";
  private Boolean isFavorited;

  public static final String JSON_PROPERTY_IS_TEMPLATE = "is_template";
  private Boolean isTemplate;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TAKE_SNAPSHOTS = "take_snapshots";
  private Boolean takeSnapshots;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public NotebookSearchMetadata() {}

  @JsonCreator
  public NotebookSearchMetadata(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTHOR) NotebookSearchUser author,
      @JsonProperty(required = true, value = JSON_PROPERTY_CELL_COUNT) Long cellCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_DELETED_AT) OffsetDateTime deletedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPERIENCE_TYPE) String experienceType,
      @JsonProperty(required = true, value = JSON_PROPERTY_HAS_COMPUTATIONAL_CELLS)
          Boolean hasComputationalCells,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_FAVORITED) Boolean isFavorited,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_TEMPLATE) Boolean isTemplate,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_AT) OffsetDateTime modifiedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) String status,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAKE_SNAPSHOTS) Boolean takeSnapshots,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) String type) {
    this.author = author;
    this.unparsed |= author.unparsed;
    this.cellCount = cellCount;
    this.createdAt = createdAt;
    this.deletedAt = deletedAt;
    if (deletedAt != null) {}
    this.experienceType = experienceType;
    if (experienceType != null) {}
    this.hasComputationalCells = hasComputationalCells;
    this.isFavorited = isFavorited;
    this.isTemplate = isTemplate;
    this.modifiedAt = modifiedAt;
    this.status = status;
    this.takeSnapshots = takeSnapshots;
    this.type = type;
  }

  public NotebookSearchMetadata author(NotebookSearchUser author) {
    this.author = author;
    this.unparsed |= author.unparsed;
    return this;
  }

  /**
   * User information.
   *
   * @return author
   */
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public NotebookSearchUser getAuthor() {
    return author;
  }

  public void setAuthor(NotebookSearchUser author) {
    this.author = author;
  }

  public NotebookSearchMetadata cellCount(Long cellCount) {
    this.cellCount = cellCount;
    return this;
  }

  /**
   * Number of cells in the notebook.
   *
   * @return cellCount
   */
  @JsonProperty(JSON_PROPERTY_CELL_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getCellCount() {
    return cellCount;
  }

  public void setCellCount(Long cellCount) {
    this.cellCount = cellCount;
  }

  public NotebookSearchMetadata createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Time at which the notebook was created.
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

  public NotebookSearchMetadata deletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
    if (deletedAt != null) {}
    return this;
  }

  /**
   * Time at which the notebook was deleted, or null if not deleted.
   *
   * @return deletedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
  }

  public NotebookSearchMetadata experienceType(String experienceType) {
    this.experienceType = experienceType;
    if (experienceType != null) {}
    return this;
  }

  /**
   * Experience type of the notebook.
   *
   * @return experienceType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPERIENCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getExperienceType() {
    return experienceType;
  }

  public void setExperienceType(String experienceType) {
    this.experienceType = experienceType;
  }

  public NotebookSearchMetadata hasComputationalCells(Boolean hasComputationalCells) {
    this.hasComputationalCells = hasComputationalCells;
    return this;
  }

  /**
   * Whether the notebook has computational cells.
   *
   * @return hasComputationalCells
   */
  @JsonProperty(JSON_PROPERTY_HAS_COMPUTATIONAL_CELLS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getHasComputationalCells() {
    return hasComputationalCells;
  }

  public void setHasComputationalCells(Boolean hasComputationalCells) {
    this.hasComputationalCells = hasComputationalCells;
  }

  public NotebookSearchMetadata isFavorited(Boolean isFavorited) {
    this.isFavorited = isFavorited;
    return this;
  }

  /**
   * Whether the notebook is favorited by the user.
   *
   * @return isFavorited
   */
  @JsonProperty(JSON_PROPERTY_IS_FAVORITED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsFavorited() {
    return isFavorited;
  }

  public void setIsFavorited(Boolean isFavorited) {
    this.isFavorited = isFavorited;
  }

  public NotebookSearchMetadata isTemplate(Boolean isTemplate) {
    this.isTemplate = isTemplate;
    return this;
  }

  /**
   * Whether the notebook is a template.
   *
   * @return isTemplate
   */
  @JsonProperty(JSON_PROPERTY_IS_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsTemplate() {
    return isTemplate;
  }

  public void setIsTemplate(Boolean isTemplate) {
    this.isTemplate = isTemplate;
  }

  public NotebookSearchMetadata modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Time at which the notebook was last updated.
   *
   * @return modifiedAt
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public NotebookSearchMetadata status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the notebook.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public NotebookSearchMetadata takeSnapshots(Boolean takeSnapshots) {
    this.takeSnapshots = takeSnapshots;
    return this;
  }

  /**
   * Whether the notebook can take a snapshot.
   *
   * @return takeSnapshots
   */
  @JsonProperty(JSON_PROPERTY_TAKE_SNAPSHOTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getTakeSnapshots() {
    return takeSnapshots;
  }

  public void setTakeSnapshots(Boolean takeSnapshots) {
    this.takeSnapshots = takeSnapshots;
  }

  public NotebookSearchMetadata type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Notebook type.
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
   * @return NotebookSearchMetadata
   */
  @JsonAnySetter
  public NotebookSearchMetadata putAdditionalProperty(String key, Object value) {
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

  /** Return true if this NotebookSearchMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotebookSearchMetadata notebookSearchMetadata = (NotebookSearchMetadata) o;
    return Objects.equals(this.author, notebookSearchMetadata.author)
        && Objects.equals(this.cellCount, notebookSearchMetadata.cellCount)
        && Objects.equals(this.createdAt, notebookSearchMetadata.createdAt)
        && Objects.equals(this.deletedAt, notebookSearchMetadata.deletedAt)
        && Objects.equals(this.experienceType, notebookSearchMetadata.experienceType)
        && Objects.equals(this.hasComputationalCells, notebookSearchMetadata.hasComputationalCells)
        && Objects.equals(this.isFavorited, notebookSearchMetadata.isFavorited)
        && Objects.equals(this.isTemplate, notebookSearchMetadata.isTemplate)
        && Objects.equals(this.modifiedAt, notebookSearchMetadata.modifiedAt)
        && Objects.equals(this.status, notebookSearchMetadata.status)
        && Objects.equals(this.takeSnapshots, notebookSearchMetadata.takeSnapshots)
        && Objects.equals(this.type, notebookSearchMetadata.type)
        && Objects.equals(this.additionalProperties, notebookSearchMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        author,
        cellCount,
        createdAt,
        deletedAt,
        experienceType,
        hasComputationalCells,
        isFavorited,
        isTemplate,
        modifiedAt,
        status,
        takeSnapshots,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebookSearchMetadata {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    cellCount: ").append(toIndentedString(cellCount)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    experienceType: ").append(toIndentedString(experienceType)).append("\n");
    sb.append("    hasComputationalCells: ")
        .append(toIndentedString(hasComputationalCells))
        .append("\n");
    sb.append("    isFavorited: ").append(toIndentedString(isFavorited)).append("\n");
    sb.append("    isTemplate: ").append(toIndentedString(isTemplate)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    takeSnapshots: ").append(toIndentedString(takeSnapshots)).append("\n");
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
