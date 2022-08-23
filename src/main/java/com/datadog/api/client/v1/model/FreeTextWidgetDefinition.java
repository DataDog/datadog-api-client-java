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
   * <p>Free text is a widget that allows you to add headings to your screenboard. Commonly used to state the overall purpose of the dashboard. Only available on FREE layout dashboards.</p>
 */
@JsonPropertyOrder({
  FreeTextWidgetDefinition.JSON_PROPERTY_COLOR,
  FreeTextWidgetDefinition.JSON_PROPERTY_FONT_SIZE,
  FreeTextWidgetDefinition.JSON_PROPERTY_TEXT,
  FreeTextWidgetDefinition.JSON_PROPERTY_TEXT_ALIGN,
  FreeTextWidgetDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FreeTextWidgetDefinition {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLOR = "color";
  private String color;

  public static final String JSON_PROPERTY_FONT_SIZE = "font_size";
  private String fontSize;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_TEXT_ALIGN = "text_align";
  private WidgetTextAlign textAlign;

  public static final String JSON_PROPERTY_TYPE = "type";
  private FreeTextWidgetDefinitionType type = FreeTextWidgetDefinitionType.FREE_TEXT;

  public FreeTextWidgetDefinition() {}

  @JsonCreator
  public FreeTextWidgetDefinition(
            @JsonProperty(required=true, value=JSON_PROPERTY_TEXT)String text,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)FreeTextWidgetDefinitionType type) {
        this.text = text;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public FreeTextWidgetDefinition color(String color) {
    this.color = color;
    return this;
  }

  /**
   * <p>Color of the text.</p>
   * @return color
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COLOR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getColor() {
        return color;
      }
  public void setColor(String color) {
    this.color = color;
  }
  public FreeTextWidgetDefinition fontSize(String fontSize) {
    this.fontSize = fontSize;
    return this;
  }

  /**
   * <p>Size of the text.</p>
   * @return fontSize
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FONT_SIZE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getFontSize() {
        return fontSize;
      }
  public void setFontSize(String fontSize) {
    this.fontSize = fontSize;
  }
  public FreeTextWidgetDefinition text(String text) {
    this.text = text;
    return this;
  }

  /**
   * <p>Text to display.</p>
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
  public FreeTextWidgetDefinition textAlign(WidgetTextAlign textAlign) {
    this.textAlign = textAlign;
    this.unparsed |= !textAlign.isValid();
    return this;
  }

  /**
   * <p>How to align the text on the widget.</p>
   * @return textAlign
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TEXT_ALIGN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public WidgetTextAlign getTextAlign() {
        return textAlign;
      }
  public void setTextAlign(WidgetTextAlign textAlign) {
    if (!textAlign.isValid()) {
        this.unparsed = true;
    }
    this.textAlign = textAlign;
  }
  public FreeTextWidgetDefinition type(FreeTextWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of the free text widget.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public FreeTextWidgetDefinitionType getType() {
        return type;
      }
  public void setType(FreeTextWidgetDefinitionType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * Return true if this FreeTextWidgetDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreeTextWidgetDefinition freeTextWidgetDefinition = (FreeTextWidgetDefinition) o;
    return Objects.equals(this.color, freeTextWidgetDefinition.color) && Objects.equals(this.fontSize, freeTextWidgetDefinition.fontSize) && Objects.equals(this.text, freeTextWidgetDefinition.text) && Objects.equals(this.textAlign, freeTextWidgetDefinition.textAlign) && Objects.equals(this.type, freeTextWidgetDefinition.type);
  }


  @Override
  public int hashCode() {
    return Objects.hash(color,fontSize,text,textAlign,type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeTextWidgetDefinition {\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    textAlign: ").append(toIndentedString(textAlign)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
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
