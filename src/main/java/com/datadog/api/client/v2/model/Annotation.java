/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** A list of annotations used in the workflow. These are like sticky notes for your workflow! */
@JsonPropertyOrder({
  Annotation.JSON_PROPERTY_DISPLAY,
  Annotation.JSON_PROPERTY_ID,
  Annotation.JSON_PROPERTY_MARKDOWN_TEXT_ANNOTATION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class Annotation {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DISPLAY = "display";
  private AnnotationDisplay display;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MARKDOWN_TEXT_ANNOTATION = "markdownTextAnnotation";
  private AnnotationMarkdownTextAnnotation markdownTextAnnotation;

  public Annotation() {}

  @JsonCreator
  public Annotation(
      @JsonProperty(required = true, value = JSON_PROPERTY_DISPLAY) AnnotationDisplay display,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_MARKDOWN_TEXT_ANNOTATION)
          AnnotationMarkdownTextAnnotation markdownTextAnnotation) {
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
   * The definition of <code>AnnotationDisplay</code> object.
   *
   * @return display
   */
  @JsonProperty(JSON_PROPERTY_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * The <code>Annotation</code> <code>id</code>.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Annotation markdownTextAnnotation(
      AnnotationMarkdownTextAnnotation markdownTextAnnotation) {
    this.markdownTextAnnotation = markdownTextAnnotation;
    this.unparsed |= markdownTextAnnotation.unparsed;
    return this;
  }

  /**
   * The definition of <code>AnnotationMarkdownTextAnnotation</code> object.
   *
   * @return markdownTextAnnotation
   */
  @JsonProperty(JSON_PROPERTY_MARKDOWN_TEXT_ANNOTATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AnnotationMarkdownTextAnnotation getMarkdownTextAnnotation() {
    return markdownTextAnnotation;
  }

  public void setMarkdownTextAnnotation(AnnotationMarkdownTextAnnotation markdownTextAnnotation) {
    this.markdownTextAnnotation = markdownTextAnnotation;
  }

  /** Return true if this Annotation object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Annotation annotation = (Annotation) o;
    return Objects.equals(this.display, annotation.display)
        && Objects.equals(this.id, annotation.id)
        && Objects.equals(this.markdownTextAnnotation, annotation.markdownTextAnnotation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(display, id, markdownTextAnnotation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Annotation {\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    markdownTextAnnotation: ")
        .append(toIndentedString(markdownTextAnnotation))
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
