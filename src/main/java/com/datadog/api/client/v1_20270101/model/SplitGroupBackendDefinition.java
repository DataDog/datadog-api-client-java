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
  SplitGroupBackendDefinition.JSON_PROPERTY_DESCRIPTION,
  SplitGroupBackendDefinition.JSON_PROPERTY_HAS_UNIFORM_Y_AXES,
  SplitGroupBackendDefinition.JSON_PROPERTY_NOTES,
  SplitGroupBackendDefinition.JSON_PROPERTY_SIZE,
  SplitGroupBackendDefinition.JSON_PROPERTY_SOURCE_WIDGET_DEFINITION,
  SplitGroupBackendDefinition.JSON_PROPERTY_SPLIT_CONFIG,
  SplitGroupBackendDefinition.JSON_PROPERTY_TIME,
  SplitGroupBackendDefinition.JSON_PROPERTY_TITLE,
  SplitGroupBackendDefinition.JSON_PROPERTY_TITLE_ALIGN,
  SplitGroupBackendDefinition.JSON_PROPERTY_TITLE_SIZE,
  SplitGroupBackendDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SplitGroupBackendDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_HAS_UNIFORM_Y_AXES = "has_uniform_y_axes";
  private Boolean hasUniformYAxes;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public static final String JSON_PROPERTY_SIZE = "size";
  private FORMSIZES size;

  public static final String JSON_PROPERTY_SOURCE_WIDGET_DEFINITION = "source_widget_definition";
  private SplitGroupBackendDefinition20270101SourceWidgetDefinition sourceWidgetDefinition;

  public static final String JSON_PROPERTY_SPLIT_CONFIG = "split_config";
  private SplitConfig splitConfig;

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SplitGroupBackendDefinitionType type;

  public SplitGroupBackendDefinition() {}

  @JsonCreator
  public SplitGroupBackendDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_SIZE) FORMSIZES size,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE_WIDGET_DEFINITION)
          SplitGroupBackendDefinition20270101SourceWidgetDefinition sourceWidgetDefinition,
      @JsonProperty(required = true, value = JSON_PROPERTY_SPLIT_CONFIG) SplitConfig splitConfig,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          SplitGroupBackendDefinitionType type) {
    this.size = size;
    this.unparsed |= !size.isValid();
    this.sourceWidgetDefinition = sourceWidgetDefinition;
    this.unparsed |= sourceWidgetDefinition.unparsed;
    this.splitConfig = splitConfig;
    this.unparsed |= splitConfig.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SplitGroupBackendDefinition description(String description) {
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

  public SplitGroupBackendDefinition hasUniformYAxes(Boolean hasUniformYAxes) {
    this.hasUniformYAxes = hasUniformYAxes;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return hasUniformYAxes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_UNIFORM_Y_AXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHasUniformYAxes() {
    return hasUniformYAxes;
  }

  public void setHasUniformYAxes(Boolean hasUniformYAxes) {
    this.hasUniformYAxes = hasUniformYAxes;
  }

  public SplitGroupBackendDefinition notes(String notes) {
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

  public SplitGroupBackendDefinition size(FORMSIZES size) {
    this.size = size;
    this.unparsed |= !size.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return size
   */
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FORMSIZES getSize() {
    return size;
  }

  public void setSize(FORMSIZES size) {
    if (!size.isValid()) {
      this.unparsed = true;
    }
    this.size = size;
  }

  public SplitGroupBackendDefinition sourceWidgetDefinition(
      SplitGroupBackendDefinition20270101SourceWidgetDefinition sourceWidgetDefinition) {
    this.sourceWidgetDefinition = sourceWidgetDefinition;
    this.unparsed |= sourceWidgetDefinition.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return sourceWidgetDefinition
   */
  @JsonProperty(JSON_PROPERTY_SOURCE_WIDGET_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SplitGroupBackendDefinition20270101SourceWidgetDefinition getSourceWidgetDefinition() {
    return sourceWidgetDefinition;
  }

  public void setSourceWidgetDefinition(
      SplitGroupBackendDefinition20270101SourceWidgetDefinition sourceWidgetDefinition) {
    this.sourceWidgetDefinition = sourceWidgetDefinition;
    if (sourceWidgetDefinition != null) {
      this.unparsed |= sourceWidgetDefinition.unparsed;
    }
  }

  public SplitGroupBackendDefinition splitConfig(SplitConfig splitConfig) {
    this.splitConfig = splitConfig;
    this.unparsed |= splitConfig.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return splitConfig
   */
  @JsonProperty(JSON_PROPERTY_SPLIT_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SplitConfig getSplitConfig() {
    return splitConfig;
  }

  public void setSplitConfig(SplitConfig splitConfig) {
    this.splitConfig = splitConfig;
    if (splitConfig != null) {
      this.unparsed |= splitConfig.unparsed;
    }
  }

  public SplitGroupBackendDefinition time(WidgetTime time) {
    this.time = time;
    this.unparsed |= time.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return time
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetTime getTime() {
    return time;
  }

  public void setTime(WidgetTime time) {
    this.time = time;
    if (time != null) {
      this.unparsed |= time.unparsed;
    }
  }

  public SplitGroupBackendDefinition title(String title) {
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

  public SplitGroupBackendDefinition titleAlign(WidgetTextAlign titleAlign) {
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

  public SplitGroupBackendDefinition titleSize(String titleSize) {
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

  public SplitGroupBackendDefinition type(SplitGroupBackendDefinitionType type) {
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
  public SplitGroupBackendDefinitionType getType() {
    return type;
  }

  public void setType(SplitGroupBackendDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this SplitGroupBackendDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitGroupBackendDefinition splitGroupBackendDefinition = (SplitGroupBackendDefinition) o;
    return Objects.equals(this.description, splitGroupBackendDefinition.description)
        && Objects.equals(this.hasUniformYAxes, splitGroupBackendDefinition.hasUniformYAxes)
        && Objects.equals(this.notes, splitGroupBackendDefinition.notes)
        && Objects.equals(this.size, splitGroupBackendDefinition.size)
        && Objects.equals(
            this.sourceWidgetDefinition, splitGroupBackendDefinition.sourceWidgetDefinition)
        && Objects.equals(this.splitConfig, splitGroupBackendDefinition.splitConfig)
        && Objects.equals(this.time, splitGroupBackendDefinition.time)
        && Objects.equals(this.title, splitGroupBackendDefinition.title)
        && Objects.equals(this.titleAlign, splitGroupBackendDefinition.titleAlign)
        && Objects.equals(this.titleSize, splitGroupBackendDefinition.titleSize)
        && Objects.equals(this.type, splitGroupBackendDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description,
        hasUniformYAxes,
        notes,
        size,
        sourceWidgetDefinition,
        splitConfig,
        time,
        title,
        titleAlign,
        titleSize,
        type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitGroupBackendDefinition {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hasUniformYAxes: ").append(toIndentedString(hasUniformYAxes)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sourceWidgetDefinition: ")
        .append(toIndentedString(sourceWidgetDefinition))
        .append("\n");
    sb.append("    splitConfig: ").append(toIndentedString(splitConfig)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
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
