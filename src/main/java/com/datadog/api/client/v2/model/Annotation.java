/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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
   * <p>A list of annotations used in the workflow. These are like sticky notes for your workflow!</p>
 */
@JsonPropertyOrder({
  Annotation.JSON_PROPERTY_DISPLAY,
  Annotation.JSON_PROPERTY_ID,
  Annotation.JSON_PROPERTY_MARKDOWN_TEXT_ANNOTATION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class Annotation {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DISPLAY = "display";
  private AnnotationDisplay display;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MARKDOWN_TEXT_ANNOTATION = "markdownTextAnnotation";
  private AnnotationMarkdownTextAnnotation markdownTextAnnotation;

  public Annotation() {}

  @JsonCreator
  public Annotation(
            @JsonProperty(required=true, value=JSON_PROPERTY_DISPLAY)AnnotationDisplay display,
            @JsonProperty(required=true, value=JSON_PROPERTY_ID)String id,
            @JsonProperty(required=true, value=JSON_PROPERTY_MARKDOWN_TEXT_ANNOTATION)AnnotationMarkdownTextAnnotation markdownTextAnnotation) {
        this.display = display;
        this.unparsed |= display.unparsed;
        this.id = id;
        this.markdownTextAnnotation = markdownTextAnnotation;
        this.unparsed |= markdownTextAnnotation.unparsed;
  }
  public Annotation display(AnnotationDisplay display) {
    this.display = display;
    this.unparsed |= display.unparsed;
    return this;
  }

  /**
   * <p>The definition of <code>AnnotationDisplay</code> object.</p>
   * @return display
  **/
      @JsonProperty(JSON_PROPERTY_DISPLAY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public AnnotationDisplay getDisplay() {
        return display;
      }
  public void setDisplay(AnnotationDisplay display) {
    this.display = display;
  }
  public Annotation id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>The <code>Annotation</code> <code>id</code>.</p>
   * @return id
  **/
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getId() {
        return id;
      }
  public void setId(String id) {
    this.id = id;
  }
  public Annotation markdownTextAnnotation(AnnotationMarkdownTextAnnotation markdownTextAnnotation) {
    this.markdownTextAnnotation = markdownTextAnnotation;
    this.unparsed |= markdownTextAnnotation.unparsed;
    return this;
  }

  /**
   * <p>The definition of <code>AnnotationMarkdownTextAnnotation</code> object.</p>
   * @return markdownTextAnnotation
  **/
      @JsonProperty(JSON_PROPERTY_MARKDOWN_TEXT_ANNOTATION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public AnnotationMarkdownTextAnnotation getMarkdownTextAnnotation() {
        return markdownTextAnnotation;
      }
  public void setMarkdownTextAnnotation(AnnotationMarkdownTextAnnotation markdownTextAnnotation) {
    this.markdownTextAnnotation = markdownTextAnnotation;
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
   * @return Annotation
   */
  @JsonAnySetter
  public Annotation putAdditionalProperty(String key, Object value) {
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
   * Return true if this Annotation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Annotation annotation = (Annotation) o;
    return Objects.equals(this.display, annotation.display) && Objects.equals(this.id, annotation.id) && Objects.equals(this.markdownTextAnnotation, annotation.markdownTextAnnotation) && Objects.equals(this.additionalProperties, annotation.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(display,id,markdownTextAnnotation, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Annotation {\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    markdownTextAnnotation: ").append(toIndentedString(markdownTextAnnotation)).append("\n");
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
