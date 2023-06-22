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
 * The User-Agent parser takes a User-Agent attribute and extracts the OS, browser, device, and
 * other user data. It recognizes major bots like the Google Bot, Yahoo Slurp, and Bing.
 */
@JsonPropertyOrder({
  LogsUserAgentParser.JSON_PROPERTY_IS_ENABLED,
  LogsUserAgentParser.JSON_PROPERTY_IS_ENCODED,
  LogsUserAgentParser.JSON_PROPERTY_NAME,
  LogsUserAgentParser.JSON_PROPERTY_SOURCES,
  LogsUserAgentParser.JSON_PROPERTY_TARGET,
  LogsUserAgentParser.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsUserAgentParser {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled = false;

  public static final String JSON_PROPERTY_IS_ENCODED = "is_encoded";
  private Boolean isEncoded = false;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SOURCES = "sources";
  private List<String> sources = new ArrayList<>();

  public static final String JSON_PROPERTY_TARGET = "target";
  private String target = "http.useragent_details";

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsUserAgentParserType type = LogsUserAgentParserType.USER_AGENT_PARSER;

  public LogsUserAgentParser() {}

  @JsonCreator
  public LogsUserAgentParser(
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCES) List<String> sources,
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGET) String target,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) LogsUserAgentParserType type) {
    this.sources = sources;
    this.target = target;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public LogsUserAgentParser isEnabled(Boolean isEnabled) {
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

  public LogsUserAgentParser isEncoded(Boolean isEncoded) {
    this.isEncoded = isEncoded;
    return this;
  }

  /**
   * Define if the source attribute is URL encoded or not.
   *
   * @return isEncoded
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ENCODED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsEncoded() {
    return isEncoded;
  }

  public void setIsEncoded(Boolean isEncoded) {
    this.isEncoded = isEncoded;
  }

  public LogsUserAgentParser name(String name) {
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

  public LogsUserAgentParser sources(List<String> sources) {
    this.sources = sources;
    return this;
  }

  public LogsUserAgentParser addSourcesItem(String sourcesItem) {
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

  public LogsUserAgentParser target(String target) {
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

  public LogsUserAgentParser type(LogsUserAgentParserType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of logs User-Agent parser.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogsUserAgentParserType getType() {
    return type;
  }

  public void setType(LogsUserAgentParserType type) {
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
   * @return LogsUserAgentParser
   */
  @JsonAnySetter
  public LogsUserAgentParser putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LogsUserAgentParser object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsUserAgentParser logsUserAgentParser = (LogsUserAgentParser) o;
    return Objects.equals(this.isEnabled, logsUserAgentParser.isEnabled)
        && Objects.equals(this.isEncoded, logsUserAgentParser.isEncoded)
        && Objects.equals(this.name, logsUserAgentParser.name)
        && Objects.equals(this.sources, logsUserAgentParser.sources)
        && Objects.equals(this.target, logsUserAgentParser.target)
        && Objects.equals(this.type, logsUserAgentParser.type)
        && Objects.equals(this.additionalProperties, logsUserAgentParser.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled, isEncoded, name, sources, target, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsUserAgentParser {\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    isEncoded: ").append(toIndentedString(isEncoded)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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
