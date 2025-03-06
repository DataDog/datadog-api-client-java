/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** The definition of <code>AnnotationMarkdownTextAnnotation</code> object. */
@JsonPropertyOrder({AnnotationMarkdownTextAnnotation.JSON_PROPERTY_TEXT})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AnnotationMarkdownTextAnnotation {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public AnnotationMarkdownTextAnnotation text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The <code>markdownTextAnnotation</code> <code>text</code>.
   *
   * @return text
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  /** Return true if this AnnotationMarkdownTextAnnotation object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnotationMarkdownTextAnnotation annotationMarkdownTextAnnotation =
        (AnnotationMarkdownTextAnnotation) o;
    return Objects.equals(this.text, annotationMarkdownTextAnnotation.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotationMarkdownTextAnnotation {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
