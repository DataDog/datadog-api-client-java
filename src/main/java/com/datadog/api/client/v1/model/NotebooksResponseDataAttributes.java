/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** The attributes of a notebook in get all response. */
@JsonPropertyOrder({
  NotebooksResponseDataAttributes.JSON_PROPERTY_AUTHOR,
  NotebooksResponseDataAttributes.JSON_PROPERTY_CELLS,
  NotebooksResponseDataAttributes.JSON_PROPERTY_CREATED,
  NotebooksResponseDataAttributes.JSON_PROPERTY_METADATA,
  NotebooksResponseDataAttributes.JSON_PROPERTY_MODIFIED,
  NotebooksResponseDataAttributes.JSON_PROPERTY_NAME,
  NotebooksResponseDataAttributes.JSON_PROPERTY_STATUS,
  NotebooksResponseDataAttributes.JSON_PROPERTY_TIME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NotebooksResponseDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHOR = "author";
  private NotebookAuthor author;

  public static final String JSON_PROPERTY_CELLS = "cells";
  private List<NotebookCellResponse> cells = null;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private NotebookMetadata metadata;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private OffsetDateTime modified;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_STATUS = "status";
  private NotebookStatus status = NotebookStatus.PUBLISHED;

  public static final String JSON_PROPERTY_TIME = "time";
  private NotebookGlobalTime time;

  public NotebooksResponseDataAttributes() {}

  @JsonCreator
  public NotebooksResponseDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.name = name;
  }

  public NotebooksResponseDataAttributes author(NotebookAuthor author) {
    this.author = author;
    this.unparsed |= author.unparsed;
    return this;
  }

  /**
   * Attributes of user object returned by the API.
   *
   * @return author
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NotebookAuthor getAuthor() {
    return author;
  }

  public void setAuthor(NotebookAuthor author) {
    this.author = author;
  }

  public NotebooksResponseDataAttributes cells(List<NotebookCellResponse> cells) {
    this.cells = cells;
    for (NotebookCellResponse item : cells) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public NotebooksResponseDataAttributes addCellsItem(NotebookCellResponse cellsItem) {
    if (this.cells == null) {
      this.cells = new ArrayList<>();
    }
    this.cells.add(cellsItem);
    this.unparsed |= cellsItem.unparsed;
    return this;
  }

  /**
   * List of cells to display in the notebook.
   *
   * @return cells
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CELLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<NotebookCellResponse> getCells() {
    return cells;
  }

  public void setCells(List<NotebookCellResponse> cells) {
    this.cells = cells;
  }

  /**
   * UTC time stamp for when the notebook was created.
   *
   * @return created
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreated() {
    return created;
  }

  public NotebooksResponseDataAttributes metadata(NotebookMetadata metadata) {
    this.metadata = metadata;
    this.unparsed |= metadata.unparsed;
    return this;
  }

  /**
   * Metadata associated with the notebook.
   *
   * @return metadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NotebookMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(NotebookMetadata metadata) {
    this.metadata = metadata;
  }

  /**
   * UTC time stamp for when the notebook was last modified.
   *
   * @return modified
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getModified() {
    return modified;
  }

  public NotebooksResponseDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the notebook.
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

  public NotebooksResponseDataAttributes status(NotebookStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * Publication status of the notebook. For now, always "published".
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NotebookStatus getStatus() {
    return status;
  }

  public void setStatus(NotebookStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public NotebooksResponseDataAttributes time(NotebookGlobalTime time) {
    this.time = time;
    this.unparsed |= time.unparsed;
    return this;
  }

  /**
   * Notebook global timeframe.
   *
   * @return time
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NotebookGlobalTime getTime() {
    return time;
  }

  public void setTime(NotebookGlobalTime time) {
    this.time = time;
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
   * @return NotebooksResponseDataAttributes
   */
  @JsonAnySetter
  public NotebooksResponseDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this NotebooksResponseDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotebooksResponseDataAttributes notebooksResponseDataAttributes =
        (NotebooksResponseDataAttributes) o;
    return Objects.equals(this.author, notebooksResponseDataAttributes.author)
        && Objects.equals(this.cells, notebooksResponseDataAttributes.cells)
        && Objects.equals(this.created, notebooksResponseDataAttributes.created)
        && Objects.equals(this.metadata, notebooksResponseDataAttributes.metadata)
        && Objects.equals(this.modified, notebooksResponseDataAttributes.modified)
        && Objects.equals(this.name, notebooksResponseDataAttributes.name)
        && Objects.equals(this.status, notebooksResponseDataAttributes.status)
        && Objects.equals(this.time, notebooksResponseDataAttributes.time)
        && Objects.equals(
            this.additionalProperties, notebooksResponseDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        author, cells, created, metadata, modified, name, status, time, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebooksResponseDataAttributes {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
