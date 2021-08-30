/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** The attributes of a notebook. */
@ApiModel(description = "The attributes of a notebook.")
@JsonPropertyOrder({
  NotebookResponseDataAttributes.JSON_PROPERTY_AUTHOR,
  NotebookResponseDataAttributes.JSON_PROPERTY_CELLS,
  NotebookResponseDataAttributes.JSON_PROPERTY_CREATED,
  NotebookResponseDataAttributes.JSON_PROPERTY_MODIFIED,
  NotebookResponseDataAttributes.JSON_PROPERTY_NAME,
  NotebookResponseDataAttributes.JSON_PROPERTY_STATUS,
  NotebookResponseDataAttributes.JSON_PROPERTY_TIME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NotebookResponseDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHOR = "author";
  private NotebookAuthor author;

  public static final String JSON_PROPERTY_CELLS = "cells";
  private List<NotebookCellResponse> cells = new ArrayList<>();

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
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
   * Get author
   *
   * @return author
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(
      example =
          "[{\"attributes\":{\"definition\":{\"text\":\"## Some test markdown\\n"
              + "\\n"
              + "```js\\n"
              + "var x, y;\\n"
              + "x = 5;\\n"
              + "y = 6;\\n"
              + "```\",\"type\":\"markdown\"}},\"id\":\"bzbycoya\",\"type\":\"notebook_cells\"},{\"attributes\":{\"definition\":{\"requests\":[{\"display_type\":\"line\",\"q\":\"avg:system.load.1{*}\",\"style\":{\"line_type\":\"solid\",\"line_width\":\"normal\",\"palette\":\"dog_classic\"}}],\"show_legend\":true,\"type\":\"timeseries\",\"yaxis\":{\"scale\":\"linear\"}},\"graph_size\":\"m\",\"split_by\":{\"keys\":[],\"tags\":[]},\"time\":null},\"id\":\"9k6bc6xc\",\"type\":\"notebook_cells\"}]",
      required = true,
      value = "List of cells to display in the notebook.")
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
  @ApiModelProperty(
      example = "2021-02-24T23:14:15.173964Z",
      value = "UTC time stamp for when the notebook was created.")
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreated() {
    return created;
  }

  /**
   * UTC time stamp for when the notebook was last modified.
   *
   * @return modified
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example = "2021-02-24T23:15:23.274966Z",
      value = "UTC time stamp for when the notebook was last modified.")
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
  @ApiModelProperty(
      example = "Example Notebook",
      required = true,
      value = "The name of the notebook.")
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
   * Get status
   *
   * @return status
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
   * Get time
   *
   * @return time
   */
  @ApiModelProperty(required = true, value = "")
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
        && Objects.equals(this.modified, notebookResponseDataAttributes.modified)
        && Objects.equals(this.name, notebookResponseDataAttributes.name)
        && Objects.equals(this.status, notebookResponseDataAttributes.status)
        && Objects.equals(this.time, notebookResponseDataAttributes.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, cells, created, modified, name, status, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebookResponseDataAttributes {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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
