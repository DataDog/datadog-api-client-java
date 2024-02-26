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
 * Create custom grok rules to parse the full message or <a
 * href="https://docs.datadoghq.com/logs/log_configuration/parsing/#advanced-settings">a specific
 * attribute of your raw event</a>. For more information, see the <a
 * href="https://docs.datadoghq.com/logs/log_configuration/parsing">parsing section</a>.
 */
@JsonPropertyOrder({
  LogsGrokParser.JSON_PROPERTY_GROK,
  LogsGrokParser.JSON_PROPERTY_IS_ENABLED,
  LogsGrokParser.JSON_PROPERTY_NAME,
  LogsGrokParser.JSON_PROPERTY_SAMPLES,
  LogsGrokParser.JSON_PROPERTY_SOURCE,
  LogsGrokParser.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsGrokParser {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_GROK = "grok";
  private LogsGrokParserRules grok;

  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled = false;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SAMPLES = "samples";
  private List<String> samples = null;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source = "message";

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsGrokParserType type = LogsGrokParserType.GROK_PARSER;

  public LogsGrokParser() {}

  @JsonCreator
  public LogsGrokParser(
      @JsonProperty(required = true, value = JSON_PROPERTY_GROK) LogsGrokParserRules grok,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE) String source,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) LogsGrokParserType type) {
    this.grok = grok;
    this.unparsed |= grok.unparsed;
    this.source = source;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public LogsGrokParser grok(LogsGrokParserRules grok) {
    this.grok = grok;
    this.unparsed |= grok.unparsed;
    return this;
  }

  /**
   * Set of rules for the grok parser.
   *
   * @return grok
   */
  @JsonProperty(JSON_PROPERTY_GROK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogsGrokParserRules getGrok() {
    return grok;
  }

  public void setGrok(LogsGrokParserRules grok) {
    this.grok = grok;
  }

  public LogsGrokParser isEnabled(Boolean isEnabled) {
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

  public LogsGrokParser name(String name) {
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

  public LogsGrokParser samples(List<String> samples) {
    this.samples = samples;
    return this;
  }

  public LogsGrokParser addSamplesItem(String samplesItem) {
    if (this.samples == null) {
      this.samples = new ArrayList<>();
    }
    this.samples.add(samplesItem);
    return this;
  }

  /**
   * List of sample logs to test this grok parser.
   *
   * @return samples
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SAMPLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getSamples() {
    return samples;
  }

  public void setSamples(List<String> samples) {
    this.samples = samples;
  }

  public LogsGrokParser source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Name of the log attribute to parse.
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

  public LogsGrokParser type(LogsGrokParserType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of logs grok parser.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogsGrokParserType getType() {
    return type;
  }

  public void setType(LogsGrokParserType type) {
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
   * @return LogsGrokParser
   */
  @JsonAnySetter
  public LogsGrokParser putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LogsGrokParser object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsGrokParser logsGrokParser = (LogsGrokParser) o;
    return Objects.equals(this.grok, logsGrokParser.grok)
        && Objects.equals(this.isEnabled, logsGrokParser.isEnabled)
        && Objects.equals(this.name, logsGrokParser.name)
        && Objects.equals(this.samples, logsGrokParser.samples)
        && Objects.equals(this.source, logsGrokParser.source)
        && Objects.equals(this.type, logsGrokParser.type)
        && Objects.equals(this.additionalProperties, logsGrokParser.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grok, isEnabled, name, samples, source, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsGrokParser {\n");
    sb.append("    grok: ").append(toIndentedString(grok)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    samples: ").append(toIndentedString(samples)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
