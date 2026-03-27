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
   * <p>Text in a notebook is formatted with <a href="https://daringfireball.net/projects/markdown/">Markdown</a>, which enables the use of headings, subheadings, links, images, lists, and code blocks.</p>
 */
@JsonPropertyOrder({
  NotebookMarkdownCellDefinition.JSON_PROPERTY_TEXT,
  NotebookMarkdownCellDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NotebookMarkdownCellDefinition {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_TYPE = "type";
  private NotebookMarkdownCellDefinitionType type = NotebookMarkdownCellDefinitionType.MARKDOWN;

  public NotebookMarkdownCellDefinition() {}

  @JsonCreator
  public NotebookMarkdownCellDefinition(
            @JsonProperty(required=true, value=JSON_PROPERTY_TEXT)String text,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)NotebookMarkdownCellDefinitionType type) {
        this.text = text;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public NotebookMarkdownCellDefinition text(String text) {
    this.text = text;
    return this;
  }

  /**
   * <p>The markdown content.</p>
   * @return text
  **/
      @JsonProperty(JSON_PROPERTY_TEXT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * <p>Type of the markdown cell.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public NotebookMarkdownCellDefinitionType getType() {
        return type;
      }
  public void setType(NotebookMarkdownCellDefinitionType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
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
   * @return NotebookMarkdownCellDefinition
   */
  @JsonAnySetter
  public NotebookMarkdownCellDefinition putAdditionalProperty(String key, Object value) {
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
   * Return true if this NotebookMarkdownCellDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotebookMarkdownCellDefinition notebookMarkdownCellDefinition = (NotebookMarkdownCellDefinition) o;
    return Objects.equals(this.text, notebookMarkdownCellDefinition.text) && Objects.equals(this.type, notebookMarkdownCellDefinition.type) && Objects.equals(this.additionalProperties, notebookMarkdownCellDefinition.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(text,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebookMarkdownCellDefinition {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
