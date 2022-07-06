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
 * Use the string builder processor to add a new attribute (without spaces or special characters) to
 * a log with the result of the provided template. This enables aggregation of different attributes
 * or raw strings into a single attribute.
 *
 * <p>The template is defined by both raw text and blocks with the syntax <code>%{attribute_path}
 * </code>.
 *
 * <p><strong>Notes</strong>:
 *
 * <ul>
 *   <li>The processor only accepts attributes with values or an array of values in the blocks.
 *   <li>If an attribute cannot be used (object or array of object), it is replaced by an empty
 *       string or the entire operation is skipped depending on your selection.
 *   <li>If the target attribute already exists, it is overwritten by the result of the template.
 *   <li>Results of the template cannot exceed 256 characters.
 * </ul>
 */
@JsonPropertyOrder({
  LogsStringBuilderProcessor.JSON_PROPERTY_IS_ENABLED,
  LogsStringBuilderProcessor.JSON_PROPERTY_IS_REPLACE_MISSING,
  LogsStringBuilderProcessor.JSON_PROPERTY_NAME,
  LogsStringBuilderProcessor.JSON_PROPERTY_TARGET,
  LogsStringBuilderProcessor.JSON_PROPERTY_TEMPLATE,
  LogsStringBuilderProcessor.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsStringBuilderProcessor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled = false;

  public static final String JSON_PROPERTY_IS_REPLACE_MISSING = "is_replace_missing";
  private Boolean isReplaceMissing = false;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TARGET = "target";
  private String target;

  public static final String JSON_PROPERTY_TEMPLATE = "template";
  private String template;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsStringBuilderProcessorType type =
      LogsStringBuilderProcessorType.STRING_BUILDER_PROCESSOR;

  public LogsStringBuilderProcessor() {}

  @JsonCreator
  public LogsStringBuilderProcessor(
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGET) String target,
      @JsonProperty(required = true, value = JSON_PROPERTY_TEMPLATE) String template,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          LogsStringBuilderProcessorType type) {
    this.target = target;
    this.template = template;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public LogsStringBuilderProcessor isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Whether or not the processor is enabled.
   *
   * @return isEnabled
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public LogsStringBuilderProcessor isReplaceMissing(Boolean isReplaceMissing) {
    this.isReplaceMissing = isReplaceMissing;
    return this;
  }

  /**
   * If true, it replaces all missing attributes of <code>template</code> by an empty string. If
   * <code>false</code> (default), skips the operation for missing attributes.
   *
   * @return isReplaceMissing
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REPLACE_MISSING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsReplaceMissing() {
    return isReplaceMissing;
  }

  public void setIsReplaceMissing(Boolean isReplaceMissing) {
    this.isReplaceMissing = isReplaceMissing;
  }

  public LogsStringBuilderProcessor name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the processor.
   *
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LogsStringBuilderProcessor target(String target) {
    this.target = target;
    return this;
  }

  /**
   * The name of the attribute that contains the result of the template.
   *
   * @return target
   */
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public LogsStringBuilderProcessor template(String template) {
    this.template = template;
    return this;
  }

  /**
   * A formula with one or more attributes and raw text.
   *
   * @return template
   */
  @JsonProperty(JSON_PROPERTY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public LogsStringBuilderProcessor type(LogsStringBuilderProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of logs string builder processor.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogsStringBuilderProcessorType getType() {
    return type;
  }

  public void setType(LogsStringBuilderProcessorType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this LogsStringBuilderProcessor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsStringBuilderProcessor logsStringBuilderProcessor = (LogsStringBuilderProcessor) o;
    return Objects.equals(this.isEnabled, logsStringBuilderProcessor.isEnabled)
        && Objects.equals(this.isReplaceMissing, logsStringBuilderProcessor.isReplaceMissing)
        && Objects.equals(this.name, logsStringBuilderProcessor.name)
        && Objects.equals(this.target, logsStringBuilderProcessor.target)
        && Objects.equals(this.template, logsStringBuilderProcessor.template)
        && Objects.equals(this.type, logsStringBuilderProcessor.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled, isReplaceMissing, name, target, template, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsStringBuilderProcessor {\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    isReplaceMissing: ").append(toIndentedString(isReplaceMissing)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
