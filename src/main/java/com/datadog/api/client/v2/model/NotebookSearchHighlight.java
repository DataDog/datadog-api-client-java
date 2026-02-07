/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Highlighted fields from the notebook search. */
@JsonPropertyOrder({
  NotebookSearchHighlight.JSON_PROPERTY_CELLS_TEXT,
  NotebookSearchHighlight.JSON_PROPERTY_CELLS_TITLE,
  NotebookSearchHighlight.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NotebookSearchHighlight {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CELLS_TEXT = "cells.text";
  private List<String> cellsText = null;

  public static final String JSON_PROPERTY_CELLS_TITLE = "cells.title";
  private List<String> cellsTitle = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private List<String> name = null;

  public NotebookSearchHighlight cellsText(List<String> cellsText) {
    this.cellsText = cellsText;
    return this;
  }

  public NotebookSearchHighlight addCellsTextItem(String cellsTextItem) {
    if (this.cellsText == null) {
      this.cellsText = new ArrayList<>();
    }
    this.cellsText.add(cellsTextItem);
    return this;
  }

  /**
   * Highlighted cell text matches.
   *
   * @return cellsText
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CELLS_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getCellsText() {
    return cellsText;
  }

  public void setCellsText(List<String> cellsText) {
    this.cellsText = cellsText;
  }

  public NotebookSearchHighlight cellsTitle(List<String> cellsTitle) {
    this.cellsTitle = cellsTitle;
    return this;
  }

  public NotebookSearchHighlight addCellsTitleItem(String cellsTitleItem) {
    if (this.cellsTitle == null) {
      this.cellsTitle = new ArrayList<>();
    }
    this.cellsTitle.add(cellsTitleItem);
    return this;
  }

  /**
   * Highlighted cell title matches.
   *
   * @return cellsTitle
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CELLS_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getCellsTitle() {
    return cellsTitle;
  }

  public void setCellsTitle(List<String> cellsTitle) {
    this.cellsTitle = cellsTitle;
  }

  public NotebookSearchHighlight name(List<String> name) {
    this.name = name;
    return this;
  }

  public NotebookSearchHighlight addNameItem(String nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<>();
    }
    this.name.add(nameItem);
    return this;
  }

  /**
   * Highlighted notebook name matches.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getName() {
    return name;
  }

  public void setName(List<String> name) {
    this.name = name;
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
   * @return NotebookSearchHighlight
   */
  @JsonAnySetter
  public NotebookSearchHighlight putAdditionalProperty(String key, Object value) {
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

  /** Return true if this NotebookSearchHighlight object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotebookSearchHighlight notebookSearchHighlight = (NotebookSearchHighlight) o;
    return Objects.equals(this.cellsText, notebookSearchHighlight.cellsText)
        && Objects.equals(this.cellsTitle, notebookSearchHighlight.cellsTitle)
        && Objects.equals(this.name, notebookSearchHighlight.name)
        && Objects.equals(this.additionalProperties, notebookSearchHighlight.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cellsText, cellsTitle, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebookSearchHighlight {\n");
    sb.append("    cellsText: ").append(toIndentedString(cellsText)).append("\n");
    sb.append("    cellsTitle: ").append(toIndentedString(cellsTitle)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
