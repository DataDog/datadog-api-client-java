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
  NoteBackendDefinition.JSON_PROPERTY_BACKGROUND_COLOR,
  NoteBackendDefinition.JSON_PROPERTY_CONTENT,
  NoteBackendDefinition.JSON_PROPERTY_DESCRIPTION,
  NoteBackendDefinition.JSON_PROPERTY_FONT_SIZE,
  NoteBackendDefinition.JSON_PROPERTY_HAS_PADDING,
  NoteBackendDefinition.JSON_PROPERTY_NOTES,
  NoteBackendDefinition.JSON_PROPERTY_SHOW_TICK,
  NoteBackendDefinition.JSON_PROPERTY_TEXT_ALIGN,
  NoteBackendDefinition.JSON_PROPERTY_TICK_EDGE,
  NoteBackendDefinition.JSON_PROPERTY_TICK_POS,
  NoteBackendDefinition.JSON_PROPERTY_TITLE,
  NoteBackendDefinition.JSON_PROPERTY_TITLE_ALIGN,
  NoteBackendDefinition.JSON_PROPERTY_TITLE_SIZE,
  NoteBackendDefinition.JSON_PROPERTY_TYPE,
  NoteBackendDefinition.JSON_PROPERTY_VERTICAL_ALIGN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NoteBackendDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BACKGROUND_COLOR = "background_color";
  private String backgroundColor;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_FONT_SIZE = "font_size";
  private String fontSize;

  public static final String JSON_PROPERTY_HAS_PADDING = "has_padding";
  private Boolean hasPadding;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public static final String JSON_PROPERTY_SHOW_TICK = "show_tick";
  private Boolean showTick;

  public static final String JSON_PROPERTY_TEXT_ALIGN = "text_align";
  private NoteBackendDefinitionTextAlign textAlign;

  public static final String JSON_PROPERTY_TICK_EDGE = "tick_edge";
  private NoteBackendDefinitionTickEdge tickEdge;

  public static final String JSON_PROPERTY_TICK_POS = "tick_pos";
  private String tickPos;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private NoteBackendDefinitionType type;

  public static final String JSON_PROPERTY_VERTICAL_ALIGN = "vertical_align";
  private NoteBackendDefinitionVerticalAlign verticalAlign;

  public NoteBackendDefinition() {}

  @JsonCreator
  public NoteBackendDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONTENT) String content,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) NoteBackendDefinitionType type) {
    this.content = content;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public NoteBackendDefinition backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return backgroundColor
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BACKGROUND_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public NoteBackendDefinition content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public NoteBackendDefinition description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public NoteBackendDefinition fontSize(String fontSize) {
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

  public NoteBackendDefinition hasPadding(Boolean hasPadding) {
    this.hasPadding = hasPadding;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return hasPadding
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_PADDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHasPadding() {
    return hasPadding;
  }

  public void setHasPadding(Boolean hasPadding) {
    this.hasPadding = hasPadding;
  }

  public NoteBackendDefinition notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return notes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public NoteBackendDefinition showTick(Boolean showTick) {
    this.showTick = showTick;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return showTick
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_TICK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowTick() {
    return showTick;
  }

  public void setShowTick(Boolean showTick) {
    this.showTick = showTick;
  }

  public NoteBackendDefinition textAlign(NoteBackendDefinitionTextAlign textAlign) {
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
  public NoteBackendDefinitionTextAlign getTextAlign() {
    return textAlign;
  }

  public void setTextAlign(NoteBackendDefinitionTextAlign textAlign) {
    if (!textAlign.isValid()) {
      this.unparsed = true;
    }
    this.textAlign = textAlign;
  }

  public NoteBackendDefinition tickEdge(NoteBackendDefinitionTickEdge tickEdge) {
    this.tickEdge = tickEdge;
    this.unparsed |= !tickEdge.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return tickEdge
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TICK_EDGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NoteBackendDefinitionTickEdge getTickEdge() {
    return tickEdge;
  }

  public void setTickEdge(NoteBackendDefinitionTickEdge tickEdge) {
    if (!tickEdge.isValid()) {
      this.unparsed = true;
    }
    this.tickEdge = tickEdge;
  }

  public NoteBackendDefinition tickPos(String tickPos) {
    this.tickPos = tickPos;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return tickPos
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TICK_POS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTickPos() {
    return tickPos;
  }

  public void setTickPos(String tickPos) {
    this.tickPos = tickPos;
  }

  public NoteBackendDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return title
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public NoteBackendDefinition titleAlign(WidgetTextAlign titleAlign) {
    this.titleAlign = titleAlign;
    this.unparsed |= !titleAlign.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return titleAlign
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetTextAlign getTitleAlign() {
    return titleAlign;
  }

  public void setTitleAlign(WidgetTextAlign titleAlign) {
    if (!titleAlign.isValid()) {
      this.unparsed = true;
    }
    this.titleAlign = titleAlign;
  }

  public NoteBackendDefinition titleSize(String titleSize) {
    this.titleSize = titleSize;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return titleSize
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitleSize() {
    return titleSize;
  }

  public void setTitleSize(String titleSize) {
    this.titleSize = titleSize;
  }

  public NoteBackendDefinition type(NoteBackendDefinitionType type) {
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
  public NoteBackendDefinitionType getType() {
    return type;
  }

  public void setType(NoteBackendDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public NoteBackendDefinition verticalAlign(NoteBackendDefinitionVerticalAlign verticalAlign) {
    this.verticalAlign = verticalAlign;
    this.unparsed |= !verticalAlign.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return verticalAlign
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERTICAL_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NoteBackendDefinitionVerticalAlign getVerticalAlign() {
    return verticalAlign;
  }

  public void setVerticalAlign(NoteBackendDefinitionVerticalAlign verticalAlign) {
    if (!verticalAlign.isValid()) {
      this.unparsed = true;
    }
    this.verticalAlign = verticalAlign;
  }

  /** Return true if this NoteBackendDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NoteBackendDefinition noteBackendDefinition = (NoteBackendDefinition) o;
    return Objects.equals(this.backgroundColor, noteBackendDefinition.backgroundColor)
        && Objects.equals(this.content, noteBackendDefinition.content)
        && Objects.equals(this.description, noteBackendDefinition.description)
        && Objects.equals(this.fontSize, noteBackendDefinition.fontSize)
        && Objects.equals(this.hasPadding, noteBackendDefinition.hasPadding)
        && Objects.equals(this.notes, noteBackendDefinition.notes)
        && Objects.equals(this.showTick, noteBackendDefinition.showTick)
        && Objects.equals(this.textAlign, noteBackendDefinition.textAlign)
        && Objects.equals(this.tickEdge, noteBackendDefinition.tickEdge)
        && Objects.equals(this.tickPos, noteBackendDefinition.tickPos)
        && Objects.equals(this.title, noteBackendDefinition.title)
        && Objects.equals(this.titleAlign, noteBackendDefinition.titleAlign)
        && Objects.equals(this.titleSize, noteBackendDefinition.titleSize)
        && Objects.equals(this.type, noteBackendDefinition.type)
        && Objects.equals(this.verticalAlign, noteBackendDefinition.verticalAlign);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        backgroundColor,
        content,
        description,
        fontSize,
        hasPadding,
        notes,
        showTick,
        textAlign,
        tickEdge,
        tickPos,
        title,
        titleAlign,
        titleSize,
        type,
        verticalAlign);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NoteBackendDefinition {\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    hasPadding: ").append(toIndentedString(hasPadding)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    showTick: ").append(toIndentedString(showTick)).append("\n");
    sb.append("    textAlign: ").append(toIndentedString(textAlign)).append("\n");
    sb.append("    tickEdge: ").append(toIndentedString(tickEdge)).append("\n");
    sb.append("    tickPos: ").append(toIndentedString(tickPos)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    verticalAlign: ").append(toIndentedString(verticalAlign)).append("\n");
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
