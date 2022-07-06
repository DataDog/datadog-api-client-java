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
 * The GeoIP parser takes an IP address attribute and extracts if available the Continent, Country,
 * Subdivision, and City information in the target attribute path.
 */
@JsonPropertyOrder({
  LogsGeoIPParser.JSON_PROPERTY_IS_ENABLED,
  LogsGeoIPParser.JSON_PROPERTY_NAME,
  LogsGeoIPParser.JSON_PROPERTY_SOURCES,
  LogsGeoIPParser.JSON_PROPERTY_TARGET,
  LogsGeoIPParser.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsGeoIPParser {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled = false;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SOURCES = "sources";
  private List<String> sources = new ArrayList<>();

  public static final String JSON_PROPERTY_TARGET = "target";
  private String target = "network.client.geoip";

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsGeoIPParserType type = LogsGeoIPParserType.GEO_IP_PARSER;

  public LogsGeoIPParser() {}

  @JsonCreator
  public LogsGeoIPParser(
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCES) List<String> sources,
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGET) String target,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) LogsGeoIPParserType type) {
    this.sources = sources;
    this.target = target;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public LogsGeoIPParser isEnabled(Boolean isEnabled) {
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

  public LogsGeoIPParser name(String name) {
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

  public LogsGeoIPParser sources(List<String> sources) {
    this.sources = sources;
    return this;
  }

  public LogsGeoIPParser addSourcesItem(String sourcesItem) {
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

  public LogsGeoIPParser target(String target) {
    this.target = target;
    return this;
  }

  /**
   * Name of the parent attribute that contains all the extracted details from the <code>sources
   * </code>.
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

  public LogsGeoIPParser type(LogsGeoIPParserType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of GeoIP parser.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogsGeoIPParserType getType() {
    return type;
  }

  public void setType(LogsGeoIPParserType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this LogsGeoIPParser object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsGeoIPParser logsGeoIpParser = (LogsGeoIPParser) o;
    return Objects.equals(this.isEnabled, logsGeoIpParser.isEnabled)
        && Objects.equals(this.name, logsGeoIpParser.name)
        && Objects.equals(this.sources, logsGeoIpParser.sources)
        && Objects.equals(this.target, logsGeoIpParser.target)
        && Objects.equals(this.type, logsGeoIpParser.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled, name, sources, target, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsGeoIPParser {\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
