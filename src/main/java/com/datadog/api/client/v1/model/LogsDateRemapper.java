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
 * As Datadog receives logs, it timestamps them using the value(s) from any of these default
 * attributes.
 *
 * <ul>
 *   <li><code>timestamp</code>
 *   <li><code>date</code>
 *   <li><code>_timestamp</code>
 *   <li><code>Timestamp</code>
 *   <li><code>eventTime</code>
 *   <li><code>published_date</code>
 * </ul>
 *
 * <p>If your logs put their dates in an attribute not in this list, use the log date Remapper
 * Processor to define their date attribute as the official log timestamp. The recognized date
 * formats are ISO8601, UNIX (the milliseconds EPOCH format), and RFC3164.
 *
 * <p><strong>Note:</strong> If your logs don’t contain any of the default attributes and you
 * haven’t defined your own date attribute, Datadog timestamps the logs with the date it received
 * them.
 *
 * <p>If multiple log date remapper processors can be applied to a given log, only the first one
 * (according to the pipelines order) is taken into account.
 */
@JsonPropertyOrder({
  LogsDateRemapper.JSON_PROPERTY_IS_ENABLED,
  LogsDateRemapper.JSON_PROPERTY_NAME,
  LogsDateRemapper.JSON_PROPERTY_SOURCES,
  LogsDateRemapper.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsDateRemapper {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled = false;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SOURCES = "sources";
  private List<String> sources = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsDateRemapperType type = LogsDateRemapperType.DATE_REMAPPER;

  public LogsDateRemapper() {}

  @JsonCreator
  public LogsDateRemapper(
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCES) List<String> sources,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) LogsDateRemapperType type) {
    this.sources = sources;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public LogsDateRemapper isEnabled(Boolean isEnabled) {
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

  public LogsDateRemapper name(String name) {
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

  public LogsDateRemapper sources(List<String> sources) {
    this.sources = sources;
    return this;
  }

  public LogsDateRemapper addSourcesItem(String sourcesItem) {
    this.sources.add(sourcesItem);
    return this;
  }

  /**
   * Array of source attributes.
   *
   * @return sources
   */
  @JsonProperty(JSON_PROPERTY_SOURCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getSources() {
    return sources;
  }

  public void setSources(List<String> sources) {
    this.sources = sources;
  }

  public LogsDateRemapper type(LogsDateRemapperType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of logs date remapper.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogsDateRemapperType getType() {
    return type;
  }

  public void setType(LogsDateRemapperType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this LogsDateRemapper object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsDateRemapper logsDateRemapper = (LogsDateRemapper) o;
    return Objects.equals(this.isEnabled, logsDateRemapper.isEnabled)
        && Objects.equals(this.name, logsDateRemapper.name)
        && Objects.equals(this.sources, logsDateRemapper.sources)
        && Objects.equals(this.type, logsDateRemapper.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled, name, sources, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsDateRemapper {\n");
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
