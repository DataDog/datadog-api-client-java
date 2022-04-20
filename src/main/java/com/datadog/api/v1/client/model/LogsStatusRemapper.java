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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Use this Processor if you want to assign some attributes as the official status. Each incoming
 * status value is mapped as follows. - Integers from 0 to 7 map to the Syslog severity standards -
 * Strings beginning with &#x60;emerg&#x60; or f (case-insensitive) map to &#x60;emerg&#x60; (0) -
 * Strings beginning with &#x60;a&#x60; (case-insensitive) map to &#x60;alert&#x60; (1) - Strings
 * beginning with &#x60;c&#x60; (case-insensitive) map to &#x60;critical&#x60; (2) - Strings
 * beginning with &#x60;err&#x60; (case-insensitive) map to &#x60;error&#x60; (3) - Strings
 * beginning with &#x60;w&#x60; (case-insensitive) map to &#x60;warning&#x60; (4) - Strings
 * beginning with &#x60;n&#x60; (case-insensitive) map to &#x60;notice&#x60; (5) - Strings beginning
 * with &#x60;i&#x60; (case-insensitive) map to &#x60;info&#x60; (6) - Strings beginning with
 * &#x60;d&#x60;, &#x60;trace&#x60; or &#x60;verbose&#x60; (case-insensitive) map to
 * &#x60;debug&#x60; (7) - Strings beginning with &#x60;o&#x60; or matching &#x60;OK&#x60; or
 * &#x60;Success&#x60; (case-insensitive) map to OK - All others map to &#x60;info&#x60; (6)
 * **Note:** If multiple log status remapper processors can be applied to a given log, only the
 * first one (according to the pipelines order) is taken into account.
 */
@JsonPropertyOrder({
  LogsStatusRemapper.JSON_PROPERTY_IS_ENABLED,
  LogsStatusRemapper.JSON_PROPERTY_NAME,
  LogsStatusRemapper.JSON_PROPERTY_SOURCES,
  LogsStatusRemapper.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsStatusRemapper {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled = false;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SOURCES = "sources";
  private List<String> sources = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsStatusRemapperType type = LogsStatusRemapperType.STATUS_REMAPPER;

  public LogsStatusRemapper() {}

  @JsonCreator
  public LogsStatusRemapper(
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCES) List<String> sources,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) LogsStatusRemapperType type) {
    this.sources = sources;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public LogsStatusRemapper isEnabled(Boolean isEnabled) {
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

  public LogsStatusRemapper name(String name) {
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

  public LogsStatusRemapper sources(List<String> sources) {
    this.sources = sources;
    return this;
  }

  public LogsStatusRemapper addSourcesItem(String sourcesItem) {
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

  public LogsStatusRemapper type(LogsStatusRemapperType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of logs status remapper.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogsStatusRemapperType getType() {
    return type;
  }

  public void setType(LogsStatusRemapperType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this LogsStatusRemapper object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsStatusRemapper logsStatusRemapper = (LogsStatusRemapper) o;
    return Objects.equals(this.isEnabled, logsStatusRemapper.isEnabled)
        && Objects.equals(this.name, logsStatusRemapper.name)
        && Objects.equals(this.sources, logsStatusRemapper.sources)
        && Objects.equals(this.type, logsStatusRemapper.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled, name, sources, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsStatusRemapper {\n");
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
