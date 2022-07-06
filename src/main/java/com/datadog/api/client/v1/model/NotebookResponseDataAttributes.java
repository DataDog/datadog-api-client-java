/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.datadog.api.client.JsonTimeSerializer;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** The attributes of a notebook. */
@JsonPropertyOrder({
  NotebookResponseDataAttributes.JSON_PROPERTY_AUTHOR,
  NotebookResponseDataAttributes.JSON_PROPERTY_CELLS,
  NotebookResponseDataAttributes.JSON_PROPERTY_CREATED,
  NotebookResponseDataAttributes.JSON_PROPERTY_METADATA,
  NotebookResponseDataAttributes.JSON_PROPERTY_MODIFIED,
  NotebookResponseDataAttributes.JSON_PROPERTY_NAME,
  NotebookResponseDataAttributes.JSON_PROPERTY_STATUS,
  NotebookResponseDataAttributes.JSON_PROPERTY_TIME
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NotebookResponseDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHOR = "author";
  private NotebookAuthor author;

  public static final String JSON_PROPERTY_CELLS = "cells";
  private List<NotebookCellResponse> cells = new ArrayList<>();

  public static final String JSON_PROPERTY_CREATED = "created";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private NotebookMetadata metadata;

  public static final String JSON_PROPERTY_MODIFIED = "modified";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime modified;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_STATUS = "status";
  private NotebookStatus status = NotebookStatus.PUBLISHED;

  public static final String JSON_PROPERTY_TIME = "time";
  private NotebookGlobalTime time;

  public NotebookResponseDataAttributes() {}

  @JsonCreator
  public NotebookResponseDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CELLS) List<NotebookCellResponse> cells,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIME) NotebookGlobalTime time) {
    this.cells = cells;
    this.name = name;
    this.time = time;
    this.unparsed |= time.unparsed;
  }

  public NotebookResponseDataAttributes author(NotebookAuthor author) {
    this.author = author;
    this.unparsed |= author.unparsed;
    return this;
  }

  /**
   * Attributes of user object returned by the API.
   *
   * @return author
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NotebookAuthor getAuthor() {
    return author;
  }

  public void setAuthor(NotebookAuthor author) {
    this.author = author;
  }

  public NotebookResponseDataAttributes cells(List<NotebookCellResponse> cells) {
    this.cells = cells;
    for (NotebookCellResponse item : cells) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public NotebookResponseDataAttributes addCellsItem(NotebookCellResponse cellsItem) {
    this.cells.add(cellsItem);
    this.unparsed |= cellsItem.unparsed;
    return this;
  }

  /**
   * List of cells to display in the notebook.
   *
   * @return cells
   */
  @JsonProperty(JSON_PROPERTY_CELLS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreated() {
    return created;
  }

  public NotebookResponseDataAttributes metadata(NotebookMetadata metadata) {
    this.metadata = metadata;
    this.unparsed |= metadata.unparsed;
    return this;
  }

  /**
   * Metadata associated with the notebook.
   *
   * @return metadata
   */
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getModified() {
    return modified;
  }

  public NotebookResponseDataAttributes name(String name) {
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

  public NotebookResponseDataAttributes status(NotebookStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * Publication status of the notebook. For now, always "published".
   *
   * @return status
   */
  @javax.annotation.Nullable
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

  public NotebookResponseDataAttributes time(NotebookGlobalTime time) {
    this.time = time;
    this.unparsed |= time.unparsed;
    return this;
  }

  /**
   * Notebook global timeframe.
   *
   * @return time
   */
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public NotebookGlobalTime getTime() {
    return time;
  }

  public void setTime(NotebookGlobalTime time) {
    this.time = time;
  }

  /** Return true if this NotebookResponseDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotebookResponseDataAttributes notebookResponseDataAttributes =
        (NotebookResponseDataAttributes) o;
    return Objects.equals(this.author, notebookResponseDataAttributes.author)
        && Objects.equals(this.cells, notebookResponseDataAttributes.cells)
        && Objects.equals(this.created, notebookResponseDataAttributes.created)
        && Objects.equals(this.metadata, notebookResponseDataAttributes.metadata)
        && Objects.equals(this.modified, notebookResponseDataAttributes.modified)
        && Objects.equals(this.name, notebookResponseDataAttributes.name)
        && Objects.equals(this.status, notebookResponseDataAttributes.status)
        && Objects.equals(this.time, notebookResponseDataAttributes.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, cells, created, metadata, modified, name, status, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebookResponseDataAttributes {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("}");
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
