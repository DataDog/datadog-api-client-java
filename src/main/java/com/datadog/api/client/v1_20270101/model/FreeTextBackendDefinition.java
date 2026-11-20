/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  FreeTextBackendDefinition.JSON_PROPERTY_COLOR,
  FreeTextBackendDefinition.JSON_PROPERTY_FONT_SIZE,
  FreeTextBackendDefinition.JSON_PROPERTY_TEXT,
  FreeTextBackendDefinition.JSON_PROPERTY_TEXT_ALIGN,
  FreeTextBackendDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FreeTextBackendDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLOR = "color";
  private String color;

  public static final String JSON_PROPERTY_FONT_SIZE = "font_size";
  private String fontSize;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_TEXT_ALIGN = "text_align";
  private FreeTextBackendDefinitionTextAlign textAlign;

  public static final String JSON_PROPERTY_TYPE = "type";
  private FreeTextBackendDefinitionType type;

  public FreeTextBackendDefinition() {}

  @JsonCreator
  public FreeTextBackendDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_TEXT) String text,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          FreeTextBackendDefinitionType type) {
    this.text = text;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public FreeTextBackendDefinition color(String color) {
    this.color = color;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return color
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public FreeTextBackendDefinition fontSize(String fontSize) {
    this.fontSize = fontSize;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return fontSize
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FONT_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFontSize() {
    return fontSize;
  }

  public void setFontSize(String fontSize) {
    this.fontSize = fontSize;
  }

  public FreeTextBackendDefinition text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public FreeTextBackendDefinition textAlign(FreeTextBackendDefinitionTextAlign textAlign) {
    this.textAlign = textAlign;
    this.unparsed |= !textAlign.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return textAlign
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FreeTextBackendDefinitionTextAlign getTextAlign() {
    return textAlign;
  }

  public void setTextAlign(FreeTextBackendDefinitionTextAlign textAlign) {
    if (!textAlign.isValid()) {
      this.unparsed = true;
    }
    this.textAlign = textAlign;
  }

  public FreeTextBackendDefinition type(FreeTextBackendDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FreeTextBackendDefinitionType getType() {
    return type;
  }

  public void setType(FreeTextBackendDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this FreeTextBackendDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreeTextBackendDefinition freeTextBackendDefinition = (FreeTextBackendDefinition) o;
    return Objects.equals(this.color, freeTextBackendDefinition.color)
        && Objects.equals(this.fontSize, freeTextBackendDefinition.fontSize)
        && Objects.equals(this.text, freeTextBackendDefinition.text)
        && Objects.equals(this.textAlign, freeTextBackendDefinition.textAlign)
        && Objects.equals(this.type, freeTextBackendDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, fontSize, text, textAlign, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeTextBackendDefinition {\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    textAlign: ").append(toIndentedString(textAlign)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
