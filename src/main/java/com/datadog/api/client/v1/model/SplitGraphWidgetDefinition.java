/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * The split graph widget allows you to create repeating units of a graph - one for each value in a
 * group (for example: one per service)
 */
@JsonPropertyOrder({
  SplitGraphWidgetDefinition.JSON_PROPERTY_HAS_UNIFORM_Y_AXES,
  SplitGraphWidgetDefinition.JSON_PROPERTY_SIZE,
  SplitGraphWidgetDefinition.JSON_PROPERTY_SOURCE_WIDGET_DEFINITION,
  SplitGraphWidgetDefinition.JSON_PROPERTY_SPLIT_CONFIG,
  SplitGraphWidgetDefinition.JSON_PROPERTY_TIME,
  SplitGraphWidgetDefinition.JSON_PROPERTY_TITLE,
  SplitGraphWidgetDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SplitGraphWidgetDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HAS_UNIFORM_Y_AXES = "has_uniform_y_axes";
  private Boolean hasUniformYAxes;

  public static final String JSON_PROPERTY_SIZE = "size";
  private SplitGraphVizSize size;

  public static final String JSON_PROPERTY_SOURCE_WIDGET_DEFINITION = "source_widget_definition";
  private SplitGraphSourceWidgetDefinition sourceWidgetDefinition;

  public static final String JSON_PROPERTY_SPLIT_CONFIG = "split_config";
  private SplitConfig splitConfig;

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SplitGraphWidgetDefinitionType type = SplitGraphWidgetDefinitionType.SPLIT_GROUP;

  public SplitGraphWidgetDefinition() {}

  @JsonCreator
  public SplitGraphWidgetDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_SIZE) SplitGraphVizSize size,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE_WIDGET_DEFINITION)
          SplitGraphSourceWidgetDefinition sourceWidgetDefinition,
      @JsonProperty(required = true, value = JSON_PROPERTY_SPLIT_CONFIG) SplitConfig splitConfig,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          SplitGraphWidgetDefinitionType type) {
    this.size = size;
    this.unparsed |= !size.isValid();
    this.sourceWidgetDefinition = sourceWidgetDefinition;
    this.unparsed |= sourceWidgetDefinition.unparsed;
    this.splitConfig = splitConfig;
    this.unparsed |= splitConfig.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SplitGraphWidgetDefinition hasUniformYAxes(Boolean hasUniformYAxes) {
    this.hasUniformYAxes = hasUniformYAxes;
    return this;
  }

  /**
   * Normalize y axes across graphs
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

  public SplitGraphWidgetDefinition size(SplitGraphVizSize size) {
    this.size = size;
    this.unparsed |= !size.isValid();
    return this;
  }

  /**
   * Size of the individual graphs in the split.
   *
   * @return size
   */
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SplitGraphVizSize getSize() {
    return size;
  }

  public void setSize(SplitGraphVizSize size) {
    if (!size.isValid()) {
      this.unparsed = true;
    }
    this.size = size;
  }

  public SplitGraphWidgetDefinition sourceWidgetDefinition(
      SplitGraphSourceWidgetDefinition sourceWidgetDefinition) {
    this.sourceWidgetDefinition = sourceWidgetDefinition;
    this.unparsed |= sourceWidgetDefinition.unparsed;
    return this;
  }

  /**
   * The original widget we are splitting on.
   *
   * @return sourceWidgetDefinition
   */
  @JsonProperty(JSON_PROPERTY_SOURCE_WIDGET_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SplitGraphSourceWidgetDefinition getSourceWidgetDefinition() {
    return sourceWidgetDefinition;
  }

  public void setSourceWidgetDefinition(SplitGraphSourceWidgetDefinition sourceWidgetDefinition) {
    this.sourceWidgetDefinition = sourceWidgetDefinition;
  }

  public SplitGraphWidgetDefinition splitConfig(SplitConfig splitConfig) {
    this.splitConfig = splitConfig;
    this.unparsed |= splitConfig.unparsed;
    return this;
  }

  /**
   * Encapsulates all user choices about how to split a graph.
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
  }

  public SplitGraphWidgetDefinition time(WidgetTime time) {
    this.time = time;
    this.unparsed |= time.unparsed;
    return this;
  }

  /**
   * Time setting for the widget.
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
  }

  public SplitGraphWidgetDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of your widget.
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

  public SplitGraphWidgetDefinition type(SplitGraphWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the split graph widget
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SplitGraphWidgetDefinitionType getType() {
    return type;
  }

  public void setType(SplitGraphWidgetDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SplitGraphWidgetDefinition
   */
  @JsonAnySetter
  public SplitGraphWidgetDefinition putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SplitGraphWidgetDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitGraphWidgetDefinition splitGraphWidgetDefinition = (SplitGraphWidgetDefinition) o;
    return Objects.equals(this.hasUniformYAxes, splitGraphWidgetDefinition.hasUniformYAxes)
        && Objects.equals(this.size, splitGraphWidgetDefinition.size)
        && Objects.equals(
            this.sourceWidgetDefinition, splitGraphWidgetDefinition.sourceWidgetDefinition)
        && Objects.equals(this.splitConfig, splitGraphWidgetDefinition.splitConfig)
        && Objects.equals(this.time, splitGraphWidgetDefinition.time)
        && Objects.equals(this.title, splitGraphWidgetDefinition.title)
        && Objects.equals(this.type, splitGraphWidgetDefinition.type)
        && Objects.equals(
            this.additionalProperties, splitGraphWidgetDefinition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        hasUniformYAxes,
        size,
        sourceWidgetDefinition,
        splitConfig,
        time,
        title,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitGraphWidgetDefinition {\n");
    sb.append("    hasUniformYAxes: ").append(toIndentedString(hasUniformYAxes)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sourceWidgetDefinition: ")
        .append(toIndentedString(sourceWidgetDefinition))
        .append("\n");
    sb.append("    splitConfig: ").append(toIndentedString(splitConfig)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
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
