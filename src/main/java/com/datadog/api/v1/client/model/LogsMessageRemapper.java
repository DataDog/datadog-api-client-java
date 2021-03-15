/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The message is a key attribute in Datadog. It is displayed in the message column of the Log
 * Explorer and you can do full string search on it. Use this Processor to define one or more
 * attributes as the official log message. **Note:** If multiple log message remapper processors can
 * be applied to a given log, only the first one (according to the pipeline order) is taken into
 * account.
 */
@ApiModel(
    description =
        "The message is a key attribute in Datadog. It is displayed in the message column of the"
            + " Log Explorer and you can do full string search on it. Use this Processor to define"
            + " one or more attributes as the official log message.  **Note:** If multiple log"
            + " message remapper processors can be applied to a given log, only the first one"
            + " (according to the pipeline order) is taken into account.")
@JsonPropertyOrder({
  LogsMessageRemapper.JSON_PROPERTY_IS_ENABLED,
  LogsMessageRemapper.JSON_PROPERTY_NAME,
  LogsMessageRemapper.JSON_PROPERTY_SOURCES,
  LogsMessageRemapper.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogsMessageRemapper {
  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled = false;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SOURCES = "sources";
  private List<String> sources = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsMessageRemapperType type = LogsMessageRemapperType.MESSAGE_REMAPPER;

  public LogsMessageRemapper isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Whether or not the processor is enabled.
   *
   * @return isEnabled
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the processor is enabled.")
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public LogsMessageRemapper name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the processor.
   *
   * @return name
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the processor.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LogsMessageRemapper sources(List<String> sources) {
    this.sources = sources;
    return this;
  }

  public LogsMessageRemapper addSourcesItem(String sourcesItem) {
    this.sources.add(sourcesItem);
    return this;
  }

  /**
   * Array of source attributes.
   *
   * @return sources
   */
  @ApiModelProperty(example = "[\"msg\"]", required = true, value = "Array of source attributes.")
  @JsonProperty(JSON_PROPERTY_SOURCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getSources() {
    return sources;
  }

  public void setSources(List<String> sources) {
    this.sources = sources;
  }

  public LogsMessageRemapper type(LogsMessageRemapperType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogsMessageRemapperType getType() {
    return type;
  }

  public void setType(LogsMessageRemapperType type) {
    this.type = type;
  }

  /** Return true if this LogsMessageRemapper object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsMessageRemapper logsMessageRemapper = (LogsMessageRemapper) o;
    return Objects.equals(this.isEnabled, logsMessageRemapper.isEnabled)
        && Objects.equals(this.name, logsMessageRemapper.name)
        && Objects.equals(this.sources, logsMessageRemapper.sources)
        && Objects.equals(this.type, logsMessageRemapper.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled, name, sources, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsMessageRemapper {\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
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
