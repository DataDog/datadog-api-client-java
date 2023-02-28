/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Create custom grok rules to parse the full message or <a href="https://docs.datadoghq.com/logs/log_configuration/parsing/#advanced-settings">a specific attribute of your raw event</a>.
   * For more information, see the <a href="https://docs.datadoghq.com/logs/log_configuration/parsing">parsing section</a>.</p>
 */
@JsonPropertyOrder({
  LogsGrokParser.JSON_PROPERTY_GROK,
  LogsGrokParser.JSON_PROPERTY_IS_ENABLED,
  LogsGrokParser.JSON_PROPERTY_NAME,
  LogsGrokParser.JSON_PROPERTY_SAMPLES,
  LogsGrokParser.JSON_PROPERTY_SOURCE,
  LogsGrokParser.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsGrokParser {
  @JsonIgnore
  public boolean unparsed = false;
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
            @JsonProperty(required=true, value=JSON_PROPERTY_GROK)LogsGrokParserRules grok,
            @JsonProperty(required=true, value=JSON_PROPERTY_SOURCE)String source,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)LogsGrokParserType type) {
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
   * <p>Set of rules for the grok parser.</p>
   * @return grok
  **/
      @JsonProperty(JSON_PROPERTY_GROK)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * <p>Whether or not the processor is enabled.</p>
   * @return isEnabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Name of the processor.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>List of sample logs to test this grok parser.</p>
   * @return samples
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SAMPLES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Name of the log attribute to parse.</p>
   * @return source
  **/
      @JsonProperty(JSON_PROPERTY_SOURCE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * <p>Type of logs grok parser.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * Return true if this LogsGrokParser object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsGrokParser logsGrokParser = (LogsGrokParser) o;
    return Objects.equals(this.grok, logsGrokParser.grok) && Objects.equals(this.isEnabled, logsGrokParser.isEnabled) && Objects.equals(this.name, logsGrokParser.name) && Objects.equals(this.samples, logsGrokParser.samples) && Objects.equals(this.source, logsGrokParser.source) && Objects.equals(this.type, logsGrokParser.type);
  }


  @Override
  public int hashCode() {
    return Objects.hash(grok,isEnabled,name,samples,source,type);
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
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
