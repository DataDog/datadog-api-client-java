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

import java.util.Objects;
import java.util.Arrays;
import com.datadog.api.v1.client.model.LogsGrokParserRules;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.datadog.api.v1.client.model.LogsProcessor;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Create custom grok rules to parse the full message or [a specific attribute of your raw event](https://docs.datadoghq.com/logs/processing/parsing/#advanced-settings). For more information, see the [parsing section](https://docs.datadoghq.com/logs/processing/parsing).
 */
@ApiModel(description = "Create custom grok rules to parse the full message or [a specific attribute of your raw event](https://docs.datadoghq.com/logs/processing/parsing/#advanced-settings). For more information, see the [parsing section](https://docs.datadoghq.com/logs/processing/parsing).")
@JsonPropertyOrder({
  LogsGrokParser.JSON_PROPERTY_GROK,
  LogsGrokParser.JSON_PROPERTY_SAMPLES,
  LogsGrokParser.JSON_PROPERTY_SOURCE,
  LogsGrokParser.JSON_PROPERTY_TYPE,
  LogsGrokParser.JSON_PROPERTY_IS_ENABLED,
  LogsGrokParser.JSON_PROPERTY_NAME
})

public class LogsGrokParser implements LogsProcessor {
  public static final String JSON_PROPERTY_GROK = "grok";
  private LogsGrokParserRules grok;

  public static final String JSON_PROPERTY_SAMPLES = "samples";
  private List<String> samples = null;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source = "message";

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "grok-parser";

  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled = false;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;


  public LogsGrokParser grok(LogsGrokParserRules grok) {
    
    this.grok = grok;
    return this;
  }

   /**
   * Get grok
   * @return grok
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_GROK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LogsGrokParserRules getGrok() {
    return grok;
  }


  public void setGrok(LogsGrokParserRules grok) {
    this.grok = grok;
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
   * @return samples
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of sample logs to test this grok parser.")
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
   * @return source
  **/
  @ApiModelProperty(example = "message", required = true, value = "Name of the log attribute to parse.")
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


   /**
   * Type of processor.
   * @return type
  **/
  @ApiModelProperty(example = "grok-parser", required = true, value = "Type of processor.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }




  public LogsGrokParser isEnabled(Boolean isEnabled) {
    
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Whether or not the processor is enabled.
   * @return isEnabled
  **/
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


  public LogsGrokParser name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the processor.
   * @return name
  **/
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsGrokParser logsGrokParser = (LogsGrokParser) o;
    return Objects.equals(this.grok, logsGrokParser.grok) &&
        Objects.equals(this.samples, logsGrokParser.samples) &&
        Objects.equals(this.source, logsGrokParser.source) &&
        Objects.equals(this.type, logsGrokParser.type) &&
        Objects.equals(this.isEnabled, logsGrokParser.isEnabled) &&
        Objects.equals(this.name, logsGrokParser.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grok, samples, source, type, isEnabled, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsGrokParser {\n");
    sb.append("    grok: ").append(toIndentedString(grok)).append("\n");
    sb.append("    samples: ").append(toIndentedString(samples)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

