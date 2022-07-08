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
import java.util.Objects;

/**
 * Text in a notebook is formatted with <a
 * href="https://daringfireball.net/projects/markdown/">Markdown</a>, which enables the use of
 * headings, subheadings, links, images, lists, and code blocks.
 */
@JsonPropertyOrder({
  NotebookMarkdownCellDefinition.JSON_PROPERTY_TEXT,
  NotebookMarkdownCellDefinition.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NotebookMarkdownCellDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_TYPE = "type";
  private NotebookMarkdownCellDefinitionType type = NotebookMarkdownCellDefinitionType.MARKDOWN;

  public NotebookMarkdownCellDefinition() {}

  @JsonCreator
  public NotebookMarkdownCellDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_TEXT) String text,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          NotebookMarkdownCellDefinitionType type) {
    this.text = text;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public NotebookMarkdownCellDefinition text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The markdown content.
   *
   * @return text
   */
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public NotebookMarkdownCellDefinition type(NotebookMarkdownCellDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the markdown cell.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public NotebookMarkdownCellDefinitionType getType() {
    return type;
  }

  public void setType(NotebookMarkdownCellDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this NotebookMarkdownCellDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotebookMarkdownCellDefinition notebookMarkdownCellDefinition =
        (NotebookMarkdownCellDefinition) o;
    return Objects.equals(this.text, notebookMarkdownCellDefinition.text)
        && Objects.equals(this.type, notebookMarkdownCellDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebookMarkdownCellDefinition {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
