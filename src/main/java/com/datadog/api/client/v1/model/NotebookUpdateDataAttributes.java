/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** The data attributes of a notebook. */
@JsonPropertyOrder({
  NotebookUpdateDataAttributes.JSON_PROPERTY_CELLS,
  NotebookUpdateDataAttributes.JSON_PROPERTY_METADATA,
  NotebookUpdateDataAttributes.JSON_PROPERTY_NAME,
  NotebookUpdateDataAttributes.JSON_PROPERTY_STATUS,
  NotebookUpdateDataAttributes.JSON_PROPERTY_TIME
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NotebookUpdateDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CELLS = "cells";
  private List<NotebookUpdateCell> cells = new ArrayList<>();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private NotebookMetadata metadata;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_STATUS = "status";
  private NotebookStatus status = NotebookStatus.PUBLISHED;

  public static final String JSON_PROPERTY_TIME = "time";
  private NotebookGlobalTime time;

  public NotebookUpdateDataAttributes() {}

  @JsonCreator
  public NotebookUpdateDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CELLS) List<NotebookUpdateCell> cells,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIME) NotebookGlobalTime time) {
    this.cells = cells;
    this.name = name;
    this.time = time;
    this.unparsed |= time.unparsed;
  }

  public NotebookUpdateDataAttributes cells(List<NotebookUpdateCell> cells) {
    this.cells = cells;
    for (NotebookUpdateCell item : cells) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public NotebookUpdateDataAttributes addCellsItem(NotebookUpdateCell cellsItem) {
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
  public List<NotebookUpdateCell> getCells() {
    return cells;
  }

  public void setCells(List<NotebookUpdateCell> cells) {
    this.cells = cells;
  }

  public NotebookUpdateDataAttributes metadata(NotebookMetadata metadata) {
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

  public NotebookUpdateDataAttributes name(String name) {
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

  public NotebookUpdateDataAttributes status(NotebookStatus status) {
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

  public NotebookUpdateDataAttributes time(NotebookGlobalTime time) {
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

  /** Return true if this NotebookUpdateDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotebookUpdateDataAttributes notebookUpdateDataAttributes = (NotebookUpdateDataAttributes) o;
    return Objects.equals(this.cells, notebookUpdateDataAttributes.cells)
        && Objects.equals(this.metadata, notebookUpdateDataAttributes.metadata)
        && Objects.equals(this.name, notebookUpdateDataAttributes.name)
        && Objects.equals(this.status, notebookUpdateDataAttributes.status)
        && Objects.equals(this.time, notebookUpdateDataAttributes.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cells, metadata, name, status, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebookUpdateDataAttributes {\n");
    sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
