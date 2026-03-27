/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>The data attributes of a notebook.</p>
 */
@JsonPropertyOrder({
  NotebookCreateDataAttributes.JSON_PROPERTY_CELLS,
  NotebookCreateDataAttributes.JSON_PROPERTY_METADATA,
  NotebookCreateDataAttributes.JSON_PROPERTY_NAME,
  NotebookCreateDataAttributes.JSON_PROPERTY_STATUS,
  NotebookCreateDataAttributes.JSON_PROPERTY_TIME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NotebookCreateDataAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CELLS = "cells";
  private List<NotebookCellCreateRequest> cells = new ArrayList<>();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private NotebookMetadata metadata;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_STATUS = "status";
  private NotebookStatus status = NotebookStatus.PUBLISHED;

  public static final String JSON_PROPERTY_TIME = "time";
  private NotebookGlobalTime time;

  public NotebookCreateDataAttributes() {}

  @JsonCreator
  public NotebookCreateDataAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_CELLS)List<NotebookCellCreateRequest> cells,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_TIME)NotebookGlobalTime time) {
        this.cells = cells;
        this.name = name;
        this.time = time;
        this.unparsed |= time.unparsed;
  }
  public NotebookCreateDataAttributes cells(List<NotebookCellCreateRequest> cells) {
    this.cells = cells;
    for (NotebookCellCreateRequest item : cells) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public NotebookCreateDataAttributes addCellsItem(NotebookCellCreateRequest cellsItem) {
    this.cells.add(cellsItem);
    this.unparsed |= cellsItem.unparsed;
    return this;
  }

  /**
   * <p>List of cells to display in the notebook.</p>
   * @return cells
  **/
      @JsonProperty(JSON_PROPERTY_CELLS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<NotebookCellCreateRequest> getCells() {
        return cells;
      }
  public void setCells(List<NotebookCellCreateRequest> cells) {
    this.cells = cells;
  }
  public NotebookCreateDataAttributes metadata(NotebookMetadata metadata) {
    this.metadata = metadata;
    this.unparsed |= metadata.unparsed;
    return this;
  }

  /**
   * <p>Metadata associated with the notebook.</p>
   * @return metadata
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_METADATA)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public NotebookMetadata getMetadata() {
        return metadata;
      }
  public void setMetadata(NotebookMetadata metadata) {
    this.metadata = metadata;
  }
  public NotebookCreateDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name of the notebook.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public NotebookCreateDataAttributes status(NotebookStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * <p>Publication status of the notebook. For now, always "published".</p>
   * @return status
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public NotebookStatus getStatus() {
        return status;
      }
  public void setStatus(NotebookStatus status) {
    if (!status.isValid()) {
        this.unparsed = true;
    }
    this.status = status;
  }
  public NotebookCreateDataAttributes time(NotebookGlobalTime time) {
    this.time = time;
    this.unparsed |= time.unparsed;
    return this;
  }

  /**
   * <p>Notebook global timeframe.</p>
   * @return time
  **/
      @JsonProperty(JSON_PROPERTY_TIME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public NotebookGlobalTime getTime() {
        return time;
      }
  public void setTime(NotebookGlobalTime time) {
    this.time = time;
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
   * @return NotebookCreateDataAttributes
   */
  @JsonAnySetter
  public NotebookCreateDataAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this NotebookCreateDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotebookCreateDataAttributes notebookCreateDataAttributes = (NotebookCreateDataAttributes) o;
    return Objects.equals(this.cells, notebookCreateDataAttributes.cells) && Objects.equals(this.metadata, notebookCreateDataAttributes.metadata) && Objects.equals(this.name, notebookCreateDataAttributes.name) && Objects.equals(this.status, notebookCreateDataAttributes.status) && Objects.equals(this.time, notebookCreateDataAttributes.time) && Objects.equals(this.additionalProperties, notebookCreateDataAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(cells,metadata,name,status,time, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebookCreateDataAttributes {\n");
    sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
