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

/** The attributes of a notebook <code>markdown</code> cell. */
@JsonPropertyOrder({NotebookMarkdownCellAttributes.JSON_PROPERTY_DEFINITION})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NotebookMarkdownCellAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEFINITION = "definition";
  private NotebookMarkdownCellDefinition definition;

  public NotebookMarkdownCellAttributes() {}

  @JsonCreator
  public NotebookMarkdownCellAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DEFINITION)
          NotebookMarkdownCellDefinition definition) {
    this.definition = definition;
    this.unparsed |= definition.unparsed;
  }

  public NotebookMarkdownCellAttributes definition(NotebookMarkdownCellDefinition definition) {
    this.definition = definition;
    this.unparsed |= definition.unparsed;
    return this;
  }

  /**
   * Text in a notebook is formatted with <a
   * href="https://daringfireball.net/projects/markdown/">Markdown</a>, which enables the use of
   * headings, subheadings, links, images, lists, and code blocks.
   *
   * @return definition
   */
  @JsonProperty(JSON_PROPERTY_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public NotebookMarkdownCellDefinition getDefinition() {
    return definition;
  }

  public void setDefinition(NotebookMarkdownCellDefinition definition) {
    this.definition = definition;
  }

  /** Return true if this NotebookMarkdownCellAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotebookMarkdownCellAttributes notebookMarkdownCellAttributes =
        (NotebookMarkdownCellAttributes) o;
    return Objects.equals(this.definition, notebookMarkdownCellAttributes.definition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebookMarkdownCellAttributes {\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
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
