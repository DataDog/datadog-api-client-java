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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * The array-map processor transforms each element of a source array by running sub-processors
 * against it and writing results to a target array. Sub-processors reference the current element
 * via <code>$sourceElem</code> (read) and <code>$targetElem</code> (write). Parent log attributes
 * are read via plain paths as usual. Supported sub-processor types: <code>attribute-remapper</code>
 * , <code>string-builder-processor</code>, <code>arithmetic-processor</code>, <code>
 * category-processor</code>. <code>is_enabled</code> on sub-processors is ignored; sub-processor
 * execution is gated entirely by the parent array-map's <code>is_enabled</code> flag.
 */
@JsonPropertyOrder({
  LogsArrayMapProcessor.JSON_PROPERTY_IS_ENABLED,
  LogsArrayMapProcessor.JSON_PROPERTY_NAME,
  LogsArrayMapProcessor.JSON_PROPERTY_PRESERVE_SOURCE,
  LogsArrayMapProcessor.JSON_PROPERTY_PROCESSORS,
  LogsArrayMapProcessor.JSON_PROPERTY_SOURCE,
  LogsArrayMapProcessor.JSON_PROPERTY_TARGET,
  LogsArrayMapProcessor.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsArrayMapProcessor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled = false;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PRESERVE_SOURCE = "preserve_source";
  private Boolean preserveSource = true;

  public static final String JSON_PROPERTY_PROCESSORS = "processors";
  private List<LogsArrayMapSubProcessor> processors = new ArrayList<>();

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_TARGET = "target";
  private String target;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsArrayMapProcessorType type = LogsArrayMapProcessorType.ARRAY_MAP_PROCESSOR;

  public LogsArrayMapProcessor() {}

  @JsonCreator
  public LogsArrayMapProcessor(
      @JsonProperty(required = true, value = JSON_PROPERTY_PROCESSORS)
          List<LogsArrayMapSubProcessor> processors,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE) String source,
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGET) String target,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) LogsArrayMapProcessorType type) {
    this.processors = processors;
    this.source = source;
    this.target = target;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public LogsArrayMapProcessor isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Whether or not the processor is enabled.
   *
   * @return isEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public LogsArrayMapProcessor name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the processor.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LogsArrayMapProcessor preserveSource(Boolean preserveSource) {
    this.preserveSource = preserveSource;
    return this;
  }

  /**
   * When <code>false</code> and <code>source != target</code>, the source attribute is removed
   * after processing. Cannot be <code>false</code> when <code>source == target</code>.
   *
   * @return preserveSource
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRESERVE_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPreserveSource() {
    return preserveSource;
  }

  public void setPreserveSource(Boolean preserveSource) {
    this.preserveSource = preserveSource;
  }

  public LogsArrayMapProcessor processors(List<LogsArrayMapSubProcessor> processors) {
    this.processors = processors;
    for (LogsArrayMapSubProcessor item : processors) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LogsArrayMapProcessor addProcessorsItem(LogsArrayMapSubProcessor processorsItem) {
    this.processors.add(processorsItem);
    this.unparsed |= processorsItem.unparsed;
    return this;
  }

  /**
   * Sub-processors applied to each element. Allowed types: <code>attribute-remapper</code>, <code>
   * string-builder-processor</code>, <code>arithmetic-processor</code>, <code>category-processor
   * </code>.
   *
   * @return processors
   */
  @JsonProperty(JSON_PROPERTY_PROCESSORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<LogsArrayMapSubProcessor> getProcessors() {
    return processors;
  }

  public void setProcessors(List<LogsArrayMapSubProcessor> processors) {
    this.processors = processors;
  }

  public LogsArrayMapProcessor source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Attribute path of the source array. Elements are read-only via <code>$sourceElem</code> inside
   * sub-processors.
   *
   * @return source
   */
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public LogsArrayMapProcessor target(String target) {
    this.target = target;
    return this;
  }

  /**
   * Attribute path of the output array. Sub-processors write to <code>$targetElem</code> (or <code>
   * $targetElem.&lt;field&gt;</code>) to build each output element.
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

  public LogsArrayMapProcessor type(LogsArrayMapProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of logs array-map processor.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogsArrayMapProcessorType getType() {
    return type;
  }

  public void setType(LogsArrayMapProcessorType type) {
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
   * @return LogsArrayMapProcessor
   */
  @JsonAnySetter
  public LogsArrayMapProcessor putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LogsArrayMapProcessor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsArrayMapProcessor logsArrayMapProcessor = (LogsArrayMapProcessor) o;
    return Objects.equals(this.isEnabled, logsArrayMapProcessor.isEnabled)
        && Objects.equals(this.name, logsArrayMapProcessor.name)
        && Objects.equals(this.preserveSource, logsArrayMapProcessor.preserveSource)
        && Objects.equals(this.processors, logsArrayMapProcessor.processors)
        && Objects.equals(this.source, logsArrayMapProcessor.source)
        && Objects.equals(this.target, logsArrayMapProcessor.target)
        && Objects.equals(this.type, logsArrayMapProcessor.type)
        && Objects.equals(this.additionalProperties, logsArrayMapProcessor.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        isEnabled, name, preserveSource, processors, source, target, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsArrayMapProcessor {\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    preserveSource: ").append(toIndentedString(preserveSource)).append("\n");
    sb.append("    processors: ").append(toIndentedString(processors)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
