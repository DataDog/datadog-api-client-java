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
 * The notes and links widget is similar to free text widget, but allows for more formatting
 * options.
 */
@JsonPropertyOrder({
  NoteWidgetDefinition.JSON_PROPERTY_BACKGROUND_COLOR,
  NoteWidgetDefinition.JSON_PROPERTY_CONTENT,
  NoteWidgetDefinition.JSON_PROPERTY_FONT_SIZE,
  NoteWidgetDefinition.JSON_PROPERTY_HAS_PADDING,
  NoteWidgetDefinition.JSON_PROPERTY_SHOW_TICK,
  NoteWidgetDefinition.JSON_PROPERTY_TEXT_ALIGN,
  NoteWidgetDefinition.JSON_PROPERTY_TICK_EDGE,
  NoteWidgetDefinition.JSON_PROPERTY_TICK_POS,
  NoteWidgetDefinition.JSON_PROPERTY_TYPE,
  NoteWidgetDefinition.JSON_PROPERTY_VERTICAL_ALIGN
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NoteWidgetDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BACKGROUND_COLOR = "background_color";
  private String backgroundColor;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_FONT_SIZE = "font_size";
  private String fontSize;

  public static final String JSON_PROPERTY_HAS_PADDING = "has_padding";
  private Boolean hasPadding = true;

  public static final String JSON_PROPERTY_SHOW_TICK = "show_tick";
  private Boolean showTick;

  public static final String JSON_PROPERTY_TEXT_ALIGN = "text_align";
  private WidgetTextAlign textAlign;

  public static final String JSON_PROPERTY_TICK_EDGE = "tick_edge";
  private WidgetTickEdge tickEdge;

  public static final String JSON_PROPERTY_TICK_POS = "tick_pos";
  private String tickPos;

  public static final String JSON_PROPERTY_TYPE = "type";
  private NoteWidgetDefinitionType type = NoteWidgetDefinitionType.NOTE;

  public static final String JSON_PROPERTY_VERTICAL_ALIGN = "vertical_align";
  private WidgetVerticalAlign verticalAlign;

  public NoteWidgetDefinition() {}

  @JsonCreator
  public NoteWidgetDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONTENT) String content,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) NoteWidgetDefinitionType type) {
    this.content = content;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public NoteWidgetDefinition backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  /**
   * Background color of the note.
   *
   * @return backgroundColor
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BACKGROUND_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public NoteWidgetDefinition content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Content of the note.
   *
   * @return content
   */
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public NoteWidgetDefinition fontSize(String fontSize) {
    this.fontSize = fontSize;
    return this;
  }

  /**
   * Size of the text.
   *
   * @return fontSize
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FONT_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFontSize() {
    return fontSize;
  }

  public void setFontSize(String fontSize) {
    this.fontSize = fontSize;
  }

  public NoteWidgetDefinition hasPadding(Boolean hasPadding) {
    this.hasPadding = hasPadding;
    return this;
  }

  /**
   * Whether to add padding or not.
   *
   * @return hasPadding
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_PADDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHasPadding() {
    return hasPadding;
  }

  public void setHasPadding(Boolean hasPadding) {
    this.hasPadding = hasPadding;
  }

  public NoteWidgetDefinition showTick(Boolean showTick) {
    this.showTick = showTick;
    return this;
  }

  /**
   * Whether to show a tick or not.
   *
   * @return showTick
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_TICK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowTick() {
    return showTick;
  }

  public void setShowTick(Boolean showTick) {
    this.showTick = showTick;
  }

  public NoteWidgetDefinition textAlign(WidgetTextAlign textAlign) {
    this.textAlign = textAlign;
    this.unparsed |= !textAlign.isValid();
    return this;
  }

  /**
   * How to align the text on the widget.
   *
   * @return textAlign
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetTextAlign getTextAlign() {
    return textAlign;
  }

  public void setTextAlign(WidgetTextAlign textAlign) {
    if (!textAlign.isValid()) {
      this.unparsed = true;
    }
    this.textAlign = textAlign;
  }

  public NoteWidgetDefinition tickEdge(WidgetTickEdge tickEdge) {
    this.tickEdge = tickEdge;
    this.unparsed |= !tickEdge.isValid();
    return this;
  }

  /**
   * Define how you want to align the text on the widget.
   *
   * @return tickEdge
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TICK_EDGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetTickEdge getTickEdge() {
    return tickEdge;
  }

  public void setTickEdge(WidgetTickEdge tickEdge) {
    if (!tickEdge.isValid()) {
      this.unparsed = true;
    }
    this.tickEdge = tickEdge;
  }

  public NoteWidgetDefinition tickPos(String tickPos) {
    this.tickPos = tickPos;
    return this;
  }

  /**
   * Where to position the tick on an edge.
   *
   * @return tickPos
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TICK_POS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTickPos() {
    return tickPos;
  }

  public void setTickPos(String tickPos) {
    this.tickPos = tickPos;
  }

  public NoteWidgetDefinition type(NoteWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the note widget.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public NoteWidgetDefinitionType getType() {
    return type;
  }

  public void setType(NoteWidgetDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public NoteWidgetDefinition verticalAlign(WidgetVerticalAlign verticalAlign) {
    this.verticalAlign = verticalAlign;
    this.unparsed |= !verticalAlign.isValid();
    return this;
  }

  /**
   * Vertical alignment.
   *
   * @return verticalAlign
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERTICAL_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetVerticalAlign getVerticalAlign() {
    return verticalAlign;
  }

  public void setVerticalAlign(WidgetVerticalAlign verticalAlign) {
    if (!verticalAlign.isValid()) {
      this.unparsed = true;
    }
    this.verticalAlign = verticalAlign;
  }

  /** Return true if this NoteWidgetDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NoteWidgetDefinition noteWidgetDefinition = (NoteWidgetDefinition) o;
    return Objects.equals(this.backgroundColor, noteWidgetDefinition.backgroundColor)
        && Objects.equals(this.content, noteWidgetDefinition.content)
        && Objects.equals(this.fontSize, noteWidgetDefinition.fontSize)
        && Objects.equals(this.hasPadding, noteWidgetDefinition.hasPadding)
        && Objects.equals(this.showTick, noteWidgetDefinition.showTick)
        && Objects.equals(this.textAlign, noteWidgetDefinition.textAlign)
        && Objects.equals(this.tickEdge, noteWidgetDefinition.tickEdge)
        && Objects.equals(this.tickPos, noteWidgetDefinition.tickPos)
        && Objects.equals(this.type, noteWidgetDefinition.type)
        && Objects.equals(this.verticalAlign, noteWidgetDefinition.verticalAlign);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        backgroundColor,
        content,
        fontSize,
        hasPadding,
        showTick,
        textAlign,
        tickEdge,
        tickPos,
        type,
        verticalAlign);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NoteWidgetDefinition {\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    hasPadding: ").append(toIndentedString(hasPadding)).append("\n");
    sb.append("    showTick: ").append(toIndentedString(showTick)).append("\n");
    sb.append("    textAlign: ").append(toIndentedString(textAlign)).append("\n");
    sb.append("    tickEdge: ").append(toIndentedString(tickEdge)).append("\n");
    sb.append("    tickPos: ").append(toIndentedString(tickPos)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    verticalAlign: ").append(toIndentedString(verticalAlign)).append("\n");
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
