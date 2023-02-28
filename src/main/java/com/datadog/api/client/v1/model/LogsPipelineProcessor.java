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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Nested Pipelines are pipelines within a pipeline. Use Nested Pipelines to split the processing
 * into two steps. For example, first use a high-level filtering such as team and then a second
 * level of filtering based on the integration, service, or any other tag or attribute.
 *
 * <p>A pipeline can contain Nested Pipelines and Processors whereas a Nested Pipeline can only
 * contain Processors.
 */
@JsonPropertyOrder({
  LogsPipelineProcessor.JSON_PROPERTY_FILTER,
  LogsPipelineProcessor.JSON_PROPERTY_IS_ENABLED,
  LogsPipelineProcessor.JSON_PROPERTY_NAME,
  LogsPipelineProcessor.JSON_PROPERTY_PROCESSORS,
  LogsPipelineProcessor.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsPipelineProcessor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILTER = "filter";
  private LogsFilter filter;

  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled = false;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROCESSORS = "processors";
  private List<LogsProcessor> processors = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsPipelineProcessorType type = LogsPipelineProcessorType.PIPELINE;

  public LogsPipelineProcessor() {}

  @JsonCreator
  public LogsPipelineProcessor(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) LogsPipelineProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public LogsPipelineProcessor filter(LogsFilter filter) {
    this.filter = filter;
    this.unparsed |= filter.unparsed;
    return this;
  }

  /**
   * Filter for logs.
   *
   * @return filter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogsFilter getFilter() {
    return filter;
  }

  public void setFilter(LogsFilter filter) {
    this.filter = filter;
  }

  public LogsPipelineProcessor isEnabled(Boolean isEnabled) {
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

  public LogsPipelineProcessor name(String name) {
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

  public LogsPipelineProcessor processors(List<LogsProcessor> processors) {
    this.processors = processors;
    for (LogsProcessor item : processors) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LogsPipelineProcessor addProcessorsItem(LogsProcessor processorsItem) {
    if (this.processors == null) {
      this.processors = new ArrayList<>();
    }
    this.processors.add(processorsItem);
    this.unparsed |= processorsItem.unparsed;
    return this;
  }

  /**
   * Ordered list of processors in this pipeline.
   *
   * @return processors
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROCESSORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LogsProcessor> getProcessors() {
    return processors;
  }

  public void setProcessors(List<LogsProcessor> processors) {
    this.processors = processors;
  }

  public LogsPipelineProcessor type(LogsPipelineProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of logs pipeline processor.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogsPipelineProcessorType getType() {
    return type;
  }

  public void setType(LogsPipelineProcessorType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this LogsPipelineProcessor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsPipelineProcessor logsPipelineProcessor = (LogsPipelineProcessor) o;
    return Objects.equals(this.filter, logsPipelineProcessor.filter)
        && Objects.equals(this.isEnabled, logsPipelineProcessor.isEnabled)
        && Objects.equals(this.name, logsPipelineProcessor.name)
        && Objects.equals(this.processors, logsPipelineProcessor.processors)
        && Objects.equals(this.type, logsPipelineProcessor.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, isEnabled, name, processors, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsPipelineProcessor {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    processors: ").append(toIndentedString(processors)).append("\n");
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
